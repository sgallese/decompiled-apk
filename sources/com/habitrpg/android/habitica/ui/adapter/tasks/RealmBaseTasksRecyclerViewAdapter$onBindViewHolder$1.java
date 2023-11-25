package com.habitrpg.android.habitica.ui.adapter.tasks;

import dc.w;
import pc.l;
import qc.r;

/* compiled from: RealmBaseTasksRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
final class RealmBaseTasksRecyclerViewAdapter$onBindViewHolder$1 extends r implements pc.a<w> {
    final /* synthetic */ RealmBaseTasksRecyclerViewAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmBaseTasksRecyclerViewAdapter$onBindViewHolder$1(RealmBaseTasksRecyclerViewAdapter realmBaseTasksRecyclerViewAdapter) {
        super(0);
        this.this$0 = realmBaseTasksRecyclerViewAdapter;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l<String, w> errorButtonEvents = this.this$0.getErrorButtonEvents();
        if (errorButtonEvents != null) {
            errorButtonEvents.invoke("");
        }
    }
}
