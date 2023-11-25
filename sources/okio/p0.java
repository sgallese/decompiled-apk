package okio;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes4.dex */
public final class p0 implements y0 {

    /* renamed from: f  reason: collision with root package name */
    private final OutputStream f20665f;

    /* renamed from: m  reason: collision with root package name */
    private final a1 f20666m;

    public p0(OutputStream outputStream, a1 a1Var) {
        qc.q.i(outputStream, "out");
        qc.q.i(a1Var, "timeout");
        this.f20665f = outputStream;
        this.f20666m = a1Var;
    }

    @Override // okio.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20665f.close();
    }

    @Override // okio.y0, java.io.Flushable
    public void flush() {
        this.f20665f.flush();
    }

    @Override // okio.y0
    public a1 timeout() {
        return this.f20666m;
    }

    public String toString() {
        return "sink(" + this.f20665f + ')';
    }

    @Override // okio.y0
    public void write(c cVar, long j10) {
        qc.q.i(cVar, "source");
        f1.b(cVar.s0(), 0L, j10);
        while (j10 > 0) {
            this.f20666m.throwIfReached();
            v0 v0Var = cVar.f20602f;
            qc.q.f(v0Var);
            int min = (int) Math.min(j10, v0Var.f20689c - v0Var.f20688b);
            this.f20665f.write(v0Var.f20687a, v0Var.f20688b, min);
            v0Var.f20688b += min;
            long j11 = min;
            j10 -= j11;
            cVar.q0(cVar.s0() - j11);
            if (v0Var.f20688b == v0Var.f20689c) {
                cVar.f20602f = v0Var.b();
                w0.b(v0Var);
            }
        }
    }
}
