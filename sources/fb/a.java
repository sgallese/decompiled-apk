package fb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: BlockQuoteSpan.java */
/* loaded from: classes4.dex */
public class a implements LeadingMarginSpan {

    /* renamed from: f  reason: collision with root package name */
    private final db.c f15557f;

    /* renamed from: m  reason: collision with root package name */
    private final Rect f15558m = g.b();

    /* renamed from: p  reason: collision with root package name */
    private final Paint f15559p = g.a();

    public a(db.c cVar) {
        this.f15557f = cVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int l10 = this.f15557f.l();
        this.f15559p.set(paint);
        this.f15557f.a(this.f15559p);
        int i17 = i11 * l10;
        int i18 = i10 + i17;
        int i19 = i17 + i18;
        this.f15558m.set(Math.min(i18, i19), i12, Math.max(i18, i19), i14);
        canvas.drawRect(this.f15558m, this.f15559p);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f15557f.k();
    }
}
