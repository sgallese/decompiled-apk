package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import ad.k0;
import androidx.fragment.app.q;
import com.habitrpg.android.habitica.interactors.HatchPetUseCase;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ItemDialogFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$hatchPet$1", f = "ItemDialogFragment.kt", l = {283}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ItemDialogFragment$hatchPet$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ q $activity;
    final /* synthetic */ Egg $egg;
    final /* synthetic */ HatchingPotion $potion;
    int label;
    final /* synthetic */ ItemDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemDialogFragment$hatchPet$1(ItemDialogFragment itemDialogFragment, HatchingPotion hatchingPotion, Egg egg, q qVar, Continuation<? super ItemDialogFragment$hatchPet$1> continuation) {
        super(2, continuation);
        this.this$0 = itemDialogFragment;
        this.$potion = hatchingPotion;
        this.$egg = egg;
        this.$activity = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ItemDialogFragment$hatchPet$1(this.this$0, this.$potion, this.$egg, this.$activity, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ItemDialogFragment$hatchPet$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            HatchPetUseCase hatchPetUseCase = this.this$0.getHatchPetUseCase();
            HatchPetUseCase.RequestValues requestValues = new HatchPetUseCase.RequestValues(this.$potion, this.$egg, this.$activity);
            this.label = 1;
            if (hatchPetUseCase.callInteractor(requestValues, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
