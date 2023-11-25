package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class DialogHabiticaPrimaryButtonBinding implements a {
    private final Button rootView;

    private DialogHabiticaPrimaryButtonBinding(Button button) {
        this.rootView = button;
    }

    public static DialogHabiticaPrimaryButtonBinding bind(View view) {
        if (view != null) {
            return new DialogHabiticaPrimaryButtonBinding((Button) view);
        }
        throw new NullPointerException("rootView");
    }

    public static DialogHabiticaPrimaryButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogHabiticaPrimaryButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_habitica_primary_button, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public Button getRoot() {
        return this.rootView;
    }
}
