package a1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* compiled from: AndroidImageBitmap.android.kt */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final z0 f221a = new z0();

    private z0() {
    }

    public static final b1.c a(Bitmap bitmap) {
        ColorSpace colorSpace;
        b1.c b10;
        qc.q.i(bitmap, "<this>");
        colorSpace = bitmap.getColorSpace();
        if (colorSpace == null || (b10 = h0.b(colorSpace)) == null) {
            return b1.g.f7641a.w();
        }
        return b10;
    }

    public static final Bitmap b(int i10, int i11, int i12, boolean z10, b1.c cVar) {
        Bitmap createBitmap;
        qc.q.i(cVar, "colorSpace");
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, l0.d(i12), z10, h0.a(cVar));
        qc.q.h(createBitmap, "createBitmap(\n          …oidColorSpace()\n        )");
        return createBitmap;
    }
}
