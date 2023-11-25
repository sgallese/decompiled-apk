package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import ad.k0;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import dc.n;
import dc.w;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: PetDetailRecyclerFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$2", f = "PetDetailRecyclerFragment.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PetDetailRecyclerFragment$loadItems$2 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ PetDetailRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetDetailRecyclerFragment$loadItems$2(PetDetailRecyclerFragment petDetailRecyclerFragment, Continuation<? super PetDetailRecyclerFragment$loadItems$2> continuation) {
        super(2, continuation);
        this.this$0 = petDetailRecyclerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PetDetailRecyclerFragment$loadItems$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PetDetailRecyclerFragment$loadItems$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            dd.g<Map<String, OwnedItem>> ownedItems = this.this$0.getInventoryRepository().getOwnedItems(true);
            final PetDetailRecyclerFragment petDetailRecyclerFragment = this.this$0;
            dd.h<? super Map<String, OwnedItem>> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$2.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Map) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(Map<String, ? extends OwnedItem> map, Continuation<? super w> continuation) {
                    PetDetailRecyclerFragment.this.getAdapter().setOwnedItems(map);
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (ownedItems.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
