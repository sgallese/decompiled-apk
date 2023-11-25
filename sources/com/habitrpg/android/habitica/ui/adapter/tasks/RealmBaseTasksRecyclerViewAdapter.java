package com.habitrpg.android.habitica.ui.adapter.tasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.databinding.AdventureGuideMenuBannerBinding;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import ec.t;
import io.realm.OrderedRealmCollection;
import io.realm.RealmQuery;
import io.realm.g1;
import java.util.List;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: RealmBaseTasksRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public abstract class RealmBaseTasksRecyclerViewAdapter extends BaseRecyclerViewAdapter<Task, RecyclerView.f0> implements TaskRecyclerViewAdapter {
    public static final int $stable = 8;
    private l<? super Boolean, w> adventureGuideOpenEvents;
    private l<? super Task, w> brokenTaskEvents;
    private p<? super Task, ? super ChecklistItem, w> checklistItemScoreEvents;
    private l<? super String, w> errorButtonEvents;
    private final int layoutResource;
    private boolean showAdventureGuide;
    private String taskDisplayMode;
    private p<? super Task, ? super View, w> taskOpenEvents;
    private p<? super Task, ? super TaskDirection, w> taskScoreEvents;
    private List<? extends Task> unfilteredData;
    private User user;
    private final TasksViewModel viewModel;

    public RealmBaseTasksRecyclerViewAdapter(int i10, TasksViewModel tasksViewModel) {
        q.i(tasksViewModel, "viewModel");
        this.layoutResource = i10;
        this.viewModel = tasksViewModel;
        this.taskDisplayMode = "standard";
    }

    private final View getContentView(ViewGroup viewGroup, int i10) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(RealmBaseTasksRecyclerViewAdapter realmBaseTasksRecyclerViewAdapter, View view) {
        q.i(realmBaseTasksRecyclerViewAdapter, "this$0");
        l<Boolean, w> adventureGuideOpenEvents = realmBaseTasksRecyclerViewAdapter.getAdventureGuideOpenEvents();
        if (adventureGuideOpenEvents != null) {
            adventureGuideOpenEvents.invoke(Boolean.TRUE);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public final void filter() {
        List<? extends Task> list = this.unfilteredData;
        if (list == null) {
            return;
        }
        if (list instanceof OrderedRealmCollection) {
            RealmQuery<Task> createQuery = this.viewModel.createQuery((OrderedRealmCollection) list);
            if (createQuery != null) {
                g1<Task> p10 = createQuery.p();
                q.h(p10, "findAll(...)");
                setData(p10);
                return;
            }
            return;
        }
        setData(list);
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public l<Boolean, w> getAdventureGuideOpenEvents() {
        return this.adventureGuideOpenEvents;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public l<Task, w> getBrokenTaskEvents() {
        return this.brokenTaskEvents;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public p<Task, ChecklistItem, w> getChecklistItemScoreEvents() {
        return this.checklistItemScoreEvents;
    }

    public final View getContentView$Habitica_2311256681_prodRelease(ViewGroup viewGroup) {
        q.i(viewGroup, "parent");
        return getContentView(viewGroup, this.layoutResource);
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public l<String, w> getErrorButtonEvents() {
        return this.errorButtonEvents;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return getData().size() + (getShowAdventureGuide() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (getShowAdventureGuide() && i10 == 0) {
            return 1;
        }
        return super.getItemViewType(i10);
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public boolean getShowAdventureGuide() {
        return this.showAdventureGuide;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public String getTaskDisplayMode() {
        return this.taskDisplayMode;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public p<Task, View, w> getTaskOpenEvents() {
        return this.taskOpenEvents;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public p<Task, TaskDirection, w> getTaskScoreEvents() {
        return this.taskScoreEvents;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public User getUser() {
        return this.user;
    }

    public final TasksViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        String str;
        q.i(f0Var, "holder");
        Task item = getItem(i10);
        if (item != null && (f0Var instanceof BaseTaskViewHolder)) {
            BaseTaskViewHolder baseTaskViewHolder = (BaseTaskViewHolder) f0Var;
            User user = getUser();
            if (user != null) {
                str = user.getId();
            } else {
                str = null;
            }
            baseTaskViewHolder.setUserID(str);
            baseTaskViewHolder.setLocked(!this.viewModel.canScoreTask(item));
            baseTaskViewHolder.bind(item, i10, getTaskDisplayMode(), this.viewModel.getOwnerID().f());
            baseTaskViewHolder.setErrorButtonClicked(new RealmBaseTasksRecyclerViewAdapter$onBindViewHolder$1(this));
        } else if (f0Var instanceof AdventureGuideViewHolder) {
            f0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.adapter.tasks.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RealmBaseTasksRecyclerViewAdapter.onBindViewHolder$lambda$0(RealmBaseTasksRecyclerViewAdapter.this, view);
                }
            });
            User user2 = getUser();
            if (user2 != null) {
                ((AdventureGuideViewHolder) f0Var).update(user2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        Context context = viewGroup.getContext();
        q.h(context, "getContext(...)");
        AdventureGuideMenuBannerBinding inflate = AdventureGuideMenuBannerBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), viewGroup, false);
        q.h(inflate, "inflate(...)");
        FrameLayout root = inflate.getRoot();
        q.h(root, "getRoot(...)");
        return new AdventureGuideViewHolder(root);
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void setAdventureGuideOpenEvents(l<? super Boolean, w> lVar) {
        this.adventureGuideOpenEvents = lVar;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void setBrokenTaskEvents(l<? super Task, w> lVar) {
        this.brokenTaskEvents = lVar;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void setChecklistItemScoreEvents(p<? super Task, ? super ChecklistItem, w> pVar) {
        this.checklistItemScoreEvents = pVar;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void setErrorButtonEvents(l<? super String, w> lVar) {
        this.errorButtonEvents = lVar;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void setShowAdventureGuide(boolean z10) {
        if (this.showAdventureGuide == z10) {
            return;
        }
        this.showAdventureGuide = z10;
        notifyDataSetChanged();
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void setTaskDisplayMode(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (!q.d(this.taskDisplayMode, str)) {
            this.taskDisplayMode = str;
            notifyDataSetChanged();
        }
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void setTaskOpenEvents(p<? super Task, ? super View, w> pVar) {
        this.taskOpenEvents = pVar;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void setTaskScoreEvents(p<? super Task, ? super TaskDirection, w> pVar) {
        this.taskScoreEvents = pVar;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void setUser(User user) {
        this.user = user;
        notifyDataSetChanged();
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void updateUnfilteredData(List<? extends Task> list) {
        this.unfilteredData = list;
        if (list == null) {
            list = t.i();
        }
        setData(list);
        filter();
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter
    public Task getItem(int i10) {
        if (getShowAdventureGuide() && i10 == 0) {
            return null;
        }
        if (getShowAdventureGuide()) {
            return (Task) super.getItem(i10 - 1);
        }
        return (Task) super.getItem(i10);
    }
}
