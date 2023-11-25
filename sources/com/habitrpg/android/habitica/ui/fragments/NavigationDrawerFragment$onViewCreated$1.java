package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.ui.menu.HabiticaDrawerItem;

/* compiled from: NavigationDrawerFragment.kt */
/* loaded from: classes4.dex */
final class NavigationDrawerFragment$onViewCreated$1 extends qc.r implements pc.l<HabiticaDrawerItem, dc.w> {
    final /* synthetic */ NavigationDrawerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerFragment$onViewCreated$1(NavigationDrawerFragment navigationDrawerFragment) {
        super(1);
        this.this$0 = navigationDrawerFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(HabiticaDrawerItem habiticaDrawerItem) {
        invoke2(habiticaDrawerItem);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(HabiticaDrawerItem habiticaDrawerItem) {
        qc.q.i(habiticaDrawerItem, "it");
        NavigationDrawerFragment.setSelection$default(this.this$0, Integer.valueOf(habiticaDrawerItem.getTransitionId()), habiticaDrawerItem.getBundle(), true, false, 8, null);
    }
}
