package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* compiled from: PetDetailRecyclerFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$onViewCreated$6", f = "PetDetailRecyclerFragment.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PetDetailRecyclerFragment$onViewCreated$6 extends l implements q<Pet, Food, Continuation<? super FeedResponse>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PetDetailRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetDetailRecyclerFragment$onViewCreated$6(PetDetailRecyclerFragment petDetailRecyclerFragment, Continuation<? super PetDetailRecyclerFragment$onViewCreated$6> continuation) {
        super(3, continuation);
        this.this$0 = petDetailRecyclerFragment;
    }

    @Override // pc.q
    public final Object invoke(Pet pet, Food food, Continuation<? super FeedResponse> continuation) {
        PetDetailRecyclerFragment$onViewCreated$6 petDetailRecyclerFragment$onViewCreated$6 = new PetDetailRecyclerFragment$onViewCreated$6(this.this$0, continuation);
        petDetailRecyclerFragment$onViewCreated$6.L$0 = pet;
        petDetailRecyclerFragment$onViewCreated$6.L$1 = food;
        return petDetailRecyclerFragment$onViewCreated$6.invokeSuspend(w.f13270a);
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
            Pet pet = (Pet) this.L$0;
            Food food = (Food) this.L$1;
            PetDetailRecyclerFragment petDetailRecyclerFragment = this.this$0;
            this.L$0 = null;
            this.label = 1;
            obj = petDetailRecyclerFragment.showFeedingDialog(pet, food, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }
}
