package okhttp3.internal.http2;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dc.w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import okio.c;
import okio.d;
import okio.e;
import okio.f;
import okio.l0;
import pc.a;
import qc.d0;
import qc.f0;
import qc.h;
import qc.q;

/* compiled from: Http2Connection.kt */
/* loaded from: classes4.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public d sink;
        public Socket socket;
        public e source;
        private final TaskRunner taskRunner;

        public Builder(boolean z10, TaskRunner taskRunner) {
            q.i(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, e eVar, d dVar, int i10, Object obj) throws IOException {
            if ((i10 & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i10 & 4) != 0) {
                eVar = l0.d(l0.l(socket));
            }
            if ((i10 & 8) != 0) {
                dVar = l0.c(l0.h(socket));
            }
            return builder.socket(socket, str, eVar, dVar);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            q.z("connectionName");
            return null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final d getSink$okhttp() {
            d dVar = this.sink;
            if (dVar != null) {
                return dVar;
            }
            q.z("sink");
            return null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            q.z("socket");
            return null;
        }

        public final e getSource$okhttp() {
            e eVar = this.source;
            if (eVar != null) {
                return eVar;
            }
            q.z("source");
            return null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            q.i(listener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            setListener$okhttp(listener);
            return this;
        }

        public final Builder pingIntervalMillis(int i10) {
            setPingIntervalMillis$okhttp(i10);
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            q.i(pushObserver, "pushObserver");
            setPushObserver$okhttp(pushObserver);
            return this;
        }

        public final void setClient$okhttp(boolean z10) {
            this.client = z10;
        }

        public final void setConnectionName$okhttp(String str) {
            q.i(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener) {
            q.i(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i10) {
            this.pingIntervalMillis = i10;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            q.i(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(d dVar) {
            q.i(dVar, "<set-?>");
            this.sink = dVar;
        }

        public final void setSocket$okhttp(Socket socket) {
            q.i(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(e eVar) {
            q.i(eVar, "<set-?>");
            this.source = eVar;
        }

        public final Builder socket(Socket socket) throws IOException {
            q.i(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String str) throws IOException {
            q.i(socket, "socket");
            q.i(str, "peerName");
            return socket$default(this, socket, str, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String str, e eVar) throws IOException {
            q.i(socket, "socket");
            q.i(str, "peerName");
            q.i(eVar, "source");
            return socket$default(this, socket, str, eVar, null, 8, null);
        }

        public final Builder socket(Socket socket, String str, e eVar, d dVar) throws IOException {
            String q10;
            q.i(socket, "socket");
            q.i(str, "peerName");
            q.i(eVar, "source");
            q.i(dVar, "sink");
            setSocket$okhttp(socket);
            if (getClient$okhttp()) {
                q10 = Util.okHttpName + ' ' + str;
            } else {
                q10 = q.q("MockWebServer ", str);
            }
            setConnectionName$okhttp(q10);
            setSource$okhttp(eVar);
            setSink$okhttp(dVar);
            return this;
        }
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes4.dex */
    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) throws IOException {
                q.i(http2Stream, "stream");
                http2Stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        /* compiled from: Http2Connection.kt */
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }
        }

        public void onSettings(Http2Connection http2Connection, Settings settings) {
            q.i(http2Connection, "connection");
            q.i(settings, "settings");
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes4.dex */
    public final class ReaderRunnable implements Http2Reader.Handler, a<w> {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            q.i(http2Connection, "this$0");
            q.i(http2Reader, "reader");
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i10, String str, f fVar, String str2, int i11, long j10) {
            q.i(str, "origin");
            q.i(fVar, "protocol");
            q.i(str2, "host");
        }

        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, okhttp3.internal.http2.Settings] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void applyAndAckSettings(boolean z10, Settings settings) {
            ?? r13;
            long initialWindowSize;
            int i10;
            Http2Stream[] http2StreamArr;
            q.i(settings, "settings");
            f0 f0Var = new f0();
            Http2Writer writer = this.this$0.getWriter();
            Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    Settings peerSettings = http2Connection.getPeerSettings();
                    if (z10) {
                        r13 = settings;
                    } else {
                        Settings settings2 = new Settings();
                        settings2.merge(peerSettings);
                        settings2.merge(settings);
                        r13 = settings2;
                    }
                    f0Var.f21676f = r13;
                    initialWindowSize = r13.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                    i10 = 0;
                    if (initialWindowSize != 0 && !http2Connection.getStreams$okhttp().isEmpty()) {
                        Object[] array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                        if (array != null) {
                            http2StreamArr = (Http2Stream[]) array;
                            http2Connection.setPeerSettings((Settings) f0Var.f21676f);
                            http2Connection.settingsListenerQueue.schedule(new Task(q.q(http2Connection.getConnectionName$okhttp(), " onSettings"), true, http2Connection, f0Var) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1
                                final /* synthetic */ boolean $cancelable;
                                final /* synthetic */ String $name;
                                final /* synthetic */ f0 $newPeerSettings$inlined;
                                final /* synthetic */ Http2Connection this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(r1, r2);
                                    this.$name = r1;
                                    this.$cancelable = r2;
                                    this.this$0 = http2Connection;
                                    this.$newPeerSettings$inlined = f0Var;
                                }

                                @Override // okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings) this.$newPeerSettings$inlined.f21676f);
                                    return -1L;
                                }
                            }, 0L);
                            w wVar = w.f13270a;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                    }
                    http2StreamArr = null;
                    http2Connection.setPeerSettings((Settings) f0Var.f21676f);
                    http2Connection.settingsListenerQueue.schedule(new Task(q.q(http2Connection.getConnectionName$okhttp(), " onSettings"), true, http2Connection, f0Var) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1
                        final /* synthetic */ boolean $cancelable;
                        final /* synthetic */ String $name;
                        final /* synthetic */ f0 $newPeerSettings$inlined;
                        final /* synthetic */ Http2Connection this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(r1, r2);
                            this.$name = r1;
                            this.$cancelable = r2;
                            this.this$0 = http2Connection;
                            this.$newPeerSettings$inlined = f0Var;
                        }

                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings) this.$newPeerSettings$inlined.f21676f);
                            return -1L;
                        }
                    }, 0L);
                    w wVar2 = w.f13270a;
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) f0Var.f21676f);
                } catch (IOException e10) {
                    http2Connection.failConnection(e10);
                }
                w wVar3 = w.f13270a;
            }
            if (http2StreamArr != null) {
                int length = http2StreamArr.length;
                while (i10 < length) {
                    Http2Stream http2Stream = http2StreamArr[i10];
                    i10++;
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        w wVar4 = w.f13270a;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z10, int i10, e eVar, int i11) throws IOException {
            q.i(eVar, "source");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushDataLater$okhttp(i10, eVar, i11, z10);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i10);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i10, ErrorCode.PROTOCOL_ERROR);
                long j10 = i11;
                this.this$0.updateConnectionFlowControl$okhttp(j10);
                eVar.skip(j10);
                return;
            }
            stream.receiveData(eVar, i11);
            if (z10) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i10, ErrorCode errorCode, f fVar) {
            int i11;
            Object[] array;
            q.i(errorCode, "errorCode");
            q.i(fVar, "debugData");
            fVar.D();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                i11 = 0;
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (array != null) {
                    http2Connection.isShutdown = true;
                    w wVar = w.f13270a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
            Http2Stream[] http2StreamArr = (Http2Stream[]) array;
            int length = http2StreamArr.length;
            while (i11 < length) {
                Http2Stream http2Stream = http2StreamArr[i11];
                i11++;
                if (http2Stream.getId() > i10 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z10, int i10, int i11, List<Header> list) {
            q.i(list, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushHeadersLater$okhttp(i10, list, z10);
                return;
            }
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i10);
                if (stream == null) {
                    if (http2Connection.isShutdown) {
                        return;
                    }
                    if (i10 <= http2Connection.getLastGoodStreamId$okhttp()) {
                        return;
                    }
                    if (i10 % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                        return;
                    }
                    Http2Stream http2Stream = new Http2Stream(i10, http2Connection, false, z10, Util.toHeaders(list));
                    http2Connection.setLastGoodStreamId$okhttp(i10);
                    http2Connection.getStreams$okhttp().put(Integer.valueOf(i10), http2Stream);
                    http2Connection.taskRunner.newQueue().schedule(new Task(http2Connection.getConnectionName$okhttp() + '[' + i10 + "] onStream", true, http2Connection, http2Stream) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1
                        final /* synthetic */ boolean $cancelable;
                        final /* synthetic */ String $name;
                        final /* synthetic */ Http2Stream $newStream$inlined;
                        final /* synthetic */ Http2Connection this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(r1, r2);
                            this.$name = r1;
                            this.$cancelable = r2;
                            this.this$0 = http2Connection;
                            this.$newStream$inlined = http2Stream;
                        }

                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            try {
                                this.this$0.getListener$okhttp().onStream(this.$newStream$inlined);
                                return -1L;
                            } catch (IOException e10) {
                                Platform.Companion.get().log(q.q("Http2Connection.Listener failure for ", this.this$0.getConnectionName$okhttp()), 4, e10);
                                try {
                                    this.$newStream$inlined.close(ErrorCode.PROTOCOL_ERROR, e10);
                                    return -1L;
                                } catch (IOException unused) {
                                    return -1L;
                                }
                            }
                        }
                    }, 0L);
                    return;
                }
                w wVar = w.f13270a;
                stream.receiveHeaders(Util.toHeaders(list), z10);
            }
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z10, int i10, int i11) {
            if (z10) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    if (i10 == 1) {
                        http2Connection.intervalPongsReceived++;
                    } else if (i10 == 2) {
                        http2Connection.degradedPongsReceived++;
                    } else {
                        if (i10 == 3) {
                            http2Connection.awaitPongsReceived++;
                            http2Connection.notifyAll();
                        }
                        w wVar = w.f13270a;
                    }
                }
                return;
            }
            this.this$0.writerQueue.schedule(new Task(q.q(this.this$0.getConnectionName$okhttp(), " ping"), true, this.this$0, i10, i11) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ String $name;
                final /* synthetic */ int $payload1$inlined;
                final /* synthetic */ int $payload2$inlined;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r1, r2);
                    this.$name = r1;
                    this.$cancelable = r2;
                    this.this$0 = r3;
                    this.$payload1$inlined = i10;
                    this.$payload2$inlined = i11;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.this$0.writePing(true, this.$payload1$inlined, this.$payload2$inlined);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i10, int i11, List<Header> list) {
            q.i(list, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i11, list);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i10, ErrorCode errorCode) {
            q.i(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushResetLater$okhttp(i10, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(i10);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean z10, Settings settings) {
            q.i(settings, "settings");
            this.this$0.writerQueue.schedule(new Task(q.q(this.this$0.getConnectionName$okhttp(), " applyAndAckSettings"), true, this, z10, settings) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ boolean $clearPrevious$inlined;
                final /* synthetic */ String $name;
                final /* synthetic */ Settings $settings$inlined;
                final /* synthetic */ Http2Connection.ReaderRunnable this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r1, r2);
                    this.$name = r1;
                    this.$cancelable = r2;
                    this.this$0 = this;
                    this.$clearPrevious$inlined = z10;
                    this.$settings$inlined = settings;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.this$0.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i10, long j10) {
            if (i10 == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j10;
                    http2Connection.notifyAll();
                    w wVar = w.f13270a;
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i10);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j10);
                    w wVar2 = w.f13270a;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        /* renamed from: invoke */
        public void invoke2() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    do {
                    } while (this.reader.nextFrame(false, this));
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.this$0.close$okhttp(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e11) {
                        e10 = e11;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        Http2Connection http2Connection = this.this$0;
                        http2Connection.close$okhttp(errorCode4, errorCode4, e10);
                        errorCode = http2Connection;
                        errorCode2 = this.reader;
                        Util.closeQuietly((Closeable) errorCode2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.this$0.close$okhttp(errorCode, errorCode2, e10);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.this$0.close$okhttp(errorCode, errorCode2, e10);
                Util.closeQuietly(this.reader);
                throw th;
            }
            errorCode2 = this.reader;
            Util.closeQuietly((Closeable) errorCode2);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i10, int i11, int i12, boolean z10) {
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, Http2.INITIAL_MAX_FRAME_SIZE);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        int i10;
        q.i(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        if (builder.getClient$okhttp()) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.nextStreamId = i10;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue newQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            newQueue.schedule(new Task(q.q(connectionName$okhttp, " ping"), this, nanos) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                final /* synthetic */ String $name;
                final /* synthetic */ long $pingIntervalNanos$inlined;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r1, false, 2, null);
                    this.$name = r1;
                    this.this$0 = this;
                    this.$pingIntervalNanos$inlined = nanos;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    long j10;
                    long j11;
                    boolean z10;
                    synchronized (this.this$0) {
                        long j12 = this.this$0.intervalPongsReceived;
                        j10 = this.this$0.intervalPingsSent;
                        if (j12 >= j10) {
                            j11 = this.this$0.intervalPingsSent;
                            this.this$0.intervalPingsSent = j11 + 1;
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.this$0.failConnection(null);
                        return -1L;
                    }
                    this.this$0.writePing(false, 1, 0);
                    return this.$pingIntervalNanos$inlined;
                }
            }, nanos);
        }
    }

    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z10, TaskRunner taskRunner, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z10, taskRunner);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i10;
        Object[] objArr;
        q.i(errorCode, "connectionCode");
        q.i(errorCode2, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if ((!getStreams$okhttp().isEmpty()) != false) {
                objArr = getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (objArr != null) {
                    getStreams$okhttp().clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            } else {
                objArr = null;
            }
            w wVar = w.f13270a;
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            getWriter().close();
        } catch (IOException unused3) {
        }
        try {
            getSocket$okhttp().close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i10) {
        return this.streams.get(Integer.valueOf(i10));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j10) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j10 >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream newStream(List<Header> list, boolean z10) throws IOException {
        q.i(list, "requestHeaders");
        return newStream(0, list, z10);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(int i10, e eVar, int i11, boolean z10) throws IOException {
        q.i(eVar, "source");
        c cVar = new c();
        long j10 = i11;
        eVar.O0(j10);
        eVar.read(cVar, j10);
        this.pushQueue.schedule(new Task(this.connectionName + '[' + i10 + "] onData", true, this, i10, cVar, i11, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            final /* synthetic */ c $buffer$inlined;
            final /* synthetic */ int $byteCount$inlined;
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ boolean $inFinished$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r1, r2);
                this.$name = r1;
                this.$cancelable = r2;
                this.this$0 = this;
                this.$streamId$inlined = i10;
                this.$buffer$inlined = cVar;
                this.$byteCount$inlined = i11;
                this.$inFinished$inlined = z10;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                try {
                    pushObserver = this.this$0.pushObserver;
                    boolean onData = pushObserver.onData(this.$streamId$inlined, this.$buffer$inlined, this.$byteCount$inlined, this.$inFinished$inlined);
                    if (onData) {
                        this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                    }
                    if (onData || this.$inFinished$inlined) {
                        synchronized (this.this$0) {
                            set = this.this$0.currentPushRequests;
                            set.remove(Integer.valueOf(this.$streamId$inlined));
                        }
                        return -1L;
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(int i10, List<Header> list, boolean z10) {
        q.i(list, "requestHeaders");
        this.pushQueue.schedule(new Task(this.connectionName + '[' + i10 + "] onHeaders", true, this, i10, list, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ boolean $inFinished$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ List $requestHeaders$inlined;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r1, r2);
                this.$name = r1;
                this.$cancelable = r2;
                this.this$0 = this;
                this.$streamId$inlined = i10;
                this.$requestHeaders$inlined = list;
                this.$inFinished$inlined = z10;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.this$0.pushObserver;
                boolean onHeaders = pushObserver.onHeaders(this.$streamId$inlined, this.$requestHeaders$inlined, this.$inFinished$inlined);
                if (onHeaders) {
                    try {
                        this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (onHeaders || this.$inFinished$inlined) {
                    synchronized (this.this$0) {
                        set = this.this$0.currentPushRequests;
                        set.remove(Integer.valueOf(this.$streamId$inlined));
                    }
                    return -1L;
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(int i10, List<Header> list) {
        q.i(list, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i10))) {
                writeSynResetLater$okhttp(i10, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i10));
            this.pushQueue.schedule(new Task(this.connectionName + '[' + i10 + "] onRequest", true, this, i10, list) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ String $name;
                final /* synthetic */ List $requestHeaders$inlined;
                final /* synthetic */ int $streamId$inlined;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r1, r2);
                    this.$name = r1;
                    this.$cancelable = r2;
                    this.this$0 = this;
                    this.$streamId$inlined = i10;
                    this.$requestHeaders$inlined = list;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    PushObserver pushObserver;
                    Set set;
                    pushObserver = this.this$0.pushObserver;
                    if (pushObserver.onRequest(this.$streamId$inlined, this.$requestHeaders$inlined)) {
                        try {
                            this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                            synchronized (this.this$0) {
                                set = this.this$0.currentPushRequests;
                                set.remove(Integer.valueOf(this.$streamId$inlined));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void pushResetLater$okhttp(int i10, ErrorCode errorCode) {
        q.i(errorCode, "errorCode");
        this.pushQueue.schedule(new Task(this.connectionName + '[' + i10 + "] onReset", true, this, i10, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ ErrorCode $errorCode$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r1, r2);
                this.$name = r1;
                this.$cancelable = r2;
                this.this$0 = this;
                this.$streamId$inlined = i10;
                this.$errorCode$inlined = errorCode;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.this$0.pushObserver;
                pushObserver.onReset(this.$streamId$inlined, this.$errorCode$inlined);
                synchronized (this.this$0) {
                    set = this.this$0.currentPushRequests;
                    set.remove(Integer.valueOf(this.$streamId$inlined));
                    w wVar = w.f13270a;
                }
                return -1L;
            }
        }, 0L);
    }

    public final Http2Stream pushStream(int i10, List<Header> list, boolean z10) throws IOException {
        q.i(list, "requestHeaders");
        if ((!this.client) != false) {
            return newStream(i10, list, z10);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean pushedStream$okhttp(int i10) {
        if (i10 != 0 && (i10 & 1) == 0) {
            return true;
        }
        return false;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i10) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j10 = this.degradedPongsReceived;
            long j11 = this.degradedPingsSent;
            if (j10 < j11) {
                return;
            }
            this.degradedPingsSent = j11 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + ((long) DEGRADED_PONG_TIMEOUT_NS);
            w wVar = w.f13270a;
            this.writerQueue.schedule(new Task(q.q(this.connectionName, " ping"), true, this) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ String $name;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r1, r2);
                    this.$name = r1;
                    this.$cancelable = r2;
                    this.this$0 = this;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.this$0.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i10) {
        this.lastGoodStreamId = i10;
    }

    public final void setNextStreamId$okhttp(int i10) {
        this.nextStreamId = i10;
    }

    public final void setPeerSettings(Settings settings) {
        q.i(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) throws IOException {
        q.i(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    getOkHttpSettings().merge(settings);
                    w wVar = w.f13270a;
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            getWriter().settings(settings);
        }
    }

    public final void shutdown(ErrorCode errorCode) throws IOException {
        q.i(errorCode, "statusCode");
        synchronized (this.writer) {
            d0 d0Var = new d0();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                d0Var.f21667f = getLastGoodStreamId$okhttp();
                w wVar = w.f13270a;
                getWriter().goAway(d0Var.f21667f, errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j10) {
        long j11 = this.readBytesTotal + j10;
        this.readBytesTotal = j11;
        long j12 = j11 - this.readBytesAcknowledged;
        if (j12 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j12);
            this.readBytesAcknowledged += j12;
        }
    }

    public final void writeData(int i10, boolean z10, c cVar, long j10) throws IOException {
        int min;
        long j11;
        boolean z11;
        if (j10 == 0) {
            this.writer.data(z10, i10, cVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (getWriteBytesTotal() >= getWriteBytesMaximum()) {
                    try {
                        if (getStreams$okhttp().containsKey(Integer.valueOf(i10))) {
                            wait();
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j10, getWriteBytesMaximum() - getWriteBytesTotal()), getWriter().maxDataLength());
                j11 = min;
                this.writeBytesTotal = getWriteBytesTotal() + j11;
                w wVar = w.f13270a;
            }
            j10 -= j11;
            Http2Writer http2Writer = this.writer;
            if (z10 && j10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            http2Writer.data(z11, i10, cVar, min);
        }
    }

    public final void writeHeaders$okhttp(int i10, boolean z10, List<Header> list) throws IOException {
        q.i(list, "alternating");
        this.writer.headers(z10, i10, list);
    }

    public final void writePing(boolean z10, int i10, int i11) {
        try {
            this.writer.ping(z10, i10, i11);
        } catch (IOException e10) {
            failConnection(e10);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i10, ErrorCode errorCode) throws IOException {
        q.i(errorCode, "statusCode");
        this.writer.rstStream(i10, errorCode);
    }

    public final void writeSynResetLater$okhttp(int i10, ErrorCode errorCode) {
        q.i(errorCode, "errorCode");
        this.writerQueue.schedule(new Task(this.connectionName + '[' + i10 + "] writeSynReset", true, this, i10, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ ErrorCode $errorCode$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r1, r2);
                this.$name = r1;
                this.$cancelable = r2;
                this.this$0 = this;
                this.$streamId$inlined = i10;
                this.$errorCode$inlined = errorCode;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.this$0.writeSynReset$okhttp(this.$streamId$inlined, this.$errorCode$inlined);
                    return -1L;
                } catch (IOException e10) {
                    this.this$0.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(int i10, long j10) {
        this.writerQueue.schedule(new Task(this.connectionName + '[' + i10 + "] windowUpdate", true, this, i10, j10) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ long $unacknowledgedBytesRead$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r1, r2);
                this.$name = r1;
                this.$cancelable = r2;
                this.this$0 = this;
                this.$streamId$inlined = i10;
                this.$unacknowledgedBytesRead$inlined = j10;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.this$0.getWriter().windowUpdate(this.$streamId$inlined, this.$unacknowledgedBytesRead$inlined);
                    return -1L;
                } catch (IOException e10) {
                    this.this$0.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0055 A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:50:0x0007, B:52:0x0010, B:53:0x0015, B:55:0x0019, B:57:0x0033, B:59:0x003f, B:64:0x004f, B:66:0x0055, B:67:0x0060, B:80:0x0090, B:81:0x0095), top: B:88:0x0007, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.internal.http2.Http2Stream newStream(int r11, java.util.List<okhttp3.internal.http2.Header> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.Http2Writer r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L99
            int r0 = r10.getNextStreamId$okhttp()     // Catch: java.lang.Throwable -> L96
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L15
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L96
            r10.shutdown(r0)     // Catch: java.lang.Throwable -> L96
        L15:
            boolean r0 = r10.isShutdown     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L90
            int r8 = r10.getNextStreamId$okhttp()     // Catch: java.lang.Throwable -> L96
            int r0 = r10.getNextStreamId$okhttp()     // Catch: java.lang.Throwable -> L96
            int r0 = r0 + 2
            r10.setNextStreamId$okhttp(r0)     // Catch: java.lang.Throwable -> L96
            okhttp3.internal.http2.Http2Stream r9 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L96
            r0 = 1
            if (r13 == 0) goto L4e
            long r1 = r10.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L96
            long r3 = r10.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L96
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L4e
            long r1 = r9.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L96
            long r3 = r9.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L96
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L4c
            goto L4e
        L4c:
            r13 = 0
            goto L4f
        L4e:
            r13 = 1
        L4f:
            boolean r1 = r9.isOpen()     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L60
            java.util.Map r1 = r10.getStreams$okhttp()     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L96
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L96
        L60:
            dc.w r1 = dc.w.f13270a     // Catch: java.lang.Throwable -> L96
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L99
            if (r11 != 0) goto L6d
            okhttp3.internal.http2.Http2Writer r11 = r10.getWriter()     // Catch: java.lang.Throwable -> L99
            r11.headers(r6, r8, r12)     // Catch: java.lang.Throwable -> L99
            goto L7b
        L6d:
            boolean r1 = r10.getClient$okhttp()     // Catch: java.lang.Throwable -> L99
            r0 = r0 ^ r1
            if (r0 == 0) goto L84
            okhttp3.internal.http2.Http2Writer r0 = r10.getWriter()     // Catch: java.lang.Throwable -> L99
            r0.pushPromise(r11, r8, r12)     // Catch: java.lang.Throwable -> L99
        L7b:
            monitor-exit(r7)
            if (r13 == 0) goto L83
            okhttp3.internal.http2.Http2Writer r11 = r10.writer
            r11.flush()
        L83:
            return r9
        L84:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L99
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L99
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L99
            throw r12     // Catch: java.lang.Throwable -> L99
        L90:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L96
            r11.<init>()     // Catch: java.lang.Throwable -> L96
            throw r11     // Catch: java.lang.Throwable -> L96
        L96:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L99
            throw r11     // Catch: java.lang.Throwable -> L99
        L99:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    public final void start(boolean z10) throws IOException {
        start$default(this, z10, null, 2, null);
    }

    public final void start(boolean z10, TaskRunner taskRunner) throws IOException {
        q.i(taskRunner, "taskRunner");
        if (z10) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r5 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue$execute$1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
