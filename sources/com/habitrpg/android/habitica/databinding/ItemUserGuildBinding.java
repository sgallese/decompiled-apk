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
public final class ItemUserGuildBinding implements a {
    public final ImageView guildBadgeView;
    private final LinearLayout rootView;
    public final TextView titleTextView;

    private ItemUserGuildBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.guildBadgeView = imageView;
        this.titleTextView = textView;
    }

    public static ItemUserGuildBinding bind(View view) {
        int i10 = R.id.guild_badge_view;
        ImageView imageView = (ImageView) b.a(view, R.id.guild_badge_view);
        if (imageView != null) {
            i10 = R.id.title_text_view;
            TextView textView = (TextView) b.a(view, R.id.title_text_view);
            if (textView != null) {
                return new ItemUserGuildBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemUserGuildBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemUserGuildBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_user_guild, viewGroup, false);
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
