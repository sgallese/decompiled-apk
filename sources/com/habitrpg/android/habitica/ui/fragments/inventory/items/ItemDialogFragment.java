package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import ad.i;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentItemsDialogBinding;
import com.habitrpg.android.habitica.interactors.FeedPetUseCase;
import com.habitrpg.android.habitica.interactors.HatchPetUseCase;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.inventory.ItemRecyclerAdapter;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dc.w;
import pc.l;
import qc.h;

/* compiled from: ItemDialogFragment.kt */
/* loaded from: classes4.dex */
public final class ItemDialogFragment extends Hilt_ItemDialogFragment<FragmentItemsDialogBinding> {
    private static final String ITEM_TYPE_KEY = "CLASS_TYPE_KEY";
    private ItemRecyclerAdapter adapter;
    private FragmentItemsDialogBinding binding;
    public FeedPetUseCase feedPetUseCase;
    private Pet feedingPet;
    public HatchPetUseCase hatchPetUseCase;
    private Item hatchingItem;
    public InventoryRepository inventoryRepository;
    private boolean isFeeding;
    private boolean isHatching;
    private String itemType;
    private String itemTypeText;
    private LinearLayoutManager layoutManager;
    private l<? super FeedResponse, w> onFeedResult;
    public SocialRepository socialRepository;
    private User user;
    public UserRepository userRepository;
    public MainUserViewModel userViewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ItemDialogFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void feedPet(Food food) {
        q activity;
        Pet pet = this.feedingPet;
        if (pet == null || (activity = getActivity()) == null) {
            return;
        }
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(activity), null, new ItemDialogFragment$feedPet$1(this, pet, food, activity, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hatchPet(HatchingPotion hatchingPotion, Egg egg) {
        dismiss();
        q activity = getActivity();
        if (activity == null) {
            return;
        }
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(activity), null, new ItemDialogFragment$hatchPet$1(this, hatchingPotion, egg, activity, null), 1, null);
    }

    private final void loadItems() {
        String str = this.itemType;
        Class cls = Egg.class;
        if (str != null) {
            switch (str.hashCode()) {
                case -2008465223:
                    if (str.equals("special")) {
                        cls = SpecialItem.class;
                        break;
                    }
                    break;
                case -1623737538:
                    if (str.equals("hatchingPotions")) {
                        cls = HatchingPotion.class;
                        break;
                    }
                    break;
                case -948698159:
                    if (str.equals("quests")) {
                        cls = QuestContent.class;
                        break;
                    }
                    break;
                case 3111182:
                    str.equals("eggs");
                    break;
                case 3148894:
                    if (str.equals("food")) {
                        cls = Food.class;
                        break;
                    }
                    break;
            }
        }
        String str2 = this.itemType;
        if (str2 != null) {
            androidx.lifecycle.q a10 = androidx.lifecycle.w.a(this);
            ExceptionHandler.Companion companion = ExceptionHandler.Companion;
            i.d(a10, ExceptionHandler.Companion.coroutine$default(companion, null, 1, null), null, new ItemDialogFragment$loadItems$1$1(this, str2, cls, null), 2, null);
            i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(companion, null, 1, null), null, new ItemDialogFragment$loadItems$1$2(this, null), 2, null);
            i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(companion, null, 1, null), null, new ItemDialogFragment$loadItems$1$3(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(ItemDialogFragment itemDialogFragment, User user) {
        qc.q.i(itemDialogFragment, "this$0");
        if (user != null) {
            itemDialogFragment.user = user;
            ItemRecyclerAdapter itemRecyclerAdapter = itemDialogFragment.adapter;
            if (itemRecyclerAdapter != null) {
                itemRecyclerAdapter.setUser(user);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openMarket() {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.marketFragment, null, 2, null);
    }

    public final ItemRecyclerAdapter getAdapter() {
        return this.adapter;
    }

    public final FeedPetUseCase getFeedPetUseCase() {
        FeedPetUseCase feedPetUseCase = this.feedPetUseCase;
        if (feedPetUseCase != null) {
            return feedPetUseCase;
        }
        qc.q.z("feedPetUseCase");
        return null;
    }

    public final Pet getFeedingPet() {
        return this.feedingPet;
    }

    public final HatchPetUseCase getHatchPetUseCase() {
        HatchPetUseCase hatchPetUseCase = this.hatchPetUseCase;
        if (hatchPetUseCase != null) {
            return hatchPetUseCase;
        }
        qc.q.z("hatchPetUseCase");
        return null;
    }

    public final Item getHatchingItem$Habitica_2311256681_prodRelease() {
        return this.hatchingItem;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final String getItemTypeText() {
        return this.itemTypeText;
    }

    public final LinearLayoutManager getLayoutManager$Habitica_2311256681_prodRelease() {
        return this.layoutManager;
    }

    public final l<FeedResponse, w> getOnFeedResult() {
        return this.onFeedResult;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    public final User getUser() {
        return this.user;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        qc.q.z("userRepository");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        qc.q.z("userViewModel");
        return null;
    }

    public final boolean isFeeding() {
        return this.isFeeding;
    }

    public final boolean isHatching() {
        return this.isHatching;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Dialog dialog;
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        qc.q.i(layoutInflater, "inflater");
        if (this.isHatching) {
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                dialog2.requestWindowFeature(1);
            }
        } else if (this.isFeeding && (dialog = getDialog()) != null) {
            dialog.requestWindowFeature(1);
        }
        FragmentItemsDialogBinding binding = getBinding();
        if (binding != null) {
            recyclerViewEmptySupport = binding.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setNestedScrollingEnabled(true);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getInventoryRepository().close();
        super.onDestroy();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        WindowManager.LayoutParams layoutParams;
        Window window2;
        if (this.isHatching || this.isFeeding) {
            Dialog dialog = getDialog();
            Window window3 = null;
            if (dialog != null) {
                window = dialog.getWindow();
            } else {
                window = null;
            }
            if (window != null) {
                Dialog dialog2 = getDialog();
                if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
                    layoutParams = window2.getAttributes();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    layoutParams.width = -1;
                }
                if (layoutParams != null) {
                    layoutParams.verticalMargin = 60.0f;
                }
                Dialog dialog3 = getDialog();
                if (dialog3 != null) {
                    window3 = dialog3.getWindow();
                }
                if (window3 != null) {
                    window3.setAttributes(layoutParams);
                }
            }
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        qc.q.i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString("CLASS_TYPE_KEY", this.itemType);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setAdapter(ItemRecyclerAdapter itemRecyclerAdapter) {
        this.adapter = itemRecyclerAdapter;
    }

    public final void setFeedPetUseCase(FeedPetUseCase feedPetUseCase) {
        qc.q.i(feedPetUseCase, "<set-?>");
        this.feedPetUseCase = feedPetUseCase;
    }

    public final void setFeeding(boolean z10) {
        this.isFeeding = z10;
    }

    public final void setFeedingPet(Pet pet) {
        this.feedingPet = pet;
    }

    public final void setHatchPetUseCase(HatchPetUseCase hatchPetUseCase) {
        qc.q.i(hatchPetUseCase, "<set-?>");
        this.hatchPetUseCase = hatchPetUseCase;
    }

    public final void setHatching(boolean z10) {
        this.isHatching = z10;
    }

    public final void setHatchingItem$Habitica_2311256681_prodRelease(Item item) {
        this.hatchingItem = item;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setItemType(String str) {
        this.itemType = str;
    }

    public final void setItemTypeText(String str) {
        this.itemTypeText = str;
    }

    public final void setLayoutManager$Habitica_2311256681_prodRelease(LinearLayoutManager linearLayoutManager) {
        this.layoutManager = linearLayoutManager;
    }

    public final void setOnFeedResult(l<? super FeedResponse, w> lVar) {
        this.onFeedResult = lVar;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public final void setUserRepository(UserRepository userRepository) {
        qc.q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    private final void setAdapter() {
        ItemRecyclerAdapter itemRecyclerAdapter;
        ItemRecyclerAdapter itemRecyclerAdapter2;
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        q activity = getActivity();
        FragmentItemsDialogBinding binding = getBinding();
        RecyclerView.h adapter = (binding == null || (recyclerViewEmptySupport = binding.recyclerView) == null) ? null : recyclerViewEmptySupport.getAdapter();
        ItemRecyclerAdapter itemRecyclerAdapter3 = adapter instanceof ItemRecyclerAdapter ? (ItemRecyclerAdapter) adapter : null;
        this.adapter = itemRecyclerAdapter3;
        if (itemRecyclerAdapter3 == null) {
            if (activity != null) {
                ItemRecyclerAdapter itemRecyclerAdapter4 = new ItemRecyclerAdapter(activity);
                this.adapter = itemRecyclerAdapter4;
                itemRecyclerAdapter4.setHatching(this.isHatching);
                ItemRecyclerAdapter itemRecyclerAdapter5 = this.adapter;
                if (itemRecyclerAdapter5 != null) {
                    itemRecyclerAdapter5.setFeeding(this.isFeeding);
                }
                ItemRecyclerAdapter itemRecyclerAdapter6 = this.adapter;
                if (itemRecyclerAdapter6 != null) {
                    itemRecyclerAdapter6.setFragment(this);
                }
            }
            Item item = this.hatchingItem;
            if (item != null && (itemRecyclerAdapter2 = this.adapter) != null) {
                itemRecyclerAdapter2.setHatchingItem(item);
            }
            Pet pet = this.feedingPet;
            if (pet != null && (itemRecyclerAdapter = this.adapter) != null) {
                itemRecyclerAdapter.setFeedingPet(pet);
            }
            FragmentItemsDialogBinding binding2 = getBinding();
            RecyclerViewEmptySupport recyclerViewEmptySupport2 = binding2 != null ? binding2.recyclerView : null;
            if (recyclerViewEmptySupport2 != null) {
                recyclerViewEmptySupport2.setAdapter(this.adapter);
            }
            ItemRecyclerAdapter itemRecyclerAdapter7 = this.adapter;
            if (itemRecyclerAdapter7 != null) {
                itemRecyclerAdapter7.setOnSellItem(new ItemDialogFragment$setAdapter$2(this));
            }
            ItemRecyclerAdapter itemRecyclerAdapter8 = this.adapter;
            if (itemRecyclerAdapter8 != null) {
                itemRecyclerAdapter8.setOnQuestInvitation(new ItemDialogFragment$setAdapter$3(this));
            }
            ItemRecyclerAdapter itemRecyclerAdapter9 = this.adapter;
            if (itemRecyclerAdapter9 != null) {
                itemRecyclerAdapter9.setOnOpenMysteryItem(new ItemDialogFragment$setAdapter$4(this));
            }
            ItemRecyclerAdapter itemRecyclerAdapter10 = this.adapter;
            if (itemRecyclerAdapter10 != null) {
                itemRecyclerAdapter10.setOnHatchPet(new ItemDialogFragment$setAdapter$5(this));
            }
            ItemRecyclerAdapter itemRecyclerAdapter11 = this.adapter;
            if (itemRecyclerAdapter11 != null) {
                itemRecyclerAdapter11.setOnFeedPet(new ItemDialogFragment$setAdapter$6(this));
            }
            ItemRecyclerAdapter itemRecyclerAdapter12 = this.adapter;
            if (itemRecyclerAdapter12 == null) {
                return;
            }
            itemRecyclerAdapter12.setOnOpenShop(new ItemDialogFragment$setAdapter$7(this));
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment
    public FragmentItemsDialogBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentItemsDialogBinding inflate = FragmentItemsDialogBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment
    public FragmentItemsDialogBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment
    public void setBinding(FragmentItemsDialogBinding fragmentItemsDialogBinding) {
        this.binding = fragmentItemsDialogBinding;
    }
}
