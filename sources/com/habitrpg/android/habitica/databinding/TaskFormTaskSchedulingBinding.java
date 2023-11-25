package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class TaskFormTaskSchedulingBinding implements a {
    public final TextView monthlyRepeatDays;
    public final TextView monthlyRepeatWeeks;
    public final LinearLayout monthlyRepeatWrapper;
    public final AppCompatEditText repeatsEveryEdittext;
    public final Spinner repeatsEverySpinner;
    public final TextView repeatsEveryTitle;
    public final LinearLayout repeatsEveryWrapper;
    private final View rootView;
    public final TextView startDateTextview;
    public final TextView startDateTitle;
    public final LinearLayout startDateWrapper;
    public final TextView summaryTextview;
    public final LinearLayout weeklyRepeatWrapper;

    private TaskFormTaskSchedulingBinding(View view, TextView textView, TextView textView2, LinearLayout linearLayout, AppCompatEditText appCompatEditText, Spinner spinner, TextView textView3, LinearLayout linearLayout2, TextView textView4, TextView textView5, LinearLayout linearLayout3, TextView textView6, LinearLayout linearLayout4) {
        this.rootView = view;
        this.monthlyRepeatDays = textView;
        this.monthlyRepeatWeeks = textView2;
        this.monthlyRepeatWrapper = linearLayout;
        this.repeatsEveryEdittext = appCompatEditText;
        this.repeatsEverySpinner = spinner;
        this.repeatsEveryTitle = textView3;
        this.repeatsEveryWrapper = linearLayout2;
        this.startDateTextview = textView4;
        this.startDateTitle = textView5;
        this.startDateWrapper = linearLayout3;
        this.summaryTextview = textView6;
        this.weeklyRepeatWrapper = linearLayout4;
    }

    public static TaskFormTaskSchedulingBinding bind(View view) {
        int i10 = R.id.monthly_repeat_days;
        TextView textView = (TextView) b.a(view, R.id.monthly_repeat_days);
        if (textView != null) {
            i10 = R.id.monthly_repeat_weeks;
            TextView textView2 = (TextView) b.a(view, R.id.monthly_repeat_weeks);
            if (textView2 != null) {
                i10 = R.id.monthly_repeat_wrapper;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.monthly_repeat_wrapper);
                if (linearLayout != null) {
                    i10 = R.id.repeats_every_edittext;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) b.a(view, R.id.repeats_every_edittext);
                    if (appCompatEditText != null) {
                        i10 = R.id.repeats_every_spinner;
                        Spinner spinner = (Spinner) b.a(view, R.id.repeats_every_spinner);
                        if (spinner != null) {
                            i10 = R.id.repeats_every_title;
                            TextView textView3 = (TextView) b.a(view, R.id.repeats_every_title);
                            if (textView3 != null) {
                                i10 = R.id.repeats_every_wrapper;
                                LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.repeats_every_wrapper);
                                if (linearLayout2 != null) {
                                    i10 = R.id.start_date_textview;
                                    TextView textView4 = (TextView) b.a(view, R.id.start_date_textview);
                                    if (textView4 != null) {
                                        i10 = R.id.start_date_title;
                                        TextView textView5 = (TextView) b.a(view, R.id.start_date_title);
                                        if (textView5 != null) {
                                            i10 = R.id.start_date_wrapper;
                                            LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.start_date_wrapper);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.summary_textview;
                                                TextView textView6 = (TextView) b.a(view, R.id.summary_textview);
                                                if (textView6 != null) {
                                                    i10 = R.id.weekly_repeat_wrapper;
                                                    LinearLayout linearLayout4 = (LinearLayout) b.a(view, R.id.weekly_repeat_wrapper);
                                                    if (linearLayout4 != null) {
                                                        return new TaskFormTaskSchedulingBinding(view, textView, textView2, linearLayout, appCompatEditText, spinner, textView3, linearLayout2, textView4, textView5, linearLayout3, textView6, linearLayout4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static TaskFormTaskSchedulingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.task_form_task_scheduling, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
