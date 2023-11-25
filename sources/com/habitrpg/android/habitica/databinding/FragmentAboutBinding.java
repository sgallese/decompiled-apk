package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentAboutBinding implements a {
    public final Space anchor;
    public final Button googlePlayStoreButton;
    public final Button guidelinesButton;
    public final Button privacyPolicyButton;
    public final Button reportBug;
    private final NestedScrollView rootView;
    public final Button sourceCodeButton;
    public final TextView sourceCodeLink;
    public final Button termsButton;
    public final TextView twitter;
    public final TextView updateAvailableTextview;
    public final LinearLayout updateAvailableWrapper;
    public final TextView versionInfo;

    private FragmentAboutBinding(NestedScrollView nestedScrollView, Space space, Button button, Button button2, Button button3, Button button4, Button button5, TextView textView, Button button6, TextView textView2, TextView textView3, LinearLayout linearLayout, TextView textView4) {
        this.rootView = nestedScrollView;
        this.anchor = space;
        this.googlePlayStoreButton = button;
        this.guidelinesButton = button2;
        this.privacyPolicyButton = button3;
        this.reportBug = button4;
        this.sourceCodeButton = button5;
        this.sourceCodeLink = textView;
        this.termsButton = button6;
        this.twitter = textView2;
        this.updateAvailableTextview = textView3;
        this.updateAvailableWrapper = linearLayout;
        this.versionInfo = textView4;
    }

    public static FragmentAboutBinding bind(View view) {
        int i10 = R.id.anchor;
        Space space = (Space) b.a(view, R.id.anchor);
        if (space != null) {
            i10 = R.id.googlePlayStoreButton;
            Button button = (Button) b.a(view, R.id.googlePlayStoreButton);
            if (button != null) {
                i10 = R.id.guidelines_button;
                Button button2 = (Button) b.a(view, R.id.guidelines_button);
                if (button2 != null) {
                    i10 = R.id.privacy_policy_button;
                    Button button3 = (Button) b.a(view, R.id.privacy_policy_button);
                    if (button3 != null) {
                        i10 = R.id.reportBug;
                        Button button4 = (Button) b.a(view, R.id.reportBug);
                        if (button4 != null) {
                            i10 = R.id.sourceCodeButton;
                            Button button5 = (Button) b.a(view, R.id.sourceCodeButton);
                            if (button5 != null) {
                                i10 = R.id.sourceCodeLink;
                                TextView textView = (TextView) b.a(view, R.id.sourceCodeLink);
                                if (textView != null) {
                                    i10 = R.id.terms_button;
                                    Button button6 = (Button) b.a(view, R.id.terms_button);
                                    if (button6 != null) {
                                        i10 = R.id.twitter;
                                        TextView textView2 = (TextView) b.a(view, R.id.twitter);
                                        if (textView2 != null) {
                                            i10 = R.id.update_available_textview;
                                            TextView textView3 = (TextView) b.a(view, R.id.update_available_textview);
                                            if (textView3 != null) {
                                                i10 = R.id.update_available_wrapper;
                                                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.update_available_wrapper);
                                                if (linearLayout != null) {
                                                    i10 = R.id.versionInfo;
                                                    TextView textView4 = (TextView) b.a(view, R.id.versionInfo);
                                                    if (textView4 != null) {
                                                        return new FragmentAboutBinding((NestedScrollView) view, space, button, button2, button3, button4, button5, textView, button6, textView2, textView3, linearLayout, textView4);
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

    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_about, viewGroup, false);
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
