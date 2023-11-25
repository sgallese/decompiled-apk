package y1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import qc.q;

/* compiled from: LineHeightSpan.kt */
/* loaded from: classes.dex */
public final class g implements LineHeightSpan {

    /* renamed from: f  reason: collision with root package name */
    private final float f26179f;

    public g(float f10) {
        this.f26179f = f10;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        q.i(charSequence, "text");
        q.i(fontMetricsInt, "fontMetricsInt");
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.f26179f));
    }
}
