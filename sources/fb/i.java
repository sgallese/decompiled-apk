package fb;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: StrongEmphasisSpan.java */
/* loaded from: classes4.dex */
public class i extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }
}
