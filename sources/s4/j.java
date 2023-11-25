package s4;

import android.content.Context;
import androidx.compose.ui.platform.j0;
import b5.h;
import j0.n;
import j2.q;
import n1.f;
import vc.l;

/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final long f23027a = j2.b.f18972b.c(0, 0);

    public static final float a(long j10, float f10) {
        float k10;
        k10 = l.k(f10, j2.b.o(j10), j2.b.m(j10));
        return k10;
    }

    public static final float b(long j10, float f10) {
        float k10;
        k10 = l.k(f10, j2.b.p(j10), j2.b.n(j10));
        return k10;
    }

    public static final long c() {
        return f23027a;
    }

    public static final b5.h d(Object obj, j0.l lVar, int i10) {
        if (n.K()) {
            n.V(1151830858, i10, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        if (obj instanceof b5.h) {
            return (b5.h) obj;
        }
        return new h.a((Context) lVar.C(j0.g())).c(obj).b();
    }

    public static final long e(long j10) {
        int d10;
        int d11;
        d10 = sc.c.d(z0.l.i(j10));
        d11 = sc.c.d(z0.l.g(j10));
        return q.a(d10, d11);
    }

    public static final c5.h f(n1.f fVar) {
        boolean d10;
        f.a aVar = n1.f.f19964a;
        if (qc.q.d(fVar, aVar.a())) {
            d10 = true;
        } else {
            d10 = qc.q.d(fVar, aVar.b());
        }
        if (d10) {
            return c5.h.FIT;
        }
        return c5.h.FILL;
    }
}
