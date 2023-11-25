package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityPrefsBinding implements a {
    public final FrameLayout fragmentContainer;
    private final LinearLayout rootView;
    public final FrameLayout snackbarContainer;
    public final Toolbar toolbar;

    private ActivityPrefsBinding(LinearLayout linearLayout, FrameLayout frameLayout, FrameLayout frameLayout2, Toolbar toolbar) {
        this.rootView = linearLayout;
        this.fragmentContainer = frameLayout;
        this.snackbarContainer = frameLayout2;
        this.toolbar = toolbar;
    }

    public static ActivityPrefsBinding bind(View view) {
        int i10 = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.fragment_container);
        if (frameLayout != null) {
            i10 = R.id.snackbar_container;
            FrameLayout frameLayout2 = (FrameLayout) b.a(view, R.id.snackbar_container);
            if (frameLayout2 != null) {
                i10 = R.id.toolbar;
                Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                if (toolbar != null) {
                    return new ActivityPrefsBinding((LinearLayout) view, frameLayout, frameLayout2, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityPrefsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPrefsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_prefs, viewGroup, false);
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
