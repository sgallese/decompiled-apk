package v1;

import a2.l;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import v1.d;

/* compiled from: Paragraph.kt */
/* loaded from: classes.dex */
public final class r {
    public static final m a(String str, k0 k0Var, long j10, j2.e eVar, l.b bVar, List<d.b<b0>> list, List<d.b<u>> list2, int i10, boolean z10) {
        qc.q.i(str, "text");
        qc.q.i(k0Var, "style");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        qc.q.i(list, "spanStyles");
        qc.q.i(list2, "placeholders");
        return d2.f.b(str, k0Var, list, list2, i10, z10, j10, eVar, bVar);
    }

    public static /* synthetic */ m b(String str, k0 k0Var, long j10, j2.e eVar, l.b bVar, List list, List list2, int i10, boolean z10, int i11, Object obj) {
        List list3;
        List list4;
        int i12;
        boolean z11;
        List i13;
        List i14;
        if ((i11 & 32) != 0) {
            i14 = ec.t.i();
            list3 = i14;
        } else {
            list3 = list;
        }
        if ((i11 & 64) != 0) {
            i13 = ec.t.i();
            list4 = i13;
        } else {
            list4 = list2;
        }
        if ((i11 & 128) != 0) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = i10;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        return a(str, k0Var, j10, eVar, bVar, list3, list4, i12, z11);
    }

    public static final m c(p pVar, long j10, int i10, boolean z10) {
        qc.q.i(pVar, "paragraphIntrinsics");
        return d2.f.a(pVar, i10, z10, j10);
    }

    public static final int d(float f10) {
        return (int) Math.ceil(f10);
    }
}
