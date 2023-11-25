package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import ad.k0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: ItemRecyclerFragment.kt */
/* loaded from: classes4.dex */
final class ItemRecyclerFragment$setAdapter$4 extends r implements l<QuestContent, w> {
    final /* synthetic */ ItemRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemRecyclerFragment.kt */
    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$setAdapter$4$1", f = "ItemRecyclerFragment.kt", l = {168}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$setAdapter$4$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ QuestContent $it;
        int label;
        final /* synthetic */ ItemRecyclerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ItemRecyclerFragment itemRecyclerFragment, QuestContent questContent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = itemRecyclerFragment;
            this.$it = questContent;
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
                QuestContent questContent = this.$it;
                this.label = 1;
                if (inventoryRepository.inviteToQuest(questContent, this) == d10) {
                    return d10;
                }
            }
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.partyFragment, null, 2, null);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemRecyclerFragment$setAdapter$4(ItemRecyclerFragment itemRecyclerFragment) {
        super(1);
        this.this$0 = itemRecyclerFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(QuestContent questContent) {
        invoke2(questContent);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(QuestContent questContent) {
        q.i(questContent, "it");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, questContent, null), 1, null);
    }
}
