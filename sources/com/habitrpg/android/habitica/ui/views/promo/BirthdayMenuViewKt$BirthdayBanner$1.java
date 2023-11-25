package com.habitrpg.android.habitica.ui.views.promo;

import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import qc.r;

/* compiled from: BirthdayMenuView.kt */
/* loaded from: classes4.dex */
final class BirthdayMenuViewKt$BirthdayBanner$1 extends r implements pc.a<w> {
    public static final BirthdayMenuViewKt$BirthdayBanner$1 INSTANCE = new BirthdayMenuViewKt$BirthdayBanner$1();

    BirthdayMenuViewKt$BirthdayBanner$1() {
        super(0);
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.birthdayActivity, null, 2, null);
    }
}
