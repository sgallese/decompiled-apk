package com.habitrpg.android.habitica.ui.activities;

import android.view.View;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.common.habitica.models.Notification;
import com.habitrpg.common.habitica.models.notifications.NotificationData;
import com.habitrpg.common.habitica.models.notifications.PartyInvitationData;
import com.habitrpg.common.habitica.models.notifications.PartyInvite;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.NotificationsActivity$createPartyInvitationNotification$2", f = "NotificationsActivity.kt", l = {380}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NotificationsActivity$createPartyInvitationNotification$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super View>, Object> {
    final /* synthetic */ Notification $notification;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ NotificationsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsActivity$createPartyInvitationNotification$2(Notification notification, NotificationsActivity notificationsActivity, Continuation<? super NotificationsActivity$createPartyInvitationNotification$2> continuation) {
        super(2, continuation);
        this.$notification = notification;
        this.this$0 = notificationsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new NotificationsActivity$createPartyInvitationNotification$2(this.$notification, this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super View> continuation) {
        return ((NotificationsActivity$createPartyInvitationNotification$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        PartyInvitationData partyInvitationData;
        String str;
        String str2;
        PartyInvite invitation;
        String str3;
        CharSequence fromHtml;
        View createActionableNotificationItem;
        d10 = ic.d.d();
        int i10 = this.label;
        String str4 = null;
        if (i10 != 0) {
            if (i10 == 1) {
                str2 = (String) this.L$1;
                partyInvitationData = (PartyInvitationData) this.L$0;
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            NotificationData data = this.$notification.getData();
            if (data instanceof PartyInvitationData) {
                partyInvitationData = (PartyInvitationData) data;
            } else {
                partyInvitationData = null;
            }
            if (partyInvitationData != null && (invitation = partyInvitationData.getInvitation()) != null) {
                str = invitation.getInviter();
            } else {
                str = null;
            }
            if (str == null) {
                return null;
            }
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            this.L$0 = partyInvitationData;
            this.L$1 = str;
            this.label = 1;
            Object retrieveMember = socialRepository.retrieveMember(str, false, this);
            if (retrieveMember == d10) {
                return d10;
            }
            str2 = str;
            obj = retrieveMember;
        }
        Member member = (Member) obj;
        NotificationsActivity notificationsActivity = this.this$0;
        Notification notification = this.$notification;
        Object[] objArr = new Object[2];
        PartyInvite invitation2 = partyInvitationData.getInvitation();
        if (invitation2 != null) {
            str3 = invitation2.getName();
        } else {
            str3 = null;
        }
        objArr[0] = str3;
        if (member != null) {
            str4 = member.getFormattedUsername();
        }
        objArr[1] = str4;
        String string = notificationsActivity.getString(R.string.invited_to_party_notification, objArr);
        qc.q.h(string, "getString(...)");
        fromHtml = notificationsActivity.fromHtml(string);
        createActionableNotificationItem = notificationsActivity.createActionableNotificationItem(notification, fromHtml, true, str2);
        return createActionableNotificationItem;
    }
}
