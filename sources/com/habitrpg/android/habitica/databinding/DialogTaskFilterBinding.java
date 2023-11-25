package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogTaskFilterBinding implements a {
    public final RadioButton allTaskFilter;
    public final Button clearButton;
    private final LinearLayout rootView;
    public final RadioButton secondTaskFilter;
    public final Button tagEditButton;
    public final LinearLayout tagsList;
    public final TextView tagsTitle;
    public final RadioGroup taskFilterWrapper;
    public final TextView taskTypeTitle;
    public final RadioButton thirdTaskFilter;

    private DialogTaskFilterBinding(LinearLayout linearLayout, RadioButton radioButton, Button button, RadioButton radioButton2, Button button2, LinearLayout linearLayout2, TextView textView, RadioGroup radioGroup, TextView textView2, RadioButton radioButton3) {
        this.rootView = linearLayout;
        this.allTaskFilter = radioButton;
        this.clearButton = button;
        this.secondTaskFilter = radioButton2;
        this.tagEditButton = button2;
        this.tagsList = linearLayout2;
        this.tagsTitle = textView;
        this.taskFilterWrapper = radioGroup;
        this.taskTypeTitle = textView2;
        this.thirdTaskFilter = radioButton3;
    }

    public static DialogTaskFilterBinding bind(View view) {
        int i10 = R.id.all_task_filter;
        RadioButton radioButton = (RadioButton) b.a(view, R.id.all_task_filter);
        if (radioButton != null) {
            i10 = R.id.clear_button;
            Button button = (Button) b.a(view, R.id.clear_button);
            if (button != null) {
                i10 = R.id.second_task_filter;
                RadioButton radioButton2 = (RadioButton) b.a(view, R.id.second_task_filter);
                if (radioButton2 != null) {
                    i10 = R.id.tag_edit_button;
                    Button button2 = (Button) b.a(view, R.id.tag_edit_button);
                    if (button2 != null) {
                        i10 = R.id.tags_list;
                        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.tags_list);
                        if (linearLayout != null) {
                            i10 = R.id.tags_title;
                            TextView textView = (TextView) b.a(view, R.id.tags_title);
                            if (textView != null) {
                                i10 = R.id.task_filter_wrapper;
                                RadioGroup radioGroup = (RadioGroup) b.a(view, R.id.task_filter_wrapper);
                                if (radioGroup != null) {
                                    i10 = R.id.task_type_title;
                                    TextView textView2 = (TextView) b.a(view, R.id.task_type_title);
                                    if (textView2 != null) {
                                        i10 = R.id.third_task_filter;
                                        RadioButton radioButton3 = (RadioButton) b.a(view, R.id.third_task_filter);
                                        if (radioButton3 != null) {
                                            return new DialogTaskFilterBinding((LinearLayout) view, radioButton, button, radioButton2, button2, linearLayout, textView, radioGroup, textView2, radioButton3);
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

    public static DialogTaskFilterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogTaskFilterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_task_filter, viewGroup, false);
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
