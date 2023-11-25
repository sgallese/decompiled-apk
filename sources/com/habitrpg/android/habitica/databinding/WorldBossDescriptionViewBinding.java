package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class WorldBossDescriptionViewBinding implements a {
    private final LinearLayout rootView;
    public final TextView worldBossActionPromptView;

    private WorldBossDescriptionViewBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.worldBossActionPromptView = textView;
    }

    public static WorldBossDescriptionViewBinding bind(View view) {
        TextView textView = (TextView) b.a(view, R.id.worldBossActionPromptView);
        if (textView != null) {
            return new WorldBossDescriptionViewBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.worldBossActionPromptView)));
    }

    public static WorldBossDescriptionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WorldBossDescriptionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.world_boss_description_view, viewGroup, false);
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
