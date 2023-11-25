package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.user.User;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArmoireActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.ArmoireActivity$giveUserArmoire$6", f = "ArmoireActivity.kt", l = {223, 225}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ArmoireActivity$giveUserArmoire$6 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ double $currentGold;
    final /* synthetic */ User $user;
    int label;
    final /* synthetic */ ArmoireActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArmoireActivity$giveUserArmoire$6(ArmoireActivity armoireActivity, double d10, User user, Continuation<? super ArmoireActivity$giveUserArmoire$6> continuation) {
        super(2, continuation);
        this.this$0 = armoireActivity;
        this.$currentGold = d10;
        this.$user = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new ArmoireActivity$giveUserArmoire$6(this.this$0, this.$currentGold, this.$user, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((ArmoireActivity$giveUserArmoire$6) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
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
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            dc.n.b(r11)
            goto L53
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            dc.n.b(r11)
            goto L3c
        L1e:
            dc.n.b(r11)
            com.habitrpg.android.habitica.ui.activities.ArmoireActivity r11 = r10.this$0
            com.habitrpg.android.habitica.data.UserRepository r11 = r11.getUserRepository()
            double r4 = r10.$currentGold
            r1 = 100
            double r6 = (double) r1
            double r4 = r4 + r6
            java.lang.Double r1 = kotlin.coroutines.jvm.internal.b.b(r4)
            r10.label = r3
            java.lang.String r3 = "stats.gp"
            java.lang.Object r11 = r11.updateUser(r3, r1, r10)
            if (r11 != r0) goto L3c
            return r0
        L3c:
            com.habitrpg.android.habitica.ui.activities.ArmoireActivity r11 = r10.this$0
            com.habitrpg.android.habitica.data.InventoryRepository r3 = r11.getInventoryRepository$Habitica_2311256681_prodRelease()
            com.habitrpg.android.habitica.models.user.User r4 = r10.$user
            java.lang.String r5 = "armoire"
            r6 = 0
            r8 = 1
            r10.label = r2
            r9 = r10
            java.lang.Object r11 = r3.buyItem(r4, r5, r6, r8, r9)
            if (r11 != r0) goto L53
            return r0
        L53:
            com.habitrpg.android.habitica.models.responses.BuyResponse r11 = (com.habitrpg.android.habitica.models.responses.BuyResponse) r11
            if (r11 != 0) goto L5a
            dc.w r11 = dc.w.f13270a
            return r11
        L5a:
            com.habitrpg.android.habitica.ui.activities.ArmoireActivity r0 = r10.this$0
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r11.armoire
            java.lang.String r2 = "type"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ""
            if (r1 != 0) goto L6b
            r1 = r2
        L6b:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r11.armoire
            java.lang.String r4 = "dropKey"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L78
            r3 = r2
        L78:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r11.armoire
            java.lang.String r5 = "dropText"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L85
            r4 = r2
        L85:
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r11.armoire
            java.lang.String r5 = "value"
            java.lang.Object r11 = r11.get(r5)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L92
            goto L93
        L92:
            r2 = r11
        L93:
            r0.configure(r1, r3, r4, r2)
            com.habitrpg.android.habitica.ui.activities.ArmoireActivity r11 = r10.this$0
            r0 = 0
            com.habitrpg.android.habitica.ui.activities.ArmoireActivity.access$setHasAnimatedChanges$p(r11, r0)
            com.habitrpg.android.habitica.ui.activities.ArmoireActivity r11 = r10.this$0
            r1 = 0
            com.habitrpg.android.habitica.ui.activities.ArmoireActivity.access$setGold$p(r11, r1)
            com.habitrpg.android.habitica.ui.activities.ArmoireActivity r11 = r10.this$0
            com.habitrpg.android.habitica.ui.activities.ArmoireActivity.access$startAnimation(r11, r0)
            dc.w r11 = dc.w.f13270a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.ArmoireActivity$giveUserArmoire$6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
