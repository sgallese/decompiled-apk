package okio;

import java.io.IOException;

/* compiled from: ForwardingSink.kt */
/* loaded from: classes4.dex */
public abstract class l implements y0 {
    private final y0 delegate;

    public l(y0 y0Var) {
        qc.q.i(y0Var, "delegate");
        this.delegate = y0Var;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final y0 m369deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final y0 delegate() {
        return this.delegate;
    }

    @Override // okio.y0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.y0
    public a1 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.y0
    public void write(c cVar, long j10) throws IOException {
        qc.q.i(cVar, "source");
        this.delegate.write(cVar, j10);
    }
}
