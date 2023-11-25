package a2;

import android.graphics.Typeface;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: PlatformTypefaces.kt */
/* loaded from: classes.dex */
final class n0 implements k0 {
    private final Typeface c(String str, c0 c0Var, int i10) {
        boolean z10;
        boolean z11 = false;
        if (x.f(i10, x.f339b.b()) && qc.q.d(c0Var, c0.f239m.e())) {
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                Typeface typeface = Typeface.DEFAULT;
                qc.q.h(typeface, "DEFAULT");
                return typeface;
            }
        }
        int c10 = f.c(c0Var, i10);
        if (str == null || str.length() == 0) {
            z11 = true;
        }
        if (z11) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(c10);
            qc.q.h(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, c10);
        qc.q.h(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    private final Typeface d(String str, c0 c0Var, int i10) {
        boolean z10;
        boolean z11 = true;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        Typeface c10 = c(str, c0Var, i10);
        if (qc.q.d(c10, Typeface.create(Typeface.DEFAULT, f.c(c0Var, i10))) || qc.q.d(c10, c(null, c0Var, i10))) {
            z11 = false;
        }
        if (!z11) {
            return null;
        }
        return c10;
    }

    @Override // a2.k0
    public Typeface a(e0 e0Var, c0 c0Var, int i10) {
        qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(c0Var, "fontWeight");
        Typeface d10 = d(o0.b(e0Var.j(), c0Var), c0Var, i10);
        if (d10 == null) {
            return c(e0Var.j(), c0Var, i10);
        }
        return d10;
    }

    @Override // a2.k0
    public Typeface b(c0 c0Var, int i10) {
        qc.q.i(c0Var, "fontWeight");
        return c(null, c0Var, i10);
    }
}
