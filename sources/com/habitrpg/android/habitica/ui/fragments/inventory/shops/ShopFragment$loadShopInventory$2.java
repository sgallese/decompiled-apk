package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import ad.k0;
import android.content.Context;
import android.content.res.Resources;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.models.inventory.ItemEvent;
import com.habitrpg.android.habitica.models.shops.Shop;
import com.habitrpg.android.habitica.models.shops.ShopCategory;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.inventory.ShopRecyclerAdapter;
import dc.n;
import dc.w;
import ec.b0;
import ec.x;
import gc.c;
import ic.d;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadShopInventory$2", f = "ShopFragment.kt", l = {313}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ShopFragment$loadShopInventory$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $shopUrl;
    int label;
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$loadShopInventory$2(ShopFragment shopFragment, String str, Continuation<? super ShopFragment$loadShopInventory$2> continuation) {
        super(2, continuation);
        this.this$0 = shopFragment;
        this.$shopUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ShopFragment$loadShopInventory$2(this.this$0, this.$shopUrl, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ShopFragment$loadShopInventory$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Resources resources;
        Resources resources2;
        Integer num;
        SubscriptionPlan plan;
        d10 = d.d();
        int i10 = this.label;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            InventoryRepository inventoryRepository = this.this$0.getInventoryRepository();
            String str = this.$shopUrl;
            this.label = 1;
            obj = inventoryRepository.retrieveShopInventory(str, this);
            if (obj == d10) {
                return d10;
            }
        }
        Shop shop = (Shop) obj;
        if (shop == null) {
            return w.f13270a;
        }
        String identifier = shop.getIdentifier();
        int hashCode = identifier.hashCode();
        SwipeRefreshLayout swipeRefreshLayout = null;
        if (hashCode != -1081306052) {
            if (hashCode != -825703836) {
                if (hashCode == 523073365 && identifier.equals("timeTravelersShop")) {
                    this.this$0.formatTimeTravelersShop(shop);
                }
            } else if (identifier.equals("seasonalShop")) {
                List<ShopCategory> categories = shop.getCategories();
                final Comparator comparator = new Comparator() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadShopInventory$2$invokeSuspend$$inlined$compareBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        Object c02;
                        String str2;
                        Object c03;
                        int d11;
                        c02 = b0.c0(((ShopCategory) t10).getItems());
                        ShopItem shopItem = (ShopItem) c02;
                        String str3 = null;
                        if (shopItem != null) {
                            str2 = shopItem.getCurrency();
                        } else {
                            str2 = null;
                        }
                        Boolean valueOf = Boolean.valueOf(!q.d(str2, "gold"));
                        c03 = b0.c0(((ShopCategory) t11).getItems());
                        ShopItem shopItem2 = (ShopItem) c03;
                        if (shopItem2 != null) {
                            str3 = shopItem2.getCurrency();
                        }
                        d11 = c.d(valueOf, Boolean.valueOf(!q.d(str3, "gold")));
                        return d11;
                    }
                };
                final Comparator comparator2 = new Comparator() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadShopInventory$2$invokeSuspend$$inlined$thenByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        Object c02;
                        Date date;
                        Object c03;
                        int d11;
                        ItemEvent event;
                        ItemEvent event2;
                        int compare = comparator.compare(t10, t11);
                        if (compare == 0) {
                            c02 = b0.c0(((ShopCategory) t11).getItems());
                            ShopItem shopItem = (ShopItem) c02;
                            Date date2 = null;
                            if (shopItem != null && (event2 = shopItem.getEvent()) != null) {
                                date = event2.getEnd();
                            } else {
                                date = null;
                            }
                            c03 = b0.c0(((ShopCategory) t10).getItems());
                            ShopItem shopItem2 = (ShopItem) c03;
                            if (shopItem2 != null && (event = shopItem2.getEvent()) != null) {
                                date2 = event.getEnd();
                            }
                            d11 = c.d(date, date2);
                            return d11;
                        }
                        return compare;
                    }
                };
                x.v(categories, new Comparator() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadShopInventory$2$invokeSuspend$$inlined$thenBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        Object c02;
                        Boolean bool;
                        Object c03;
                        int d11;
                        int compare = comparator2.compare(t10, t11);
                        if (compare == 0) {
                            c02 = b0.c0(((ShopCategory) t10).getItems());
                            ShopItem shopItem = (ShopItem) c02;
                            Boolean bool2 = null;
                            if (shopItem != null) {
                                bool = Boolean.valueOf(shopItem.getLocked());
                            } else {
                                bool = null;
                            }
                            c03 = b0.c0(((ShopCategory) t11).getItems());
                            ShopItem shopItem2 = (ShopItem) c03;
                            if (shopItem2 != null) {
                                bool2 = Boolean.valueOf(shopItem2.getLocked());
                            }
                            d11 = c.d(bool, bool2);
                            return d11;
                        }
                        return compare;
                    }
                });
            }
        } else if (identifier.equals("market")) {
            User f10 = this.this$0.getUserViewModel().getUser().f();
            ShopCategory shopCategory = new ShopCategory();
            String string = this.this$0.getString(R.string.special);
            q.h(string, "getString(...)");
            shopCategory.setText(string);
            ShopItem.Companion companion = ShopItem.Companion;
            Context context = this.this$0.getContext();
            if (context != null) {
                resources = context.getResources();
            } else {
                resources = null;
            }
            ShopItem makeGemItem = companion.makeGemItem(resources);
            if (f10 == null || !f10.isSubscribed()) {
                z10 = false;
            }
            if (z10) {
                Purchases purchased = f10.getPurchased();
                if (purchased != null && (plan = purchased.getPlan()) != null) {
                    num = kotlin.coroutines.jvm.internal.b.d(plan.getNumberOfGemsLeft());
                } else {
                    num = null;
                }
                makeGemItem.setLimitedNumberLeft(num);
            } else {
                makeGemItem.setLimitedNumberLeft(kotlin.coroutines.jvm.internal.b.d(-1));
            }
            shopCategory.getItems().add(makeGemItem);
            List<ShopItem> items = shopCategory.getItems();
            Context context2 = this.this$0.getContext();
            if (context2 != null) {
                resources2 = context2.getResources();
            } else {
                resources2 = null;
            }
            items.add(companion.makeFortifyItem(resources2));
            shop.getCategories().add(shopCategory);
        }
        this.this$0.setShop(shop);
        ShopRecyclerAdapter adapter = this.this$0.getAdapter();
        if (adapter != null) {
            adapter.setShop(shop);
        }
        FragmentRefreshRecyclerviewBinding binding = this.this$0.getBinding();
        if (binding != null) {
            swipeRefreshLayout = binding.refreshLayout;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return w.f13270a;
    }
}
