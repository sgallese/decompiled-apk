package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;
import okio.Source;
import okio.a1;
import okio.c;
import okio.e;
import okio.f;
import okio.l0;
import okio.o0;
import qc.h;
import qc.q;

/* compiled from: MultipartReader.kt */
/* loaded from: classes4.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final o0 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final f crlfDashDashBoundary;
    private PartSource currentPart;
    private final f dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final e source;

    /* compiled from: MultipartReader.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final o0 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    /* compiled from: MultipartReader.kt */
    /* loaded from: classes4.dex */
    public static final class Part implements Closeable {
        private final e body;
        private final Headers headers;

        public Part(Headers headers, e eVar) {
            q.i(headers, "headers");
            q.i(eVar, "body");
            this.headers = headers;
            this.body = eVar;
        }

        public final e body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    /* compiled from: MultipartReader.kt */
    /* loaded from: classes4.dex */
    private final class PartSource implements Source {
        final /* synthetic */ MultipartReader this$0;
        private final a1 timeout;

        public PartSource(MultipartReader multipartReader) {
            q.i(multipartReader, "this$0");
            this.this$0 = multipartReader;
            this.timeout = new a1();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (q.d(this.this$0.currentPart, this)) {
                this.this$0.currentPart = null;
            }
        }

        @Override // okio.Source
        public long read(c cVar, long j10) {
            boolean z10;
            long read;
            long read2;
            q.i(cVar, "sink");
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (q.d(this.this$0.currentPart, this)) {
                    a1 timeout = this.this$0.source.timeout();
                    a1 a1Var = this.timeout;
                    MultipartReader multipartReader = this.this$0;
                    long timeoutNanos = timeout.timeoutNanos();
                    long a10 = a1.Companion.a(a1Var.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(a10, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (a1Var.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), a1Var.deadlineNanoTime()));
                        }
                        try {
                            long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j10);
                            if (currentPartBytesRemaining == 0) {
                                read2 = -1;
                            } else {
                                read2 = multipartReader.source.read(cVar, currentPartBytesRemaining);
                            }
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (a1Var.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            return read2;
                        } catch (Throwable th) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (a1Var.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            throw th;
                        }
                    }
                    if (a1Var.hasDeadline()) {
                        timeout.deadlineNanoTime(a1Var.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j10);
                        if (currentPartBytesRemaining2 == 0) {
                            read = -1;
                        } else {
                            read = multipartReader.source.read(cVar, currentPartBytesRemaining2);
                        }
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (a1Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return read;
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (a1Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(q.q("byteCount < 0: ", Long.valueOf(j10)).toString());
        }

        @Override // okio.Source
        public a1 timeout() {
            return this.timeout;
        }
    }

    static {
        o0.a aVar = o0.f20658q;
        f.a aVar2 = f.f20621q;
        afterBoundaryOptions = aVar.d(aVar2.d("\r\n"), aVar2.d("--"), aVar2.d(" "), aVar2.d("\t"));
    }

    public MultipartReader(e eVar, String str) throws IOException {
        q.i(eVar, "source");
        q.i(str, "boundary");
        this.source = eVar;
        this.boundary = str;
        this.dashDashBoundary = new c().W("--").W(str).j0();
        this.crlfDashDashBoundary = new c().W("\r\n--").W(str).j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j10) {
        this.source.O0(this.crlfDashDashBoundary.D());
        long L = this.source.a().L(this.crlfDashDashBoundary);
        if (L == -1) {
            return Math.min(j10, (this.source.a().s0() - this.crlfDashDashBoundary.D()) + 1);
        }
        return Math.min(j10, L);
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        if ((!this.closed) != false) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.a0(0L, this.dashDashBoundary)) {
                this.source.skip(this.dashDashBoundary.D());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(8192L);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.skip(currentPartBytesRemaining);
                }
                this.source.skip(this.crlfDashDashBoundary.D());
            }
            boolean z10 = false;
            while (true) {
                int W0 = this.source.W0(afterBoundaryOptions);
                if (W0 != -1) {
                    if (W0 != 0) {
                        if (W0 != 1) {
                            if (W0 == 2 || W0 == 3) {
                                z10 = true;
                            }
                        } else if (!z10) {
                            if (this.partCount != 0) {
                                this.noMoreParts = true;
                                return null;
                            }
                            throw new ProtocolException("expected at least 1 part");
                        } else {
                            throw new ProtocolException("unexpected characters after boundary");
                        }
                    } else {
                        this.partCount++;
                        Headers readHeaders = new HeadersReader(this.source).readHeaders();
                        PartSource partSource = new PartSource(this);
                        this.currentPart = partSource;
                        return new Part(readHeaders, l0.d(partSource));
                    }
                } else {
                    throw new ProtocolException("unexpected characters after boundary");
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultipartReader(okhttp3.ResponseBody r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            qc.q.i(r3, r0)
            okio.e r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 != 0) goto L11
            r3 = 0
            goto L17
        L11:
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
        L17:
            if (r3 == 0) goto L1d
            r2.<init>(r0, r3)
            return
        L1d:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
