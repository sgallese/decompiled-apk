package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.stable.MountView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class MountImageviewBinding implements a {
    public final ComposeView backgroundView;
    public final MountView mountImageview;
    private final FrameLayout rootView;

    private MountImageviewBinding(FrameLayout frameLayout, ComposeView composeView, MountView mountView) {
        this.rootView = frameLayout;
        this.backgroundView = composeView;
        this.mountImageview = mountView;
    }

    public static MountImageviewBinding bind(View view) {
        int i10 = R.id.background_view;
        ComposeView composeView = (ComposeView) b.a(view, R.id.background_view);
        if (composeView != null) {
            i10 = R.id.mount_imageview;
            MountView mountView = (MountView) b.a(view, R.id.mount_imageview);
            if (mountView != null) {
                return new MountImageviewBinding((FrameLayout) view, composeView, mountView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MountImageviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MountImageviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.mount_imageview, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
