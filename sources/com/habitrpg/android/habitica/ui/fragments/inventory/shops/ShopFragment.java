package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.models.shops.Shop;
import com.habitrpg.android.habitica.models.shops.ShopCategory;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.inventory.ShopRecyclerAdapter;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.f;
import dc.g;
import ec.r;
import j0.j1;
import j0.y2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pc.p;
import q0.c;
import qc.h;
import qc.q;

/* compiled from: ShopFragment.kt */
/* loaded from: classes4.dex */
public class ShopFragment extends BaseMainFragment<FragmentRefreshRecyclerviewBinding> {
    private static final String SHOP_IDENTIFIER_KEY = "SHOP_IDENTIFIER_KEY";
    private ShopRecyclerAdapter adapter;
    private FragmentRefreshRecyclerviewBinding binding;
    public AppConfigManager configManager;
    private List<ShopCategory> gearCategories;
    public InventoryRepository inventoryRepository;
    private GridLayoutManager layoutManager;
    private Shop shop;
    private String shopIdentifier;
    public SocialRepository socialRepository;
    public MainUserViewModel userViewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final f currencyView$delegate = g.b(new ShopFragment$currencyView$2(this));
    private final j1<Double> hourglasses = y2.i(null, null, 2, null);
    private final j1<Double> gems = y2.i(null, null, 2, null);
    private final j1<Double> gold = y2.i(null, null, 2, null);

