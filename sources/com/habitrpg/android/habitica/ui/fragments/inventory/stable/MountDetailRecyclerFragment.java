package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.ui.adapter.inventory.MountDetailRecyclerAdapter;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import qc.q;

/* compiled from: MountDetailRecyclerFragment.kt */
/* loaded from: classes4.dex */
public final class MountDetailRecyclerFragment extends Hilt_MountDetailRecyclerFragment<FragmentRefreshRecyclerviewBinding> implements SwipeRefreshLayout.j {
    private static final String ANIMAL_TYPE_KEY = "ANIMAL_TYPE_KEY";
    private MountDetailRecyclerAdapter adapter;
    private String animalColor;
    private String animalGroup;
    private String animalType;
    private FragmentRefreshRecyclerviewBinding binding;
    public InventoryRepository inventoryRepository;
    private GridLayoutManager layoutManager;
    public MainUserViewModel userViewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MountDetailRecyclerFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    private final void loadItems() {
        if (this.animalType != null || this.animalGroup != null) {
            ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new MountDetailRecyclerFragment$loadItems$1(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(MountDetailRecyclerFragment mountDetailRecyclerFragment, View view) {
        q.i(mountDetailRecyclerFragment, "this$0");
        q.i(view, "$view");
        mountDetailRecyclerFragment.setGridSpanCount(view.getWidth());
    }

    private final void setGridSpanCount(int i10) {
        int i11;
        Context context = getContext();
        if (context != null && context.getResources() != null) {
            getResources();
            i11 = (int) (i10 / getResources().getDimension(R.dimen.mount_width));
        } else {
            i11 = 0;
        }
        if (i11 == 0) {
            i11 = 1;
        }
        GridLayoutManager gridLayoutManager = this.layoutManager;
        if (gridLayoutManager != null) {
            gridLayoutManager.l3(i11);
        }
        GridLayoutManager gridLayoutManager2 = this.layoutManager;
        if (gridLayoutManager2 != null) {
            gridLayoutManager2.D1();
        }
    }

    public final MountDetailRecyclerAdapter getAdapter() {
        return this.adapter;
    }

    public final String getAnimalColor() {
        return this.animalColor;
    }

    public final String getAnimalGroup() {
        return this.animalGroup;
    }

    public final String getAnimalType() {
        return this.animalType;
    }

    public final InventoryRepository getInventoryRepository$Habitica_2311256681_prodRelease() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        q.z("inventoryRepository");
        return null;
    }

    public final GridLayoutManager getLayoutManager$Habitica_2311256681_prodRelease() {
        return this.layoutManager;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setUsesTabLayout(false);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getInventoryRepository$Habitica_2311256681_prodRelease().close();
        super.onDestroy();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new MountDetailRecyclerFragment$onRefresh$1(this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        q.i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString(ANIMAL_TYPE_KEY, this.animalType);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerView.h hVar;
        MountDetailRecyclerAdapter mountDetailRecyclerAdapter;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        SwipeRefreshLayout swipeRefreshLayout;
        q.i(view, "view");
        setShowsBackButton(true);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            MountDetailRecyclerFragmentArgs fromBundle = MountDetailRecyclerFragmentArgs.fromBundle(arguments);
            q.h(fromBundle, "fromBundle(...)");
            if (!q.d(fromBundle.getGroup(), "drop")) {
                this.animalGroup = fromBundle.getGroup();
            }
            this.animalType = fromBundle.getType();
            this.animalColor = fromBundle.getColor();
        }
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null && (swipeRefreshLayout = binding.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMainActivity(), 4);
        this.layoutManager = gridLayoutManager;
        gridLayoutManager.m3(new GridLayoutManager.c() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.stable.MountDetailRecyclerFragment$onViewCreated$2
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int getSpanSize(int i10) {
                boolean z10;
                MountDetailRecyclerAdapter adapter = MountDetailRecyclerFragment.this.getAdapter();
                boolean z11 = false;
                if (adapter != null && adapter.getItemViewType(i10) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    MountDetailRecyclerAdapter adapter2 = MountDetailRecyclerFragment.this.getAdapter();
                    if (adapter2 != null && adapter2.getItemViewType(i10) == 1) {
                        z11 = true;
                    }
                    if (!z11) {
                        return 1;
                    }
                }
                GridLayoutManager layoutManager$Habitica_2311256681_prodRelease = MountDetailRecyclerFragment.this.getLayoutManager$Habitica_2311256681_prodRelease();
                if (layoutManager$Habitica_2311256681_prodRelease == null) {
                    return 1;
                }
                return layoutManager$Habitica_2311256681_prodRelease.e3();
            }
        });
        FragmentRefreshRecyclerviewBinding binding2 = getBinding();
        RecyclerViewEmptySupport recyclerViewEmptySupport4 = null;
        if (binding2 != null) {
            recyclerViewEmptySupport = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setLayoutManager(this.layoutManager);
        }
        FragmentRefreshRecyclerviewBinding binding3 = getBinding();
        if (binding3 != null && (recyclerViewEmptySupport3 = binding3.recyclerView) != null) {
            hVar = recyclerViewEmptySupport3.getAdapter();
        } else {
            hVar = null;
        }
        if (hVar instanceof MountDetailRecyclerAdapter) {
            mountDetailRecyclerAdapter = (MountDetailRecyclerAdapter) hVar;
        } else {
            mountDetailRecyclerAdapter = null;
        }
        this.adapter = mountDetailRecyclerAdapter;
        if (mountDetailRecyclerAdapter == null) {
            this.adapter = new MountDetailRecyclerAdapter();
            FragmentRefreshRecyclerviewBinding binding4 = getBinding();
            if (binding4 != null) {
                recyclerViewEmptySupport2 = binding4.recyclerView;
            } else {
                recyclerViewEmptySupport2 = null;
            }
            if (recyclerViewEmptySupport2 != null) {
                recyclerViewEmptySupport2.setAdapter(this.adapter);
            }
            FragmentRefreshRecyclerviewBinding binding5 = getBinding();
            if (binding5 != null) {
                recyclerViewEmptySupport4 = binding5.recyclerView;
            }
            if (recyclerViewEmptySupport4 != null) {
                recyclerViewEmptySupport4.setItemAnimator(new SafeDefaultItemAnimator());
            }
            loadItems();
            MountDetailRecyclerAdapter mountDetailRecyclerAdapter2 = this.adapter;
            if (mountDetailRecyclerAdapter2 != null) {
                mountDetailRecyclerAdapter2.setOnEquip(new MountDetailRecyclerFragment$onViewCreated$3(this));
            }
        }
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new MountDetailRecyclerFragment$sam$androidx_lifecycle_Observer$0(new MountDetailRecyclerFragment$onViewCreated$4(this)));
        if (bundle != null) {
            this.animalType = bundle.getString(ANIMAL_TYPE_KEY, "");
        }
        view.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.stable.a
            @Override // java.lang.Runnable
            public final void run() {
                MountDetailRecyclerFragment.onViewCreated$lambda$1(MountDetailRecyclerFragment.this, view);
            }
        });
    }

    public final void setAdapter(MountDetailRecyclerAdapter mountDetailRecyclerAdapter) {
        this.adapter = mountDetailRecyclerAdapter;
    }

    public final void setAnimalColor(String str) {
        this.animalColor = str;
    }

    public final void setAnimalGroup(String str) {
        this.animalGroup = str;
    }

    public final void setAnimalType(String str) {
        this.animalType = str;
    }

    public final void setInventoryRepository$Habitica_2311256681_prodRelease(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setLayoutManager$Habitica_2311256681_prodRelease(GridLayoutManager gridLayoutManager) {
        this.layoutManager = gridLayoutManager;
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
