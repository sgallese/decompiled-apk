package fb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: ThematicBreakSpan.java */
/* loaded from: classes4.dex */
public class l implements LeadingMarginSpan {

    /* renamed from: f  reason: collision with root package name */
    private final db.c f15583f;

    /* renamed from: m  reason: collision with root package name */
    private final Rect f15584m = g.b();

    /* renamed from: p  reason: collision with root package name */
    private final Paint f15585p = g.a();

    public l(db.c cVar) {
        this.f15583f = cVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        int i18 = i12 + ((i14 - i12) / 2);
        this.f15585p.set(paint);
        this.f15583f.i(this.f15585p);
        int strokeWidth = (int) ((((int) (this.f15585p.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i11 > 0) {
            i17 = canvas.getWidth();
        } else {
            i17 = i10;
            i10 -= canvas.getWidth();
        }
        this.f15584m.set(i10, i18 - strokeWidth, i17, i18 + strokeWidth);
        canvas.drawRect(this.f15584m, this.f15585p);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}
