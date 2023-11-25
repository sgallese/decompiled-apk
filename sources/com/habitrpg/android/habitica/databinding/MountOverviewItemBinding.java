package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class MountOverviewItemBinding implements a {
    public final ImageView activeIndicator;
    public final LinearLayout cardView;
    public final PixelArtView imageView;
    public final TextView ownedTextView;
    private final RelativeLayout rootView;
    public final TextView titleTextView;

    private MountOverviewItemBinding(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, PixelArtView pixelArtView, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.activeIndicator = imageView;
        this.cardView = linearLayout;
        this.imageView = pixelArtView;
        this.ownedTextView = textView;
        this.titleTextView = textView2;
    }

    public static MountOverviewItemBinding bind(View view) {
        int i10 = R.id.active_indicator;
        ImageView imageView = (ImageView) b.a(view, R.id.active_indicator);
        if (imageView != null) {
            i10 = R.id.card_view;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.card_view);
            if (linearLayout != null) {
                i10 = R.id.imageView;
                PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
                if (pixelArtView != null) {
                    i10 = R.id.ownedTextView;
                    TextView textView = (TextView) b.a(view, R.id.ownedTextView);
                    if (textView != null) {
                        i10 = R.id.titleTextView;
                        TextView textView2 = (TextView) b.a(view, R.id.titleTextView);
                        if (textView2 != null) {
                            return new MountOverviewItemBinding((RelativeLayout) view, imageView, linearLayout, pixelArtView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MountOverviewItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MountOverviewItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.mount_overview_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
