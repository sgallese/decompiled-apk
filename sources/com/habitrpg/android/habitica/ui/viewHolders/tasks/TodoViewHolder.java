package com.habitrpg.android.habitica.ui.viewHolders.tasks;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.DateExtensionsKt;
import com.habitrpg.android.habitica.helpers.GroupPlanInfoProvider;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import java.util.Date;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: TodoViewHolder.kt */
/* loaded from: classes4.dex */
public final class TodoViewHolder extends ChecklistedViewHolder {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodoViewHolder(View view, p<? super Task, ? super TaskDirection, w> pVar, p<? super Task, ? super ChecklistItem, w> pVar2, l<? super dc.l<? extends Task, ? extends View>, w> lVar, l<? super Task, w> lVar2, GroupPlanInfoProvider groupPlanInfoProvider) {
        super(view, pVar, pVar2, lVar, lVar2, groupPlanInfoProvider);
        q.i(view, "itemView");
        q.i(pVar, "scoreTaskFunc");
        q.i(pVar2, "scoreChecklistItemFunc");
        q.i(lVar, "openTaskFunc");
        q.i(lVar2, "brokenTaskFunc");
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.ChecklistedViewHolder, com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public void bind(Task task, int i10, String str, String str2) {
        q.i(task, "data");
        q.i(str, "displayMode");
        setTask(task);
        setChecklistIndicatorBackgroundActive(task.isChecklistDisplayActive());
        getReminderTextView().setVisibility(8);
        getStreakTextView().setVisibility(8);
        super.bind(task, i10, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public void configureSpecialTaskTextView(Task task) {
        TextView specialTaskTextView;
        TextView specialTaskTextView2;
        q.i(task, "task");
        super.configureSpecialTaskTextView(task);
        if (task.getDueDate() != null) {
            Boolean isDueToday = task.isDueToday();
            Boolean bool = Boolean.TRUE;
            if (q.d(isDueToday, bool)) {
                TextView specialTaskTextView3 = getSpecialTaskTextView();
                if (specialTaskTextView3 != null) {
                    specialTaskTextView3.setText(getContext().getString(R.string.today));
                }
            } else if (q.d(task.isDayOrMorePastDue(), bool)) {
                Date dueDate = task.getDueDate();
                if (dueDate != null && (specialTaskTextView2 = getSpecialTaskTextView()) != null) {
                    specialTaskTextView2.setText(DateExtensionsKt.formatForLocale(dueDate));
                }
                TextView specialTaskTextView4 = getSpecialTaskTextView();
                if (specialTaskTextView4 != null) {
                    specialTaskTextView4.setTextColor(androidx.core.content.a.c(getContext(), R.color.maroon100_red100));
                }
            } else {
                Date dueDate2 = task.getDueDate();
                if (dueDate2 != null && (specialTaskTextView = getSpecialTaskTextView()) != null) {
                    specialTaskTextView.setText(DateExtensionsKt.formatForLocale(dueDate2));
                }
                TextView specialTaskTextView5 = getSpecialTaskTextView();
                if (specialTaskTextView5 != null) {
                    specialTaskTextView5.setTextColor(androidx.core.content.a.c(getContext(), R.color.gray_300));
                }
            }
            TextView specialTaskTextView6 = getSpecialTaskTextView();
            if (specialTaskTextView6 != null) {
                specialTaskTextView6.setVisibility(0);
            }
            ImageView calendarIconView = getCalendarIconView();
            if (calendarIconView != null) {
                calendarIconView.setVisibility(0);
                return;
            }
            return;
        }
        TextView specialTaskTextView7 = getSpecialTaskTextView();
        if (specialTaskTextView7 != null) {
            specialTaskTextView7.setVisibility(4);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.ChecklistedViewHolder
    public boolean shouldDisplayAsActive(Task task, String str) {
        boolean z10 = false;
        if (task != null && task.completed(str)) {
            z10 = true;
        }
        return !z10;
    }
}
