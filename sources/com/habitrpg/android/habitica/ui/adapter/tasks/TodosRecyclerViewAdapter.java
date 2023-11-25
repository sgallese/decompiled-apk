package com.habitrpg.android.habitica.ui.adapter.tasks;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.TodoViewHolder;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import qc.q;

/* compiled from: TodosRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class TodosRecyclerViewAdapter extends RealmBaseTasksRecyclerViewAdapter {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodosRecyclerViewAdapter(int i10, TasksViewModel tasksViewModel) {
        super(i10, tasksViewModel);
        q.i(tasksViewModel, "viewModel");
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.RealmBaseTasksRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        if (i10 == 0) {
            return new TodoViewHolder(getContentView$Habitica_2311256681_prodRelease(viewGroup), new TodosRecyclerViewAdapter$onCreateViewHolder$1(this), new TodosRecyclerViewAdapter$onCreateViewHolder$2(this), new TodosRecyclerViewAdapter$onCreateViewHolder$3(this), new TodosRecyclerViewAdapter$onCreateViewHolder$4(this), getViewModel());
        }
        return super.onCreateViewHolder(viewGroup, i10);
    }
}
