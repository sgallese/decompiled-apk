package com.habitrpg.common.habitica.extensions;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import dc.w;
import pc.l;
import qc.q;

/* compiled from: TextViewExtensions.kt */
/* loaded from: classes4.dex */
public final class TextViewExtensionsKt {
    public static final void handleUrlClicks(TextView textView, l<? super String, w> lVar) {
        q.i(textView, "<this>");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(textView.getText());
        Object[] spans = valueOf.getSpans(0, valueOf.length(), URLSpan.class);
        q.h(spans, "getSpans(...)");
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            valueOf.setSpan(new HabiticaClickableSpan(new TextViewExtensionsKt$handleUrlClicks$1$1$1(lVar, uRLSpan)), valueOf.getSpanStart(uRLSpan), valueOf.getSpanEnd(uRLSpan), 17);
            valueOf.removeSpan(uRLSpan);
        }
        textView.setText(valueOf);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static /* synthetic */ void handleUrlClicks$default(TextView textView, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        handleUrlClicks(textView, lVar);
    }
}
