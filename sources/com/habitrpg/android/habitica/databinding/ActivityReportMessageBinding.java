package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityReportMessageBinding implements a {
    public final AppCompatEditText additionalInfoEdittext;
    public final AppBarLayout appBar;
    public final LinearLayout bottomSheet;
    public final ImageButton closeButton;
    public final TextView messageTextView;
    public final Button reportButton;
    public final TextView reportExplanationTextview;
    private final CoordinatorLayout rootView;
    public final TextView titleTextView;
    public final Toolbar toolbar;
    public final TextView toolbarTitle;
    public final View touchOutside;

    private ActivityReportMessageBinding(CoordinatorLayout coordinatorLayout, AppCompatEditText appCompatEditText, AppBarLayout appBarLayout, LinearLayout linearLayout, ImageButton imageButton, TextView textView, Button button, TextView textView2, TextView textView3, Toolbar toolbar, TextView textView4, View view) {
        this.rootView = coordinatorLayout;
        this.additionalInfoEdittext = appCompatEditText;
        this.appBar = appBarLayout;
        this.bottomSheet = linearLayout;
        this.closeButton = imageButton;
        this.messageTextView = textView;
        this.reportButton = button;
        this.reportExplanationTextview = textView2;
        this.titleTextView = textView3;
        this.toolbar = toolbar;
        this.toolbarTitle = textView4;
        this.touchOutside = view;
    }

    public static ActivityReportMessageBinding bind(View view) {
        int i10 = R.id.additional_info_edittext;
        AppCompatEditText appCompatEditText = (AppCompatEditText) b.a(view, R.id.additional_info_edittext);
        if (appCompatEditText != null) {
            i10 = R.id.app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) b.a(view, R.id.app_bar);
            if (appBarLayout != null) {
                i10 = R.id.bottom_sheet;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.bottom_sheet);
                if (linearLayout != null) {
                    i10 = R.id.close_button;
                    ImageButton imageButton = (ImageButton) b.a(view, R.id.close_button);
                    if (imageButton != null) {
                        i10 = R.id.message_text_view;
                        TextView textView = (TextView) b.a(view, R.id.message_text_view);
                        if (textView != null) {
                            i10 = R.id.report_button;
                            Button button = (Button) b.a(view, R.id.report_button);
                            if (button != null) {
                                i10 = R.id.report_explanation_textview;
                                TextView textView2 = (TextView) b.a(view, R.id.report_explanation_textview);
                                if (textView2 != null) {
                                    i10 = R.id.title_text_view;
                                    TextView textView3 = (TextView) b.a(view, R.id.title_text_view);
                                    if (textView3 != null) {
                                        i10 = R.id.toolbar;
                                        Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                                        if (toolbar != null) {
                                            i10 = R.id.toolbar_title;
                                            TextView textView4 = (TextView) b.a(view, R.id.toolbar_title);
                                            if (textView4 != null) {
                                                i10 = R.id.touch_outside;
                                                View a10 = b.a(view, R.id.touch_outside);
                                                if (a10 != null) {
                                                    return new ActivityReportMessageBinding((CoordinatorLayout) view, appCompatEditText, appBarLayout, linearLayout, imageButton, textView, button, textView2, textView3, toolbar, textView4, a10);
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

    public static ActivityReportMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityReportMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_report_message, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
