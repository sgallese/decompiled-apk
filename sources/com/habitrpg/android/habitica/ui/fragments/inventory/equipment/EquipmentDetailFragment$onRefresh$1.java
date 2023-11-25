package com.habitrpg.android.habitica.ui.fragments.inventory.equipment;

import ad.k0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: EquipmentDetailFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.equipment.EquipmentDetailFragment$onRefresh$1", f = "EquipmentDetailFragment.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class EquipmentDetailFragment$onRefresh$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ EquipmentDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquipmentDetailFragment$onRefresh$1(EquipmentDetailFragment equipmentDetailFragment, Continuation<? super EquipmentDetailFragment$onRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = equipmentDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new EquipmentDetailFragment$onRefresh$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((EquipmentDetailFragment$onRefresh$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        SwipeRefreshLayout swipeRefreshLayout;
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
            UserRepository userRepository = this.this$0.getUserRepository();
            this.label = 1;
            if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, true, true, false, this, 4, null) == d10) {
                return d10;
            }
        }
        FragmentRefreshRecyclerviewBinding binding = this.this$0.getBinding();
        if (binding != null) {
            swipeRefreshLayout = binding.refreshLayout;
        } else {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return w.f13270a;
    }
}
