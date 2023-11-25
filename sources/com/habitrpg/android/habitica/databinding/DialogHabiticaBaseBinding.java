package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.login.LockableScrollView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogHabiticaBaseBinding implements a {
    public final LinearLayout buttonsWrapper;
    public final AppCompatButton closeButton;
    public final RelativeLayout confettiContainer;
    public final FrameLayout contentView;
    public final LinearLayout dialogContainer;
    public final LinearLayout dialogWrapper;
    public final LockableScrollView mainScrollView;
    public final TextView messageTextView;
    public final TextView noticeTextView;
    private final RelativeLayout rootView;
    public final View scrollingSeparator;
    public final TextView titleTextView;

    private DialogHabiticaBaseBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, AppCompatButton appCompatButton, RelativeLayout relativeLayout2, FrameLayout frameLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LockableScrollView lockableScrollView, TextView textView, TextView textView2, View view, TextView textView3) {
        this.rootView = relativeLayout;
        this.buttonsWrapper = linearLayout;
        this.closeButton = appCompatButton;
        this.confettiContainer = relativeLayout2;
        this.contentView = frameLayout;
        this.dialogContainer = linearLayout2;
        this.dialogWrapper = linearLayout3;
        this.mainScrollView = lockableScrollView;
        this.messageTextView = textView;
        this.noticeTextView = textView2;
        this.scrollingSeparator = view;
        this.titleTextView = textView3;
    }

    public static DialogHabiticaBaseBinding bind(View view) {
        int i10 = R.id.buttons_wrapper;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.buttons_wrapper);
        if (linearLayout != null) {
            i10 = R.id.close_button;
            AppCompatButton appCompatButton = (AppCompatButton) b.a(view, R.id.close_button);
            if (appCompatButton != null) {
                i10 = R.id.confetti_container;
                RelativeLayout relativeLayout = (RelativeLayout) b.a(view, R.id.confetti_container);
                if (relativeLayout != null) {
                    i10 = R.id.content_view;
                    FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.content_view);
                    if (frameLayout != null) {
                        i10 = R.id.dialog_container;
                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.dialog_container);
                        if (linearLayout2 != null) {
                            i10 = R.id.dialog_wrapper;
                            LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.dialog_wrapper);
                            if (linearLayout3 != null) {
                                i10 = R.id.main_scroll_view;
                                LockableScrollView lockableScrollView = (LockableScrollView) b.a(view, R.id.main_scroll_view);
                                if (lockableScrollView != null) {
                                    i10 = R.id.messageTextView;
                                    TextView textView = (TextView) b.a(view, R.id.messageTextView);
                                    if (textView != null) {
                                        i10 = R.id.notice_text_view;
                                        TextView textView2 = (TextView) b.a(view, R.id.notice_text_view);
                                        if (textView2 != null) {
                                            i10 = R.id.scrolling_separator;
                                            View a10 = b.a(view, R.id.scrolling_separator);
                                            if (a10 != null) {
                                                i10 = R.id.titleTextView;
                                                TextView textView3 = (TextView) b.a(view, R.id.titleTextView);
                                                if (textView3 != null) {
                                                    return new DialogHabiticaBaseBinding((RelativeLayout) view, linearLayout, appCompatButton, relativeLayout, frameLayout, linearLayout2, linearLayout3, lockableScrollView, textView, textView2, a10, textView3);
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

    public static DialogHabiticaBaseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogHabiticaBaseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_habitica_base, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
