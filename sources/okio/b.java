package okio;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Okio.kt */
/* loaded from: classes4.dex */
public final class b implements y0 {
    @Override // okio.y0
    public a1 timeout() {
        return a1.NONE;
    }

    @Override // okio.y0
    public void write(c cVar, long j10) {
        qc.q.i(cVar, "source");
        cVar.skip(j10);
    }

    @Override // okio.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.y0, java.io.Flushable
    public void flush() {
    }
}
