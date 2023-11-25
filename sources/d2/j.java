package d2;

import android.text.TextPaint;

/* compiled from: AndroidTextPaint.android.kt */
/* loaded from: classes.dex */
public final class j {
    public static final void a(TextPaint textPaint, float f10) {
        float k10;
        int d10;
        qc.q.i(textPaint, "<this>");
        if (!Float.isNaN(f10)) {
            k10 = vc.l.k(f10, 0.0f, 1.0f);
            d10 = sc.c.d(k10 * 255);
            textPaint.setAlpha(d10);
        }
    }
}
