package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import ad.k0;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import dc.n;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import pc.p;

/* compiled from: AvatarEquipmentFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarEquipmentFragment$loadEquipment$1", f = "AvatarEquipmentFragment.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AvatarEquipmentFragment$loadEquipment$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ AvatarEquipmentFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarEquipmentFragment$loadEquipment$1(AvatarEquipmentFragment avatarEquipmentFragment, String str, Continuation<? super AvatarEquipmentFragment$loadEquipment$1> continuation) {
        super(2, continuation);
        this.this$0 = avatarEquipmentFragment;
        this.$type = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AvatarEquipmentFragment$loadEquipment$1(this.this$0, this.$type, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AvatarEquipmentFragment$loadEquipment$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            InventoryRepository inventoryRepository = this.this$0.getInventoryRepository();
            String str = this.$type;
            String category = this.this$0.getCategory();
            if (category == null) {
                category = "";
            }
            dd.g<List<Equipment>> equipmentType = inventoryRepository.getEquipmentType(str, category);
            final AvatarEquipmentFragment avatarEquipmentFragment = this.this$0;
            dd.h<? super List<Equipment>> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarEquipmentFragment$loadEquipment$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends Equipment> list, Continuation<? super w> continuation) {
                    AvatarEquipmentFragment.this.getAdapter$Habitica_2311256681_prodRelease().setEquipment(list);
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (equipmentType.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
