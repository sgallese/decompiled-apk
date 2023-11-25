package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import ad.k0;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* compiled from: ChallengeDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$3", f = "ChallengeDetailFragment.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChallengeDetailFragment$onViewCreated$3$3 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ ChallengeDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailFragment$onViewCreated$3$3(ChallengeDetailFragment challengeDetailFragment, String str, Continuation<? super ChallengeDetailFragment$onViewCreated$3$3> continuation) {
        super(2, continuation);
        this.this$0 = challengeDetailFragment;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ChallengeDetailFragment$onViewCreated$3$3(this.this$0, this.$id, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ChallengeDetailFragment$onViewCreated$3$3) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            dd.g<Boolean> isChallengeMember = this.this$0.getChallengeRepository().isChallengeMember(this.$id);
            final ChallengeDetailFragment challengeDetailFragment = this.this$0;
            dd.h<? super Boolean> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$3.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), continuation);
                }

                public final Object emit(boolean z10, Continuation<? super w> continuation) {
                    ChallengeDetailFragment.this.setJoined(z10);
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (isChallengeMember.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
