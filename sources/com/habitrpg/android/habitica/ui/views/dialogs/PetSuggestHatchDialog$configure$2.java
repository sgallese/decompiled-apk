package com.habitrpg.android.habitica.ui.views.dialogs;

import ad.k0;
import android.app.Activity;
import android.content.Context;
import com.habitrpg.android.habitica.HabiticaBaseApplication;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import ec.m0;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.d0;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PetSuggestHatchDialog.kt */
/* loaded from: classes4.dex */
public final class PetSuggestHatchDialog$configure$2 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ Egg $egg;
    final /* synthetic */ boolean $hasEgg;
    final /* synthetic */ boolean $hasPotion;
    final /* synthetic */ d0 $hatchPrice;
    final /* synthetic */ HatchingPotion $potion;
    final /* synthetic */ PetSuggestHatchDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PetSuggestHatchDialog.kt */
    @f(c = "com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog$configure$2$1", f = "PetSuggestHatchDialog.kt", l = {182, 185, 191}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog$configure$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ MainActivity $activity;
        final /* synthetic */ boolean $hasEgg;
        final /* synthetic */ boolean $hasPotion;
        final /* synthetic */ Egg $thisEgg;
        final /* synthetic */ HatchingPotion $thisPotion;
        int label;
        final /* synthetic */ PetSuggestHatchDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z10, MainActivity mainActivity, Egg egg, boolean z11, HatchingPotion hatchingPotion, PetSuggestHatchDialog petSuggestHatchDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$hasEgg = z10;
            this.$activity = mainActivity;
            this.$thisEgg = egg;
            this.$hasPotion = z11;
            this.$thisPotion = hatchingPotion;
            this.this$0 = petSuggestHatchDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$hasEgg, this.$activity, this.$thisEgg, this.$hasPotion, this.$thisPotion, this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                dc.n.b(r11)
                goto L73
            L15:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1d:
                dc.n.b(r11)
                goto L5e
            L21:
                dc.n.b(r11)
                goto L43
            L25:
                dc.n.b(r11)
                boolean r11 = r10.$hasEgg
                if (r11 != 0) goto L43
                com.habitrpg.android.habitica.ui.activities.MainActivity r11 = r10.$activity
                com.habitrpg.android.habitica.data.InventoryRepository r11 = r11.getInventoryRepository$Habitica_2311256681_prodRelease()
                com.habitrpg.android.habitica.models.inventory.Egg r1 = r10.$thisEgg
                java.lang.String r1 = r1.getKey()
                r10.label = r4
                java.lang.String r5 = "eggs"
                java.lang.Object r11 = r11.purchaseItem(r5, r1, r4, r10)
                if (r11 != r0) goto L43
                return r0
            L43:
                boolean r11 = r10.$hasPotion
                if (r11 != 0) goto L5e
                com.habitrpg.android.habitica.ui.activities.MainActivity r11 = r10.$activity
                com.habitrpg.android.habitica.data.InventoryRepository r11 = r11.getInventoryRepository$Habitica_2311256681_prodRelease()
                com.habitrpg.android.habitica.models.inventory.HatchingPotion r1 = r10.$thisPotion
                java.lang.String r1 = r1.getKey()
                r10.label = r3
                java.lang.String r3 = "hatchingPotions"
                java.lang.Object r11 = r11.purchaseItem(r3, r1, r4, r10)
                if (r11 != r0) goto L5e
                return r0
            L5e:
                com.habitrpg.android.habitica.ui.activities.MainActivity r11 = r10.$activity
                com.habitrpg.android.habitica.data.UserRepository r3 = r11.getUserRepository()
                r4 = 1
                r5 = 1
                r6 = 0
                r8 = 4
                r9 = 0
                r10.label = r2
                r7 = r10
                java.lang.Object r11 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r3, r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L73
                return r0
            L73:
                com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog r11 = r10.this$0
                com.habitrpg.android.habitica.models.inventory.HatchingPotion r0 = r10.$thisPotion
                com.habitrpg.android.habitica.models.inventory.Egg r1 = r10.$thisEgg
                com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog.access$hatchPet(r11, r0, r1)
                dc.w r11 = dc.w.f13270a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog$configure$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetSuggestHatchDialog$configure$2(PetSuggestHatchDialog petSuggestHatchDialog, d0 d0Var, HatchingPotion hatchingPotion, Egg egg, boolean z10, boolean z11) {
        super(2);
        this.this$0 = petSuggestHatchDialog;
        this.$hatchPrice = d0Var;
        this.$potion = hatchingPotion;
        this.$egg = egg;
        this.$hasEgg = z10;
        this.$hasPotion = z11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        MainUserViewModel mainUserViewModel;
        Egg egg;
        Map e10;
        WeakReference<BaseActivity> currentActivity;
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        Activity activity = this.this$0.getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity == null) {
            HabiticaBaseApplication.Companion companion = HabiticaBaseApplication.Companion;
            Context context = this.this$0.getContext();
            q.h(context, "getContext(...)");
            HabiticaBaseApplication companion2 = companion.getInstance(context);
            BaseActivity baseActivity = (companion2 == null || (currentActivity = companion2.getCurrentActivity()) == null) ? null : currentActivity.get();
            mainActivity = baseActivity instanceof MainActivity ? (MainActivity) baseActivity : null;
            if (mainActivity == null) {
                return;
            }
        }
        MainActivity mainActivity2 = mainActivity;
        mainUserViewModel = this.this$0.userViewModel;
        User f10 = mainUserViewModel.getUser().f();
        if ((f10 != null ? f10.getGemCount() : this.$hatchPrice.f21667f) < this.$hatchPrice.f21667f) {
            new InsufficientGemsDialog(mainActivity2, this.$hatchPrice.f21667f).show();
            Analytics analytics = Analytics.INSTANCE;
            EventCategory eventCategory = EventCategory.BEHAVIOUR;
            HitType hitType = HitType.EVENT;
            e10 = m0.e(dc.r.a("reason", "pet suggest modal"));
            Analytics.sendEvent$default(analytics, "show insufficient gems modal", eventCategory, hitType, e10, null, 16, null);
            return;
        }
        HatchingPotion hatchingPotion = this.$potion;
        if (hatchingPotion == null || (egg = this.$egg) == null) {
            return;
        }
        ExceptionHandlerKt.launchCatching$default(this.this$0.getLongLivingScope(), null, new AnonymousClass1(this.$hasEgg, mainActivity2, egg, this.$hasPotion, hatchingPotion, this.this$0, null), 1, null);
    }
}
