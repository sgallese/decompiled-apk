package com.habitrpg.android.habitica.interactors;

import android.content.Context;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.interactors.UseCase;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.user.Items;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: HatchPetUseCase.kt */
/* loaded from: classes4.dex */
public final class HatchPetUseCase extends UseCase<RequestValues, Items> {
    public static final int $stable = 8;
    private final InventoryRepository inventoryRepository;

    /* compiled from: HatchPetUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class RequestValues implements UseCase.RequestValues {
        public static final int $stable = 8;
        private final Context context;
        private final Egg egg;
        private final HatchingPotion potion;

        public RequestValues(HatchingPotion hatchingPotion, Egg egg, Context context) {
            q.i(hatchingPotion, "potion");
            q.i(egg, "egg");
            q.i(context, "context");
            this.potion = hatchingPotion;
            this.egg = egg;
            this.context = context;
        }

        public final Context getContext() {
            return this.context;
        }

        public final Egg getEgg() {
            return this.egg;
        }

        public final HatchingPotion getPotion() {
            return this.potion;
        }
    }

    public HatchPetUseCase(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "inventoryRepository");
        this.inventoryRepository = inventoryRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.interactors.UseCase
    public Object run(RequestValues requestValues, Continuation<? super Items> continuation) {
        return this.inventoryRepository.hatchPet(requestValues.getEgg(), requestValues.getPotion(), new HatchPetUseCase$run$2(requestValues, this), continuation);
    }
}
