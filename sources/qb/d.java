package qb;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;
import fb.j;
import fb.k;

/* compiled from: SpanUtils.java */
/* loaded from: classes4.dex */
public abstract class d {
    public static int a(Canvas canvas, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Layout b10 = j.b(spanned);
            if (b10 != null) {
                return b10.getWidth();
            }
            TextView c10 = k.c(spanned);
            if (c10 != null) {
                return (c10.getWidth() - c10.getPaddingLeft()) - c10.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }
}
