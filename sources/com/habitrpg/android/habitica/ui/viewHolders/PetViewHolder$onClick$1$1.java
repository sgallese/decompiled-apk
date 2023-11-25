package com.habitrpg.android.habitica.ui.viewHolders;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt;
import dc.w;
import pc.q;
import qc.r;
import yc.v;

/* compiled from: PetViewHolder.kt */
/* loaded from: classes4.dex */
final class PetViewHolder$onClick$1$1 extends r implements q<pc.a<? extends w>, j0.l, Integer, w> {
    final /* synthetic */ Pet $pet;
    final /* synthetic */ PetViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetViewHolder$onClick$1$1(Pet pet, PetViewHolder petViewHolder) {
        super(3);
        this.$pet = pet;
        this.this$0 = petViewHolder;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(pc.a<? extends w> aVar, j0.l lVar, Integer num) {
        invoke((pc.a<w>) aVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(pc.a<w> aVar, j0.l lVar, int i10) {
        int i11;
        int i12;
        String str;
        Pet pet;
        boolean s10;
        boolean z10;
        boolean z11;
        pc.l lVar2;
        q qVar;
        qc.q.i(aVar, "it");
        if ((i10 & 14) == 0) {
            i11 = i10 | (lVar.l(aVar) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) == 18 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(1470656500, i11, -1, "com.habitrpg.android.habitica.ui.viewHolders.PetViewHolder.onClick.<anonymous>.<anonymous> (PetViewHolder.kt:123)");
        }
        Pet pet2 = this.$pet;
        i12 = this.this$0.trained;
        str = this.this$0.currentPet;
        pet = this.this$0.animal;
        s10 = v.s(str, pet != null ? pet.getKey() : null, false, 2, null);
        z10 = this.this$0.canRaiseToMount;
        z11 = this.this$0.ownsSaddles;
        lVar2 = this.this$0.onEquip;
        qVar = this.this$0.onFeed;
        PetBottomSheetKt.PetBottomSheet(pet2, i12, s10, z10, z11, lVar2, qVar, aVar, null, lVar, ((i11 << 21) & 29360128) | 2097160, UserVerificationMethods.USER_VERIFY_HANDPRINT);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
