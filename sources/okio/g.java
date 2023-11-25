package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink.kt */
/* loaded from: classes4.dex */
public final class g implements y0 {

    /* renamed from: f  reason: collision with root package name */
    private final d f20628f;

    /* renamed from: m  reason: collision with root package name */
    private final Deflater f20629m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f20630p;

    public g(d dVar, Deflater deflater) {
        qc.q.i(dVar, "sink");
        qc.q.i(deflater, "deflater");
        this.f20628f = dVar;
        this.f20629m = deflater;
    }

    @IgnoreJRERequirement
    private final void b(boolean z10) {
        v0 A0;
        int deflate;
        c a10 = this.f20628f.a();
        while (true) {
            A0 = a10.A0(1);
            if (z10) {
                Deflater deflater = this.f20629m;
                byte[] bArr = A0.f20687a;
                int i10 = A0.f20689c;
                deflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
            } else {
                Deflater deflater2 = this.f20629m;
                byte[] bArr2 = A0.f20687a;
                int i11 = A0.f20689c;
                deflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (deflate > 0) {
                A0.f20689c += deflate;
                a10.q0(a10.s0() + deflate);
                this.f20628f.J();
            } else if (this.f20629m.needsInput()) {
                break;
            }
        }
        if (A0.f20688b == A0.f20689c) {
            a10.f20602f = A0.b();
            w0.b(A0);
        }
    }

    public final void c() {
        this.f20629m.finish();
        b(false);
    }

    @Override // okio.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f20630p) {
            return;
        }
        try {
            c();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f20629m.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f20628f.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f20630p = true;
        if (th == null) {
            return;
        }
        throw th;
    }

    @Override // okio.y0, java.io.Flushable
    public void flush() throws IOException {
        b(true);
        this.f20628f.flush();
    }

    @Override // okio.y0
    public a1 timeout() {
        return this.f20628f.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f20628f + ')';
    }

    @Override // okio.y0
    public void write(c cVar, long j10) throws IOException {
        qc.q.i(cVar, "source");
        f1.b(cVar.s0(), 0L, j10);
        while (j10 > 0) {
            v0 v0Var = cVar.f20602f;
            qc.q.f(v0Var);
            int min = (int) Math.min(j10, v0Var.f20689c - v0Var.f20688b);
            this.f20629m.setInput(v0Var.f20687a, v0Var.f20688b, min);
            b(false);
            long j11 = min;
            cVar.q0(cVar.s0() - j11);
            int i10 = v0Var.f20688b + min;
            v0Var.f20688b = i10;
            if (i10 == v0Var.f20689c) {
                cVar.f20602f = v0Var.b();
                w0.b(v0Var);
            }
            j10 -= j11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(y0 y0Var, Deflater deflater) {
        this(l0.c(y0Var), deflater);
        qc.q.i(y0Var, "sink");
        qc.q.i(deflater, "deflater");
    }
}
