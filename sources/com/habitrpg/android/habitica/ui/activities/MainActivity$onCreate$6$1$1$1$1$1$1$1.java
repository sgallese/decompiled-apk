package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.MainNavDirections;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$6;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import j0.g3;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public final class MainActivity$onCreate$6$1$1$1$1$1$1$1 extends qc.r implements pc.a<dc.w> {
    final /* synthetic */ pc.a<dc.w> $dismiss;
    final /* synthetic */ g3<User> $user$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainActivity$onCreate$6$1$1$1$1$1$1$1(pc.a<dc.w> aVar, g3<? extends User> g3Var) {
        super(0);
        this.$dismiss = aVar;
        this.$user$delegate = g3Var;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ dc.w invoke() {
        invoke2();
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        this.$dismiss.invoke();
        MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
        User invoke$lambda$0 = MainActivity$onCreate$6.AnonymousClass1.invoke$lambda$0(this.$user$delegate);
        if (invoke$lambda$0 == null || (str = invoke$lambda$0.getId()) == null) {
            str = "";
        }
        MainNavDirections.OpenProfileActivity openProfileActivity = MainNavDirections.openProfileActivity(str);
        qc.q.h(openProfileActivity, "openProfileActivity(...)");
        mainNavigationController.navigate(openProfileActivity);
    }
}
