package com.habitrpg.android.habitica.ui.fragments.inventory.equipment;

import ad.k0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.extensions.BaseViewModelExtensionsKt;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.fragments.inventory.equipment.EquipmentDetailFragment$onCreateView$1;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: EquipmentDetailFragment.kt */
/* loaded from: classes4.dex */
final class EquipmentDetailFragment$onCreateView$1 extends r implements l<String, w> {
    final /* synthetic */ EquipmentDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EquipmentDetailFragment.kt */
    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.equipment.EquipmentDetailFragment$onCreateView$1$1", f = "EquipmentDetailFragment.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.equipment.EquipmentDetailFragment$onCreateView$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ String $it;
        int label;
        final /* synthetic */ EquipmentDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(EquipmentDetailFragment equipmentDetailFragment, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = equipmentDetailFragment;
            this.$it = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(EquipmentDetailFragment equipmentDetailFragment, User user) {
            Integer num;
            MainActivity mainActivity = equipmentDetailFragment.getMainActivity();
            if (user != null) {
                num = Integer.valueOf(user.getLoginIncentives());
            } else {
                num = null;
            }
            if (num != null && mainActivity != null) {
                equipmentDetailFragment.getReviewManager().requestReview(mainActivity, num.intValue());
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$it, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            boolean z10;
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
                InventoryRepository inventoryRepository = this.this$0.getInventoryRepository();
                String str = this.$it;
                Boolean isCostume = this.this$0.isCostume();
                if (isCostume != null) {
                    z10 = isCostume.booleanValue();
                } else {
                    z10 = false;
                }
                this.label = 1;
                if (inventoryRepository.equipGear(str, z10, this) == d10) {
                    return d10;
                }
            }
            LiveData<User> user = this.this$0.getUserViewModel().getUser();
            v viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            q.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            final EquipmentDetailFragment equipmentDetailFragment = this.this$0;
            BaseViewModelExtensionsKt.observeOnce(user, viewLifecycleOwner, new g0() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.equipment.a
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj2) {
                    EquipmentDetailFragment$onCreateView$1.AnonymousClass1.invokeSuspend$lambda$0(EquipmentDetailFragment.this, (User) obj2);
                }
            });
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquipmentDetailFragment$onCreateView$1(EquipmentDetailFragment equipmentDetailFragment) {
        super(1);
        this.this$0 = equipmentDetailFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        q.i(str, "it");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, str, null), 1, null);
    }
}
