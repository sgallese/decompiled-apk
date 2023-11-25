package s4;

import a1.q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc.w;
import j0.n;
import pc.l;
import s4.b;

/* compiled from: SingletonAsyncImage.kt */
/* loaded from: classes.dex */
public final class i {
    public static final void a(Object obj, String str, androidx.compose.ui.e eVar, l<? super b.c, ? extends b.c> lVar, l<? super b.c, w> lVar2, v0.b bVar, n1.f fVar, float f10, q1 q1Var, int i10, j0.l lVar3, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        l<b.c, b.c> lVar4;
        l<? super b.c, w> lVar5;
        v0.b bVar2;
        n1.f fVar2;
        float f11;
        q1 q1Var2;
        int i13;
        lVar3.e(-941517612);
        if ((i12 & 4) != 0) {
            eVar2 = androidx.compose.ui.e.f2335a;
        } else {
            eVar2 = eVar;
        }
        if ((i12 & 8) != 0) {
            lVar4 = b.I.a();
        } else {
            lVar4 = lVar;
        }
        if ((i12 & 16) != 0) {
            lVar5 = null;
        } else {
            lVar5 = lVar2;
        }
        if ((i12 & 32) != 0) {
            bVar2 = v0.b.f24258a.d();
        } else {
            bVar2 = bVar;
        }
        if ((i12 & 64) != 0) {
            fVar2 = n1.f.f19964a.a();
        } else {
            fVar2 = fVar;
        }
        if ((i12 & 128) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            q1Var2 = null;
        } else {
            q1Var2 = q1Var;
        }
        if ((i12 & 512) != 0) {
            i13 = c1.f.f8679g.b();
        } else {
            i13 = i10;
        }
        if (n.K()) {
            n.V(-941517612, i11, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:102)");
        }
        int i14 = i11 << 3;
        a.a(obj, str, g.c(h.a(), lVar3, 6), eVar2, lVar4, lVar5, bVar2, fVar2, f11, q1Var2, i13, lVar3, (i11 & 112) | 520 | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), (i11 >> 27) & 14, 0);
        if (n.K()) {
            n.U();
        }
        lVar3.N();
    }
}
