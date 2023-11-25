package com.habitrpg.android.habitica.ui.activities;

import kotlin.coroutines.Continuation;

/* compiled from: GiftGemsActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.GiftGemsActivity$onCreate$1", f = "GiftGemsActivity.kt", l = {80, 87}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GiftGemsActivity$onCreate$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ GiftGemsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGemsActivity$onCreate$1(GiftGemsActivity giftGemsActivity, Continuation<? super GiftGemsActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = giftGemsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new GiftGemsActivity$onCreate$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((GiftGemsActivity$onCreate$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            dc.n.b(r11)
            goto L8d
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            dc.n.b(r11)
            goto L44
        L1f:
            dc.n.b(r11)
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity r11 = r10.this$0
            com.habitrpg.android.habitica.data.SocialRepository r4 = r11.getSocialRepository()
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity r11 = r10.this$0
            java.lang.String r11 = com.habitrpg.android.habitica.ui.activities.GiftGemsActivity.access$getGiftedUsername$p(r11)
            if (r11 != 0) goto L36
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity r11 = r10.this$0
            java.lang.String r11 = com.habitrpg.android.habitica.ui.activities.GiftGemsActivity.access$getGiftedUserID$p(r11)
        L36:
            r5 = r11
            r6 = 0
            r8 = 2
            r9 = 0
            r10.label = r3
            r7 = r10
            java.lang.Object r11 = com.habitrpg.android.habitica.data.SocialRepository.DefaultImpls.retrieveMember$default(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L44
            return r0
        L44:
            com.habitrpg.android.habitica.models.members.Member r11 = (com.habitrpg.android.habitica.models.members.Member) r11
            if (r11 != 0) goto L4b
            dc.w r11 = dc.w.f13270a
            return r11
        L4b:
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity r1 = r10.this$0
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity.access$setGiftedMember$p(r1, r11)
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity r1 = r10.this$0
            java.lang.String r3 = r11.getId()
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity.access$setGiftedUserID$p(r1, r3)
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity r1 = r10.this$0
            java.lang.String r3 = r11.getUsername()
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity.access$setGiftedUsername$p(r1, r3)
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity r1 = r10.this$0
            com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment r1 = com.habitrpg.android.habitica.ui.activities.GiftGemsActivity.access$getPurchaseFragment$p(r1)
            if (r1 != 0) goto L6b
            goto L6e
        L6b:
            r1.setGiftedMember(r11)
        L6e:
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity r1 = r10.this$0
            com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment r1 = com.habitrpg.android.habitica.ui.activities.GiftGemsActivity.access$getBalanceFragment$p(r1)
            if (r1 != 0) goto L77
            goto L7a
        L77:
            r1.setGiftedMember(r11)
        L7a:
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity r11 = r10.this$0
            com.habitrpg.android.habitica.data.UserRepository r11 = r11.getUserRepository()
            dd.g r11 = r11.getUser()
            r10.label = r2
            java.lang.Object r11 = dd.i.x(r11, r10)
            if (r11 != r0) goto L8d
            return r0
        L8d:
            com.habitrpg.android.habitica.models.user.User r11 = (com.habitrpg.android.habitica.models.user.User) r11
            com.habitrpg.android.habitica.ui.activities.GiftGemsActivity r0 = r10.this$0
            com.habitrpg.android.habitica.ui.views.CurrencyView r0 = r0.getCurrencyView$Habitica_2311256681_prodRelease()
            if (r11 == 0) goto L9d
            int r11 = r11.getGemCount()
            double r1 = (double) r11
            goto L9f
        L9d:
            r1 = 0
        L9f:
            r0.setValue(r1)
            dc.w r11 = dc.w.f13270a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.GiftGemsActivity$onCreate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
