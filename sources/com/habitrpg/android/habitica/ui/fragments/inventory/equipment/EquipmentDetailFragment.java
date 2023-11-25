package com.habitrpg.android.habitica.ui.fragments.inventory.equipment;

import ad.i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.j;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.ui.adapter.inventory.EquipmentRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.EmptyItem;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import qc.q;

/* compiled from: EquipmentDetailFragment.kt */
/* loaded from: classes4.dex */
public final class EquipmentDetailFragment extends Hilt_EquipmentDetailFragment<FragmentRefreshRecyclerviewBinding> implements SwipeRefreshLayout.j {
    public static final int $stable = 8;
    private EquipmentRecyclerViewAdapter adapter = new EquipmentRecyclerViewAdapter();
    private FragmentRefreshRecyclerviewBinding binding;
    private String equippedGear;
    public InventoryRepository inventoryRepository;
    private Boolean isCostume;
    public ReviewManager reviewManager;
    private String type;
    public MainUserViewModel userViewModel;

    public final String getEquippedGear() {
        return this.equippedGear;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        q.z("inventoryRepository");
        return null;
    }

    public final ReviewManager getReviewManager() {
        ReviewManager reviewManager = this.reviewManager;
        if (reviewManager != null) {
            return reviewManager;
        }
        q.z("reviewManager");
        return null;
    }

    public final String getType() {
        return this.type;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    public final Boolean isCostume() {
        return this.isCostume;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        this.adapter.setOnEquip(new EquipmentDetailFragment$onCreateView$1(this));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getInventoryRepository().close();
        super.onDestroy();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new EquipmentDetailFragment$onRefresh$1(this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        RecyclerViewEmptySupport recyclerViewEmptySupport4;
        RecyclerViewEmptySupport recyclerViewEmptySupport5;
        RecyclerViewEmptySupport recyclerViewEmptySupport6;
        SwipeRefreshLayout swipeRefreshLayout;
        q.i(view, "view");
        setShowsBackButton(true);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            EquipmentDetailFragmentArgs fromBundle = EquipmentDetailFragmentArgs.fromBundle(arguments);
            q.h(fromBundle, "fromBundle(...)");
            this.type = fromBundle.getType();
            this.isCostume = Boolean.valueOf(fromBundle.getIsCostume());
            this.equippedGear = fromBundle.getEquippedGear();
        }
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null && (swipeRefreshLayout = binding.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        FragmentRefreshRecyclerviewBinding binding2 = getBinding();
        if (binding2 != null) {
            recyclerViewEmptySupport = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setOnRefresh(new EquipmentDetailFragment$onViewCreated$2(this));
        }
        FragmentRefreshRecyclerviewBinding binding3 = getBinding();
        if (binding3 != null) {
            recyclerViewEmptySupport2 = binding3.recyclerView;
        } else {
            recyclerViewEmptySupport2 = null;
        }
        if (recyclerViewEmptySupport2 != null) {
            String string = getString(R.string.empty_title);
            q.h(string, "getString(...)");
            recyclerViewEmptySupport2.setEmptyItem(new EmptyItem(string, getString(R.string.empty_equipment_description), null, false, EquipmentDetailFragment$onViewCreated$3.INSTANCE, 8, null));
        }
        this.adapter.setEquippedGear(this.equippedGear);
        this.adapter.setCostume(this.isCostume);
        this.adapter.setType(this.type);
        FragmentRefreshRecyclerviewBinding binding4 = getBinding();
        if (binding4 != null) {
            recyclerViewEmptySupport3 = binding4.recyclerView;
        } else {
            recyclerViewEmptySupport3 = null;
        }
        if (recyclerViewEmptySupport3 != null) {
            recyclerViewEmptySupport3.setAdapter(this.adapter);
        }
        FragmentRefreshRecyclerviewBinding binding5 = getBinding();
        if (binding5 != null) {
            recyclerViewEmptySupport4 = binding5.recyclerView;
        } else {
            recyclerViewEmptySupport4 = null;
        }
        if (recyclerViewEmptySupport4 != null) {
            recyclerViewEmptySupport4.setLayoutManager(new LinearLayoutManager(getMainActivity()));
        }
        FragmentRefreshRecyclerviewBinding binding6 = getBinding();
        if (binding6 != null && (recyclerViewEmptySupport6 = binding6.recyclerView) != null) {
            recyclerViewEmptySupport6.addItemDecoration(new j(getActivity(), 1));
        }
        FragmentRefreshRecyclerviewBinding binding7 = getBinding();
        if (binding7 != null) {
            recyclerViewEmptySupport5 = binding7.recyclerView;
        } else {
            recyclerViewEmptySupport5 = null;
        }
        if (recyclerViewEmptySupport5 != null) {
            recyclerViewEmptySupport5.setItemAnimator(new SafeDefaultItemAnimator());
        }
        String str = this.type;
        if (str != null) {
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new EquipmentDetailFragment$onViewCreated$4$1(this, str, null), 1, null);
        }
    }

    public final void setCostume(Boolean bool) {
        this.isCostume = bool;
    }

    public final void setEquippedGear(String str) {
        this.equippedGear = str;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setReviewManager(ReviewManager reviewManager) {
        q.i(reviewManager, "<set-?>");
        this.reviewManager = reviewManager;
    }

    public final void setType(String str) {
        this.type = str;
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
