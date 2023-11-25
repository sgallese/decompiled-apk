package fb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* compiled from: CodeBlockSpan.java */
/* loaded from: classes4.dex */
public class c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: f  reason: collision with root package name */
    private final db.c f15566f;

    /* renamed from: m  reason: collision with root package name */
    private final Rect f15567m = g.b();

    /* renamed from: p  reason: collision with root package name */
    private final Paint f15568p = g.a();

    public c(db.c cVar) {
        this.f15566f = cVar;
    }

    private void a(TextPaint textPaint) {
        this.f15566f.b(textPaint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        this.f15568p.setStyle(Paint.Style.FILL);
        this.f15568p.setColor(this.f15566f.o(paint));
        if (i11 > 0) {
            i17 = canvas.getWidth();
        } else {
            i10 -= canvas.getWidth();
            i17 = i10;
        }
        this.f15567m.set(i10, i12, i17, i14);
        canvas.drawRect(this.f15567m, this.f15568p);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f15566f.p();
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
