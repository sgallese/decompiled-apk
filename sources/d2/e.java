package d2;

import a2.l;
import java.util.List;
import v1.b0;
import v1.d;
import v1.k0;
import v1.w;
import v1.z;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
/* loaded from: classes.dex */
public final class e {
    public static final v1.p a(String str, k0 k0Var, List<d.b<b0>> list, List<d.b<v1.u>> list2, j2.e eVar, l.b bVar) {
        qc.q.i(str, "text");
        qc.q.i(k0Var, "style");
        qc.q.i(list, "spanStyles");
        qc.q.i(list2, "placeholders");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        return new d(str, k0Var, list, list2, bVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(k0 k0Var) {
        v1.g gVar;
        boolean f10;
        w a10;
        z w10 = k0Var.w();
        if (w10 != null && (a10 = w10.a()) != null) {
            gVar = v1.g.c(a10.b());
        } else {
            gVar = null;
        }
        int b10 = v1.g.f24444b.b();
        if (gVar == null) {
            f10 = false;
        } else {
            f10 = v1.g.f(gVar.i(), b10);
        }
        return !f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r6 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(g2.l r6, c2.i r7) {
        /*
            if (r6 == 0) goto L7
            int r6 = r6.l()
            goto Ld
        L7:
            g2.l$a r6 = g2.l.f16070b
            int r6 = r6.a()
        Ld:
            g2.l$a r0 = g2.l.f16070b
            int r1 = r0.b()
            boolean r1 = g2.l.i(r6, r1)
            r2 = 2
            if (r1 == 0) goto L1b
            goto L6f
        L1b:
            int r1 = r0.c()
            boolean r1 = g2.l.i(r6, r1)
            r3 = 3
            if (r1 == 0) goto L28
        L26:
            r2 = 3
            goto L6f
        L28:
            int r1 = r0.d()
            boolean r1 = g2.l.i(r6, r1)
            r4 = 0
            if (r1 == 0) goto L35
            r2 = 0
            goto L6f
        L35:
            int r1 = r0.e()
            boolean r1 = g2.l.i(r6, r1)
            r5 = 1
            if (r1 == 0) goto L42
            r2 = 1
            goto L6f
        L42:
            int r0 = r0.a()
            boolean r6 = g2.l.i(r6, r0)
            if (r6 == 0) goto L70
            if (r7 == 0) goto L63
            c2.h r6 = r7.e(r4)
            c2.j r6 = r6.a()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            qc.q.g(r6, r7)
            c2.a r6 = (c2.a) r6
            java.util.Locale r6 = r6.b()
            if (r6 != 0) goto L67
        L63:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L67:
            int r6 = androidx.core.text.w.a(r6)
            if (r6 == 0) goto L6f
            if (r6 == r5) goto L26
        L6f:
            return r2
        L70:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.e.d(g2.l, c2.i):int");
    }
}
