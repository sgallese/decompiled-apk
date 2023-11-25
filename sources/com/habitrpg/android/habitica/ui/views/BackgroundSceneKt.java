package com.habitrpg.android.habitica.ui.views;

import a1.t3;
import com.habitrpg.android.habitica.R;
import j0.g2;
import j0.n;
import java.util.Calendar;

/* compiled from: BackgroundScene.kt */
/* loaded from: classes4.dex */
public final class BackgroundSceneKt {
    public static final void BackgroundScene(androidx.compose.ui.e eVar, j0.l lVar, int i10, int i11) {
        int i12;
        int i13;
        j0.l q10 = lVar.q(-1421725263);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (q10.Q(eVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && q10.t()) {
            q10.z();
        } else {
            if (i14 != 0) {
                eVar = androidx.compose.ui.e.f2335a;
            }
            if (n.K()) {
                n.V(-1421725263, i12, -1, "com.habitrpg.android.habitica.ui.views.BackgroundScene (BackgroundScene.kt:46)");
            }
            t.i.a(v0.k.a(androidx.compose.foundation.layout.m.h(androidx.compose.foundation.layout.m.i(eVar, j2.h.j(124)), 0.0f, 1, null), 1.0f), new BackgroundSceneKt$BackgroundScene$1(getBackgroundPainter(q10, 0)), q10, 0);
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new BackgroundSceneKt$BackgroundScene$2(eVar, i10, i11));
        }
    }

    private static final t3 getBackgroundPainter(j0.l lVar, int i10) {
        lVar.e(1152340379);
        if (n.K()) {
            n.V(1152340379, i10, -1, "com.habitrpg.android.habitica.ui.views.getBackgroundPainter (BackgroundScene.kt:23)");
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
        t3 a10 = s1.d.a(aVar, i12, lVar, 8);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return a10;
    }
}
