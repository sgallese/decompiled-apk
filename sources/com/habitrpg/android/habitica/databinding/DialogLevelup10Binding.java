package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogLevelup10Binding implements a {
    public final ImageView healerIconView;
    public final ImageView mageIconView;
    public final ImageView rogueIconView;
    private final LinearLayout rootView;
    public final ImageView warriorIconView;

    private DialogLevelup10Binding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4) {
        this.rootView = linearLayout;
        this.healerIconView = imageView;
        this.mageIconView = imageView2;
        this.rogueIconView = imageView3;
        this.warriorIconView = imageView4;
    }

    public static DialogLevelup10Binding bind(View view) {
        int i10 = R.id.healer_icon_view;
        ImageView imageView = (ImageView) b.a(view, R.id.healer_icon_view);
        if (imageView != null) {
            i10 = R.id.mage_icon_view;
            ImageView imageView2 = (ImageView) b.a(view, R.id.mage_icon_view);
            if (imageView2 != null) {
                i10 = R.id.rogue_icon_view;
                ImageView imageView3 = (ImageView) b.a(view, R.id.rogue_icon_view);
                if (imageView3 != null) {
                    i10 = R.id.warrior_icon_view;
                    ImageView imageView4 = (ImageView) b.a(view, R.id.warrior_icon_view);
                    if (imageView4 != null) {
                        return new DialogLevelup10Binding((LinearLayout) view, imageView, imageView2, imageView3, imageView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogLevelup10Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogLevelup10Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_levelup_10, viewGroup, false);
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
