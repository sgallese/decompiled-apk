package y1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import qc.q;

/* compiled from: LetterSpacingSpanEm.kt */
/* loaded from: classes.dex */
public final class e extends MetricAffectingSpan {

    /* renamed from: f  reason: collision with root package name */
    private final float f26177f;

    public e(float f10) {
        this.f26177f = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        q.i(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f26177f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        q.i(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f26177f);
    }
}
