package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class StatsSliderViewBinding implements a {
    public final TextView previousValueTextView;
    private final View rootView;
    public final TextView statTypeTitle;
    public final SeekBar statsSeekBar;
    public final AppCompatEditText valueEditText;

    private StatsSliderViewBinding(View view, TextView textView, TextView textView2, SeekBar seekBar, AppCompatEditText appCompatEditText) {
        this.rootView = view;
        this.previousValueTextView = textView;
        this.statTypeTitle = textView2;
        this.statsSeekBar = seekBar;
        this.valueEditText = appCompatEditText;
    }

    public static StatsSliderViewBinding bind(View view) {
        int i10 = R.id.previousValueTextView;
        TextView textView = (TextView) b.a(view, R.id.previousValueTextView);
        if (textView != null) {
            i10 = R.id.statTypeTitle;
            TextView textView2 = (TextView) b.a(view, R.id.statTypeTitle);
            if (textView2 != null) {
                i10 = R.id.statsSeekBar;
                SeekBar seekBar = (SeekBar) b.a(view, R.id.statsSeekBar);
                if (seekBar != null) {
                    i10 = R.id.valueEditText;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) b.a(view, R.id.valueEditText);
                    if (appCompatEditText != null) {
                        return new StatsSliderViewBinding(view, textView, textView2, seekBar, appCompatEditText);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static StatsSliderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.stats_slider_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
