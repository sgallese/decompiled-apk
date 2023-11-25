package com.habitrpg.android.habitica.ui.views.social;

import ad.k0;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ViewInvitationBinding;
import com.habitrpg.android.habitica.models.invitations.GenericInvitation;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;
import com.habitrpg.common.habitica.views.AvatarView;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.q;

/* compiled from: InvitationsView.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.views.social.InvitationsView$setInvitations$1", f = "InvitationsView.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InvitationsView$setInvitations$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ ViewInvitationBinding $binding;
    final /* synthetic */ GenericInvitation $invitation;
    final /* synthetic */ String $leaderID;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InvitationsView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvitationsView$setInvitations$1(String str, InvitationsView invitationsView, ViewInvitationBinding viewInvitationBinding, GenericInvitation genericInvitation, Continuation<? super InvitationsView$setInvitations$1> continuation) {
        super(2, continuation);
        this.$leaderID = str;
        this.this$0 = invitationsView;
        this.$binding = viewInvitationBinding;
        this.$invitation = genericInvitation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new InvitationsView$setInvitations$1(this.$leaderID, this.this$0, this.$binding, this.$invitation, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((InvitationsView$setInvitations$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String str;
        InvitationsView invitationsView;
        ViewInvitationBinding viewInvitationBinding;
        GenericInvitation genericInvitation;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                genericInvitation = (GenericInvitation) this.L$3;
                str = (String) this.L$2;
                viewInvitationBinding = (ViewInvitationBinding) this.L$1;
                invitationsView = (InvitationsView) this.L$0;
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            str = this.$leaderID;
            if (str != null) {
                invitationsView = this.this$0;
                viewInvitationBinding = this.$binding;
                GenericInvitation genericInvitation2 = this.$invitation;
                p<String, Continuation<? super Member>, Object> getLeader = invitationsView.getGetLeader();
                if (getLeader != null) {
                    this.L$0 = invitationsView;
                    this.L$1 = viewInvitationBinding;
                    this.L$2 = str;
                    this.L$3 = genericInvitation2;
                    this.label = 1;
                    Object invoke = getLeader.invoke(str, this);
                    if (invoke == d10) {
                        return d10;
                    }
                    genericInvitation = genericInvitation2;
                    obj = invoke;
                }
                return w.f13270a;
            }
            return w.f13270a;
        }
        Member member = (Member) obj;
        if (member != null) {
            AvatarView avatarView = viewInvitationBinding.groupleaderAvatarView;
            q.h(avatarView, "groupleaderAvatarView");
            AvatarView.setAvatar$default(avatarView, member, null, 2, null);
            TextView textView = viewInvitationBinding.groupleaderTextView;
            q.h(textView, "groupleaderTextView");
            MarkdownParserKt.setMarkdown(textView, invitationsView.getContext().getString(R.string.invitation_title, "[" + member.getFormattedUsername() + "](https://habitica.com/profile/" + str + ")", genericInvitation.getName()));
            return w.f13270a;
        }
        return w.f13270a;
    }
}
