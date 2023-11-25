package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class PetImageviewBinding implements a {
    public final ComposeView backgroundView;
    public final PixelArtView petImageview;
    private final FrameLayout rootView;

    private PetImageviewBinding(FrameLayout frameLayout, ComposeView composeView, PixelArtView pixelArtView) {
        this.rootView = frameLayout;
        this.backgroundView = composeView;
        this.petImageview = pixelArtView;
    }

    public static PetImageviewBinding bind(View view) {
        int i10 = R.id.background_view;
        ComposeView composeView = (ComposeView) b.a(view, R.id.background_view);
        if (composeView != null) {
            i10 = R.id.pet_imageview;
            PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.pet_imageview);
            if (pixelArtView != null) {
                return new PetImageviewBinding((FrameLayout) view, composeView, pixelArtView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static PetImageviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PetImageviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.pet_imageview, viewGroup, false);
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
