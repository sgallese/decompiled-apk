package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.models.inventory.StableSection;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StableViewModel.kt */
/* loaded from: classes4.dex */
public final class StableViewModel$mapAnimals$2 extends r implements l<Object, Boolean> {
    public static final StableViewModel$mapAnimals$2 INSTANCE = new StableViewModel$mapAnimals$2();

    StableViewModel$mapAnimals$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.l
    public final Boolean invoke(Object obj) {
        boolean z10;
        q.i(obj, "it");
        if (obj instanceof StableSection) {
            StableSection stableSection = (StableSection) obj;
            if (q.d(stableSection.getKey(), "special") && stableSection.getOwnedCount() == 0) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
