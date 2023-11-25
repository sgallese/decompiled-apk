package f0;

import j0.g3;
import j0.y2;

/* compiled from: Switch.kt */
/* loaded from: classes.dex */
final class v implements t1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f15101a;

    /* renamed from: b  reason: collision with root package name */
    private final long f15102b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15103c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15104d;

    /* renamed from: e  reason: collision with root package name */
    private final long f15105e;

    /* renamed from: f  reason: collision with root package name */
    private final long f15106f;

    /* renamed from: g  reason: collision with root package name */
    private final long f15107g;

    /* renamed from: h  reason: collision with root package name */
    private final long f15108h;

    public /* synthetic */ v(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, qc.h hVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17);
    }

    @Override // f0.t1
    public g3<a1.p1> a(boolean z10, boolean z11, j0.l lVar, int i10) {
        long j10;
        lVar.e(-66424183);
        if (j0.n.K()) {
            j0.n.V(-66424183, i10, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:366)");
        }
        if (z10) {
            if (z11) {
                j10 = this.f15101a;
            } else {
                j10 = this.f15103c;
            }
        } else if (z11) {
            j10 = this.f15105e;
        } else {
            j10 = this.f15107g;
        }
        g3<a1.p1> m10 = y2.m(a1.p1.g(j10), lVar, 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return m10;
    }

    @Override // f0.t1
    public g3<a1.p1> b(boolean z10, boolean z11, j0.l lVar, int i10) {
        long j10;
        lVar.e(-1176343362);
        if (j0.n.K()) {
            j0.n.V(-1176343362, i10, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:377)");
        }
        if (z10) {
            if (z11) {
                j10 = this.f15102b;
            } else {
                j10 = this.f15104d;
            }
        } else if (z11) {
            j10 = this.f15106f;
        } else {
            j10 = this.f15108h;
        }
        g3<a1.p1> m10 = y2.m(a1.p1.g(j10), lVar, 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return m10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (a1.p1.q(this.f15101a, vVar.f15101a) && a1.p1.q(this.f15102b, vVar.f15102b) && a1.p1.q(this.f15103c, vVar.f15103c) && a1.p1.q(this.f15104d, vVar.f15104d) && a1.p1.q(this.f15105e, vVar.f15105e) && a1.p1.q(this.f15106f, vVar.f15106f) && a1.p1.q(this.f15107g, vVar.f15107g) && a1.p1.q(this.f15108h, vVar.f15108h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((a1.p1.w(this.f15101a) * 31) + a1.p1.w(this.f15102b)) * 31) + a1.p1.w(this.f15103c)) * 31) + a1.p1.w(this.f15104d)) * 31) + a1.p1.w(this.f15105e)) * 31) + a1.p1.w(this.f15106f)) * 31) + a1.p1.w(this.f15107g)) * 31) + a1.p1.w(this.f15108h);
    }

    private v(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f15101a = j10;
        this.f15102b = j11;
        this.f15103c = j12;
        this.f15104d = j13;
        this.f15105e = j14;
        this.f15106f = j15;
        this.f15107g = j16;
        this.f15108h = j17;
    }
}
