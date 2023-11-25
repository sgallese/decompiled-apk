package com.habitrpg.common.habitica.helpers;

import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import android.widget.TextView;
import com.habitrpg.common.habitica.R;
import com.habitrpg.common.habitica.extensions.TextViewExtensionsKt;
import qc.q;
import yc.v;

/* compiled from: MarkdownParser.kt */
/* loaded from: classes4.dex */
public final class MarkdownParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleUrlClicks(Context context, String str) {
        boolean F;
        Uri parse;
        F = v.F(str, "/", false, 2, null);
        if (F) {
            parse = Uri.parse(context.getString(R.string.base_url) + str);
        } else if (Uri.parse(str).getScheme() == null) {
            parse = Uri.parse("http://" + str);
        } else {
            parse = Uri.parse(str);
        }
        MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
        q.f(parse);
        mainNavigationController.navigate(parse);
    }

    public static final void setMarkdown(TextView textView, String str) {
        q.i(textView, "<this>");
        MarkdownParser markdownParser = MarkdownParser.INSTANCE;
        cb.e markwon$common_prodRelease = markdownParser.getMarkwon$common_prodRelease();
        if (markwon$common_prodRelease != null) {
            markwon$common_prodRelease.b(textView, markdownParser.parseMarkdown(str));
        }
        TextViewExtensionsKt.handleUrlClicks(textView, new MarkdownParserKt$setMarkdown$1(textView));
    }

    public static final void setParsedMarkdown(TextView textView, Spanned spanned) {
        q.i(textView, "<this>");
        if (spanned != null) {
            cb.e markwon$common_prodRelease = MarkdownParser.INSTANCE.getMarkwon$common_prodRelease();
            if (markwon$common_prodRelease != null) {
                markwon$common_prodRelease.b(textView, spanned);
            }
            TextViewExtensionsKt.handleUrlClicks(textView, new MarkdownParserKt$setParsedMarkdown$1(textView));
            return;
        }
        textView.setText((CharSequence) null);
    }
}
