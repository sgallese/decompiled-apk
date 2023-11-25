package com.habitrpg.android.habitica.ui.adapter.inventory;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.k;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ItemItemBinding;
import com.habitrpg.android.habitica.databinding.ShopAdBinding;
import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.menu.BottomSheetMenu;
import com.habitrpg.android.habitica.ui.menu.BottomSheetMenuItem;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: ItemRecyclerAdapter.kt */
/* loaded from: classes4.dex */
public final class ItemRecyclerAdapter extends BaseRecyclerViewAdapter<BaseMainObject, RecyclerView.f0> {
    public static final int $stable = 8;
    private final Context context;
    private List<? extends Pet> existingPets;
    private Pet feedingPet;
    private k fragment;
    private Item hatchingItem;
    private boolean isFeeding;
    private boolean isHatching;
    private String itemText;
    private String itemType;
    private Map<String, ? extends Item> items;
    private pc.a<w> onCreateNewParty;
    private l<? super Food, w> onFeedPet;
    private p<? super HatchingPotion, ? super Egg, w> onHatchPet;
    private l<? super Item, w> onOpenMysteryItem;
    private pc.a<w> onOpenShop;
    private l<? super QuestContent, w> onQuestInvitation;
    private l<? super OwnedItem, w> onSellItem;
    private l<? super Item, w> onStartHatching;
    private l<? super SpecialItem, w> onUseSpecialItem;
    private Map<String, ? extends OwnedPet> ownedPets;
    private User user;

