package v1;

import a1.e1;
import a1.h1;
import a1.o4;
import a1.p1;

/* compiled from: Paragraph.android.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class l {
    public static /* synthetic */ void a(m mVar, h1 h1Var, long j10, o4 o4Var, g2.k kVar, c1.g gVar, int i10, int i11, Object obj) {
        long j11;
        o4 o4Var2;
        g2.k kVar2;
        int i12;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                j11 = p1.f146b.e();
            } else {
                j11 = j10;
            }
            c1.g gVar2 = null;
            if ((i11 & 4) != 0) {
                o4Var2 = null;
            } else {
                o4Var2 = o4Var;
            }
            if ((i11 & 8) != 0) {
                kVar2 = null;
            } else {
                kVar2 = kVar;
            }
            if ((i11 & 16) == 0) {
                gVar2 = gVar;
            }
            if ((i11 & 32) != 0) {
                i12 = c1.f.f8679g.a();
            } else {
                i12 = i10;
            }
            mVar.s(h1Var, j11, o4Var2, kVar2, gVar2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
    }

    public static /* synthetic */ void b(m mVar, h1 h1Var, e1 e1Var, float f10, o4 o4Var, g2.k kVar, c1.g gVar, int i10, int i11, Object obj) {
        float f11;
        o4 o4Var2;
        g2.k kVar2;
        c1.g gVar2;
        int i12;
        if (obj == null) {
            if ((i11 & 4) != 0) {
                f11 = Float.NaN;
            } else {
                f11 = f10;
            }
            if ((i11 & 8) != 0) {
                o4Var2 = null;
            } else {
                o4Var2 = o4Var;
            }
            if ((i11 & 16) != 0) {
                kVar2 = null;
            } else {
                kVar2 = kVar;
            }
            if ((i11 & 32) != 0) {
                gVar2 = null;
            } else {
                gVar2 = gVar;
            }
            if ((i11 & 64) != 0) {
                i12 = c1.f.f8679g.a();
            } else {
                i12 = i10;
            }
            mVar.b(h1Var, e1Var, f11, o4Var2, kVar2, gVar2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
    }
}
