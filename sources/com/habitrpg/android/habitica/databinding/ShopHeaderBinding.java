package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.NPCBannerView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ShopHeaderBinding implements a {
    public final TextView descriptionView;
    public final TextView namePlate;
    public final NPCBannerView npcBannerView;
    private final FrameLayout rootView;

    private ShopHeaderBinding(FrameLayout frameLayout, TextView textView, TextView textView2, NPCBannerView nPCBannerView) {
        this.rootView = frameLayout;
        this.descriptionView = textView;
        this.namePlate = textView2;
        this.npcBannerView = nPCBannerView;
    }

    public static ShopHeaderBinding bind(View view) {
        int i10 = R.id.descriptionView;
        TextView textView = (TextView) b.a(view, R.id.descriptionView);
        if (textView != null) {
            i10 = R.id.namePlate;
            TextView textView2 = (TextView) b.a(view, R.id.namePlate);
            if (textView2 != null) {
                i10 = R.id.npcBannerView;
                NPCBannerView nPCBannerView = (NPCBannerView) b.a(view, R.id.npcBannerView);
                if (nPCBannerView != null) {
                    return new ShopHeaderBinding((FrameLayout) view, textView, textView2, nPCBannerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ShopHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShopHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.shop_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
