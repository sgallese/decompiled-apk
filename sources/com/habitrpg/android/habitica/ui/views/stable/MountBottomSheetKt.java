package com.habitrpg.android.habitica.ui.views.stable;

import a1.t3;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.inventory.Animal;
import ec.t;
import j0.g3;
import j0.l;
import j0.n;
import java.util.Calendar;
import java.util.List;
import qc.q;
import s1.d;

/* compiled from: MountBottomSheet.kt */
/* loaded from: classes4.dex */
public final class MountBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MountBottomSheet(com.habitrpg.android.habitica.models.inventory.Mount r47, boolean r48, pc.l<? super java.lang.String, dc.w> r49, pc.a<dc.w> r50, androidx.compose.ui.e r51, j0.l r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.stable.MountBottomSheetKt.MountBottomSheet(com.habitrpg.android.habitica.models.inventory.Mount, boolean, pc.l, pc.a, androidx.compose.ui.e, j0.l, int, int):void");
    }

    private static final float MountBottomSheet$lambda$3$lambda$2$lambda$1(g3<Float> g3Var) {
        return g3Var.getValue().floatValue();
    }

    private static final t3 getBackgroundPainter(l lVar, int i10) {
        lVar.e(1319313873);
        if (n.K()) {
            n.V(1319313873, i10, -1, "com.habitrpg.android.habitica.ui.views.stable.getBackgroundPainter (MountBottomSheet.kt:60)");
        }
        int i11 = Calendar.getInstance().get(2);
        t3.a aVar = t3.f191a;
        int i12 = R.drawable.stable_tile_may;
        switch (i11) {
            case 0:
                i12 = R.drawable.stable_tile_janurary;
                break;
            case 1:
                i12 = R.drawable.stable_tile_february;
                break;
            case 2:
                i12 = R.drawable.stable_tile_march;
                break;
            case 3:
                i12 = R.drawable.stable_tile_april;
                break;
            case 5:
                i12 = R.drawable.stable_tile_june;
                break;
            case 6:
                i12 = R.drawable.stable_tile_july;
                break;
            case 7:
                i12 = R.drawable.stable_tile_august;
                break;
            case 8:
                i12 = R.drawable.stable_tile_september;
                break;
            case 9:
                i12 = R.drawable.stable_tile_october;
                break;
            case 10:
                i12 = R.drawable.stable_tile_november;
                break;
            case 11:
                i12 = R.drawable.stable_tile_december;
                break;
        }
        t3 a10 = d.a(aVar, i12, lVar, 8);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return a10;
    }

    public static final boolean isAnimalFlying(Animal animal) {
        List l10;
        List l11;
        q.i(animal, "animal");
        l10 = t.l("FlyingPig", "Bee");
        if (!l10.contains(animal.getAnimal())) {
            l11 = t.l("Ghost", "Cupid", "Fairy", "SolarSystem", "Vampire");
            return l11.contains(animal.getColor());
        }
        return true;
    }
}
