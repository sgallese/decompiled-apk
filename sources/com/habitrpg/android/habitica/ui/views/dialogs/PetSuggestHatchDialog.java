package com.habitrpg.android.habitica.ui.views.dialogs;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogHatchPetButtonBinding;
import com.habitrpg.android.habitica.databinding.DialogPetSuggestHatchBinding;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.interactors.HatchPetUseCase;
import com.habitrpg.android.habitica.models.inventory.Animal;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import java.util.Locale;
import pc.p;
import qc.d0;
import qc.q;

/* compiled from: PetSuggestHatchDialog.kt */
/* loaded from: classes4.dex */
public final class PetSuggestHatchDialog extends HabiticaAlertDialog {
    public static final int $stable = 8;
    private DialogPetSuggestHatchBinding binding;
    private boolean hasAllItems;
    private final HatchPetUseCase hatchPetUseCase;
    private final MainUserViewModel userViewModel;

    /* compiled from: PetSuggestHatchDialog.kt */
    /* loaded from: classes4.dex */
    public interface PetSuggestHatchDialogEntryPoint {
        MainUserViewModel mainUserViewModel();

        HatchPetUseCase useCase();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetSuggestHatchDialog(Context context) {
        super(context);
        LayoutInflater layoutInflater;
        q.i(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding = null;
        if (systemService instanceof LayoutInflater) {
            layoutInflater = (LayoutInflater) systemService;
        } else {
            layoutInflater = null;
        }
        if (layoutInflater != null) {
            DialogPetSuggestHatchBinding inflate = DialogPetSuggestHatchBinding.inflate(layoutInflater);
            q.h(inflate, "inflate(...)");
            this.binding = inflate;
        }
        DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding2 = this.binding;
        if (dialogPetSuggestHatchBinding2 == null) {
            q.z("binding");
            dialogPetSuggestHatchBinding2 = null;
        }
        setAdditionalContentView(dialogPetSuggestHatchBinding2.getRoot());
        DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding3 = this.binding;
        if (dialogPetSuggestHatchBinding3 == null) {
            q.z("binding");
        } else {
            dialogPetSuggestHatchBinding = dialogPetSuggestHatchBinding3;
        }
        dialogPetSuggestHatchBinding.shimmerView.c();
        PetSuggestHatchDialogEntryPoint petSuggestHatchDialogEntryPoint = (PetSuggestHatchDialogEntryPoint) sa.b.a(context, PetSuggestHatchDialogEntryPoint.class);
        this.hatchPetUseCase = petSuggestHatchDialogEntryPoint.useCase();
        this.userViewModel = petSuggestHatchDialogEntryPoint.mainUserViewModel();
    }

    private final int getItemPrice(Animal animal, Item item, boolean z10) {
        if ((!q.d(animal.getType(), "drop") && (!q.d(animal.getType(), "quest") || !z10)) || item == null) {
            return 0;
        }
        return item.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hatchPet(HatchingPotion hatchingPotion, Egg egg) {
        ExceptionHandlerKt.launchCatching$default(getLongLivingScope(), null, new PetSuggestHatchDialog$hatchPet$1(this, hatchingPotion, egg, null), 1, null);
    }

    public final void configure(Animal animal, Egg egg, HatchingPotion hatchingPotion, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        float f10;
        String animal2;
        boolean z15;
        String valueOf;
        String color;
        boolean z16;
        String valueOf2;
        DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding;
        DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding2;
        q.i(animal, "pet");
        DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding3 = this.binding;
        if (dialogPetSuggestHatchBinding3 == null) {
            q.z("binding");
            dialogPetSuggestHatchBinding3 = null;
        }
        PixelArtView pixelArtView = dialogPetSuggestHatchBinding3.eggView;
        q.h(pixelArtView, "eggView");
        DataBindingUtilsKt.loadImage$default(pixelArtView, "Pet_Egg_" + animal.getAnimal(), null, 2, null);
        DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding4 = this.binding;
        if (dialogPetSuggestHatchBinding4 == null) {
            q.z("binding");
            dialogPetSuggestHatchBinding4 = null;
        }
        PixelArtView pixelArtView2 = dialogPetSuggestHatchBinding4.hatchingPotionView;
        q.h(pixelArtView2, "hatchingPotionView");
        DataBindingUtilsKt.loadImage$default(pixelArtView2, "Pet_HatchingPotion_" + animal.getColor(), null, 2, null);
        DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding5 = this.binding;
        if (dialogPetSuggestHatchBinding5 == null) {
            q.z("binding");
            dialogPetSuggestHatchBinding5 = null;
        }
        dialogPetSuggestHatchBinding5.petTitleView.setText(animal.getText());
        if (i10 > 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i11 > 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding6 = this.binding;
        if (dialogPetSuggestHatchBinding6 == null) {
            q.z("binding");
            dialogPetSuggestHatchBinding6 = null;
        }
        PixelArtView pixelArtView3 = dialogPetSuggestHatchBinding6.eggView;
        float f11 = 1.0f;
        if (z13) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        pixelArtView3.setAlpha(f10);
        DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding7 = this.binding;
        if (dialogPetSuggestHatchBinding7 == null) {
            q.z("binding");
            dialogPetSuggestHatchBinding7 = null;
        }
        PixelArtView pixelArtView4 = dialogPetSuggestHatchBinding7.hatchingPotionView;
        if (!z14) {
            f11 = 0.5f;
        }
        pixelArtView4.setAlpha(f11);
        if (egg == null || (animal2 = egg.getText()) == null) {
            animal2 = animal.getAnimal();
            if (animal2.length() > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                StringBuilder sb2 = new StringBuilder();
                char charAt = animal2.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    Locale locale = Locale.getDefault();
                    q.h(locale, "getDefault(...)");
                    valueOf = yc.b.d(charAt, locale);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                sb2.append((Object) valueOf);
                String substring = animal2.substring(1);
                q.h(substring, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                animal2 = sb2.toString();
            }
        }
        if (hatchingPotion == null || (color = hatchingPotion.getText()) == null) {
            color = animal.getColor();
            if (color.length() > 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                StringBuilder sb3 = new StringBuilder();
                char charAt2 = color.charAt(0);
                if (Character.isLowerCase(charAt2)) {
                    Locale locale2 = Locale.getDefault();
                    q.h(locale2, "getDefault(...)");
                    valueOf2 = yc.b.d(charAt2, locale2);
                } else {
                    valueOf2 = String.valueOf(charAt2);
                }
                sb3.append((Object) valueOf2);
                String substring2 = color.substring(1);
                q.h(substring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                color = sb3.toString();
            }
        }
        if (z13) {
            DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding8 = this.binding;
            if (dialogPetSuggestHatchBinding8 == null) {
                q.z("binding");
                dialogPetSuggestHatchBinding8 = null;
            }
            dialogPetSuggestHatchBinding8.eggCountView.setVisibility(0);
            DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding9 = this.binding;
            if (dialogPetSuggestHatchBinding9 == null) {
                q.z("binding");
                dialogPetSuggestHatchBinding9 = null;
            }
            dialogPetSuggestHatchBinding9.eggCountView.setText(String.valueOf(i10));
        } else {
            DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding10 = this.binding;
            if (dialogPetSuggestHatchBinding10 == null) {
                q.z("binding");
                dialogPetSuggestHatchBinding10 = null;
            }
            dialogPetSuggestHatchBinding10.eggCountView.setVisibility(8);
        }
        if (z14) {
            DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding11 = this.binding;
            if (dialogPetSuggestHatchBinding11 == null) {
                q.z("binding");
                dialogPetSuggestHatchBinding11 = null;
            }
            dialogPetSuggestHatchBinding11.potionCountView.setVisibility(0);
            DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding12 = this.binding;
            if (dialogPetSuggestHatchBinding12 == null) {
                q.z("binding");
                dialogPetSuggestHatchBinding12 = null;
            }
            dialogPetSuggestHatchBinding12.potionCountView.setText(String.valueOf(i11));
        } else {
            DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding13 = this.binding;
            if (dialogPetSuggestHatchBinding13 == null) {
                q.z("binding");
                dialogPetSuggestHatchBinding13 = null;
            }
            dialogPetSuggestHatchBinding13.potionCountView.setVisibility(8);
        }
        if (z13 && z14) {
            DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding14 = this.binding;
            if (dialogPetSuggestHatchBinding14 == null) {
                q.z("binding");
                dialogPetSuggestHatchBinding14 = null;
            }
            dialogPetSuggestHatchBinding14.descriptionView.setText(getContext().getString(R.string.can_hatch_pet, animal2, color));
            HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.hatch, true, false, false, (p) new PetSuggestHatchDialog$configure$1(hatchingPotion, egg, this), 8, (Object) null);
            if (z12) {
                setTitle(R.string.hatch_your_pet);
            } else {
                setTitle(R.string.hatch_pet_title);
            }
            HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.close, false, false, false, (p) null, 28, (Object) null);
            this.hasAllItems = true;
        } else {
            if (z12) {
                if (!z13 && !z14) {
                    DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding15 = this.binding;
                    if (dialogPetSuggestHatchBinding15 == null) {
                        q.z("binding");
                        dialogPetSuggestHatchBinding15 = null;
                    }
                    dialogPetSuggestHatchBinding15.descriptionView.setText(getContext().getString(R.string.suggest_pet_hatch_again_missing_both, animal2, color));
                } else if (!z13) {
                    DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding16 = this.binding;
                    if (dialogPetSuggestHatchBinding16 == null) {
                        q.z("binding");
                        dialogPetSuggestHatchBinding2 = null;
                    } else {
                        dialogPetSuggestHatchBinding2 = dialogPetSuggestHatchBinding16;
                    }
                    dialogPetSuggestHatchBinding2.descriptionView.setText(getContext().getString(R.string.suggest_pet_hatch_again_missing_egg, animal2));
                } else {
                    DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding17 = this.binding;
                    if (dialogPetSuggestHatchBinding17 == null) {
                        q.z("binding");
                        dialogPetSuggestHatchBinding17 = null;
                    }
                    dialogPetSuggestHatchBinding17.descriptionView.setText(getContext().getString(R.string.suggest_pet_hatch_again_missing_potion, color));
                }
            } else if (!z13 && !z14) {
                DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding18 = this.binding;
                if (dialogPetSuggestHatchBinding18 == null) {
                    q.z("binding");
                    dialogPetSuggestHatchBinding18 = null;
                }
                dialogPetSuggestHatchBinding18.descriptionView.setText(getContext().getString(R.string.suggest_pet_hatch_missing_both, animal2, color));
            } else if (!z13) {
                DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding19 = this.binding;
                if (dialogPetSuggestHatchBinding19 == null) {
                    q.z("binding");
                    dialogPetSuggestHatchBinding = null;
                } else {
                    dialogPetSuggestHatchBinding = dialogPetSuggestHatchBinding19;
                }
                dialogPetSuggestHatchBinding.descriptionView.setText(getContext().getString(R.string.suggest_pet_hatch_missing_egg, animal2));
            } else {
                DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding20 = this.binding;
                if (dialogPetSuggestHatchBinding20 == null) {
                    q.z("binding");
                    dialogPetSuggestHatchBinding20 = null;
                }
                dialogPetSuggestHatchBinding20.descriptionView.setText(getContext().getString(R.string.suggest_pet_hatch_missing_potion, color));
            }
            d0 d0Var = new d0();
            if (!z13) {
                d0Var.f21667f += getItemPrice(animal, egg, z10);
            }
            if (!z14) {
                d0Var.f21667f += getItemPrice(animal, hatchingPotion, z11);
            }
            if (d0Var.f21667f > 0) {
                DialogHatchPetButtonBinding inflate = DialogHatchPetButtonBinding.inflate(getLayoutInflater());
                q.h(inflate, "inflate(...)");
                inflate.currencyView.setValue(d0Var.f21667f);
                inflate.currencyView.setCurrency(NavigationDrawerFragment.SIDEBAR_GEMS);
                inflate.currencyView.setTextColor(androidx.core.content.a.c(getContext(), R.color.white));
                LinearLayout root = inflate.getRoot();
                q.h(root, "getRoot(...)");
                addButton(root, true, new PetSuggestHatchDialog$configure$2(this, d0Var, hatchingPotion, egg, z13, z14));
            }
            HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.close, false, false, false, (p) null, 28, (Object) null);
            setTitle(R.string.unhatched_pet);
        }
        String str = "stable_Pet-" + animal.getAnimal() + "-" + animal.getColor();
        DataBindingUtils dataBindingUtils = DataBindingUtils.INSTANCE;
        Context context = getContext();
        q.h(context, "getContext(...)");
        dataBindingUtils.loadImage(context, str, new PetSuggestHatchDialog$configure$3(this, z12));
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (!this.hasAllItems) {
            Analytics.INSTANCE.sendNavigationEvent("pet suggestion modal");
        }
    }
}
