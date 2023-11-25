package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentSupportBugFixBinding implements a {
    public final LinearLayout knownIssuesLayout;
    public final Button reportBugButton;
    private final NestedScrollView rootView;

    private FragmentSupportBugFixBinding(NestedScrollView nestedScrollView, LinearLayout linearLayout, Button button) {
        this.rootView = nestedScrollView;
        this.knownIssuesLayout = linearLayout;
        this.reportBugButton = button;
    }

    public static FragmentSupportBugFixBinding bind(View view) {
        int i10 = R.id.known_issues_layout;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.known_issues_layout);
        if (linearLayout != null) {
            i10 = R.id.report_bug_button;
            Button button = (Button) b.a(view, R.id.report_bug_button);
            if (button != null) {
                return new FragmentSupportBugFixBinding((NestedScrollView) view, linearLayout, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSupportBugFixBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSupportBugFixBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_support_bug_fix, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
