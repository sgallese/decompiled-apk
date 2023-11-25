package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class MenuBottomSheetBinding implements a {
    public final PixelArtView iconView;
    public final LinearLayout menuItems;
    private final LinearLayout rootView;
    public final TextView titleView;

    private MenuBottomSheetBinding(LinearLayout linearLayout, PixelArtView pixelArtView, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.iconView = pixelArtView;
        this.menuItems = linearLayout2;
        this.titleView = textView;
    }

    public static MenuBottomSheetBinding bind(View view) {
        int i10 = R.id.icon_view;
        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.icon_view);
        if (pixelArtView != null) {
            i10 = R.id.menu_items;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.menu_items);
            if (linearLayout != null) {
                i10 = R.id.title_view;
                TextView textView = (TextView) b.a(view, R.id.title_view);
                if (textView != null) {
                    return new MenuBottomSheetBinding((LinearLayout) view, pixelArtView, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MenuBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MenuBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.menu_bottom_sheet, viewGroup, false);
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
