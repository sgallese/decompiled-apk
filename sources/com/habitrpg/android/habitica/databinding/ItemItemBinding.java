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
public final class ItemItemBinding implements a {
    public final PixelArtView imageView;
    public final TextView ownedTextView;
    private final LinearLayout rootView;
    public final TextView titleTextView;

    private ItemItemBinding(LinearLayout linearLayout, PixelArtView pixelArtView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.imageView = pixelArtView;
        this.ownedTextView = textView;
        this.titleTextView = textView2;
    }

    public static ItemItemBinding bind(View view) {
        int i10 = R.id.imageView;
        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
        if (pixelArtView != null) {
            i10 = R.id.ownedTextView;
            TextView textView = (TextView) b.a(view, R.id.ownedTextView);
            if (textView != null) {
                i10 = R.id.titleTextView;
                TextView textView2 = (TextView) b.a(view, R.id.titleTextView);
                if (textView2 != null) {
                    return new ItemItemBinding((LinearLayout) view, pixelArtView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_item, viewGroup, false);
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
