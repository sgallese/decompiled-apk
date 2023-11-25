package com.habitrpg.android.habitica.ui.adapter.inventory;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ShopHeaderBinding;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.inventory.Animal;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.models.inventory.StableSection;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.ui.adapter.inventory.PetDetailRecyclerAdapter;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableFragmentDirections;
import com.habitrpg.android.habitica.ui.viewHolders.MountViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.PetViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.SectionViewHolder;
import com.habitrpg.android.habitica.ui.views.NPCBannerView;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import com.habitrpg.common.habitica.views.PixelArtView;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dc.w;
import ec.n0;
import ec.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import pc.q;

/* compiled from: StableRecyclerAdapter.kt */
/* loaded from: classes4.dex */
public final class StableRecyclerAdapter extends RecyclerView.h<RecyclerView.f0> {
    public static final int $stable = 8;
    private p<? super Animal, ? super l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>, w> animalIngredientsRetriever;
    private String currentMount;
    private String currentPet;
    private Map<String, ? extends Egg> eggs;
    private List<? extends Mount> existingMounts;
    private List<? extends Object> itemList;
    private String itemType;
    private l<? super String, w> onEquip;
    private q<? super Pet, ? super Food, ? super Continuation<? super FeedResponse>, ? extends Object> onFeed;
    private Map<String, ? extends OwnedItem> ownedItems;
    private Map<String, ? extends OwnedMount> ownedMounts;
    private Map<String, ? extends OwnedPet> ownedPets;
    private boolean ownsSaddles;
    private String shopSpriteSuffix;

    /* compiled from: StableRecyclerAdapter.kt */
    /* loaded from: classes4.dex */
    public final class StableHeaderViewHolder extends RecyclerView.f0 {
        private ShopHeaderBinding binding;
        final /* synthetic */ StableRecyclerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StableHeaderViewHolder(StableRecyclerAdapter stableRecyclerAdapter, ViewGroup viewGroup) {
            super(ViewGroupExt.inflate$default(viewGroup, R.layout.shop_header, false, 2, null));
            qc.q.i(viewGroup, "parent");
            this.this$0 = stableRecyclerAdapter;
            ShopHeaderBinding bind = ShopHeaderBinding.bind(this.itemView);
            qc.q.h(bind, "bind(...)");
            this.binding = bind;
            bind.getRoot().setBackgroundColor(androidx.core.content.a.c(this.itemView.getContext(), R.color.window_background));
        }

        public final void bind() {
            NPCBannerView nPCBannerView = this.binding.npcBannerView;
            String shopSpriteSuffix = this.this$0.getShopSpriteSuffix();
            if (shopSpriteSuffix == null) {
                shopSpriteSuffix = "";
            }
            nPCBannerView.setShopSpriteSuffix(shopSpriteSuffix);
            this.binding.npcBannerView.setIdentifier(NavigationDrawerFragment.SIDEBAR_STABLE);
            this.binding.namePlate.setText(R.string.stable_owner);
            this.binding.descriptionView.setVisibility(8);
        }
    }

