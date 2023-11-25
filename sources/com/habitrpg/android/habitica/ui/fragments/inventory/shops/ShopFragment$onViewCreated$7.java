package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import ad.k0;
import com.habitrpg.android.habitica.ui.adapter.inventory.ShopRecyclerAdapter;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$7", f = "ShopFragment.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ShopFragment$onViewCreated$7 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$onViewCreated$7(ShopFragment shopFragment, Continuation<? super ShopFragment$onViewCreated$7> continuation) {
        super(2, continuation);
        this.this$0 = shopFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ShopFragment$onViewCreated$7(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ShopFragment$onViewCreated$7) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            g<Integer> armoireRemainingCount = this.this$0.getInventoryRepository().getArmoireRemainingCount();
            final ShopFragment shopFragment = this.this$0;
            h<? super Integer> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$7.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), continuation);
                }

                public final Object emit(int i11, Continuation<? super w> continuation) {
                    ShopRecyclerAdapter adapter = ShopFragment.this.getAdapter();
                    if (adapter != null) {
                        adapter.setArmoireCount(i11);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (armoireRemainingCount.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
