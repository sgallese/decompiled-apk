package v1;

import g2.l;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextStyle.kt */
/* loaded from: classes.dex */
public final class l0 {

    /* compiled from: TextStyle.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24478a;

        static {
            int[] iArr = new int[j2.r.values().length];
            try {
                iArr[j2.r.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j2.r.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24478a = iArr;
        }
    }

    public static final z b(x xVar, w wVar) {
        if (xVar == null && wVar == null) {
            return null;
        }
        return c.a(xVar, wVar);
    }

    public static final k0 c(k0 k0Var, k0 k0Var2, float f10) {
        qc.q.i(k0Var, "start");
        qc.q.i(k0Var2, "stop");
        return new k0(c0.c(k0Var.M(), k0Var2.M(), f10), t.b(k0Var.L(), k0Var2.L(), f10));
    }

    public static final k0 d(k0 k0Var, j2.r rVar) {
        qc.q.i(k0Var, "style");
        qc.q.i(rVar, "direction");
        return new k0(c0.h(k0Var.y()), t.e(k0Var.v(), rVar), k0Var.w());
    }

    public static final int e(j2.r rVar, g2.l lVar) {
        boolean i10;
        qc.q.i(rVar, "layoutDirection");
        l.a aVar = g2.l.f16070b;
        int a10 = aVar.a();
        if (lVar == null) {
            i10 = false;
        } else {
            i10 = g2.l.i(lVar.l(), a10);
        }
        if (i10) {
            int i11 = a.f24478a[rVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return aVar.c();
                }
                throw new NoWhenBranchMatchedException();
            }
            return aVar.b();
        } else if (lVar == null) {
            int i12 = a.f24478a[rVar.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    return aVar.e();
                }
                throw new NoWhenBranchMatchedException();
            }
            return aVar.d();
        } else {
            return lVar.l();
        }
    }
}
