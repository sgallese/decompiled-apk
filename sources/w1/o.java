package w1;

import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: PaintExtensions.kt */
/* loaded from: classes.dex */
final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f25311a = new o();

    private o() {
    }

    public static final void a(Paint paint, CharSequence charSequence, int i10, int i11, Rect rect) {
        qc.q.i(paint, "paint");
        qc.q.i(charSequence, "text");
        qc.q.i(rect, "rect");
        paint.getTextBounds(charSequence, i10, i11, rect);
    }
}
