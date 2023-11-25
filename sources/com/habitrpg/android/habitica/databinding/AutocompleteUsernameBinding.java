package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class AutocompleteUsernameBinding implements a {
    public final UsernameLabel displayNameView;
    private final LinearLayout rootView;
    public final TextView usernameView;

    private AutocompleteUsernameBinding(LinearLayout linearLayout, UsernameLabel usernameLabel, TextView textView) {
        this.rootView = linearLayout;
        this.displayNameView = usernameLabel;
        this.usernameView = textView;
    }

    public static AutocompleteUsernameBinding bind(View view) {
        int i10 = R.id.display_name_view;
        UsernameLabel usernameLabel = (UsernameLabel) b.a(view, R.id.display_name_view);
        if (usernameLabel != null) {
            i10 = R.id.username_view;
            TextView textView = (TextView) b.a(view, R.id.username_view);
            if (textView != null) {
                return new AutocompleteUsernameBinding((LinearLayout) view, usernameLabel, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AutocompleteUsernameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AutocompleteUsernameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.autocomplete_username, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
