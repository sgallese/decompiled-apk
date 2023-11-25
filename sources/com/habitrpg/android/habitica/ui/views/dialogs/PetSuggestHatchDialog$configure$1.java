package com.habitrpg.android.habitica.ui.views.dialogs;

import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PetSuggestHatchDialog.kt */
/* loaded from: classes4.dex */
public final class PetSuggestHatchDialog$configure$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ Egg $egg;
    final /* synthetic */ HatchingPotion $potion;
    final /* synthetic */ PetSuggestHatchDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetSuggestHatchDialog$configure$1(HatchingPotion hatchingPotion, Egg egg, PetSuggestHatchDialog petSuggestHatchDialog) {
        super(2);
        this.$potion = hatchingPotion;
        this.$egg = egg;
        this.this$0 = petSuggestHatchDialog;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        Egg egg;
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        HatchingPotion hatchingPotion = this.$potion;
        if (hatchingPotion == null || (egg = this.$egg) == null) {
            return;
        }
        this.this$0.hatchPet(hatchingPotion, egg);
    }
}
