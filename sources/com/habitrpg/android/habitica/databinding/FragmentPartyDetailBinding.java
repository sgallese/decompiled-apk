package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.social.InvitationsView;
import com.habitrpg.android.habitica.ui.views.social.OldQuestProgressView;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentPartyDetailBinding implements a {
    public final TextView descriptionView;
    public final Button findNewMember;
    public final InvitationsView invitationsView;
    public final ComposeView invitesWrapper;
    public final Button leaveButton;
    public final LinearLayout membersWrapper;
    public final Button newQuestButton;
    public final FrameLayout partyInvitationWrapper;
    public final Button questAcceptButton;
    public final Button questBeginButton;
    public final Button questCancelButton;
    public final LinearLayout questDetailButton;
    public final PixelArtView questImageView;
    public final LinearLayout questImageWrapper;
    public final LinearLayout questLeaderResponseWrapper;
    public final Button questMechanicsButton;
    public final LinearLayout questParticipantList;
    public final LinearLayout questParticipantResponseWrapper;
    public final TextView questParticipationView;
    public final TextView questPendingDamageView;
    public final TextView questPendingItemsView;
    public final OldQuestProgressView questProgressView;
    public final Button questRejectButton;
    public final PixelArtView questScrollImageView;
    public final TextView questTitleView;
    public final SwipeRefreshLayout refreshLayout;
    private final SwipeRefreshLayout rootView;
    public final TextView titleView;

    private FragmentPartyDetailBinding(SwipeRefreshLayout swipeRefreshLayout, TextView textView, Button button, InvitationsView invitationsView, ComposeView composeView, Button button2, LinearLayout linearLayout, Button button3, FrameLayout frameLayout, Button button4, Button button5, Button button6, LinearLayout linearLayout2, PixelArtView pixelArtView, LinearLayout linearLayout3, LinearLayout linearLayout4, Button button7, LinearLayout linearLayout5, LinearLayout linearLayout6, TextView textView2, TextView textView3, TextView textView4, OldQuestProgressView oldQuestProgressView, Button button8, PixelArtView pixelArtView2, TextView textView5, SwipeRefreshLayout swipeRefreshLayout2, TextView textView6) {
        this.rootView = swipeRefreshLayout;
        this.descriptionView = textView;
        this.findNewMember = button;
        this.invitationsView = invitationsView;
        this.invitesWrapper = composeView;
        this.leaveButton = button2;
        this.membersWrapper = linearLayout;
        this.newQuestButton = button3;
        this.partyInvitationWrapper = frameLayout;
        this.questAcceptButton = button4;
        this.questBeginButton = button5;
        this.questCancelButton = button6;
        this.questDetailButton = linearLayout2;
        this.questImageView = pixelArtView;
        this.questImageWrapper = linearLayout3;
        this.questLeaderResponseWrapper = linearLayout4;
        this.questMechanicsButton = button7;
        this.questParticipantList = linearLayout5;
        this.questParticipantResponseWrapper = linearLayout6;
        this.questParticipationView = textView2;
        this.questPendingDamageView = textView3;
        this.questPendingItemsView = textView4;
        this.questProgressView = oldQuestProgressView;
        this.questRejectButton = button8;
        this.questScrollImageView = pixelArtView2;
        this.questTitleView = textView5;
        this.refreshLayout = swipeRefreshLayout2;
        this.titleView = textView6;
    }

    public static FragmentPartyDetailBinding bind(View view) {
        int i10 = R.id.description_view;
        TextView textView = (TextView) b.a(view, R.id.description_view);
        if (textView != null) {
            i10 = R.id.find_new_member;
            Button button = (Button) b.a(view, R.id.find_new_member);
            if (button != null) {
                i10 = R.id.invitations_view;
                InvitationsView invitationsView = (InvitationsView) b.a(view, R.id.invitations_view);
                if (invitationsView != null) {
                    i10 = R.id.invites_wrapper;
                    ComposeView composeView = (ComposeView) b.a(view, R.id.invites_wrapper);
                    if (composeView != null) {
                        i10 = R.id.leave_button;
                        Button button2 = (Button) b.a(view, R.id.leave_button);
                        if (button2 != null) {
                            i10 = R.id.members_wrapper;
                            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.members_wrapper);
                            if (linearLayout != null) {
                                i10 = R.id.new_quest_button;
                                Button button3 = (Button) b.a(view, R.id.new_quest_button);
                                if (button3 != null) {
                                    i10 = R.id.party_invitation_wrapper;
                                    FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.party_invitation_wrapper);
                                    if (frameLayout != null) {
                                        i10 = R.id.quest_accept_button;
                                        Button button4 = (Button) b.a(view, R.id.quest_accept_button);
                                        if (button4 != null) {
                                            i10 = R.id.quest_begin_button;
                                            Button button5 = (Button) b.a(view, R.id.quest_begin_button);
                                            if (button5 != null) {
                                                i10 = R.id.quest_cancel_button;
                                                Button button6 = (Button) b.a(view, R.id.quest_cancel_button);
                                                if (button6 != null) {
                                                    i10 = R.id.quest_detail_button;
                                                    LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.quest_detail_button);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.quest_image_view;
                                                        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.quest_image_view);
                                                        if (pixelArtView != null) {
                                                            i10 = R.id.quest_image_wrapper;
                                                            LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.quest_image_wrapper);
                                                            if (linearLayout3 != null) {
                                                                i10 = R.id.quest_leader_response_wrapper;
                                                                LinearLayout linearLayout4 = (LinearLayout) b.a(view, R.id.quest_leader_response_wrapper);
                                                                if (linearLayout4 != null) {
                                                                    i10 = R.id.quest_mechanics_button;
                                                                    Button button7 = (Button) b.a(view, R.id.quest_mechanics_button);
                                                                    if (button7 != null) {
                                                                        i10 = R.id.quest_participant_list;
                                                                        LinearLayout linearLayout5 = (LinearLayout) b.a(view, R.id.quest_participant_list);
                                                                        if (linearLayout5 != null) {
                                                                            i10 = R.id.quest_participant_response_wrapper;
                                                                            LinearLayout linearLayout6 = (LinearLayout) b.a(view, R.id.quest_participant_response_wrapper);
                                                                            if (linearLayout6 != null) {
                                                                                i10 = R.id.quest_participation_view;
                                                                                TextView textView2 = (TextView) b.a(view, R.id.quest_participation_view);
                                                                                if (textView2 != null) {
                                                                                    i10 = R.id.quest_pending_damage_view;
                                                                                    TextView textView3 = (TextView) b.a(view, R.id.quest_pending_damage_view);
                                                                                    if (textView3 != null) {
                                                                                        i10 = R.id.quest_pending_items_view;
                                                                                        TextView textView4 = (TextView) b.a(view, R.id.quest_pending_items_view);
                                                                                        if (textView4 != null) {
                                                                                            i10 = R.id.quest_progress_view;
                                                                                            OldQuestProgressView oldQuestProgressView = (OldQuestProgressView) b.a(view, R.id.quest_progress_view);
                                                                                            if (oldQuestProgressView != null) {
                                                                                                i10 = R.id.quest_reject_button;
                                                                                                Button button8 = (Button) b.a(view, R.id.quest_reject_button);
                                                                                                if (button8 != null) {
                                                                                                    i10 = R.id.quest_scroll_image_view;
                                                                                                    PixelArtView pixelArtView2 = (PixelArtView) b.a(view, R.id.quest_scroll_image_view);
                                                                                                    if (pixelArtView2 != null) {
                                                                                                        i10 = R.id.quest_title_view;
                                                                                                        TextView textView5 = (TextView) b.a(view, R.id.quest_title_view);
                                                                                                        if (textView5 != null) {
                                                                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                                                                                                            i10 = R.id.title_view;
                                                                                                            TextView textView6 = (TextView) b.a(view, R.id.title_view);
                                                                                                            if (textView6 != null) {
                                                                                                                return new FragmentPartyDetailBinding(swipeRefreshLayout, textView, button, invitationsView, composeView, button2, linearLayout, button3, frameLayout, button4, button5, button6, linearLayout2, pixelArtView, linearLayout3, linearLayout4, button7, linearLayout5, linearLayout6, textView2, textView3, textView4, oldQuestProgressView, button8, pixelArtView2, textView5, swipeRefreshLayout, textView6);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentPartyDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPartyDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_party_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public SwipeRefreshLayout getRoot() {
        return this.rootView;
    }
}
