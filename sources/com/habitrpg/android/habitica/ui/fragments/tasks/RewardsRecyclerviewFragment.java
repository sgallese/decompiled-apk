package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.ui.adapter.tasks.RewardsRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import ec.t;
import java.util.ArrayList;
import java.util.List;
import qc.h;
import qc.q;

/* compiled from: RewardsRecyclerviewFragment.kt */
/* loaded from: classes4.dex */
public final class RewardsRecyclerviewFragment extends Hilt_RewardsRecyclerviewFragment {
    private final androidx.activity.result.b<Intent> cardSelectedResult;
    private ShopItem selectedCard;
    private boolean showCustomRewards = true;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RewardsRecyclerviewFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final RewardsRecyclerviewFragment newInstance(Context context, TaskType taskType, boolean z10) {
            List l10;
            q.i(taskType, "classType");
            RewardsRecyclerviewFragment rewardsRecyclerviewFragment = new RewardsRecyclerviewFragment();
            rewardsRecyclerviewFragment.setTaskType$Habitica_2311256681_prodRelease(taskType);
            rewardsRecyclerviewFragment.showCustomRewards = z10;
            if (context != null) {
                rewardsRecyclerviewFragment.setTutorialStepIdentifier(Challenge.TASK_ORDER_REWARDS);
                l10 = t.l(context.getString(R.string.tutorial_rewards_1), context.getString(R.string.tutorial_rewards_2));
                rewardsRecyclerviewFragment.setTutorialTexts(new ArrayList(l10));
            }
            rewardsRecyclerviewFragment.setTutorialCanBeDeferred(false);
            return rewardsRecyclerviewFragment;
        }
    }

    public RewardsRecyclerviewFragment() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.b
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                RewardsRecyclerviewFragment.cardSelectedResult$lambda$2(RewardsRecyclerviewFragment.this, (ActivityResult) obj);
            }
        });
        q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.cardSelectedResult = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cardSelectedResult$lambda$2(RewardsRecyclerviewFragment rewardsRecyclerviewFragment, ActivityResult activityResult) {
        q.i(rewardsRecyclerviewFragment, "this$0");
        if (activityResult.b() == -1) {
            ExceptionHandlerKt.launchCatching$default(w.a(rewardsRecyclerviewFragment), null, new RewardsRecyclerviewFragment$cardSelectedResult$1$1(rewardsRecyclerviewFragment, activityResult, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(RewardsRecyclerviewFragment rewardsRecyclerviewFragment, View view) {
        q.i(rewardsRecyclerviewFragment, "this$0");
        q.i(view, "$view");
        rewardsRecyclerviewFragment.setGridSpanCount(view.getWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setGridSpanCount(int r4) {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            r1 = 0
            if (r0 == 0) goto L2e
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L12
            android.content.res.Resources r0 = r0.getResources()
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L2e
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L29
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L29
            r2 = 2131166047(0x7f07035f, float:1.7946328E38)
            float r0 = r0.getDimension(r2)
            goto L2a
        L29:
            r0 = 0
        L2a:
            float r4 = (float) r4
            float r4 = r4 / r0
            int r4 = (int) r4
            goto L2f
        L2e:
            r4 = 0
        L2f:
            if (r4 != 0) goto L32
            r4 = 1
        L32:
            androidx.recyclerview.widget.RecyclerView$p r0 = r3.getLayoutManager$Habitica_2311256681_prodRelease()
            boolean r2 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r2 == 0) goto L3d
            r1 = r0
            androidx.recyclerview.widget.GridLayoutManager r1 = (androidx.recyclerview.widget.GridLayoutManager) r1
        L3d:
            if (r1 != 0) goto L40
            goto L43
        L40:
            r1.l3(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment.setGridSpanCount(int):void");
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment
    protected LinearLayoutManager getLayoutManager(Context context) {
        return new GridLayoutManager(context, 4);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new RewardsRecyclerviewFragment$onCreateView$1(this, null), 1, null);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getInventoryRepository().close();
        super.onDestroy();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        SwipeRefreshLayout swipeRefreshLayout;
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null) {
            swipeRefreshLayout = binding.refreshLayout;
        } else {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new RewardsRecyclerviewFragment$onRefresh$1(this, null), 2, null);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        GridLayoutManager gridLayoutManager;
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RewardsRecyclerViewAdapter rewardsRecyclerViewAdapter;
        FragmentRefreshRecyclerviewBinding binding;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView.p layoutManager$Habitica_2311256681_prodRelease = getLayoutManager$Habitica_2311256681_prodRelease();
        RewardsRecyclerViewAdapter rewardsRecyclerViewAdapter2 = null;
        if (layoutManager$Habitica_2311256681_prodRelease instanceof GridLayoutManager) {
            gridLayoutManager = (GridLayoutManager) layoutManager$Habitica_2311256681_prodRelease;
        } else {
            gridLayoutManager = null;
        }
        if (gridLayoutManager != null) {
            gridLayoutManager.m3(new GridLayoutManager.c() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment$onViewCreated$1
                @Override // androidx.recyclerview.widget.GridLayoutManager.c
                public int getSpanSize(int i10) {
                    int i11;
                    GridLayoutManager gridLayoutManager2;
                    TaskRecyclerViewAdapter recyclerAdapter = RewardsRecyclerviewFragment.this.getRecyclerAdapter();
                    if (recyclerAdapter != null) {
                        i11 = recyclerAdapter.getItemViewType(i10);
                    } else {
                        i11 = 0;
                    }
                    if (i11 >= 3) {
                        return 1;
                    }
                    RecyclerView.p layoutManager$Habitica_2311256681_prodRelease2 = RewardsRecyclerviewFragment.this.getLayoutManager$Habitica_2311256681_prodRelease();
                    if (layoutManager$Habitica_2311256681_prodRelease2 instanceof GridLayoutManager) {
                        gridLayoutManager2 = (GridLayoutManager) layoutManager$Habitica_2311256681_prodRelease2;
                    } else {
                        gridLayoutManager2 = null;
                    }
                    if (gridLayoutManager2 == null) {
                        return 1;
                    }
                    return gridLayoutManager2.e3();
                }
            });
        }
        view.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.a
            @Override // java.lang.Runnable
            public final void run() {
                RewardsRecyclerviewFragment.onViewCreated$lambda$0(RewardsRecyclerviewFragment.this, view);
            }
        });
        Context context = getContext();
        if (context != null && (binding = getBinding()) != null && (recyclerViewEmptySupport2 = binding.recyclerView) != null) {
            recyclerViewEmptySupport2.setBackgroundColor(androidx.core.content.a.c(context, R.color.content_background));
        }
        FragmentRefreshRecyclerviewBinding binding2 = getBinding();
        if (binding2 != null) {
            recyclerViewEmptySupport = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setItemAnimator(new SafeDefaultItemAnimator());
        }
        if (this.showCustomRewards) {
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new RewardsRecyclerviewFragment$onViewCreated$4(this, null), 1, null);
        }
        TaskRecyclerViewAdapter recyclerAdapter = getRecyclerAdapter();
        if (recyclerAdapter instanceof RewardsRecyclerViewAdapter) {
            rewardsRecyclerViewAdapter = (RewardsRecyclerViewAdapter) recyclerAdapter;
        } else {
            rewardsRecyclerViewAdapter = null;
        }
        if (rewardsRecyclerViewAdapter != null) {
            rewardsRecyclerViewAdapter.setPurchaseCardEvents(new RewardsRecyclerviewFragment$onViewCreated$5(this));
        }
        TaskRecyclerViewAdapter recyclerAdapter2 = getRecyclerAdapter();
        if (recyclerAdapter2 instanceof RewardsRecyclerViewAdapter) {
            rewardsRecyclerViewAdapter2 = (RewardsRecyclerViewAdapter) recyclerAdapter2;
        }
        if (rewardsRecyclerViewAdapter2 != null) {
            rewardsRecyclerViewAdapter2.setOnShowPurchaseDialog(new RewardsRecyclerviewFragment$onViewCreated$6(this));
        }
        TaskRecyclerViewAdapter recyclerAdapter3 = getRecyclerAdapter();
        if (recyclerAdapter3 != null) {
            recyclerAdapter3.setBrokenTaskEvents(new RewardsRecyclerviewFragment$onViewCreated$7(this));
        }
        getViewModel().getUser().j(getViewLifecycleOwner(), new RewardsRecyclerviewFragment$sam$androidx_lifecycle_Observer$0(new RewardsRecyclerviewFragment$onViewCreated$8(this)));
    }
}
