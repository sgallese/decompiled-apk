package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class DialogHabiticaSecondaryButtonBinding implements a {
    private final Button rootView;

    private DialogHabiticaSecondaryButtonBinding(Button button) {
        this.rootView = button;
    }

    public static DialogHabiticaSecondaryButtonBinding bind(View view) {
        if (view != null) {
            return new DialogHabiticaSecondaryButtonBinding((Button) view);
        }
        throw new NullPointerException("rootView");
    }

    public static DialogHabiticaSecondaryButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogHabiticaSecondaryButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_habitica_secondary_button, viewGroup, false);
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
