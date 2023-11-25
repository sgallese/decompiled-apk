package com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment;

import ad.k0;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: EquipmentOverviewViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment.EquipmentOverviewViewModel$getGear$1", f = "EquipmentOverviewViewModel.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class EquipmentOverviewViewModel$getGear$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ pc.l<Equipment, w> $onSuccess;
    int label;
    final /* synthetic */ EquipmentOverviewViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EquipmentOverviewViewModel$getGear$1(EquipmentOverviewViewModel equipmentOverviewViewModel, String str, pc.l<? super Equipment, w> lVar, Continuation<? super EquipmentOverviewViewModel$getGear$1> continuation) {
        super(2, continuation);
        this.this$0 = equipmentOverviewViewModel;
        this.$key = str;
        this.$onSuccess = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new EquipmentOverviewViewModel$getGear$1(this.this$0, this.$key, this.$onSuccess, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((EquipmentOverviewViewModel$getGear$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            g<Equipment> equipment = this.this$0.getInventoryRepository().getEquipment(this.$key);
            final pc.l<Equipment, w> lVar = this.$onSuccess;
            h<? super Equipment> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment.EquipmentOverviewViewModel$getGear$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Equipment) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(Equipment equipment2, Continuation<? super w> continuation) {
                    lVar.invoke(equipment2);
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (equipment.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
