package y1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import qc.q;

/* compiled from: LetterSpacingSpanPx.kt */
/* loaded from: classes.dex */
public final class f extends MetricAffectingSpan {

    /* renamed from: f  reason: collision with root package name */
    private final float f26178f;

    public f(float f10) {
        this.f26178f = f10;
    }

    private final void a(TextPaint textPaint) {
        boolean z10;
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            textPaint.setLetterSpacing(this.f26178f / textSize);
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        q.i(textPaint, "textPaint");
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        q.i(textPaint, "textPaint");
        a(textPaint);
    }
}
