package f6;

import android.content.Context;
import f0.h1;
import j2.e;
import j2.r;

/* compiled from: MdcTheme.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static final h1 f15453a = new h1(null, null, null, 7, null);

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f6.c a(android.content.Context r36, j2.r r37, j2.e r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.a.a(android.content.Context, j2.r, j2.e, boolean, boolean, boolean, boolean, boolean):f6.c");
    }

    public static /* synthetic */ c b(Context context, r rVar, e eVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
        e eVar2;
        boolean z15;
        boolean z16;
        boolean z17;
        if ((i10 & 4) != 0) {
            eVar2 = j2.a.a(context);
        } else {
            eVar2 = eVar;
        }
        boolean z18 = true;
        if ((i10 & 8) != 0) {
            z15 = true;
        } else {
            z15 = z10;
        }
        if ((i10 & 16) != 0) {
            z16 = true;
        } else {
            z16 = z11;
        }
        if ((i10 & 32) == 0) {
            z18 = z12;
        }
        boolean z19 = false;
        if ((i10 & 64) != 0) {
            z17 = false;
        } else {
            z17 = z13;
        }
        if ((i10 & 128) == 0) {
            z19 = z14;
        }
        return a(context, rVar, eVar2, z15, z16, z18, z17, z19);
    }
}
