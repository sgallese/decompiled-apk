package com.habitrpg.android.habitica.ui.fragments.social;

import dc.w;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
/* loaded from: classes4.dex */
public final class ChatFragment$refresh$1 extends r implements pc.a<w> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$refresh$1(ChatFragment chatFragment) {
        super(0);
        this.this$0 = chatFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if (r0 != false) goto L6;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2() {
        /*
            r2 = this;
            com.habitrpg.android.habitica.ui.fragments.social.ChatFragment r0 = r2.this$0
            boolean r0 = com.habitrpg.android.habitica.ui.fragments.social.ChatFragment.access$isScrolledToBottom$p(r0)
            r1 = 0
            if (r0 != 0) goto L11
            com.habitrpg.android.habitica.ui.fragments.social.ChatFragment r0 = r2.this$0
            boolean r0 = com.habitrpg.android.habitica.ui.fragments.social.ChatFragment.access$isFirstRefresh$p(r0)
            if (r0 == 0) goto L20
        L11:
            com.habitrpg.android.habitica.ui.fragments.social.ChatFragment r0 = r2.this$0
            com.habitrpg.android.habitica.databinding.FragmentChatBinding r0 = r0.getBinding()
            if (r0 == 0) goto L20
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerView
            if (r0 == 0) goto L20
            r0.scrollToPosition(r1)
        L20:
            com.habitrpg.android.habitica.ui.fragments.social.ChatFragment r0 = r2.this$0
            com.habitrpg.android.habitica.ui.fragments.social.ChatFragment.access$setFirstRefresh$p(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.ChatFragment$refresh$1.invoke2():void");
    }
}
