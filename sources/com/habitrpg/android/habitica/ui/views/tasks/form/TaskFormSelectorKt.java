package com.habitrpg.android.habitica.ui.views.tasks.form;

import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import dc.w;
import ec.b0;
import ec.t;
import j0.d3;
import j0.g2;
import j0.i2;
import j0.j1;
import j0.l;
import j0.l3;
import j0.n;
import j0.v;
import java.util.List;
import n1.i0;
import n1.x;
import p1.g;
import pc.p;
import qc.q;
import w.a;
import w.y;
import w.z;

/* compiled from: TaskFormSelector.kt */
/* loaded from: classes4.dex */
public final class TaskFormSelectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <V> void TaskFormSelection(V r40, boolean r41, java.lang.String r42, pc.l<? super V, dc.w> r43, androidx.compose.ui.e r44, j0.l r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.tasks.form.TaskFormSelectorKt.TaskFormSelection(java.lang.Object, boolean, java.lang.String, pc.l, androidx.compose.ui.e, j0.l, int, int):void");
    }

    /* renamed from: TaskFormSelector-HYR8e34  reason: not valid java name */
    public static final <V> void m183TaskFormSelectorHYR8e34(V v10, List<LabeledValue<V>> list, pc.l<? super V, w> lVar, androidx.compose.ui.e eVar, int i10, float f10, j0.l lVar2, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        int i13;
        float f11;
        List<List> S;
        q.i(list, "values");
        q.i(lVar, "onSelect");
        j0.l q10 = lVar2.q(-1597248729);
        if ((i12 & 8) != 0) {
            eVar2 = androidx.compose.ui.e.f2335a;
        } else {
            eVar2 = eVar;
        }
        if ((i12 & 16) != 0) {
            i13 = 2;
        } else {
            i13 = i10;
        }
        if ((i12 & 32) != 0) {
            f11 = j2.h.j(10);
        } else {
            f11 = f10;
        }
        if (n.K()) {
            n.V(-1597248729, i11, -1, "com.habitrpg.android.habitica.ui.views.tasks.form.TaskFormSelector (TaskFormSelector.kt:48)");
        }
        a.e m10 = w.a.f25135a.m(f11);
        int i14 = (i11 >> 9) & 14;
        q10.e(-483455358);
        int i15 = i14 >> 3;
        i0 a10 = w.h.a(m10, v0.b.f24258a.j(), q10, (i15 & 112) | (i15 & 14));
        q10.e(-1323940314);
        int i16 = 0;
        int a11 = j0.j.a(q10, 0);
        v F = q10.F();
        g.a aVar = p1.g.f20790l;
        pc.a<p1.g> a12 = aVar.a();
        pc.q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(eVar2);
        int i17 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
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
        p<p1.g, Integer, w> b10 = aVar.b();
        if (a14.n() || !q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b10);
        }
        a13.invoke(i2.a(i2.b(q10)), q10, Integer.valueOf((i17 >> 3) & 112));
        q10.e(2058660585);
        w.k kVar = w.k.f25176a;
        q10.e(-1766686551);
        S = b0.S(list, i13);
        for (List<LabeledValue> list2 : S) {
            a.e m11 = w.a.f25135a.m(f11);
            q10.e(693286680);
            e.a aVar2 = androidx.compose.ui.e.f2335a;
            i0 a15 = y.a(m11, v0.b.f24258a.k(), q10, i16);
            q10.e(-1323940314);
            int a16 = j0.j.a(q10, i16);
            v F2 = q10.F();
            g.a aVar3 = p1.g.f20790l;
            pc.a<p1.g> a17 = aVar3.a();
            pc.q<i2<p1.g>, j0.l, Integer, w> a18 = x.a(aVar2);
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
            p<p1.g, Integer, w> b11 = aVar3.b();
            if (a19.n() || !q.d(a19.f(), Integer.valueOf(a16))) {
                a19.J(Integer.valueOf(a16));
                a19.I(Integer.valueOf(a16), b11);
            }
            a18.invoke(i2.a(i2.b(q10)), q10, Integer.valueOf(i16));
            q10.e(2058660585);
            w.b0 b0Var = w.b0.f25155a;
            q10.e(-1377685653);
            for (LabeledValue labeledValue : list2) {
                TaskFormSelection(labeledValue.getValue(), q.d(v10, labeledValue.getValue()), labeledValue.getLabel(), lVar, z.a(b0Var, m.h(androidx.compose.ui.e.f2335a, 0.0f, 1, null), 1.0f, false, 2, null), q10, (i11 & 8) | ((i11 << 3) & 7168), 0);
            }
            q10.N();
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            i16 = 0;
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
            w10.a(new TaskFormSelectorKt$TaskFormSelector$2(v10, list, lVar, eVar2, i13, f11, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TaskFormSelectorPreview(j0.l lVar, int i10) {
        List l10;
        j0.l q10 = lVar.q(699540536);
        if (i10 == 0 && q10.t()) {
            q10.z();
        } else {
            if (n.K()) {
                n.V(699540536, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.form.TaskFormSelectorPreview (TaskFormSelector.kt:119)");
            }
            q10.e(-492369756);
            Object f10 = q10.f();
            l.a aVar = j0.l.f18688a;
            if (f10 == aVar.a()) {
                f10 = d3.e("second", null, 2, null);
                q10.J(f10);
            }
            q10.N();
            j1 j1Var = (j1) f10;
            Object value = j1Var.getValue();
            l10 = t.l(new LabeledValue("First", "first"), new LabeledValue("Second", "second"), new LabeledValue("Third", "third"), new LabeledValue("Fourth", "fourth"), new LabeledValue("Fifth", "Fifth"), new LabeledValue("Sixth", "sixth"));
            q10.e(1157296644);
            boolean Q = q10.Q(j1Var);
            Object f11 = q10.f();
            if (Q || f11 == aVar.a()) {
                f11 = new TaskFormSelectorKt$TaskFormSelectorPreview$1$1(j1Var);
                q10.J(f11);
            }
            q10.N();
            m183TaskFormSelectorHYR8e34(value, l10, (pc.l) f11, m.s(androidx.compose.ui.e.f2335a, j2.h.j(300)), 0, 0.0f, q10, 3072, 48);
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new TaskFormSelectorKt$TaskFormSelectorPreview$2(i10));
        }
    }
}
