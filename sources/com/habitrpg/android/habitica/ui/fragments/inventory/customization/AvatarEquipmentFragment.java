package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.CustomizationEquipmentRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.helpers.MarginDecoration;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import qc.q;

/* compiled from: AvatarEquipmentFragment.kt */
/* loaded from: classes4.dex */
public final class AvatarEquipmentFragment extends Hilt_AvatarEquipmentFragment<FragmentRefreshRecyclerviewBinding> implements SwipeRefreshLayout.j {
    public static final int $stable = 8;
    private String activeEquipment;
    private FragmentRefreshRecyclerviewBinding binding;
    private String category;
    public InventoryRepository inventoryRepository;
    private String type;
    public MainUserViewModel userViewModel;
    private CustomizationEquipmentRecyclerViewAdapter adapter = new CustomizationEquipmentRecyclerViewAdapter();
    private GridLayoutManager layoutManager = new GridLayoutManager(getMainActivity(), 2);

    private final void loadEquipment() {
        String str = this.type;
        if (str == null) {
            return;
        }
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new AvatarEquipmentFragment$loadEquipment$1(this, str, null), 1, null);
    }

    private final void setGridSpanCount(int i10) {
        float f10;
        Resources resources;
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            f10 = resources.getDimension(R.dimen.customization_width);
        } else {
            f10 = 0.0f;
        }
        int i11 = (int) (i10 / f10);
        if (i11 == 0) {
            i11 = 1;
        }
        this.layoutManager.l3(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateActiveCustomization(com.habitrpg.android.habitica.models.user.User r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.type
            if (r0 == 0) goto L94
            r0 = 0
            if (r5 == 0) goto Lc
            com.habitrpg.android.habitica.models.user.Preferences r1 = r5.getPreferences()
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 != 0) goto L11
            goto L94
        L11:
            com.habitrpg.android.habitica.models.user.Preferences r1 = r5.getPreferences()
            r2 = 0
            if (r1 == 0) goto L20
            boolean r1 = r1.getCostume()
            r3 = 1
            if (r1 != r3) goto L20
            r2 = 1
        L20:
            com.habitrpg.android.habitica.models.user.Items r5 = r5.getItems()
            if (r2 == 0) goto L33
            if (r5 == 0) goto L40
            com.habitrpg.android.habitica.models.user.Gear r5 = r5.getGear()
            if (r5 == 0) goto L40
            com.habitrpg.android.habitica.models.user.Outfit r5 = r5.getCostume()
            goto L41
        L33:
            if (r5 == 0) goto L40
            com.habitrpg.android.habitica.models.user.Gear r5 = r5.getGear()
            if (r5 == 0) goto L40
            com.habitrpg.android.habitica.models.user.Outfit r5 = r5.getEquipped()
            goto L41
        L40:
            r5 = r0
        L41:
            java.lang.String r1 = r4.type
            if (r1 == 0) goto L89
            int r2 = r1.hashCode()
            r3 = -1290360528(0xffffffffb316a930, float:-3.507847E-8)
            if (r2 == r3) goto L79
            r3 = -1089848046(0xffffffffbf0a3d12, float:-0.53999436)
            if (r2 == r3) goto L69
            r3 = 3015911(0x2e04e7, float:4.226191E-39)
            if (r2 == r3) goto L59
            goto L89
        L59:
            java.lang.String r2 = "back"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L62
            goto L89
        L62:
            if (r5 == 0) goto L8b
            java.lang.String r0 = r5.getBack()
            goto L8b
        L69:
            java.lang.String r2 = "headAccessory"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L72
            goto L89
        L72:
            if (r5 == 0) goto L8b
            java.lang.String r0 = r5.getHeadAccessory()
            goto L8b
        L79:
            java.lang.String r2 = "eyewear"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L82
            goto L89
        L82:
            if (r5 == 0) goto L8b
            java.lang.String r0 = r5.getEyeWear()
            goto L8b
        L89:
            java.lang.String r0 = ""
        L8b:
            if (r0 == 0) goto L94
            r4.activeEquipment = r0
            com.habitrpg.android.habitica.ui.adapter.CustomizationEquipmentRecyclerViewAdapter r5 = r4.adapter
            r5.setActiveEquipment(r0)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarEquipmentFragment.updateActiveCustomization(com.habitrpg.android.habitica.models.user.User):void");
    }

    public final CustomizationEquipmentRecyclerViewAdapter getAdapter$Habitica_2311256681_prodRelease() {
        return this.adapter;
    }

    public final String getCategory() {
        return this.category;
    }

    public final InventoryRepository getInventoryRepository() {
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

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setShowsBackButton(true);
        this.adapter.setOnSelect(new AvatarEquipmentFragment$onCreateView$1(this));
        this.adapter.setOnUnlock(new AvatarEquipmentFragment$onCreateView$2(this));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AvatarEquipmentFragment$onRefresh$1(this, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [qc.h, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.RecyclerView] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        SwipeRefreshLayout swipeRefreshLayout;
        q.i(view, "view");
        boolean z10 = true;
        setShowsBackButton(true);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            AvatarEquipmentFragmentArgs fromBundle = AvatarEquipmentFragmentArgs.fromBundle(arguments);
            q.h(fromBundle, "fromBundle(...)");
            this.type = fromBundle.getType();
            String category = fromBundle.getCategory();
            q.h(category, "getCategory(...)");
            if (category.length() <= 0) {
                z10 = false;
            }
            if (z10) {
                this.category = fromBundle.getCategory();
            }
        }
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null && (swipeRefreshLayout = binding.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        setGridSpanCount(view.getWidth());
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(getMainActivity(), 4);
        gridLayoutManager.m3(new GridLayoutManager.c() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarEquipmentFragment$onViewCreated$2
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int getSpanSize(int i10) {
                if (AvatarEquipmentFragment.this.getAdapter$Habitica_2311256681_prodRelease().getItemViewType(i10) == 0) {
                    return gridLayoutManager.e3();
                }
                return 1;
            }
        });
        FragmentRefreshRecyclerviewBinding binding2 = getBinding();
        ?? r02 = 0;
        if (binding2 != null) {
            recyclerViewEmptySupport = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setLayoutManager(gridLayoutManager);
        }
        FragmentRefreshRecyclerviewBinding binding3 = getBinding();
        if (binding3 != null && (recyclerViewEmptySupport3 = binding3.recyclerView) != null) {
            recyclerViewEmptySupport3.addItemDecoration(new MarginDecoration(getContext(), r02, 2, r02));
        }
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
            r02 = binding5.recyclerView;
        }
        if (r02 != 0) {
            r02.setItemAnimator(new SafeDefaultItemAnimator());
        }
        loadEquipment();
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new AvatarEquipmentFragment$sam$androidx_lifecycle_Observer$0(new AvatarEquipmentFragment$onViewCreated$3(this)));
        Analytics.INSTANCE.sendNavigationEvent(this.type + " screen");
    }

    public final void setAdapter$Habitica_2311256681_prodRelease(CustomizationEquipmentRecyclerViewAdapter customizationEquipmentRecyclerViewAdapter) {
        q.i(customizationEquipmentRecyclerViewAdapter, "<set-?>");
        this.adapter = customizationEquipmentRecyclerViewAdapter;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setLayoutManager$Habitica_2311256681_prodRelease(GridLayoutManager gridLayoutManager) {
        q.i(gridLayoutManager, "<set-?>");
        this.layoutManager = gridLayoutManager;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    public final void updateUser(User user) {
        int i10;
        updateActiveCustomization(user);
        CustomizationEquipmentRecyclerViewAdapter customizationEquipmentRecyclerViewAdapter = this.adapter;
        if (user != null) {
            i10 = user.getGemCount();
        } else {
            i10 = 0;
        }
        customizationEquipmentRecyclerViewAdapter.setGemBalance(Integer.valueOf(i10));
        this.adapter.notifyDataSetChanged();
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
