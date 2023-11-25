package com.habitrpg.android.habitica.ui.viewHolders;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.PetDetailItemBinding;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.inventory.Animal;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt;
import com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import pc.q;
import yc.v;

/* compiled from: PetViewHolder.kt */
/* loaded from: classes4.dex */
public final class PetViewHolder extends RecyclerView.f0 implements View.OnClickListener {
    public static final int $stable = 8;
    private Pet animal;
    private PetDetailItemBinding binding;
    private boolean canRaiseToMount;
    private String currentPet;
    private int eggCount;
    private boolean hasMount;
    private boolean hasUnlockedEgg;
    private boolean hasUnlockedPotion;
    private final p<Animal, pc.l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>, w> ingredientsReceiver;
    private boolean isOwned;
    private final pc.l<String, w> onEquip;
    private final q<Pet, Food, Continuation<? super FeedResponse>, Object> onFeed;
    private boolean ownsSaddles;
    private int potionCount;
    private int trained;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PetViewHolder(ViewGroup viewGroup, pc.l<? super String, w> lVar, q<? super Pet, ? super Food, ? super Continuation<? super FeedResponse>, ? extends Object> qVar, p<? super Animal, ? super pc.l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>, w> pVar) {
        super(ViewGroupExt.inflate$default(viewGroup, R.layout.pet_detail_item, false, 2, null));
        qc.q.i(viewGroup, "parent");
        this.onEquip = lVar;
        this.onFeed = qVar;
        this.ingredientsReceiver = pVar;
        PetDetailItemBinding bind = PetDetailItemBinding.bind(this.itemView);
        qc.q.h(bind, "bind(...)");
        this.binding = bind;
        this.itemView.setOnClickListener(this);
    }

    private final void showRequirementsDialog() {
        p<Animal, pc.l<? super dc.l<? extends Egg, ? extends HatchingPotion>, w>, w> pVar;
        Context context = this.itemView.getContext();
        qc.q.f(context);
        PetSuggestHatchDialog petSuggestHatchDialog = new PetSuggestHatchDialog(context);
        Pet pet = this.animal;
        if (pet != null && (pVar = this.ingredientsReceiver) != null) {
            pVar.invoke(pet, new PetViewHolder$showRequirementsDialog$1$1(petSuggestHatchDialog, pet, this));
        }
    }

    public final void bind(Pet pet, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str) {
        boolean z15;
        String str2;
        boolean s10;
        qc.q.i(pet, "item");
        this.animal = pet;
        this.trained = i10;
        int i13 = 0;
        if (i10 > 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.isOwned = z15;
        this.binding.imageView.setAlpha(1.0f);
        this.canRaiseToMount = z10;
        this.eggCount = i11;
        this.potionCount = i12;
        this.ownsSaddles = z11;
        this.hasUnlockedEgg = z12;
        this.hasUnlockedPotion = z13;
        this.hasMount = z14;
        this.currentPet = str;
        this.binding.imageView.setVisibility(0);
        this.binding.itemWrapper.setVisibility(8);
        this.binding.checkmarkView.setVisibility(8);
        this.binding.titleTextView.setVisibility(8);
        this.binding.getRoot().setContentDescription(pet.getText());
        String str3 = "stable_Pet-" + pet.getAnimal() + "-" + pet.getColor();
        if (i10 > 0) {
            if (this.canRaiseToMount) {
                this.binding.trainedProgressBar.setVisibility(0);
                this.binding.trainedProgressBar.setProgress(i10);
            } else {
                this.binding.trainedProgressBar.setVisibility(8);
            }
        } else {
            this.binding.trainedProgressBar.setVisibility(8);
            this.binding.imageView.setAlpha(0.2f);
        }
        if (Build.VERSION.SDK_INT > 22) {
            this.binding.trainedProgressBar.setProgressBackgroundTintMode(PorterDuff.Mode.SRC_OVER);
        }
        this.binding.imageView.setBackground(null);
        ImageView imageView = this.binding.activeIndicator;
        Pet pet2 = this.animal;
        if (pet2 != null) {
            str2 = pet2.getKey();
        } else {
            str2 = null;
        }
        s10 = v.s(str, str2, false, 2, null);
        if (!s10) {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        this.binding.imageView.setTag(str3);
        DataBindingUtils dataBindingUtils = DataBindingUtils.INSTANCE;
        Context context = this.itemView.getContext();
        qc.q.h(context, "getContext(...)");
        dataBindingUtils.loadImage(context, str3, new PetViewHolder$bind$1(this, i10, z10, str3));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        qc.q.i(view, "v");
        if (!this.isOwned) {
            showRequirementsDialog();
            return;
        }
        Context context = this.itemView.getContext();
        Pet pet = this.animal;
        if (pet != null) {
            if (context instanceof ViewComponentManager$FragmentContextWrapper) {
                context = ((ViewComponentManager$FragmentContextWrapper) context).getBaseContext();
            }
            qc.q.g(context, "null cannot be cast to non-null type android.app.Activity");
            BottomSheetUtilsKt.showAsBottomSheet((Activity) context, q0.c.c(1470656500, true, new PetViewHolder$onClick$1$1(pet, this)));
        }
    }
}
