package com.habitrpg.android.habitica.ui.adapter.inventory;

import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.ui.adapter.inventory.PetDetailRecyclerAdapter;
import com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: PetDetailRecyclerAdapter.kt */
/* loaded from: classes4.dex */
final class PetDetailRecyclerAdapter$CanHatchViewHolder$onClick$1$1 extends r implements l<dc.l<? extends Egg, ? extends HatchingPotion>, w> {
    final /* synthetic */ PetSuggestHatchDialog $dialog;
    final /* synthetic */ Pet $it;
    final /* synthetic */ PetDetailRecyclerAdapter.CanHatchViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetDetailRecyclerAdapter$CanHatchViewHolder$onClick$1$1(PetSuggestHatchDialog petSuggestHatchDialog, Pet pet, PetDetailRecyclerAdapter.CanHatchViewHolder canHatchViewHolder) {
        super(1);
        this.$dialog = petSuggestHatchDialog;
        this.$it = pet;
        this.this$0 = canHatchViewHolder;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(dc.l<? extends Egg, ? extends HatchingPotion> lVar) {
        invoke2(lVar);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(dc.l<? extends Egg, ? extends HatchingPotion> lVar) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        q.i(lVar, "ingredients");
        PetSuggestHatchDialog petSuggestHatchDialog = this.$dialog;
        Pet pet = this.$it;
        Egg c10 = lVar.c();
        HatchingPotion d10 = lVar.d();
        i10 = this.this$0.eggCount;
        i11 = this.this$0.potionCount;
        z10 = this.this$0.hasUnlockedEgg;
        z11 = this.this$0.hasUnlockedPotion;
        z12 = this.this$0.hasMount;
        petSuggestHatchDialog.configure(pet, c10, d10, i10, i11, z10, z11, z12);
        this.$dialog.show();
    }
}
