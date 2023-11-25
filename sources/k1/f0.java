package k1;

import java.util.List;

/* compiled from: InternalPointerInput.kt */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f19173a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19174b;

    /* renamed from: c  reason: collision with root package name */
    private final long f19175c;

    /* renamed from: d  reason: collision with root package name */
    private final long f19176d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f19177e;

    /* renamed from: f  reason: collision with root package name */
    private final float f19178f;

    /* renamed from: g  reason: collision with root package name */
    private final int f19179g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f19180h;

    /* renamed from: i  reason: collision with root package name */
    private final List<h> f19181i;

    /* renamed from: j  reason: collision with root package name */
    private final long f19182j;

    public /* synthetic */ f0(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, qc.h hVar) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14);
    }

    public final boolean a() {
        return this.f19177e;
    }

    public final List<h> b() {
        return this.f19181i;
    }

    public final long c() {
        return this.f19173a;
    }

    public final boolean d() {
        return this.f19180h;
    }

    public final long e() {
        return this.f19176d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (b0.d(this.f19173a, f0Var.f19173a) && this.f19174b == f0Var.f19174b && z0.f.l(this.f19175c, f0Var.f19175c) && z0.f.l(this.f19176d, f0Var.f19176d) && this.f19177e == f0Var.f19177e && Float.compare(this.f19178f, f0Var.f19178f) == 0 && q0.g(this.f19179g, f0Var.f19179g) && this.f19180h == f0Var.f19180h && qc.q.d(this.f19181i, f0Var.f19181i) && z0.f.l(this.f19182j, f0Var.f19182j)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f19175c;
    }

    public final float g() {
        return this.f19178f;
    }

    public final long h() {
        return this.f19182j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int e10 = ((((((b0.e(this.f19173a) * 31) + r.x.a(this.f19174b)) * 31) + z0.f.q(this.f19175c)) * 31) + z0.f.q(this.f19176d)) * 31;
        boolean z10 = this.f19177e;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int floatToIntBits = (((((e10 + i11) * 31) + Float.floatToIntBits(this.f19178f)) * 31) + q0.h(this.f19179g)) * 31;
        boolean z11 = this.f19180h;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return ((((floatToIntBits + i10) * 31) + this.f19181i.hashCode()) * 31) + z0.f.q(this.f19182j);
    }

    public final int i() {
        return this.f19179g;
    }

    public final long j() {
        return this.f19174b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) b0.f(this.f19173a)) + ", uptime=" + this.f19174b + ", positionOnScreen=" + ((Object) z0.f.v(this.f19175c)) + ", position=" + ((Object) z0.f.v(this.f19176d)) + ", down=" + this.f19177e + ", pressure=" + this.f19178f + ", type=" + ((Object) q0.i(this.f19179g)) + ", issuesEnterExit=" + this.f19180h + ", historical=" + this.f19181i + ", scrollDelta=" + ((Object) z0.f.v(this.f19182j)) + ')';
    }

    private f0(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List<h> list, long j14) {
        qc.q.i(list, "historical");
        this.f19173a = j10;
        this.f19174b = j11;
        this.f19175c = j12;
        this.f19176d = j13;
        this.f19177e = z10;
        this.f19178f = f10;
        this.f19179g = i10;
        this.f19180h = z11;
        this.f19181i = list;
        this.f19182j = j14;
    }
}
