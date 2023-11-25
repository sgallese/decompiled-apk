package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.ui.activities.FullProfileActivity;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: InboxMessageListFragment.kt */
/* loaded from: classes4.dex */
final class InboxMessageListFragment$onViewCreated$3$1 extends r implements l<String, w> {
    public static final InboxMessageListFragment$onViewCreated$3$1 INSTANCE = new InboxMessageListFragment$onViewCreated$3$1();

    InboxMessageListFragment$onViewCreated$3$1() {
        super(1);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        q.i(str, "it");
        FullProfileActivity.Companion.open(str);
    }
}
