package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class PromoMenuBinding implements a {
    public final Button button;
    public final ImageButton closeButton;
    public final LinearLayout contentWrapper;
    public final ImageView descriptionImageView;
    public final TextView descriptionView;
    public final ImageView leftImageView;
    public final ImageView rightImageView;
    private final View rootView;
    public final ImageView titleImageView;
    public final TextView titleTextView;

    private PromoMenuBinding(View view, Button button, ImageButton imageButton, LinearLayout linearLayout, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView2) {
        this.rootView = view;
        this.button = button;
        this.closeButton = imageButton;
        this.contentWrapper = linearLayout;
        this.descriptionImageView = imageView;
        this.descriptionView = textView;
        this.leftImageView = imageView2;
        this.rightImageView = imageView3;
        this.titleImageView = imageView4;
        this.titleTextView = textView2;
    }

    public static PromoMenuBinding bind(View view) {
        int i10 = R.id.button;
        Button button = (Button) b.a(view, R.id.button);
        if (button != null) {
            i10 = R.id.close_button;
            ImageButton imageButton = (ImageButton) b.a(view, R.id.close_button);
            if (imageButton != null) {
                i10 = R.id.contentWrapper;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.contentWrapper);
                if (linearLayout != null) {
                    i10 = R.id.description_image_view;
                    ImageView imageView = (ImageView) b.a(view, R.id.description_image_view);
                    if (imageView != null) {
                        i10 = R.id.description_view;
                        TextView textView = (TextView) b.a(view, R.id.description_view);
                        if (textView != null) {
                            i10 = R.id.left_image_view;
                            ImageView imageView2 = (ImageView) b.a(view, R.id.left_image_view);
                            if (imageView2 != null) {
                                i10 = R.id.right_image_view;
                                ImageView imageView3 = (ImageView) b.a(view, R.id.right_image_view);
                                if (imageView3 != null) {
                                    i10 = R.id.title_image_view;
                                    ImageView imageView4 = (ImageView) b.a(view, R.id.title_image_view);
                                    if (imageView4 != null) {
                                        i10 = R.id.title_text_view;
                                        TextView textView2 = (TextView) b.a(view, R.id.title_text_view);
                                        if (textView2 != null) {
                                            return new PromoMenuBinding(view, button, imageButton, linearLayout, imageView, textView, imageView2, imageView3, imageView4, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static PromoMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.promo_menu, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
