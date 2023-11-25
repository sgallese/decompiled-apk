package com.habitrpg.android.habitica.ui.fragments;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.adapter.AchievementsAdapter;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;

/* compiled from: AchievementsFragment.kt */
/* loaded from: classes4.dex */
public final class AchievementsFragment extends Hilt_AchievementsFragment<FragmentRefreshRecyclerviewBinding> implements SwipeRefreshLayout.j {
    public static final int $stable = 8;
    private AchievementsAdapter adapter;
    private FragmentRefreshRecyclerviewBinding binding;
    public InventoryRepository inventoryRepository;
    private int menuID;
    private boolean useGridLayout;
    public MainUserViewModel userViewModel;

    private final void setUseGridLayout(boolean z10) {
        this.useGridLayout = z10;
        AchievementsAdapter achievementsAdapter = this.adapter;
        AchievementsAdapter achievementsAdapter2 = null;
        if (achievementsAdapter == null) {
            qc.q.z("adapter");
            achievementsAdapter = null;
        }
        achievementsAdapter.setUseGridLayout(z10);
        AchievementsAdapter achievementsAdapter3 = this.adapter;
        if (achievementsAdapter3 == null) {
            qc.q.z("adapter");
        } else {
            achievementsAdapter2 = achievementsAdapter3;
        }
        achievementsAdapter2.notifyDataSetChanged();
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        qc.q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        qc.q.i(menu, "menu");
        qc.q.i(menuInflater, "inflater");
        int i10 = 0;
        if (this.useGridLayout) {
            MenuItem add = menu.add(R.string.switch_to_list_view);
            if (add != null) {
                i10 = add.getItemId();
            }
            this.menuID = i10;
            if (add != null) {
                add.setShowAsAction(2);
            }
            if (add != null) {
                add.setIcon(R.drawable.ic_round_view_list_24px);
            }
            tintMenuIcon(add);
        } else {
            MenuItem add2 = menu.add(R.string.switch_to_grid_view);
            if (add2 != null) {
                i10 = add2.getItemId();
            }
            this.menuID = i10;
            if (add2 != null) {
                add2.setShowAsAction(2);
            }
            if (add2 != null) {
                add2.setIcon(R.drawable.ic_round_view_module_24px);
            }
            tintMenuIcon(add2);
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        this.adapter = new AchievementsAdapter();
        onRefresh();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        if (menuItem.getItemId() == this.menuID) {
            setUseGridLayout(!this.useGridLayout);
            MainActivity mainActivity = getMainActivity();
            if (mainActivity != null) {
                mainActivity.invalidateOptionsMenu();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new AchievementsFragment$onRefresh$1(this, null), 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        qc.q.i(bundle, "outState");
        bundle.putBoolean("useGridLayout", this.useGridLayout);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        SwipeRefreshLayout swipeRefreshLayout;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMainActivity(), 2);
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null) {
            recyclerViewEmptySupport = binding.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setLayoutManager(gridLayoutManager);
        }
        FragmentRefreshRecyclerviewBinding binding2 = getBinding();
        if (binding2 != null) {
            recyclerViewEmptySupport2 = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport2 = null;
        }
        if (recyclerViewEmptySupport2 != null) {
            AchievementsAdapter achievementsAdapter = this.adapter;
            if (achievementsAdapter == null) {
                qc.q.z("adapter");
                achievementsAdapter = null;
            }
            recyclerViewEmptySupport2.setAdapter(achievementsAdapter);
        }
        AchievementsAdapter achievementsAdapter2 = this.adapter;
        if (achievementsAdapter2 == null) {
            qc.q.z("adapter");
            achievementsAdapter2 = null;
        }
        achievementsAdapter2.setUseGridLayout(this.useGridLayout);
        Context context = getContext();
        if (context != null) {
            FragmentRefreshRecyclerviewBinding binding3 = getBinding();
            if (binding3 != null) {
                recyclerViewEmptySupport3 = binding3.recyclerView;
            } else {
                recyclerViewEmptySupport3 = null;
            }
            if (recyclerViewEmptySupport3 != null) {
                recyclerViewEmptySupport3.setBackground(new ColorDrawable(androidx.core.content.a.c(context, R.color.content_background)));
            }
        }
        gridLayoutManager.m3(new GridLayoutManager.c() { // from class: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$2
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int getSpanSize(int i10) {
                AchievementsAdapter achievementsAdapter3;
                achievementsAdapter3 = AchievementsFragment.this.adapter;
                if (achievementsAdapter3 == null) {
                    qc.q.z("adapter");
                    achievementsAdapter3 = null;
                }
                if (achievementsAdapter3.getItemViewType(i10) == 1) {
                    return 1;
                }
                return 2;
            }
        });
        FragmentRefreshRecyclerviewBinding binding4 = getBinding();
        if (binding4 != null && (swipeRefreshLayout = binding4.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AchievementsFragment$onViewCreated$3(this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        boolean z10;
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            z10 = bundle.getBoolean("useGridLayout");
        } else {
            z10 = false;
        }
        setUseGridLayout(z10);
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRefreshRecyclerviewBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentRefreshRecyclerviewBinding inflate = FragmentRefreshRecyclerviewBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRefreshRecyclerviewBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentRefreshRecyclerviewBinding fragmentRefreshRecyclerviewBinding) {
        this.binding = fragmentRefreshRecyclerviewBinding;
    }
}
