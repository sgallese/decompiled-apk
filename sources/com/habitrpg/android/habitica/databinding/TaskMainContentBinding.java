package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.EllipsisTextView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class TaskMainContentBinding implements a {
    public final TextView approvalRequiredTextField;
    public final TextView assignedTextview;
    public final EllipsisTextView checkedTextView;
    public final TextView completedTextview;
    public final Button expandNotesButton;
    public final ImageView iconViewCalendar;
    public final ImageView iconViewStreak;
    public final ImageView iconViewTeamTask;
    public final ImageView iconviewChallenge;
    public final ImageView iconviewReminder;
    public final EllipsisTextView notesTextView;
    public final TextView reminderTextview;
    private final LinearLayout rootView;
    public final TextView specialTaskText;
    public final TextView streakTextView;
    public final LinearLayout taskIconWrapper;

    private TaskMainContentBinding(LinearLayout linearLayout, TextView textView, TextView textView2, EllipsisTextView ellipsisTextView, TextView textView3, Button button, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, EllipsisTextView ellipsisTextView2, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.approvalRequiredTextField = textView;
        this.assignedTextview = textView2;
        this.checkedTextView = ellipsisTextView;
        this.completedTextview = textView3;
        this.expandNotesButton = button;
        this.iconViewCalendar = imageView;
        this.iconViewStreak = imageView2;
        this.iconViewTeamTask = imageView3;
        this.iconviewChallenge = imageView4;
        this.iconviewReminder = imageView5;
        this.notesTextView = ellipsisTextView2;
        this.reminderTextview = textView4;
        this.specialTaskText = textView5;
        this.streakTextView = textView6;
        this.taskIconWrapper = linearLayout2;
    }

    public static TaskMainContentBinding bind(View view) {
        int i10 = R.id.approvalRequiredTextField;
        TextView textView = (TextView) b.a(view, R.id.approvalRequiredTextField);
        if (textView != null) {
            i10 = R.id.assigned_textview;
            TextView textView2 = (TextView) b.a(view, R.id.assigned_textview);
            if (textView2 != null) {
                i10 = R.id.checkedTextView;
                EllipsisTextView ellipsisTextView = (EllipsisTextView) b.a(view, R.id.checkedTextView);
                if (ellipsisTextView != null) {
                    i10 = R.id.completed_textview;
                    TextView textView3 = (TextView) b.a(view, R.id.completed_textview);
                    if (textView3 != null) {
                        i10 = R.id.expand_notes_button;
                        Button button = (Button) b.a(view, R.id.expand_notes_button);
                        if (button != null) {
                            i10 = R.id.iconViewCalendar;
                            ImageView imageView = (ImageView) b.a(view, R.id.iconViewCalendar);
                            if (imageView != null) {
                                i10 = R.id.iconViewStreak;
                                ImageView imageView2 = (ImageView) b.a(view, R.id.iconViewStreak);
                                if (imageView2 != null) {
                                    i10 = R.id.iconViewTeamTask;
                                    ImageView imageView3 = (ImageView) b.a(view, R.id.iconViewTeamTask);
                                    if (imageView3 != null) {
                                        i10 = R.id.iconviewChallenge;
                                        ImageView imageView4 = (ImageView) b.a(view, R.id.iconviewChallenge);
                                        if (imageView4 != null) {
                                            i10 = R.id.iconviewReminder;
                                            ImageView imageView5 = (ImageView) b.a(view, R.id.iconviewReminder);
                                            if (imageView5 != null) {
                                                i10 = R.id.notesTextView;
                                                EllipsisTextView ellipsisTextView2 = (EllipsisTextView) b.a(view, R.id.notesTextView);
                                                if (ellipsisTextView2 != null) {
                                                    i10 = R.id.reminder_textview;
                                                    TextView textView4 = (TextView) b.a(view, R.id.reminder_textview);
                                                    if (textView4 != null) {
                                                        i10 = R.id.specialTaskText;
                                                        TextView textView5 = (TextView) b.a(view, R.id.specialTaskText);
                                                        if (textView5 != null) {
                                                            i10 = R.id.streakTextView;
                                                            TextView textView6 = (TextView) b.a(view, R.id.streakTextView);
                                                            if (textView6 != null) {
                                                                i10 = R.id.taskIconWrapper;
                                                                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.taskIconWrapper);
                                                                if (linearLayout != null) {
                                                                    return new TaskMainContentBinding((LinearLayout) view, textView, textView2, ellipsisTextView, textView3, button, imageView, imageView2, imageView3, imageView4, imageView5, ellipsisTextView2, textView4, textView5, textView6, linearLayout);
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

    public static TaskMainContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TaskMainContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.task_main_content, viewGroup, false);
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
