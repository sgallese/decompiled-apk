package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.tasks.form.ChecklistContainer;
import com.habitrpg.android.habitica.ui.views.tasks.form.ReminderContainer;
import com.habitrpg.android.habitica.ui.views.tasks.form.StepperValueFormView;
import com.habitrpg.android.habitica.ui.views.tasks.form.TaskSchedulingControls;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityTaskFormBinding implements a {
    public final TextView adjustStreakTitleView;
    public final LinearLayout adjustStreakWrapper;
    public final TextView assignTitleView;
    public final ComposeView assignView;
    public final TextView challengeNameView;
    public final ChecklistContainer checklistContainer;
    public final TextView checklistTitleView;
    public final AppCompatEditText habitAdjustNegativeStreakView;
    public final TextInputLayout habitAdjustPositiveInputLayout;
    public final AppCompatEditText habitAdjustPositiveStreakView;
    public final ComposeView habitResetStreakButtons;
    public final TextView habitResetStreakTitleView;
    public final ComposeView habitScoringButtons;
    public final AppCompatEditText notesEditText;
    public final TextInputLayout notesInputLayout;
    public final RelativeLayout notificationsDisabledLayout;
    public final TextView notificationsEnabledText;
    public final ReminderContainer remindersContainer;
    public final TextView remindersTitleView;
    public final StepperValueFormView rewardValue;
    public final TextView rewardValueTitleView;
    private final LinearLayout rootView;
    public final TextView schedulingTitleView;
    public final NestedScrollView scrollView;
    public final LinearLayout statWrapper;
    public final ComposeView statsSelector;
    public final TextView tagsTitleView;
    public final LinearLayout tagsWrapper;
    public final ComposeView taskDifficultyButtons;
    public final TextView taskDifficultyTitleView;
    public final TaskSchedulingControls taskSchedulingControls;
    public final AppCompatEditText textEditText;
    public final TextInputLayout textInputLayout;
    public final Toolbar toolbar;
    public final LinearLayout upperTextWrapper;

    private ActivityTaskFormBinding(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, ComposeView composeView, TextView textView3, ChecklistContainer checklistContainer, TextView textView4, AppCompatEditText appCompatEditText, TextInputLayout textInputLayout, AppCompatEditText appCompatEditText2, ComposeView composeView2, TextView textView5, ComposeView composeView3, AppCompatEditText appCompatEditText3, TextInputLayout textInputLayout2, RelativeLayout relativeLayout, TextView textView6, ReminderContainer reminderContainer, TextView textView7, StepperValueFormView stepperValueFormView, TextView textView8, TextView textView9, NestedScrollView nestedScrollView, LinearLayout linearLayout3, ComposeView composeView4, TextView textView10, LinearLayout linearLayout4, ComposeView composeView5, TextView textView11, TaskSchedulingControls taskSchedulingControls, AppCompatEditText appCompatEditText4, TextInputLayout textInputLayout3, Toolbar toolbar, LinearLayout linearLayout5) {
        this.rootView = linearLayout;
        this.adjustStreakTitleView = textView;
        this.adjustStreakWrapper = linearLayout2;
        this.assignTitleView = textView2;
        this.assignView = composeView;
        this.challengeNameView = textView3;
        this.checklistContainer = checklistContainer;
        this.checklistTitleView = textView4;
        this.habitAdjustNegativeStreakView = appCompatEditText;
        this.habitAdjustPositiveInputLayout = textInputLayout;
        this.habitAdjustPositiveStreakView = appCompatEditText2;
        this.habitResetStreakButtons = composeView2;
        this.habitResetStreakTitleView = textView5;
        this.habitScoringButtons = composeView3;
        this.notesEditText = appCompatEditText3;
        this.notesInputLayout = textInputLayout2;
        this.notificationsDisabledLayout = relativeLayout;
        this.notificationsEnabledText = textView6;
        this.remindersContainer = reminderContainer;
        this.remindersTitleView = textView7;
        this.rewardValue = stepperValueFormView;
        this.rewardValueTitleView = textView8;
        this.schedulingTitleView = textView9;
        this.scrollView = nestedScrollView;
        this.statWrapper = linearLayout3;
        this.statsSelector = composeView4;
        this.tagsTitleView = textView10;
        this.tagsWrapper = linearLayout4;
        this.taskDifficultyButtons = composeView5;
        this.taskDifficultyTitleView = textView11;
        this.taskSchedulingControls = taskSchedulingControls;
        this.textEditText = appCompatEditText4;
        this.textInputLayout = textInputLayout3;
        this.toolbar = toolbar;
        this.upperTextWrapper = linearLayout5;
    }

    public static ActivityTaskFormBinding bind(View view) {
        int i10 = R.id.adjust_streak_title_view;
        TextView textView = (TextView) b.a(view, R.id.adjust_streak_title_view);
        if (textView != null) {
            i10 = R.id.adjust_streak_wrapper;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.adjust_streak_wrapper);
            if (linearLayout != null) {
                i10 = R.id.assign_title_view;
                TextView textView2 = (TextView) b.a(view, R.id.assign_title_view);
                if (textView2 != null) {
                    i10 = R.id.assign_view;
                    ComposeView composeView = (ComposeView) b.a(view, R.id.assign_view);
                    if (composeView != null) {
                        i10 = R.id.challenge_name_view;
                        TextView textView3 = (TextView) b.a(view, R.id.challenge_name_view);
                        if (textView3 != null) {
                            i10 = R.id.checklist_container;
                            ChecklistContainer checklistContainer = (ChecklistContainer) b.a(view, R.id.checklist_container);
                            if (checklistContainer != null) {
                                i10 = R.id.checklist_title_view;
                                TextView textView4 = (TextView) b.a(view, R.id.checklist_title_view);
                                if (textView4 != null) {
                                    i10 = R.id.habit_adjust_negative_streak_view;
                                    AppCompatEditText appCompatEditText = (AppCompatEditText) b.a(view, R.id.habit_adjust_negative_streak_view);
                                    if (appCompatEditText != null) {
                                        i10 = R.id.habit_adjust_positive_input_layout;
                                        TextInputLayout textInputLayout = (TextInputLayout) b.a(view, R.id.habit_adjust_positive_input_layout);
                                        if (textInputLayout != null) {
                                            i10 = R.id.habit_adjust_positive_streak_view;
                                            AppCompatEditText appCompatEditText2 = (AppCompatEditText) b.a(view, R.id.habit_adjust_positive_streak_view);
                                            if (appCompatEditText2 != null) {
                                                i10 = R.id.habit_reset_streak_buttons;
                                                ComposeView composeView2 = (ComposeView) b.a(view, R.id.habit_reset_streak_buttons);
                                                if (composeView2 != null) {
                                                    i10 = R.id.habit_reset_streak_title_view;
                                                    TextView textView5 = (TextView) b.a(view, R.id.habit_reset_streak_title_view);
                                                    if (textView5 != null) {
                                                        i10 = R.id.habit_scoring_buttons;
                                                        ComposeView composeView3 = (ComposeView) b.a(view, R.id.habit_scoring_buttons);
                                                        if (composeView3 != null) {
                                                            i10 = R.id.notes_edit_text;
                                                            AppCompatEditText appCompatEditText3 = (AppCompatEditText) b.a(view, R.id.notes_edit_text);
                                                            if (appCompatEditText3 != null) {
                                                                i10 = R.id.notes_input_layout;
                                                                TextInputLayout textInputLayout2 = (TextInputLayout) b.a(view, R.id.notes_input_layout);
                                                                if (textInputLayout2 != null) {
                                                                    i10 = R.id.notifications_disabled_layout;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) b.a(view, R.id.notifications_disabled_layout);
                                                                    if (relativeLayout != null) {
                                                                        i10 = R.id.notifications_enabled_text;
                                                                        TextView textView6 = (TextView) b.a(view, R.id.notifications_enabled_text);
                                                                        if (textView6 != null) {
                                                                            i10 = R.id.reminders_container;
                                                                            ReminderContainer reminderContainer = (ReminderContainer) b.a(view, R.id.reminders_container);
                                                                            if (reminderContainer != null) {
                                                                                i10 = R.id.reminders_title_view;
                                                                                TextView textView7 = (TextView) b.a(view, R.id.reminders_title_view);
                                                                                if (textView7 != null) {
                                                                                    i10 = R.id.reward_value;
                                                                                    StepperValueFormView stepperValueFormView = (StepperValueFormView) b.a(view, R.id.reward_value);
                                                                                    if (stepperValueFormView != null) {
                                                                                        i10 = R.id.reward_value_title_view;
                                                                                        TextView textView8 = (TextView) b.a(view, R.id.reward_value_title_view);
                                                                                        if (textView8 != null) {
                                                                                            i10 = R.id.scheduling_title_view;
                                                                                            TextView textView9 = (TextView) b.a(view, R.id.scheduling_title_view);
                                                                                            if (textView9 != null) {
                                                                                                i10 = R.id.scroll_view;
                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) b.a(view, R.id.scroll_view);
                                                                                                if (nestedScrollView != null) {
                                                                                                    i10 = R.id.stat_wrapper;
                                                                                                    LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.stat_wrapper);
                                                                                                    if (linearLayout2 != null) {
                                                                                                        i10 = R.id.stats_selector;
                                                                                                        ComposeView composeView4 = (ComposeView) b.a(view, R.id.stats_selector);
                                                                                                        if (composeView4 != null) {
                                                                                                            i10 = R.id.tags_title_view;
                                                                                                            TextView textView10 = (TextView) b.a(view, R.id.tags_title_view);
                                                                                                            if (textView10 != null) {
                                                                                                                i10 = R.id.tags_wrapper;
                                                                                                                LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.tags_wrapper);
                                                                                                                if (linearLayout3 != null) {
                                                                                                                    i10 = R.id.task_difficulty_buttons;
                                                                                                                    ComposeView composeView5 = (ComposeView) b.a(view, R.id.task_difficulty_buttons);
                                                                                                                    if (composeView5 != null) {
                                                                                                                        i10 = R.id.task_difficulty_title_view;
                                                                                                                        TextView textView11 = (TextView) b.a(view, R.id.task_difficulty_title_view);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i10 = R.id.task_scheduling_controls;
                                                                                                                            TaskSchedulingControls taskSchedulingControls = (TaskSchedulingControls) b.a(view, R.id.task_scheduling_controls);
                                                                                                                            if (taskSchedulingControls != null) {
                                                                                                                                i10 = R.id.text_edit_text;
                                                                                                                                AppCompatEditText appCompatEditText4 = (AppCompatEditText) b.a(view, R.id.text_edit_text);
                                                                                                                                if (appCompatEditText4 != null) {
                                                                                                                                    i10 = R.id.text_input_layout;
                                                                                                                                    TextInputLayout textInputLayout3 = (TextInputLayout) b.a(view, R.id.text_input_layout);
                                                                                                                                    if (textInputLayout3 != null) {
                                                                                                                                        i10 = R.id.toolbar;
                                                                                                                                        Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                                                                                                                                        if (toolbar != null) {
                                                                                                                                            i10 = R.id.upper_text_wrapper;
                                                                                                                                            LinearLayout linearLayout4 = (LinearLayout) b.a(view, R.id.upper_text_wrapper);
                                                                                                                                            if (linearLayout4 != null) {
                                                                                                                                                return new ActivityTaskFormBinding((LinearLayout) view, textView, linearLayout, textView2, composeView, textView3, checklistContainer, textView4, appCompatEditText, textInputLayout, appCompatEditText2, composeView2, textView5, composeView3, appCompatEditText3, textInputLayout2, relativeLayout, textView6, reminderContainer, textView7, stepperValueFormView, textView8, textView9, nestedScrollView, linearLayout2, composeView4, textView10, linearLayout3, composeView5, textView11, taskSchedulingControls, appCompatEditText4, textInputLayout3, toolbar, linearLayout4);
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

    public static ActivityTaskFormBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTaskFormBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_task_form, viewGroup, false);
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
