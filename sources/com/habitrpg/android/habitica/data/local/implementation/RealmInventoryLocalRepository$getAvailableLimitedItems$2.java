package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.Item;
import dc.n;
import dc.w;
import ic.d;
import io.realm.g1;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* compiled from: RealmInventoryLocalRepository.kt */
@f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getAvailableLimitedItems$2", f = "RealmInventoryLocalRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RealmInventoryLocalRepository$getAvailableLimitedItems$2 extends l implements q<List<Item>, g1<Food>, Continuation<? super List<Item>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealmInventoryLocalRepository$getAvailableLimitedItems$2(Continuation<? super RealmInventoryLocalRepository$getAvailableLimitedItems$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        d.d();
        if (this.label == 0) {
            n.b(obj);
            List list = (List) this.L$0;
            list.addAll((g1) this.L$1);
            return list;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // pc.q
    public final Object invoke(List<Item> list, g1<Food> g1Var, Continuation<? super List<Item>> continuation) {
        RealmInventoryLocalRepository$getAvailableLimitedItems$2 realmInventoryLocalRepository$getAvailableLimitedItems$2 = new RealmInventoryLocalRepository$getAvailableLimitedItems$2(continuation);
        realmInventoryLocalRepository$getAvailableLimitedItems$2.L$0 = list;
        realmInventoryLocalRepository$getAvailableLimitedItems$2.L$1 = g1Var;
        return realmInventoryLocalRepository$getAvailableLimitedItems$2.invokeSuspend(w.f13270a);
    }
}
