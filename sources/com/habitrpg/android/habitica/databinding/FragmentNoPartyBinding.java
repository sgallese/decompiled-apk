package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.social.InvitationsView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentNoPartyBinding implements a {
    public final Button createPartyButton;
    public final FrameLayout invitationWrapper;
    public final InvitationsView invitationsView;
    public final TextView joinPartyDescriptionTextview;
    public final Button leaveSeekingButton;
    public final ImageView noPartyBackground;
    public final LinearLayout noPartyWrapper;
    public final SwipeRefreshLayout refreshLayout;
    private final SwipeRefreshLayout rootView;
    public final Button seekPartyButton;
    public final LinearLayout seekingPartyWrapper;

    private FragmentNoPartyBinding(SwipeRefreshLayout swipeRefreshLayout, Button button, FrameLayout frameLayout, InvitationsView invitationsView, TextView textView, Button button2, ImageView imageView, LinearLayout linearLayout, SwipeRefreshLayout swipeRefreshLayout2, Button button3, LinearLayout linearLayout2) {
        this.rootView = swipeRefreshLayout;
        this.createPartyButton = button;
        this.invitationWrapper = frameLayout;
        this.invitationsView = invitationsView;
        this.joinPartyDescriptionTextview = textView;
        this.leaveSeekingButton = button2;
        this.noPartyBackground = imageView;
        this.noPartyWrapper = linearLayout;
        this.refreshLayout = swipeRefreshLayout2;
        this.seekPartyButton = button3;
        this.seekingPartyWrapper = linearLayout2;
    }

    public static FragmentNoPartyBinding bind(View view) {
        int i10 = R.id.createPartyButton;
        Button button = (Button) b.a(view, R.id.createPartyButton);
        if (button != null) {
            i10 = R.id.invitationWrapper;
            FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.invitationWrapper);
            if (frameLayout != null) {
                i10 = R.id.invitations_view;
                InvitationsView invitationsView = (InvitationsView) b.a(view, R.id.invitations_view);
                if (invitationsView != null) {
                    i10 = R.id.join_party_description_textview;
                    TextView textView = (TextView) b.a(view, R.id.join_party_description_textview);
                    if (textView != null) {
                        i10 = R.id.leave_seeking_button;
                        Button button2 = (Button) b.a(view, R.id.leave_seeking_button);
                        if (button2 != null) {
                            i10 = R.id.no_party_background;
                            ImageView imageView = (ImageView) b.a(view, R.id.no_party_background);
                            if (imageView != null) {
                                i10 = R.id.noPartyWrapper;
                                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.noPartyWrapper);
                                if (linearLayout != null) {
                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                                    i10 = R.id.seek_party_button;
                                    Button button3 = (Button) b.a(view, R.id.seek_party_button);
                                    if (button3 != null) {
                                        i10 = R.id.seeking_party_wrapper;
                                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.seeking_party_wrapper);
                                        if (linearLayout2 != null) {
                                            return new FragmentNoPartyBinding(swipeRefreshLayout, button, frameLayout, invitationsView, textView, button2, imageView, linearLayout, swipeRefreshLayout, button3, linearLayout2);
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

    public static FragmentNoPartyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNoPartyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_no_party, viewGroup, false);
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
