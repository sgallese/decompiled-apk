package s1;

import a1.t3;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.compose.ui.platform.j0;
import j0.l;
import j0.n;
import qc.q;
import s1.e;

/* compiled from: PainterResources.android.kt */
/* loaded from: classes.dex */
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final t3 b(Resources resources, int i10) {
        return d.b(t3.f191a, resources, i10);
    }

    private static final e1.f c(Resources.Theme theme, Resources resources, int i10, int i11, l lVar, int i12) {
        lVar.e(21855625);
        if (n.K()) {
            n.V(21855625, i12, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:81)");
        }
        e eVar = (e) lVar.C(j0.h());
        e.b bVar = new e.b(theme, i10);
        e.a b10 = eVar.b(bVar);
        if (b10 == null) {
            XmlResourceParser xml = resources.getXml(i10);
            q.h(xml, "res.getXml(id)");
            if (q.d(f1.c.j(xml).getName(), "vector")) {
                b10 = i.a(theme, resources, xml, i11);
                eVar.d(bVar, b10);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
            }
        }
        e1.f b11 = b10.b();
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return b11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r7 == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final d1.c d(int r10, j0.l r11, int r12) {
        /*
            r0 = 473971343(0x1c403a8f, float:6.3603156E-22)
            r11.e(r0)
            boolean r1 = j0.n.K()
            if (r1 == 0) goto L12
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)"
            j0.n.V(r0, r12, r1, r2)
        L12:
            j0.v1 r0 = androidx.compose.ui.platform.j0.g()
            java.lang.Object r0 = r11.C(r0)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            android.content.res.Resources r3 = s1.g.a(r11, r1)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.e(r2)
            java.lang.Object r2 = r11.f()
            j0.l$a r4 = j0.l.f18688a
            java.lang.Object r5 = r4.a()
            if (r2 != r5) goto L3b
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r11.J(r2)
        L3b:
            r11.N()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            r5 = 1
            r3.getValue(r10, r2, r5)
            java.lang.CharSequence r6 = r2.string
            if (r6 == 0) goto L53
            r7 = 2
            r8 = 0
            java.lang.String r9 = ".xml"
            boolean r7 = yc.m.O(r6, r9, r1, r7, r8)
            if (r7 != r5) goto L53
            goto L54
        L53:
            r5 = 0
        L54:
            if (r5 == 0) goto L7c
            r4 = -738265327(0xffffffffd3fef711, float:-2.19013356E12)
            r11.e(r4)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            java.lang.String r4 = "context.theme"
            qc.q.h(r0, r4)
            int r5 = r2.changingConfigurations
            int r12 = r12 << 6
            r12 = r12 & 896(0x380, float:1.256E-42)
            r7 = r12 | 72
            r2 = r0
            r4 = r10
            r6 = r11
            e1.f r10 = c(r2, r3, r4, r5, r6, r7)
            e1.v r10 = e1.w.b(r10, r11, r1)
            r11.N()
            goto Lc6
        L7c:
            r12 = -738265172(0xffffffffd3fef7ac, float:-2.19015388E12)
            r11.e(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r11.e(r1)
            boolean r1 = r11.Q(r6)
            boolean r12 = r11.Q(r12)
            r12 = r12 | r1
            boolean r0 = r11.Q(r0)
            r12 = r12 | r0
            java.lang.Object r0 = r11.f()
            if (r12 != 0) goto Laa
            java.lang.Object r12 = r4.a()
            if (r0 != r12) goto Lb1
        Laa:
            a1.t3 r0 = a(r3, r10)
            r11.J(r0)
        Lb1:
            r11.N()
            r2 = r0
            a1.t3 r2 = (a1.t3) r2
            d1.a r10 = new d1.a
            r3 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r1 = r10
            r1.<init>(r2, r3, r5, r7, r8)
            r11.N()
        Lc6:
            boolean r12 = j0.n.K()
            if (r12 == 0) goto Lcf
            j0.n.U()
        Lcf:
            r11.N()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.f.d(int, j0.l, int):d1.c");
    }
}
