package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: EmojiSpan.java */
/* loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* renamed from: m  reason: collision with root package name */
    private final p f4424m;

    /* renamed from: f  reason: collision with root package name */
    private final Paint.FontMetricsInt f4423f = new Paint.FontMetricsInt();

    /* renamed from: p  reason: collision with root package name */
    private short f4425p = -1;

    /* renamed from: q  reason: collision with root package name */
    private short f4426q = -1;

    /* renamed from: r  reason: collision with root package name */
    private float f4427r = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(p pVar) {
        androidx.core.util.i.h(pVar, "rasterizer cannot be null");
        this.f4424m = pVar;
    }

    public final p a() {
        return this.f4424m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.f4425p;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f4423f);
        Paint.FontMetricsInt fontMetricsInt2 = this.f4423f;
        this.f4427r = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f4424m.e();
        this.f4426q = (short) (this.f4424m.e() * this.f4427r);
        short i12 = (short) (this.f4424m.i() * this.f4427r);
        this.f4425p = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f4423f;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
