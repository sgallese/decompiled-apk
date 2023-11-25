package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.GroupMembership;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
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
@f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getUserGroups$$inlined$flatMapLatest$1", f = "RealmSocialLocalRepository.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class RealmSocialLocalRepository$getUserGroups$$inlined$flatMapLatest$1 extends l implements q<h<? super g1<Group>>, g1<GroupMembership>, Continuation<? super w>, Object> {
    final /* synthetic */ String $type$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ RealmSocialLocalRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmSocialLocalRepository$getUserGroups$$inlined$flatMapLatest$1(Continuation continuation, RealmSocialLocalRepository realmSocialLocalRepository, String str) {
        super(3, continuation);
        this.this$0 = realmSocialLocalRepository;
        this.$type$inlined = str;
    }

    @Override // pc.q
    public final Object invoke(h<? super g1<Group>> hVar, g1<GroupMembership> g1Var, Continuation<? super w> continuation) {
        RealmSocialLocalRepository$getUserGroups$$inlined$flatMapLatest$1 realmSocialLocalRepository$getUserGroups$$inlined$flatMapLatest$1 = new RealmSocialLocalRepository$getUserGroups$$inlined$flatMapLatest$1(continuation, this.this$0, this.$type$inlined);
        realmSocialLocalRepository$getUserGroups$$inlined$flatMapLatest$1.L$0 = hVar;
        realmSocialLocalRepository$getUserGroups$$inlined$flatMapLatest$1.L$1 = g1Var;
        return realmSocialLocalRepository$getUserGroups$$inlined$flatMapLatest$1.invokeSuspend(w.f13270a);
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
            RealmQuery k12 = this.this$0.getRealm().k1(Group.class);
            String str = this.$type$inlined;
            if (str == null) {
                str = "guild";
            }
            RealmQuery n10 = k12.n(TaskFormActivity.TASK_TYPE_KEY, str);
            s10 = u.s(g1Var, 10);
            ArrayList arrayList = new ArrayList(s10);
            Iterator<E> it = g1Var.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupMembership) it.next()).getGroupID());
            }
            g1 p10 = n10.v("id", (String[]) arrayList.toArray(new String[0])).J("memberCount", j1.DESCENDING).p();
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
