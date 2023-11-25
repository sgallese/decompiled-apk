package y1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import qc.q;

/* compiled from: TextDecorationSpan.kt */
/* loaded from: classes.dex */
public final class n extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f26208a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f26209b;

    public n(boolean z10, boolean z11) {
        this.f26208a = z10;
        this.f26209b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        q.i(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f26208a);
        textPaint.setStrikeThruText(this.f26209b);
    }
}
