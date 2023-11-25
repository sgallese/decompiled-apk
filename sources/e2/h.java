package e2;

import a2.c0;
import a2.l;
import a2.x;
import a2.y;
import android.graphics.Typeface;
import android.os.Build;
import g2.p;
import g2.t;
import j2.s;
import j2.u;
import pc.r;
import qc.q;
import v1.b0;

/* compiled from: TextPaintExtensions.android.kt */
/* loaded from: classes.dex */
public final class h {
    public static final b0 a(d2.i iVar, b0 b0Var, r<? super l, ? super c0, ? super x, ? super y, ? extends Typeface> rVar, j2.e eVar, boolean z10) {
        boolean z11;
        c2.h e10;
        int b10;
        int a10;
        q.i(iVar, "<this>");
        q.i(b0Var, "style");
        q.i(rVar, "resolveTypeface");
        q.i(eVar, "density");
        long g10 = s.g(b0Var.k());
        u.a aVar = u.f19008b;
        if (u.g(g10, aVar.b())) {
            iVar.setTextSize(eVar.W0(b0Var.k()));
        } else if (u.g(g10, aVar.a())) {
            iVar.setTextSize(iVar.getTextSize() * s.h(b0Var.k()));
        }
        if (d(b0Var)) {
            l i10 = b0Var.i();
            c0 n10 = b0Var.n();
            if (n10 == null) {
                n10 = c0.f239m.e();
            }
            x l10 = b0Var.l();
            if (l10 != null) {
                b10 = l10.i();
            } else {
                b10 = x.f339b.b();
            }
            x c10 = x.c(b10);
            y m10 = b0Var.m();
            if (m10 != null) {
                a10 = m10.m();
            } else {
                a10 = y.f348b.a();
            }
            iVar.setTypeface(rVar.invoke(i10, n10, c10, y.e(a10)));
        }
        boolean z12 = false;
        if (b0Var.p() != null && !q.d(b0Var.p(), c2.i.f8698p.a())) {
            if (Build.VERSION.SDK_INT >= 24) {
                e.f14009a.b(iVar, b0Var.p());
            } else {
                if (b0Var.p().isEmpty()) {
                    e10 = c2.h.f8696b.a();
                } else {
                    e10 = b0Var.p().e(0);
                }
                iVar.setTextLocale(a.a(e10));
            }
        }
        if (b0Var.j() != null && !q.d(b0Var.j(), "")) {
            iVar.setFontFeatureSettings(b0Var.j());
        }
        if (b0Var.u() != null && !q.d(b0Var.u(), p.f16082c.a())) {
            iVar.setTextScaleX(iVar.getTextScaleX() * b0Var.u().b());
            iVar.setTextSkewX(iVar.getTextSkewX() + b0Var.u().c());
        }
        iVar.d(b0Var.g());
        iVar.c(b0Var.f(), z0.l.f26375b.a(), b0Var.c());
        iVar.f(b0Var.r());
        iVar.g(b0Var.s());
        iVar.e(b0Var.h());
        if (u.g(s.g(b0Var.o()), aVar.b())) {
            if (s.h(b0Var.o()) == 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                float textSize = iVar.getTextSize() * iVar.getTextScaleX();
                float W0 = eVar.W0(b0Var.o());
                if (textSize == 0.0f) {
                    z12 = true;
                }
                if (!z12) {
                    iVar.setLetterSpacing(W0 / textSize);
                }
                return c(b0Var.o(), z10, b0Var.d(), b0Var.e());
            }
        }
        if (u.g(s.g(b0Var.o()), aVar.a())) {
            iVar.setLetterSpacing(s.h(b0Var.o()));
        }
        return c(b0Var.o(), z10, b0Var.d(), b0Var.e());
    }

    public static final float b(float f10) {
        boolean z10;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (g2.a.e(r37.h(), g2.a.f16011b.a()) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final v1.b0 c(long r32, boolean r34, long r35, g2.a r37) {
        /*
            r0 = r35
            r2 = 1
            r3 = 0
            if (r34 == 0) goto L26
            long r4 = j2.s.g(r32)
            j2.u$a r6 = j2.u.f19008b
            long r6 = r6.b()
            boolean r4 = j2.u.g(r4, r6)
            if (r4 == 0) goto L26
            float r4 = j2.s.h(r32)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L21
            r4 = 1
            goto L22
        L21:
            r4 = 0
        L22:
            if (r4 != 0) goto L26
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            a1.p1$a r5 = a1.p1.f146b
            long r6 = r5.e()
            boolean r6 = a1.p1.q(r0, r6)
            if (r6 != 0) goto L3f
            long r6 = r5.d()
            boolean r6 = a1.p1.q(r0, r6)
            if (r6 != 0) goto L3f
            r6 = 1
            goto L40
        L3f:
            r6 = 0
        L40:
            if (r37 == 0) goto L53
            g2.a$a r7 = g2.a.f16011b
            float r7 = r7.a()
            float r8 = r37.h()
            boolean r7 = g2.a.e(r8, r7)
            if (r7 != 0) goto L53
            goto L54
        L53:
            r2 = 0
        L54:
            r3 = 0
            if (r4 != 0) goto L5c
            if (r6 != 0) goto L5c
            if (r2 != 0) goto L5c
            goto L9c
        L5c:
            if (r4 == 0) goto L61
            r19 = r32
            goto L69
        L61:
            j2.s$a r4 = j2.s.f19004b
            long r7 = r4.a()
            r19 = r7
        L69:
            if (r6 == 0) goto L6c
            goto L70
        L6c:
            long r0 = r5.e()
        L70:
            r24 = r0
            if (r2 == 0) goto L77
            r21 = r37
            goto L79
        L77:
            r21 = r3
        L79:
            v1.b0 r3 = new v1.b0
            r9 = r3
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 63103(0xf67f, float:8.8426E-41)
            r31 = 0
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31)
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.h.c(long, boolean, long, g2.a):v1.b0");
    }

    public static final boolean d(b0 b0Var) {
        q.i(b0Var, "<this>");
        if (b0Var.i() == null && b0Var.l() == null && b0Var.n() == null) {
            return false;
        }
        return true;
    }

    public static final void e(d2.i iVar, t tVar) {
        int flags;
        q.i(iVar, "<this>");
        if (tVar == null) {
            tVar = t.f16090c.a();
        }
        if (tVar.c()) {
            flags = iVar.getFlags() | 128;
        } else {
            flags = iVar.getFlags() & (-129);
        }
        iVar.setFlags(flags);
        int b10 = tVar.b();
        t.b.a aVar = t.b.f16095a;
        if (t.b.e(b10, aVar.b())) {
            iVar.setFlags(iVar.getFlags() | 64);
            iVar.setHinting(0);
        } else if (t.b.e(b10, aVar.a())) {
            iVar.getFlags();
            iVar.setHinting(1);
        } else if (t.b.e(b10, aVar.c())) {
            iVar.getFlags();
            iVar.setHinting(0);
        } else {
            iVar.getFlags();
        }
    }
}
