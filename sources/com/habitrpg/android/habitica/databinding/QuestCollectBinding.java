package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import com.habitrpg.common.habitica.views.ValueBar;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class QuestCollectBinding implements a {
    public final PixelArtView iconView;
    public final TextView nameView;
    private final LinearLayout rootView;
    public final ValueBar valueView;

    private QuestCollectBinding(LinearLayout linearLayout, PixelArtView pixelArtView, TextView textView, ValueBar valueBar) {
        this.rootView = linearLayout;
        this.iconView = pixelArtView;
        this.nameView = textView;
        this.valueView = valueBar;
    }

    public static QuestCollectBinding bind(View view) {
        int i10 = R.id.icon_view;
        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.icon_view);
        if (pixelArtView != null) {
            i10 = R.id.name_view;
            TextView textView = (TextView) b.a(view, R.id.name_view);
            if (textView != null) {
                i10 = R.id.value_view;
                ValueBar valueBar = (ValueBar) b.a(view, R.id.value_view);
                if (valueBar != null) {
                    return new QuestCollectBinding((LinearLayout) view, pixelArtView, textView, valueBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static QuestCollectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static QuestCollectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.quest_collect, viewGroup, false);
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
