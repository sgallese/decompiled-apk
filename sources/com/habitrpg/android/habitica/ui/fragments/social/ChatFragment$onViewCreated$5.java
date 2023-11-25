package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.databinding.FragmentChatBinding;
import com.habitrpg.android.habitica.ui.views.social.ChatBarView;
import dc.w;
import qc.r;

/* compiled from: ChatFragment.kt */
/* loaded from: classes4.dex */
final class ChatFragment$onViewCreated$5 extends r implements pc.a<w> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onViewCreated$5(ChatFragment chatFragment) {
        super(0);
        this.this$0 = chatFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getViewModel().updateUser("flags.communityGuidelinesAccepted", Boolean.TRUE);
        FragmentChatBinding binding = this.this$0.getBinding();
        ChatBarView chatBarView = binding != null ? binding.chatBarView : null;
        if (chatBarView == null) {
            return;
        }
        chatBarView.setHasAcceptedGuidelines(true);
    }
}
