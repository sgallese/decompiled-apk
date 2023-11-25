package com.habitrpg.android.habitica.ui.views;

import a1.t3;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.g2;
import j0.n;
import qc.q;

/* compiled from: PixelArtView.kt */
/* loaded from: classes4.dex */
public final class PixelArtViewKt {
    public static final void PixelArtView(String str, androidx.compose.ui.e eVar, String str2, j0.l lVar, int i10, int i11) {
        int i12;
        j0.l q10 = lVar.q(263627785);
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
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= q10.Q(str2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : 128;
        }
        if ((i12 & 731) == 146 && q10.t()) {
            q10.z();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f2335a;
            }
            if (i14 != 0) {
                str2 = null;
            }
            if (n.K()) {
                n.V(263627785, i12, -1, "com.habitrpg.android.habitica.ui.views.PixelArtView (PixelArtView.kt:16)");
            }
            PixelArtViewKt$PixelArtView$1 pixelArtViewKt$PixelArtView$1 = PixelArtViewKt$PixelArtView$1.INSTANCE;
            q10.e(511388516);
            boolean Q = q10.Q(str) | q10.Q(str2);
            Object f10 = q10.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = new PixelArtViewKt$PixelArtView$2$1(str, str2);
                q10.J(f10);
            }
            q10.N();
            androidx.compose.ui.viewinterop.e.a(pixelArtViewKt$PixelArtView$1, eVar, (pc.l) f10, q10, (i12 & 112) | 6, 0);
            if (n.K()) {
                n.U();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        String str3 = str2;
        g2 w10 = q10.w();
        if (w10 == null) {
            return;
        }
        w10.a(new PixelArtViewKt$PixelArtView$3(str, eVar2, str3, i10, i11));
    }

    public static final void PixelArtView(t3 t3Var, androidx.compose.ui.e eVar, j0.l lVar, int i10, int i11) {
        q.i(t3Var, "bitmap");
        j0.l q10 = lVar.q(613809083);
        if ((i11 & 2) != 0) {
            eVar = androidx.compose.ui.e.f2335a;
        }
        if (n.K()) {
            n.V(613809083, i10, -1, "com.habitrpg.android.habitica.ui.views.PixelArtView (PixelArtView.kt:36)");
        }
        androidx.compose.ui.viewinterop.e.a(PixelArtViewKt$PixelArtView$4.INSTANCE, eVar, new PixelArtViewKt$PixelArtView$5(t3Var), q10, (i10 & 112) | 6, 0);
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 == null) {
            return;
        }
        w10.a(new PixelArtViewKt$PixelArtView$6(t3Var, eVar, i10, i11));
    }
}
