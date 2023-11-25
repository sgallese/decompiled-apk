package com.habitrpg.android.habitica.interactors;

import android.content.Context;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.interactors.UseCase;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import qc.q;

/* compiled from: FeedPetUseCase.kt */
/* loaded from: classes4.dex */
public final class FeedPetUseCase extends UseCase<RequestValues, FeedResponse> {
    public static final int $stable = 8;
    private final InventoryRepository inventoryRepository;

    /* compiled from: FeedPetUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class RequestValues implements UseCase.RequestValues {
        public static final int $stable = 8;
        private final Context context;
        private final Food food;
        private final Pet pet;

        public RequestValues(Pet pet, Food food, Context context) {
            q.i(pet, "pet");
            q.i(food, "food");
            q.i(context, "context");
            this.pet = pet;
            this.food = food;
            this.context = context;
        }

        public final Context getContext() {
            return this.context;
        }

        public final Food getFood() {
            return this.food;
        }

        public final Pet getPet() {
            return this.pet;
        }
    }

    public FeedPetUseCase(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "inventoryRepository");
        this.inventoryRepository = inventoryRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    @Override // com.habitrpg.android.habitica.interactors.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object run(com.habitrpg.android.habitica.interactors.FeedPetUseCase.RequestValues r20, kotlin.coroutines.Continuation<? super com.habitrpg.shared.habitica.models.responses.FeedResponse> r21) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.interactors.FeedPetUseCase.run(com.habitrpg.android.habitica.interactors.FeedPetUseCase$RequestValues, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
