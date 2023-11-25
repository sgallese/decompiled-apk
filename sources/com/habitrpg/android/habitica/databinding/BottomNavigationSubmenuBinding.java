package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class BottomNavigationSubmenuBinding implements a {
    public final ImageView iconView;
    private final View rootView;
    public final TextView titleView;

    private BottomNavigationSubmenuBinding(View view, ImageView imageView, TextView textView) {
        this.rootView = view;
        this.iconView = imageView;
        this.titleView = textView;
    }

    public static BottomNavigationSubmenuBinding bind(View view) {
        int i10 = R.id.icon_view;
        ImageView imageView = (ImageView) b.a(view, R.id.icon_view);
        if (imageView != null) {
            i10 = R.id.title_view;
            TextView textView = (TextView) b.a(view, R.id.title_view);
            if (textView != null) {
                return new BottomNavigationSubmenuBinding(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static BottomNavigationSubmenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.bottom_navigation_submenu, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
