package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.ContentGear;
import com.habitrpg.android.habitica.models.ContentResult;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import dc.w;
import io.realm.o0;
import io.realm.x0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmContentLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmContentLocalRepository$saveContent$1 extends r implements l<o0, w> {
    final /* synthetic */ ContentResult $contentResult;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmContentLocalRepository$saveContent$1(ContentResult contentResult) {
        super(1);
        this.$contentResult = contentResult;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        x0<Equipment> flat;
        q.i(o0Var, "realm1");
        Equipment potion = this.$contentResult.getPotion();
        if (potion != null) {
            o0Var.g1(potion);
        }
        Equipment armoire = this.$contentResult.getArmoire();
        if (armoire != null) {
            o0Var.g1(armoire);
        }
        ContentGear gear = this.$contentResult.getGear();
        if (gear != null && (flat = gear.getFlat()) != null) {
            o0Var.h1(flat);
        }
        o0Var.h1(this.$contentResult.getQuests());
        o0Var.h1(this.$contentResult.getEggs());
        o0Var.h1(this.$contentResult.getFood());
        o0Var.h1(this.$contentResult.getHatchingPotions());
        o0Var.h1(this.$contentResult.getSpecial());
        o0Var.h1(this.$contentResult.getPets());
        o0Var.h1(this.$contentResult.getMounts());
        o0Var.h1(this.$contentResult.getSpells());
        o0Var.h1(this.$contentResult.getSpecial());
        o0Var.h1(this.$contentResult.getAppearances());
        o0Var.h1(this.$contentResult.getBackgrounds());
        o0Var.h1(this.$contentResult.getFaq());
    }
}
