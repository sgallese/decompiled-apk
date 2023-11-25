package v1;

import a1.e4;
import java.util.List;

/* compiled from: TextLayoutResult.kt */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final f0 f24448a;

    /* renamed from: b  reason: collision with root package name */
    private final h f24449b;

    /* renamed from: c  reason: collision with root package name */
    private final long f24450c;

    /* renamed from: d  reason: collision with root package name */
    private final float f24451d;

    /* renamed from: e  reason: collision with root package name */
    private final float f24452e;

    /* renamed from: f  reason: collision with root package name */
    private final List<z0.h> f24453f;

    public /* synthetic */ g0(f0 f0Var, h hVar, long j10, qc.h hVar2) {
        this(f0Var, hVar, j10);
    }

    public static /* synthetic */ int o(g0 g0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return g0Var.n(i10, z10);
    }

    public final long A() {
        return this.f24450c;
    }

    public final long B(int i10) {
        return this.f24449b.z(i10);
    }

    public final g0 a(f0 f0Var, long j10) {
        qc.q.i(f0Var, "layoutInput");
        return new g0(f0Var, this.f24449b, j10, null);
    }

    public final g2.i b(int i10) {
        return this.f24449b.b(i10);
    }

    public final z0.h c(int i10) {
        return this.f24449b.c(i10);
    }

    public final z0.h d(int i10) {
        return this.f24449b.d(i10);
    }

    public final boolean e() {
        if (!this.f24449b.e() && j2.p.f(this.f24450c) >= this.f24449b.g()) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (!qc.q.d(this.f24448a, g0Var.f24448a) || !qc.q.d(this.f24449b, g0Var.f24449b) || !j2.p.e(this.f24450c, g0Var.f24450c)) {
            return false;
        }
        if (this.f24451d == g0Var.f24451d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f24452e == g0Var.f24452e) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && qc.q.d(this.f24453f, g0Var.f24453f)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (j2.p.g(this.f24450c) < this.f24449b.y()) {
            return true;
        }
        return false;
    }

    public final float g() {
        return this.f24451d;
    }

    public final boolean h() {
        if (!f() && !e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((this.f24448a.hashCode() * 31) + this.f24449b.hashCode()) * 31) + j2.p.h(this.f24450c)) * 31) + Float.floatToIntBits(this.f24451d)) * 31) + Float.floatToIntBits(this.f24452e)) * 31) + this.f24453f.hashCode();
    }

    public final float i(int i10, boolean z10) {
        return this.f24449b.h(i10, z10);
    }

    public final float j() {
        return this.f24452e;
    }

    public final f0 k() {
        return this.f24448a;
    }

    public final float l(int i10) {
        return this.f24449b.k(i10);
    }

    public final int m() {
        return this.f24449b.l();
    }

    public final int n(int i10, boolean z10) {
        return this.f24449b.m(i10, z10);
    }

    public final int p(int i10) {
        return this.f24449b.n(i10);
    }

    public final int q(float f10) {
        return this.f24449b.o(f10);
    }

    public final float r(int i10) {
        return this.f24449b.p(i10);
    }

    public final float s(int i10) {
        return this.f24449b.q(i10);
    }

    public final int t(int i10) {
        return this.f24449b.r(i10);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f24448a + ", multiParagraph=" + this.f24449b + ", size=" + ((Object) j2.p.i(this.f24450c)) + ", firstBaseline=" + this.f24451d + ", lastBaseline=" + this.f24452e + ", placeholderRects=" + this.f24453f + ')';
    }

    public final float u(int i10) {
        return this.f24449b.s(i10);
    }

    public final h v() {
        return this.f24449b;
    }

    public final int w(long j10) {
        return this.f24449b.t(j10);
    }

    public final g2.i x(int i10) {
        return this.f24449b.u(i10);
    }

    public final e4 y(int i10, int i11) {
        return this.f24449b.w(i10, i11);
    }

    public final List<z0.h> z() {
        return this.f24453f;
    }

    private g0(f0 f0Var, h hVar, long j10) {
        qc.q.i(f0Var, "layoutInput");
        qc.q.i(hVar, "multiParagraph");
        this.f24448a = f0Var;
        this.f24449b = hVar;
        this.f24450c = j10;
        this.f24451d = hVar.f();
        this.f24452e = hVar.j();
        this.f24453f = hVar.x();
    }
}
