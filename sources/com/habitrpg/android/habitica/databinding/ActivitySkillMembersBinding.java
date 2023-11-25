package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivitySkillMembersBinding implements a {
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final Toolbar toolbar;

    private ActivitySkillMembersBinding(LinearLayout linearLayout, RecyclerView recyclerView, Toolbar toolbar) {
        this.rootView = linearLayout;
        this.recyclerView = recyclerView;
        this.toolbar = toolbar;
    }

    public static ActivitySkillMembersBinding bind(View view) {
        int i10 = R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) b.a(view, R.id.recyclerView);
        if (recyclerView != null) {
            i10 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
            if (toolbar != null) {
                return new ActivitySkillMembersBinding((LinearLayout) view, recyclerView, toolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivitySkillMembersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySkillMembersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_skill_members, viewGroup, false);
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