    /* compiled from: ShopFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayClassChanged(String str) {
        Context context = getContext();
        if (context != null) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
            habiticaAlertDialog.setMessage(getString(R.string.class_changed_description, str));
            String string = getString(R.string.complete_tutorial);
            q.h(string, "getString(...)");
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string, true, false, false, (p) new ShopFragment$displayClassChanged$1$1(habiticaAlertDialog), 12, (Object) null);
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Shop formatTimeTravelersShop(Shop shop) {
        Object obj;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (ShopCategory shopCategory : shop.getCategories()) {
            if (!q.d(shopCategory.getPinType(), "mystery_set")) {
                arrayList.add(shopCategory);
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (q.d(((ShopCategory) obj).getIdentifier(), "mystery_sets")) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ShopCategory shopCategory2 = (ShopCategory) obj;
                if (shopCategory2 == null) {
                    shopCategory2 = new ShopCategory();
                }
                if (shopCategory2.getIdentifier().length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    shopCategory2.setIdentifier("mystery_sets");
                    String string = getString(R.string.mystery_sets);
                    q.h(string, "getString(...)");
                    shopCategory2.setText(string);
                    arrayList.add(shopCategory2);
                }
                ShopItem shopItem = (ShopItem) r.c0(shopCategory.getItems());
                if (shopItem != null) {
                    shopItem.setKey(shopCategory.getIdentifier());
                    shopItem.setText(shopCategory.getText());
                    shopItem.setImageName("shop_set_mystery_" + shopItem.getKey());
                    shopItem.setPinType("mystery_set");
                    shopItem.setPath("mystery." + shopItem.getKey());
                    shopCategory2.getItems().add(shopItem);
                }
            }
        }
        shop.setCategories(arrayList);
        return shop;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMarketGear() {
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ShopFragment$loadMarketGear$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void loadShopInventory() {
        String str;
        String str2 = this.shopIdentifier;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1782896904:
                    if (str2.equals("questShop")) {
                        str = "quests";
                        break;
                    }
                    break;
                case -1081306052:
                    if (str2.equals("market")) {
                        str = "market";
                        break;
                    }
                    break;
                case -825703836:
                    if (str2.equals("seasonalShop")) {
                        str = "seasonal";
                        break;
                    }
                    break;
                case 523073365:
                    if (str2.equals("timeTravelersShop")) {
                        str = "time-travelers";
                        break;
                    }
                    break;
            }
            ExceptionHandlerKt.launchCatching(w.a(this), new ShopFragment$loadShopInventory$1(this), new ShopFragment$loadShopInventory$2(this, str, null));
        }
        str = "";
        ExceptionHandlerKt.launchCatching(w.a(this), new ShopFragment$loadShopInventory$1(this), new ShopFragment$loadShopInventory$2(this, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(ShopFragment shopFragment) {
        q.i(shopFragment, "this$0");
        shopFragment.loadShopInventory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(ShopFragment shopFragment, View view) {
        q.i(shopFragment, "this$0");
        q.i(view, "$view");
        shopFragment.setGridSpanCount(view.getWidth());
    }

    private final void setGridSpanCount(int i10) {
        int i11;
        Context context = getContext();
        if (context != null) {
            i11 = (int) (i10 / context.getResources().getDimension(R.dimen.reward_width));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClassChangeDialog(String str) {
        ad.g.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new ShopFragment$showClassChangeDialog$1(this, str, null), 2, null);
    }

    public final ShopRecyclerAdapter getAdapter() {
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

    public final ComposeView getCurrencyView$Habitica_2311256681_prodRelease() {
        return (ComposeView) this.currencyView$delegate.getValue();
    }

    public final j1<Double> getHourglasses$Habitica_2311256681_prodRelease() {
        return this.hourglasses;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        q.z("inventoryRepository");
        return null;
    }

    public final Shop getShop() {
        return this.shop;
    }

    public final String getShopIdentifier() {
        return this.shopIdentifier;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        q.z("socialRepository");
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

    public void initializeCurrencyViews() {
        getCurrencyView$Habitica_2311256681_prodRelease().setContent(c.c(-1956546805, true, new ShopFragment$initializeCurrencyViews$1(this)));
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getInventoryRepository().close();
        getSocialRepository().close();
        FrameLayout toolbarAccessoryContainer = getToolbarAccessoryContainer();
        if (toolbarAccessoryContainer != null) {
            toolbarAccessoryContainer.removeView(getCurrencyView$Habitica_2311256681_prodRelease());
        }
        super.onDestroyView();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.shop == null) {
            loadShopInventory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        q.i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString(SHOP_IDENTIFIER_KEY, this.shopIdentifier);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerView.h hVar;
        ShopRecyclerAdapter shopRecyclerAdapter;
        RecyclerView.p pVar;
        ShopRecyclerAdapter shopRecyclerAdapter2;
        Stats stats;
        String habitClass;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        RecyclerViewEmptySupport recyclerViewEmptySupport4;
        RecyclerViewEmptySupport recyclerViewEmptySupport5;
        RecyclerViewEmptySupport recyclerViewEmptySupport6;
        SwipeRefreshLayout swipeRefreshLayout;
        RecyclerViewEmptySupport recyclerViewEmptySupport7;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        initializeCurrencyViews();
        FrameLayout toolbarAccessoryContainer = getToolbarAccessoryContainer();
        if (toolbarAccessoryContainer != null) {
            toolbarAccessoryContainer.addView(getCurrencyView$Habitica_2311256681_prodRelease());
        }
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null && (recyclerViewEmptySupport7 = binding.recyclerView) != null) {
            recyclerViewEmptySupport7.setBackgroundResource(R.color.content_background);
        }
        FragmentRefreshRecyclerviewBinding binding2 = getBinding();
        if (binding2 != null) {
            recyclerViewEmptySupport = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setOnRefresh(new ShopFragment$onViewCreated$1(this));
        }
        FragmentRefreshRecyclerviewBinding binding3 = getBinding();
        if (binding3 != null && (swipeRefreshLayout = binding3.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.a
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
                public final void onRefresh() {
                    ShopFragment.onViewCreated$lambda$0(ShopFragment.this);
                }
            });
        }
        FragmentRefreshRecyclerviewBinding binding4 = getBinding();
        if (binding4 != null && (recyclerViewEmptySupport6 = binding4.recyclerView) != null) {
            hVar = recyclerViewEmptySupport6.getAdapter();
        } else {
            hVar = null;
        }
        if (hVar instanceof ShopRecyclerAdapter) {
            shopRecyclerAdapter = (ShopRecyclerAdapter) hVar;
        } else {
            shopRecyclerAdapter = null;
        }
        this.adapter = shopRecyclerAdapter;
        if (shopRecyclerAdapter == null) {
            ShopRecyclerAdapter shopRecyclerAdapter3 = new ShopRecyclerAdapter();
            this.adapter = shopRecyclerAdapter3;
            shopRecyclerAdapter3.setOnNeedsRefresh(new ShopFragment$onViewCreated$3(this));
            ShopRecyclerAdapter shopRecyclerAdapter4 = this.adapter;
            if (shopRecyclerAdapter4 != null) {
                shopRecyclerAdapter4.setOnShowPurchaseDialog(new ShopFragment$onViewCreated$4(this));
            }
            ShopRecyclerAdapter shopRecyclerAdapter5 = this.adapter;
            if (shopRecyclerAdapter5 != null) {
                shopRecyclerAdapter5.setContext(getContext());
            }
            ShopRecyclerAdapter shopRecyclerAdapter6 = this.adapter;
            if (shopRecyclerAdapter6 != null) {
                shopRecyclerAdapter6.setMainActivity(getMainActivity());
            }
            FragmentRefreshRecyclerviewBinding binding5 = getBinding();
            if (binding5 != null) {
                recyclerViewEmptySupport4 = binding5.recyclerView;
            } else {
                recyclerViewEmptySupport4 = null;
            }
            if (recyclerViewEmptySupport4 != null) {
                recyclerViewEmptySupport4.setAdapter(this.adapter);
            }
            FragmentRefreshRecyclerviewBinding binding6 = getBinding();
            if (binding6 != null) {
                recyclerViewEmptySupport5 = binding6.recyclerView;
            } else {
                recyclerViewEmptySupport5 = null;
            }
            if (recyclerViewEmptySupport5 != null) {
                recyclerViewEmptySupport5.setItemAnimator(new SafeDefaultItemAnimator());
            }
            ShopRecyclerAdapter shopRecyclerAdapter7 = this.adapter;
            if (shopRecyclerAdapter7 != null) {
                shopRecyclerAdapter7.setChangeClassEvents(new ShopFragment$onViewCreated$5(this));
            }
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ShopFragment$onViewCreated$6(this, null), 1, null);
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ShopFragment$onViewCreated$7(this, null), 1, null);
        }
        FragmentRefreshRecyclerviewBinding binding7 = getBinding();
        if (binding7 != null && (recyclerViewEmptySupport3 = binding7.recyclerView) != null) {
            pVar = recyclerViewEmptySupport3.getLayoutManager();
        } else {
            pVar = null;
        }
        if (pVar == null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            this.layoutManager = gridLayoutManager;
            gridLayoutManager.m3(new GridLayoutManager.c() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$8
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
                
                    r3 = r2.this$0.layoutManager;
                 */
                @Override // androidx.recyclerview.widget.GridLayoutManager.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public int getSpanSize(int r3) {
                    /*
                        r2 = this;
                        com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment r0 = com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment.this
                        com.habitrpg.android.habitica.ui.adapter.inventory.ShopRecyclerAdapter r0 = r0.getAdapter()
                        if (r0 == 0) goto Ld
                        int r3 = r0.getItemViewType(r3)
                        goto Le
                    Ld:
                        r3 = 0
                    Le:
                        r0 = 4
                        r1 = 1
                        if (r3 >= r0) goto L1e
                        com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment r3 = com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment.this
                        androidx.recyclerview.widget.GridLayoutManager r3 = com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment.access$getLayoutManager$p(r3)
                        if (r3 == 0) goto L1e
                        int r1 = r3.e3()
                    L1e:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$8.getSpanSize(int):int");
                }
            });
            FragmentRefreshRecyclerviewBinding binding8 = getBinding();
            if (binding8 != null) {
                recyclerViewEmptySupport2 = binding8.recyclerView;
            } else {
                recyclerViewEmptySupport2 = null;
            }
            if (recyclerViewEmptySupport2 != null) {
                recyclerViewEmptySupport2.setLayoutManager(this.layoutManager);
            }
        }
        String str = "";
        if (bundle != null) {
            this.shopIdentifier = bundle.getString(SHOP_IDENTIFIER_KEY, "");
        }
        ShopRecyclerAdapter shopRecyclerAdapter8 = this.adapter;
        if (shopRecyclerAdapter8 != null) {
            User f10 = getUserViewModel().getUser().f();
            if (f10 != null && (stats = f10.getStats()) != null && (habitClass = stats.getHabitClass()) != null) {
                str = habitClass;
            }
            shopRecyclerAdapter8.setSelectedGearCategory$Habitica_2311256681_prodRelease(str);
        }
        Shop shop = this.shop;
        if (shop != null && (shopRecyclerAdapter2 = this.adapter) != null) {
            shopRecyclerAdapter2.setShop(shop);
        }
        ShopRecyclerAdapter shopRecyclerAdapter9 = this.adapter;
        if (shopRecyclerAdapter9 != null) {
            shopRecyclerAdapter9.setShopSpriteSuffix(getConfigManager().shopSpriteSuffix());
        }
        List<ShopCategory> list = this.gearCategories;
        if (list != null) {
            ShopRecyclerAdapter shopRecyclerAdapter10 = this.adapter;
            if (shopRecyclerAdapter10 != null) {
                shopRecyclerAdapter10.setGearCategories(list);
            }
        } else if (q.d("market", this.shopIdentifier)) {
            loadMarketGear();
        }
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new ShopFragment$sam$androidx_lifecycle_Observer$0(new ShopFragment$onViewCreated$9(this)));
        ad.g.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new ShopFragment$onViewCreated$10(this, null), 2, null);
        view.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.b
            @Override // java.lang.Runnable
            public final void run() {
                ShopFragment.onViewCreated$lambda$1(ShopFragment.this, view);
            }
        });
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ShopFragment$onViewCreated$12(this, null), 1, null);
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ShopFragment$onViewCreated$13(this, null), 1, null);
        Analytics.INSTANCE.sendNavigationEvent(this.shopIdentifier + " screen");
    }

    public final void setAdapter(ShopRecyclerAdapter shopRecyclerAdapter) {
        this.adapter = shopRecyclerAdapter;
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setShop(Shop shop) {
        this.shop = shop;
    }

    public final void setShopIdentifier(String str) {
        this.shopIdentifier = str;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
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
