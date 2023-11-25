package com.habitrpg.android.habitica.ui.views.stable;

import androidx.compose.ui.e;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dc.w;
import j0.l;
import j0.z1;
import kotlin.coroutines.Continuation;
import pc.a;
import pc.p;
import pc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PetBottomSheet.kt */
/* loaded from: classes4.dex */
public final class PetBottomSheetKt$PetBottomSheet$3 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $canRaiseToMount;
    final /* synthetic */ boolean $isCurrentPet;
    final /* synthetic */ e $modifier;
    final /* synthetic */ a<w> $onDismiss;
    final /* synthetic */ pc.l<String, w> $onEquip;
    final /* synthetic */ q<Pet, Food, Continuation<? super FeedResponse>, Object> $onFeed;
    final /* synthetic */ boolean $ownsSaddles;
    final /* synthetic */ Pet $pet;
    final /* synthetic */ int $trained;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PetBottomSheetKt$PetBottomSheet$3(Pet pet, int i10, boolean z10, boolean z11, boolean z12, pc.l<? super String, w> lVar, q<? super Pet, ? super Food, ? super Continuation<? super FeedResponse>, ? extends Object> qVar, a<w> aVar, e eVar, int i11, int i12) {
        super(2);
        this.$pet = pet;
        this.$trained = i10;
        this.$isCurrentPet = z10;
        this.$canRaiseToMount = z11;
        this.$ownsSaddles = z12;
        this.$onEquip = lVar;
        this.$onFeed = qVar;
        this.$onDismiss = aVar;
        this.$modifier = eVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        PetBottomSheetKt.PetBottomSheet(this.$pet, this.$trained, this.$isCurrentPet, this.$canRaiseToMount, this.$ownsSaddles, this.$onEquip, this.$onFeed, this.$onDismiss, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
