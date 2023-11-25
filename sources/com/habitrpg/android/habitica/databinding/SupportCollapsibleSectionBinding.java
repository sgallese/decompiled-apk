package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class SupportCollapsibleSectionBinding implements a {
    public final ImageView caretView;
    public final TextView descriptionView;
    public final ImageView iconView;
    private final View rootView;
    public final TextView subtitleView;
    public final TextView titleView;

    private SupportCollapsibleSectionBinding(View view, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, TextView textView3) {
        this.rootView = view;
        this.caretView = imageView;
        this.descriptionView = textView;
        this.iconView = imageView2;
        this.subtitleView = textView2;
        this.titleView = textView3;
    }

    public static SupportCollapsibleSectionBinding bind(View view) {
        int i10 = R.id.caret_view;
        ImageView imageView = (ImageView) b.a(view, R.id.caret_view);
        if (imageView != null) {
            i10 = R.id.description_view;
            TextView textView = (TextView) b.a(view, R.id.description_view);
            if (textView != null) {
                i10 = R.id.icon_view;
                ImageView imageView2 = (ImageView) b.a(view, R.id.icon_view);
                if (imageView2 != null) {
                    i10 = R.id.subtitle_view;
                    TextView textView2 = (TextView) b.a(view, R.id.subtitle_view);
                    if (textView2 != null) {
                        i10 = R.id.title_view;
                        TextView textView3 = (TextView) b.a(view, R.id.title_view);
                        if (textView3 != null) {
                            return new SupportCollapsibleSectionBinding(view, imageView, textView, imageView2, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SupportCollapsibleSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.support_collapsible_section, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
