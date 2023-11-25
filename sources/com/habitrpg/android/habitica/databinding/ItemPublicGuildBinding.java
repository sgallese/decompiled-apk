package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ItemPublicGuildBinding implements a {
    public final TextView descriptionTextView;
    public final ImageView guildBadgeView;
    public final TextView memberCountTextView;
    public final TextView nameTextView;
    private final LinearLayout rootView;
    public final FlexboxLayout tagWrapper;

    private ItemPublicGuildBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3, FlexboxLayout flexboxLayout) {
        this.rootView = linearLayout;
        this.descriptionTextView = textView;
        this.guildBadgeView = imageView;
        this.memberCountTextView = textView2;
        this.nameTextView = textView3;
        this.tagWrapper = flexboxLayout;
    }

    public static ItemPublicGuildBinding bind(View view) {
        int i10 = R.id.descriptionTextView;
        TextView textView = (TextView) b.a(view, R.id.descriptionTextView);
        if (textView != null) {
            i10 = R.id.guild_badge_view;
            ImageView imageView = (ImageView) b.a(view, R.id.guild_badge_view);
            if (imageView != null) {
                i10 = R.id.memberCountTextView;
                TextView textView2 = (TextView) b.a(view, R.id.memberCountTextView);
                if (textView2 != null) {
                    i10 = R.id.nameTextView;
                    TextView textView3 = (TextView) b.a(view, R.id.nameTextView);
                    if (textView3 != null) {
                        i10 = R.id.tag_wrapper;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) b.a(view, R.id.tag_wrapper);
                        if (flexboxLayout != null) {
                            return new ItemPublicGuildBinding((LinearLayout) view, textView, imageView, textView2, textView3, flexboxLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemPublicGuildBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPublicGuildBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_public_guild, viewGroup, false);
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
