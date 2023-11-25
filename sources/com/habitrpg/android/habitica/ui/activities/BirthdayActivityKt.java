package com.habitrpg.android.habitica.ui.activities;

import android.app.Activity;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import j0.l3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p1.g;
import v0.b;
import w.a;

/* compiled from: BirthdayActivity.kt */
/* loaded from: classes4.dex */
public final class BirthdayActivityKt {
    public static final void BirthdayActivityView(f0.g1 g1Var, boolean z10, boolean z11, boolean z12, String str, Date date, Date date2, pc.a<dc.w> aVar, pc.a<dc.w> aVar2, pc.a<dc.w> aVar3, j0.l lVar, int i10) {
        Activity activity;
        qc.q.i(g1Var, "scaffoldState");
        qc.q.i(str, "price");
        qc.q.i(date, "startDate");
        qc.q.i(date2, "endDate");
        qc.q.i(aVar, "onPurchaseClick");
        qc.q.i(aVar2, "onGemPurchaseClick");
        qc.q.i(aVar3, "onEquipClick");
        j0.l q10 = lVar.q(164352976);
        if (j0.n.K()) {
            j0.n.V(164352976, i10, -1, "com.habitrpg.android.habitica.ui.activities.BirthdayActivityView (BirthdayActivity.kt:240)");
        }
        Object C = q10.C(androidx.compose.ui.platform.j0.g());
        if (C instanceof Activity) {
            activity = (Activity) C;
        } else {
            activity = null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd", Locale.getDefault());
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0, 0);
        long f10 = a1.p1.f146b.f();
        long a10 = s1.c.a(R.color.yellow_50, q10, 6);
        d6.d e10 = d6.e.e(null, q10, 0, 1);
        long a11 = s1.c.a(R.color.brand_300, q10, 6);
        long a12 = s1.c.a(R.color.brand_50, q10, 6);
        a1.p1 g10 = a1.p1.g(a11);
        a1.p1 g11 = a1.p1.g(a12);
        q10.e(1618982084);
        boolean Q = q10.Q(g10) | q10.Q(e10) | q10.Q(g11);
        Object f11 = q10.f();
        if (Q || f11 == j0.l.f18688a.a()) {
            f11 = new BirthdayActivityKt$BirthdayActivityView$1$1(e10, a11, a12);
            q10.J(f11);
        }
        q10.N();
        j0.h0.b(e10, (pc.l) f11, q10, 0);
        f0.e1.a(null, g1Var, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, q0.c.b(q10, 1135107854, true, new BirthdayActivityKt$BirthdayActivityView$2(f10, activity, a10, z11, aVar3, i10, z10, aVar, aVar2, simpleDateFormat, date, date2, z12, str, dateTimeInstance)), q10, (i10 << 3) & 112, 12582912, 131069);
        if (j0.n.K()) {
            j0.n.U();
        }
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new BirthdayActivityKt$BirthdayActivityView$3(g1Var, z10, z11, z12, str, date, date2, aVar, aVar2, aVar3, i10));
        }
    }

    public static final void BirthdayTitle(String str, j0.l lVar, int i10) {
        int i11;
        j0.l lVar2;
        int i12;
        qc.q.i(str, "text");
        j0.l q10 = lVar.q(-877733311);
        if ((i10 & 14) == 0) {
            if (q10.Q(str)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && q10.t()) {
            q10.z();
            lVar2 = q10;
        } else {
            if (j0.n.K()) {
                j0.n.V(-877733311, i11, -1, "com.habitrpg.android.habitica.ui.activities.BirthdayTitle (BirthdayActivity.kt:197)");
            }
            b.c h10 = v0.b.f24258a.h();
            e.a aVar = androidx.compose.ui.e.f2335a;
            androidx.compose.ui.e m10 = androidx.compose.foundation.layout.j.m(androidx.compose.foundation.layout.m.h(aVar, 0.0f, 1, null), 0.0f, j2.h.j(20), 0.0f, j2.h.j(8), 5, null);
            q10.e(693286680);
            n1.i0 a10 = w.y.a(w.a.f25135a.e(), h10, q10, 48);
            q10.e(-1323940314);
            int a11 = j0.j.a(q10, 0);
            j0.v F = q10.F();
            g.a aVar2 = p1.g.f20790l;
            pc.a<p1.g> a12 = aVar2.a();
            pc.q<j0.i2<p1.g>, j0.l, Integer, dc.w> a13 = n1.x.a(m10);
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
            pc.p<p1.g, Integer, dc.w> b10 = aVar2.b();
            if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b10);
            }
            a13.invoke(j0.i2.a(j0.i2.b(q10)), q10, 0);
            q10.e(2058660585);
            w.b0 b0Var = w.b0.f25155a;
            float f10 = 1;
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.c.d(w.z.a(b0Var, androidx.compose.foundation.layout.m.i(aVar, j2.h.j(f10)), 1.0f, false, 2, null), s1.c.a(R.color.brand_50, q10, 6), null, 2, null), q10, 0);
            t.u.a(s1.f.d(R.drawable.birthday_textdeco_left, q10, 6), null, null, null, null, 0.0f, null, q10, 56, 124);
            f0.f2.b(str, androidx.compose.foundation.layout.j.k(aVar, j2.h.j(16), 0.0f, 2, null), a1.p1.f146b.f(), j2.t.g(16), null, a2.c0.f239m.b(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, (i11 & 14) | 200112, 0, 131024);
            lVar2 = q10;
            t.u.a(s1.f.d(R.drawable.birthday_textdeco_right, lVar2, 6), null, null, null, null, 0.0f, null, lVar2, 56, 124);
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.c.d(w.z.a(b0Var, androidx.compose.foundation.layout.m.i(aVar, j2.h.j(f10)), 1.0f, false, 2, null), s1.c.a(R.color.brand_50, lVar2, 6), null, 2, null), lVar2, 0);
            lVar2.N();
            lVar2.O();
            lVar2.N();
            lVar2.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = lVar2.w();
        if (w10 != null) {
            w10.a(new BirthdayActivityKt$BirthdayTitle$2(str, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FourFreeItem(int r44, java.lang.String r45, androidx.compose.ui.e r46, java.lang.String r47, d1.c r48, j0.l r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.BirthdayActivityKt.FourFreeItem(int, java.lang.String, androidx.compose.ui.e, java.lang.String, d1.c, j0.l, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public static final void PotionGrid(j0.l lVar, int i10) {
        List l10;
        List<List> I0;
        j0.l q10 = lVar.q(1307849238);
        if (i10 == 0 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(1307849238, i10, -1, "com.habitrpg.android.habitica.ui.activities.PotionGrid (BirthdayActivity.kt:535)");
            }
            l10 = ec.t.l("Porcelain", "Vampire", "Aquatic", "StainedGlass", "Celestial", "Glow", "AutumnLeaf", "SandSculpture", "Peppermint", "Shimmer");
            I0 = ec.b0.I0(l10, 4, 4, true);
            float f10 = 8;
            a.e m10 = w.a.f25135a.m(j2.h.j(f10));
            b.InterfaceC0571b f11 = v0.b.f24258a.f();
            androidx.compose.ui.e m11 = androidx.compose.foundation.layout.j.m(androidx.compose.ui.e.f2335a, 0.0f, j2.h.j(20), 0.0f, 0.0f, 13, null);
            q10.e(-483455358);
            n1.i0 a10 = w.h.a(m10, f11, q10, 54);
            int i11 = -1323940314;
            q10.e(-1323940314);
            boolean z10 = false;
            int a11 = j0.j.a(q10, 0);
            j0.v F = q10.F();
            g.a aVar = p1.g.f20790l;
            pc.a<p1.g> a12 = aVar.a();
            pc.q<j0.i2<p1.g>, j0.l, Integer, dc.w> a13 = n1.x.a(m11);
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
            l3.b(a14, a10, aVar.e());
            l3.b(a14, F, aVar.g());
            pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
            if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b10);
            }
            a13.invoke(j0.i2.a(j0.i2.b(q10)), q10, 0);
            int i12 = 2058660585;
            q10.e(2058660585);
            w.k kVar = w.k.f25176a;
            q10.e(1961418201);
            for (List<String> list : I0) {
                a.e m12 = w.a.f25135a.m(j2.h.j(f10));
                q10.e(693286680);
                e.a aVar2 = androidx.compose.ui.e.f2335a;
                int i13 = 6;
                n1.i0 a15 = w.y.a(m12, v0.b.f24258a.k(), q10, 6);
                q10.e(i11);
                int a16 = j0.j.a(q10, z10 ? 1 : 0);
                j0.v F2 = q10.F();
                g.a aVar3 = p1.g.f20790l;
                pc.a<p1.g> a17 = aVar3.a();
                pc.q<j0.i2<p1.g>, j0.l, Integer, dc.w> a18 = n1.x.a(aVar2);
                if (!(q10.u() instanceof j0.f)) {
                    j0.j.c();
                }
                q10.s();
                if (q10.n()) {
                    q10.B(a17);
                } else {
                    q10.H();
                }
                j0.l a19 = l3.a(q10);
                l3.b(a19, a15, aVar3.e());
                l3.b(a19, F2, aVar3.g());
                pc.p<p1.g, Integer, dc.w> b11 = aVar3.b();
                if (a19.n() || !qc.q.d(a19.f(), Integer.valueOf(a16))) {
                    a19.J(Integer.valueOf(a16));
                    a19.I(Integer.valueOf(a16), b11);
                }
                a18.invoke(j0.i2.a(j0.i2.b(q10)), q10, Integer.valueOf(z10 ? 1 : 0));
                q10.e(i12);
                w.b0 b0Var = w.b0.f25155a;
                q10.e(1307838575);
                ?? r12 = z10;
                for (String str : list) {
                    e.a aVar4 = androidx.compose.ui.e.f2335a;
                    float f12 = 68;
                    androidx.compose.ui.e c10 = androidx.compose.foundation.c.c(androidx.compose.foundation.layout.m.o(aVar4, j2.h.j(f12)), s1.c.a(R.color.brand_50, q10, i13), b0.i.d(j2.h.j(f10)));
                    q10.e(733328855);
                    n1.i0 h10 = androidx.compose.foundation.layout.d.h(v0.b.f24258a.n(), r12, q10, r12);
                    q10.e(i11);
                    int a20 = j0.j.a(q10, r12);
                    j0.v F3 = q10.F();
                    g.a aVar5 = p1.g.f20790l;
                    pc.a<p1.g> a21 = aVar5.a();
                    pc.q<j0.i2<p1.g>, j0.l, Integer, dc.w> a22 = n1.x.a(c10);
                    if (!(q10.u() instanceof j0.f)) {
                        j0.j.c();
                    }
                    q10.s();
                    if (q10.n()) {
                        q10.B(a21);
                    } else {
                        q10.H();
                    }
                    j0.l a23 = l3.a(q10);
                    l3.b(a23, h10, aVar5.e());
                    l3.b(a23, F3, aVar5.g());
                    pc.p<p1.g, Integer, dc.w> b12 = aVar5.b();
                    if (a23.n() || !qc.q.d(a23.f(), Integer.valueOf(a20))) {
                        a23.J(Integer.valueOf(a20));
                        a23.I(Integer.valueOf(a20), b12);
                    }
                    a22.invoke(j0.i2.a(j0.i2.b(q10)), q10, Integer.valueOf((int) r12));
                    q10.e(i12);
                    androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2083a;
                    s4.i.a(DataBindingUtils.BASE_IMAGE_URL + DataBindingUtils.getFullFilename$default(DataBindingUtils.INSTANCE, "Pet_HatchingPotion_" + str, null, 2, null), null, androidx.compose.foundation.layout.m.o(aVar4, j2.h.j(f12)), null, null, null, null, 0.0f, null, 0, q10, 432, 1016);
                    q10.N();
                    q10.O();
                    q10.N();
                    q10.N();
                    f10 = f10;
                    i13 = 6;
                    i12 = 2058660585;
                    r12 = 0;
                    i11 = -1323940314;
                }
                q10.N();
                q10.N();
                q10.O();
                q10.N();
                q10.N();
                i12 = 2058660585;
                z10 = false;
                i11 = -1323940314;
            }
            q10.N();
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new BirthdayActivityKt$PotionGrid$2(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Preview(j0.l lVar, int i10) {
        j0.l q10 = lVar.q(124607747);
        if (i10 == 0 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(124607747, i10, -1, "com.habitrpg.android.habitica.ui.activities.Preview (BirthdayActivity.kt:620)");
            }
            BirthdayActivityView(f0.e1.f(null, null, q10, 0, 3), true, false, false, "", new Date(), new Date(), BirthdayActivityKt$Preview$1.INSTANCE, BirthdayActivityKt$Preview$2.INSTANCE, BirthdayActivityKt$Preview$3.INSTANCE, q10, 920939952);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new BirthdayActivityKt$Preview$4(i10));
        }
    }
}
