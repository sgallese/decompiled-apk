package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ItemRecyclerFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$useSpecialItem$1", f = "ItemRecyclerFragment.kt", l = {346}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ItemRecyclerFragment$useSpecialItem$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $memberID;
    final /* synthetic */ SpecialItem $specialItem;
    int label;
    final /* synthetic */ ItemRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemRecyclerFragment$useSpecialItem$1(ItemRecyclerFragment itemRecyclerFragment, SpecialItem specialItem, String str, Continuation<? super ItemRecyclerFragment$useSpecialItem$1> continuation) {
        super(2, continuation);
        this.this$0 = itemRecyclerFragment;
        this.$specialItem = specialItem;
        this.$memberID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ItemRecyclerFragment$useSpecialItem$1(this.this$0, this.$specialItem, this.$memberID, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ItemRecyclerFragment$useSpecialItem$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            UserRepository userRepository = this.this$0.getUserRepository();
            String key = this.$specialItem.getKey();
            String target = this.$specialItem.getTarget();
            String str = this.$memberID;
            this.label = 1;
            if (userRepository.useSkill(key, target, str, this) == d10) {
                return d10;
            }
        }
        this.this$0.displaySpecialItemResult(this.$specialItem);
        return w.f13270a;
    }
}
