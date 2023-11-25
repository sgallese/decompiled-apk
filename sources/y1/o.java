package y1;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import qc.q;

/* compiled from: TypefaceSpan.kt */
/* loaded from: classes.dex */
public final class o extends MetricAffectingSpan {

    /* renamed from: f  reason: collision with root package name */
    private final Typeface f26210f;

    public o(Typeface typeface) {
        q.i(typeface, "typeface");
        this.f26210f = typeface;
    }

    private final void a(Paint paint) {
        paint.setTypeface(this.f26210f);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        q.i(textPaint, "ds");
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        q.i(textPaint, "paint");
        a(textPaint);
    }
}
