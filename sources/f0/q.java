package f0;

import j0.g3;
import j0.y2;

/* compiled from: Button.kt */
/* loaded from: classes.dex */
final class q implements f {

    /* renamed from: a  reason: collision with root package name */
    private final long f15003a;

    /* renamed from: b  reason: collision with root package name */
    private final long f15004b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15005c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15006d;

    public /* synthetic */ q(long j10, long j11, long j12, long j13, qc.h hVar) {
        this(j10, j11, j12, j13);
    }

    @Override // f0.f
    public g3<a1.p1> a(boolean z10, j0.l lVar, int i10) {
        long j10;
        lVar.e(-655254499);
        if (j0.n.K()) {
            j0.n.V(-655254499, i10, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:586)");
        }
        if (z10) {
            j10 = this.f15003a;
        } else {
            j10 = this.f15005c;
        }
        g3<a1.p1> m10 = y2.m(a1.p1.g(j10), lVar, 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return m10;
    }

    @Override // f0.f
    public g3<a1.p1> b(boolean z10, j0.l lVar, int i10) {
        long j10;
        lVar.e(-2133647540);
        if (j0.n.K()) {
            j0.n.V(-2133647540, i10, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:591)");
        }
        if (z10) {
            j10 = this.f15004b;
        } else {
            j10 = this.f15006d;
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
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (a1.p1.q(this.f15003a, qVar.f15003a) && a1.p1.q(this.f15004b, qVar.f15004b) && a1.p1.q(this.f15005c, qVar.f15005c) && a1.p1.q(this.f15006d, qVar.f15006d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((a1.p1.w(this.f15003a) * 31) + a1.p1.w(this.f15004b)) * 31) + a1.p1.w(this.f15005c)) * 31) + a1.p1.w(this.f15006d);
    }

    private q(long j10, long j11, long j12, long j13) {
        this.f15003a = j10;
        this.f15004b = j11;
        this.f15005c = j12;
        this.f15006d = j13;
    }
}
