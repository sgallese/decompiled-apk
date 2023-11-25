package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import ad.u0;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.views.LoadingButtonState;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import zc.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$rescindInvite$2", f = "GroupViewModel.kt", l = {303, 305}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$rescindInvite$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Member $invitedMember;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$rescindInvite$2(GroupViewModel groupViewModel, Member member, Continuation<? super GroupViewModel$rescindInvite$2> continuation) {
        super(2, continuation);
        this.this$0 = groupViewModel;
        this.$invitedMember = member;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GroupViewModel$rescindInvite$2(this.this$0, this.$invitedMember, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GroupViewModel$rescindInvite$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    this.this$0.getPendingInvites().remove(this.$invitedMember);
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            String groupID = this.this$0.getGroupID();
            if (groupID == null) {
                groupID = "";
            }
            String id2 = this.$invitedMember.getId();
            this.label = 1;
            if (socialRepository.removeMemberFromGroup(groupID, id2, this) == d10) {
                return d10;
            }
        }
        this.this$0.getPendingInviteStates().put(this.$invitedMember.getId(), LoadingButtonState.SUCCESS);
        long o10 = c.o(1, zc.d.SECONDS);
        this.label = 2;
        if (u0.b(o10, this) == d10) {
            return d10;
        }
        this.this$0.getPendingInvites().remove(this.$invitedMember);
        return w.f13270a;
    }
}
