package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import ad.k0;
import androidx.fragment.app.q;
import com.habitrpg.android.habitica.interactors.FeedPetUseCase;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ItemDialogFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$feedPet$1", f = "ItemDialogFragment.kt", l = {252}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ItemDialogFragment$feedPet$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ q $activity;
    final /* synthetic */ Food $food;
    final /* synthetic */ Pet $pet;
    int label;
    final /* synthetic */ ItemDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemDialogFragment$feedPet$1(ItemDialogFragment itemDialogFragment, Pet pet, Food food, q qVar, Continuation<? super ItemDialogFragment$feedPet$1> continuation) {
        super(2, continuation);
        this.this$0 = itemDialogFragment;
        this.$pet = pet;
        this.$food = food;
        this.$activity = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ItemDialogFragment$feedPet$1(this.this$0, this.$pet, this.$food, this.$activity, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ItemDialogFragment$feedPet$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            FeedPetUseCase feedPetUseCase = this.this$0.getFeedPetUseCase();
            FeedPetUseCase.RequestValues requestValues = new FeedPetUseCase.RequestValues(this.$pet, this.$food, this.$activity);
            this.label = 1;
            obj = feedPetUseCase.callInteractor(requestValues, this);
            if (obj == d10) {
                return d10;
            }
        }
        FeedResponse feedResponse = (FeedResponse) obj;
        pc.l<FeedResponse, w> onFeedResult = this.this$0.getOnFeedResult();
        if (onFeedResult != null) {
            onFeedResult.invoke(feedResponse);
        }
        return w.f13270a;
    }
}
