package com.habitrpg.android.habitica.ui.fragments.inventory.equipment;

import ad.k0;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.ui.adapter.inventory.EquipmentRecyclerViewAdapter;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import ic.d;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: EquipmentDetailFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.equipment.EquipmentDetailFragment$onViewCreated$4$1", f = "EquipmentDetailFragment.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class EquipmentDetailFragment$onViewCreated$4$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ EquipmentDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquipmentDetailFragment$onViewCreated$4$1(EquipmentDetailFragment equipmentDetailFragment, String str, Continuation<? super EquipmentDetailFragment$onViewCreated$4$1> continuation) {
        super(2, continuation);
        this.this$0 = equipmentDetailFragment;
        this.$type = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new EquipmentDetailFragment$onViewCreated$4$1(this.this$0, this.$type, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((EquipmentDetailFragment$onViewCreated$4$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            g<List<Equipment>> ownedEquipment = this.this$0.getInventoryRepository().getOwnedEquipment(this.$type);
            final EquipmentDetailFragment equipmentDetailFragment = this.this$0;
            h<? super List<Equipment>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.equipment.EquipmentDetailFragment$onViewCreated$4$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends Equipment> list, Continuation<? super w> continuation) {
                    EquipmentRecyclerViewAdapter equipmentRecyclerViewAdapter;
                    equipmentRecyclerViewAdapter = EquipmentDetailFragment.this.adapter;
                    equipmentRecyclerViewAdapter.setData(list);
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (ownedEquipment.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
