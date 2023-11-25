package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.models.WorldStateEvent;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import java.util.Date;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* compiled from: BirthdayActivity.kt */
/* loaded from: classes4.dex */
final class BirthdayActivity$onCreate$1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ WorldStateEvent $event;
    final /* synthetic */ BirthdayActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BirthdayActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ WorldStateEvent $event;
        final /* synthetic */ BirthdayActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BirthdayActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02601 extends qc.r implements pc.a<dc.w> {
            final /* synthetic */ BirthdayActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02601(BirthdayActivity birthdayActivity) {
                super(0);
                this.this$0 = birthdayActivity;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.android.billingclient.api.e eVar;
                j0.j1 j1Var;
                eVar = this.this$0.gryphatriceProductDetails;
                if (eVar != null) {
                    BirthdayActivity birthdayActivity = this.this$0;
                    j1Var = birthdayActivity.isPurchasing;
                    j1Var.setValue(Boolean.TRUE);
                    PurchaseHandler.purchase$default(birthdayActivity.getPurchaseHandler(), birthdayActivity, eVar, null, null, false, 28, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BirthdayActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends qc.r implements pc.a<dc.w> {
            final /* synthetic */ BirthdayActivity this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: BirthdayActivity.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$2$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C02611 extends qc.r implements pc.l<Throwable, dc.w> {
                final /* synthetic */ BirthdayActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02611(BirthdayActivity birthdayActivity) {
                    super(1);
                    this.this$0 = birthdayActivity;
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
                    invoke2(th);
                    return dc.w.f13270a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    j0.j1 j1Var;
                    qc.q.i(th, "it");
                    j1Var = this.this$0.isPurchasing;
                    j1Var.setValue(Boolean.FALSE);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: BirthdayActivity.kt */
            @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$2$2", f = "BirthdayActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$2$2  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C02622 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
                int label;
                final /* synthetic */ BirthdayActivity this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: BirthdayActivity.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$2$2$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C02631 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
                    final /* synthetic */ BirthdayActivity this$0;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: BirthdayActivity.kt */
                    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$2$2$1$1", f = "BirthdayActivity.kt", l = {152}, m = "invokeSuspend")
                    /* renamed from: com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$2$2$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C02641 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
                        int label;
                        final /* synthetic */ BirthdayActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C02641(BirthdayActivity birthdayActivity, Continuation<? super C02641> continuation) {
                            super(2, continuation);
                            this.this$0 = birthdayActivity;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                            return new C02641(this.this$0, continuation);
                        }

                        @Override // pc.p
                        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                            return ((C02641) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object d10;
                            Object purchaseWithGems;
                            d10 = ic.d.d();
                            int i10 = this.label;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    dc.n.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                dc.n.b(obj);
                                BirthdayActivity birthdayActivity = this.this$0;
                                this.label = 1;
                                purchaseWithGems = birthdayActivity.purchaseWithGems(this);
                                if (purchaseWithGems == d10) {
                                    return d10;
                                }
                            }
                            return dc.w.f13270a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02631(BirthdayActivity birthdayActivity) {
                        super(2);
                        this.this$0 = birthdayActivity;
                    }

                    @Override // pc.p
                    public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
                        invoke(habiticaAlertDialog, num.intValue());
                        return dc.w.f13270a;
                    }

                    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
                        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
                        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new C02641(this.this$0, null), 1, null);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: BirthdayActivity.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$2$2$2  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C02652 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
                    final /* synthetic */ BirthdayActivity this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02652(BirthdayActivity birthdayActivity) {
                        super(2);
                        this.this$0 = birthdayActivity;
                    }

                    @Override // pc.p
                    public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
                        invoke(habiticaAlertDialog, num.intValue());
                        return dc.w.f13270a;
                    }

                    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
                        j0.j1 j1Var;
                        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
                        j1Var = this.this$0.isPurchasing;
                        j1Var.setValue(Boolean.FALSE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02622(BirthdayActivity birthdayActivity, Continuation<? super C02622> continuation) {
                    super(2, continuation);
                    this.this$0 = birthdayActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C02622(this.this$0, continuation);
                }

                @Override // pc.p
                public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C02622) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    int i10;
                    j0.j1 j1Var;
                    Map e10;
                    ic.d.d();
                    if (this.label == 0) {
                        dc.n.b(obj);
                        User f10 = this.this$0.getUserViewModel().getUser().f();
                        if (f10 != null) {
                            i10 = f10.getGemCount();
                        } else {
                            i10 = 0;
                        }
                        if (i10 >= 60) {
                            j1Var = this.this$0.isPurchasing;
                            j1Var.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this.this$0);
                            habiticaAlertDialog.setTitle(this.this$0.getString(R.string.purchase_gryphatrice_confirmation, kotlin.coroutines.jvm.internal.b.d(60)));
                            String string = this.this$0.getString(R.string.buy_for_x, "60 Gems");
                            qc.q.h(string, "getString(...)");
                            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string, true, false, false, (pc.p) new C02631(this.this$0), 12, (Object) null);
                            AlertDialogExtensionsKt.addCloseButton$default(habiticaAlertDialog, false, new C02652(this.this$0), 1, null);
                            habiticaAlertDialog.show();
                            return dc.w.f13270a;
                        }
                        InsufficientGemsDialog insufficientGemsDialog = new InsufficientGemsDialog(this.this$0, 3);
                        Analytics analytics = Analytics.INSTANCE;
                        EventCategory eventCategory = EventCategory.BEHAVIOUR;
                        HitType hitType = HitType.EVENT;
                        e10 = ec.m0.e(dc.r.a("reason", NavigationDrawerFragment.SIDEBAR_BIRTHDAY));
                        Analytics.sendEvent$default(analytics, "show insufficient gems modal", eventCategory, hitType, e10, null, 16, null);
                        insufficientGemsDialog.show();
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(BirthdayActivity birthdayActivity) {
                super(0);
                this.this$0 = birthdayActivity;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ExceptionHandlerKt.launchCatching(androidx.lifecycle.w.a(this.this$0), new C02611(this.this$0), new C02622(this.this$0, null));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BirthdayActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$3  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends qc.r implements pc.a<dc.w> {
            final /* synthetic */ BirthdayActivity this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: BirthdayActivity.kt */
            @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$3$1", f = "BirthdayActivity.kt", l = {163}, m = "invokeSuspend")
            /* renamed from: com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$1$1$3$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C02661 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
                int label;
                final /* synthetic */ BirthdayActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02661(BirthdayActivity birthdayActivity, Continuation<? super C02661> continuation) {
                    super(2, continuation);
                    this.this$0 = birthdayActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C02661(this.this$0, continuation);
                }

                @Override // pc.p
                public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C02661) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        InventoryRepository inventoryRepository = this.this$0.getInventoryRepository();
                        this.label = 1;
                        if (inventoryRepository.equip("pet", "Gryphatrice-Jubilant", this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(BirthdayActivity birthdayActivity) {
                super(0);
                this.this$0 = birthdayActivity;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new C02661(this.this$0, null), 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BirthdayActivity birthdayActivity, WorldStateEvent worldStateEvent) {
            super(2);
            this.this$0 = birthdayActivity;
            this.$event = worldStateEvent;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            j0.j1 j1Var;
            j0.j1 j1Var2;
            j0.j1 j1Var3;
            j0.j1 j1Var4;
            Date date;
            Date date2;
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-1113285682, i10, -1, "com.habitrpg.android.habitica.ui.activities.BirthdayActivity.onCreate.<anonymous>.<anonymous> (BirthdayActivity.kt:114)");
            }
            f0.g1 scaffoldState = this.this$0.getScaffoldState();
            j1Var = this.this$0.isPurchasing;
            boolean booleanValue = ((Boolean) j1Var.getValue()).booleanValue();
            j1Var2 = this.this$0.hasGryphatrice;
            boolean booleanValue2 = ((Boolean) j1Var2.getValue()).booleanValue();
            j1Var3 = this.this$0.hasEquipped;
            boolean booleanValue3 = ((Boolean) j1Var3.getValue()).booleanValue();
            j1Var4 = this.this$0.price;
            String str = (String) j1Var4.getValue();
            WorldStateEvent worldStateEvent = this.$event;
            if (worldStateEvent == null || (date = worldStateEvent.getStart()) == null) {
                date = new Date();
            }
            Date date3 = date;
            WorldStateEvent worldStateEvent2 = this.$event;
            if (worldStateEvent2 == null || (date2 = worldStateEvent2.getEnd()) == null) {
                date2 = new Date();
            }
            BirthdayActivityKt.BirthdayActivityView(scaffoldState, booleanValue, booleanValue2, booleanValue3, str, date3, date2, new C02601(this.this$0), new AnonymousClass2(this.this$0), new AnonymousClass3(this.this$0), lVar, 2359296);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayActivity$onCreate$1(BirthdayActivity birthdayActivity, WorldStateEvent worldStateEvent) {
        super(2);
        this.this$0 = birthdayActivity;
        this.$event = worldStateEvent;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(-1468566599, i10, -1, "com.habitrpg.android.habitica.ui.activities.BirthdayActivity.onCreate.<anonymous> (BirthdayActivity.kt:113)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, -1113285682, true, new AnonymousClass1(this.this$0, this.$event)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
