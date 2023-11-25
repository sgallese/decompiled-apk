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

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ItemDialogFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$2", f = "ItemDialogFragment.kt", l = {324}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ItemDialogFragment$loadItems$1$2 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ ItemDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemDialogFragment$loadItems$1$2(ItemDialogFragment itemDialogFragment, Continuation<? super ItemDialogFragment$loadItems$1$2> continuation) {
        super(2, continuation);
        this.this$0 = itemDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ItemDialogFragment$loadItems$1$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ItemDialogFragment$loadItems$1$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            final ItemDialogFragment itemDialogFragment = this.this$0;
            h<? super List<Pet>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$2.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends Pet> list, Continuation<? super w> continuation) {
                    ItemRecyclerAdapter adapter = ItemDialogFragment.this.getAdapter();
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
