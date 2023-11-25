package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.models.social.Challenge;
import dc.n;
import dc.w;
import ic.d;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$leaveGroup$1", f = "GroupViewModel.kt", l = {183}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$leaveGroup$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ List<Challenge> $groupChallenges;
    Object L$0;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupViewModel$leaveGroup$1(List<? extends Challenge> list, GroupViewModel groupViewModel, Continuation<? super GroupViewModel$leaveGroup$1> continuation) {
        super(2, continuation);
        this.$groupChallenges = list;
        this.this$0 = groupViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GroupViewModel$leaveGroup$1(this.$groupChallenges, this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GroupViewModel$leaveGroup$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Iterator<Challenge> it;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                it = (Iterator) this.L$0;
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            it = this.$groupChallenges.iterator();
        }
        while (it.hasNext()) {
            Challenge next = it.next();
            ChallengeRepository challengeRepository = this.this$0.getChallengeRepository();
            this.L$0 = it;
            this.label = 1;
            if (challengeRepository.leaveChallenge(next, "remove-all", this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