    /* compiled from: ItemRecyclerAdapter.kt */
    /* loaded from: classes4.dex */
    public final class ItemViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        private final ItemItemBinding binding;
        private Item item;
        private OwnedItem ownedItem;
        private Resources resources;
        final /* synthetic */ ItemRecyclerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(ItemRecyclerAdapter itemRecyclerAdapter, ItemItemBinding itemItemBinding) {
            super(itemItemBinding.getRoot());
            q.i(itemItemBinding, "binding");
            this.this$0 = itemRecyclerAdapter;
            this.binding = itemItemBinding;
            Resources resources = this.itemView.getResources();
            q.h(resources, "getResources(...)");
            this.resources = resources;
            this.itemView.setOnClickListener(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final boolean getCanHatch() {
            String str;
            String str2;
            String str3;
            int i10;
            OwnedPet ownedPet;
            boolean z10;
            String str4;
            String str5;
            Item item = this.item;
            Pet pet = null;
            if (item instanceof Egg) {
                if (item != null) {
                    str4 = item.getKey();
                } else {
                    str4 = null;
                }
                Item hatchingItem = this.this$0.getHatchingItem();
                if (hatchingItem != null) {
                    str5 = hatchingItem.getKey();
                } else {
                    str5 = null;
                }
                str3 = str4 + "-" + str5;
            } else {
                Item hatchingItem2 = this.this$0.getHatchingItem();
                if (hatchingItem2 != null) {
                    str = hatchingItem2.getKey();
                } else {
                    str = null;
                }
                Item item2 = this.item;
                if (item2 != null) {
                    str2 = item2.getKey();
                } else {
                    str2 = null;
                }
                str3 = str + "-" + str2;
            }
            List list = this.this$0.existingPets;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Pet pet2 = (Pet) next;
                    if (q.d(pet2.getKey(), str3) && !q.d(pet2.getType(), "special")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        pet = next;
                        break;
                    }
                }
                pet = pet;
            }
            if (pet != null) {
                Map map = this.this$0.ownedPets;
                if (map != null && (ownedPet = (OwnedPet) map.get(pet.getKey())) != null) {
                    i10 = ownedPet.getTrained();
                } else {
                    i10 = 0;
                }
                if (i10 <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.lang.String getImageName(com.habitrpg.android.habitica.models.inventory.Item r4, com.habitrpg.android.habitica.models.user.OwnedItem r5) {
            /*
                r3 = this;
                if (r5 == 0) goto L24
                java.lang.String r0 = r5.getItemType()
                java.lang.String r1 = "special"
                boolean r0 = qc.q.d(r0, r1)
                if (r0 == 0) goto L24
                java.lang.String r4 = r5.getKey()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "shop_"
                r5.append(r0)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                return r4
            L24:
                boolean r5 = r4 instanceof com.habitrpg.android.habitica.models.inventory.QuestContent
                if (r5 == 0) goto L41
                com.habitrpg.android.habitica.models.inventory.QuestContent r4 = (com.habitrpg.android.habitica.models.inventory.QuestContent) r4
                java.lang.String r4 = r4.getKey()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "inventory_quest_scroll_"
                r5.append(r0)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                goto Ld0
            L41:
                boolean r5 = r4 instanceof com.habitrpg.android.habitica.models.inventory.SpecialItem
                if (r5 == 0) goto L6c
                java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
                java.lang.String r5 = "MM"
                java.util.Locale r0 = java.util.Locale.getDefault()
                r4.<init>(r5, r0)
                java.util.Date r5 = new java.util.Date
                r5.<init>()
                java.lang.String r4 = r4.format(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "inventory_present_"
                r5.append(r0)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                goto Ld0
            L6c:
                r5 = 0
                if (r4 == 0) goto L74
                java.lang.String r0 = r4.getType()
                goto L75
            L74:
                r0 = r5
            L75:
                if (r0 == 0) goto Laf
                int r1 = r0.hashCode()
                r2 = -1623737538(0xffffffff9f37bb3e, float:-3.890664E-20)
                if (r1 == r2) goto La3
                r2 = 3111182(0x2f790e, float:4.359695E-39)
                if (r1 == r2) goto L97
                r2 = 3148894(0x300c5e, float:4.41254E-39)
                if (r1 == r2) goto L8b
                goto Laf
            L8b:
                java.lang.String r1 = "food"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L94
                goto Laf
            L94:
                java.lang.String r0 = "Food"
                goto Lb1
            L97:
                java.lang.String r1 = "eggs"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto La0
                goto Laf
            La0:
                java.lang.String r0 = "Egg"
                goto Lb1
            La3:
                java.lang.String r1 = "hatchingPotions"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto Lac
                goto Laf
            Lac:
                java.lang.String r0 = "HatchingPotion"
                goto Lb1
            Laf:
                java.lang.String r0 = ""
            Lb1:
                if (r4 == 0) goto Lb7
                java.lang.String r5 = r4.getKey()
            Lb7:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r1 = "Pet_"
                r4.append(r1)
                r4.append(r0)
                java.lang.String r0 = "_"
                r4.append(r0)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
            Ld0:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.adapter.inventory.ItemRecyclerAdapter.ItemViewHolder.getImageName(com.habitrpg.android.habitica.models.inventory.Item, com.habitrpg.android.habitica.models.user.OwnedItem):java.lang.String");
        }

        static /* synthetic */ String getImageName$default(ItemViewHolder itemViewHolder, Item item, OwnedItem ownedItem, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                item = null;
            }
            if ((i10 & 2) != 0) {
                ownedItem = null;
            }
            return itemViewHolder.getImageName(item, ownedItem);
        }

        public final void bind(OwnedItem ownedItem, Item item) {
            String str;
            String imageName$default;
            float f10;
            q.i(ownedItem, "ownedItem");
            this.ownedItem = ownedItem;
            this.item = item;
            TextView textView = this.binding.titleTextView;
            if (item == null || (str = item.getText()) == null) {
                String key = ownedItem.getKey();
                if (key != null) {
                    str = StringExtensionsKt.localizedCapitalizeWithSpaces(key);
                } else {
                    str = null;
                }
            }
            textView.setText(str);
            this.binding.ownedTextView.setText(String.valueOf(ownedItem.getNumberOwned()));
            boolean z10 = false;
            if (this.this$0.isHatching() && !getCanHatch()) {
                z10 = true;
            }
            if (item != null) {
                imageName$default = getImageName$default(this, item, null, 2, null);
            } else {
                imageName$default = getImageName$default(this, null, ownedItem, 1, null);
            }
            PixelArtView pixelArtView = this.binding.imageView;
            q.h(pixelArtView, "imageView");
            DataBindingUtilsKt.loadImage$default(pixelArtView, imageName$default, null, 2, null);
            if (z10) {
                f10 = 0.3f;
            } else {
                f10 = 1.0f;
            }
            this.binding.imageView.setAlpha(f10);
            this.binding.titleTextView.setAlpha(f10);
            this.binding.ownedTextView.setAlpha(f10);
        }

        public final ItemItemBinding getBinding() {
            return this.binding;
        }

        public final Item getItem() {
            return this.item;
        }

        public final Resources getResources() {
            return this.resources;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l<Food, w> onFeedPet;
            Item item;
            p<HatchingPotion, Egg, w> onHatchPet;
            p<HatchingPotion, Egg, w> onHatchPet2;
            String str;
            String imageName$default;
            String str2;
            double d10;
            q.i(view, "v");
            Context context = this.this$0.getContext();
            Egg egg = null;
            String str3 = null;
            HatchingPotion hatchingPotion = null;
            if (!this.this$0.isHatching() && !this.this$0.isFeeding()) {
                BottomSheetMenu bottomSheetMenu = new BottomSheetMenu(context);
                Item item2 = this.item;
                if (item2 != null) {
                    str = item2.getText();
                } else {
                    str = null;
                }
                bottomSheetMenu.setTitle(str);
                Item item3 = this.item;
                boolean z10 = true;
                if (item3 != null) {
                    imageName$default = getImageName$default(this, item3, null, 2, null);
                } else {
                    imageName$default = getImageName$default(this, null, this.ownedItem, 1, null);
                }
                bottomSheetMenu.setImage(imageName$default);
                Item item4 = this.item;
                if (!(item4 instanceof QuestContent) && !(item4 instanceof SpecialItem)) {
                    OwnedItem ownedItem = this.ownedItem;
                    if (ownedItem != null) {
                        str2 = ownedItem.getItemType();
                    } else {
                        str2 = null;
                    }
                    if (!q.d(str2, "special")) {
                        String string = this.resources.getString(R.string.sell_no_price);
                        q.h(string, "getString(...)");
                        Item item5 = this.item;
                        if (item5 != null) {
                            d10 = item5.getValue();
                        } else {
                            d10 = 0.0d;
                        }
                        bottomSheetMenu.addMenuItem(new BottomSheetMenuItem(string, true, "gold", d10));
                    }
                }
                Item item6 = this.item;
                if (item6 instanceof Egg) {
                    String string2 = this.resources.getString(R.string.hatch_with_potion);
                    q.h(string2, "getString(...)");
                    bottomSheetMenu.addMenuItem(new BottomSheetMenuItem(string2, false, null, 0.0d, 14, null));
                } else if (item6 instanceof HatchingPotion) {
                    String string3 = this.resources.getString(R.string.hatch_egg);
                    q.h(string3, "getString(...)");
                    bottomSheetMenu.addMenuItem(new BottomSheetMenuItem(string3, false, null, 0.0d, 14, null));
                } else {
                    int i10 = 0;
                    if (item6 instanceof QuestContent) {
                        String string4 = this.resources.getString(R.string.details);
                        q.h(string4, "getString(...)");
                        bottomSheetMenu.addMenuItem(new BottomSheetMenuItem(string4, false, null, 0.0d, 14, null));
                        User user = this.this$0.getUser();
                        if (user == null || !user.getHasParty()) {
                            z10 = false;
                        }
                        if (z10) {
                            String string5 = this.resources.getString(R.string.invite_party);
                            q.h(string5, "getString(...)");
                            bottomSheetMenu.addMenuItem(new BottomSheetMenuItem(string5, false, null, 0.0d, 14, null));
                        } else {
                            String string6 = this.resources.getString(R.string.create_new_party);
                            q.h(string6, "getString(...)");
                            bottomSheetMenu.addMenuItem(new BottomSheetMenuItem(string6, false, null, 0.0d, 14, null));
                        }
                    } else if (item6 instanceof SpecialItem) {
                        q.g(item6, "null cannot be cast to non-null type com.habitrpg.android.habitica.models.inventory.SpecialItem");
                        if (((SpecialItem) item6).isMysteryItem()) {
                            OwnedItem ownedItem2 = this.ownedItem;
                            if (ownedItem2 != null) {
                                i10 = ownedItem2.getNumberOwned();
                            }
                            if (i10 > 0) {
                                String string7 = this.resources.getString(R.string.open);
                                q.h(string7, "getString(...)");
                                bottomSheetMenu.addMenuItem(new BottomSheetMenuItem(string7, false, null, 0.0d, 14, null));
                            }
                        }
                    } else {
                        OwnedItem ownedItem3 = this.ownedItem;
                        if (ownedItem3 != null) {
                            str3 = ownedItem3.getItemType();
                        }
                        if (q.d(str3, "special")) {
                            OwnedItem ownedItem4 = this.ownedItem;
                            if (ownedItem4 != null) {
                                i10 = ownedItem4.getNumberOwned();
                            }
                            if (i10 > 0) {
                                String string8 = this.resources.getString(R.string.use_item);
                                q.h(string8, "getString(...)");
                                bottomSheetMenu.addMenuItem(new BottomSheetMenuItem(string8, false, null, 0.0d, 14, null));
                            }
                        }
                    }
                }
                bottomSheetMenu.setSelectionRunnable(new ItemRecyclerAdapter$ItemViewHolder$onClick$1(this, this.this$0, context));
                bottomSheetMenu.show();
            } else if (this.this$0.isHatching()) {
                if (getCanHatch() && (item = this.item) != null) {
                    ItemRecyclerAdapter itemRecyclerAdapter = this.this$0;
                    if (item instanceof Egg) {
                        Item hatchingItem = itemRecyclerAdapter.getHatchingItem();
                        if (hatchingItem instanceof HatchingPotion) {
                            hatchingPotion = (HatchingPotion) hatchingItem;
                        }
                        if (hatchingPotion != null && (onHatchPet2 = itemRecyclerAdapter.getOnHatchPet()) != null) {
                            onHatchPet2.invoke(hatchingPotion, item);
                        }
                    } else if (item instanceof HatchingPotion) {
                        Item hatchingItem2 = itemRecyclerAdapter.getHatchingItem();
                        if (hatchingItem2 instanceof Egg) {
                            egg = (Egg) hatchingItem2;
                        }
                        if (egg != null && (onHatchPet = itemRecyclerAdapter.getOnHatchPet()) != null) {
                            onHatchPet.invoke(item, egg);
                        }
                    }
                }
            } else if (this.this$0.isFeeding()) {
                Food food = (Food) this.item;
                if (food != null && (onFeedPet = this.this$0.getOnFeedPet()) != null) {
                    onFeedPet.invoke(food);
                }
                k fragment = this.this$0.getFragment();
                if (fragment != null) {
                    fragment.dismiss();
                }
            }
        }

        public final void setItem(Item item) {
            this.item = item;
        }

        public final void setResources(Resources resources) {
            q.i(resources, "<set-?>");
            this.resources = resources;
        }
    }

    /* compiled from: ItemRecyclerAdapter.kt */
    /* loaded from: classes4.dex */
    public final class ShopAdViewHolder extends RecyclerView.f0 {
        private final ShopAdBinding binding;
        final /* synthetic */ ItemRecyclerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShopAdViewHolder(ItemRecyclerAdapter itemRecyclerAdapter, ShopAdBinding shopAdBinding) {
            super(shopAdBinding.getRoot());
            q.i(shopAdBinding, "binding");
            this.this$0 = itemRecyclerAdapter;
            this.binding = shopAdBinding;
        }

        public final ShopAdBinding getBinding() {
            return this.binding;
        }
    }

    public ItemRecyclerAdapter(Context context) {
        q.i(context, "context");
        this.context = context;
        this.itemType = "";
        this.itemText = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(ItemRecyclerAdapter itemRecyclerAdapter, View view) {
        q.i(itemRecyclerAdapter, "this$0");
        pc.a<w> aVar = itemRecyclerAdapter.onOpenShop;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final Pet getFeedingPet() {
        return this.feedingPet;
    }

    public final k getFragment() {
        return this.fragment;
    }

    public final Item getHatchingItem() {
        return this.hatchingItem;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        int i10;
        int itemCount = super.getItemCount();
        if (!q.d(this.itemType, "special") && itemCount != 0 && !q.d(this.itemType, "")) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return itemCount + i10;
    }

    public final String getItemText() {
        return this.itemText;
    }

    public final String getItemType() {
        return this.itemType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (i10 < getData().size()) {
            return 0;
        }
        return -1;
    }

    public final Map<String, Item> getItems() {
        return this.items;
    }

    public final pc.a<w> getOnCreateNewParty() {
        return this.onCreateNewParty;
    }

    public final l<Food, w> getOnFeedPet() {
        return this.onFeedPet;
    }

    public final p<HatchingPotion, Egg, w> getOnHatchPet() {
        return this.onHatchPet;
    }

    public final l<Item, w> getOnOpenMysteryItem() {
        return this.onOpenMysteryItem;
    }

    public final pc.a<w> getOnOpenShop() {
        return this.onOpenShop;
    }

    public final l<QuestContent, w> getOnQuestInvitation() {
        return this.onQuestInvitation;
    }

    public final l<OwnedItem, w> getOnSellItem() {
        return this.onSellItem;
    }

    public final l<Item, w> getOnStartHatching() {
        return this.onStartHatching;
    }

    public final l<SpecialItem, w> getOnUseSpecialItem() {
        return this.onUseSpecialItem;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean isFeeding() {
        return this.isFeeding;
    }

    public final boolean isHatching() {
        return this.isHatching;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        String string;
        ItemViewHolder itemViewHolder;
        q.i(f0Var, "holder");
        ShopAdViewHolder shopAdViewHolder = null;
        Item item = null;
        if (i10 < getData().size()) {
            BaseMainObject baseMainObject = getData().get(i10);
            q.g(baseMainObject, "null cannot be cast to non-null type com.habitrpg.android.habitica.models.user.OwnedItem");
            OwnedItem ownedItem = (OwnedItem) baseMainObject;
            if (f0Var instanceof ItemViewHolder) {
                itemViewHolder = (ItemViewHolder) f0Var;
            } else {
                itemViewHolder = null;
            }
            if (itemViewHolder != null) {
                Map<String, ? extends Item> map = this.items;
                if (map != null) {
                    item = map.get(ownedItem.getKey());
                }
                itemViewHolder.bind(ownedItem, item);
                return;
            }
            return;
        }
        if (f0Var instanceof ShopAdViewHolder) {
            shopAdViewHolder = (ShopAdViewHolder) f0Var;
        }
        if (shopAdViewHolder == null) {
            return;
        }
        if (q.d(this.itemType, "quests")) {
            shopAdViewHolder.getBinding().imageView.setImageResource(R.drawable.icon_quests);
            shopAdViewHolder.getBinding().titleView.setText(this.context.getString(R.string.quests_footer_title));
            TextView textView = shopAdViewHolder.getBinding().descriptionView;
            q.h(textView, "descriptionView");
            MarkdownParserKt.setMarkdown(textView, this.context.getString(R.string.quests_footer_description));
        } else {
            shopAdViewHolder.getBinding().imageView.setImageResource(R.drawable.icon_shops);
            shopAdViewHolder.getBinding().titleView.setText(this.context.getString(R.string.item_footer_title, this.itemText));
            TextView textView2 = shopAdViewHolder.getBinding().descriptionView;
            q.h(textView2, "descriptionView");
            String str = this.itemType;
            int hashCode = str.hashCode();
            if (hashCode != -1623737538) {
                if (hashCode != 3111182) {
                    if (hashCode == 3148894 && str.equals("food")) {
                        string = this.context.getString(R.string.food_footer_description);
                        MarkdownParserKt.setMarkdown(textView2, string);
                    }
                    string = "";
                    MarkdownParserKt.setMarkdown(textView2, string);
                } else {
                    if (str.equals("eggs")) {
                        string = this.context.getString(R.string.eggs_footer_description);
                        MarkdownParserKt.setMarkdown(textView2, string);
                    }
                    string = "";
                    MarkdownParserKt.setMarkdown(textView2, string);
                }
            } else {
                if (str.equals("hatchingPotions")) {
                    string = this.context.getString(R.string.hatchingPotions_footer_description);
                    MarkdownParserKt.setMarkdown(textView2, string);
                }
                string = "";
                MarkdownParserKt.setMarkdown(textView2, string);
            }
        }
        shopAdViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.adapter.inventory.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemRecyclerAdapter.onBindViewHolder$lambda$0(ItemRecyclerAdapter.this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        if (i10 == 0) {
            ItemItemBinding inflate = ItemItemBinding.inflate(ContextExtensionsKt.getLayoutInflater(this.context), viewGroup, false);
            q.h(inflate, "inflate(...)");
            return new ItemViewHolder(this, inflate);
        }
        ShopAdBinding inflate2 = ShopAdBinding.inflate(ContextExtensionsKt.getLayoutInflater(this.context), viewGroup, false);
        q.h(inflate2, "inflate(...)");
        return new ShopAdViewHolder(this, inflate2);
    }

    public final void setExistingPets(List<? extends Pet> list) {
        q.i(list, "pets");
        this.existingPets = list;
        notifyDataSetChanged();
    }

    public final void setFeeding(boolean z10) {
        this.isFeeding = z10;
    }

    public final void setFeedingPet(Pet pet) {
        this.feedingPet = pet;
    }

    public final void setFragment(k kVar) {
        this.fragment = kVar;
    }

    public final void setHatching(boolean z10) {
        this.isHatching = z10;
    }

    public final void setHatchingItem(Item item) {
        this.hatchingItem = item;
    }

    public final void setItemText(String str) {
        q.i(str, "<set-?>");
        this.itemText = str;
    }

    public final void setItemType(String str) {
        q.i(str, "<set-?>");
        this.itemType = str;
    }

    public final void setItems(Map<String, ? extends Item> map) {
        this.items = map;
        notifyDataSetChanged();
    }

    public final void setOnCreateNewParty(pc.a<w> aVar) {
        this.onCreateNewParty = aVar;
    }

    public final void setOnFeedPet(l<? super Food, w> lVar) {
        this.onFeedPet = lVar;
    }

    public final void setOnHatchPet(p<? super HatchingPotion, ? super Egg, w> pVar) {
        this.onHatchPet = pVar;
    }

    public final void setOnOpenMysteryItem(l<? super Item, w> lVar) {
        this.onOpenMysteryItem = lVar;
    }

    public final void setOnOpenShop(pc.a<w> aVar) {
        this.onOpenShop = aVar;
    }

    public final void setOnQuestInvitation(l<? super QuestContent, w> lVar) {
        this.onQuestInvitation = lVar;
    }

    public final void setOnSellItem(l<? super OwnedItem, w> lVar) {
        this.onSellItem = lVar;
    }

    public final void setOnStartHatching(l<? super Item, w> lVar) {
        this.onStartHatching = lVar;
    }

    public final void setOnUseSpecialItem(l<? super SpecialItem, w> lVar) {
        this.onUseSpecialItem = lVar;
    }

    public final void setOwnedPets(Map<String, ? extends OwnedPet> map) {
        q.i(map, "ownedPets");
        this.ownedPets = map;
        notifyDataSetChanged();
    }

    public final void setUser(User user) {
        this.user = user;
    }
}
