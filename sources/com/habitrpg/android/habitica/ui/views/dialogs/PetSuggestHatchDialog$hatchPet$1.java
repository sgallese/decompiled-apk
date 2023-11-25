package com.habitrpg.android.habitica.ui.views.dialogs;

import ad.k0;
import android.content.Context;
import com.habitrpg.android.habitica.interactors.HatchPetUseCase;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PetSuggestHatchDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog$hatchPet$1", f = "PetSuggestHatchDialog.kt", l = {214}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PetSuggestHatchDialog$hatchPet$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Egg $egg;
    final /* synthetic */ HatchingPotion $potion;
    int label;
    final /* synthetic */ PetSuggestHatchDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetSuggestHatchDialog$hatchPet$1(PetSuggestHatchDialog petSuggestHatchDialog, HatchingPotion hatchingPotion, Egg egg, Continuation<? super PetSuggestHatchDialog$hatchPet$1> continuation) {
        super(2, continuation);
        this.this$0 = petSuggestHatchDialog;
        this.$potion = hatchingPotion;
        this.$egg = egg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PetSuggestHatchDialog$hatchPet$1(this.this$0, this.$potion, this.$egg, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PetSuggestHatchDialog$hatchPet$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        HatchPetUseCase hatchPetUseCase;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            hatchPetUseCase = this.this$0.hatchPetUseCase;
            HatchingPotion hatchingPotion = this.$potion;
            Egg egg = this.$egg;
            Context context = this.this$0.getContext();
            q.h(context, "getContext(...)");
            HatchPetUseCase.RequestValues requestValues = new HatchPetUseCase.RequestValues(hatchingPotion, egg, context);
            this.label = 1;
            if (hatchPetUseCase.callInteractor(requestValues, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
