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
public final class DialogOpenMysteryitemBinding implements a {
    public final TextView descriptionView;
    public final PixelArtView iconView;
    private final LinearLayout rootView;
    public final TextView titleView;

    private DialogOpenMysteryitemBinding(LinearLayout linearLayout, TextView textView, PixelArtView pixelArtView, TextView textView2) {
        this.rootView = linearLayout;
        this.descriptionView = textView;
        this.iconView = pixelArtView;
        this.titleView = textView2;
    }

    public static DialogOpenMysteryitemBinding bind(View view) {
        int i10 = R.id.description_view;
        TextView textView = (TextView) b.a(view, R.id.description_view);
        if (textView != null) {
            i10 = R.id.icon_view;
            PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.icon_view);
            if (pixelArtView != null) {
                i10 = R.id.title_view;
                TextView textView2 = (TextView) b.a(view, R.id.title_view);
                if (textView2 != null) {
                    return new DialogOpenMysteryitemBinding((LinearLayout) view, textView, pixelArtView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogOpenMysteryitemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogOpenMysteryitemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_open_mysteryitem, viewGroup, false);
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
