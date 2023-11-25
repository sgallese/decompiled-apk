package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.kt */
/* loaded from: classes4.dex */
public final class p implements Source {

    /* renamed from: f  reason: collision with root package name */
    private final e f20661f;

    /* renamed from: m  reason: collision with root package name */
    private final Inflater f20662m;

    /* renamed from: p  reason: collision with root package name */
    private int f20663p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f20664q;

    public p(e eVar, Inflater inflater) {
        qc.q.i(eVar, "source");
        qc.q.i(inflater, "inflater");
        this.f20661f = eVar;
        this.f20662m = inflater;
    }

    private final void d() {
        int i10 = this.f20663p;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f20662m.getRemaining();
        this.f20663p -= remaining;
        this.f20661f.skip(remaining);
    }

    public final long b(c cVar, long j10) throws IOException {
        boolean z10;
        qc.q.i(cVar, "sink");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((!this.f20664q) != false) {
                if (j10 == 0) {
                    return 0L;
                }
                try {
                    v0 A0 = cVar.A0(1);
                    int min = (int) Math.min(j10, 8192 - A0.f20689c);
                    c();
                    int inflate = this.f20662m.inflate(A0.f20687a, A0.f20689c, min);
                    d();
                    if (inflate > 0) {
                        A0.f20689c += inflate;
                        long j11 = inflate;
                        cVar.q0(cVar.s0() + j11);
                        return j11;
                    }
                    if (A0.f20688b == A0.f20689c) {
                        cVar.f20602f = A0.b();
                        w0.b(A0);
                    }
                    return 0L;
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    public final boolean c() throws IOException {
        if (!this.f20662m.needsInput()) {
            return false;
        }
        if (this.f20661f.C()) {
            return true;
        }
        v0 v0Var = this.f20661f.a().f20602f;
        qc.q.f(v0Var);
        int i10 = v0Var.f20689c;
        int i11 = v0Var.f20688b;
        int i12 = i10 - i11;
        this.f20663p = i12;
        this.f20662m.setInput(v0Var.f20687a, i11, i12);
        return false;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f20664q) {
            return;
        }
        this.f20662m.end();
        this.f20664q = true;
        this.f20661f.close();
    }

    @Override // okio.Source
    public long read(c cVar, long j10) throws IOException {
        qc.q.i(cVar, "sink");
        do {
            long b10 = b(cVar, j10);
            if (b10 > 0) {
                return b10;
            }
            if (this.f20662m.finished() || this.f20662m.needsDictionary()) {
                return -1L;
            }
        } while (!this.f20661f.C());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.Source
    public a1 timeout() {
        return this.f20661f.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(Source source, Inflater inflater) {
        this(l0.d(source), inflater);
        qc.q.i(source, "source");
        qc.q.i(inflater, "inflater");
    }
}
