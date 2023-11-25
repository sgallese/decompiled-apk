package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DrawerMainItemBinding implements a {
    public final TextView additionalInfoView;
    public final View bubbleView;
    public final TextView pillView;
    private final LinearLayout rootView;
    public final TextView titleTextView;

    private DrawerMainItemBinding(LinearLayout linearLayout, TextView textView, View view, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.additionalInfoView = textView;
        this.bubbleView = view;
        this.pillView = textView2;
        this.titleTextView = textView3;
    }

    public static DrawerMainItemBinding bind(View view) {
        int i10 = R.id.additionalInfoView;
        TextView textView = (TextView) b.a(view, R.id.additionalInfoView);
        if (textView != null) {
            i10 = R.id.bubble_view;
            View a10 = b.a(view, R.id.bubble_view);
            if (a10 != null) {
                i10 = R.id.pillView;
                TextView textView2 = (TextView) b.a(view, R.id.pillView);
                if (textView2 != null) {
                    i10 = R.id.titleTextView;
                    TextView textView3 = (TextView) b.a(view, R.id.titleTextView);
                    if (textView3 != null) {
                        return new DrawerMainItemBinding((LinearLayout) view, textView, a10, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DrawerMainItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DrawerMainItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.drawer_main_item, viewGroup, false);
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
