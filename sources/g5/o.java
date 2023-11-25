package g5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableUtils.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f16199a = new o();

    private o() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        if (bitmap.getConfig() == a.e(config)) {
            return true;
        }
        return false;
    }

    private final boolean c(boolean z10, Bitmap bitmap, c5.i iVar, c5.h hVar) {
        int A;
        int A2;
        if (z10) {
            return true;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (c5.b.a(iVar)) {
            A = bitmap.getWidth();
        } else {
            A = l.A(iVar.b(), hVar);
        }
        if (c5.b.a(iVar)) {
            A2 = bitmap.getHeight();
        } else {
            A2 = l.A(iVar.a(), hVar);
        }
        if (t4.h.c(width, height, A, A2, hVar) == 1.0d) {
            return true;
        }
        return false;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, c5.i iVar, c5.h hVar, boolean z10) {
        int A;
        int A2;
        int c10;
        int c11;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z10, bitmap, iVar, hVar)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int p10 = l.p(mutate);
        int i10 = 512;
        if (p10 <= 0) {
            p10 = 512;
        }
        int i11 = l.i(mutate);
        if (i11 > 0) {
            i10 = i11;
        }
        if (c5.b.a(iVar)) {
            A = p10;
        } else {
            A = l.A(iVar.b(), hVar);
        }
        if (c5.b.a(iVar)) {
            A2 = i10;
        } else {
            A2 = l.A(iVar.a(), hVar);
        }
        double c12 = t4.h.c(p10, i10, A, A2, hVar);
        c10 = sc.c.c(p10 * c12);
        c11 = sc.c.c(c12 * i10);
        Bitmap createBitmap = Bitmap.createBitmap(c10, c11, a.e(config));
        qc.q.h(createBitmap, "createBitmap(width, height, config)");
        Rect bounds = mutate.getBounds();
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        mutate.setBounds(0, 0, c10, c11);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i12, i13, i14, i15);
        return createBitmap;
    }
}
