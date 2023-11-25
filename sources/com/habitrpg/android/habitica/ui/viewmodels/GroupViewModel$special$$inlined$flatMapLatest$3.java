package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.models.social.GroupMembership;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* compiled from: Merge.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$flatMapLatest$3", f = "GroupViewModel.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$special$$inlined$flatMapLatest$3 extends l implements q<h<? super GroupMembership>, String, Continuation<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$special$$inlined$flatMapLatest$3(Continuation continuation, GroupViewModel groupViewModel) {
        super(3, continuation);
        this.this$0 = groupViewModel;
    }

    @Override // pc.q
    public final Object invoke(h<? super GroupMembership> hVar, String str, Continuation<? super w> continuation) {
        GroupViewModel$special$$inlined$flatMapLatest$3 groupViewModel$special$$inlined$flatMapLatest$3 = new GroupViewModel$special$$inlined$flatMapLatest$3(continuation, this.this$0);
        groupViewModel$special$$inlined$flatMapLatest$3.L$0 = hVar;
        groupViewModel$special$$inlined$flatMapLatest$3.L$1 = str;
        return groupViewModel$special$$inlined$flatMapLatest$3.invokeSuspend(w.f13270a);
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
            g<GroupMembership> groupMembership = this.this$0.getSocialRepository().getGroupMembership((String) this.L$1);
            this.label = 1;
            if (i.r(hVar, groupMembership, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
