package y1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import qc.q;

/* compiled from: ShadowSpan.kt */
/* loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    private final int f26203a;

    /* renamed from: b  reason: collision with root package name */
    private final float f26204b;

    /* renamed from: c  reason: collision with root package name */
    private final float f26205c;

    /* renamed from: d  reason: collision with root package name */
    private final float f26206d;

    public l(int i10, float f10, float f11, float f12) {
        this.f26203a = i10;
        this.f26204b = f10;
        this.f26205c = f11;
        this.f26206d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        q.i(textPaint, "tp");
        textPaint.setShadowLayer(this.f26206d, this.f26204b, this.f26205c, this.f26203a);
    }
}
