package fb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* compiled from: HeadingSpan.java */
/* loaded from: classes4.dex */
public class f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: f  reason: collision with root package name */
    private final db.c f15570f;

    /* renamed from: m  reason: collision with root package name */
    private final Rect f15571m = g.b();

    /* renamed from: p  reason: collision with root package name */
    private final Paint f15572p = g.a();

    /* renamed from: q  reason: collision with root package name */
    private final int f15573q;

    public f(db.c cVar, int i10) {
        this.f15570f = cVar;
        this.f15573q = i10;
    }

    private void a(TextPaint textPaint) {
        this.f15570f.e(textPaint, this.f15573q);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        int i18 = this.f15573q;
        if ((i18 == 1 || i18 == 2) && qb.c.a(i16, charSequence, this)) {
            this.f15572p.set(paint);
            this.f15570f.d(this.f15572p);
            float strokeWidth = this.f15572p.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i19 = (int) ((i14 - strokeWidth) + 0.5f);
                if (i11 > 0) {
                    i17 = canvas.getWidth();
                } else {
                    i17 = i10;
                    i10 -= canvas.getWidth();
                }
                this.f15571m.set(i10, i19, i17, i14);
                canvas.drawRect(this.f15571m, this.f15572p);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
