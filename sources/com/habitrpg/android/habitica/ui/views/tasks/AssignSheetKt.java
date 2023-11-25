package com.habitrpg.android.habitica.ui.views.tasks;

import a1.p1;
import a2.c0;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.views.UserRowKt;
import dc.w;
import f0.f2;
import f0.i;
import j0.d3;
import j0.g2;
import j0.i2;
import j0.j;
import j0.j1;
import j0.l3;
import j0.n;
import j0.v;
import j2.t;
import java.util.List;
import n1.i0;
import n1.x;
import p1.g;
import pc.l;
import pc.p;
import qc.q;
import v0.b;
import w.a;
import w.k;

/* compiled from: AssignSheet.kt */
/* loaded from: classes4.dex */
public final class AssignSheetKt {
    public static final void AssignSheet(List<? extends Member> list, List<String> list2, l<? super String, w> lVar, pc.a<w> aVar, androidx.compose.ui.e eVar, j0.l lVar2, int i10, int i11) {
        e.a aVar2;
        q.i(list, "members");
        q.i(list2, "assignedMembers");
        q.i(lVar, "onAssignClick");
        q.i(aVar, "onCloseClick");
        j0.l q10 = lVar2.q(-657139404);
        if ((i11 & 16) != 0) {
            aVar2 = androidx.compose.ui.e.f2335a;
        } else {
            aVar2 = eVar;
        }
        if (n.K()) {
            n.V(-657139404, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.AssignSheet (AssignSheet.kt:50)");
        }
        int i12 = (i10 >> 12) & 14;
        q10.e(-483455358);
        a.l f10 = w.a.f25135a.f();
        b.a aVar3 = v0.b.f24258a;
        int i13 = i12 >> 3;
        i0 a10 = w.h.a(f10, aVar3.j(), q10, (i13 & 112) | (i13 & 14));
        q10.e(-1323940314);
        int a11 = j.a(q10, 0);
        v F = q10.F();
        g.a aVar4 = p1.g.f20790l;
        pc.a<p1.g> a12 = aVar4.a();
        pc.q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(aVar2);
        int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
        if (!(q10.u() instanceof j0.f)) {
            j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(a12);
        } else {
            q10.H();
        }
        j0.l a14 = l3.a(q10);
        l3.b(a14, a10, aVar4.e());
        l3.b(a14, F, aVar4.g());
        p<p1.g, Integer, w> b10 = aVar4.b();
        if (a14.n() || !q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b10);
        }
        a13.invoke(i2.a(i2.b(q10)), q10, Integer.valueOf((i14 >> 3) & 112));
        q10.e(2058660585);
        k kVar = k.f25176a;
        q10.e(733328855);
        e.a aVar5 = androidx.compose.ui.e.f2335a;
        i0 h10 = androidx.compose.foundation.layout.d.h(aVar3.n(), false, q10, 0);
        q10.e(-1323940314);
        int a15 = j.a(q10, 0);
        v F2 = q10.F();
        pc.a<p1.g> a16 = aVar4.a();
        pc.q<i2<p1.g>, j0.l, Integer, w> a17 = x.a(aVar5);
        if (!(q10.u() instanceof j0.f)) {
            j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(a16);
        } else {
            q10.H();
        }
        j0.l a18 = l3.a(q10);
        l3.b(a18, h10, aVar4.e());
        l3.b(a18, F2, aVar4.g());
        p<p1.g, Integer, w> b11 = aVar4.b();
        if (a18.n() || !q.d(a18.f(), Integer.valueOf(a15))) {
            a18.J(Integer.valueOf(a15));
            a18.I(Integer.valueOf(a15), b11);
        }
        a17.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        androidx.compose.foundation.layout.e eVar2 = androidx.compose.foundation.layout.e.f2083a;
        f2.b(s1.h.a(R.string.assign_to, q10, 6), androidx.compose.foundation.layout.j.m(m.h(aVar5, 0.0f, 1, null), 0.0f, j2.h.j(8), 0.0f, 0.0f, 13, null), s1.c.a(R.color.gray_200, q10, 6), t.g(16), null, c0.f239m.d(), null, 0L, null, g2.j.g(g2.j.f16057b.a()), 0L, 0, false, 0, 0, null, null, q10, 199728, 0, 130512);
        i.d(aVar, eVar2.b(aVar5, aVar3.e()), false, null, null, null, null, f0.g.f14733a.i(0L, 0L, 0L, q10, f0.g.f14744l << 9, 7), null, ComposableSingletons$AssignSheetKt.INSTANCE.m180getLambda1$Habitica_2311256681_prodRelease(), q10, ((i10 >> 9) & 14) | 805306368, 380);
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        q10.e(1243703636);
        for (Member member : list) {
            AssignSheetRow(member, list2.contains(member.getId()), lVar, null, q10, (i10 & 896) | 8, 8);
        }
        q10.N();
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new AssignSheetKt$AssignSheet$2(list, list2, lVar, aVar, aVar2, i10, i11));
        }
    }

    public static final void AssignSheetRow(Member member, boolean z10, l<? super String, w> lVar, androidx.compose.ui.e eVar, j0.l lVar2, int i10, int i11) {
        e.a aVar;
        q.i(member, "member");
        q.i(lVar, "onAssignClick");
        j0.l q10 = lVar2.q(-1678455552);
        if ((i11 & 8) != 0) {
            aVar = androidx.compose.ui.e.f2335a;
        } else {
            aVar = eVar;
        }
        if (n.K()) {
            n.V(-1678455552, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.AssignSheetRow (AssignSheet.kt:84)");
        }
        UserRowKt.m166UserRowPIknLig(member.getDisplayName(), member, m.h(m.k(androidx.compose.foundation.layout.j.j(androidx.compose.foundation.e.e(aVar, false, null, null, new AssignSheetKt$AssignSheetRow$1(member, lVar), 7, null), j2.h.j(30), j2.h.j(12)), j2.h.j(24), 0.0f, 2, null), 0.0f, 1, null), null, q0.c.b(q10, 511303584, true, new AssignSheetKt$AssignSheetRow$2(member)), q0.c.b(q10, 433313313, true, new AssignSheetKt$AssignSheetRow$3(z10, i10)), p1.g(s1.c.a(R.color.text_primary, q10, 6)), q10, 221248, 8);
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new AssignSheetKt$AssignSheetRow$4(member, z10, lVar, aVar, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void IsAssignedIndicator(boolean r24, androidx.compose.ui.e r25, j0.l r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.tasks.AssignSheetKt.IsAssignedIndicator(boolean, androidx.compose.ui.e, j0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IsAssignedIndicatorPreview(j0.l lVar, int i10) {
        j0.l q10 = lVar.q(-240771271);
        if (i10 == 0 && q10.t()) {
            q10.z();
        } else {
            if (n.K()) {
                n.V(-240771271, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.IsAssignedIndicatorPreview (AssignSheet.kt:160)");
            }
            q10.e(-492369756);
            Object f10 = q10.f();
            if (f10 == j0.l.f18688a.a()) {
                f10 = d3.e(Boolean.FALSE, null, 2, null);
                q10.J(f10);
            }
            q10.N();
            j1 j1Var = (j1) f10;
            q10.e(-483455358);
            e.a aVar = androidx.compose.ui.e.f2335a;
            i0 a10 = w.h.a(w.a.f25135a.f(), v0.b.f24258a.j(), q10, 0);
            q10.e(-1323940314);
            int a11 = j.a(q10, 0);
            v F = q10.F();
            g.a aVar2 = p1.g.f20790l;
            pc.a<p1.g> a12 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(aVar);
            if (!(q10.u() instanceof j0.f)) {
                j.c();
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
            if (a14.n() || !q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b10);
            }
            a13.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            k kVar = k.f25176a;
            IsAssignedIndicator(((Boolean) j1Var.getValue()).booleanValue(), null, q10, 0, 2);
            IsAssignedIndicator(!((Boolean) j1Var.getValue()).booleanValue(), null, q10, 0, 2);
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new AssignSheetKt$IsAssignedIndicatorPreview$2(i10));
        }
    }
}
