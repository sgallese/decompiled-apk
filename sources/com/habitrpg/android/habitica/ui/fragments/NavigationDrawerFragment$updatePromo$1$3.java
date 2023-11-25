package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.extensions.DateExtensionsKt;
import com.habitrpg.android.habitica.models.promotions.HabiticaPromotion;
import java.util.Date;

/* compiled from: NavigationDrawerFragment.kt */
/* loaded from: classes4.dex */
final class NavigationDrawerFragment$updatePromo$1$3 extends qc.r implements pc.a<zc.a> {
    final /* synthetic */ HabiticaPromotion $activePromo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerFragment$updatePromo$1$3(HabiticaPromotion habiticaPromotion) {
        super(0);
        this.$activePromo = habiticaPromotion;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ zc.a invoke() {
        return zc.a.g(m60invokeUwyO8pc());
    }

    /* renamed from: invoke-UwyO8pc  reason: not valid java name */
    public final long m60invokeUwyO8pc() {
        return zc.c.o(1, DateExtensionsKt.m5getMinuteOrSecondsLRDsOJo(zc.c.p(this.$activePromo.getEndDate().getTime() - new Date().getTime(), zc.d.SECONDS)));
    }
}
