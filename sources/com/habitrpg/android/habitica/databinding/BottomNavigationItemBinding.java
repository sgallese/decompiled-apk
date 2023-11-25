package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.DayNightTextView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class BottomNavigationItemBinding implements a {
    public final TextView badge;
    public final ImageView iconView;
    private final View rootView;
    public final DayNightTextView selectedTitleView;
    public final TextView titleView;

    private BottomNavigationItemBinding(View view, TextView textView, ImageView imageView, DayNightTextView dayNightTextView, TextView textView2) {
        this.rootView = view;
        this.badge = textView;
        this.iconView = imageView;
        this.selectedTitleView = dayNightTextView;
        this.titleView = textView2;
    }

    public static BottomNavigationItemBinding bind(View view) {
        int i10 = R.id.badge;
        TextView textView = (TextView) b.a(view, R.id.badge);
        if (textView != null) {
            i10 = R.id.icon_view;
            ImageView imageView = (ImageView) b.a(view, R.id.icon_view);
            if (imageView != null) {
                i10 = R.id.selected_title_view;
                DayNightTextView dayNightTextView = (DayNightTextView) b.a(view, R.id.selected_title_view);
                if (dayNightTextView != null) {
                    i10 = R.id.title_view;
                    TextView textView2 = (TextView) b.a(view, R.id.title_view);
                    if (textView2 != null) {
                        return new BottomNavigationItemBinding(view, textView, imageView, dayNightTextView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static BottomNavigationItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.bottom_navigation_item, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
