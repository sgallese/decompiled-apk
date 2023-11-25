package com.habitrpg.android.habitica.ui.views.subscriptions;

import ad.k0;
import ad.l0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.SubscriptionBenefitsBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.h;
import qc.q;
import sa.b;

/* compiled from: SubscriberBenefitView.kt */
/* loaded from: classes4.dex */
public final class SubscriberBenefitView extends LinearLayout {
    public static final int $stable = 8;
    private final SubscriptionBenefitsBinding binding;
    public AppConfigManager configManager;
    public InventoryRepository inventoryRepository;

    /* compiled from: SubscriberBenefitView.kt */
    @f(c = "com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView$1", f = "SubscriberBenefitView.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            r3 = yc.w.x0(r3, new java.lang.String[]{"_"}, false, 0, 6, null);
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r9.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                dc.n.b(r10)
                goto L2d
            Lf:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L17:
                dc.n.b(r10)
                com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView r10 = com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView.this
                com.habitrpg.android.habitica.data.InventoryRepository r10 = r10.getInventoryRepository()
                dd.g r10 = r10.getLatestMysteryItem()
                r9.label = r2
                java.lang.Object r10 = dd.i.x(r10, r9)
                if (r10 != r0) goto L2d
                return r0
            L2d:
                com.habitrpg.android.habitica.models.inventory.Equipment r10 = (com.habitrpg.android.habitica.models.inventory.Equipment) r10
                com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView r0 = com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView.this
                com.habitrpg.android.habitica.databinding.SubscriptionBenefitsBinding r0 = com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView.access$getBinding$p(r0)
                com.habitrpg.common.habitica.views.PixelArtView r0 = r0.subBenefitsMysteryItemIcon
                java.lang.String r1 = "subBenefitsMysteryItemIcon"
                qc.q.h(r0, r1)
                r1 = 0
                if (r10 == 0) goto L5c
                java.lang.String r3 = r10.getKey()
                if (r3 == 0) goto L5c
                java.lang.String r4 = "_"
                java.lang.String[] r4 = new java.lang.String[]{r4}
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                java.util.List r3 = yc.m.x0(r3, r4, r5, r6, r7, r8)
                if (r3 == 0) goto L5c
                java.lang.Object r3 = ec.r.m0(r3)
                java.lang.String r3 = (java.lang.String) r3
                goto L5d
            L5c:
                r3 = r1
            L5d:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "shop_set_mystery_"
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                r4 = 2
                com.habitrpg.common.habitica.extensions.DataBindingUtilsKt.loadImage$default(r0, r3, r1, r4, r1)
                com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView r0 = com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView.this
                com.habitrpg.android.habitica.databinding.SubscriptionBenefitsBinding r0 = com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView.access$getBinding$p(r0)
                android.widget.TextView r0 = r0.subBenefitsMysteryItemText
                android.content.Context r3 = r9.$context
                java.lang.Object[] r2 = new java.lang.Object[r2]
                if (r10 == 0) goto L84
                java.lang.String r1 = r10.getText()
            L84:
                r10 = 0
                r2[r10] = r1
                r10 = 2131953217(0x7f130641, float:1.9542899E38)
                java.lang.String r10 = r3.getString(r10, r2)
                r0.setText(r10)
                dc.w r10 = dc.w.f13270a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SubscriberBenefitView.kt */
    /* loaded from: classes4.dex */
    public interface ThisEntryPoint {
        AppConfigManager configManager();

        InventoryRepository inventoryRepository();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.AttributeSet, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SubscriberBenefitView(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            qc.q.i(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView.<init>(android.content.Context):void");
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        q.z("configManager");
        return null;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        q.z("inventoryRepository");
        return null;
    }

    public final void hideArmoireBenefit() {
        LinearLayout linearLayout = this.binding.benefitArmoireWrapper;
        q.h(linearLayout, "benefitArmoireWrapper");
        linearLayout.setVisibility(8);
    }

    public final void hideDeathBenefit() {
        LinearLayout linearLayout = this.binding.benefitFaintWrapper;
        q.h(linearLayout, "benefitFaintWrapper");
        linearLayout.setVisibility(8);
    }

    public final void hideGemsForGoldBenefit() {
        LinearLayout linearLayout = this.binding.benefitGemsForGoldWrapper;
        q.h(linearLayout, "benefitGemsForGoldWrapper");
        linearLayout.setVisibility(8);
    }

    public final void hideMysticHourglassBenefit() {
        LinearLayout linearLayout = this.binding.benefitHourglassesWrapper;
        q.h(linearLayout, "benefitHourglassesWrapper");
        linearLayout.setVisibility(8);
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public /* synthetic */ SubscriberBenefitView(Context context, AttributeSet attributeSet, int i10, h hVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberBenefitView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        SubscriptionBenefitsBinding inflate = SubscriptionBenefitsBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        setOrientation(1);
        ThisEntryPoint thisEntryPoint = (ThisEntryPoint) b.a(context, ThisEntryPoint.class);
        setConfigManager(thisEntryPoint.configManager());
        setInventoryRepository(thisEntryPoint.inventoryRepository());
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new AnonymousClass1(context, null), 1, null);
        LinearLayout linearLayout = inflate.benefitArmoireWrapper;
        q.h(linearLayout, "benefitArmoireWrapper");
        linearLayout.setVisibility(getConfigManager().enableArmoireSubs() ? 0 : 8);
        LinearLayout linearLayout2 = inflate.benefitFaintWrapper;
        q.h(linearLayout2, "benefitFaintWrapper");
        linearLayout2.setVisibility(getConfigManager().enableFaintSubs() ? 0 : 8);
    }
}
