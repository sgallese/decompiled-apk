package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.core.view.p0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.CustomizationRepository;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.BottomSheetBackgroundsFilterBinding;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.extensions.DrawableExtendsionsKt;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.models.CustomizationFilter;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.models.user.Hair;
import com.habitrpg.android.habitica.models.user.OwnedCustomization;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.CustomizationRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.helpers.MarginDecoration;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaBottomSheetDialog;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dd.n0;
import dd.x;
import ec.b0;
import ec.t;
import io.realm.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import qc.q;
import yc.w;

/* compiled from: AvatarCustomizationFragment.kt */
/* loaded from: classes4.dex */
public final class AvatarCustomizationFragment extends Hilt_AvatarCustomizationFragment<FragmentRefreshRecyclerviewBinding> implements SwipeRefreshLayout.j {
    public static final int $stable = 8;
    private String activeCustomization;
    private FragmentRefreshRecyclerviewBinding binding;
    private String category;
    public CustomizationRepository customizationRepository;
    private MenuItem filterMenuItem;
    public InventoryRepository inventoryRepository;
    private final x<List<OwnedCustomization>> ownedCustomizations;
    private String type;
    public MainUserViewModel userViewModel;
    private CustomizationRecyclerViewAdapter adapter = new CustomizationRecyclerViewAdapter();
    private FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(getMainActivity(), 0);
    private final x<CustomizationFilter> currentFilter = n0.a(new CustomizationFilter(false, true, null, 4, null));

    public AvatarCustomizationFragment() {
        List i10;
        i10 = t.i();
        this.ownedCustomizations = n0.a(i10);
    }

