package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.e4;
import androidx.lifecycle.u0;
import androidx.lifecycle.w;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.FragmentComposeScrollingBinding;
import com.habitrpg.android.habitica.interactors.ShareAvatarUseCase;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragmentDirections;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import j0.j1;
import j0.y2;
import qc.q;

/* compiled from: AvatarOverviewFragment.kt */
/* loaded from: classes4.dex */
public class AvatarOverviewFragment extends Hilt_AvatarOverviewFragment<FragmentComposeScrollingBinding> implements AdapterView.OnItemSelectedListener {
    public static final int $stable = 8;
    private FragmentComposeScrollingBinding binding;
    public InventoryRepository inventoryRepository;
    public MainUserViewModel userViewModel;
    private boolean showCustomization = true;
    private final j1<Equipment> battleGearWeapon = y2.i(null, null, 2, null);
    private final j1<Equipment> costumeWeapon = y2.i(null, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayAvatarEquipmentFragment(String str, String str2) {
        MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
        if (str2 == null) {
            str2 = "";
        }
        AvatarOverviewFragmentDirections.OpenAvatarEquipment openAvatarEquipment = AvatarOverviewFragmentDirections.openAvatarEquipment(str, str2);
        q.h(openAvatarEquipment, "openAvatarEquipment(...)");
        mainNavigationController.navigate(openAvatarEquipment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayCustomizationFragment(String str, String str2) {
        MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
        if (str2 == null) {
            str2 = "";
        }
        AvatarOverviewFragmentDirections.OpenAvatarDetail openAvatarDetail = AvatarOverviewFragmentDirections.openAvatarDetail(str, str2);
        q.h(openAvatarDetail, "openAvatarDetail(...)");
        mainNavigationController.navigate(openAvatarDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayEquipmentFragment(String str, String str2, boolean z10) {
        MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
        if (str2 == null) {
            str2 = "";
        }
        AvatarOverviewFragmentDirections.OpenEquipmentDetail openEquipmentDetail = AvatarOverviewFragmentDirections.openEquipmentDetail(str, z10, str2);
        q.h(openEquipmentDetail, "openEquipmentDetail(...)");
        mainNavigationController.navigate(openEquipmentDetail);
    }

    static /* synthetic */ void displayEquipmentFragment$default(AvatarOverviewFragment avatarOverviewFragment, String str, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            avatarOverviewFragment.displayEquipmentFragment(str, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: displayEquipmentFragment");
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        q.z("inventoryRepository");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean getShowCustomization() {
        return this.showCustomization;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        q.i(menu, "menu");
        q.i(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_share_avatar, menu);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView;
        q.i(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentComposeScrollingBinding binding = getBinding();
        if (binding != null && (composeView = binding.composeView) != null) {
            composeView.setViewCompositionStrategy(e4.c.f2665b);
            composeView.setContent(q0.c.c(-1713299447, true, new AvatarOverviewFragment$onCreateView$1$1(this)));
        }
        u0.b(getUserViewModel().getUser(), AvatarOverviewFragment$onCreateView$2.INSTANCE).j(getViewLifecycleOwner(), new AvatarOverviewFragmentKt$sam$androidx_lifecycle_Observer$0(new AvatarOverviewFragment$onCreateView$3(this)));
        return onCreateView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        String str;
        q.i(adapterView, "parent");
        if (i10 == 0) {
            str = "slim";
        } else {
            str = "broad";
        }
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new AvatarOverviewFragment$onItemSelected$1(this, str, null), 1, null);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        q.i(adapterView, "parent");
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        User f10;
        q.i(menuItem, "item");
        if (menuItem.getItemId() == R.id.share_avatar && (f10 = getUserViewModel().getUser().f()) != null) {
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new AvatarOverviewFragment$onOptionsItemSelected$1$1(new ShareAvatarUseCase(), this, f10, null), 1, null);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setShowCustomization(boolean z10) {
        this.showCustomization = z10;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentComposeScrollingBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentComposeScrollingBinding inflate = FragmentComposeScrollingBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentComposeScrollingBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentComposeScrollingBinding fragmentComposeScrollingBinding) {
        this.binding = fragmentComposeScrollingBinding;
    }
}
