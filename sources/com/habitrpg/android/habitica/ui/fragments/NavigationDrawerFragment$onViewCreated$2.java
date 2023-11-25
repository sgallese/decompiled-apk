package com.habitrpg.android.habitica.ui.fragments;

import android.content.SharedPreferences;

/* compiled from: NavigationDrawerFragment.kt */
/* loaded from: classes4.dex */
final class NavigationDrawerFragment$onViewCreated$2 extends qc.r implements pc.l<String, dc.w> {
    final /* synthetic */ NavigationDrawerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerFragment$onViewCreated$2(NavigationDrawerFragment navigationDrawerFragment) {
        super(1);
        this.this$0 = navigationDrawerFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(String str) {
        invoke2(str);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        qc.q.i(str, "it");
        SharedPreferences.Editor edit = this.this$0.getSharedPreferences().edit();
        edit.putBoolean("hide" + str, true);
        edit.apply();
        this.this$0.updatePromo();
    }
}
