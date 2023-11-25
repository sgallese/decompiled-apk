package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogChallengeFilterBinding implements a {
    public final Button challengeFilterButtonAll;
    public final Button challengeFilterButtonNone;
    public final CheckBox challengeFilterNotOwned;
    public final CheckBox challengeFilterOwned;
    public final RecyclerView challengeFilterRecyclerView;
    public final Button clearButton;
    private final LinearLayout rootView;

    private DialogChallengeFilterBinding(LinearLayout linearLayout, Button button, Button button2, CheckBox checkBox, CheckBox checkBox2, RecyclerView recyclerView, Button button3) {
        this.rootView = linearLayout;
        this.challengeFilterButtonAll = button;
        this.challengeFilterButtonNone = button2;
        this.challengeFilterNotOwned = checkBox;
        this.challengeFilterOwned = checkBox2;
        this.challengeFilterRecyclerView = recyclerView;
        this.clearButton = button3;
    }

    public static DialogChallengeFilterBinding bind(View view) {
        int i10 = R.id.challenge_filter_button_all;
        Button button = (Button) b.a(view, R.id.challenge_filter_button_all);
        if (button != null) {
            i10 = R.id.challenge_filter_button_none;
            Button button2 = (Button) b.a(view, R.id.challenge_filter_button_none);
            if (button2 != null) {
                i10 = R.id.challenge_filter_not_owned;
                CheckBox checkBox = (CheckBox) b.a(view, R.id.challenge_filter_not_owned);
                if (checkBox != null) {
                    i10 = R.id.challenge_filter_owned;
                    CheckBox checkBox2 = (CheckBox) b.a(view, R.id.challenge_filter_owned);
                    if (checkBox2 != null) {
                        i10 = R.id.challenge_filter_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) b.a(view, R.id.challenge_filter_recycler_view);
                        if (recyclerView != null) {
                            i10 = R.id.clear_button;
                            Button button3 = (Button) b.a(view, R.id.clear_button);
                            if (button3 != null) {
                                return new DialogChallengeFilterBinding((LinearLayout) view, button, button2, checkBox, checkBox2, recyclerView, button3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogChallengeFilterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogChallengeFilterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_challenge_filter, viewGroup, false);
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
