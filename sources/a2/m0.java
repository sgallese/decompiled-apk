package a2;

import a2.x;
import android.graphics.Typeface;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: PlatformTypefaces.kt */
/* loaded from: classes.dex */
final class m0 implements k0 {
    private final Typeface c(String str, c0 c0Var, int i10) {
        Typeface create;
        Typeface create2;
        boolean z10;
        x.a aVar = x.f339b;
        if (x.f(i10, aVar.b()) && qc.q.d(c0Var, c0.f239m.e())) {
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
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        create2 = Typeface.create(create, c0Var.v(), x.f(i10, aVar.a()));
        qc.q.h(create2, "create(\n            fami…ontStyle.Italic\n        )");
        return create2;
    }

    @Override // a2.k0
    public Typeface a(e0 e0Var, c0 c0Var, int i10) {
        qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(c0Var, "fontWeight");
        return c(e0Var.j(), c0Var, i10);
    }

    @Override // a2.k0
    public Typeface b(c0 c0Var, int i10) {
        qc.q.i(c0Var, "fontWeight");
        return c(null, c0Var, i10);
    }
}