    /* compiled from: StableRecyclerAdapter.kt */
    /* loaded from: classes4.dex */
    public final class StableViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        private Animal animal;
        private final PixelArtView imageView;
        private final TextView ownedTextView;
        final /* synthetic */ StableRecyclerAdapter this$0;
        private final TextView titleView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StableViewHolder(StableRecyclerAdapter stableRecyclerAdapter, View view) {
            super(view);
            qc.q.i(view, "itemView");
            this.this$0 = stableRecyclerAdapter;
            View findViewById = view.findViewById(R.id.imageView);
            qc.q.h(findViewById, "findViewById(...)");
            this.imageView = (PixelArtView) findViewById;
            View findViewById2 = view.findViewById(R.id.titleTextView);
            qc.q.h(findViewById2, "findViewById(...)");
            this.titleView = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ownedTextView);
            qc.q.h(findViewById3, "findViewById(...)");
            this.ownedTextView = (TextView) findViewById3;
            view.setOnClickListener(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x012f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void bind(com.habitrpg.android.habitica.models.inventory.Animal r10) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.adapter.inventory.StableRecyclerAdapter.StableViewHolder.bind(com.habitrpg.android.habitica.models.inventory.Animal):void");
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            qc.q.i(view, "v");
            Animal animal = this.animal;
            if (animal != null) {
                if (qc.q.d(animal.getType(), "special")) {
                    str = animal.getColor();
                } else {
                    str = null;
                }
                String str2 = "";
                if (qc.q.d(this.this$0.getItemType(), "pets")) {
                    MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
                    String animal2 = animal.getAnimal();
                    String type = animal.getType();
                    if (type != null) {
                        str2 = type;
                    }
                    StableFragmentDirections.OpenPetDetail openPetDetail = StableFragmentDirections.openPetDetail(animal2, str2, str);
                    qc.q.h(openPetDetail, "openPetDetail(...)");
                    mainNavigationController.navigate(openPetDetail);
                    return;
                }
                MainNavigationController mainNavigationController2 = MainNavigationController.INSTANCE;
                String animal3 = animal.getAnimal();
                String type2 = animal.getType();
                if (type2 != null) {
                    str2 = type2;
                }
                StableFragmentDirections.OpenMountDetail openMountDetail = StableFragmentDirections.openMountDetail(animal3, str2, str);
                qc.q.h(openMountDetail, "openMountDetail(...)");
                mainNavigationController2.navigate(openMountDetail);
            }
        }
    }

    public StableRecyclerAdapter() {
        Map<String, ? extends Egg> h10;
        h10 = n0.h();
        this.eggs = h10;
        this.itemList = new ArrayList();
    }

    private final boolean canRaiseToMount(Pet pet) {
        OwnedMount ownedMount;
        boolean z10 = false;
        if (qc.q.d(pet.getType(), "special")) {
            return false;
        }
        List<? extends Mount> list = this.existingMounts;
        if (list == null) {
            list = t.i();
        }
        for (Mount mount : list) {
            if (qc.q.d(mount.getKey(), pet.getKey())) {
                Map<String, ? extends OwnedMount> map = this.ownedMounts;
                if (map != null && (ownedMount = map.get(mount.getKey())) != null) {
                    z10 = ownedMount.getOwned();
                }
                return !z10;
            }
        }
        return false;
    }

    private final int eggCount(Pet pet) {
        Map<String, ? extends OwnedItem> map = this.ownedItems;
        if (map != null) {
            OwnedItem ownedItem = map.get(pet.getAnimal() + "-eggs");
            if (ownedItem != null) {
                return ownedItem.getNumberOwned();
            }
        }
        return 0;
    }

    private final int potionCount(Pet pet) {
        Map<String, ? extends OwnedItem> map = this.ownedItems;
        if (map != null) {
            OwnedItem ownedItem = map.get(pet.getColor() + "-hatchingPotions");
            if (ownedItem != null) {
                return ownedItem.getNumberOwned();
            }
        }
        return 0;
    }

    public final p<Animal, l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>, w> getAnimalIngredientsRetriever() {
        return this.animalIngredientsRetriever;
    }

    public final String getCurrentMount() {
        return this.currentMount;
    }

    public final String getCurrentPet() {
        return this.currentPet;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.itemList.size();
    }

    public final String getItemType() {
        return this.itemType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        int i11 = 0;
        if (this.itemList.size() <= i10) {
            return 0;
        }
        Object obj = this.itemList.get(i10);
        if (qc.q.d(obj, "header")) {
            return 0;
        }
        boolean z10 = true;
        if (obj instanceof StableSection) {
            return 1;
        }
        if (!(obj instanceof Animal)) {
            return 0;
        }
        Animal animal = (Animal) obj;
        if (!qc.q.d(animal.getType(), "special") && !qc.q.d(animal.getType(), "wacky")) {
            z10 = false;
        }
        if (z10) {
            if (obj instanceof Pet) {
                Map<String, ? extends OwnedPet> map = this.ownedPets;
                if (map != null) {
                    String key = animal.getKey();
                    if (key == null) {
                        key = "";
                    }
                    OwnedPet ownedPet = map.get(key);
                    if (ownedPet != null) {
                        i11 = ownedPet.getTrained();
                    }
                }
                if (i11 <= 0) {
                    Pet pet = (Pet) obj;
                    if (eggCount(pet) > 0 && potionCount(pet) > 0) {
                        return 22;
                    }
                }
                return 2;
            }
            return 3;
        } else if (obj instanceof Pet) {
            return 4;
        } else {
            return 5;
        }
    }

    public final l<String, w> getOnEquip() {
        return this.onEquip;
    }

    public final q<Pet, Food, Continuation<? super FeedResponse>, Object> getOnFeed() {
        return this.onFeed;
    }

    public final String getShopSpriteSuffix() {
        return this.shopSpriteSuffix;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0135  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.f0 r20, int r21) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.adapter.inventory.StableRecyclerAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$f0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        qc.q.i(viewGroup, "parent");
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 22) {
                                return new StableHeaderViewHolder(this, viewGroup);
                            }
                            return new PetDetailRecyclerAdapter.CanHatchViewHolder(viewGroup, this.animalIngredientsRetriever);
                        }
                        return new StableViewHolder(this, ViewGroupExt.inflate$default(viewGroup, R.layout.mount_overview_item, false, 2, null));
                    }
                    return new StableViewHolder(this, ViewGroupExt.inflate$default(viewGroup, R.layout.pet_overview_item, false, 2, null));
                }
                return new MountViewHolder(viewGroup, this.onEquip);
            }
            return new PetViewHolder(viewGroup, this.onEquip, this.onFeed, this.animalIngredientsRetriever);
        }
        return new SectionViewHolder(viewGroup);
    }

    public final void setAnimalIngredientsRetriever(p<? super Animal, ? super l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>, w> pVar) {
        this.animalIngredientsRetriever = pVar;
    }

    public final void setCurrentMount(String str) {
        this.currentMount = str;
        notifyDataSetChanged();
    }

    public final void setCurrentPet(String str) {
        this.currentPet = str;
        notifyDataSetChanged();
    }

    public final void setEggs(Map<String, ? extends Egg> map) {
        qc.q.i(map, "eggs");
        this.eggs = map;
        notifyDataSetChanged();
    }

    public final void setExistingMounts(List<? extends Mount> list) {
        qc.q.i(list, "existingMounts");
        this.existingMounts = list;
        notifyDataSetChanged();
    }

    public final void setItemList(List<? extends Object> list) {
        qc.q.i(list, "itemList");
        this.itemList = list;
        notifyDataSetChanged();
    }

    public final void setItemType(String str) {
        this.itemType = str;
    }

    public final void setOnEquip(l<? super String, w> lVar) {
        this.onEquip = lVar;
    }

    public final void setOnFeed(q<? super Pet, ? super Food, ? super Continuation<? super FeedResponse>, ? extends Object> qVar) {
        this.onFeed = qVar;
    }

    public final void setOwnedItems(Map<String, ? extends OwnedItem> map) {
        int i10;
        qc.q.i(map, "ownedItems");
        this.ownedItems = map;
        boolean z10 = false;
        if (map.containsKey("Saddle-food")) {
            OwnedItem ownedItem = map.get("Saddle-food");
            if (ownedItem != null) {
                i10 = ownedItem.getNumberOwned();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                z10 = true;
            }
        }
        this.ownsSaddles = z10;
        notifyDataSetChanged();
    }

    public final void setOwnedMounts(Map<String, ? extends OwnedMount> map) {
        qc.q.i(map, "ownedMounts");
        this.ownedMounts = map;
        notifyDataSetChanged();
    }

    public final void setOwnedPets(Map<String, ? extends OwnedPet> map) {
        qc.q.i(map, "ownedPets");
        this.ownedPets = map;
        notifyDataSetChanged();
    }

    public final void setShopSpriteSuffix(String str) {
        this.shopSpriteSuffix = str;
    }
}
