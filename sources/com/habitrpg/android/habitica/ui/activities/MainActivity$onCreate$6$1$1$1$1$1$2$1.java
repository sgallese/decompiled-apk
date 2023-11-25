package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.helpers.MainNavigationController;

/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
final class MainActivity$onCreate$6$1$1$1$1$1$2$1 extends qc.r implements pc.a<dc.w> {
    final /* synthetic */ pc.a<dc.w> $dismiss;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onCreate$6$1$1$1$1$1$2$1(pc.a<dc.w> aVar) {
        super(0);
        this.$dismiss = aVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ dc.w invoke() {
        invoke2();
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$dismiss.invoke();
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.avatarOverviewFragment, null, 2, null);
    }
}
