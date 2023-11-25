package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import ad.k0;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.r;

/* compiled from: AvatarOverviewFragment.kt */
/* loaded from: classes4.dex */
final class AvatarOverviewFragment$onCreateView$3 extends r implements pc.l<dc.l<? extends String, ? extends String>, w> {
    final /* synthetic */ AvatarOverviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AvatarOverviewFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment$onCreateView$3$1", f = "AvatarOverviewFragment.kt", l = {110, 115}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment$onCreateView$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ dc.l<String, String> $it;
        Object L$0;
        int label;
        final /* synthetic */ AvatarOverviewFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AvatarOverviewFragment avatarOverviewFragment, dc.l<String, String> lVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = avatarOverviewFragment;
            this.$it = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$it, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r6.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r0 = r6.L$0
                j0.j1 r0 = (j0.j1) r0
                dc.n.b(r7)
                goto L7d
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                java.lang.Object r1 = r6.L$0
                j0.j1 r1 = (j0.j1) r1
                dc.n.b(r7)
                goto L4f
            L27:
                dc.n.b(r7)
                com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment r7 = r6.this$0
                j0.j1 r1 = com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment.access$getBattleGearWeapon$p(r7)
                dc.l<java.lang.String, java.lang.String> r7 = r6.$it
                java.lang.Object r7 = r7.c()
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L52
                com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment r5 = r6.this$0
                com.habitrpg.android.habitica.data.InventoryRepository r5 = r5.getInventoryRepository()
                dd.g r7 = r5.getEquipment(r7)
                r6.L$0 = r1
                r6.label = r4
                java.lang.Object r7 = dd.i.x(r7, r6)
                if (r7 != r0) goto L4f
                return r0
            L4f:
                com.habitrpg.android.habitica.models.inventory.Equipment r7 = (com.habitrpg.android.habitica.models.inventory.Equipment) r7
                goto L53
            L52:
                r7 = r2
            L53:
                r1.setValue(r7)
                com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment r7 = r6.this$0
                j0.j1 r7 = com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment.access$getCostumeWeapon$p(r7)
                dc.l<java.lang.String, java.lang.String> r1 = r6.$it
                java.lang.Object r1 = r1.d()
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L81
                com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment r2 = r6.this$0
                com.habitrpg.android.habitica.data.InventoryRepository r2 = r2.getInventoryRepository()
                dd.g r1 = r2.getEquipment(r1)
                r6.L$0 = r7
                r6.label = r3
                java.lang.Object r1 = dd.i.x(r1, r6)
                if (r1 != r0) goto L7b
                return r0
            L7b:
                r0 = r7
                r7 = r1
            L7d:
                r2 = r7
                com.habitrpg.android.habitica.models.inventory.Equipment r2 = (com.habitrpg.android.habitica.models.inventory.Equipment) r2
                r7 = r0
            L81:
                r7.setValue(r2)
                dc.w r7 = dc.w.f13270a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment$onCreateView$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarOverviewFragment$onCreateView$3(AvatarOverviewFragment avatarOverviewFragment) {
        super(1);
        this.this$0 = avatarOverviewFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(dc.l<? extends String, ? extends String> lVar) {
        invoke2((dc.l<String, String>) lVar);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(dc.l<String, String> lVar) {
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, lVar, null), 1, null);
    }
}
