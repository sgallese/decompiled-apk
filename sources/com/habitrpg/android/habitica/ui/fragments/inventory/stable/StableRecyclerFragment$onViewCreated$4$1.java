package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import ad.k0;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.ui.viewmodels.StableViewModel;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: StableRecyclerFragment.kt */
/* loaded from: classes4.dex */
final class StableRecyclerFragment$onViewCreated$4$1 extends r implements l<String, w> {
    final /* synthetic */ StableRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StableRecyclerFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableRecyclerFragment$onViewCreated$4$1$1", f = "StableRecyclerFragment.kt", l = {107}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableRecyclerFragment$onViewCreated$4$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ String $it;
        int label;
        final /* synthetic */ StableRecyclerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StableRecyclerFragment stableRecyclerFragment, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = stableRecyclerFragment;
            this.$it = str;
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
            StableViewModel viewModel;
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
                viewModel = this.this$0.getViewModel();
                if (q.d(viewModel.getItemType$Habitica_2311256681_prodRelease(), "pets")) {
                    str = "pet";
                } else {
                    str = "mount";
                }
                String str2 = this.$it;
                this.label = 1;
                if (inventoryRepository.equip(str, str2, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StableRecyclerFragment$onViewCreated$4$1(StableRecyclerFragment stableRecyclerFragment) {
        super(1);
        this.this$0 = stableRecyclerFragment;
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
