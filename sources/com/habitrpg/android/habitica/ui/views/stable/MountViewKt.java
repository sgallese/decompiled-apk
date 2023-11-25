package com.habitrpg.android.habitica.ui.views.stable;

import androidx.compose.ui.e;
import com.habitrpg.android.habitica.models.inventory.Mount;
import j0.g2;
import j0.l;
import j0.n;
import qc.q;

/* compiled from: MountView.kt */
/* loaded from: classes4.dex */
public final class MountViewKt {
    public static final void MountView(Mount mount, e eVar, l lVar, int i10, int i11) {
        q.i(mount, "mount");
        l q10 = lVar.q(221920379);
        if ((i11 & 2) != 0) {
            eVar = e.f2335a;
        }
        if (n.K()) {
            n.V(221920379, i10, -1, "com.habitrpg.android.habitica.ui.views.stable.MountView (MountView.kt:40)");
        }
        MountView(mount.getKey(), eVar, q10, i10 & 112, 0);
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 == null) {
            return;
        }
        w10.a(new MountViewKt$MountView$1(mount, eVar, i10, i11));
    }

    public static final void MountView(String str, e eVar, l lVar, int i10, int i11) {
        int i12;
        q.i(str, "mountKey");
        l q10 = lVar.q(-2077246685);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (q10.Q(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= q10.Q(eVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && q10.t()) {
            q10.z();
        } else {
            if (i13 != 0) {
                eVar = e.f2335a;
            }
            if (n.K()) {
                n.V(-2077246685, i12, -1, "com.habitrpg.android.habitica.ui.views.stable.MountView (MountView.kt:45)");
            }
            MountViewKt$MountView$2 mountViewKt$MountView$2 = MountViewKt$MountView$2.INSTANCE;
            q10.e(1157296644);
            boolean Q = q10.Q(str);
            Object f10 = q10.f();
            if (Q || f10 == l.f18688a.a()) {
                f10 = new MountViewKt$MountView$3$1(str);
                q10.J(f10);
            }
            q10.N();
            androidx.compose.ui.viewinterop.e.a(mountViewKt$MountView$2, eVar, (pc.l) f10, q10, (i12 & 112) | 6, 0);
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 == null) {
            return;
        }
        w10.a(new MountViewKt$MountView$4(str, eVar, i10, i11));
    }
}
