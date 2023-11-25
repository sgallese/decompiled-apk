package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import ad.k0;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import dc.n;
import dc.w;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PetDetailRecyclerFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3", f = "PetDetailRecyclerFragment.kt", l = {198, 201, 208}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PetDetailRecyclerFragment$loadItems$3 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ PetDetailRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PetDetailRecyclerFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3$2", f = "PetDetailRecyclerFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends l implements p<Map<String, OwnedPet>, Continuation<? super w>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PetDetailRecyclerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PetDetailRecyclerFragment petDetailRecyclerFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = petDetailRecyclerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                this.this$0.getAdapter().setOwnedPets((Map) this.L$0);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // pc.p
        public final Object invoke(Map<String, OwnedPet> map, Continuation<? super w> continuation) {
            return ((AnonymousClass2) create(map, continuation)).invokeSuspend(w.f13270a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetDetailRecyclerFragment$loadItems$3(PetDetailRecyclerFragment petDetailRecyclerFragment, Continuation<? super PetDetailRecyclerFragment$loadItems$3> continuation) {
        super(2, continuation);
        this.this$0 = petDetailRecyclerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PetDetailRecyclerFragment$loadItems$3(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PetDetailRecyclerFragment$loadItems$3) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            dc.n.b(r8)
            goto Lb7
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            dc.n.b(r8)
            goto L84
        L22:
            dc.n.b(r8)
            goto L4e
        L26:
            dc.n.b(r8)
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r8 = r7.this$0
            com.habitrpg.android.habitica.data.InventoryRepository r8 = r8.getInventoryRepository()
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r1 = r7.this$0
            java.lang.String r1 = com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment.access$getAnimalType$p(r1)
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r5 = r7.this$0
            java.lang.String r5 = com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment.access$getAnimalGroup$p(r5)
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r6 = r7.this$0
            java.lang.String r6 = com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment.access$getAnimalColor$p(r6)
            dd.g r8 = r8.getMounts(r1, r5, r6)
            r7.label = r4
            java.lang.Object r8 = dd.i.x(r8, r7)
            if (r8 != r0) goto L4e
            return r0
        L4e:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L56
            java.util.List r8 = ec.r.i()
        L56:
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r1 = r7.this$0
            com.habitrpg.android.habitica.ui.adapter.inventory.PetDetailRecyclerAdapter r1 = r1.getAdapter()
            r1.setExistingMounts(r8)
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r8 = r7.this$0
            com.habitrpg.android.habitica.data.InventoryRepository r8 = r8.getInventoryRepository()
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r1 = r7.this$0
            java.lang.String r1 = com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment.access$getAnimalType$p(r1)
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r4 = r7.this$0
            java.lang.String r4 = com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment.access$getAnimalGroup$p(r4)
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r5 = r7.this$0
            java.lang.String r5 = com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment.access$getAnimalColor$p(r5)
            dd.g r8 = r8.getPets(r1, r4, r5)
            r7.label = r3
            java.lang.Object r8 = dd.i.x(r8, r7)
            if (r8 != r0) goto L84
            return r0
        L84:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L8c
            java.util.List r8 = ec.r.i()
        L8c:
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r1 = r7.this$0
            com.habitrpg.android.habitica.data.InventoryRepository r1 = r1.getInventoryRepository()
            dd.g r1 = r1.getOwnedPets()
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3$invokeSuspend$$inlined$map$1 r3 = new com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3$invokeSuspend$$inlined$map$1
            r3.<init>()
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3$2 r1 = new com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3$2
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r4 = r7.this$0
            r5 = 0
            r1.<init>(r4, r5)
            dd.g r1 = dd.i.J(r3, r1)
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3$3 r3 = new com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3$3
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment r4 = r7.this$0
            r3.<init>()
            r7.label = r2
            java.lang.Object r8 = r1.collect(r3, r7)
            if (r8 != r0) goto Lb7
            return r0
        Lb7:
            dc.w r8 = dc.w.f13270a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
