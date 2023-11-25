package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import ad.k0;
import com.habitrpg.android.habitica.models.QuestAchievement;
import com.habitrpg.android.habitica.ui.adapter.inventory.ShopRecyclerAdapter;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import ec.u;
import ic.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: QuestShopFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.QuestShopFragment$onViewCreated$1", f = "QuestShopFragment.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class QuestShopFragment$onViewCreated$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ QuestShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestShopFragment$onViewCreated$1(QuestShopFragment questShopFragment, Continuation<? super QuestShopFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = questShopFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new QuestShopFragment$onViewCreated$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((QuestShopFragment$onViewCreated$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            g<List<QuestAchievement>> questAchievements = this.this$0.getUserRepository().getQuestAchievements();
            final QuestShopFragment questShopFragment = this.this$0;
            h<? super List<QuestAchievement>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.QuestShopFragment$onViewCreated$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends QuestAchievement> list, Continuation<? super w> continuation) {
                    int s10;
                    ShopRecyclerAdapter adapter = QuestShopFragment.this.getAdapter();
                    if (adapter != null) {
                        List<? extends QuestAchievement> list2 = list;
                        s10 = u.s(list2, 10);
                        ArrayList arrayList = new ArrayList(s10);
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((QuestAchievement) it.next()).getQuestKey());
                        }
                        adapter.setCompletedQuests(arrayList);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (questAchievements.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
