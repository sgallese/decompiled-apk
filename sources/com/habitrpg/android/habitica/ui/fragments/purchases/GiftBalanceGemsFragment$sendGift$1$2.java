package com.habitrpg.android.habitica.ui.fragments.purchases;

import ad.k0;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: GiftBalanceGemsFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment$sendGift$1$2", f = "GiftBalanceGemsFragment.kt", l = {79, 80}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GiftBalanceGemsFragment$sendGift$1$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ int $amount;
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ GiftBalanceGemsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiftBalanceGemsFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment$sendGift$1$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, w> {
        final /* synthetic */ GiftBalanceGemsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GiftBalanceGemsFragment giftBalanceGemsFragment) {
            super(2);
            this.this$0 = giftBalanceGemsFragment;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            androidx.fragment.app.q activity = this.this$0.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftBalanceGemsFragment$sendGift$1$2(GiftBalanceGemsFragment giftBalanceGemsFragment, String str, int i10, Continuation<? super GiftBalanceGemsFragment$sendGift$1$2> continuation) {
        super(2, continuation);
        this.this$0 = giftBalanceGemsFragment;
        this.$it = str;
        this.$amount = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GiftBalanceGemsFragment$sendGift$1$2(this.this$0, this.$it, this.$amount, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GiftBalanceGemsFragment$sendGift$1$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            dc.n.b(r12)
            goto L49
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            dc.n.b(r12)
            goto L34
        L1e:
            dc.n.b(r12)
            com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment r12 = r11.this$0
            com.habitrpg.android.habitica.data.SocialRepository r12 = r12.getSocialRepository()
            java.lang.String r1 = r11.$it
            int r4 = r11.$amount
            r11.label = r3
            java.lang.Object r12 = r12.transferGems(r1, r4, r11)
            if (r12 != r0) goto L34
            return r0
        L34:
            com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment r12 = r11.this$0
            com.habitrpg.android.habitica.data.UserRepository r4 = r12.getUserRepository()
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 6
            r10 = 0
            r11.label = r2
            r8 = r11
            java.lang.Object r12 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L49
            return r0
        L49:
            com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment r12 = r11.this$0
            android.content.Context r12 = r12.getContext()
            r0 = 0
            if (r12 == 0) goto L58
            com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog r1 = new com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog
            r1.<init>(r12)
            goto L59
        L58:
            r1 = r0
        L59:
            if (r1 == 0) goto L61
            r12 = 2131952274(0x7f130292, float:1.9540986E38)
            r1.setTitle(r12)
        L61:
            r12 = 0
            if (r1 == 0) goto L88
            com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment r4 = r11.this$0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.habitrpg.android.habitica.models.members.Member r5 = r4.getGiftedMember()
            if (r5 == 0) goto L73
            java.lang.String r5 = r5.getUsername()
            goto L74
        L73:
            r5 = r0
        L74:
            r2[r12] = r5
            int r5 = r11.$amount
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r2[r3] = r5
            r5 = 2131952271(0x7f13028f, float:1.954098E38)
            java.lang.String r2 = r4.getString(r5, r2)
            r1.setMessage(r2)
        L88:
            if (r1 == 0) goto L94
            com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment$sendGift$1$2$1 r2 = new com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment$sendGift$1$2$1
            com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment r4 = r11.this$0
            r2.<init>(r4)
            com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt.addCloseButton$default(r1, r12, r2, r3, r0)
        L94:
            if (r1 == 0) goto L99
            r1.show()
        L99:
            dc.w r12 = dc.w.f13270a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment$sendGift$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
