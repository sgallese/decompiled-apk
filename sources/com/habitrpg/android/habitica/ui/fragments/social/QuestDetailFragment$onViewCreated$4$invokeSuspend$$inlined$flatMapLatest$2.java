package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.models.inventory.QuestContent;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* compiled from: Merge.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.QuestDetailFragment$onViewCreated$4$invokeSuspend$$inlined$flatMapLatest$2", f = "QuestDetailFragment.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class QuestDetailFragment$onViewCreated$4$invokeSuspend$$inlined$flatMapLatest$2 extends l implements q<dd.h<? super QuestContent>, String, Continuation<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ QuestDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestDetailFragment$onViewCreated$4$invokeSuspend$$inlined$flatMapLatest$2(Continuation continuation, QuestDetailFragment questDetailFragment) {
        super(3, continuation);
        this.this$0 = questDetailFragment;
    }

    @Override // pc.q
    public final Object invoke(dd.h<? super QuestContent> hVar, String str, Continuation<? super w> continuation) {
        QuestDetailFragment$onViewCreated$4$invokeSuspend$$inlined$flatMapLatest$2 questDetailFragment$onViewCreated$4$invokeSuspend$$inlined$flatMapLatest$2 = new QuestDetailFragment$onViewCreated$4$invokeSuspend$$inlined$flatMapLatest$2(continuation, this.this$0);
        questDetailFragment$onViewCreated$4$invokeSuspend$$inlined$flatMapLatest$2.L$0 = hVar;
        questDetailFragment$onViewCreated$4$invokeSuspend$$inlined$flatMapLatest$2.L$1 = str;
        return questDetailFragment$onViewCreated$4$invokeSuspend$$inlined$flatMapLatest$2.invokeSuspend(w.f13270a);
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
            dd.h hVar = (dd.h) this.L$0;
            dd.g<QuestContent> questContent = this.this$0.getInventoryRepository().getQuestContent((String) this.L$1);
            this.label = 1;
            if (dd.i.r(hVar, questContent, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
