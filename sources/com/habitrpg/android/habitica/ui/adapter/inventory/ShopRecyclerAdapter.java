package com.habitrpg.android.habitica.ui.adapter.inventory;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ShopArmoireGearBinding;
import com.habitrpg.android.habitica.databinding.ShopHeaderBinding;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.models.shops.Shop;
import com.habitrpg.android.habitica.models.shops.ShopCategory;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.adapter.inventory.ShopRecyclerAdapter;
import com.habitrpg.android.habitica.ui.viewHolders.SectionViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.ShopItemViewHolder;
import com.habitrpg.android.habitica.ui.views.AppHeaderViewKt;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.r;
import dc.w;
import ec.m0;
import ec.t;
import ec.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: ShopRecyclerAdapter.kt */
/* loaded from: classes4.dex */
public final class ShopRecyclerAdapter extends RecyclerView.h<RecyclerView.f0> {
    public static final int $stable = 8;
    private int armoireCount;
    private ShopItem armoireItem;
    private l<? super String, w> changeClassEvents;
    private List<String> completedQuests;
    private Context context;
    private List<ShopCategory> gearCategories;
    private final List<Object> items;
    private MainActivity mainActivity;
    private pc.a<w> onNeedsRefresh;
    private p<? super ShopItem, ? super Boolean, w> onShowPurchaseDialog;
    private Map<String, ? extends OwnedItem> ownedItems;
    private List<String> pinnedItemKeys;
    private String selectedGearCategory;
    private String shopIdentifier;
    private String shopSpriteSuffix;
    private User user;

