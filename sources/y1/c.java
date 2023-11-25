package y1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import qc.q;
import w1.o1;

/* compiled from: IndentationFixSpan.kt */
/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (layout != null && paint != null) {
            int lineForOffset = layout.getLineForOffset(i15);
            boolean z11 = true;
            if (lineForOffset == layout.getLineCount() - 1 && o1.l(layout, lineForOffset)) {
                float a10 = d.a(layout, lineForOffset, paint) + d.c(layout, lineForOffset, paint);
                if (a10 != 0.0f) {
                    z11 = false;
                }
                if (!z11) {
                    q.f(canvas);
                    canvas.translate(a10, 0.0f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}
