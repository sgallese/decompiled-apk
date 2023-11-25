package com.habitrpg.android.habitica.ui.viewHolders.tasks;

import android.view.View;
import com.habitrpg.android.habitica.helpers.GroupPlanInfoProvider;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import java.text.DateFormat;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: DailyViewHolder.kt */
/* loaded from: classes4.dex */
public final class DailyViewHolder extends ChecklistedViewHolder {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: DailyViewHolder.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DateFormat getFormatter() {
            DateFormat timeInstance = DateFormat.getTimeInstance(3);
            q.h(timeInstance, "getTimeInstance(...)");
            return timeInstance;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyViewHolder(View view, p<? super Task, ? super TaskDirection, w> pVar, p<? super Task, ? super ChecklistItem, w> pVar2, l<? super dc.l<? extends Task, ? extends View>, w> lVar, l<? super Task, w> lVar2, GroupPlanInfoProvider groupPlanInfoProvider) {
        super(view, pVar, pVar2, lVar, lVar2, groupPlanInfoProvider);
        q.i(view, "itemView");
        q.i(pVar, "scoreTaskFunc");
        q.i(pVar2, "scoreChecklistItemFunc");
        q.i(lVar, "openTaskFunc");
        q.i(lVar2, "brokenTaskFunc");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        if (r16 == null) goto L32;
     */
    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.ChecklistedViewHolder, com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bind(com.habitrpg.android.habitica.models.tasks.Task r18, int r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewHolders.tasks.DailyViewHolder.bind(com.habitrpg.android.habitica.models.tasks.Task, int, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public void configureSpecialTaskTextView(Task task) {
        int i10;
        q.i(task, "task");
        super.configureSpecialTaskTextView(task);
        Integer streak = task.getStreak();
        if (streak != null) {
            i10 = streak.intValue();
        } else {
            i10 = 0;
        }
        if (i10 > 0 && !task.isGroupTask()) {
            getStreakTextView().setText(String.valueOf(task.getStreak()));
            getStreakTextView().setVisibility(0);
            getStreakIconView().setVisibility(0);
            return;
        }
        getStreakTextView().setVisibility(8);
        getStreakIconView().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public boolean getTaskIconWrapperIsVisible() {
        boolean taskIconWrapperIsVisible = super.getTaskIconWrapperIsVisible();
        if (getStreakTextView().getVisibility() == 0) {
            return true;
        }
        return taskIconWrapperIsVisible;
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.ChecklistedViewHolder
    public boolean shouldDisplayAsActive(Task task, String str) {
        if (task != null) {
            return task.isDisplayedActiveForUser(str);
        }
        return false;
    }
}
