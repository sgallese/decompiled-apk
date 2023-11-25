package okio;

import java.io.IOException;

/* compiled from: ForwardingSource.kt */
/* loaded from: classes4.dex */
public abstract class m implements Source {
    private final Source delegate;

    public m(Source source) {
        qc.q.i(source, "delegate");
        this.delegate = source;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final Source m370deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final Source delegate() {
        return this.delegate;
    }

    @Override // okio.Source
    public long read(c cVar, long j10) throws IOException {
        qc.q.i(cVar, "sink");
        return this.delegate.read(cVar, j10);
    }

    @Override // okio.Source
    public a1 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
