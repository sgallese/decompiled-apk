package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentPartyInviteBinding implements a {
    public final Button addInviteButton;
    public final LinearLayout invitationWrapper;
    public final TextView inviteDescription;
    private final ScrollView rootView;

    private FragmentPartyInviteBinding(ScrollView scrollView, Button button, LinearLayout linearLayout, TextView textView) {
        this.rootView = scrollView;
        this.addInviteButton = button;
        this.invitationWrapper = linearLayout;
        this.inviteDescription = textView;
    }

    public static FragmentPartyInviteBinding bind(View view) {
        int i10 = R.id.addInviteButton;
        Button button = (Button) b.a(view, R.id.addInviteButton);
        if (button != null) {
            i10 = R.id.invitationWrapper;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.invitationWrapper);
            if (linearLayout != null) {
                i10 = R.id.inviteDescription;
                TextView textView = (TextView) b.a(view, R.id.inviteDescription);
                if (textView != null) {
                    return new FragmentPartyInviteBinding((ScrollView) view, button, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentPartyInviteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPartyInviteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_party_invite, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public ScrollView getRoot() {
        return this.rootView;
    }
}
