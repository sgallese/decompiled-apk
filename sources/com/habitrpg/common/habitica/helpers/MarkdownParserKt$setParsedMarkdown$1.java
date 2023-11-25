package com.habitrpg.common.habitica.helpers;

import android.content.Context;
import android.widget.TextView;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MarkdownParser.kt */
/* loaded from: classes4.dex */
public final class MarkdownParserKt$setParsedMarkdown$1 extends r implements l<String, w> {
    final /* synthetic */ TextView $this_setParsedMarkdown;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownParserKt$setParsedMarkdown$1(TextView textView) {
        super(1);
        this.$this_setParsedMarkdown = textView;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        q.i(str, "it");
        Context context = this.$this_setParsedMarkdown.getContext();
        q.h(context, "getContext(...)");
        MarkdownParserKt.handleUrlClicks(context, str);
    }
}
