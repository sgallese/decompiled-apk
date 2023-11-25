package com.habitrpg.android.habitica.data.local.implementation;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.ChallengeMembership;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ec.u;
import ic.d;
import io.realm.RealmQuery;
import io.realm.g1;
import io.realm.j1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* compiled from: Merge.kt */
@f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository$getUserChallenges$$inlined$flatMapLatest$1", f = "RealmChallengeLocalRepository.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class RealmChallengeLocalRepository$getUserChallenges$$inlined$flatMapLatest$1 extends l implements q<h<? super g1<Challenge>>, g1<ChallengeMembership>, Continuation<? super w>, Object> {
    final /* synthetic */ String $userId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ RealmChallengeLocalRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmChallengeLocalRepository$getUserChallenges$$inlined$flatMapLatest$1(Continuation continuation, RealmChallengeLocalRepository realmChallengeLocalRepository, String str) {
        super(3, continuation);
        this.this$0 = realmChallengeLocalRepository;
        this.$userId$inlined = str;
    }

    @Override // pc.q
    public final Object invoke(h<? super g1<Challenge>> hVar, g1<ChallengeMembership> g1Var, Continuation<? super w> continuation) {
        RealmChallengeLocalRepository$getUserChallenges$$inlined$flatMapLatest$1 realmChallengeLocalRepository$getUserChallenges$$inlined$flatMapLatest$1 = new RealmChallengeLocalRepository$getUserChallenges$$inlined$flatMapLatest$1(continuation, this.this$0, this.$userId$inlined);
        realmChallengeLocalRepository$getUserChallenges$$inlined$flatMapLatest$1.L$0 = hVar;
        realmChallengeLocalRepository$getUserChallenges$$inlined$flatMapLatest$1.L$1 = g1Var;
        return realmChallengeLocalRepository$getUserChallenges$$inlined$flatMapLatest$1.invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        int s10;
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
            h hVar = (h) this.L$0;
            g1 g1Var = (g1) this.L$1;
            s10 = u.s(g1Var, 10);
            ArrayList arrayList = new ArrayList(s10);
            Iterator<E> it = g1Var.iterator();
            while (it.hasNext()) {
                arrayList.add(((ChallengeMembership) it.next()).getChallengeID());
            }
            RealmQuery j10 = this.this$0.getRealm().k1(Challenge.class).z(AppMeasurementSdk.ConditionalUserProperty.NAME).b().v("id", (String[]) arrayList.toArray(new String[0])).H().n("leaderId", this.$userId$inlined).j();
            j1 j1Var = j1.DESCENDING;
            g1 p10 = j10.K("official", j1Var, "createdAt", j1Var).p();
            qc.q.h(p10, "findAll(...)");
            final g a10 = ac.c.a(p10);
            g<g1<Challenge>> gVar = new g<g1<Challenge>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository$getUserChallenges$lambda$12$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository$getUserChallenges$lambda$12$$inlined$filter$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository$getUserChallenges$lambda$12$$inlined$filter$1$2", f = "RealmChallengeLocalRepository.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository$getUserChallenges$lambda$12$$inlined$filter$1$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        Object L$1;
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

                    public AnonymousClass2(h hVar) {
                        this.$this_unsafeFlow = hVar;
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
                            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository$getUserChallenges$lambda$12$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository$getUserChallenges$lambda$12$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository$getUserChallenges$lambda$12$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository$getUserChallenges$lambda$12$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository$getUserChallenges$lambda$12$$inlined$filter$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r6)
                            goto L48
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            dc.n.b(r6)
                            dd.h r6 = r4.$this_unsafeFlow
                            r2 = r5
                            io.realm.g1 r2 = (io.realm.g1) r2
                            boolean r2 = r2.isLoaded()
                            if (r2 == 0) goto L48
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L48
                            return r1
                        L48:
                            dc.w r5 = dc.w.f13270a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository$getUserChallenges$lambda$12$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super g1<Challenge>> hVar2, Continuation continuation) {
                    Object d11;
                    Object collect = g.this.collect(new AnonymousClass2(hVar2), continuation);
                    d11 = d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (i.r(hVar, gVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
