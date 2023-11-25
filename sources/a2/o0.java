package a2;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: PlatformTypefaces.kt */
/* loaded from: classes.dex */
public final class o0 {
    public static final k0 a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new m0();
        }
        return new n0();
    }

    public static final String b(String str, c0 c0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(c0Var, "fontWeight");
        int v10 = c0Var.v() / 100;
        boolean z13 = true;
        if (v10 >= 0 && v10 < 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return str + "-thin";
        }
        if (2 <= v10 && v10 < 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return str + "-light";
        } else if (v10 != 4) {
            if (v10 == 5) {
                return str + "-medium";
            }
            if (6 <= v10 && v10 < 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                if (8 > v10 || v10 >= 11) {
                    z13 = false;
                }
                if (z13) {
                    return str + "-black";
                }
                return str;
            }
            return str;
        } else {
            return str;
        }
    }

    public static final Typeface c(Typeface typeface, b0 b0Var, Context context) {
        qc.q.i(b0Var, "variationSettings");
        qc.q.i(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            return v0.f335a.a(typeface, b0Var, context);
        }
        return typeface;
    }
}
