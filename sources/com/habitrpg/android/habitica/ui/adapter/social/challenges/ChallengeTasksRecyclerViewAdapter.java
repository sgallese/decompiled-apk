package com.habitrpg.android.habitica.ui.adapter.social.challenges;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.adapter.social.challenges.ChallengeTasksRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.adapter.tasks.BaseTasksRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.viewHolders.BindableViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.DailyViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.HabitViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.RewardViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.TodoViewHolder;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.w;
import ec.b0;
import ec.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pc.l;
import qc.h;
import qc.q;

/* compiled from: ChallengeTasksRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class ChallengeTasksRecyclerViewAdapter extends BaseTasksRecyclerViewAdapter<BindableViewHolder<Task>> {
    private static final int TYPE_ADD_ITEM = 5;
    private static final int TYPE_DAILY = 2;
    private static final int TYPE_HABIT = 1;
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_REWARD = 4;
    private static final int TYPE_TODO = 3;
    private l<? super Task, w> onAddItem;
    private l<? super Task, w> onTaskOpen;
    private final boolean openTaskDisabled;
    private final boolean taskActionsDisabled;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChallengeTasksRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public final class AddItemViewHolder extends BindableViewHolder<Task> {
        private final Button addBtn;
        private final l<Task, w> callback;
        private Task newTask;
        final /* synthetic */ ChallengeTasksRecyclerViewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AddItemViewHolder(ChallengeTasksRecyclerViewAdapter challengeTasksRecyclerViewAdapter, View view, l<? super Task, w> lVar) {
            super(view);
            q.i(view, "itemView");
            this.this$0 = challengeTasksRecyclerViewAdapter;
            this.callback = lVar;
            View findViewById = view.findViewById(R.id.btn_add_task);
            q.h(findViewById, "findViewById(...)");
            Button button = (Button) findViewById;
            this.addBtn = button;
            button.setClickable(true);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.adapter.social.challenges.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChallengeTasksRecyclerViewAdapter.AddItemViewHolder._init_$lambda$1(ChallengeTasksRecyclerViewAdapter.AddItemViewHolder.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(AddItemViewHolder addItemViewHolder, View view) {
            l<Task, w> lVar;
            q.i(addItemViewHolder, "this$0");
            Task task = addItemViewHolder.newTask;
            if (task != null && (lVar = addItemViewHolder.callback) != null) {
                lVar.invoke(task);
            }
        }

        @Override // com.habitrpg.android.habitica.ui.viewHolders.BindableViewHolder
        public void bind(Task task, int i10, String str) {
            q.i(task, "data");
            q.i(str, "displayMode");
            this.newTask = task;
            this.addBtn.setText(task.getText());
        }
    }

    /* compiled from: ChallengeTasksRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChallengeTasksRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class DividerViewHolder extends BindableViewHolder<Task> {
        private final TextView dividerName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DividerViewHolder(View view) {
            super(view);
            q.i(view, "itemView");
            View findViewById = view.findViewById(R.id.divider_name);
            q.h(findViewById, "findViewById(...)");
            this.dividerName = (TextView) findViewById;
        }

        @Override // com.habitrpg.android.habitica.ui.viewHolders.BindableViewHolder
        public void bind(Task task, int i10, String str) {
            q.i(task, "data");
            q.i(str, "displayMode");
            this.dividerName.setText(task.getText());
        }
    }

    /* compiled from: ChallengeTasksRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                iArr[TaskType.HABIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskType.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskType.TODO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaskType.REWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeTasksRecyclerViewAdapter(TasksViewModel tasksViewModel, int i10, Context context, String str, boolean z10, boolean z11) {
        super(TaskType.HABIT, tasksViewModel, i10, context, str);
        q.i(tasksViewModel, "viewModel");
        q.i(context, "newContext");
        q.i(str, "userID");
        this.openTaskDisabled = z10;
        this.taskActionsDisabled = z11;
    }

    public final int addTaskUnder(Task task, Task task2) {
        String str;
        q.i(task, "taskToAdd");
        List<Task> content = getContent();
        int i10 = 0;
        if (content != null) {
            Iterator<Task> it = content.iterator();
            while (true) {
                if (it.hasNext()) {
                    String id2 = it.next().getId();
                    if (task2 != null) {
                        str = task2.getId();
                    } else {
                        str = null;
                    }
                    if (q.d(id2, str)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
        }
        List<Task> content2 = getContent();
        if (content2 != null) {
            content2.add(i10 + 1, task);
        }
        filter();
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        Task task;
        TaskType taskType;
        int i11;
        List<Task> filteredContent = getFilteredContent();
        String str = null;
        if (filteredContent != null) {
            task = filteredContent.get(i10);
        } else {
            task = null;
        }
        if (task != null) {
            taskType = task.getType();
        } else {
            taskType = null;
        }
        if (taskType == null) {
            i11 = -1;
        } else {
            i11 = WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()];
        }
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        if (i11 == 3) {
            return 3;
        }
        if (i11 == 4) {
            return 4;
        }
        if (task != null) {
            str = task.getId();
        }
        if (q.d(str, "addtask")) {
            return 5;
        }
        return 0;
    }

    public final l<Task, w> getOnAddItem() {
        return this.onAddItem;
    }

    public final l<Task, w> getOnTaskOpen() {
        return this.onTaskOpen;
    }

    public final List<Task> getTaskList() {
        int s10;
        List<Task> F0;
        List<Task> content = getContent();
        if (content != null) {
            List<Task> list = content;
            s10 = u.s(list, 10);
            ArrayList arrayList = new ArrayList(s10);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((Task) it.next());
            }
            F0 = b0.F0(arrayList);
            if (F0 != null) {
                return F0;
            }
        }
        return new ArrayList();
    }

    public final boolean replaceTask(Task task) {
        int i10;
        int i11;
        String str;
        Task task2;
        q.i(task, "task");
        int i12 = 0;
        while (true) {
            List<Task> content = getContent();
            if (content != null) {
                i10 = content.size();
            } else {
                i10 = 0;
            }
            if (i12 >= i10) {
                break;
            }
            List<Task> content2 = getContent();
            if (content2 != null && (task2 = content2.get(i12)) != null) {
                str = task2.getId();
            } else {
                str = null;
            }
            if (q.d(str, task.getId())) {
                break;
            }
            i12++;
        }
        List<Task> content3 = getContent();
        if (content3 != null) {
            i11 = content3.size();
        } else {
            i11 = 0;
        }
        if (i12 >= i11) {
            return false;
        }
        List<Task> content4 = getContent();
        if (content4 != null) {
            content4.set(i12, task);
        }
        filter();
        return true;
    }

    public final void setOnAddItem(l<? super Task, w> lVar) {
        this.onAddItem = lVar;
    }

    public final void setOnTaskOpen(l<? super Task, w> lVar) {
        this.onTaskOpen = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public BindableViewHolder<Task> onCreateViewHolder(ViewGroup viewGroup, int i10) {
        BindableViewHolder<Task> habitViewHolder;
        q.i(viewGroup, "parent");
        if (i10 == 1) {
            habitViewHolder = new HabitViewHolder(getContentView(viewGroup, R.layout.habit_item_card), ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$1.INSTANCE, ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$2.INSTANCE, new ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$3(this), null);
        } else if (i10 == 2) {
            habitViewHolder = new DailyViewHolder(getContentView(viewGroup, R.layout.daily_item_card), ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$4.INSTANCE, ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$5.INSTANCE, ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$6.INSTANCE, new ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$7(this), null);
        } else if (i10 == 3) {
            habitViewHolder = new TodoViewHolder(getContentView(viewGroup, R.layout.todo_item_card), ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$8.INSTANCE, ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$9.INSTANCE, ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$10.INSTANCE, new ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$11(this), null);
        } else if (i10 == 4) {
            habitViewHolder = new RewardViewHolder(getContentView(viewGroup, R.layout.reward_item_card), ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$12.INSTANCE, ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$13.INSTANCE, new ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$14(this), null);
        } else if (i10 != 5) {
            habitViewHolder = new DividerViewHolder(getContentView(viewGroup, R.layout.challenge_task_divider));
        } else {
            habitViewHolder = new AddItemViewHolder(this, getContentView(viewGroup, R.layout.challenge_add_task_item), this.onAddItem);
        }
        BaseTaskViewHolder baseTaskViewHolder = habitViewHolder instanceof BaseTaskViewHolder ? (BaseTaskViewHolder) habitViewHolder : null;
        if (baseTaskViewHolder != null) {
            baseTaskViewHolder.setDisabled(this.openTaskDisabled, this.taskActionsDisabled);
        }
        return habitViewHolder;
    }
}
