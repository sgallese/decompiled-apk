package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ViewCollapsibleSectionBinding implements a {
    public final ImageView caretView;
    public final ImageView infoIconView;
    private final View rootView;
    public final LinearLayout sectionTitleView;
    public final TextView titleTextView;

    private ViewCollapsibleSectionBinding(View view, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView) {
        this.rootView = view;
        this.caretView = imageView;
        this.infoIconView = imageView2;
        this.sectionTitleView = linearLayout;
        this.titleTextView = textView;
    }

    public static ViewCollapsibleSectionBinding bind(View view) {
        int i10 = R.id.caretView;
        ImageView imageView = (ImageView) b.a(view, R.id.caretView);
        if (imageView != null) {
            i10 = R.id.infoIconView;
            ImageView imageView2 = (ImageView) b.a(view, R.id.infoIconView);
            if (imageView2 != null) {
                i10 = R.id.section_title_view;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.section_title_view);
                if (linearLayout != null) {
                    i10 = R.id.titleTextView;
                    TextView textView = (TextView) b.a(view, R.id.titleTextView);
                    if (textView != null) {
                        return new ViewCollapsibleSectionBinding(view, imageView, imageView2, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ViewCollapsibleSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_collapsible_section, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
