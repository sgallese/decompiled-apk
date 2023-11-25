package fb;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: CodeSpan.java */
/* loaded from: classes4.dex */
public class d extends MetricAffectingSpan {

    /* renamed from: f  reason: collision with root package name */
    private final db.c f15569f;

    public d(db.c cVar) {
        this.f15569f = cVar;
    }

    private void a(TextPaint textPaint) {
        this.f15569f.c(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
        textPaint.bgColor = this.f15569f.n(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
