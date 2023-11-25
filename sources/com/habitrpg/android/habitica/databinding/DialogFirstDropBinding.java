package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogFirstDropBinding implements a {
    public final PixelArtView eggView;
    public final PixelArtView hatchingPotionView;
    private final LinearLayout rootView;

    private DialogFirstDropBinding(LinearLayout linearLayout, PixelArtView pixelArtView, PixelArtView pixelArtView2) {
        this.rootView = linearLayout;
        this.eggView = pixelArtView;
        this.hatchingPotionView = pixelArtView2;
    }

    public static DialogFirstDropBinding bind(View view) {
        int i10 = R.id.egg_view;
        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.egg_view);
        if (pixelArtView != null) {
            i10 = R.id.hatchingPotion_view;
            PixelArtView pixelArtView2 = (PixelArtView) b.a(view, R.id.hatchingPotion_view);
            if (pixelArtView2 != null) {
                return new DialogFirstDropBinding((LinearLayout) view, pixelArtView, pixelArtView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogFirstDropBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogFirstDropBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_first_drop, viewGroup, false);
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
