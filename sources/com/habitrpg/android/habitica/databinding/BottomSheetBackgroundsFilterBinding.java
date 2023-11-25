package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class BottomSheetBackgroundsFilterBinding implements a {
    public final CheckBox aprilButton;
    public final CheckBox augustButton;
    public final Button clearButton;
    public final CheckBox decemberButton;
    public final CheckBox febuaryButton;
    public final CheckBox januaryButton;
    public final CheckBox julyButton;
    public final CheckBox juneButton;
    public final CheckBox marchButton;
    public final CheckBox mayButton;
    public final TextView monthReleasedTitle;
    public final LinearLayout monthReleasedWrapper;
    public final RadioButton newestButton;
    public final CheckBox novemberButton;
    public final CheckBox octoberButton;
    public final RadioButton oldestButton;
    private final LinearLayout rootView;
    public final CheckBox septemberButton;
    public final RadioButton showAllButton;
    public final RadioGroup showMeWrapper;
    public final RadioButton showPurchasedButton;
    public final TextView sortByTitle;
    public final RadioGroup sortByWrapper;
    public final TextView taskTypeTitle;

    private BottomSheetBackgroundsFilterBinding(LinearLayout linearLayout, CheckBox checkBox, CheckBox checkBox2, Button button, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9, TextView textView, LinearLayout linearLayout2, RadioButton radioButton, CheckBox checkBox10, CheckBox checkBox11, RadioButton radioButton2, CheckBox checkBox12, RadioButton radioButton3, RadioGroup radioGroup, RadioButton radioButton4, TextView textView2, RadioGroup radioGroup2, TextView textView3) {
        this.rootView = linearLayout;
        this.aprilButton = checkBox;
        this.augustButton = checkBox2;
        this.clearButton = button;
        this.decemberButton = checkBox3;
        this.febuaryButton = checkBox4;
        this.januaryButton = checkBox5;
        this.julyButton = checkBox6;
        this.juneButton = checkBox7;
        this.marchButton = checkBox8;
        this.mayButton = checkBox9;
        this.monthReleasedTitle = textView;
        this.monthReleasedWrapper = linearLayout2;
        this.newestButton = radioButton;
        this.novemberButton = checkBox10;
        this.octoberButton = checkBox11;
        this.oldestButton = radioButton2;
        this.septemberButton = checkBox12;
        this.showAllButton = radioButton3;
        this.showMeWrapper = radioGroup;
        this.showPurchasedButton = radioButton4;
        this.sortByTitle = textView2;
        this.sortByWrapper = radioGroup2;
        this.taskTypeTitle = textView3;
    }

    public static BottomSheetBackgroundsFilterBinding bind(View view) {
        int i10 = R.id.april_button;
        CheckBox checkBox = (CheckBox) b.a(view, R.id.april_button);
        if (checkBox != null) {
            i10 = R.id.august_button;
            CheckBox checkBox2 = (CheckBox) b.a(view, R.id.august_button);
            if (checkBox2 != null) {
                i10 = R.id.clear_button;
                Button button = (Button) b.a(view, R.id.clear_button);
                if (button != null) {
                    i10 = R.id.december_button;
                    CheckBox checkBox3 = (CheckBox) b.a(view, R.id.december_button);
                    if (checkBox3 != null) {
                        i10 = R.id.febuary_button;
                        CheckBox checkBox4 = (CheckBox) b.a(view, R.id.febuary_button);
                        if (checkBox4 != null) {
                            i10 = R.id.january_button;
                            CheckBox checkBox5 = (CheckBox) b.a(view, R.id.january_button);
                            if (checkBox5 != null) {
                                i10 = R.id.july_button;
                                CheckBox checkBox6 = (CheckBox) b.a(view, R.id.july_button);
                                if (checkBox6 != null) {
                                    i10 = R.id.june_button;
                                    CheckBox checkBox7 = (CheckBox) b.a(view, R.id.june_button);
                                    if (checkBox7 != null) {
                                        i10 = R.id.march_button;
                                        CheckBox checkBox8 = (CheckBox) b.a(view, R.id.march_button);
                                        if (checkBox8 != null) {
                                            i10 = R.id.may_button;
                                            CheckBox checkBox9 = (CheckBox) b.a(view, R.id.may_button);
                                            if (checkBox9 != null) {
                                                i10 = R.id.month_released_title;
                                                TextView textView = (TextView) b.a(view, R.id.month_released_title);
                                                if (textView != null) {
                                                    i10 = R.id.month_released_wrapper;
                                                    LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.month_released_wrapper);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.newest_button;
                                                        RadioButton radioButton = (RadioButton) b.a(view, R.id.newest_button);
                                                        if (radioButton != null) {
                                                            i10 = R.id.november_button;
                                                            CheckBox checkBox10 = (CheckBox) b.a(view, R.id.november_button);
                                                            if (checkBox10 != null) {
                                                                i10 = R.id.october_button;
                                                                CheckBox checkBox11 = (CheckBox) b.a(view, R.id.october_button);
                                                                if (checkBox11 != null) {
                                                                    i10 = R.id.oldest_button;
                                                                    RadioButton radioButton2 = (RadioButton) b.a(view, R.id.oldest_button);
                                                                    if (radioButton2 != null) {
                                                                        i10 = R.id.september_button;
                                                                        CheckBox checkBox12 = (CheckBox) b.a(view, R.id.september_button);
                                                                        if (checkBox12 != null) {
                                                                            i10 = R.id.show_all_button;
                                                                            RadioButton radioButton3 = (RadioButton) b.a(view, R.id.show_all_button);
                                                                            if (radioButton3 != null) {
                                                                                i10 = R.id.show_me_wrapper;
                                                                                RadioGroup radioGroup = (RadioGroup) b.a(view, R.id.show_me_wrapper);
                                                                                if (radioGroup != null) {
                                                                                    i10 = R.id.show_purchased_button;
                                                                                    RadioButton radioButton4 = (RadioButton) b.a(view, R.id.show_purchased_button);
                                                                                    if (radioButton4 != null) {
                                                                                        i10 = R.id.sort_by_title;
                                                                                        TextView textView2 = (TextView) b.a(view, R.id.sort_by_title);
                                                                                        if (textView2 != null) {
                                                                                            i10 = R.id.sort_by_wrapper;
                                                                                            RadioGroup radioGroup2 = (RadioGroup) b.a(view, R.id.sort_by_wrapper);
                                                                                            if (radioGroup2 != null) {
                                                                                                i10 = R.id.task_type_title;
                                                                                                TextView textView3 = (TextView) b.a(view, R.id.task_type_title);
                                                                                                if (textView3 != null) {
                                                                                                    return new BottomSheetBackgroundsFilterBinding((LinearLayout) view, checkBox, checkBox2, button, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, textView, linearLayout, radioButton, checkBox10, checkBox11, radioButton2, checkBox12, radioButton3, radioGroup, radioButton4, textView2, radioGroup2, textView3);
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

    public static BottomSheetBackgroundsFilterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetBackgroundsFilterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_backgrounds_filter, viewGroup, false);
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
