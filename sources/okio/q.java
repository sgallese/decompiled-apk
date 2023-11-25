package okio;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes4.dex */
public class q implements Source {

    /* renamed from: f  reason: collision with root package name */
    private final InputStream f20667f;

    /* renamed from: m  reason: collision with root package name */
    private final a1 f20668m;

    public q(InputStream inputStream, a1 a1Var) {
        qc.q.i(inputStream, "input");
        qc.q.i(a1Var, "timeout");
        this.f20667f = inputStream;
        this.f20668m = a1Var;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20667f.close();
    }

    @Override // okio.Source
    public long read(c cVar, long j10) {
        boolean z10;
        qc.q.i(cVar, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                this.f20668m.throwIfReached();
                v0 A0 = cVar.A0(1);
                int read = this.f20667f.read(A0.f20687a, A0.f20689c, (int) Math.min(j10, 8192 - A0.f20689c));
                if (read == -1) {
                    if (A0.f20688b == A0.f20689c) {
                        cVar.f20602f = A0.b();
                        w0.b(A0);
                        return -1L;
                    }
                    return -1L;
                }
                A0.f20689c += read;
                long j11 = read;
                cVar.q0(cVar.s0() + j11);
                return j11;
            } catch (AssertionError e10) {
                if (l0.e(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // okio.Source
    public a1 timeout() {
        return this.f20668m;
    }

    public String toString() {
        return "source(" + this.f20667f + ')';
    }
}