    private final void configureMonthFilterButton(final CheckBox checkBox, int i10, final CustomizationFilter customizationFilter) {
        final String h02;
        h02 = w.h0(String.valueOf(i10), 2, '0');
        checkBox.setChecked(customizationFilter.getMonths().contains(h02));
        checkBox.getText();
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.customization.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                AvatarCustomizationFragment.configureMonthFilterButton$lambda$10(CustomizationFilter.this, this, h02, checkBox, compoundButton, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureMonthFilterButton$lambda$10(CustomizationFilter customizationFilter, AvatarCustomizationFragment avatarCustomizationFragment, String str, CheckBox checkBox, CompoundButton compoundButton, boolean z10) {
        q.i(customizationFilter, "$filter");
        q.i(avatarCustomizationFragment, "this$0");
        q.i(str, "$identifier");
        q.i(checkBox, "$button");
        CustomizationFilter copy$default = CustomizationFilter.copy$default(customizationFilter, false, false, null, 7, null);
        copy$default.setMonths(new ArrayList());
        copy$default.getMonths().addAll(avatarCustomizationFragment.currentFilter.getValue().getMonths());
        if (!z10 && copy$default.getMonths().contains(str)) {
            checkBox.setTypeface(Typeface.create("sans-serif", 0));
            copy$default.getMonths().remove(str);
        } else if (z10 && !copy$default.getMonths().contains(str)) {
            checkBox.setTypeface(Typeface.create("sans-serif-medium", 0));
            copy$default.getMonths().add(str);
        }
        avatarCustomizationFragment.currentFilter.setValue(copy$default);
    }

    private final void loadCustomizations() {
        String str = this.type;
        if (str == null) {
            return;
        }
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new AvatarCustomizationFragment$loadCustomizations$1(this, str, null), 1, null);
        if (q.d(str, "hair")) {
            String str2 = "beard";
            if (q.d(this.category, "beard") || q.d(this.category, "mustache")) {
                if (!q.d(this.category, "mustache")) {
                    str2 = "mustache";
                }
                ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new AvatarCustomizationFragment$loadCustomizations$2(this, str, str2, null), 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldSkip(CustomizationFilter customizationFilter, List<? extends OwnedCustomization> list, Customization customization) {
        boolean T;
        Object obj;
        String str = null;
        if (customizationFilter.getOnlyPurchased()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (q.d(((OwnedCustomization) obj).getKey(), customization.getIdentifier())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                return true;
            }
        }
        if ((!customizationFilter.getMonths().isEmpty()) != false) {
            List<String> months = customizationFilter.getMonths();
            String customizationSet = customization.getCustomizationSet();
            if (customizationSet != null) {
                str = w.H0(customizationSet, '.', null, 2, null);
            }
            T = b0.T(months, str);
            if (!T) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFilterDialog$lambda$6(CustomizationFilter customizationFilter, AvatarCustomizationFragment avatarCustomizationFragment, RadioGroup radioGroup, int i10) {
        boolean z10;
        q.i(customizationFilter, "$filter");
        q.i(avatarCustomizationFragment, "this$0");
        CustomizationFilter copy$default = CustomizationFilter.copy$default(customizationFilter, false, false, null, 7, null);
        if (i10 == R.id.show_purchased_button) {
            z10 = true;
        } else {
            z10 = false;
        }
        copy$default.setOnlyPurchased(z10);
        avatarCustomizationFragment.currentFilter.setValue(copy$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFilterDialog$lambda$7(AvatarCustomizationFragment avatarCustomizationFragment, HabiticaBottomSheetDialog habiticaBottomSheetDialog, View view) {
        q.i(avatarCustomizationFragment, "this$0");
        q.i(habiticaBottomSheetDialog, "$dialog");
        avatarCustomizationFragment.currentFilter.setValue(new CustomizationFilter(false, !q.d(avatarCustomizationFragment.type, "background"), null, 4, null));
        habiticaBottomSheetDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFilterDialog$lambda$8(CustomizationFilter customizationFilter, AvatarCustomizationFragment avatarCustomizationFragment, RadioGroup radioGroup, int i10) {
        boolean z10;
        q.i(customizationFilter, "$filter");
        q.i(avatarCustomizationFragment, "this$0");
        CustomizationFilter copy$default = CustomizationFilter.copy$default(customizationFilter, false, false, null, 7, null);
        if (i10 == R.id.oldest_button) {
            z10 = true;
        } else {
            z10 = false;
        }
        copy$default.setAscending(z10);
        avatarCustomizationFragment.currentFilter.setValue(copy$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFilterDialog$lambda$9(AvatarCustomizationFragment avatarCustomizationFragment, DialogInterface dialogInterface) {
        q.i(avatarCustomizationFragment, "this$0");
        avatarCustomizationFragment.updateFilterIcon();
    }

    private final void updateActiveCustomization(User user) {
        String str;
        Hair hair;
        Hair hair2;
        Hair hair3;
        Hair hair4;
        Hair hair5;
        Hair hair6;
        if (this.type != null && user.getPreferences() != null) {
            Preferences preferences = user.getPreferences();
            String str2 = this.type;
            String str3 = "";
            if (str2 != null) {
                Integer num = null;
                switch (str2.hashCode()) {
                    case -1332194002:
                        if (str2.equals("background")) {
                            if (preferences != null) {
                                str3 = preferences.getBackground();
                                break;
                            }
                            str3 = null;
                            break;
                        }
                        break;
                    case 3194850:
                        if (str2.equals("hair") && (str = this.category) != null) {
                            switch (str.hashCode()) {
                                case -1271629221:
                                    if (str.equals("flower")) {
                                        if (preferences != null && (hair = preferences.getHair()) != null) {
                                            num = Integer.valueOf(hair.getFlower());
                                        }
                                        str3 = String.valueOf(num);
                                        break;
                                    }
                                    break;
                                case 3016401:
                                    if (str.equals("base")) {
                                        if (preferences != null && (hair2 = preferences.getHair()) != null) {
                                            num = Integer.valueOf(hair2.getBase());
                                        }
                                        str3 = String.valueOf(num);
                                        break;
                                    }
                                    break;
                                case 93503803:
                                    if (str.equals("bangs")) {
                                        if (preferences != null && (hair3 = preferences.getHair()) != null) {
                                            num = Integer.valueOf(hair3.getBangs());
                                        }
                                        str3 = String.valueOf(num);
                                        break;
                                    }
                                    break;
                                case 93610800:
                                    if (str.equals("beard")) {
                                        if (preferences != null && (hair4 = preferences.getHair()) != null) {
                                            num = Integer.valueOf(hair4.getBeard());
                                        }
                                        str3 = String.valueOf(num);
                                        break;
                                    }
                                    break;
                                case 94842723:
                                    if (str.equals("color")) {
                                        if (preferences != null && (hair5 = preferences.getHair()) != null) {
                                            str3 = hair5.getColor();
                                            break;
                                        }
                                        str3 = null;
                                        break;
                                    }
                                    break;
                                case 853982760:
                                    if (str.equals("mustache")) {
                                        if (preferences != null && (hair6 = preferences.getHair()) != null) {
                                            num = Integer.valueOf(hair6.getMustache());
                                        }
                                        str3 = String.valueOf(num);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 3532157:
                        if (str2.equals("skin")) {
                            if (preferences != null) {
                                str3 = preferences.getSkin();
                                break;
                            }
                            str3 = null;
                            break;
                        }
                        break;
                    case 94623429:
                        if (str2.equals("chair")) {
                            if (preferences != null) {
                                str3 = preferences.getChair();
                                break;
                            }
                            str3 = null;
                            break;
                        }
                        break;
                    case 109407734:
                        if (str2.equals("shirt")) {
                            if (preferences != null) {
                                str3 = preferences.getShirt();
                                break;
                            }
                            str3 = null;
                            break;
                        }
                        break;
                }
            }
            if (str3 != null) {
                this.activeCustomization = str3;
                this.adapter.setActiveCustomization(str3);
            }
        }
    }

    private final void updateFilterIcon() {
        if (!this.currentFilter.getValue().isFiltering()) {
            MenuItem menuItem = this.filterMenuItem;
            if (menuItem != null) {
                menuItem.setIcon(R.drawable.ic_action_filter_list);
            }
            Context context = getContext();
            if (context != null) {
                Drawable e10 = androidx.core.content.a.e(context, R.drawable.ic_action_filter_list);
                if (e10 != null) {
                    DrawableExtendsionsKt.setTintWith(e10, ContextExtensionsKt.getThemeColor(context, R.attr.headerTextColor), PorterDuff.Mode.MULTIPLY);
                }
                MenuItem menuItem2 = this.filterMenuItem;
                if (menuItem2 != null) {
                    menuItem2.setIcon(e10);
                    return;
                }
                return;
            }
            return;
        }
        Context context2 = getContext();
        if (context2 != null) {
            Drawable e11 = androidx.core.content.a.e(context2, R.drawable.ic_filters_active);
            if (e11 != null) {
                DrawableExtendsionsKt.setTintWith(e11, ContextExtensionsKt.getThemeColor(context2, R.attr.textColorPrimaryDark), PorterDuff.Mode.MULTIPLY);
            }
            MenuItem menuItem3 = this.filterMenuItem;
            if (menuItem3 != null) {
                menuItem3.setIcon(e11);
            }
        }
    }

    public final CustomizationRecyclerViewAdapter getAdapter$Habitica_2311256681_prodRelease() {
        return this.adapter;
    }

    public final String getCategory() {
        return this.category;
    }

    public final CustomizationRepository getCustomizationRepository() {
        CustomizationRepository customizationRepository = this.customizationRepository;
        if (customizationRepository != null) {
            return customizationRepository;
        }
        q.z("customizationRepository");
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

    public final FlexboxLayoutManager getLayoutManager$Habitica_2311256681_prodRelease() {
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

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        q.i(menu, "menu");
        q.i(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_list_customizations, menu);
        this.filterMenuItem = menu.findItem(R.id.action_filter);
        updateFilterIcon();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setShowsBackButton(true);
        this.adapter.setOnCustomizationSelected(new AvatarCustomizationFragment$onCreateView$1(this));
        this.adapter.setOnShowPurchaseDialog(new AvatarCustomizationFragment$onCreateView$2(this));
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new AvatarCustomizationFragment$onCreateView$3(this, null), 1, null);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getCustomizationRepository().close();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        q.i(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_filter) {
            showFilterDialog();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AvatarCustomizationFragment$onRefresh$1(this, null), 2, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [qc.h, java.util.Set] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        RecyclerViewEmptySupport recyclerViewEmptySupport4;
        RecyclerViewEmptySupport recyclerViewEmptySupport5;
        SwipeRefreshLayout swipeRefreshLayout;
        boolean z10;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            AvatarCustomizationFragmentArgs fromBundle = AvatarCustomizationFragmentArgs.fromBundle(arguments);
            q.h(fromBundle, "fromBundle(...)");
            this.type = fromBundle.getType();
            String category = fromBundle.getCategory();
            q.h(category, "getCategory(...)");
            if (category.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.category = fromBundle.getCategory();
            }
            this.currentFilter.getValue().setAscending(!q.d(this.type, "background"));
        }
        this.adapter.setCustomizationType(this.type);
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null && (swipeRefreshLayout = binding.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getMainActivity(), 0);
        this.layoutManager = flexboxLayoutManager;
        int i10 = 2;
        flexboxLayoutManager.Q2(2);
        this.layoutManager.N2(0);
        FragmentRefreshRecyclerviewBinding binding2 = getBinding();
        ?? r02 = 0;
        if (binding2 != null) {
            recyclerViewEmptySupport = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setLayoutManager(this.layoutManager);
        }
        FragmentRefreshRecyclerviewBinding binding3 = getBinding();
        if (binding3 != null && (recyclerViewEmptySupport5 = binding3.recyclerView) != null) {
            recyclerViewEmptySupport5.addItemDecoration(new MarginDecoration(getContext(), r02, i10, r02));
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
            recyclerViewEmptySupport3 = binding5.recyclerView;
        } else {
            recyclerViewEmptySupport3 = null;
        }
        if (recyclerViewEmptySupport3 != null) {
            recyclerViewEmptySupport3.setItemAnimator(new SafeDefaultItemAnimator());
        }
        loadCustomizations();
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new AvatarCustomizationFragment$sam$androidx_lifecycle_Observer$0(new AvatarCustomizationFragment$onViewCreated$2(this)));
        FragmentRefreshRecyclerviewBinding binding6 = getBinding();
        if (binding6 != null && (recyclerViewEmptySupport4 = binding6.recyclerView) != null) {
            if (p0.Y(recyclerViewEmptySupport4) && !recyclerViewEmptySupport4.isLayoutRequested()) {
                getAdapter$Habitica_2311256681_prodRelease().setColumnCount(recyclerViewEmptySupport4.getWidth() / IntExtensionsKt.dpToPx(80, getContext()));
            } else {
                recyclerViewEmptySupport4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$onViewCreated$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                        view2.removeOnLayoutChangeListener(this);
                        AvatarCustomizationFragment.this.getAdapter$Habitica_2311256681_prodRelease().setColumnCount(view2.getWidth() / IntExtensionsKt.dpToPx(80, AvatarCustomizationFragment.this.getContext()));
                    }
                });
            }
        }
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new AvatarCustomizationFragment$onViewCreated$4(this, null), 1, null);
        Analytics.INSTANCE.sendNavigationEvent(this.type + " screen");
    }

    public final void setAdapter$Habitica_2311256681_prodRelease(CustomizationRecyclerViewAdapter customizationRecyclerViewAdapter) {
        q.i(customizationRecyclerViewAdapter, "<set-?>");
        this.adapter = customizationRecyclerViewAdapter;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setCustomizationRepository(CustomizationRepository customizationRepository) {
        q.i(customizationRepository, "<set-?>");
        this.customizationRepository = customizationRepository;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setLayoutManager$Habitica_2311256681_prodRelease(FlexboxLayoutManager flexboxLayoutManager) {
        q.i(flexboxLayoutManager, "<set-?>");
        this.layoutManager = flexboxLayoutManager;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    public final void showFilterDialog() {
        int i10;
        int i11;
        final CustomizationFilter value = this.currentFilter.getValue();
        Context context = getContext();
        if (context == null) {
            return;
        }
        final HabiticaBottomSheetDialog habiticaBottomSheetDialog = new HabiticaBottomSheetDialog(context);
        BottomSheetBackgroundsFilterBinding inflate = BottomSheetBackgroundsFilterBinding.inflate(getLayoutInflater());
        q.h(inflate, "inflate(...)");
        RadioGroup radioGroup = inflate.showMeWrapper;
        if (value.getOnlyPurchased()) {
            i10 = R.id.show_purchased_button;
        } else {
            i10 = R.id.show_all_button;
        }
        radioGroup.check(i10);
        inflate.showMeWrapper.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.customization.a
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i12) {
                AvatarCustomizationFragment.showFilterDialog$lambda$6(CustomizationFilter.this, this, radioGroup2, i12);
            }
        });
        inflate.clearButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.customization.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AvatarCustomizationFragment.showFilterDialog$lambda$7(AvatarCustomizationFragment.this, habiticaBottomSheetDialog, view);
            }
        });
        if (q.d(this.type, "background")) {
            RadioGroup radioGroup2 = inflate.sortByWrapper;
            if (value.getAscending()) {
                i11 = R.id.oldest_button;
            } else {
                i11 = R.id.newest_button;
            }
            radioGroup2.check(i11);
            inflate.sortByWrapper.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.customization.c
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup3, int i12) {
                    AvatarCustomizationFragment.showFilterDialog$lambda$8(CustomizationFilter.this, this, radioGroup3, i12);
                }
            });
            CheckBox checkBox = inflate.januaryButton;
            q.h(checkBox, "januaryButton");
            configureMonthFilterButton(checkBox, 1, value);
            CheckBox checkBox2 = inflate.febuaryButton;
            q.h(checkBox2, "febuaryButton");
            configureMonthFilterButton(checkBox2, 2, value);
            CheckBox checkBox3 = inflate.marchButton;
            q.h(checkBox3, "marchButton");
            configureMonthFilterButton(checkBox3, 3, value);
            CheckBox checkBox4 = inflate.aprilButton;
            q.h(checkBox4, "aprilButton");
            configureMonthFilterButton(checkBox4, 4, value);
            CheckBox checkBox5 = inflate.mayButton;
            q.h(checkBox5, "mayButton");
            configureMonthFilterButton(checkBox5, 5, value);
            CheckBox checkBox6 = inflate.juneButton;
            q.h(checkBox6, "juneButton");
            configureMonthFilterButton(checkBox6, 6, value);
            CheckBox checkBox7 = inflate.julyButton;
            q.h(checkBox7, "julyButton");
            configureMonthFilterButton(checkBox7, 7, value);
            CheckBox checkBox8 = inflate.augustButton;
            q.h(checkBox8, "augustButton");
            configureMonthFilterButton(checkBox8, 8, value);
            CheckBox checkBox9 = inflate.septemberButton;
            q.h(checkBox9, "septemberButton");
            configureMonthFilterButton(checkBox9, 9, value);
            CheckBox checkBox10 = inflate.octoberButton;
            q.h(checkBox10, "octoberButton");
            configureMonthFilterButton(checkBox10, 10, value);
            CheckBox checkBox11 = inflate.novemberButton;
            q.h(checkBox11, "novemberButton");
            configureMonthFilterButton(checkBox11, 11, value);
            CheckBox checkBox12 = inflate.decemberButton;
            q.h(checkBox12, "decemberButton");
            configureMonthFilterButton(checkBox12, 12, value);
        } else {
            inflate.sortByTitle.setVisibility(8);
            inflate.sortByWrapper.setVisibility(8);
            inflate.monthReleasedTitle.setVisibility(8);
            inflate.monthReleasedWrapper.setVisibility(8);
        }
        LinearLayout root = inflate.getRoot();
        q.h(root, "getRoot(...)");
        habiticaBottomSheetDialog.setContentView(root);
        habiticaBottomSheetDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.customization.d
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AvatarCustomizationFragment.showFilterDialog$lambda$9(AvatarCustomizationFragment.this, dialogInterface);
            }
        });
        habiticaBottomSheetDialog.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateUser(User user) {
        Collection i10;
        String str;
        Hair hair;
        x0 realmGet$customizations;
        boolean z10;
        if (user == null) {
            return;
        }
        updateActiveCustomization(user);
        x<List<OwnedCustomization>> xVar = this.ownedCustomizations;
        Purchases purchased = user.getPurchased();
        if (purchased == null || (realmGet$customizations = purchased.realmGet$customizations()) == null) {
            i10 = t.i();
        } else {
            i10 = new ArrayList();
            for (Object obj : realmGet$customizations) {
                OwnedCustomization ownedCustomization = (OwnedCustomization) obj;
                if (q.d(ownedCustomization.getType(), this.type) && ownedCustomization.getPurchased()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10.add(obj);
                }
            }
        }
        xVar.setValue(i10);
        CustomizationRecyclerViewAdapter customizationRecyclerViewAdapter = this.adapter;
        Preferences preferences = user.getPreferences();
        String str2 = null;
        if (preferences != null) {
            str = preferences.getSize();
        } else {
            str = null;
        }
        customizationRecyclerViewAdapter.setUserSize(str);
        CustomizationRecyclerViewAdapter customizationRecyclerViewAdapter2 = this.adapter;
        Preferences preferences2 = user.getPreferences();
        if (preferences2 != null && (hair = preferences2.getHair()) != null) {
            str2 = hair.getColor();
        }
        customizationRecyclerViewAdapter2.setHairColor(str2);
        this.adapter.setGemBalance(user.getGemCount());
        this.adapter.setAvatar(user);
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
