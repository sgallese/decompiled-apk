package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import ad.k0;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$refresh$1$2", f = "ChallengeDetailFragment.kt", l = {228, 229}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChallengeDetailFragment$refresh$1$2 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ ChallengeDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailFragment$refresh$1$2(ChallengeDetailFragment challengeDetailFragment, String str, Continuation<? super ChallengeDetailFragment$refresh$1$2> continuation) {
        super(2, continuation);
        this.this$0 = challengeDetailFragment;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ChallengeDetailFragment$refresh$1$2(this.this$0, this.$id, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ChallengeDetailFragment$refresh$1$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            ChallengeRepository challengeRepository = this.this$0.getChallengeRepository();
            String str = this.$id;
            this.label = 1;
            if (challengeRepository.retrieveChallenge(str, this) == d10) {
                return d10;
            }
        }
        ChallengeRepository challengeRepository2 = this.this$0.getChallengeRepository();
        String str2 = this.$id;
        this.label = 2;
        if (challengeRepository2.retrieveChallengeTasks(str2, this) == d10) {
            return d10;
        }
        return w.f13270a;
    }
}
