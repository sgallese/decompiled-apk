package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import ad.k0;
import com.habitrpg.android.habitica.models.social.Group;
import dc.n;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import pc.p;
import pc.q;

/* compiled from: ChallengeListFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment$onViewCreated$2", f = "ChallengeListFragment.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChallengeListFragment$onViewCreated$2 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ ChallengeListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChallengeListFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment$onViewCreated$2$1", f = "ChallengeListFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment$onViewCreated$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements q<Group, List<? extends Group>, Continuation<? super dc.l<? extends Group, ? extends List<? extends Group>>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // pc.q
        public final Object invoke(Group group, List<? extends Group> list, Continuation<? super dc.l<? extends Group, ? extends List<? extends Group>>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = group;
            anonymousClass1.L$1 = list;
            return anonymousClass1.invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                return new dc.l((Group) this.L$0, (List) this.L$1);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeListFragment$onViewCreated$2(ChallengeListFragment challengeListFragment, Continuation<? super ChallengeListFragment$onViewCreated$2> continuation) {
        super(2, continuation);
        this.this$0 = challengeListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ChallengeListFragment$onViewCreated$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ChallengeListFragment$onViewCreated$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            dd.g A = dd.i.A(this.this$0.getSocialRepository().getGroup(Group.TAVERN_ID), this.this$0.getSocialRepository().getUserGroups("guild"), new AnonymousClass1(null));
            final ChallengeListFragment challengeListFragment = this.this$0;
            dd.h hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment$onViewCreated$2.2
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((dc.l) obj2, (Continuation<? super w>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
                
                    r0 = r1.filterGroups;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(dc.l<? extends com.habitrpg.android.habitica.models.social.Group, ? extends java.util.List<? extends com.habitrpg.android.habitica.models.social.Group>> r2, kotlin.coroutines.Continuation<? super dc.w> r3) {
                    /*
                        r1 = this;
                        com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment r3 = com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment.this
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment.access$setFilterGroups$p(r3, r0)
                        java.lang.Object r3 = r2.c()
                        com.habitrpg.android.habitica.models.social.Group r3 = (com.habitrpg.android.habitica.models.social.Group) r3
                        if (r3 == 0) goto L21
                        com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment r0 = com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment.this
                        java.util.List r0 = com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment.access$getFilterGroups$p(r0)
                        if (r0 == 0) goto L21
                        boolean r3 = r0.add(r3)
                        kotlin.coroutines.jvm.internal.b.a(r3)
                    L21:
                        com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment r3 = com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment.this
                        java.util.List r3 = com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment.access$getFilterGroups$p(r3)
                        if (r3 == 0) goto L36
                        java.lang.Object r2 = r2.d()
                        java.util.Collection r2 = (java.util.Collection) r2
                        boolean r2 = r3.addAll(r2)
                        kotlin.coroutines.jvm.internal.b.a(r2)
                    L36:
                        dc.w r2 = dc.w.f13270a
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment$onViewCreated$2.AnonymousClass2.emit(dc.l, kotlin.coroutines.Continuation):java.lang.Object");
                }
            };
            this.label = 1;
            if (A.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
