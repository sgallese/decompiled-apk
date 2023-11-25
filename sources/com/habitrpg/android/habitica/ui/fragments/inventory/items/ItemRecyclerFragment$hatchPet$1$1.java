package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import ad.k0;
import com.habitrpg.android.habitica.interactors.HatchPetUseCase;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: ItemRecyclerFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$hatchPet$1$1", f = "ItemRecyclerFragment.kt", l = {242}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ItemRecyclerFragment$hatchPet$1$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Egg $egg;
    final /* synthetic */ BaseActivity $it;
    final /* synthetic */ HatchingPotion $potion;
    int label;
    final /* synthetic */ ItemRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemRecyclerFragment$hatchPet$1$1(ItemRecyclerFragment itemRecyclerFragment, HatchingPotion hatchingPotion, Egg egg, BaseActivity baseActivity, Continuation<? super ItemRecyclerFragment$hatchPet$1$1> continuation) {
        super(2, continuation);
        this.this$0 = itemRecyclerFragment;
        this.$potion = hatchingPotion;
        this.$egg = egg;
        this.$it = baseActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ItemRecyclerFragment$hatchPet$1$1(this.this$0, this.$potion, this.$egg, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ItemRecyclerFragment$hatchPet$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            HatchPetUseCase hatchPetUseCase$Habitica_2311256681_prodRelease = this.this$0.getHatchPetUseCase$Habitica_2311256681_prodRelease();
            HatchPetUseCase.RequestValues requestValues = new HatchPetUseCase.RequestValues(this.$potion, this.$egg, this.$it);
            this.label = 1;
            if (hatchPetUseCase$Habitica_2311256681_prodRelease.callInteractor(requestValues, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
