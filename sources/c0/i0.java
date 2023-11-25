package c0;

import a2.l;
import java.util.List;

/* compiled from: TextFieldDelegate.kt */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f8445a;

    static {
        String x10;
        x10 = yc.v.x("H", 10);
        f8445a = x10;
    }

    public static final long a(v1.k0 k0Var, j2.e eVar, l.b bVar, String str, int i10) {
        List i11;
        qc.q.i(k0Var, "style");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        qc.q.i(str, "text");
        i11 = ec.t.i();
        v1.m b10 = v1.r.b(str, k0Var, j2.c.b(0, 0, 0, 0, 15, null), eVar, bVar, i11, null, i10, false, 64, null);
        return j2.q.a(e0.a(b10.a()), e0.a(b10.getHeight()));
    }

    public static /* synthetic */ long b(v1.k0 k0Var, j2.e eVar, l.b bVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = f8445a;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return a(k0Var, eVar, bVar, str, i10);
    }

    public static final String c() {
        return f8445a;
    }
}
