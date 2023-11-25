package com.habitrpg.android.habitica.ui.fragments.social;

import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: InboxMessageListFragment.kt */
/* loaded from: classes4.dex */
final class InboxMessageListFragment$onViewCreated$5 extends r implements l<String, w> {
    final /* synthetic */ InboxMessageListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxMessageListFragment$onViewCreated$5(InboxMessageListFragment inboxMessageListFragment) {
        super(1);
        this.this$0 = inboxMessageListFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        q.i(str, "it");
        this.this$0.sendMessage(str);
    }
}
