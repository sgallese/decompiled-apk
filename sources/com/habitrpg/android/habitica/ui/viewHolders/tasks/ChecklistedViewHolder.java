package com.habitrpg.android.habitica.ui.viewHolders.tasks;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.helpers.GroupPlanInfoProvider;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.views.EllipsisTextView;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.w;
import io.realm.x0;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: ChecklistedViewHolder.kt */
/* loaded from: classes4.dex */
public abstract class ChecklistedViewHolder extends BaseTaskViewHolder {
    private static Integer expandedChecklistRow;
    private final View checkboxBackground;
    private final ViewGroup checkboxHolder;
    private final TextView checklistAllTextView;
    private final TextView checklistCompletedTextView;
    private final View checklistDivider;
    private final ViewGroup checklistIndicatorWrapper;
    private final LinearLayout checklistView;
    private final ImageView checkmarkView;
    private final ImageView lockView;
    private p<? super Task, ? super ChecklistItem, w> scoreChecklistItemFunc;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChecklistedViewHolder.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChecklistedViewHolder(View view, p<? super Task, ? super TaskDirection, w> pVar, p<? super Task, ? super ChecklistItem, w> pVar2, l<? super dc.l<? extends Task, ? extends View>, w> lVar, l<? super Task, w> lVar2, GroupPlanInfoProvider groupPlanInfoProvider) {
        super(view, pVar, lVar, lVar2, groupPlanInfoProvider);
        q.i(view, "itemView");
        q.i(pVar, "scoreTaskFunc");
        q.i(pVar2, "scoreChecklistItemFunc");
        q.i(lVar, "openTaskFunc");
        q.i(lVar2, "brokenTaskFunc");
        this.scoreChecklistItemFunc = pVar2;
        View findViewById = view.findViewById(R.id.checkBoxHolder);
        q.h(findViewById, "findViewById(...)");
        this.checkboxHolder = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.checkmark);
        q.h(findViewById2, "findViewById(...)");
        this.checkmarkView = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.lock_view);
        q.h(findViewById3, "findViewById(...)");
        this.lockView = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.checkBoxBackground);
        q.h(findViewById4, "findViewById(...)");
        this.checkboxBackground = findViewById4;
        View findViewById5 = view.findViewById(R.id.checklistView);
        q.h(findViewById5, "findViewById(...)");
        this.checklistView = (LinearLayout) findViewById5;
        View findViewById6 = view.findViewById(R.id.checklistIndicatorWrapper);
        q.h(findViewById6, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById6;
        this.checklistIndicatorWrapper = viewGroup;
        View findViewById7 = view.findViewById(R.id.checkListCompletedTextView);
        q.h(findViewById7, "findViewById(...)");
        this.checklistCompletedTextView = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.checkListAllTextView);
        q.h(findViewById8, "findViewById(...)");
        this.checklistAllTextView = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.checklistDivider);
        q.h(findViewById9, "findViewById(...)");
        this.checklistDivider = findViewById9;
        viewGroup.setClickable(true);
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.tasks.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChecklistedViewHolder._init_$lambda$0(ChecklistedViewHolder.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ChecklistedViewHolder checklistedViewHolder, View view) {
        q.i(checklistedViewHolder, "this$0");
        checklistedViewHolder.onChecklistIndicatorClicked();
    }

    private final void onCheckedChanged(boolean z10) {
        boolean z11;
        boolean z12;
        Task task;
        TaskDirection taskDirection;
        Task task2 = getTask();
        boolean z13 = true;
        if (task2 != null && task2.isValid()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        Task task3 = getTask();
        if (task3 != null && z10 == task3.completed(getUserID())) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && (task = getTask()) != null) {
            p<Task, TaskDirection, w> scoreTaskFunc = getScoreTaskFunc();
            Task task4 = getTask();
            if (task4 == null || task4.completed(getUserID())) {
                z13 = false;
            }
            if (z13) {
                taskDirection = TaskDirection.UP;
            } else {
                taskDirection = TaskDirection.DOWN;
            }
            scoreTaskFunc.invoke(task, taskDirection);
        }
    }

    private final void onChecklistIndicatorClicked() {
        Integer valueOf;
        RecyclerView recyclerView;
        RecyclerView.p pVar;
        LinearLayoutManager linearLayoutManager = null;
        if (shouldDisplayExpandedChecklist()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(getBindingAdapterPosition());
        }
        expandedChecklistRow = valueOf;
        if (shouldDisplayExpandedChecklist()) {
            ViewParent parent = this.checklistView.getParent().getParent();
            if (parent instanceof RecyclerView) {
                recyclerView = (RecyclerView) parent;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                pVar = recyclerView.getLayoutManager();
            } else {
                pVar = null;
            }
            if (pVar instanceof LinearLayoutManager) {
                linearLayoutManager = pVar;
            }
            if (linearLayoutManager != null) {
                linearLayoutManager.I2(getBindingAdapterPosition(), 15);
            }
        }
        updateChecklistDisplay();
    }

    private final boolean shouldDisplayExpandedChecklist() {
        if (expandedChecklistRow != null) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            Integer num = expandedChecklistRow;
            if (num != null && bindingAdapterPosition == num.intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x01d6, code lost:
    
        if (r12 != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d8, code lost:
    
        if (r11 != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x023e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateChecklistDisplay() {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewHolders.tasks.ChecklistedViewHolder.updateChecklistDisplay():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChecklistDisplay$lambda$2(ChecklistedViewHolder checklistedViewHolder, ChecklistItem checklistItem, View view) {
        q.i(checklistedViewHolder, "this$0");
        q.i(checklistItem, "$item");
        Task task = checklistedViewHolder.getTask();
        if (task != null) {
            checklistedViewHolder.scoreChecklistItemFunc.invoke(task, checklistItem);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public void bind(Task task, int i10, String str, String str2) {
        int i11;
        Integer num;
        boolean z10;
        TaskType taskType;
        int i12;
        int i13;
        int extraExtraDarkTaskColor;
        q.i(task, "data");
        q.i(str, "displayMode");
        boolean completed = task.completed(getUserID());
        int i14 = 0;
        if (task.isPendingApproval()) {
            completed = false;
        }
        if (isLocked()) {
            this.checkmarkView.setVisibility(8);
            this.lockView.setVisibility(0);
            Drawable b10 = h.a.b(getContext(), R.drawable.task_lock);
            if (b10 != null) {
                Context context = getContext();
                if (!q.d(task.isDue(), Boolean.TRUE) && task.getType() != TaskType.TODO) {
                    extraExtraDarkTaskColor = R.color.text_dimmed;
                } else {
                    extraExtraDarkTaskColor = task.getExtraExtraDarkTaskColor();
                }
                b10.setTint(androidx.core.content.a.c(context, extraExtraDarkTaskColor));
            }
            this.lockView.setImageDrawable(b10);
        } else {
            ImageView imageView = this.checkmarkView;
            if (completed) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            this.checkmarkView.getDrawable().setTint(androidx.core.content.a.c(getContext(), R.color.gray_400));
            this.lockView.setVisibility(8);
        }
        this.checklistCompletedTextView.setText(String.valueOf(task.getCompletedChecklistCount()));
        TextView textView = this.checklistAllTextView;
        x0<ChecklistItem> checklist = task.getChecklist();
        TaskType taskType2 = null;
        if (checklist != null) {
            num = Integer.valueOf(checklist.size());
        } else {
            num = null;
        }
        textView.setText(String.valueOf(num));
        this.checklistView.removeAllViews();
        updateChecklistDisplay();
        ViewGroup viewGroup = this.checklistIndicatorWrapper;
        x0<ChecklistItem> checklist2 = task.getChecklist();
        if (checklist2 != null && checklist2.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i14 = 8;
        }
        viewGroup.setVisibility(i14);
        super.bind(task, i10, str, str2);
        Task task2 = getTask();
        if (task2 != null) {
            taskType = task2.getType();
        } else {
            taskType = null;
        }
        TaskType taskType3 = TaskType.DAILY;
        if (taskType == taskType3) {
            i12 = R.drawable.daily_unchecked;
        } else {
            i12 = R.drawable.todo_unchecked;
        }
        Task task3 = getTask();
        if (task3 != null) {
            taskType2 = task3.getType();
        }
        if (taskType2 == taskType3) {
            i13 = R.drawable.daily_checked;
        } else {
            i13 = R.drawable.todo_checked;
        }
        if (shouldDisplayAsActive(task, getUserID()) && !task.isPendingApproval()) {
            this.checkboxHolder.setBackgroundResource(task.getLightTaskColor());
            this.checkboxBackground.setBackgroundResource(i12);
        } else if (completed) {
            getTitleTextView().setTextColor(androidx.core.content.a.c(getContext(), R.color.text_quad));
            EllipsisTextView notesTextView = getNotesTextView();
            if (notesTextView != null) {
                notesTextView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_quad));
            }
            this.checkboxHolder.setBackgroundColor(ContextExtensionsKt.getThemeColor(getContext(), R.attr.colorWindowBackground));
            this.checkboxBackground.setBackgroundResource(i13);
        } else {
            this.checkboxHolder.setBackgroundColor(getTaskGray());
            EllipsisTextView notesTextView2 = getNotesTextView();
            if (notesTextView2 != null) {
                notesTextView2.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_ternary));
            }
            this.checkboxBackground.setBackgroundResource(i12);
            this.checkboxBackground.setBackgroundResource(R.drawable.daily_inactive);
        }
    }

    public final p<Task, ChecklistItem, w> getScoreChecklistItemFunc() {
        return this.scoreChecklistItemFunc;
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public void onLeftActionTouched() {
        boolean z10;
        super.onLeftActionTouched();
        Task task = getTask();
        boolean z11 = false;
        if (task != null && task.isValid()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !isLocked()) {
            Task task2 = getTask();
            if (task2 != null) {
                z11 = task2.completed(getUserID());
            }
            onCheckedChanged(!z11);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public void onRightActionTouched() {
        super.onRightActionTouched();
        onChecklistIndicatorClicked();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setChecklistIndicatorBackgroundActive(boolean z10) {
        int c10;
        Drawable e10 = androidx.core.content.a.e(getContext(), R.drawable.checklist_indicator_background);
        if (z10) {
            if (e10 != null) {
                e10.setTint(androidx.core.content.a.c(getContext(), R.color.gray_200));
            }
            if (ContextExtensionsKt.isUsingNightModeResources(getContext())) {
                c10 = androidx.core.content.a.c(getContext(), R.color.gray_600);
            } else {
                c10 = androidx.core.content.a.c(getContext(), R.color.gray_500);
            }
            this.checklistCompletedTextView.setTextColor(c10);
            this.checklistAllTextView.setTextColor(c10);
            this.checklistDivider.setBackgroundColor(c10);
        } else {
            if (e10 != null) {
                e10.setTint(androidx.core.content.a.c(getContext(), R.color.offset_background));
            }
            int c11 = androidx.core.content.a.c(getContext(), R.color.text_quad);
            this.checklistCompletedTextView.setTextColor(c11);
            this.checklistAllTextView.setTextColor(c11);
            this.checklistDivider.setBackgroundColor(c11);
        }
        if (e10 != null) {
            e10.setTintMode(PorterDuff.Mode.MULTIPLY);
        }
        this.checklistIndicatorWrapper.setBackground(e10);
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public void setDisabled(boolean z10, boolean z11) {
        super.setDisabled(z10, z11);
        this.checkboxHolder.setEnabled(!z11);
    }

    public final void setScoreChecklistItemFunc(p<? super Task, ? super ChecklistItem, w> pVar) {
        q.i(pVar, "<set-?>");
        this.scoreChecklistItemFunc = pVar;
    }

    public abstract boolean shouldDisplayAsActive(Task task, String str);
}
