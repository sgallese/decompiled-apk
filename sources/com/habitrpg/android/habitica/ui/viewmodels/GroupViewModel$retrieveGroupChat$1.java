package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import com.habitrpg.android.habitica.data.SocialRepository;
import dc.n;
import dc.w;
import ic.d;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$retrieveGroupChat$1", f = "GroupViewModel.kt", l = {280}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$retrieveGroupChat$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ f0<String> $groupID;
    final /* synthetic */ pc.a<w> $onComplete;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$retrieveGroupChat$1(GroupViewModel groupViewModel, f0<String> f0Var, pc.a<w> aVar, Continuation<? super GroupViewModel$retrieveGroupChat$1> continuation) {
        super(2, continuation);
        this.this$0 = groupViewModel;
        this.$groupID = f0Var;
        this.$onComplete = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GroupViewModel$retrieveGroupChat$1(this.this$0, this.$groupID, this.$onComplete, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GroupViewModel$retrieveGroupChat$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        androidx.lifecycle.f0 f0Var;
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
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            String str = this.$groupID.f21676f;
            this.label = 1;
            obj = socialRepository.retrieveGroupChat(str, this);
            if (obj == d10) {
                return d10;
            }
        }
        f0Var = this.this$0.get_chatMessages();
        f0Var.n((List) obj);
        this.$onComplete.invoke();
        return w.f13270a;
    }
}
