package okhttp3.internal.ws;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.w;
import ec.s;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketReader;
import okio.d;
import okio.e;
import okio.f;
import qc.h;
import qc.q;
import yc.v;

/* compiled from: RealWebSocket.kt */
/* loaded from: classes4.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<f> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;

    /* compiled from: RealWebSocket.kt */
    /* loaded from: classes4.dex */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final f reason;

        public Close(int i10, f fVar, long j10) {
            this.code = i10;
            this.reason = fVar;
            this.cancelAfterCloseMillis = j10;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final f getReason() {
            return this.reason;
        }
    }

    /* compiled from: RealWebSocket.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* compiled from: RealWebSocket.kt */
    /* loaded from: classes4.dex */
    public static final class Message {
        private final f data;
        private final int formatOpcode;

        public Message(int i10, f fVar) {
            q.i(fVar, "data");
            this.formatOpcode = i10;
            this.data = fVar;
        }

        public final f getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* compiled from: RealWebSocket.kt */
    /* loaded from: classes4.dex */
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final d sink;
        private final e source;

        public Streams(boolean z10, e eVar, d dVar) {
            q.i(eVar, "source");
            q.i(dVar, "sink");
            this.client = z10;
            this.source = eVar;
            this.sink = dVar;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final d getSink() {
            return this.sink;
        }

        public final e getSource() {
            return this.source;
        }
    }

    /* compiled from: RealWebSocket.kt */
    /* loaded from: classes4.dex */
    private final class WriterTask extends Task {
        final /* synthetic */ RealWebSocket this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WriterTask(RealWebSocket realWebSocket) {
            super(q.q(realWebSocket.name, " writer"), false, 2, null);
            q.i(realWebSocket, "this$0");
            this.this$0 = realWebSocket;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                if (this.this$0.writeOneFrame$okhttp()) {
                    return 0L;
                }
                return -1L;
            } catch (IOException e10) {
                this.this$0.failWebSocket(e10, null);
                return -1L;
            }
        }
    }

    static {
        List<Protocol> d10;
        d10 = s.d(Protocol.HTTP_1_1);
        ONLY_HTTP1 = d10;
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j10, WebSocketExtensions webSocketExtensions, long j11) {
        q.i(taskRunner, "taskRunner");
        q.i(request, "originalRequest");
        q.i(webSocketListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        q.i(random, "random");
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j10;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j11;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (q.d("GET", request.method())) {
            f.a aVar = f.f20621q;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            w wVar = w.f13270a;
            this.key = f.a.f(aVar, bArr, 0, 0, 3, null).b();
            return;
        }
        throw new IllegalArgumentException(q.q("Request must be GET: ", request.method()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        if (webSocketExtensions.serverMaxWindowBits != null && !new vc.f(8, 15).m(webSocketExtensions.serverMaxWindowBits.intValue())) {
            return false;
        }
        return true;
    }

    private final void runWriter() {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    public final void awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        q.i(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(j10, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        q.f(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
        boolean r10;
        boolean r11;
        q.i(response, "response");
        if (response.code() == 101) {
            String header$default = Response.header$default(response, "Connection", null, 2, null);
            r10 = v.r("Upgrade", header$default, true);
            if (r10) {
                String header$default2 = Response.header$default(response, "Upgrade", null, 2, null);
                r11 = v.r("websocket", header$default2, true);
                if (r11) {
                    String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
                    String b10 = f.f20621q.d(q.q(this.key, WebSocketProtocol.ACCEPT_MAGIC)).B().b();
                    if (q.d(b10, header$default3)) {
                        if (exchange != null) {
                            return;
                        }
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + b10 + "' but was '" + ((Object) header$default3) + '\'');
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) header$default2) + '\'');
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) header$default) + '\'');
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i10, String str) {
        return close(i10, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    public final void connect(OkHttpClient okHttpClient) {
        q.i(okHttpClient, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        q.f(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                q.i(call, "call");
                q.i(iOException, "e");
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                boolean isValid;
                ArrayDeque arrayDeque;
                q.i(call, "call");
                q.i(response, "response");
                Exchange exchange = response.exchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    q.f(exchange);
                    RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions parse = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = parse;
                    isValid = RealWebSocket.this.isValid(parse);
                    if (!isValid) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            arrayDeque = realWebSocket.messageAndCloseQueue;
                            arrayDeque.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + build2.url().redact(), newWebSocketStreams);
                        RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e10) {
                        RealWebSocket.this.failWebSocket(e10, null);
                    }
                } catch (IOException e11) {
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                    RealWebSocket.this.failWebSocket(e11, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public final void failWebSocket(Exception exc, Response response) {
        q.i(exc, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            w wVar = w.f13270a;
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(String str, Streams streams) throws IOException {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.extensions;
        q.f(webSocketExtensions);
        synchronized (this) {
            this.name = str;
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask(this);
            long j10 = this.pingIntervalMillis;
            if (j10 != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                TaskQueue taskQueue = this.taskQueue;
                final String q10 = q.q(str, " ping");
                taskQueue.schedule(new Task(q10, this, nanos) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1
                    final /* synthetic */ String $name;
                    final /* synthetic */ long $pingIntervalNanos$inlined;
                    final /* synthetic */ RealWebSocket this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(q10, false, 2, null);
                        this.$name = q10;
                        this.this$0 = this;
                        this.$pingIntervalNanos$inlined = nanos;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.this$0.writePingFrame$okhttp();
                        return this.$pingIntervalNanos$inlined;
                    }
                }, nanos);
            }
            if ((!this.messageAndCloseQueue.isEmpty()) != false) {
                runWriter();
            }
            w wVar = w.f13270a;
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            q.f(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i10, String str) {
        boolean z10;
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        q.i(str, "reason");
        boolean z11 = true;
        if (i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            synchronized (this) {
                if (this.receivedCloseCode != -1) {
                    z11 = false;
                }
                if (z11) {
                    this.receivedCloseCode = i10;
                    this.receivedCloseReason = str;
                    streams = null;
                    if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                        Streams streams2 = this.streams;
                        this.streams = null;
                        webSocketReader = this.reader;
                        this.reader = null;
                        webSocketWriter = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                        streams = streams2;
                    } else {
                        webSocketReader = null;
                        webSocketWriter = null;
                    }
                    w wVar = w.f13270a;
                } else {
                    throw new IllegalStateException("already closed".toString());
                }
            }
            try {
                this.listener.onClosing(this, i10, str);
                if (streams != null) {
                    this.listener.onClosed(this, i10, str);
                }
                if (webSocketWriter == null) {
                    return;
                }
                return;
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) throws IOException {
        q.i(str, "text");
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(f fVar) {
        q.i(fVar, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(fVar);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(f fVar) {
        q.i(fVar, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(f fVar) {
        q.i(fVar, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(fVar);
            runWriter();
            return true;
        }
        return false;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            q.f(webSocketReader);
            webSocketReader.processNextFrame();
            if (this.receivedCloseCode != -1) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            failWebSocket(e10, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
        q.i(str, "text");
        return send(f.f20621q.d(str), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #0 {all -> 0x00d7, blocks: (B:27:0x006f, B:28:0x0078, B:30:0x007c, B:31:0x008c, B:33:0x009b, B:36:0x009e, B:37:0x009f, B:38:0x00a0, B:40:0x00a4, B:42:0x00b6, B:53:0x00d1, B:54:0x00d6, B:32:0x008d), top: B:69:0x006d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:27:0x006f, B:28:0x0078, B:30:0x007c, B:31:0x008c, B:33:0x009b, B:36:0x009e, B:37:0x009f, B:38:0x00a0, B:40:0x00a4, B:42:0x00b6, B:53:0x00d1, B:54:0x00d6, B:32:0x008d), top: B:69:0x006d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.writeOneFrame$okhttp():boolean");
    }

    public final void writePingFrame$okhttp() {
        int i10;
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter == null) {
                return;
            }
            if (this.awaitingPong) {
                i10 = this.sentPingCount;
            } else {
                i10 = -1;
            }
            this.sentPingCount++;
            this.awaitingPong = true;
            w wVar = w.f13270a;
            if (i10 != -1) {
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
                return;
            }
            try {
                webSocketWriter.writePing(f.f20622r);
            } catch (IOException e10) {
                failWebSocket(e10, null);
            }
        }
    }

    public final synchronized boolean close(int i10, String str, long j10) {
        f fVar;
        WebSocketProtocol.INSTANCE.validateCloseCode(i10);
        if (str != null) {
            fVar = f.f20621q.d(str);
            if (!(((long) fVar.D()) <= 123)) {
                throw new IllegalArgumentException(q.q("reason.size() > 123: ", str).toString());
            }
        } else {
            fVar = null;
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(i10, fVar, j10));
            runWriter();
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(f fVar) throws IOException {
        q.i(fVar, "bytes");
        this.listener.onMessage(this, fVar);
    }

    @Override // okhttp3.WebSocket
    public boolean send(f fVar) {
        q.i(fVar, "bytes");
        return send(fVar, 2);
    }

    private final synchronized boolean send(f fVar, int i10) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + fVar.D() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += fVar.D();
            this.messageAndCloseQueue.add(new Message(i10, fVar));
            runWriter();
            return true;
        }
        return false;
    }
}
