package com.habitrpg.android.habitica.ui.views.yesterdailies;

import android.widget.TextView;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: YesterdailyDialog.kt */
/* loaded from: classes4.dex */
final class YesterdailyDialog$configureTaskView$1 extends r implements l<CharSequence, w> {
    final /* synthetic */ TextView $emojiView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YesterdailyDialog$configureTaskView$1(TextView textView) {
        super(1);
        this.$emojiView = textView;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        q.i(charSequence, "it");
        TextView textView = this.$emojiView;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }
}
