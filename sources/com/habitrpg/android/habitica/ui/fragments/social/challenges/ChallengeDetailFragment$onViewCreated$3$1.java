package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.social.Challenge;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* compiled from: ChallengeDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1", f = "ChallengeDetailFragment.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChallengeDetailFragment$onViewCreated$3$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ ChallengeDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChallengeDetailFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2<T> implements dd.h {
        final /* synthetic */ ChallengeDetailFragment this$0;

        AnonymousClass2(ChallengeDetailFragment challengeDetailFragment) {
            this.this$0 = challengeDetailFragment;
        }

        @Override // dd.h
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((String) obj, (Continuation<? super w>) continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.String r9, kotlin.coroutines.Continuation<? super dc.w> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$2$emit$1
                if (r0 == 0) goto L13
                r0 = r10
                com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$2$emit$1 r0 = (com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$2$emit$1 r0 = new com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$2$emit$1
                r0.<init>(r8, r10)
            L18:
                r4 = r0
                java.lang.Object r10 = r4.result
                java.lang.Object r0 = ic.b.d()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L36
                if (r1 != r2) goto L2e
                java.lang.Object r9 = r4.L$0
                com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment r9 = (com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment) r9
                dc.n.b(r10)
                goto L51
            L2e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L36:
                dc.n.b(r10)
                com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment r10 = r8.this$0
                com.habitrpg.android.habitica.data.SocialRepository r1 = r10.getSocialRepository()
                r3 = 0
                r5 = 2
                r6 = 0
                r4.L$0 = r10
                r4.label = r2
                r2 = r9
                java.lang.Object r9 = com.habitrpg.android.habitica.data.SocialRepository.DefaultImpls.retrieveMember$default(r1, r2, r3, r4, r5, r6)
                if (r9 != r0) goto L4e
                return r0
            L4e:
                r7 = r10
                r10 = r9
                r9 = r7
            L51:
                com.habitrpg.android.habitica.models.members.Member r10 = (com.habitrpg.android.habitica.models.members.Member) r10
                com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment.access$set(r9, r10)
                dc.w r9 = dc.w.f13270a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1.AnonymousClass2.emit(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailFragment$onViewCreated$3$1(ChallengeDetailFragment challengeDetailFragment, String str, Continuation<? super ChallengeDetailFragment$onViewCreated$3$1> continuation) {
        super(2, continuation);
        this.this$0 = challengeDetailFragment;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ChallengeDetailFragment$onViewCreated$3$1(this.this$0, this.$id, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ChallengeDetailFragment$onViewCreated$3$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            final dd.g<Challenge> challenge = this.this$0.getChallengeRepository().getChallenge(this.$id);
            final ChallengeDetailFragment challengeDetailFragment = this.this$0;
            dd.g l10 = dd.i.l(new dd.g<String>() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements dd.h {
                    final /* synthetic */ dd.h $this_unsafeFlow;
                    final /* synthetic */ ChallengeDetailFragment this$0;

                    /* compiled from: Emitters.kt */
                    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1$2", f = "ChallengeDetailFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= RecyclerView.UNDEFINED_DURATION;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(dd.h hVar, ChallengeDetailFragment challengeDetailFragment) {
                        this.$this_unsafeFlow = hVar;
                        this.this$0 = challengeDetailFragment;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // dd.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r6)
                            goto L4e
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            dc.n.b(r6)
                            dd.h r6 = r4.$this_unsafeFlow
                            com.habitrpg.android.habitica.models.social.Challenge r5 = (com.habitrpg.android.habitica.models.social.Challenge) r5
                            com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment r2 = r4.this$0
                            com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment.access$set(r2, r5)
                            java.lang.String r5 = r5.getLeaderId()
                            if (r5 != 0) goto L45
                            java.lang.String r5 = ""
                        L45:
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4e
                            return r1
                        L4e:
                            dc.w r5 = dc.w.f13270a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(dd.h<? super String> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = dd.g.this.collect(new AnonymousClass2(hVar, challengeDetailFragment), continuation);
                    d11 = ic.d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            if (l10.collect(anonymousClass2, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
