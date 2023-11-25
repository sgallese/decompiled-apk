package com.habitrpg.android.habitica.ui.views.stable;

import com.habitrpg.android.habitica.models.inventory.Pet;
import dc.w;
import pc.a;
import pc.l;
import qc.r;

/* compiled from: PetBottomSheet.kt */
/* loaded from: classes4.dex */
final class PetBottomSheetKt$PetBottomSheet$2$4 extends r implements a<w> {
    final /* synthetic */ a<w> $onDismiss;
    final /* synthetic */ l<String, w> $onEquip;
    final /* synthetic */ Pet $pet;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PetBottomSheetKt$PetBottomSheet$2$4(l<? super String, w> lVar, Pet pet, a<w> aVar) {
        super(0);
        this.$onEquip = lVar;
        this.$pet = pet;
        this.$onDismiss = aVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l<String, w> lVar = this.$onEquip;
        if (lVar != null) {
            lVar.invoke(this.$pet.getKey());
        }
        this.$onDismiss.invoke();
    }
}
