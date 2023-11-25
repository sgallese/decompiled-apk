package com.habitrpg.android.habitica.ui.views.stable;

import a1.t3;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.inventory.Pet;
import ec.t;
import j0.g3;
import j0.j1;
import j0.l;
import j0.n;
import java.util.List;
import qc.q;
import s1.d;

/* compiled from: PetBottomSheet.kt */
/* loaded from: classes4.dex */
public final class PetBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x07b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PetBottomSheet(com.habitrpg.android.habitica.models.inventory.Pet r60, int r61, boolean r62, boolean r63, boolean r64, pc.l<? super java.lang.String, dc.w> r65, pc.q<? super com.habitrpg.android.habitica.models.inventory.Pet, ? super com.habitrpg.android.habitica.models.inventory.Food, ? super kotlin.coroutines.Continuation<? super com.habitrpg.shared.habitica.models.responses.FeedResponse>, ? extends java.lang.Object> r66, pc.a<dc.w> r67, androidx.compose.ui.e r68, j0.l r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 2003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt.PetBottomSheet(com.habitrpg.android.habitica.models.inventory.Pet, int, boolean, boolean, boolean, pc.l, pc.q, pc.a, androidx.compose.ui.e, j0.l, int, int):void");
    }

    private static final boolean PetBottomSheet$lambda$10(j1<Boolean> j1Var) {
        return j1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PetBottomSheet$lambda$11(j1<Boolean> j1Var, boolean z10) {
        j1Var.setValue(Boolean.valueOf(z10));
    }

    private static final float PetBottomSheet$lambda$18$lambda$16$lambda$15(g3<Float> g3Var) {
        return g3Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PetBottomSheet$lambda$7(j1<String> j1Var) {
        return j1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t3 getFoodPainter(String str, l lVar, int i10) {
        lVar.e(1643374870);
        if (n.K()) {
            n.V(1643374870, i10, -1, "com.habitrpg.android.habitica.ui.views.stable.getFoodPainter (PetBottomSheet.kt:84)");
        }
        t3.a aVar = t3.f191a;
        int hashCode = str.hashCode();
        int i11 = R.drawable.feed_base;
        switch (hashCode) {
            case -1612488122:
                if (str.equals("Zombie")) {
                    i11 = R.drawable.feed_zombie;
                    break;
                }
                break;
            case 82033:
                if (str.equals("Red")) {
                    i11 = R.drawable.feed_red;
                    break;
                }
                break;
            case 2063089:
                str.equals("Base");
                break;
            case 79846925:
                if (str.equals("Shade")) {
                    i11 = R.drawable.feed_shade;
                    break;
                }
                break;
            case 83549193:
                if (str.equals("White")) {
                    i11 = R.drawable.feed_white;
                    break;
                }
                break;
            case 549657524:
                if (str.equals("CottonCandyBlue")) {
                    i11 = R.drawable.feed_blue;
                    break;
                }
                break;
            case 550071504:
                if (str.equals("CottonCandyPink")) {
                    i11 = R.drawable.feed_pink;
                    break;
                }
                break;
            case 2043584565:
                if (str.equals("Desert")) {
                    i11 = R.drawable.feed_desert;
                    break;
                }
                break;
            case 2092391533:
                if (str.equals("Skeleton")) {
                    i11 = R.drawable.feed_skeleton;
                    break;
                }
                break;
            case 2138497321:
                if (str.equals("Golden")) {
                    i11 = R.drawable.feed_golden;
                    break;
                }
                break;
        }
        t3 a10 = d.a(aVar, i11, lVar, 8);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return a10;
    }

    public static final boolean isAnimalFlying(Pet pet) {
        List l10;
        List l11;
        q.i(pet, "pet");
        l10 = t.l("FlyingPig", "Bee");
        if (!l10.contains(pet.getAnimal())) {
            l11 = t.l("Ghost", "Cupid", "Fairy", "SolarSystem", "Vampire");
            return l11.contains(pet.getColor());
        }
        return true;
    }
}
