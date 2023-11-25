package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import ad.k0;
import com.habitrpg.android.habitica.models.inventory.Animal;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: PetDetailRecyclerFragment.kt */
/* loaded from: classes4.dex */
final class PetDetailRecyclerFragment$onViewCreated$3 extends r implements p<Animal, l<? super dc.l<? extends Egg, ? extends HatchingPotion>, ? extends w>, w> {
    final /* synthetic */ PetDetailRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PetDetailRecyclerFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$onViewCreated$3$1", f = "PetDetailRecyclerFragment.kt", l = {120, 123}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$onViewCreated$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Animal $animal;
        final /* synthetic */ l<dc.l<? extends Egg, ? extends HatchingPotion>, w> $callback;
        Object L$0;
        int label;
        final /* synthetic */ PetDetailRecyclerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PetDetailRecyclerFragment petDetailRecyclerFragment, Animal animal, l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w> lVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = petDetailRecyclerFragment;
            this.$animal = animal;
            this.$callback = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$animal, this.$callback, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
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
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r6.L$0
                com.habitrpg.android.habitica.models.inventory.Egg r0 = (com.habitrpg.android.habitica.models.inventory.Egg) r0
                dc.n.b(r7)
                goto L7c
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                dc.n.b(r7)
                goto L45
            L23:
                dc.n.b(r7)
                com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r7 = r6.this$0
                com.habitrpg.android.habitica.data.InventoryRepository r7 = r7.getInventoryRepository()
                com.habitrpg.android.habitica.models.inventory.Animal r1 = r6.$animal
                java.lang.String r1 = r1.getAnimal()
                java.lang.String[] r1 = new java.lang.String[]{r1}
                java.lang.Class<com.habitrpg.android.habitica.models.inventory.Egg> r5 = com.habitrpg.android.habitica.models.inventory.Egg.class
                dd.g r7 = r7.getItems(r5, r1)
                r6.label = r3
                java.lang.Object r7 = dd.i.x(r7, r6)
                if (r7 != r0) goto L45
                return r0
            L45:
                java.util.List r7 = (java.util.List) r7
                if (r7 == 0) goto L50
                java.lang.Object r7 = ec.r.c0(r7)
                com.habitrpg.android.habitica.models.inventory.Item r7 = (com.habitrpg.android.habitica.models.inventory.Item) r7
                goto L51
            L50:
                r7 = r4
            L51:
                boolean r1 = r7 instanceof com.habitrpg.android.habitica.models.inventory.Egg
                if (r1 == 0) goto L58
                com.habitrpg.android.habitica.models.inventory.Egg r7 = (com.habitrpg.android.habitica.models.inventory.Egg) r7
                goto L59
            L58:
                r7 = r4
            L59:
                com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r1 = r6.this$0
                com.habitrpg.android.habitica.data.InventoryRepository r1 = r1.getInventoryRepository()
                com.habitrpg.android.habitica.models.inventory.Animal r3 = r6.$animal
                java.lang.String r3 = r3.getColor()
                java.lang.String[] r3 = new java.lang.String[]{r3}
                java.lang.Class<com.habitrpg.android.habitica.models.inventory.HatchingPotion> r5 = com.habitrpg.android.habitica.models.inventory.HatchingPotion.class
                dd.g r1 = r1.getItems(r5, r3)
                r6.L$0 = r7
                r6.label = r2
                java.lang.Object r1 = dd.i.x(r1, r6)
                if (r1 != r0) goto L7a
                return r0
            L7a:
                r0 = r7
                r7 = r1
            L7c:
                java.util.List r7 = (java.util.List) r7
                if (r7 == 0) goto L87
                java.lang.Object r7 = ec.r.c0(r7)
                com.habitrpg.android.habitica.models.inventory.Item r7 = (com.habitrpg.android.habitica.models.inventory.Item) r7
                goto L88
            L87:
                r7 = r4
            L88:
                boolean r1 = r7 instanceof com.habitrpg.android.habitica.models.inventory.HatchingPotion
                if (r1 == 0) goto L8f
                r4 = r7
                com.habitrpg.android.habitica.models.inventory.HatchingPotion r4 = (com.habitrpg.android.habitica.models.inventory.HatchingPotion) r4
            L8f:
                pc.l<dc.l<? extends com.habitrpg.android.habitica.models.inventory.Egg, ? extends com.habitrpg.android.habitica.models.inventory.HatchingPotion>, dc.w> r7 = r6.$callback
                dc.l r1 = new dc.l
                r1.<init>(r0, r4)
                r7.invoke(r1)
                dc.w r7 = dc.w.f13270a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$onViewCreated$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetDetailRecyclerFragment$onViewCreated$3(PetDetailRecyclerFragment petDetailRecyclerFragment) {
        super(2);
        this.this$0 = petDetailRecyclerFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(Animal animal, l<? super dc.l<? extends Egg, ? extends HatchingPotion>, ? extends w> lVar) {
        invoke2(animal, (l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>) lVar);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Animal animal, l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w> lVar) {
        q.i(animal, "animal");
        q.i(lVar, "callback");
        ad.i.d(androidx.lifecycle.w.a(this.this$0), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AnonymousClass1(this.this$0, animal, lVar, null), 2, null);
    }
}
