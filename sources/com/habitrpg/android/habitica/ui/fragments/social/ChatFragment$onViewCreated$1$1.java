package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.ui.activities.FullProfileActivity;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: ChatFragment.kt */
/* loaded from: classes4.dex */
final class ChatFragment$onViewCreated$1$1 extends r implements l<String, w> {
    public static final ChatFragment$onViewCreated$1$1 INSTANCE = new ChatFragment$onViewCreated$1$1();

    ChatFragment$onViewCreated$1$1() {
        super(1);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        FullProfileActivity.Companion.open(str);
    }
}
