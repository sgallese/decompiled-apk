package com.habitrpg.android.habitica.ui.views.tasks;

import a1.p1;
import a1.q1;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.Assignable;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import com.habitrpg.android.habitica.ui.views.UserRowKt;
import dc.w;
import f0.f2;
import f0.s0;
import j0.g2;
import j0.i2;
import j0.j;
import j0.l3;
import j0.n;
import j0.v;
import j2.t;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n1.i0;
import n1.x;
import p1.g;
import pc.l;
import pc.p;
import qc.q;
import t.u;
import v0.b;
import w.a;
import w.b0;
import w.k;
import w.y;

/* compiled from: AssignedView.kt */
/* loaded from: classes4.dex */
public final class AssignedViewKt {
    /* renamed from: AssignedView-njYn8yo  reason: not valid java name */
    public static final void m179AssignedViewnjYn8yo(List<? extends Assignable> list, Map<String, ? extends Date> map, long j10, long j11, pc.a<w> aVar, l<? super String, w> lVar, androidx.compose.ui.e eVar, boolean z10, j0.l lVar2, int i10, int i11) {
        q.i(list, "assigned");
        q.i(map, "completedAt");
        q.i(aVar, "onEditClick");
        q.i(lVar, "onUndoClick");
        j0.l q10 = lVar2.q(746060312);
        e.a aVar2 = (i11 & 64) != 0 ? androidx.compose.ui.e.f2335a : eVar;
        boolean z11 = (i11 & 128) != 0 ? false : z10;
        if (n.K()) {
            n.V(746060312, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.AssignedView (AssignedView.kt:44)");
        }
        androidx.compose.ui.e h10 = m.h(aVar2, 0.0f, 1, null);
        q10.e(-483455358);
        i0 a10 = w.h.a(w.a.f25135a.f(), v0.b.f24258a.j(), q10, 0);
        q10.e(-1323940314);
        int a11 = j.a(q10, 0);
        v F = q10.F();
        g.a aVar3 = p1.g.f20790l;
        pc.a<p1.g> a12 = aVar3.a();
        pc.q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(h10);
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
        l3.b(a14, a10, aVar3.e());
        l3.b(a14, F, aVar3.g());
        p<p1.g, Integer, w> b10 = aVar3.b();
        if (a14.n() || !q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b10);
        }
        a13.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        k kVar = k.f25176a;
        float f10 = 4;
        androidx.compose.ui.e k10 = androidx.compose.foundation.layout.j.k(androidx.compose.ui.e.f2335a, 0.0f, j2.h.j(f10), 1, null);
        s0 s0Var = s0.f15068a;
        int i12 = s0.f15069b;
        float f11 = f10;
        androidx.compose.ui.e a15 = x0.e.a(m.h(androidx.compose.foundation.layout.j.m(m.k(androidx.compose.foundation.c.c(k10, j10, s0Var.b(q10, i12).b()), j2.h.j(66), 0.0f, 2, null), j2.h.j(16), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), s0Var.b(q10, i12).b());
        q10.e(1857788409);
        Iterator<? extends Assignable> it = list.iterator();
        while (it.hasNext()) {
            Assignable next = it.next();
            UserRowKt.m166UserRowPIknLig(next.getIdentifiableName(), next.getAvatar(), a15, m.k(androidx.compose.foundation.layout.j.k(androidx.compose.ui.e.f2335a, 0.0f, j2.h.j(12), 1, null), j2.h.j(24), 0.0f, 2, null), q0.c.b(q10, 1051377232, true, new AssignedViewKt$AssignedView$1$1(map, next)), q0.c.b(q10, 1496914543, true, new AssignedViewKt$AssignedView$1$2(map, next, z11, lVar)), p1.g(j11), q10, ((i10 << 9) & 3670016) | 224320, 0);
            f11 = f11;
            it = it;
            aVar2 = aVar2;
        }
        androidx.compose.ui.e eVar2 = aVar2;
        float f12 = f11;
        q10.N();
        q10.e(-1433040856);
        if (z11) {
            b.c h11 = v0.b.f24258a.h();
            e.a aVar4 = androidx.compose.ui.e.f2335a;
            q10.e(1157296644);
            boolean Q = q10.Q(aVar);
            Object f13 = q10.f();
            if (Q || f13 == j0.l.f18688a.a()) {
                f13 = new AssignedViewKt$AssignedView$1$3$1(aVar);
                q10.J(f13);
            }
            q10.N();
            androidx.compose.ui.e h12 = m.h(m.k(androidx.compose.foundation.layout.j.j(androidx.compose.foundation.c.c(androidx.compose.foundation.layout.j.k(androidx.compose.foundation.e.e(aVar4, false, null, null, (pc.a) f13, 7, null), 0.0f, j2.h.j(f12), 1, null), j10, s0.f15068a.b(q10, s0.f15069b).b()), j2.h.j(15), j2.h.j(12)), j2.h.j(24), 0.0f, 2, null), 0.0f, 1, null);
            q10.e(693286680);
            i0 a16 = y.a(w.a.f25135a.e(), h11, q10, 48);
            q10.e(-1323940314);
            int a17 = j.a(q10, 0);
            v F2 = q10.F();
            g.a aVar5 = p1.g.f20790l;
            pc.a<p1.g> a18 = aVar5.a();
            pc.q<i2<p1.g>, j0.l, Integer, w> a19 = x.a(h12);
            if (!(q10.u() instanceof j0.f)) {
                j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a18);
            } else {
                q10.H();
            }
            j0.l a20 = l3.a(q10);
            l3.b(a20, a16, aVar5.e());
            l3.b(a20, F2, aVar5.g());
            p<p1.g, Integer, w> b11 = aVar5.b();
            if (a20.n() || !q.d(a20.f(), Integer.valueOf(a17))) {
                a20.J(Integer.valueOf(a17));
                a20.I(Integer.valueOf(a17), b11);
            }
            a19.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            b0 b0Var = b0.f25155a;
            u.a(s1.f.d(R.drawable.edit, q10, 6), null, null, null, null, 0.0f, q1.a.b(q1.f163b, j11, 0, 2, null), q10, 56, 60);
            f2.b(s1.h.a(R.string.edit_assignees, q10, 6), androidx.compose.foundation.layout.j.m(aVar4, j2.h.j(f12), 0.0f, 0.0f, 0.0f, 14, null), j11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, ((i10 >> 3) & 896) | 48, 0, 131064);
            q10.N();
            q10.O();
            q10.N();
            q10.N();
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
        if (w10 == null) {
            return;
        }
        w10.a(new AssignedViewKt$AssignedView$2(list, map, j10, j11, aVar, lVar, eVar2, z11, i10, i11));
    }

    public static final void UndoTaskCompletion(androidx.compose.ui.e eVar, j0.l lVar, int i10, int i11) {
        Object obj;
        int i12;
        int i13;
        e.a aVar;
        j0.l lVar2;
        j0.l q10 = lVar.q(1880939535);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            obj = eVar;
        } else if ((i10 & 14) == 0) {
            obj = eVar;
            if (q10.Q(obj)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            obj = eVar;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && q10.t()) {
            q10.z();
            lVar2 = q10;
        } else {
            if (i14 != 0) {
                aVar = androidx.compose.ui.e.f2335a;
            } else {
                aVar = obj;
            }
            if (n.K()) {
                n.V(1880939535, i12, -1, "com.habitrpg.android.habitica.ui.views.tasks.UndoTaskCompletion (AssignedView.kt:113)");
            }
            b.InterfaceC0571b f10 = v0.b.f24258a.f();
            a.e b10 = w.a.f25135a.b();
            androidx.compose.ui.e d10 = m.d(m.k(m.s(aVar, j2.h.j(51)), j2.h.j(66), 0.0f, 2, null), 0.0f, 1, null);
            HabiticaTheme habiticaTheme = HabiticaTheme.INSTANCE;
            int i15 = HabiticaTheme.$stable;
            androidx.compose.ui.e d11 = androidx.compose.foundation.c.d(d10, habiticaTheme.getColors(q10, i15).m126getContentBackgroundOffset0d7_KjU(), null, 2, null);
            q10.e(-483455358);
            i0 a10 = w.h.a(b10, f10, q10, 54);
            q10.e(-1323940314);
            int a11 = j.a(q10, 0);
            v F = q10.F();
            g.a aVar2 = p1.g.f20790l;
            pc.a<p1.g> a12 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(d11);
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
            p<p1.g, Integer, w> b11 = aVar2.b();
            if (a14.n() || !q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b11);
            }
            a13.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            k kVar = k.f25176a;
            u.a(s1.f.d(R.drawable.checkmark, q10, 6), null, androidx.compose.foundation.c.c(m.o(androidx.compose.ui.e.f2335a, j2.h.j(24)), habiticaTheme.getColors(q10, i15).m141getWindowBackground0d7_KjU(), habiticaTheme.getShapes(q10, i15).c()), null, n1.f.f19964a.c(), 0.0f, null, q10, 24632, 104);
            androidx.compose.ui.e eVar2 = aVar;
            lVar2 = q10;
            f2.b(s1.h.a(R.string.undo, q10, 6), null, habiticaTheme.getColors(q10, i15).m136getTextSecondary0d7_KjU(), t.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar2, 3072, 0, 131058);
            lVar2.N();
            lVar2.O();
            lVar2.N();
            lVar2.N();
            if (n.K()) {
                n.U();
            }
            obj = eVar2;
        }
        g2 w10 = lVar2.w();
        if (w10 != null) {
            w10.a(new AssignedViewKt$UndoTaskCompletion$2(obj, i10, i11));
        }
    }
}
