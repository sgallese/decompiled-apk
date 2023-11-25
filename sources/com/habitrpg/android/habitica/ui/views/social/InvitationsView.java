package com.habitrpg.android.habitica.ui.views.social;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.v;
import com.habitrpg.android.habitica.MainNavDirections;
import com.habitrpg.android.habitica.databinding.ViewInvitationBinding;
import com.habitrpg.android.habitica.extensions.ViewExtKt;
import com.habitrpg.android.habitica.helpers.HapticFeedbackManager;
import com.habitrpg.android.habitica.models.invitations.GenericInvitation;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.q;

/* compiled from: InvitationsView.kt */
/* loaded from: classes4.dex */
public final class InvitationsView extends LinearLayout {
    public static final int $stable = 8;
    private pc.l<? super String, w> acceptCall;
    private p<? super String, ? super Continuation<? super Member>, ? extends Object> getLeader;
    private pc.l<? super String, w> rejectCall;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvitationsView(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setInvitations$lambda$1(String str, View view) {
        if (str != null) {
            q.f(view);
            ViewExtKt.flash(view);
            HapticFeedbackManager.Companion.tap(view);
            MainNavDirections.OpenProfileActivity openProfileActivity = MainNavDirections.openProfileActivity(str);
            q.h(openProfileActivity, "openProfileActivity(...)");
            MainNavigationController.INSTANCE.navigate(openProfileActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setInvitations$lambda$3(ViewInvitationBinding viewInvitationBinding, GenericInvitation genericInvitation, InvitationsView invitationsView, View view) {
        pc.l<? super String, w> lVar;
        q.i(viewInvitationBinding, "$binding");
        q.i(genericInvitation, "$invitation");
        q.i(invitationsView, "this$0");
        FrameLayout root = viewInvitationBinding.getRoot();
        q.h(root, "getRoot(...)");
        ViewExtKt.flash(root);
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        q.f(view);
        companion.tap(view);
        String id2 = genericInvitation.getId();
        if (id2 != null && (lVar = invitationsView.acceptCall) != null) {
            lVar.invoke(id2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setInvitations$lambda$5(ViewInvitationBinding viewInvitationBinding, GenericInvitation genericInvitation, InvitationsView invitationsView, View view) {
        pc.l<? super String, w> lVar;
        q.i(viewInvitationBinding, "$binding");
        q.i(genericInvitation, "$invitation");
        q.i(invitationsView, "this$0");
        FrameLayout root = viewInvitationBinding.getRoot();
        q.h(root, "getRoot(...)");
        ViewExtKt.flash(root);
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        q.f(view);
        companion.tap(view);
        String id2 = genericInvitation.getId();
        if (id2 != null && (lVar = invitationsView.rejectCall) != null) {
            lVar.invoke(id2);
        }
    }

    public final pc.l<String, w> getAcceptCall() {
        return this.acceptCall;
    }

    public final p<String, Continuation<? super Member>, Object> getGetLeader() {
        return this.getLeader;
    }

    public final pc.l<String, w> getRejectCall() {
        return this.rejectCall;
    }

    public final void setAcceptCall(pc.l<? super String, w> lVar) {
        this.acceptCall = lVar;
    }

    public final void setGetLeader(p<? super String, ? super Continuation<? super Member>, ? extends Object> pVar) {
        this.getLeader = pVar;
    }

    public final void setInvitations(List<? extends GenericInvitation> list) {
        androidx.lifecycle.q a10;
        q.i(list, "invitations");
        removeAllViews();
        for (final GenericInvitation genericInvitation : list) {
            final String inviter = genericInvitation.getInviter();
            Context context = getContext();
            q.h(context, "getContext(...)");
            final ViewInvitationBinding inflate = ViewInvitationBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this, true);
            q.h(inflate, "inflate(...)");
            inflate.groupleaderTextView.setMovementMethod(LinkMovementMethod.getInstance());
            v a11 = d1.a(this);
            if (a11 != null && (a10 = androidx.lifecycle.w.a(a11)) != null) {
                ad.i.d(a10, null, null, new InvitationsView$setInvitations$1(inviter, this, inflate, genericInvitation, null), 3, null);
            }
            inflate.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InvitationsView.setInvitations$lambda$1(inviter, view);
                }
            });
            inflate.acceptButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InvitationsView.setInvitations$lambda$3(ViewInvitationBinding.this, genericInvitation, this, view);
                }
            });
            inflate.rejectButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InvitationsView.setInvitations$lambda$5(ViewInvitationBinding.this, genericInvitation, this, view);
                }
            });
        }
    }

    public final void setRejectCall(pc.l<? super String, w> lVar) {
        this.rejectCall = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvitationsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ InvitationsView(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvitationsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        setOrientation(1);
    }
}
