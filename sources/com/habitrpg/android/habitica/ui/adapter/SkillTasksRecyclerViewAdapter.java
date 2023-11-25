package com.habitrpg.android.habitica.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.SkillTaskItemCardBinding;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import java.util.UUID;
import pc.l;
import qc.q;

/* compiled from: SkillTasksRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class SkillTasksRecyclerViewAdapter extends BaseRecyclerViewAdapter<Task, TaskViewHolder> {
    public static final int $stable = 8;
    private l<? super Task, w> onTaskSelection;

    /* compiled from: SkillTasksRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public final class TaskViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        private final SkillTaskItemCardBinding binding;
        private Task task;
        final /* synthetic */ SkillTasksRecyclerViewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskViewHolder(SkillTasksRecyclerViewAdapter skillTasksRecyclerViewAdapter, View view) {
            super(view);
            q.i(view, "itemView");
            this.this$0 = skillTasksRecyclerViewAdapter;
            SkillTaskItemCardBinding bind = SkillTaskItemCardBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
            view.setOnClickListener(this);
            view.setClickable(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        
            if (r0 == true) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void bindHolder$Habitica_2311256681_prodRelease(com.habitrpg.android.habitica.models.tasks.Task r4) {
            /*
                r3 = this;
                java.lang.String r0 = "task"
                qc.q.i(r4, r0)
                r3.task = r4
                com.habitrpg.android.habitica.databinding.SkillTaskItemCardBinding r0 = r3.binding
                android.widget.TextView r0 = r0.titleTextView
                com.habitrpg.android.habitica.ui.adapter.SkillTasksRecyclerViewAdapter$TaskViewHolder$bindHolder$1 r1 = new com.habitrpg.android.habitica.ui.adapter.SkillTasksRecyclerViewAdapter$TaskViewHolder$bindHolder$1
                r1.<init>(r3)
                java.lang.CharSequence r1 = r4.markdownText(r1)
                r0.setText(r1)
                java.lang.String r0 = r4.getNotes()
                r1 = 0
                if (r0 == 0) goto L2b
                int r0 = r0.length()
                r2 = 1
                if (r0 != 0) goto L27
                r0 = 1
                goto L28
            L27:
                r0 = 0
            L28:
                if (r0 != r2) goto L2b
                goto L2c
            L2b:
                r2 = 0
            L2c:
                if (r2 == 0) goto L38
                com.habitrpg.android.habitica.databinding.SkillTaskItemCardBinding r0 = r3.binding
                android.widget.TextView r0 = r0.notesTextView
                r1 = 8
                r0.setVisibility(r1)
                goto L4f
            L38:
                com.habitrpg.android.habitica.databinding.SkillTaskItemCardBinding r0 = r3.binding
                android.widget.TextView r0 = r0.notesTextView
                r0.setVisibility(r1)
                com.habitrpg.android.habitica.databinding.SkillTaskItemCardBinding r0 = r3.binding
                android.widget.TextView r0 = r0.notesTextView
                com.habitrpg.android.habitica.ui.adapter.SkillTasksRecyclerViewAdapter$TaskViewHolder$bindHolder$2 r1 = new com.habitrpg.android.habitica.ui.adapter.SkillTasksRecyclerViewAdapter$TaskViewHolder$bindHolder$2
                r1.<init>(r3)
                java.lang.CharSequence r1 = r4.markdownNotes(r1)
                r0.setText(r1)
            L4f:
                com.habitrpg.android.habitica.databinding.SkillTaskItemCardBinding r0 = r3.binding
                android.view.View r0 = r0.rightBorderView
                android.view.View r1 = r3.itemView
                android.content.Context r1 = r1.getContext()
                int r4 = r4.getLightTaskColor()
                int r4 = androidx.core.content.a.c(r1, r4)
                r0.setBackgroundColor(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.adapter.SkillTasksRecyclerViewAdapter.TaskViewHolder.bindHolder$Habitica_2311256681_prodRelease(com.habitrpg.android.habitica.models.tasks.Task):void");
        }

        public final Task getTask() {
            return this.task;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Task task;
            l<Task, w> onTaskSelection;
            q.i(view, "v");
            if (q.d(view, this.itemView) && (task = this.task) != null && (onTaskSelection = this.this$0.getOnTaskSelection()) != null) {
                onTaskSelection.invoke(task);
            }
        }

        public final void setTask(Task task) {
            this.task = task;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        String id2;
        Task item = getItem(i10);
        boolean z10 = false;
        if (item != null && (id2 = item.getId()) != null && id2.length() == 36) {
            z10 = true;
        }
        if (z10) {
            return UUID.fromString(item.getId()).getMostSignificantBits();
        }
        return UUID.randomUUID().getMostSignificantBits();
    }

    public final l<Task, w> getOnTaskSelection() {
        return this.onTaskSelection;
    }

    public final void setOnTaskSelection(l<? super Task, w> lVar) {
        this.onTaskSelection = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(TaskViewHolder taskViewHolder, int i10) {
        q.i(taskViewHolder, "holder");
        taskViewHolder.bindHolder$Habitica_2311256681_prodRelease(getData().get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public TaskViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.skill_task_item_card, viewGroup, false);
        q.f(inflate);
        return new TaskViewHolder(this, inflate);
    }
}