    /* compiled from: ShopRecyclerAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class ArmoireGearViewHolder extends RecyclerView.f0 {
        public static final int $stable = 8;
        private final ShopArmoireGearBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArmoireGearViewHolder(View view) {
            super(view);
            q.i(view, "view");
            ShopArmoireGearBinding bind = ShopArmoireGearBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
            bind.currencyView.setValue(100.0d);
            PixelArtView pixelArtView = bind.iconView;
            q.h(pixelArtView, "iconView");
            DataBindingUtilsKt.loadImage$default(pixelArtView, "shop_armoire", null, 2, null);
        }

        public final void bind(String str, int i10) {
            q.i(str, "className");
            this.binding.titleView.setText(this.itemView.getContext().getString(R.string.shop_armoire_title, str));
            if (i10 > 0) {
                this.binding.descriptionView.setText(this.itemView.getContext().getString(R.string.shop_armoire_description, Integer.valueOf(i10)));
                this.binding.footerLayout.setVisibility(0);
                this.binding.iconView.setVisibility(0);
                return;
            }
            this.binding.descriptionView.setText(this.itemView.getContext().getString(R.string.shop_armoire_empty_description));
            this.binding.footerLayout.setVisibility(4);
            this.binding.iconView.setVisibility(8);
        }
    }

    /* compiled from: ShopRecyclerAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class EmptyStateViewHolder extends RecyclerView.f0 {
        public static final int $stable = 8;
        private final Button subscribeButton;
        private String text;
        private final TextView textView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyStateViewHolder(View view) {
            super(view);
            q.i(view, "view");
            Button button = (Button) this.itemView.findViewById(R.id.subscribeButton);
            this.subscribeButton = button;
            this.textView = (TextView) this.itemView.findViewById(R.id.textView);
            if (button != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.adapter.inventory.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ShopRecyclerAdapter.EmptyStateViewHolder._init_$lambda$0(view2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(View view) {
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.gemPurchaseActivity, null, 2, null);
        }

        public final String getText() {
            return this.text;
        }

        public final void setText(String str) {
            this.text = str;
            TextView textView = this.textView;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    /* compiled from: ShopRecyclerAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class ShopHeaderViewHolder extends RecyclerView.f0 {
        private final ShopHeaderBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShopHeaderViewHolder(ViewGroup viewGroup) {
            super(ViewGroupExt.inflate$default(viewGroup, R.layout.shop_header, false, 2, null));
            q.i(viewGroup, "parent");
            ShopHeaderBinding bind = ShopHeaderBinding.bind(this.itemView);
            q.h(bind, "bind(...)");
            this.binding = bind;
            bind.descriptionView.setMovementMethod(LinkMovementMethod.getInstance());
        }

        public final void bind(Shop shop, String str) {
            q.i(shop, "shop");
            q.i(str, "shopSpriteSuffix");
            this.binding.npcBannerView.setShopSpriteSuffix(str);
            this.binding.npcBannerView.setIdentifier(shop.getIdentifier());
            this.binding.descriptionView.setText(StringExtensionsKt.fromHtml(shop.getNotes()));
            this.binding.namePlate.setText(shop.getNpcNameResource());
        }
    }

    public ShopRecyclerAdapter() {
        List<String> i10;
        i10 = t.i();
        this.completedQuests = i10;
        this.items = new ArrayList();
        this.ownedItems = new HashMap();
        this.shopSpriteSuffix = "";
        this.pinnedItemKeys = new ArrayList();
        this.gearCategories = new ArrayList();
        this.selectedGearCategory = "";
    }

    private final int getEmptyViewResource() {
        String str = this.shopIdentifier;
        if (q.d(str, "seasonalShop")) {
            return R.layout.empty_view_seasonal_shop;
        }
        if (q.d(str, "timeTravelersShop")) {
            return R.layout.empty_view_timetravelers;
        }
        return R.layout.simple_textview;
    }

    private final int getGearItemCount() {
        ShopCategory selectedShopCategory;
        if (q.d(this.selectedGearCategory, "") || (selectedShopCategory = getSelectedShopCategory()) == null) {
            return 0;
        }
        if (selectedShopCategory.getItems().size() == 0) {
            return 2;
        }
        return selectedShopCategory.getItems().size() + 1;
    }

    private final Object getItem(int i10) {
        List<ShopItem> items;
        Resources resources;
        String str;
        List<ShopItem> items2;
        String str2 = null;
        if (this.items.size() == 0) {
            return null;
        }
        int i11 = 0;
        if (i10 == 0) {
            return this.items.get(0);
        }
        if (i10 <= getGearItemCount()) {
            ShopCategory selectedShopCategory = getSelectedShopCategory();
            if (i10 == 1) {
                if (selectedShopCategory != null) {
                    Context context = this.context;
                    if (context != null) {
                        str2 = context.getString(R.string.class_equipment);
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    selectedShopCategory.setText(str2);
                }
                return selectedShopCategory;
            }
            if (selectedShopCategory != null && (items2 = selectedShopCategory.getItems()) != null) {
                i11 = items2.size();
            }
            int i12 = i10 - 2;
            if (i11 <= i12) {
                Context context2 = this.context;
                if (context2 != null && (resources = context2.getResources()) != null) {
                    if (selectedShopCategory != null) {
                        str = selectedShopCategory.getIdentifier();
                    } else {
                        str = null;
                    }
                    String translatedClassName = AppHeaderViewKt.getTranslatedClassName(resources, str);
                    if (translatedClassName != null) {
                        str2 = translatedClassName;
                        return new dc.l(str2, Integer.valueOf(this.armoireCount));
                    }
                }
                if (selectedShopCategory != null) {
                    str2 = selectedShopCategory.getIdentifier();
                }
                return new dc.l(str2, Integer.valueOf(this.armoireCount));
            } else if (selectedShopCategory == null || (items = selectedShopCategory.getItems()) == null) {
                return null;
            } else {
                return items.get(i12);
            }
        }
        int gearItemCount = i10 - getGearItemCount();
        if (gearItemCount > this.items.size() - 1) {
            return null;
        }
        return this.items.get(gearItemCount);
    }

    private final ShopCategory getSelectedShopCategory() {
        Object obj;
        Iterator<T> it = this.gearCategories.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (q.d(this.selectedGearCategory, ((ShopCategory) obj).getIdentifier())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ShopCategory) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$5$lambda$4(ShopRecyclerAdapter shopRecyclerAdapter, View view) {
        int i10;
        Map e10;
        q.i(shopRecyclerAdapter, "this$0");
        User user = shopRecyclerAdapter.user;
        if (user != null) {
            i10 = user.getGemCount();
        } else {
            i10 = 0;
        }
        if (i10 >= 3) {
            l<? super String, w> lVar = shopRecyclerAdapter.changeClassEvents;
            if (lVar != null) {
                lVar.invoke(shopRecyclerAdapter.selectedGearCategory);
                return;
            }
            return;
        }
        MainActivity mainActivity = shopRecyclerAdapter.mainActivity;
        if (mainActivity != null) {
            InsufficientGemsDialog insufficientGemsDialog = new InsufficientGemsDialog(mainActivity, 3);
            Analytics analytics = Analytics.INSTANCE;
            EventCategory eventCategory = EventCategory.BEHAVIOUR;
            HitType hitType = HitType.EVENT;
            e10 = m0.e(r.a("reason", "class change"));
            Analytics.sendEvent$default(analytics, "show insufficient gems modal", eventCategory, hitType, e10, null, 16, null);
            insufficientGemsDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$1(ShopRecyclerAdapter shopRecyclerAdapter, View view) {
        p<? super ShopItem, ? super Boolean, w> pVar;
        q.i(shopRecyclerAdapter, "this$0");
        ShopItem shopItem = shopRecyclerAdapter.armoireItem;
        if (shopItem != null && (pVar = shopRecyclerAdapter.onShowPurchaseDialog) != null) {
            pVar.invoke(shopItem, Boolean.TRUE);
        }
    }

    public final int getArmoireCount() {
        return this.armoireCount;
    }

    public final ShopItem getArmoireItem() {
        return this.armoireItem;
    }

    public final l<String, w> getChangeClassEvents() {
        return this.changeClassEvents;
    }

    public final List<String> getCompletedQuests() {
        return this.completedQuests;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<ShopCategory> getGearCategories() {
        return this.gearCategories;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        int size = this.items.size() + getGearItemCount();
        if (size == 1) {
            return 2;
        }
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        Object item = getItem(i10);
        if (item instanceof Shop) {
            return 0;
        }
        if (item instanceof ShopCategory) {
            return 1;
        }
        if (item instanceof dc.l) {
            return 3;
        }
        if (item instanceof ShopItem) {
            return 4;
        }
        return 2;
    }

    public final MainActivity getMainActivity() {
        return this.mainActivity;
    }

    public final pc.a<w> getOnNeedsRefresh() {
        return this.onNeedsRefresh;
    }

    public final p<ShopItem, Boolean, w> getOnShowPurchaseDialog() {
        return this.onShowPurchaseDialog;
    }

    public final String getSelectedGearCategory$Habitica_2311256681_prodRelease() {
        return this.selectedGearCategory;
    }

    public final String getShopSpriteSuffix() {
        return this.shopSpriteSuffix;
    }

    public final User getUser() {
        return this.user;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        ArmoireGearViewHolder armoireGearViewHolder;
        String str;
        SectionViewHolder sectionViewHolder;
        int s10;
        boolean z10;
        Stats stats;
        q.i(f0Var, "holder");
        Object item = getItem(i10);
        if (item != null) {
            Integer num = null;
            ShopHeaderViewHolder shopHeaderViewHolder = null;
            r1 = null;
            String str2 = null;
            ShopItemViewHolder shopItemViewHolder = null;
            EmptyStateViewHolder emptyStateViewHolder = null;
            if (item instanceof Shop) {
                if (f0Var instanceof ShopHeaderViewHolder) {
                    shopHeaderViewHolder = (ShopHeaderViewHolder) f0Var;
                }
                if (shopHeaderViewHolder != null) {
                    shopHeaderViewHolder.bind((Shop) item, this.shopSpriteSuffix);
                    return;
                }
                return;
            }
            int i11 = 0;
            if (item instanceof ShopCategory) {
                if (f0Var instanceof SectionViewHolder) {
                    sectionViewHolder = (SectionViewHolder) f0Var;
                } else {
                    sectionViewHolder = null;
                }
                if (sectionViewHolder == null) {
                    return;
                }
                ShopCategory shopCategory = (ShopCategory) item;
                sectionViewHolder.bind(shopCategory.getText());
                if (this.gearCategories.contains(item)) {
                    Context context = this.context;
                    if (context != null) {
                        List<ShopCategory> list = this.gearCategories;
                        s10 = u.s(list, 10);
                        ArrayList arrayList = new ArrayList(s10);
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ShopCategory) it.next()).getIdentifier());
                        }
                        sectionViewHolder.setSpinnerAdapter(new HabiticaClassArrayAdapter(context, R.layout.class_spinner_dropdown_item, arrayList));
                        sectionViewHolder.setSelectedItem(this.gearCategories.indexOf(item));
                        sectionViewHolder.setSpinnerSelectionChanged(new ShopRecyclerAdapter$onBindViewHolder$1$1(this, f0Var));
                        User user = this.user;
                        if (user != null && (stats = user.getStats()) != null) {
                            str2 = stats.getHabitClass();
                        }
                        if (!q.d(str2, shopCategory.getIdentifier()) && !q.d(shopCategory.getIdentifier(), DevicePublicKeyStringDef.NONE)) {
                            User user2 = this.user;
                            if (user2 != null && user2.getHasClass()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                LinearLayout switchClassButton = sectionViewHolder.getSwitchClassButton();
                                if (switchClassButton != null) {
                                    switchClassButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.adapter.inventory.c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            ShopRecyclerAdapter.onBindViewHolder$lambda$5$lambda$4(ShopRecyclerAdapter.this, view);
                                        }
                                    });
                                }
                                LinearLayout switchClassButton2 = sectionViewHolder.getSwitchClassButton();
                                if (switchClassButton2 != null) {
                                    switchClassButton2.setVisibility(0);
                                }
                                TextView switchClassLabel = sectionViewHolder.getSwitchClassLabel();
                                if (switchClassLabel != null) {
                                    Resources resources = context.getResources();
                                    q.h(resources, "getResources(...)");
                                    switchClassLabel.setText(context.getString(R.string.change_class_to_x, AppHeaderViewKt.getTranslatedClassName(resources, this.selectedGearCategory)));
                                }
                                TextView switchClassDescription = sectionViewHolder.getSwitchClassDescription();
                                if (switchClassDescription != null) {
                                    Resources resources2 = context.getResources();
                                    q.h(resources2, "getResources(...)");
                                    switchClassDescription.setText(context.getString(R.string.unlock_gear_and_skills, AppHeaderViewKt.getTranslatedClassName(resources2, this.selectedGearCategory)));
                                }
                                CurrencyView switchClassCurrency = sectionViewHolder.getSwitchClassCurrency();
                                if (switchClassCurrency != null) {
                                    switchClassCurrency.setValue(3.0d);
                                    return;
                                }
                                return;
                            }
                            LinearLayout switchClassButton3 = sectionViewHolder.getSwitchClassButton();
                            if (switchClassButton3 != null) {
                                switchClassButton3.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        LinearLayout switchClassButton4 = sectionViewHolder.getSwitchClassButton();
                        if (switchClassButton4 != null) {
                            switchClassButton4.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                sectionViewHolder.setSpinnerAdapter(null);
                TextView notesView$Habitica_2311256681_prodRelease = sectionViewHolder.getNotesView$Habitica_2311256681_prodRelease();
                if (notesView$Habitica_2311256681_prodRelease != null) {
                    notesView$Habitica_2311256681_prodRelease.setVisibility(8);
                }
            } else if (item instanceof ShopItem) {
                if (f0Var instanceof ShopItemViewHolder) {
                    shopItemViewHolder = (ShopItemViewHolder) f0Var;
                }
                if (shopItemViewHolder == null) {
                    return;
                }
                ShopItem shopItem = (ShopItem) item;
                OwnedItem ownedItem = this.ownedItems.get(shopItem.getKey() + "-" + shopItem.getPurchaseType());
                if (ownedItem != null) {
                    i11 = ownedItem.getNumberOwned();
                }
                shopItemViewHolder.bind(shopItem, shopItem.canAfford(this.user, 1), i11);
                shopItemViewHolder.setPinned(this.pinnedItemKeys.contains(shopItem.getKey()));
                shopItemViewHolder.setCompleted(this.completedQuests.contains(shopItem.getKey()));
            } else if (item instanceof String) {
                if (f0Var instanceof EmptyStateViewHolder) {
                    emptyStateViewHolder = (EmptyStateViewHolder) f0Var;
                }
                if (emptyStateViewHolder != null) {
                    emptyStateViewHolder.setText((String) item);
                }
            } else if (item instanceof dc.l) {
                if (f0Var instanceof ArmoireGearViewHolder) {
                    armoireGearViewHolder = (ArmoireGearViewHolder) f0Var;
                } else {
                    armoireGearViewHolder = null;
                }
                if (armoireGearViewHolder != null) {
                    dc.l lVar = (dc.l) item;
                    Object c10 = lVar.c();
                    if (c10 instanceof String) {
                        str = (String) c10;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    Object d10 = lVar.d();
                    if (d10 instanceof Integer) {
                        num = (Integer) d10;
                    }
                    if (num != null) {
                        i11 = num.intValue();
                    }
                    armoireGearViewHolder.bind(str, i11);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        ShopItemViewHolder shopItemViewHolder = new ShopItemViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.row_shopitem, false, 2, null));
                        shopItemViewHolder.setShopIdentifier(this.shopIdentifier);
                        shopItemViewHolder.setOnNeedsRefresh(this.onNeedsRefresh);
                        shopItemViewHolder.setOnShowPurchaseDialog(this.onShowPurchaseDialog);
                        return shopItemViewHolder;
                    }
                    ArmoireGearViewHolder armoireGearViewHolder = new ArmoireGearViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.shop_armoire_gear, false, 2, null));
                    armoireGearViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.adapter.inventory.d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ShopRecyclerAdapter.onCreateViewHolder$lambda$1(ShopRecyclerAdapter.this, view);
                        }
                    });
                    return armoireGearViewHolder;
                }
                return new EmptyStateViewHolder(ViewGroupExt.inflate$default(viewGroup, getEmptyViewResource(), false, 2, null));
            }
            return new SectionViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.shop_section_header, false, 2, null));
        }
        return new ShopHeaderViewHolder(viewGroup);
    }

    public final void setArmoireCount(int i10) {
        this.armoireCount = i10;
    }

    public final void setArmoireItem(ShopItem shopItem) {
        this.armoireItem = shopItem;
    }

    public final void setChangeClassEvents(l<? super String, w> lVar) {
        this.changeClassEvents = lVar;
    }

    public final void setCompletedQuests(List<String> list) {
        q.i(list, "<set-?>");
        this.completedQuests = list;
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public final void setGearCategories(List<ShopCategory> list) {
        q.i(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.gearCategories = list;
        notifyDataSetChanged();
    }

    public final void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public final void setOnNeedsRefresh(pc.a<w> aVar) {
        this.onNeedsRefresh = aVar;
    }

    public final void setOnShowPurchaseDialog(p<? super ShopItem, ? super Boolean, w> pVar) {
        this.onShowPurchaseDialog = pVar;
    }

    public final void setOwnedItems(Map<String, ? extends OwnedItem> map) {
        q.i(map, "ownedItems");
        this.ownedItems = map;
        if (this.items.size() > 0) {
            notifyDataSetChanged();
        }
    }

    public final void setPinnedItemKeys(List<String> list) {
        q.i(list, "pinnedItemKeys");
        this.pinnedItemKeys = list;
        if (this.items.size() > 0) {
            notifyDataSetChanged();
        }
    }

    public final void setSelectedGearCategory$Habitica_2311256681_prodRelease(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.selectedGearCategory = str;
        if (!q.d(str, "") && this.items.size() > 0) {
            notifyDataSetChanged();
        }
    }

    public final void setShop(Shop shop) {
        if (shop == null) {
            return;
        }
        this.shopIdentifier = shop.getIdentifier();
        this.items.clear();
        this.items.add(shop);
        for (ShopCategory shopCategory : shop.getCategories()) {
            if (shopCategory.getItems().size() > 0) {
                this.items.add(shopCategory);
                for (ShopItem shopItem : shopCategory.getItems()) {
                    shopItem.setCategoryIdentifier(shopCategory.getIdentifier());
                    this.items.add(shopItem);
                }
            }
        }
        notifyDataSetChanged();
    }

    public final void setShopSpriteSuffix(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.shopSpriteSuffix = str;
        if (this.items.size() > 0) {
            notifyItemChanged(0);
        }
    }

    public final void setUser(User user) {
        this.user = user;
        if (this.items.size() > 0) {
            notifyDataSetChanged();
        }
    }
}
