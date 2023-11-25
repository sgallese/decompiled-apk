package com.habitrpg.android.habitica.ui.fragments.social;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.databinding.FragmentChatBinding;
import dc.w;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
/* loaded from: classes4.dex */
public final class ChatFragment$sendChatMessage$1 extends r implements pc.a<w> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$sendChatMessage$1(ChatFragment chatFragment) {
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
        RecyclerView recyclerView;
        FragmentChatBinding binding = this.this$0.getBinding();
        if (binding == null || (recyclerView = binding.recyclerView) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }
}
