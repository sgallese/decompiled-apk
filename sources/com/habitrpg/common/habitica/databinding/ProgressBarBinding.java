package com.habitrpg.common.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.habitrpg.common.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ProgressBarBinding implements a {
    public final View bar;
    public final View emptyBarSpace;
    public final View pendingBar;
    public final View pendingEmptyBarSpace;
    private final View rootView;

    private ProgressBarBinding(View view, View view2, View view3, View view4, View view5) {
        this.rootView = view;
        this.bar = view2;
        this.emptyBarSpace = view3;
        this.pendingBar = view4;
        this.pendingEmptyBarSpace = view5;
    }

    public static ProgressBarBinding bind(View view) {
        View a10;
        View a11;
        View a12;
        int i10 = R.id.bar;
        View a13 = b.a(view, i10);
        if (a13 != null && (a10 = b.a(view, (i10 = R.id.emptyBarSpace))) != null && (a11 = b.a(view, (i10 = R.id.pendingBar))) != null && (a12 = b.a(view, (i10 = R.id.pendingEmptyBarSpace))) != null) {
            return new ProgressBarBinding(view, a13, a10, a11, a12);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ProgressBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.progress_bar, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
