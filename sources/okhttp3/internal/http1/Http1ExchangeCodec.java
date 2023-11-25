package okhttp3.internal.http1;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Source;
import okio.a1;
import okio.c;
import okio.d;
import okio.e;
import okio.n;
import okio.y0;
import qc.h;
import qc.q;
import yc.v;

/* compiled from: Http1ExchangeCodec.kt */
/* loaded from: classes4.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final d sink;
    private final e source;
    private int state;
    private Headers trailers;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes4.dex */
    public abstract class AbstractSource implements Source {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final n timeout;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec) {
            q.i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new n(http1ExchangeCodec.source.timeout());
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        protected final boolean getClosed() {
            return this.closed;
        }

        protected final n getTimeout() {
            return this.timeout;
        }

        @Override // okio.Source
        public long read(c cVar, long j10) {
            q.i(cVar, "sink");
            try {
                return this.this$0.source.read(cVar, j10);
            } catch (IOException e10) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e10;
            }
        }

        public final void responseBodyComplete() {
            if (this.this$0.state == 6) {
                return;
            }
            if (this.this$0.state == 5) {
                this.this$0.detachTimeout(this.timeout);
                this.this$0.state = 6;
                return;
            }
            throw new IllegalStateException(q.q("state: ", Integer.valueOf(this.this$0.state)));
        }

        protected final void setClosed(boolean z10) {
            this.closed = z10;
        }

        @Override // okio.Source
        public a1 timeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes4.dex */
    public final class ChunkedSink implements y0 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final n timeout;

        public ChunkedSink(Http1ExchangeCodec http1ExchangeCodec) {
            q.i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new n(http1ExchangeCodec.sink.timeout());
        }

        @Override // okio.y0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.this$0.sink.W("0\r\n\r\n");
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 3;
        }

        @Override // okio.y0, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            this.this$0.sink.flush();
        }

        @Override // okio.y0
        public a1 timeout() {
            return this.timeout;
        }

        @Override // okio.y0
        public void write(c cVar, long j10) {
            q.i(cVar, "source");
            if ((!this.closed) != false) {
                if (j10 == 0) {
                    return;
                }
                this.this$0.sink.h0(j10);
                this.this$0.sink.W("\r\n");
                this.this$0.sink.write(cVar, j10);
                this.this$0.sink.W("\r\n");
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes4.dex */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec);
            q.i(http1ExchangeCodec, "this$0");
            q.i(httpUrl, ImagesContract.URL);
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (r1 != false) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void readChunkSize() {
            /*
                r7 = this;
                long r0 = r7.bytesRemainingInChunk
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L11
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0
                okio.e r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r0)
                r0.t0()
            L11:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0     // Catch: java.lang.NumberFormatException -> La2
                okio.e r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r0)     // Catch: java.lang.NumberFormatException -> La2
                long r0 = r0.S0()     // Catch: java.lang.NumberFormatException -> La2
                r7.bytesRemainingInChunk = r0     // Catch: java.lang.NumberFormatException -> La2
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0     // Catch: java.lang.NumberFormatException -> La2
                okio.e r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.t0()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.CharSequence r0 = yc.m.T0(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> La2
                long r1 = r7.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> La2
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L81
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> La2
                r2 = 0
                if (r1 <= 0) goto L40
                r1 = 1
                goto L41
            L40:
                r1 = 0
            L41:
                if (r1 == 0) goto L4d
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = yc.m.F(r0, r1, r2, r5, r6)     // Catch: java.lang.NumberFormatException -> La2
                if (r1 == 0) goto L81
            L4d:
                long r0 = r7.bytesRemainingInChunk
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 != 0) goto L80
                r7.hasMoreChunks = r2
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0
                okhttp3.internal.http1.HeadersReader r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getHeadersReader$p(r0)
                okhttp3.Headers r1 = r1.readHeaders()
                okhttp3.internal.http1.Http1ExchangeCodec.access$setTrailers$p(r0, r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0
                okhttp3.OkHttpClient r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getClient$p(r0)
                qc.q.f(r0)
                okhttp3.CookieJar r0 = r0.cookieJar()
                okhttp3.HttpUrl r1 = r7.url
                okhttp3.internal.http1.Http1ExchangeCodec r2 = r7.this$0
                okhttp3.Headers r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getTrailers$p(r2)
                qc.q.f(r2)
                okhttp3.internal.http.HttpHeaders.receiveHeaders(r0, r1, r2)
                r7.responseBodyComplete()
            L80:
                return
            L81:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> La2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> La2
                r2.<init>()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r3 = "expected chunk size and optional extensions but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                long r3 = r7.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> La2
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> La2
                throw r1     // Catch: java.lang.NumberFormatException -> La2
            La2:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSource.readChunkSize():void");
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(c cVar, long j10) {
            boolean z10;
            q.i(cVar, "sink");
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (true ^ getClosed()) {
                    if (!this.hasMoreChunks) {
                        return -1L;
                    }
                    long j11 = this.bytesRemainingInChunk;
                    if (j11 == 0 || j11 == -1) {
                        readChunkSize();
                        if (!this.hasMoreChunks) {
                            return -1L;
                        }
                    }
                    long read = super.read(cVar, Math.min(j10, this.bytesRemainingInChunk));
                    if (read != -1) {
                        this.bytesRemainingInChunk -= read;
                        return read;
                    }
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(q.q("byteCount < 0: ", Long.valueOf(j10)).toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes4.dex */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, long j10) {
            super(http1ExchangeCodec);
            q.i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.bytesRemaining = j10;
            if (j10 == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(c cVar, long j10) {
            boolean z10;
            q.i(cVar, "sink");
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (true ^ getClosed()) {
                    long j11 = this.bytesRemaining;
                    if (j11 == 0) {
                        return -1L;
                    }
                    long read = super.read(cVar, Math.min(j11, j10));
                    if (read != -1) {
                        long j12 = this.bytesRemaining - read;
                        this.bytesRemaining = j12;
                        if (j12 == 0) {
                            responseBodyComplete();
                        }
                        return read;
                    }
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(q.q("byteCount < 0: ", Long.valueOf(j10)).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes4.dex */
    public final class KnownLengthSink implements y0 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final n timeout;

        public KnownLengthSink(Http1ExchangeCodec http1ExchangeCodec) {
            q.i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new n(http1ExchangeCodec.sink.timeout());
        }

        @Override // okio.y0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 3;
        }

        @Override // okio.y0, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            this.this$0.sink.flush();
        }

        @Override // okio.y0
        public a1 timeout() {
            return this.timeout;
        }

        @Override // okio.y0
        public void write(c cVar, long j10) {
            q.i(cVar, "source");
            if ((!this.closed) != false) {
                Util.checkOffsetAndCount(cVar.s0(), 0L, j10);
                this.this$0.sink.write(cVar, j10);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes4.dex */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec) {
            super(http1ExchangeCodec);
            q.i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(c cVar, long j10) {
            boolean z10;
            q.i(cVar, "sink");
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if ((!getClosed()) != false) {
                    if (this.inputExhausted) {
                        return -1L;
                    }
                    long read = super.read(cVar, j10);
                    if (read == -1) {
                        this.inputExhausted = true;
                        responseBodyComplete();
                        return -1L;
                    }
                    return read;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(q.q("byteCount < 0: ", Long.valueOf(j10)).toString());
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, e eVar, d dVar) {
        q.i(realConnection, "connection");
        q.i(eVar, "source");
        q.i(dVar, "sink");
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = eVar;
        this.sink = dVar;
        this.headersReader = new HeadersReader(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(n nVar) {
        a1 a10 = nVar.a();
        nVar.b(a1.NONE);
        a10.clearDeadline();
        a10.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        boolean r10;
        r10 = v.r("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
        return r10;
    }

    private final y0 newChunkedSink() {
        int i10 = this.state;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10) {
            this.state = 2;
            return new ChunkedSink(this);
        }
        throw new IllegalStateException(q.q("state: ", Integer.valueOf(i10)).toString());
    }

    private final Source newChunkedSource(HttpUrl httpUrl) {
        boolean z10;
        int i10 = this.state;
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(q.q("state: ", Integer.valueOf(i10)).toString());
    }

    private final Source newFixedLengthSource(long j10) {
        boolean z10;
        int i10 = this.state;
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.state = 5;
            return new FixedLengthSource(this, j10);
        }
        throw new IllegalStateException(q.q("state: ", Integer.valueOf(i10)).toString());
    }

    private final y0 newKnownLengthSink() {
        int i10 = this.state;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10) {
            this.state = 2;
            return new KnownLengthSink(this);
        }
        throw new IllegalStateException(q.q("state: ", Integer.valueOf(i10)).toString());
    }

    private final Source newUnknownLengthSource() {
        boolean z10;
        int i10 = this.state;
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource(this);
        }
        throw new IllegalStateException(q.q("state: ", Integer.valueOf(i10)).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public y0 createRequestBody(Request request, long j10) {
        q.i(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j10 != -1) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Source openResponseBodySource(Response response) {
        q.i(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            return newFixedLengthSource(headersContentLength);
        }
        return newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z10) {
        boolean z11;
        int i10 = this.state;
        boolean z12 = false;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            try {
                StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
                if (z10 && parse.code == 100) {
                    return null;
                }
                int i11 = parse.code;
                if (i11 == 100) {
                    this.state = 3;
                    return headers;
                }
                if (102 <= i11 && i11 < 200) {
                    z12 = true;
                }
                if (z12) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e10) {
                throw new IOException(q.q("unexpected end of stream on ", getConnection().route().address().url().redact()), e10);
            }
        }
        throw new IllegalStateException(q.q("state: ", Integer.valueOf(i10)).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        q.i(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return -1L;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        q.i(response, "response");
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength == -1) {
            return;
        }
        Source newFixedLengthSource = newFixedLengthSource(headersContentLength);
        Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        boolean z10;
        if (this.state == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Headers headers = this.trailers;
            if (headers == null) {
                return Util.EMPTY_HEADERS;
            }
            return headers;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }

    public final void writeRequest(Headers headers, String str) {
        boolean z10;
        q.i(headers, "headers");
        q.i(str, "requestLine");
        int i10 = this.state;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.sink.W(str).W("\r\n");
            int size = headers.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.sink.W(headers.name(i11)).W(": ").W(headers.value(i11)).W("\r\n");
            }
            this.sink.W("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException(q.q("state: ", Integer.valueOf(i10)).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        q.i(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        q.h(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        boolean r10;
        r10 = v.r("chunked", request.header("Transfer-Encoding"), true);
        return r10;
    }
}
