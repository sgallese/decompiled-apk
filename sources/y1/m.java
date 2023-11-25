package y1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import qc.q;

/* compiled from: SkewXSpan.kt */
/* loaded from: classes.dex */
public class m extends MetricAffectingSpan {

    /* renamed from: f  reason: collision with root package name */
    private final float f26207f;

    public m(float f10) {
        this.f26207f = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        q.i(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f26207f + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        q.i(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f26207f + textPaint.getTextSkewX());
    }
}
