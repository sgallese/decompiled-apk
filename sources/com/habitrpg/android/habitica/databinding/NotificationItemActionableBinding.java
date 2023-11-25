package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TableLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class NotificationItemActionableBinding implements a {
    public final Button acceptButton;
    public final TextView difficultyLabel;
    public final TextView messageText;
    public final LinearLayout notificationItem;
    public final TableLayout questDetailView;
    public final RatingBar questDifficulty;
    public final TextView questObjectiveLabel;
    public final TextView questObjectiveText;
    public final Button rejectButton;
    private final LinearLayout rootView;

    private NotificationItemActionableBinding(LinearLayout linearLayout, Button button, TextView textView, TextView textView2, LinearLayout linearLayout2, TableLayout tableLayout, RatingBar ratingBar, TextView textView3, TextView textView4, Button button2) {
        this.rootView = linearLayout;
        this.acceptButton = button;
        this.difficultyLabel = textView;
        this.messageText = textView2;
        this.notificationItem = linearLayout2;
        this.questDetailView = tableLayout;
        this.questDifficulty = ratingBar;
        this.questObjectiveLabel = textView3;
        this.questObjectiveText = textView4;
        this.rejectButton = button2;
    }

    public static NotificationItemActionableBinding bind(View view) {
        int i10 = R.id.accept_button;
        Button button = (Button) b.a(view, R.id.accept_button);
        if (button != null) {
            i10 = R.id.difficulty_label;
            TextView textView = (TextView) b.a(view, R.id.difficulty_label);
            if (textView != null) {
                i10 = R.id.message_text;
                TextView textView2 = (TextView) b.a(view, R.id.message_text);
                if (textView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i10 = R.id.quest_detail_view;
                    TableLayout tableLayout = (TableLayout) b.a(view, R.id.quest_detail_view);
                    if (tableLayout != null) {
                        i10 = R.id.quest_difficulty;
                        RatingBar ratingBar = (RatingBar) b.a(view, R.id.quest_difficulty);
                        if (ratingBar != null) {
                            i10 = R.id.quest_objective_label;
                            TextView textView3 = (TextView) b.a(view, R.id.quest_objective_label);
                            if (textView3 != null) {
                                i10 = R.id.quest_objective_text;
                                TextView textView4 = (TextView) b.a(view, R.id.quest_objective_text);
                                if (textView4 != null) {
                                    i10 = R.id.reject_button;
                                    Button button2 = (Button) b.a(view, R.id.reject_button);
                                    if (button2 != null) {
                                        return new NotificationItemActionableBinding(linearLayout, button, textView, textView2, linearLayout, tableLayout, ratingBar, textView3, textView4, button2);
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

    public static NotificationItemActionableBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NotificationItemActionableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.notification_item_actionable, viewGroup, false);
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
