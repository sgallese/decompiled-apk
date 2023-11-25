package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.members.Member;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ic.d;
import io.realm.g1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* compiled from: Merge.kt */
@f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembers$$inlined$flatMapLatest$1", f = "RealmSocialLocalRepository.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class RealmSocialLocalRepository$getGroupMembers$$inlined$flatMapLatest$1 extends l implements q<h<? super g1<Member>>, String[], Continuation<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ RealmSocialLocalRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmSocialLocalRepository$getGroupMembers$$inlined$flatMapLatest$1(Continuation continuation, RealmSocialLocalRepository realmSocialLocalRepository) {
        super(3, continuation);
        this.this$0 = realmSocialLocalRepository;
    }

    @Override // pc.q
    public final Object invoke(h<? super g1<Member>> hVar, String[] strArr, Continuation<? super w> continuation) {
        RealmSocialLocalRepository$getGroupMembers$$inlined$flatMapLatest$1 realmSocialLocalRepository$getGroupMembers$$inlined$flatMapLatest$1 = new RealmSocialLocalRepository$getGroupMembers$$inlined$flatMapLatest$1(continuation, this.this$0);
        realmSocialLocalRepository$getGroupMembers$$inlined$flatMapLatest$1.L$0 = hVar;
        realmSocialLocalRepository$getGroupMembers$$inlined$flatMapLatest$1.L$1 = strArr;
        return realmSocialLocalRepository$getGroupMembers$$inlined$flatMapLatest$1.invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            g1 p10 = this.this$0.getRealm().k1(Member.class).v("id", (String[]) this.L$1).p();
            qc.q.h(p10, "findAll(...)");
            g a10 = ac.c.a(p10);
            this.label = 1;
            if (i.r(hVar, a10, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
