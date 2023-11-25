package y1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import qc.q;

/* compiled from: FontFeatureSpan.kt */
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: f  reason: collision with root package name */
    private final String f26175f;

    public b(String str) {
        q.i(str, "fontFeatureSettings");
        this.f26175f = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        q.i(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f26175f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        q.i(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f26175f);
    }
}
