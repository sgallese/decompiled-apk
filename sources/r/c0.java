package r;

import a1.p1;
import j0.g3;
import s.i1;
import s.z0;

/* compiled from: SingleValueAnimation.kt */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final z0<p1> f21857a = s.k.g(0.0f, 0.0f, null, 7, null);

    public static final g3<p1> a(long j10, s.j<p1> jVar, String str, pc.l<? super p1, dc.w> lVar, j0.l lVar2, int i10, int i11) {
        s.j<p1> jVar2;
        String str2;
        pc.l<? super p1, dc.w> lVar3;
        lVar2.e(-451899108);
        if ((i11 & 2) != 0) {
            jVar2 = f21857a;
        } else {
            jVar2 = jVar;
        }
        if ((i11 & 4) != 0) {
            str2 = "ColorAnimation";
        } else {
            str2 = str;
        }
        if ((i11 & 8) != 0) {
            lVar3 = null;
        } else {
            lVar3 = lVar;
        }
        if (j0.n.K()) {
            j0.n.V(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:56)");
        }
        b1.c t10 = p1.t(j10);
        lVar2.e(1157296644);
        boolean Q = lVar2.Q(t10);
        i1<p1, s.p> f10 = lVar2.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = n.a(p1.f146b).invoke(p1.t(j10));
            lVar2.J(f10);
        }
        lVar2.N();
        int i12 = i10 << 6;
        g3<p1> e10 = s.c.e(p1.g(j10), (i1) f10, jVar2, null, str2, lVar3, lVar2, (i10 & 14) | 576 | (57344 & i12) | (i12 & 458752), 8);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar2.N();
        return e10;
    }
}
