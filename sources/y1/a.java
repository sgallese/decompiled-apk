package y1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import qc.q;

/* compiled from: BaselineShiftSpan.kt */
/* loaded from: classes.dex */
public class a extends MetricAffectingSpan {

    /* renamed from: f  reason: collision with root package name */
    private final float f26174f;

    public a(float f10) {
        this.f26174f = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        q.i(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f26174f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        q.i(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f26174f);
    }
}
