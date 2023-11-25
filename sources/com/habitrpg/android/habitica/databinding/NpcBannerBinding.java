package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class NpcBannerBinding implements a {
    public final ImageView backgroundView;
    private final View rootView;
    public final ImageView sceneView;

    private NpcBannerBinding(View view, ImageView imageView, ImageView imageView2) {
        this.rootView = view;
        this.backgroundView = imageView;
        this.sceneView = imageView2;
    }

    public static NpcBannerBinding bind(View view) {
        int i10 = R.id.backgroundView;
        ImageView imageView = (ImageView) b.a(view, R.id.backgroundView);
        if (imageView != null) {
            i10 = R.id.sceneView;
            ImageView imageView2 = (ImageView) b.a(view, R.id.sceneView);
            if (imageView2 != null) {
                return new NpcBannerBinding(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static NpcBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.npc_banner, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
