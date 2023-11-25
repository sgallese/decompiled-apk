package c0;

import a2.l;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import v1.d;

/* compiled from: TextDelegate.kt */
/* loaded from: classes.dex */
public final class e0 {
    public static final int a(float f10) {
        int d10;
        d10 = sc.c.d((float) Math.ceil(f10));
        return d10;
    }

    public static final d0 b(d0 d0Var, v1.d dVar, v1.k0 k0Var, j2.e eVar, l.b bVar, boolean z10, int i10, int i11, int i12, List<d.b<v1.u>> list) {
        qc.q.i(d0Var, "current");
        qc.q.i(dVar, "text");
        qc.q.i(k0Var, "style");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        qc.q.i(list, "placeholders");
        if (qc.q.d(d0Var.k(), dVar) && qc.q.d(d0Var.j(), k0Var)) {
            if (d0Var.i() == z10) {
                if (g2.u.e(d0Var.g(), i10)) {
                    if (d0Var.d() == i11) {
                        if (d0Var.e() == i12 && qc.q.d(d0Var.a(), eVar) && qc.q.d(d0Var.h(), list) && d0Var.b() == bVar) {
                            return d0Var;
                        }
                        return new d0(dVar, k0Var, i11, i12, z10, i10, eVar, bVar, list, null);
                    }
                    return new d0(dVar, k0Var, i11, i12, z10, i10, eVar, bVar, list, null);
                }
                return new d0(dVar, k0Var, i11, i12, z10, i10, eVar, bVar, list, null);
            }
        }
        return new d0(dVar, k0Var, i11, i12, z10, i10, eVar, bVar, list, null);
    }

    public static /* synthetic */ d0 c(d0 d0Var, v1.d dVar, v1.k0 k0Var, j2.e eVar, l.b bVar, boolean z10, int i10, int i11, int i12, List list, int i13, Object obj) {
        boolean z11;
        int i14;
        int i15;
        int i16;
        if ((i13 & 32) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i13 & 64) != 0) {
            i14 = g2.u.f16099a.a();
        } else {
            i14 = i10;
        }
        if ((i13 & 128) != 0) {
            i15 = Integer.MAX_VALUE;
        } else {
            i15 = i11;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            i16 = 1;
        } else {
            i16 = i12;
        }
        return b(d0Var, dVar, k0Var, eVar, bVar, z11, i14, i15, i16, list);
    }
}
