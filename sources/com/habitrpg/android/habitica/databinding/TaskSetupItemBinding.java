package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class TaskSetupItemBinding implements a {
    private final AppCompatButton rootView;
    public final AppCompatButton textView;

    private TaskSetupItemBinding(AppCompatButton appCompatButton, AppCompatButton appCompatButton2) {
        this.rootView = appCompatButton;
        this.textView = appCompatButton2;
    }

    public static TaskSetupItemBinding bind(View view) {
        if (view != null) {
            AppCompatButton appCompatButton = (AppCompatButton) view;
            return new TaskSetupItemBinding(appCompatButton, appCompatButton);
        }
        throw new NullPointerException("rootView");
    }

    public static TaskSetupItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TaskSetupItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.task_setup_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public AppCompatButton getRoot() {
        return this.rootView;
    }
}
