package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import ad.k0;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.ui.adapter.inventory.ItemRecyclerAdapter;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: ItemRecyclerFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$2", f = "ItemRecyclerFragment.kt", l = {312}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ItemRecyclerFragment$loadItems$1$2 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ ItemRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemRecyclerFragment$loadItems$1$2(ItemRecyclerFragment itemRecyclerFragment, Continuation<? super ItemRecyclerFragment$loadItems$1$2> continuation) {
        super(2, continuation);
        this.this$0 = itemRecyclerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ItemRecyclerFragment$loadItems$1$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ItemRecyclerFragment$loadItems$1$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            g<List<Pet>> pets = this.this$0.getInventoryRepository().getPets();
            final ItemRecyclerFragment itemRecyclerFragment = this.this$0;
            h<? super List<Pet>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$2.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends Pet> list, Continuation<? super w> continuation) {
                    ItemRecyclerAdapter adapter = ItemRecyclerFragment.this.getAdapter();
                    if (adapter != null) {
                        adapter.setExistingPets(list);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (pets.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
