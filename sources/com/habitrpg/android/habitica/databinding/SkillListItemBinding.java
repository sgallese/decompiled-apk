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
public final class SkillListItemBinding implements a {
    public final ImageView buttonIconView;
    public final LinearLayout buttonWrapper;
    public final TextView countLabel;
    public final TextView priceLabel;
    private final RelativeLayout rootView;
    public final PixelArtView skillImage;
    public final TextView skillNotes;
    public final TextView skillText;

    private SkillListItemBinding(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, PixelArtView pixelArtView, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.buttonIconView = imageView;
        this.buttonWrapper = linearLayout;
        this.countLabel = textView;
        this.priceLabel = textView2;
        this.skillImage = pixelArtView;
        this.skillNotes = textView3;
        this.skillText = textView4;
    }

    public static SkillListItemBinding bind(View view) {
        int i10 = R.id.button_icon_view;
        ImageView imageView = (ImageView) b.a(view, R.id.button_icon_view);
        if (imageView != null) {
            i10 = R.id.button_wrapper;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.button_wrapper);
            if (linearLayout != null) {
                i10 = R.id.count_label;
                TextView textView = (TextView) b.a(view, R.id.count_label);
                if (textView != null) {
                    i10 = R.id.price_label;
                    TextView textView2 = (TextView) b.a(view, R.id.price_label);
                    if (textView2 != null) {
                        i10 = R.id.skill_image;
                        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.skill_image);
                        if (pixelArtView != null) {
                            i10 = R.id.skill_notes;
                            TextView textView3 = (TextView) b.a(view, R.id.skill_notes);
                            if (textView3 != null) {
                                i10 = R.id.skill_text;
                                TextView textView4 = (TextView) b.a(view, R.id.skill_text);
                                if (textView4 != null) {
                                    return new SkillListItemBinding((RelativeLayout) view, imageView, linearLayout, textView, textView2, pixelArtView, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SkillListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SkillListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.skill_list_item, viewGroup, false);
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
