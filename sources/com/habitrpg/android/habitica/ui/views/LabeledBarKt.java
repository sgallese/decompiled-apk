package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.R;
import dc.w;
import j0.d3;
import j0.g2;
import j0.i2;
import j0.j1;
import j0.l;
import j0.l3;
import j0.n;
import j0.v;
import n1.i0;
import n1.x;
import p1.g;
import pc.p;
import pc.q;
import w.a;

/* compiled from: LabeledBar.kt */
/* loaded from: classes4.dex */
public final class LabeledBarKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /* renamed from: LabeledBar-VOtfePw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m164LabeledBarVOtfePw(androidx.compose.ui.e r39, android.graphics.Bitmap r40, java.lang.String r41, long r42, long r44, double r46, double r48, boolean r50, float r51, boolean r52, boolean r53, boolean r54, boolean r55, j0.l r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 1353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.LabeledBarKt.m164LabeledBarVOtfePw(androidx.compose.ui.e, android.graphics.Bitmap, java.lang.String, long, long, double, double, boolean, float, boolean, boolean, boolean, boolean, j0.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Preview(j0.l lVar, int i10) {
        j0.l lVar2;
        j0.l q10 = lVar.q(380590432);
        if (i10 == 0 && q10.t()) {
            q10.z();
            lVar2 = q10;
        } else {
            if (n.K()) {
                n.V(380590432, i10, -1, "com.habitrpg.android.habitica.ui.views.Preview (LabeledBar.kt:155)");
            }
            q10.e(-492369756);
            Object f10 = q10.f();
            l.a aVar = j0.l.f18688a;
            if (f10 == aVar.a()) {
                f10 = d3.e(Boolean.FALSE, null, 2, null);
                q10.J(f10);
            }
            q10.N();
            j1 j1Var = (j1) f10;
            a.e m10 = w.a.f25135a.m(j2.h.j(10));
            androidx.compose.ui.e i11 = androidx.compose.foundation.layout.j.i(androidx.compose.foundation.layout.m.s(androidx.compose.ui.e.f2335a, j2.h.j(240)), j2.h.j(8));
            q10.e(1157296644);
            boolean Q = q10.Q(j1Var);
            Object f11 = q10.f();
            if (Q || f11 == aVar.a()) {
                f11 = new LabeledBarKt$Preview$1$1(j1Var);
                q10.J(f11);
            }
            q10.N();
            androidx.compose.ui.e e10 = androidx.compose.foundation.e.e(i11, false, null, null, (pc.a) f11, 7, null);
            q10.e(-483455358);
            i0 a10 = w.h.a(m10, v0.b.f24258a.j(), q10, 6);
            q10.e(-1323940314);
            int a11 = j0.j.a(q10, 0);
            v F = q10.F();
            g.a aVar2 = p1.g.f20790l;
            pc.a<p1.g> a12 = aVar2.a();
            q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(e10);
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a12);
            } else {
                q10.H();
            }
            j0.l a14 = l3.a(q10);
            l3.b(a14, a10, aVar2.e());
            l3.b(a14, F, aVar2.g());
            p<p1.g, Integer, w> b10 = aVar2.b();
            if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b10);
            }
            a13.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            w.k kVar = w.k.f25176a;
            m164LabeledBarVOtfePw(null, HabiticaIconsHelper.imageOfHeartLightBg(), s1.h.a(R.string.health, q10, 6), s1.c.a(R.color.hpColor, q10, 6), 0L, 10.0d, 50.0d, Preview$lambda$4(j1Var), 0.0f, false, false, false, false, q10, 1769536, 0, 7953);
            m164LabeledBarVOtfePw(null, HabiticaIconsHelper.imageOfExperience(), s1.h.a(R.string.XP_default, q10, 6), s1.c.a(R.color.xpColor, q10, 6), 0L, 100123.0d, 5.0E13d, Preview$lambda$4(j1Var), 0.0f, false, false, false, false, q10, 1769536, 6, 6929);
            m164LabeledBarVOtfePw(null, HabiticaIconsHelper.imageOfExperience(), s1.h.a(R.string.XP_default, q10, 6), s1.c.a(R.color.xpColor, q10, 6), 0L, 100123.0d, 5.0E11d, Preview$lambda$4(j1Var), 0.0f, false, false, false, false, q10, 1769536, 54, 4881);
            lVar2 = q10;
            m164LabeledBarVOtfePw(null, HabiticaIconsHelper.imageOfMagic(), s1.h.b(R.string.unlock_level, new Object[]{10}, q10, 70), s1.c.a(R.color.mpColor, q10, 6), 0L, 10.0d, 5000.0d, Preview$lambda$4(j1Var), 0.0f, false, false, false, false, lVar2, 807075904, 0, 7441);
            lVar2.N();
            lVar2.O();
            lVar2.N();
            lVar2.N();
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = lVar2.w();
        if (w10 != null) {
            w10.a(new LabeledBarKt$Preview$3(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Preview$lambda$4(j1<Boolean> j1Var) {
        return j1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Preview$lambda$5(j1<Boolean> j1Var, boolean z10) {
        j1Var.setValue(Boolean.valueOf(z10));
    }
}
