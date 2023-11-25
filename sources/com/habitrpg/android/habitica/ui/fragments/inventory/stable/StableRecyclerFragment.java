package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p0;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.ui.adapter.inventory.StableRecyclerAdapter;
import com.habitrpg.android.habitica.ui.helpers.MarginDecoration;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.StableViewModel;
import com.habitrpg.common.habitica.helpers.EmptyItem;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import dc.j;
import ec.t0;
import java.util.Set;
import qc.g0;
import qc.q;

/* compiled from: StableRecyclerFragment.kt */
/* loaded from: classes4.dex */
public final class StableRecyclerFragment extends Hilt_StableRecyclerFragment<FragmentRefreshRecyclerviewBinding> implements SwipeRefreshLayout.j {
    private static final int HEADER_VIEW_TYPE = 0;
    public static final String ITEM_TYPE_KEY = "CLASS_TYPE_KEY";
    private StableRecyclerAdapter adapter;
    private FragmentRefreshRecyclerviewBinding binding;
    public AppConfigManager configManager;
    public InventoryRepository inventoryRepository;
    private String itemTypeText;
    private GridLayoutManager layoutManager;
    public UserRepository userRepository;
    public MainUserViewModel userViewModel;
    private final dc.f viewModel$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: StableRecyclerFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    public StableRecyclerFragment() {
        dc.f a10;
        a10 = dc.h.a(j.NONE, new StableRecyclerFragment$special$$inlined$viewModels$default$2(new StableRecyclerFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = p0.b(this, g0.b(StableViewModel.class), new StableRecyclerFragment$special$$inlined$viewModels$default$3(a10), new StableRecyclerFragment$special$$inlined$viewModels$default$4(null, a10), new StableRecyclerFragment$special$$inlined$viewModels$default$5(this, a10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StableViewModel getViewModel() {
        return (StableViewModel) this.viewModel$delegate.getValue();
    }

    private final void loadItems() {
        getViewModel().getItems().j(getViewLifecycleOwner(), new StableRecyclerFragment$sam$androidx_lifecycle_Observer$0(new StableRecyclerFragment$loadItems$1(this)));
        getViewModel().getEggs().j(getViewLifecycleOwner(), new StableRecyclerFragment$sam$androidx_lifecycle_Observer$0(new StableRecyclerFragment$loadItems$2(this)));
        getViewModel().getOwnedItems().j(getViewLifecycleOwner(), new StableRecyclerFragment$sam$androidx_lifecycle_Observer$0(new StableRecyclerFragment$loadItems$3(this)));
        getViewModel().getMounts().j(getViewLifecycleOwner(), new StableRecyclerFragment$sam$androidx_lifecycle_Observer$0(new StableRecyclerFragment$loadItems$4(this)));
        getViewModel().getOwnedPets().j(getViewLifecycleOwner(), new StableRecyclerFragment$sam$androidx_lifecycle_Observer$0(new StableRecyclerFragment$loadItems$5(this)));
        getViewModel().getOwnedMounts().j(getViewLifecycleOwner(), new StableRecyclerFragment$sam$androidx_lifecycle_Observer$0(new StableRecyclerFragment$loadItems$6(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(StableRecyclerFragment stableRecyclerFragment, View view) {
        q.i(stableRecyclerFragment, "this$0");
        q.i(view, "$view");
        stableRecyclerFragment.setGridSpanCount(view.getWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setGridSpanCount(int r3) {
        /*
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L41
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r0.getResources()
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L41
            com.habitrpg.android.habitica.ui.viewmodels.StableViewModel r0 = r2.getViewModel()
            java.lang.String r0 = r0.getItemType$Habitica_2311256681_prodRelease()
            java.lang.String r1 = "pets"
            boolean r0 = qc.q.d(r0, r1)
            if (r0 == 0) goto L28
            r0 = 2131166035(0x7f070353, float:1.7946304E38)
            goto L2b
        L28:
            r0 = 2131165816(0x7f070278, float:1.794586E38)
        L2b:
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L3c
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L3c
            float r0 = r1.getDimension(r0)
            goto L3d
        L3c:
            r0 = 0
        L3d:
            float r3 = (float) r3
            float r3 = r3 / r0
            int r3 = (int) r3
            goto L42
        L41:
            r3 = 0
        L42:
            if (r3 != 0) goto L45
            r3 = 1
        L45:
            androidx.recyclerview.widget.GridLayoutManager r0 = r2.layoutManager
            if (r0 != 0) goto L4a
            goto L4d
        L4a:
            r0.l3(r3)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableRecyclerFragment.setGridSpanCount(int):void");
    }

    public final StableRecyclerAdapter getAdapter() {
        return this.adapter;
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        q.z("configManager");
        return null;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        q.z("inventoryRepository");
        return null;
    }

    public final String getItemTypeText() {
        return this.itemTypeText;
    }

    public final GridLayoutManager getLayoutManager$Habitica_2311256681_prodRelease() {
        return this.layoutManager;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        q.z("userRepository");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getInventoryRepository().close();
        super.onDestroy();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new StableRecyclerFragment$onRefresh$1(this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        q.i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString(ITEM_TYPE_KEY, getViewModel().getItemType$Habitica_2311256681_prodRelease());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        RecyclerView.h hVar;
        StableRecyclerAdapter stableRecyclerAdapter;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        RecyclerViewEmptySupport recyclerViewEmptySupport4;
        FragmentRefreshRecyclerviewBinding binding;
        RecyclerViewEmptySupport recyclerViewEmptySupport5;
        Set a10;
        SwipeRefreshLayout swipeRefreshLayout;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentRefreshRecyclerviewBinding binding2 = getBinding();
        RecyclerViewEmptySupport recyclerViewEmptySupport6 = null;
        if (binding2 != null) {
            recyclerViewEmptySupport = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            Object[] objArr = new Object[1];
            String str = this.itemTypeText;
            if (str == null) {
                str = getViewModel().getItemType$Habitica_2311256681_prodRelease();
            }
            objArr[0] = str;
            String string = getString(R.string.empty_items, objArr);
            q.h(string, "getString(...)");
            recyclerViewEmptySupport.setEmptyItem(new EmptyItem(string, null, null, false, null, 30, null));
        }
        FragmentRefreshRecyclerviewBinding binding3 = getBinding();
        if (binding3 != null && (swipeRefreshLayout = binding3.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 4);
        this.layoutManager = gridLayoutManager;
        gridLayoutManager.m3(new GridLayoutManager.c() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableRecyclerFragment$onViewCreated$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int getSpanSize(int i10) {
                boolean z10;
                StableRecyclerAdapter adapter = StableRecyclerFragment.this.getAdapter();
                boolean z11 = false;
                if (adapter != null && adapter.getItemViewType(i10) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    StableRecyclerAdapter adapter2 = StableRecyclerFragment.this.getAdapter();
                    if (adapter2 != null && adapter2.getItemViewType(i10) == 1) {
                        z11 = true;
                    }
                    if (!z11) {
                        return 1;
                    }
                }
                GridLayoutManager layoutManager$Habitica_2311256681_prodRelease = StableRecyclerFragment.this.getLayoutManager$Habitica_2311256681_prodRelease();
                if (layoutManager$Habitica_2311256681_prodRelease == null) {
                    return 1;
                }
                return layoutManager$Habitica_2311256681_prodRelease.e3();
            }
        });
        FragmentRefreshRecyclerviewBinding binding4 = getBinding();
        if (binding4 != null) {
            recyclerViewEmptySupport2 = binding4.recyclerView;
        } else {
            recyclerViewEmptySupport2 = null;
        }
        if (recyclerViewEmptySupport2 != null) {
            recyclerViewEmptySupport2.setLayoutManager(this.layoutManager);
        }
        androidx.fragment.app.q activity = getActivity();
        if (activity != null && (binding = getBinding()) != null && (recyclerViewEmptySupport5 = binding.recyclerView) != null) {
            a10 = t0.a(0);
            recyclerViewEmptySupport5.addItemDecoration(new MarginDecoration(activity, a10));
        }
        FragmentRefreshRecyclerviewBinding binding5 = getBinding();
        if (binding5 != null && (recyclerViewEmptySupport4 = binding5.recyclerView) != null) {
            hVar = recyclerViewEmptySupport4.getAdapter();
        } else {
            hVar = null;
        }
        if (hVar instanceof StableRecyclerAdapter) {
            stableRecyclerAdapter = (StableRecyclerAdapter) hVar;
        } else {
            stableRecyclerAdapter = null;
        }
        this.adapter = stableRecyclerAdapter;
        if (stableRecyclerAdapter == null) {
            StableRecyclerAdapter stableRecyclerAdapter2 = new StableRecyclerAdapter();
            this.adapter = stableRecyclerAdapter2;
            stableRecyclerAdapter2.setAnimalIngredientsRetriever(new StableRecyclerFragment$onViewCreated$3(this));
            StableRecyclerAdapter stableRecyclerAdapter3 = this.adapter;
            if (stableRecyclerAdapter3 != null) {
                stableRecyclerAdapter3.setItemType(getViewModel().getItemType$Habitica_2311256681_prodRelease());
            }
            StableRecyclerAdapter stableRecyclerAdapter4 = this.adapter;
            if (stableRecyclerAdapter4 != null) {
                stableRecyclerAdapter4.setShopSpriteSuffix(getConfigManager().shopSpriteSuffix());
            }
            FragmentRefreshRecyclerviewBinding binding6 = getBinding();
            if (binding6 != null) {
                recyclerViewEmptySupport3 = binding6.recyclerView;
            } else {
                recyclerViewEmptySupport3 = null;
            }
            if (recyclerViewEmptySupport3 != null) {
                recyclerViewEmptySupport3.setAdapter(this.adapter);
            }
            FragmentRefreshRecyclerviewBinding binding7 = getBinding();
            if (binding7 != null) {
                recyclerViewEmptySupport6 = binding7.recyclerView;
            }
            if (recyclerViewEmptySupport6 != null) {
                recyclerViewEmptySupport6.setItemAnimator(new SafeDefaultItemAnimator());
            }
            StableRecyclerAdapter stableRecyclerAdapter5 = this.adapter;
            if (stableRecyclerAdapter5 != null) {
                stableRecyclerAdapter5.setOnEquip(new StableRecyclerFragment$onViewCreated$4$1(this));
            }
        }
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new StableRecyclerFragment$sam$androidx_lifecycle_Observer$0(new StableRecyclerFragment$onViewCreated$5(this)));
        loadItems();
        view.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.stable.i
            @Override // java.lang.Runnable
            public final void run() {
                StableRecyclerFragment.onViewCreated$lambda$2(StableRecyclerFragment.this, view);
            }
        });
    }

    public final void setAdapter(StableRecyclerAdapter stableRecyclerAdapter) {
        this.adapter = stableRecyclerAdapter;
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setItemTypeText(String str) {
        this.itemTypeText = str;
    }

    public final void setLayoutManager$Habitica_2311256681_prodRelease(GridLayoutManager gridLayoutManager) {
        this.layoutManager = gridLayoutManager;
    }

    public final void setUserRepository(UserRepository userRepository) {
        q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRefreshRecyclerviewBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentRefreshRecyclerviewBinding inflate = FragmentRefreshRecyclerviewBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
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
