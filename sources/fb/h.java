package fb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;

/* compiled from: OrderedListItemSpan.java */
/* loaded from: classes4.dex */
public class h implements LeadingMarginSpan {

    /* renamed from: f  reason: collision with root package name */
    private final db.c f15577f;

    /* renamed from: m  reason: collision with root package name */
    private final String f15578m;

    /* renamed from: p  reason: collision with root package name */
    private final Paint f15579p = g.a();

    /* renamed from: q  reason: collision with root package name */
    private int f15580q;

    public h(db.c cVar, String str) {
        this.f15577f = cVar;
        this.f15578m = str;
    }

    public static void a(TextView textView, CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return;
        }
        h[] hVarArr = (h[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), h.class);
        if (hVarArr != null) {
            TextPaint paint = textView.getPaint();
            for (h hVar : hVarArr) {
                hVar.f15580q = (int) (paint.measureText(hVar.f15578m) + 0.5f);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        if (z10 && qb.c.b(i15, charSequence, this)) {
            this.f15579p.set(paint);
            this.f15577f.h(this.f15579p);
            int measureText = (int) (this.f15579p.measureText(this.f15578m) + 0.5f);
            int k10 = this.f15577f.k();
            if (measureText > k10) {
                this.f15580q = measureText;
                k10 = measureText;
            } else {
                this.f15580q = 0;
            }
            if (i11 > 0) {
                i17 = (i10 + (k10 * i11)) - measureText;
            } else {
                i17 = i10 + (i11 * k10) + (k10 - measureText);
            }
            canvas.drawText(this.f15578m, i17, i13, this.f15579p);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return Math.max(this.f15580q, this.f15577f.k());
    }
}
