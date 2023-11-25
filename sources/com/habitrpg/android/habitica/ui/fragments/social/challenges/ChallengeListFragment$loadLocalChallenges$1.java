package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import ad.k0;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.ui.adapter.social.ChallengesListViewAdapter;
import dc.n;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeListFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment$loadLocalChallenges$1", f = "ChallengeListFragment.kt", l = {149}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChallengeListFragment$loadLocalChallenges$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ ChallengeListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeListFragment$loadLocalChallenges$1(ChallengeListFragment challengeListFragment, Continuation<? super ChallengeListFragment$loadLocalChallenges$1> continuation) {
        super(2, continuation);
        this.this$0 = challengeListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ChallengeListFragment$loadLocalChallenges$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ChallengeListFragment$loadLocalChallenges$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        boolean z10;
        dd.g<List<Challenge>> challenges;
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
            z10 = this.this$0.viewUserChallengesOnly;
            if (z10) {
                challenges = ChallengeRepository.DefaultImpls.getUserChallenges$default(this.this$0.getChallengeRepository(), null, 1, null);
            } else {
                challenges = this.this$0.getChallengeRepository().getChallenges();
            }
            final ChallengeListFragment challengeListFragment = this.this$0;
            dd.h<? super List<Challenge>> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment$loadLocalChallenges$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends Challenge> list, Continuation<? super w> continuation) {
                    ChallengesListViewAdapter challengesListViewAdapter;
                    if (list.isEmpty()) {
                        ChallengeListFragment.retrieveChallengesPage$Habitica_2311256681_prodRelease$default(ChallengeListFragment.this, false, 1, null);
                    }
                    ChallengeListFragment.this.challenges = list;
                    challengesListViewAdapter = ChallengeListFragment.this.challengeAdapter;
                    if (challengesListViewAdapter != null) {
                        challengesListViewAdapter.updateUnfilteredData(list);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (challenges.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
