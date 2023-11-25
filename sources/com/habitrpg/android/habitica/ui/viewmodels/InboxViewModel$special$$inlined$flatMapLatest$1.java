package com.habitrpg.android.habitica.ui.viewmodels;

import ac.b;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.members.Member;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ic.d;
import io.realm.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* compiled from: Merge.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel$special$$inlined$flatMapLatest$1", f = "InboxViewModel.kt", l = {219, 193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class InboxViewModel$special$$inlined$flatMapLatest$1 extends l implements q<h<? super Member>, String, Continuation<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InboxViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, InboxViewModel inboxViewModel) {
        super(3, continuation);
        this.this$0 = inboxViewModel;
    }

    @Override // pc.q
    public final Object invoke(h<? super Member> hVar, String str, Continuation<? super w> continuation) {
        InboxViewModel$special$$inlined$flatMapLatest$1 inboxViewModel$special$$inlined$flatMapLatest$1 = new InboxViewModel$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        inboxViewModel$special$$inlined$flatMapLatest$1.L$0 = hVar;
        inboxViewModel$special$$inlined$flatMapLatest$1.L$1 = str;
        return inboxViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        h hVar;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) this.L$0;
            n.b(obj);
        } else {
            n.b(obj);
            hVar = (h) this.L$0;
            String str = (String) this.L$1;
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            this.L$0 = hVar;
            this.label = 1;
            obj = SocialRepository.DefaultImpls.retrieveMember$default(socialRepository, str, false, this, 2, null);
            if (obj == d10) {
                return d10;
            }
        }
        g a10 = b.a((a1) obj);
        this.L$0 = null;
        this.label = 2;
        if (i.r(hVar, a10, this) == d10) {
            return d10;
        }
        return w.f13270a;
    }
}
