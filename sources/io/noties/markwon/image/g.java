package io.noties.markwon.image;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;

/* compiled from: AsyncDrawableSpan.java */
/* loaded from: classes4.dex */
public class g extends ReplacementSpan {

    /* renamed from: f  reason: collision with root package name */
    private final db.c f17214f;

    /* renamed from: m  reason: collision with root package name */
    private final a f17215m;

    /* renamed from: p  reason: collision with root package name */
    private final int f17216p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f17217q;

    public g(db.c cVar, a aVar, int i10, boolean z10) {
        this.f17214f = cVar;
        this.f17215m = aVar;
        this.f17216p = i10;
        this.f17217q = z10;
    }

    private static float b(int i10, int i11, Paint paint) {
        return (int) ((i10 + ((i11 - i10) / 2)) - (((paint.descent() + paint.ascent()) / 2.0f) + 0.5f));
    }

    public a a() {
        return this.f17215m;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15;
        this.f17215m.h(qb.d.a(canvas, charSequence), paint.getTextSize());
        a aVar = this.f17215m;
        if (aVar.f()) {
            int i16 = i14 - aVar.getBounds().bottom;
            int save = canvas.save();
            try {
                int i17 = this.f17216p;
                if (2 == i17) {
                    i15 = ((i14 - i12) - aVar.getBounds().height()) / 2;
                } else {
                    if (1 == i17) {
                        i15 = paint.getFontMetricsInt().descent;
                    }
                    canvas.translate(f10, i16);
                    aVar.draw(canvas);
                    return;
                }
                i16 -= i15;
                canvas.translate(f10, i16);
                aVar.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(save);
            }
        }
        float b10 = b(i12, i14, paint);
        if (this.f17217q) {
            this.f17214f.f(paint);
        }
        canvas.drawText(charSequence, i10, i11, f10, b10, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f17215m.f()) {
            Rect bounds = this.f17215m.getBounds();
            if (fontMetricsInt != null) {
                int i12 = -bounds.bottom;
                fontMetricsInt.ascent = i12;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = i12;
                fontMetricsInt.bottom = 0;
            }
            return bounds.right;
        }
        if (this.f17217q) {
            this.f17214f.f(paint);
        }
        return (int) (paint.measureText(charSequence, i10, i11) + 0.5f);
    }
}
