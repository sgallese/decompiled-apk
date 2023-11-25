package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentReportMessageBinding implements a {
    public final TextView additionalExplanationTextview;
    public final AppCompatEditText additionalInfoEdittext;
    public final AppBarLayout appBar;
    public final LinearLayout bottomSheet;
    public final TextView messageTextView;
    public final Button reportButton;
    public final TextView reportExplanationTextview;
    public final TextView reportReasonTitle;
    private final MaterialCardView rootView;
    public final Toolbar toolbar;
    public final TextView toolbarTitle;

    private FragmentReportMessageBinding(MaterialCardView materialCardView, TextView textView, AppCompatEditText appCompatEditText, AppBarLayout appBarLayout, LinearLayout linearLayout, TextView textView2, Button button, TextView textView3, TextView textView4, Toolbar toolbar, TextView textView5) {
        this.rootView = materialCardView;
        this.additionalExplanationTextview = textView;
        this.additionalInfoEdittext = appCompatEditText;
        this.appBar = appBarLayout;
        this.bottomSheet = linearLayout;
        this.messageTextView = textView2;
        this.reportButton = button;
        this.reportExplanationTextview = textView3;
        this.reportReasonTitle = textView4;
        this.toolbar = toolbar;
        this.toolbarTitle = textView5;
    }

    public static FragmentReportMessageBinding bind(View view) {
        int i10 = R.id.additional_explanation_textview;
        TextView textView = (TextView) b.a(view, R.id.additional_explanation_textview);
        if (textView != null) {
            i10 = R.id.additional_info_edittext;
            AppCompatEditText appCompatEditText = (AppCompatEditText) b.a(view, R.id.additional_info_edittext);
            if (appCompatEditText != null) {
                i10 = R.id.app_bar;
                AppBarLayout appBarLayout = (AppBarLayout) b.a(view, R.id.app_bar);
                if (appBarLayout != null) {
                    i10 = R.id.bottom_sheet;
                    LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.bottom_sheet);
                    if (linearLayout != null) {
                        i10 = R.id.message_text_view;
                        TextView textView2 = (TextView) b.a(view, R.id.message_text_view);
                        if (textView2 != null) {
                            i10 = R.id.report_button;
                            Button button = (Button) b.a(view, R.id.report_button);
                            if (button != null) {
                                i10 = R.id.report_explanation_textview;
                                TextView textView3 = (TextView) b.a(view, R.id.report_explanation_textview);
                                if (textView3 != null) {
                                    i10 = R.id.report_reason_title;
                                    TextView textView4 = (TextView) b.a(view, R.id.report_reason_title);
                                    if (textView4 != null) {
                                        i10 = R.id.toolbar;
                                        Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                                        if (toolbar != null) {
                                            i10 = R.id.toolbar_title;
                                            TextView textView5 = (TextView) b.a(view, R.id.toolbar_title);
                                            if (textView5 != null) {
                                                return new FragmentReportMessageBinding((MaterialCardView) view, textView, appCompatEditText, appBarLayout, linearLayout, textView2, button, textView3, textView4, toolbar, textView5);
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

    public static FragmentReportMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentReportMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_report_message, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
