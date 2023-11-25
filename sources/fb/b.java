package fb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: BulletListItemSpan.java */
/* loaded from: classes4.dex */
public class b implements LeadingMarginSpan {

    /* renamed from: s  reason: collision with root package name */
    private static final boolean f15560s;

    /* renamed from: f  reason: collision with root package name */
    private db.c f15561f;

    /* renamed from: m  reason: collision with root package name */
    private final Paint f15562m = g.a();

    /* renamed from: p  reason: collision with root package name */
    private final RectF f15563p = g.c();

    /* renamed from: q  reason: collision with root package name */
    private final Rect f15564q = g.b();

    /* renamed from: r  reason: collision with root package name */
    private final int f15565r;

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (24 != i10 && 25 != i10) {
            z10 = false;
        } else {
            z10 = true;
        }
        f15560s = z10;
    }

    public b(db.c cVar, int i10) {
        this.f15561f = cVar;
        this.f15565r = i10;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        int i18;
        Paint.Style style;
        int i19;
        if (z10 && qb.c.b(i15, charSequence, this)) {
            this.f15562m.set(paint);
            this.f15561f.h(this.f15562m);
            int save = canvas.save();
            try {
                int k10 = this.f15561f.k();
                int m10 = this.f15561f.m((int) ((this.f15562m.descent() - this.f15562m.ascent()) + 0.5f));
                int i20 = (k10 - m10) / 2;
                if (f15560s) {
                    if (i11 < 0) {
                        i19 = i10 - (layout.getWidth() - (k10 * this.f15565r));
                    } else {
                        i19 = (k10 * this.f15565r) - i10;
                    }
                    int i21 = i10 + (i20 * i11);
                    int i22 = (i11 * m10) + i21;
                    int i23 = i11 * i19;
                    i17 = Math.min(i21, i22) + i23;
                    i18 = Math.max(i21, i22) + i23;
                } else {
                    if (i11 <= 0) {
                        i10 -= k10;
                    }
                    i17 = i10 + i20;
                    i18 = i17 + m10;
                }
                int descent = (i13 + ((int) (((this.f15562m.descent() + this.f15562m.ascent()) / 2.0f) + 0.5f))) - (m10 / 2);
                int i24 = m10 + descent;
                int i25 = this.f15565r;
                if (i25 != 0 && i25 != 1) {
                    this.f15564q.set(i17, descent, i18, i24);
                    this.f15562m.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.f15564q, this.f15562m);
                }
                this.f15563p.set(i17, descent, i18, i24);
                if (this.f15565r == 0) {
                    style = Paint.Style.FILL;
                } else {
                    style = Paint.Style.STROKE;
                }
                this.f15562m.setStyle(style);
                canvas.drawOval(this.f15563p, this.f15562m);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f15561f.k();
    }
}
