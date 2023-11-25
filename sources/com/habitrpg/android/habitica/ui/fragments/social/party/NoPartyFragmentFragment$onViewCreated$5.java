package com.habitrpg.android.habitica.ui.fragments.social.party;

import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.databinding.FragmentNoPartyBinding;
import com.habitrpg.android.habitica.models.invitations.GenericInvitation;
import com.habitrpg.android.habitica.models.invitations.Invitations;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.views.social.InvitationsView;
import dc.w;
import java.util.List;

/* compiled from: NoPartyFragmentFragment.kt */
/* loaded from: classes4.dex */
final class NoPartyFragmentFragment$onViewCreated$5 extends qc.r implements pc.l<User, w> {
    final /* synthetic */ NoPartyFragmentFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPartyFragmentFragment$onViewCreated$5(NoPartyFragmentFragment noPartyFragmentFragment) {
        super(1);
        this.this$0 = noPartyFragmentFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        List<? extends GenericInvitation> i10;
        UserParty party;
        InvitationsView invitationsView;
        Invitations invitations;
        if (user == null || (invitations = user.getInvitations()) == null || (i10 = invitations.getParties()) == null) {
            i10 = ec.t.i();
        }
        if ((!i10.isEmpty()) != false) {
            FragmentNoPartyBinding binding = this.this$0.getBinding();
            FrameLayout frameLayout = binding != null ? binding.invitationWrapper : null;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FragmentNoPartyBinding binding2 = this.this$0.getBinding();
            if (binding2 != null && (invitationsView = binding2.invitationsView) != null) {
                invitationsView.setInvitations(i10);
            }
        } else {
            FragmentNoPartyBinding binding3 = this.this$0.getBinding();
            FrameLayout frameLayout2 = binding3 != null ? binding3.invitationWrapper : null;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        boolean z10 = ((user == null || (party = user.getParty()) == null) ? null : party.getSeeking()) != null;
        FragmentNoPartyBinding binding4 = this.this$0.getBinding();
        Button button = binding4 != null ? binding4.seekPartyButton : null;
        if (button != null) {
            button.setVisibility(z10 ^ true ? 0 : 8);
        }
        FragmentNoPartyBinding binding5 = this.this$0.getBinding();
        LinearLayout linearLayout = binding5 != null ? binding5.seekingPartyWrapper : null;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(z10 ? 0 : 8);
    }
}
