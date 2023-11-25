package com.habitrpg.android.habitica.ui.adapter.tasks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.viewHolders.ShopItemViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.RewardViewHolder;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import ec.b0;
import java.util.List;
import pc.l;
import pc.p;
import qc.h;
import qc.q;

/* compiled from: RewardsRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class RewardsRecyclerViewAdapter extends BaseRecyclerViewAdapter<Task, RecyclerView.f0> implements TaskRecyclerViewAdapter {
    private static final int VIEWTYPE_CUSTOM_REWARD = 0;
    private static final int VIEWTYPE_IN_APP_REWARD = 3;
    private l<? super Boolean, w> adventureGuideOpenEvents;
    private l<? super Task, w> brokenTaskEvents;
    private p<? super Task, ? super ChecklistItem, w> checklistItemScoreEvents;
    private List<? extends Task> customRewards;
    private l<? super String, w> errorButtonEvents;
    private Integer goldGemsLeft;
    private List<? extends ShopItem> inAppRewards;
    private final int layoutResource;
    private p<? super ShopItem, ? super Boolean, w> onShowPurchaseDialog;
    private l<? super ShopItem, w> purchaseCardEvents;
    private boolean showAdventureGuide;
    private String taskDisplayMode;
    private p<? super Task, ? super View, w> taskOpenEvents;
    private p<? super Task, ? super TaskDirection, w> taskScoreEvents;
    private User user;
    private final TasksViewModel viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RewardsRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public RewardsRecyclerViewAdapter(List<? extends Task> list, int i10, TasksViewModel tasksViewModel) {
        q.i(tasksViewModel, "viewModel");
        this.customRewards = list;
        this.layoutResource = i10;
        this.viewModel = tasksViewModel;
        this.taskDisplayMode = "standard";
    }

    private final View getContentView(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.layoutResource, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    private final int getCustomRewardCount() {
        List<? extends Task> list = this.customRewards;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    private final int getInAppRewardCount() {
        List<? extends ShopItem> list = this.inAppRewards;
        if (list != null) {
            return list.size();
        }
        return 0;
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

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public l<String, w> getErrorButtonEvents() {
        return this.errorButtonEvents;
    }

    public final Integer getGoldGemsLeft() {
        return this.goldGemsLeft;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        int customRewardCount = getCustomRewardCount();
        if (this.viewModel.isPersonalBoard()) {
            return customRewardCount + getInAppRewardCount();
        }
        return customRewardCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if ((this.customRewards != null && i10 < getCustomRewardCount()) || (getCustomRewardCount() == 0 && getInAppRewardCount() == 0)) {
            return 0;
        }
        return 3;
    }

    public final p<ShopItem, Boolean, w> getOnShowPurchaseDialog() {
        return this.onShowPurchaseDialog;
    }

    public final l<ShopItem, w> getPurchaseCardEvents() {
        return this.purchaseCardEvents;
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
        ShopItem shopItem;
        Task task;
        double d10;
        RewardViewHolder rewardViewHolder;
        boolean z10;
        Stats stats;
        Double gp;
        q.i(f0Var, "holder");
        if (this.customRewards != null && i10 < getCustomRewardCount()) {
            List<? extends Task> list = this.customRewards;
            if (list != null && (task = list.get(i10)) != null) {
                User user = getUser();
                if (user != null && (stats = user.getStats()) != null && (gp = stats.getGp()) != null) {
                    d10 = gp.doubleValue();
                } else {
                    d10 = 0.0d;
                }
                boolean z11 = f0Var instanceof RewardViewHolder;
                RewardViewHolder rewardViewHolder2 = null;
                if (z11) {
                    rewardViewHolder = (RewardViewHolder) f0Var;
                } else {
                    rewardViewHolder = null;
                }
                if (rewardViewHolder != null) {
                    rewardViewHolder.setLocked(!this.viewModel.canScoreTask(task));
                }
                if (z11) {
                    rewardViewHolder2 = (RewardViewHolder) f0Var;
                }
                if (rewardViewHolder2 != null) {
                    if (task.getValue() <= d10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rewardViewHolder2.bind(task, i10, z10, getTaskDisplayMode(), this.viewModel.getOwnerID().f());
                    return;
                }
                return;
            }
            return;
        }
        List<? extends ShopItem> list2 = this.inAppRewards;
        if (list2 != null && list2 != null && (shopItem = list2.get(i10 - getCustomRewardCount())) != null && (f0Var instanceof ShopItemViewHolder)) {
            if (q.d(shopItem.getKey(), "gem")) {
                ((ShopItemViewHolder) f0Var).setLimitedNumberLeft(this.goldGemsLeft);
            }
            ShopItemViewHolder shopItemViewHolder = (ShopItemViewHolder) f0Var;
            shopItemViewHolder.bind(shopItem, shopItem.canAfford(getUser(), 1), 0);
            shopItemViewHolder.setPinned(true);
            shopItemViewHolder.hidePinIndicator();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        if (i10 == 0) {
            return new RewardViewHolder(getContentView(viewGroup), new RewardsRecyclerViewAdapter$onCreateViewHolder$1(this), new RewardsRecyclerViewAdapter$onCreateViewHolder$2(this), new RewardsRecyclerViewAdapter$onCreateViewHolder$3(this), this.viewModel);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_shopitem, viewGroup, false);
        q.h(inflate, "inflate(...)");
        ShopItemViewHolder shopItemViewHolder = new ShopItemViewHolder(inflate);
        shopItemViewHolder.setPurchaseCardAction(new RewardsRecyclerViewAdapter$onCreateViewHolder$4(this));
        shopItemViewHolder.setOnShowPurchaseDialog(this.onShowPurchaseDialog);
        return shopItemViewHolder;
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

    public final void setGoldGemsLeft(Integer num) {
        this.goldGemsLeft = num;
    }

    public final void setOnShowPurchaseDialog(p<? super ShopItem, ? super Boolean, w> pVar) {
        this.onShowPurchaseDialog = pVar;
    }

    public final void setPurchaseCardEvents(l<? super ShopItem, w> lVar) {
        this.purchaseCardEvents = lVar;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void setShowAdventureGuide(boolean z10) {
        this.showAdventureGuide = z10;
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
        Integer num;
        User user2 = this.user;
        Integer num2 = null;
        if (user2 != null) {
            num = Integer.valueOf(user2.getVersionNumber());
        } else {
            num = null;
        }
        if (user != null) {
            num2 = Integer.valueOf(user.getVersionNumber());
        }
        if (q.d(num, num2)) {
            return;
        }
        this.user = user;
        notifyDataSetChanged();
    }

    public final void updateData(List<? extends Task> list) {
        this.customRewards = list;
        notifyDataSetChanged();
    }

    public final void updateItemRewards(List<? extends ShopItem> list) {
        Object a02;
        q.i(list, NavigationDrawerFragment.SIDEBAR_ITEMS);
        if ((!list.isEmpty()) != false) {
            a02 = b0.a0(list);
            if (Task.class.isAssignableFrom(a02.getClass())) {
                return;
            }
        }
        this.inAppRewards = list;
        notifyDataSetChanged();
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void updateUnfilteredData(List<? extends Task> list) {
        updateData(list);
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter
    public void filter() {
    }
}
