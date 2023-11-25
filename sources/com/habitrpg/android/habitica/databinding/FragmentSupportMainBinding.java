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
public final class FragmentSupportMainBinding implements a {
    public final LinearLayout bugsFixesWrapper;
    public final Button resetTutorialButton;
    private final NestedScrollView rootView;
    public final LinearLayout suggestionsFeedbackWrapper;
    public final LinearLayout usingHabiticaWrapper;

    private FragmentSupportMainBinding(NestedScrollView nestedScrollView, LinearLayout linearLayout, Button button, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.rootView = nestedScrollView;
        this.bugsFixesWrapper = linearLayout;
        this.resetTutorialButton = button;
        this.suggestionsFeedbackWrapper = linearLayout2;
        this.usingHabiticaWrapper = linearLayout3;
    }

    public static FragmentSupportMainBinding bind(View view) {
        int i10 = R.id.bugs_fixes_wrapper;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.bugs_fixes_wrapper);
        if (linearLayout != null) {
            i10 = R.id.reset_tutorial_button;
            Button button = (Button) b.a(view, R.id.reset_tutorial_button);
            if (button != null) {
                i10 = R.id.suggestions_feedback_wrapper;
                LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.suggestions_feedback_wrapper);
                if (linearLayout2 != null) {
                    i10 = R.id.using_habitica_wrapper;
                    LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.using_habitica_wrapper);
                    if (linearLayout3 != null) {
                        return new FragmentSupportMainBinding((NestedScrollView) view, linearLayout, button, linearLayout2, linearLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSupportMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSupportMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_support_main, viewGroup, false);
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
