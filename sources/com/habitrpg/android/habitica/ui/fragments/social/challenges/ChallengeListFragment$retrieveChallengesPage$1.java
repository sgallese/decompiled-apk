package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import ad.k0;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import dc.n;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeListFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment$retrieveChallengesPage$1", f = "ChallengeListFragment.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChallengeListFragment$retrieveChallengesPage$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ ChallengeListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeListFragment$retrieveChallengesPage$1(ChallengeListFragment challengeListFragment, Continuation<? super ChallengeListFragment$retrieveChallengesPage$1> continuation) {
        super(2, continuation);
        this.this$0 = challengeListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ChallengeListFragment$retrieveChallengesPage$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ChallengeListFragment$retrieveChallengesPage$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        int i10;
        boolean z10;
        int i11;
        d10 = ic.d.d();
        int i12 = this.label;
        if (i12 != 0) {
            if (i12 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            ChallengeRepository challengeRepository = this.this$0.getChallengeRepository();
            i10 = this.this$0.nextPageToLoad;
            z10 = this.this$0.viewUserChallengesOnly;
            this.label = 1;
            obj = challengeRepository.retrieveChallenges(i10, z10, this);
            if (obj == d10) {
                return d10;
            }
        }
        List list = (List) obj;
        int i13 = 0;
        this.this$0.setRefreshing(false);
        if (list != null) {
            i13 = list.size();
        }
        if (i13 < 10) {
            this.this$0.loadedAllData = true;
        }
        ChallengeListFragment challengeListFragment = this.this$0;
        i11 = challengeListFragment.nextPageToLoad;
        challengeListFragment.nextPageToLoad = i11 + 1;
        return w.f13270a;
    }
}
