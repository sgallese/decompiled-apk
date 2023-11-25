package fb;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: EmphasisSpan.java */
/* loaded from: classes4.dex */
public class e extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }
}
