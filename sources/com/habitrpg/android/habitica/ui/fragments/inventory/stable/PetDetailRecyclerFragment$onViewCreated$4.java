package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import ad.k0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.extensions.BaseViewModelExtensionsKt;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.adapter.inventory.PetDetailRecyclerAdapter;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$onViewCreated$4;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: PetDetailRecyclerFragment.kt */
/* loaded from: classes4.dex */
final class PetDetailRecyclerFragment$onViewCreated$4 extends r implements l<String, w> {
    final /* synthetic */ PetDetailRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PetDetailRecyclerFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$onViewCreated$4$1", f = "PetDetailRecyclerFragment.kt", l = {133}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$onViewCreated$4$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ String $it;
        int label;
        final /* synthetic */ PetDetailRecyclerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PetDetailRecyclerFragment petDetailRecyclerFragment, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = petDetailRecyclerFragment;
            this.$it = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(PetDetailRecyclerFragment petDetailRecyclerFragment, User user) {
            Integer num;
            MainActivity mainActivity = petDetailRecyclerFragment.getMainActivity();
            if (user != null) {
                num = Integer.valueOf(user.getLoginIncentives());
            } else {
                num = null;
            }
            if (num != null && mainActivity != null) {
                petDetailRecyclerFragment.getReviewManager().requestReview(mainActivity, num.intValue());
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
            String str;
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
                String str2 = this.$it;
                this.label = 1;
                obj = inventoryRepository.equip("pet", str2, this);
                if (obj == d10) {
                    return d10;
                }
            }
            Items items = (Items) obj;
            PetDetailRecyclerAdapter adapter = this.this$0.getAdapter();
            if (items != null) {
                str = items.getCurrentPet();
            } else {
                str = null;
            }
            adapter.setCurrentPet(str);
            LiveData<User> user = this.this$0.getUserViewModel().getUser();
            v viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            q.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            final PetDetailRecyclerFragment petDetailRecyclerFragment = this.this$0;
            BaseViewModelExtensionsKt.observeOnce(user, viewLifecycleOwner, new g0() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.stable.d
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj2) {
                    PetDetailRecyclerFragment$onViewCreated$4.AnonymousClass1.invokeSuspend$lambda$0(PetDetailRecyclerFragment.this, (User) obj2);
                }
            });
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetDetailRecyclerFragment$onViewCreated$4(PetDetailRecyclerFragment petDetailRecyclerFragment) {
        super(1);
        this.this$0 = petDetailRecyclerFragment;
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
