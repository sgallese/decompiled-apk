package com.habitrpg.android.habitica.ui.views.social;

import dc.w;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBarView.kt */
/* loaded from: classes4.dex */
public final class ChatBarView$setupView$1 extends r implements pc.r<CharSequence, Integer, Integer, Integer, w> {
    final /* synthetic */ ChatBarView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBarView$setupView$1(ChatBarView chatBarView) {
        super(4);
        this.this$0 = chatBarView;
    }

    @Override // pc.r
    public /* bridge */ /* synthetic */ w invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return w.f13270a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r6.chatEditText.getText().length() <= r4.this$0.getMaxChatLength$Habitica_2311256681_prodRelease()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            com.habitrpg.android.habitica.ui.views.social.ChatBarView r5 = r4.this$0
            com.habitrpg.android.habitica.databinding.ChatBarViewBinding r6 = com.habitrpg.android.habitica.ui.views.social.ChatBarView.access$getBinding$p(r5)
            com.habitrpg.android.habitica.ui.views.HabiticaAutocompleteTextView r6 = r6.chatEditText
            android.text.Editable r6 = r6.getText()
            java.lang.String r7 = "getText(...)"
            qc.q.h(r6, r7)
            int r6 = r6.length()
            r7 = 1
            r8 = 0
            if (r6 <= 0) goto L1b
            r6 = 1
            goto L1c
        L1b:
            r6 = 0
        L1c:
            if (r6 == 0) goto L3a
            com.habitrpg.android.habitica.ui.views.social.ChatBarView r6 = r4.this$0
            com.habitrpg.android.habitica.databinding.ChatBarViewBinding r6 = com.habitrpg.android.habitica.ui.views.social.ChatBarView.access$getBinding$p(r6)
            com.habitrpg.android.habitica.ui.views.HabiticaAutocompleteTextView r6 = r6.chatEditText
            android.text.Editable r6 = r6.getText()
            int r6 = r6.length()
            long r0 = (long) r6
            com.habitrpg.android.habitica.ui.views.social.ChatBarView r6 = r4.this$0
            long r2 = r6.getMaxChatLength$Habitica_2311256681_prodRelease()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L3a
            goto L3b
        L3a:
            r7 = 0
        L3b:
            com.habitrpg.android.habitica.ui.views.social.ChatBarView.access$setSendButtonEnabled(r5, r7)
            com.habitrpg.android.habitica.ui.views.social.ChatBarView r5 = r4.this$0
            com.habitrpg.android.habitica.databinding.ChatBarViewBinding r6 = com.habitrpg.android.habitica.ui.views.social.ChatBarView.access$getBinding$p(r5)
            com.habitrpg.android.habitica.ui.views.HabiticaAutocompleteTextView r6 = r6.chatEditText
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            com.habitrpg.android.habitica.ui.views.social.ChatBarView.access$updateTextIndicator(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.social.ChatBarView$setupView$1.invoke(java.lang.CharSequence, int, int, int):void");
    }
}
