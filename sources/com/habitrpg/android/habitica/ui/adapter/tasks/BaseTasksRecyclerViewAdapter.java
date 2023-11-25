package com.habitrpg.android.habitica.ui.adapter.tasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.viewHolders.BindableViewHolder;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import java.util.ArrayList;
import java.util.List;
import qc.q;

/* compiled from: BaseTasksRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public abstract class BaseTasksRecyclerViewAdapter<VH extends BindableViewHolder<Task>> extends BaseRecyclerViewAdapter<Task, VH> {
    public static final int $stable = 8;
    private List<Task> content;
    private Context context;
    private List<Task> filteredContent;
    private final int layoutResource;
    private TaskType taskType;
    private final String userID;
    private final TasksViewModel viewModel;

    public BaseTasksRecyclerViewAdapter(TaskType taskType, TasksViewModel tasksViewModel, int i10, Context context, String str) {
        q.i(taskType, "taskType");
        q.i(tasksViewModel, "viewModel");
        q.i(context, "newContext");
        this.taskType = taskType;
        this.viewModel = tasksViewModel;
        this.layoutResource = i10;
        this.userID = str;
        Context applicationContext = context.getApplicationContext();
        q.h(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
        this.filteredContent = new ArrayList();
    }

    private final void updateTask(Task task) {
        int i10;
        List<Task> list;
        String str;
        Task task2;
        if (this.taskType != task.getType()) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            List<Task> list2 = this.content;
            if (list2 != null) {
                i10 = list2.size();
            } else {
                i10 = 0;
            }
            if (i12 >= i10) {
                break;
            }
            List<Task> list3 = this.content;
            if (list3 != null && (task2 = list3.get(i12)) != null) {
                str = task2.getId();
            } else {
                str = null;
            }
            if (q.d(str, task.getId())) {
                break;
            }
            i12++;
        }
        List<Task> list4 = this.content;
        if (list4 != null) {
            i11 = list4.size();
        }
        if (i12 < i11 && (list = this.content) != null) {
            list.set(i12, task);
        }
        filter();
    }

    public final void filter() {
        if (this.viewModel.filterCount(this.taskType) == 0) {
            this.filteredContent = this.content;
        } else {
            ArrayList arrayList = new ArrayList();
            this.filteredContent = arrayList;
            List<Task> list = this.content;
            if (list != null) {
                arrayList.addAll(this.viewModel.filter(list));
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<Task> getContent() {
        return this.content;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View getContentView(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    public final View getContentView$Habitica_2311256681_prodRelease(ViewGroup viewGroup) {
        q.i(viewGroup, "parent");
        return getContentView(viewGroup, this.layoutResource);
    }

    public final Context getContext$Habitica_2311256681_prodRelease() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<Task> getFilteredContent() {
        return this.filteredContent;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        List<Task> list = this.filteredContent;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        Task task;
        String id2;
        List<Task> list = this.filteredContent;
        if (list != null) {
            task = list.get(i10);
        } else {
            task = null;
        }
        if (task != null && (id2 = task.getId()) != null) {
            return id2.hashCode();
        }
        return 0L;
    }

    public final TaskType getTaskType() {
        return this.taskType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        onBindViewHolder((BaseTasksRecyclerViewAdapter<VH>) ((BindableViewHolder) f0Var), i10);
    }

    protected final void setContent(List<Task> list) {
        this.content = list;
    }

    public final void setContext$Habitica_2311256681_prodRelease(Context context) {
        q.i(context, "<set-?>");
        this.context = context;
    }

    protected final void setFilteredContent(List<Task> list) {
        this.filteredContent = list;
    }

    public final void setTaskType(TaskType taskType) {
        q.i(taskType, "<set-?>");
        this.taskType = taskType;
    }

    public final void setTasks(List<? extends Task> list) {
        q.i(list, NavigationDrawerFragment.SIDEBAR_TASKS);
        ArrayList arrayList = new ArrayList();
        this.content = arrayList;
        arrayList.addAll(list);
        filter();
    }

    public void onBindViewHolder(VH vh, int i10) {
        q.i(vh, "holder");
        List<Task> list = this.filteredContent;
        Task task = list != null ? list.get(i10) : null;
        if (task != null) {
            vh.bind(task, i10, "normal");
        }
    }
}
