package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import ad.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentItemsBinding;
import com.habitrpg.android.habitica.interactors.HatchPetUseCase;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.activities.SkillMemberActivity;
import com.habitrpg.android.habitica.ui.adapter.inventory.ItemRecyclerAdapter;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import java.util.ArrayList;
import java.util.List;
import pc.p;
import qc.h;
import qc.q;

/* compiled from: ItemRecyclerFragment.kt */
/* loaded from: classes4.dex */
public final class ItemRecyclerFragment extends Hilt_ItemRecyclerFragment<FragmentItemsBinding> implements SwipeRefreshLayout.j {
    private static final String ITEM_TYPE_KEY = "CLASS_TYPE_KEY";
    private static final String ITEM_TYPE_TEXT_KEY = "CLASS_TYPE_TEXT_KEY";
    private ItemRecyclerAdapter adapter;
    private FragmentItemsBinding binding;
    public HatchPetUseCase hatchPetUseCase;
    public InventoryRepository inventoryRepository;
    private String itemType;
    private String itemTypeText;
    private LinearLayoutManager layoutManager;
    private final androidx.activity.result.b<Intent> memberSelectionResult;
    private SpecialItem selectedSpecialItem;
    public SocialRepository socialRepository;
    private List<OwnedItem> transformationItems = new ArrayList();
    private User user;
    public UserRepository userRepository;
    public MainUserViewModel userViewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ItemRecyclerFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public ItemRecyclerFragment() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.items.c
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                ItemRecyclerFragment.memberSelectionResult$lambda$6(ItemRecyclerFragment.this, (ActivityResult) obj);
            }
        });
        q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.memberSelectionResult = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createNewParty() {
        HabiticaAlertDialog habiticaAlertDialog;
        Context context = getContext();
        if (context != null) {
            habiticaAlertDialog = new HabiticaAlertDialog(context);
        } else {
            habiticaAlertDialog = null;
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.setTitle(R.string.quest_party_required_title);
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.setMessage(R.string.quest_party_required_description);
        }
        if (habiticaAlertDialog != null) {
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.create_new_party, true, false, false, (p) new ItemRecyclerFragment$createNewParty$1(this), 8, (Object) null);
        }
        if (habiticaAlertDialog != null) {
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.close, false, false, false, (p) new ItemRecyclerFragment$createNewParty$2(habiticaAlertDialog), 12, (Object) null);
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displaySpecialItemResult(SpecialItem specialItem) {
        MainActivity mainActivity;
        if (!isAdded()) {
            return;
        }
        androidx.fragment.app.q activity = getActivity();
        String str = null;
        if (activity instanceof MainActivity) {
            mainActivity = (MainActivity) activity;
        } else {
            mainActivity = null;
        }
        if (mainActivity != null) {
            HabiticaSnackbar.Companion companion = HabiticaSnackbar.Companion;
            ViewGroup snackbarContainer = mainActivity.getSnackbarContainer();
            Context context = getContext();
            if (context != null) {
                Object[] objArr = new Object[1];
                if (specialItem != null) {
                    str = specialItem.getText();
                }
                objArr[0] = str;
                str = context.getString(R.string.used_skill_without_mana, objArr);
            }
            companion.showSnackbar(snackbarContainer, str, HabiticaSnackbar.SnackbarDisplayType.BLUE, (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : 0);
        }
        loadItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hatchPet(HatchingPotion hatchingPotion, Egg egg) {
        BaseActivity baseActivity;
        androidx.fragment.app.q activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ItemRecyclerFragment$hatchPet$1$1(this, hatchingPotion, egg, baseActivity, null), 1, null);
        }
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
            androidx.lifecycle.q a10 = w.a(this);
            ExceptionHandler.Companion companion = ExceptionHandler.Companion;
            i.d(a10, ExceptionHandler.Companion.coroutine$default(companion, null, 1, null), null, new ItemRecyclerFragment$loadItems$1$1(this, str2, cls, null), 2, null);
            i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(companion, null, 1, null), null, new ItemRecyclerFragment$loadItems$1$2(this, null), 2, null);
            i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(companion, null, 1, null), null, new ItemRecyclerFragment$loadItems$1$3(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void memberSelectionResult$lambda$6(ItemRecyclerFragment itemRecyclerFragment, ActivityResult activityResult) {
        String str;
        q.i(itemRecyclerFragment, "this$0");
        if (activityResult.b() == -1) {
            SpecialItem specialItem = itemRecyclerFragment.selectedSpecialItem;
            Intent a10 = activityResult.a();
            if (a10 != null) {
                str = a10.getStringExtra("member_id");
            } else {
                str = null;
            }
            itemRecyclerFragment.useSpecialItem(specialItem, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSpecialItemSelected(SpecialItem specialItem) {
        this.selectedSpecialItem = specialItem;
        this.memberSelectionResult.a(new Intent(getActivity(), SkillMemberActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(ItemRecyclerFragment itemRecyclerFragment, User user) {
        q.i(itemRecyclerFragment, "this$0");
        if (user != null) {
            itemRecyclerFragment.user = user;
            ItemRecyclerAdapter itemRecyclerAdapter = itemRecyclerFragment.adapter;
            if (itemRecyclerAdapter != null) {
                itemRecyclerAdapter.setUser(user);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openMarket() {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.marketFragment, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHatchingDialog(Item item) {
        ItemDialogFragment itemDialogFragment = new ItemDialogFragment();
        if (item instanceof Egg) {
            itemDialogFragment.setItemType("hatchingPotions");
            itemDialogFragment.setHatchingItem$Habitica_2311256681_prodRelease(item);
        } else {
            itemDialogFragment.setItemType("eggs");
            itemDialogFragment.setHatchingItem$Habitica_2311256681_prodRelease(item);
        }
        itemDialogFragment.setHatching(true);
        itemDialogFragment.setFeeding(false);
        itemDialogFragment.show(getParentFragmentManager(), "hatchingDialog");
    }

    private final void useSpecialItem(SpecialItem specialItem, String str) {
        if (specialItem != null && str != null) {
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ItemRecyclerFragment$useSpecialItem$1(this, specialItem, str, null), 1, null);
        }
    }

    static /* synthetic */ void useSpecialItem$default(ItemRecyclerFragment itemRecyclerFragment, SpecialItem specialItem, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        itemRecyclerFragment.useSpecialItem(specialItem, str);
    }

    public final ItemRecyclerAdapter getAdapter() {
        return this.adapter;
    }

    public final HatchPetUseCase getHatchPetUseCase$Habitica_2311256681_prodRelease() {
        HatchPetUseCase hatchPetUseCase = this.hatchPetUseCase;
        if (hatchPetUseCase != null) {
            return hatchPetUseCase;
        }
        q.z("hatchPetUseCase");
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

    public final String getItemType() {
        return this.itemType;
    }

    public final String getItemTypeText() {
        return this.itemTypeText;
    }

    public final LinearLayoutManager getLayoutManager$Habitica_2311256681_prodRelease() {
        return this.layoutManager;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        q.z("socialRepository");
        return null;
    }

    public final List<OwnedItem> getTransformationItems() {
        return this.transformationItems;
    }

    public final User getUser() {
        return this.user;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        q.z("userRepository");
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

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getInventoryRepository().close();
        super.onDestroy();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        SwipeRefreshLayout swipeRefreshLayout;
        FragmentItemsBinding binding = getBinding();
        if (binding != null) {
            swipeRefreshLayout = binding.refreshLayout;
        } else {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new ItemRecyclerFragment$onRefresh$1(this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        q.i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString("CLASS_TYPE_KEY", this.itemType);
        bundle.putString(ITEM_TYPE_TEXT_KEY, this.itemTypeText);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setAdapter(ItemRecyclerAdapter itemRecyclerAdapter) {
        this.adapter = itemRecyclerAdapter;
    }

    public final void setHatchPetUseCase$Habitica_2311256681_prodRelease(HatchPetUseCase hatchPetUseCase) {
        q.i(hatchPetUseCase, "<set-?>");
        this.hatchPetUseCase = hatchPetUseCase;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
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

    public final void setSocialRepository(SocialRepository socialRepository) {
        q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setTransformationItems(List<OwnedItem> list) {
        q.i(list, "<set-?>");
        this.transformationItems = list;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public final void setUserRepository(UserRepository userRepository) {
        q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    private final void setAdapter() {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        androidx.fragment.app.q activity = getActivity();
        FragmentItemsBinding binding = getBinding();
        String str = null;
        RecyclerView.h adapter = (binding == null || (recyclerViewEmptySupport = binding.recyclerView) == null) ? null : recyclerViewEmptySupport.getAdapter();
        ItemRecyclerAdapter itemRecyclerAdapter = adapter instanceof ItemRecyclerAdapter ? (ItemRecyclerAdapter) adapter : null;
        this.adapter = itemRecyclerAdapter;
        if (itemRecyclerAdapter == null) {
            if (activity != null) {
                this.adapter = new ItemRecyclerAdapter(activity);
            }
            FragmentItemsBinding binding2 = getBinding();
            RecyclerViewEmptySupport recyclerViewEmptySupport2 = binding2 != null ? binding2.recyclerView : null;
            if (recyclerViewEmptySupport2 != null) {
                recyclerViewEmptySupport2.setAdapter(this.adapter);
            }
        }
        ItemRecyclerAdapter itemRecyclerAdapter2 = this.adapter;
        if (itemRecyclerAdapter2 != null) {
            itemRecyclerAdapter2.setOnUseSpecialItem(new ItemRecyclerFragment$setAdapter$2(this));
        }
        ItemRecyclerAdapter itemRecyclerAdapter3 = this.adapter;
        if (itemRecyclerAdapter3 != null) {
            itemRecyclerAdapter3.setOnSellItem(new ItemRecyclerFragment$setAdapter$3(this));
        }
        ItemRecyclerAdapter itemRecyclerAdapter4 = this.adapter;
        if (itemRecyclerAdapter4 != null) {
            itemRecyclerAdapter4.setOnQuestInvitation(new ItemRecyclerFragment$setAdapter$4(this));
        }
        ItemRecyclerAdapter itemRecyclerAdapter5 = this.adapter;
        if (itemRecyclerAdapter5 != null) {
            itemRecyclerAdapter5.setOnOpenMysteryItem(new ItemRecyclerFragment$setAdapter$5(this));
        }
        ItemRecyclerAdapter itemRecyclerAdapter6 = this.adapter;
        if (itemRecyclerAdapter6 != null) {
            itemRecyclerAdapter6.setOnStartHatching(new ItemRecyclerFragment$setAdapter$6(this));
        }
        ItemRecyclerAdapter itemRecyclerAdapter7 = this.adapter;
        if (itemRecyclerAdapter7 != null) {
            itemRecyclerAdapter7.setOnHatchPet(new ItemRecyclerFragment$setAdapter$7(this));
        }
        ItemRecyclerAdapter itemRecyclerAdapter8 = this.adapter;
        if (itemRecyclerAdapter8 != null) {
            itemRecyclerAdapter8.setOnCreateNewParty(new ItemRecyclerFragment$setAdapter$8(this));
        }
        ItemRecyclerAdapter itemRecyclerAdapter9 = this.adapter;
        if (itemRecyclerAdapter9 != null) {
            String str2 = this.itemType;
            if (str2 == null) {
                str2 = "";
            }
            itemRecyclerAdapter9.setItemType(str2);
        }
        ItemRecyclerAdapter itemRecyclerAdapter10 = this.adapter;
        if (itemRecyclerAdapter10 != null) {
            if (!q.d(this.itemType, "hatchingPotions")) {
                str = this.itemTypeText;
            } else if (activity != null) {
                str = activity.getString(R.string.potions);
            }
            itemRecyclerAdapter10.setItemText(str != null ? str : "");
        }
        ItemRecyclerAdapter itemRecyclerAdapter11 = this.adapter;
        if (itemRecyclerAdapter11 == null) {
            return;
        }
        itemRecyclerAdapter11.setOnOpenShop(new ItemRecyclerFragment$setAdapter$9(this));
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentItemsBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentItemsBinding inflate = FragmentItemsBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentItemsBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentItemsBinding fragmentItemsBinding) {
        this.binding = fragmentItemsBinding;
    }
}
