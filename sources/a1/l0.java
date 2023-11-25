package a1;

import a1.u3;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;

/* compiled from: AndroidImageBitmap.android.kt */
/* loaded from: classes.dex */
public final class l0 {
    public static final t3 a(int i10, int i11, int i12, boolean z10, b1.c cVar) {
        Bitmap createBitmap;
        qc.q.i(cVar, "colorSpace");
        Bitmap.Config d10 = d(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = z0.b(i10, i11, i12, z10, cVar);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, d10);
            qc.q.h(createBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            createBitmap.setHasAlpha(z10);
        }
        return new i0(createBitmap);
    }

    public static final Bitmap b(t3 t3Var) {
        qc.q.i(t3Var, "<this>");
        if (t3Var instanceof i0) {
            return ((i0) t3Var).c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final t3 c(Bitmap bitmap) {
        qc.q.i(bitmap, "<this>");
        return new i0(bitmap);
    }

    public static final Bitmap.Config d(int i10) {
        Bitmap.Config config;
        Bitmap.Config config2;
        u3.a aVar = u3.f198b;
        if (u3.i(i10, aVar.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (u3.i(i10, aVar.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (u3.i(i10, aVar.e())) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && u3.i(i10, aVar.c())) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        } else if (i11 >= 26 && u3.i(i10, aVar.d())) {
            config = Bitmap.Config.HARDWARE;
            return config;
        } else {
            return Bitmap.Config.ARGB_8888;
        }
    }

    public static final int e(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        qc.q.i(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return u3.f198b.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return u3.f198b.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return u3.f198b.b();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                return u3.f198b.c();
            }
        }
        if (i10 >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return u3.f198b.d();
            }
        }
        return u3.f198b.b();
    }
}
