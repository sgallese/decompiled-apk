package com.habitrpg.android.habitica.ui.adapter.inventory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.CanHatchItemBinding;
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
import com.habitrpg.android.habitica.ui.viewHolders.PetViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.SectionViewHolder;
import com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.helpers.Animations;
import com.habitrpg.common.habitica.views.PixelArtView;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dc.w;
import ec.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import pc.q;

/* compiled from: PetDetailRecyclerAdapter.kt */
/* loaded from: classes4.dex */
public final class PetDetailRecyclerAdapter extends RecyclerView.h<RecyclerView.f0> {
    public static final int $stable = 8;
    private p<? super Animal, ? super l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>, w> animalIngredientsRetriever;
    private String currentPet;
    private List<? extends Mount> existingMounts;
    private List<? extends Object> itemList = new ArrayList();
    private l<? super String, w> onEquip;
    private q<? super Pet, ? super Food, ? super Continuation<? super FeedResponse>, ? extends Object> onFeed;
    private Map<String, ? extends OwnedItem> ownedItems;
    private Map<String, ? extends OwnedMount> ownedMounts;
    private Map<String, ? extends OwnedPet> ownedPets;
    private boolean ownsSaddles;

    /* compiled from: PetDetailRecyclerAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class CanHatchViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        public static final int $stable = 8;
        private Pet animal;
        private CanHatchItemBinding binding;
        private int eggCount;
        private boolean hasMount;
        private boolean hasUnlockedEgg;
        private boolean hasUnlockedPotion;
        private final p<Animal, l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>, w> ingredientsReceiver;
        private int potionCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CanHatchViewHolder(ViewGroup viewGroup, p<? super Animal, ? super l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>, w> pVar) {
            super(ViewGroupExt.inflate$default(viewGroup, R.layout.can_hatch_item, false, 2, null));
            qc.q.i(viewGroup, "parent");
            this.ingredientsReceiver = pVar;
            CanHatchItemBinding bind = CanHatchItemBinding.bind(this.itemView);
            qc.q.h(bind, "bind(...)");
            this.binding = bind;
            this.itemView.setOnClickListener(this);
        }

        public final void bind(Pet pet, int i10, int i11, boolean z10, boolean z11, boolean z12) {
            qc.q.i(pet, "item");
            this.animal = pet;
            this.eggCount = i10;
            this.potionCount = i11;
            this.hasUnlockedEgg = z10;
            this.hasUnlockedPotion = z11;
            this.hasMount = z12;
            PixelArtView pixelArtView = this.binding.eggView;
            qc.q.h(pixelArtView, "eggView");
            DataBindingUtilsKt.loadImage$default(pixelArtView, "Pet_Egg_" + pet.getAnimal(), null, 2, null);
            PixelArtView pixelArtView2 = this.binding.hatchingPotionView;
            qc.q.h(pixelArtView2, "hatchingPotionView");
            DataBindingUtilsKt.loadImage$default(pixelArtView2, "Pet_HatchingPotion_" + pet.getColor(), null, 2, null);
            PixelArtView pixelArtView3 = this.binding.eggView;
            Animations animations = Animations.INSTANCE;
            pixelArtView3.startAnimation(animations.bobbingAnimation(4.0f));
            this.binding.hatchingPotionView.startAnimation(animations.bobbingAnimation(-4.0f));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p<Animal, l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>, w> pVar;
            Context context = this.itemView.getContext();
            qc.q.f(context);
            PetSuggestHatchDialog petSuggestHatchDialog = new PetSuggestHatchDialog(context);
            Pet pet = this.animal;
            if (pet != null && (pVar = this.ingredientsReceiver) != null) {
                pVar.invoke(pet, new PetDetailRecyclerAdapter$CanHatchViewHolder$onClick$1$1(petSuggestHatchDialog, pet, this));
            }
        }
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

    public final String getCurrentPet() {
        return this.currentPet;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.itemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        int i11;
        OwnedPet ownedPet;
        if (this.itemList.size() <= i10) {
            return 3;
        }
        if (this.itemList.get(i10) instanceof StableSection) {
            return 1;
        }
        Object obj = this.itemList.get(i10);
        qc.q.g(obj, "null cannot be cast to non-null type com.habitrpg.android.habitica.models.inventory.Pet");
        Pet pet = (Pet) obj;
        Map<String, ? extends OwnedPet> map = this.ownedPets;
        if (map != null && (ownedPet = map.get(pet.getKey())) != null) {
            i11 = ownedPet.getTrained();
        } else {
            i11 = 0;
        }
        if (i11 > 0 || eggCount(pet) <= 0 || potionCount(pet) <= 0) {
            return 3;
        }
        return 2;
    }

    public final l<String, w> getOnEquip() {
        return this.onEquip;
    }

    public final q<Pet, Food, Continuation<? super FeedResponse>, Object> getOnFeed() {
        return this.onFeed;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.f0 r18, int r19) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.adapter.inventory.PetDetailRecyclerAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$f0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        qc.q.i(viewGroup, "parent");
        if (i10 != 1) {
            if (i10 != 2) {
                return new PetViewHolder(viewGroup, this.onEquip, this.onFeed, this.animalIngredientsRetriever);
            }
            return new CanHatchViewHolder(viewGroup, this.animalIngredientsRetriever);
        }
        return new SectionViewHolder(viewGroup);
    }

    public final void setAnimalIngredientsRetriever(p<? super Animal, ? super l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>, w> pVar) {
        this.animalIngredientsRetriever = pVar;
    }

    public final void setCurrentPet(String str) {
        this.currentPet = str;
        notifyDataSetChanged();
    }

    public final void setExistingMounts(List<? extends Mount> list) {
        qc.q.i(list, "existingMounts");
        this.existingMounts = list;
    }

    public final void setItemList(List<? extends Object> list) {
        qc.q.i(list, "itemList");
        this.itemList = list;
        notifyDataSetChanged();
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
}
