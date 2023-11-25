package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import ad.k0;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.social.Challenge;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$4$1$1", f = "ChallengeDetailFragment.kt", l = {156, 157}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChallengeDetailFragment$onViewCreated$4$1$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Challenge $challenge;
    int label;
    final /* synthetic */ ChallengeDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailFragment$onViewCreated$4$1$1(ChallengeDetailFragment challengeDetailFragment, Challenge challenge, Continuation<? super ChallengeDetailFragment$onViewCreated$4$1$1> continuation) {
        super(2, continuation);
        this.this$0 = challengeDetailFragment;
        this.$challenge = challenge;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ChallengeDetailFragment$onViewCreated$4$1$1(this.this$0, this.$challenge, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ChallengeDetailFragment$onViewCreated$4$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            Challenge challenge = this.$challenge;
            this.label = 1;
            if (challengeRepository.joinChallenge(challenge, this) == d10) {
                return d10;
            }
        }
        UserRepository userRepository = this.this$0.getUserRepository();
        this.label = 2;
        if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, true, false, false, this, 6, null) == d10) {
            return d10;
        }
        return w.f13270a;
    }
}
