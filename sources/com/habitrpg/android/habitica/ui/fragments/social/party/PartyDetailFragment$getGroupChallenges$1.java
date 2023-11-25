package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$getGroupChallenges$1", f = "PartyDetailFragment.kt", l = {463}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PartyDetailFragment$getGroupChallenges$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ List<Challenge> $groupChallenges;
    int label;
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$getGroupChallenges$1(PartyDetailFragment partyDetailFragment, List<Challenge> list, Continuation<? super PartyDetailFragment$getGroupChallenges$1> continuation) {
        super(2, continuation);
        this.this$0 = partyDetailFragment;
        this.$groupChallenges = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PartyDetailFragment$getGroupChallenges$1(this.this$0, this.$groupChallenges, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PartyDetailFragment$getGroupChallenges$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            dd.g<User> user = this.this$0.getUserRepository().getUser();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$groupChallenges);
            this.label = 1;
            if (user.collect(anonymousClass1, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartyDetailFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$getGroupChallenges$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements dd.h {
        final /* synthetic */ List<Challenge> $groupChallenges;
        final /* synthetic */ PartyDetailFragment this$0;

        AnonymousClass1(PartyDetailFragment partyDetailFragment, List<Challenge> list) {
            this.this$0 = partyDetailFragment;
            this.$groupChallenges = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0075 -> B:24:0x0078). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.habitrpg.android.habitica.models.user.User r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$getGroupChallenges$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$getGroupChallenges$1$1$emit$1 r0 = (com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$getGroupChallenges$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$getGroupChallenges$1$1$emit$1 r0 = new com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$getGroupChallenges$1$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3d
                if (r2 != r3) goto L35
                java.lang.Object r8 = r0.L$2
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.L$1
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r4 = r0.L$0
                com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment r4 = (com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment) r4
                dc.n.b(r9)
                goto L78
            L35:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3d:
                dc.n.b(r9)
                if (r8 == 0) goto L92
                io.realm.x0 r8 = r8.getChallenges()
                if (r8 == 0) goto L92
                com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment r9 = r7.this$0
                java.util.List<com.habitrpg.android.habitica.models.social.Challenge> r2 = r7.$groupChallenges
                java.util.Iterator r8 = r8.iterator()
                r4 = r9
            L51:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L92
                java.lang.Object r9 = r8.next()
                com.habitrpg.android.habitica.models.social.ChallengeMembership r9 = (com.habitrpg.android.habitica.models.social.ChallengeMembership) r9
                com.habitrpg.android.habitica.data.ChallengeRepository r5 = r4.getChallengeRepository()
                java.lang.String r9 = r9.getChallengeID()
                dd.g r9 = r5.getChallenge(r9)
                r0.L$0 = r4
                r0.L$1 = r2
                r0.L$2 = r8
                r0.label = r3
                java.lang.Object r9 = dd.i.x(r9, r0)
                if (r9 != r1) goto L78
                return r1
            L78:
                com.habitrpg.android.habitica.models.social.Challenge r9 = (com.habitrpg.android.habitica.models.social.Challenge) r9
                if (r9 == 0) goto L51
                java.lang.String r5 = r9.getGroupId()
                com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel r6 = r4.getViewModel()
                java.lang.String r6 = r6.getGroupID()
                boolean r5 = qc.q.d(r5, r6)
                if (r5 == 0) goto L51
                r2.add(r9)
                goto L51
            L92:
                dc.w r8 = dc.w.f13270a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$getGroupChallenges$1.AnonymousClass1.emit(com.habitrpg.android.habitica.models.user.User, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // dd.h
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((User) obj, (Continuation<? super w>) continuation);
        }
    }
}
