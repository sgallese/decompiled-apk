package com.habitrpg.common.habitica.extensions;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import dc.w;
import qc.q;

/* compiled from: TextViewExtensions.kt */
/* loaded from: classes4.dex */
public final class HabiticaClickableSpan extends ClickableSpan {
    private final pc.a<w> onClickAction;

    public HabiticaClickableSpan(pc.a<w> aVar) {
        q.i(aVar, "onClickAction");
        this.onClickAction = aVar;
    }

    public final pc.a<w> getOnClickAction() {
        return this.onClickAction;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        q.i(view, "widget");
        this.onClickAction.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        q.i(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
