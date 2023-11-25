package com.habitrpg.android.habitica.ui.views.tasks.form;

import a1.p1;
import a1.q1;
import a1.r1;
import a1.t3;
import a2.c0;
import android.content.Context;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.j0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.shared.habitica.models.tasks.TaskDifficulty;
import dc.w;
import f0.f2;
import f0.s0;
import j0.d3;
import j0.g2;
import j0.g3;
import j0.i2;
import j0.j1;
import j0.l;
import j0.l3;
import j0.n;
import j0.v;
import j2.t;
import n1.i0;
import n1.x;
import p1.g;
import pc.q;
import s.e1;
import s.g1;
import s.i1;
import s.p;
import t.u;
import v0.b;
import w.a;

/* compiled from: TaskDifficultyButtons.kt */
/* loaded from: classes4.dex */
public final class TaskDifficultyButtonsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void TaskDifficultySelection(TaskDifficulty taskDifficulty, boolean z10, t3 t3Var, String str, pc.l<? super TaskDifficulty, w> lVar, androidx.compose.ui.e eVar, j0.l lVar2, int i10, int i11) {
        int i12;
        j0.l q10 = lVar2.q(1622953798);
        e.a aVar = (i11 & 32) != 0 ? androidx.compose.ui.e.f2335a : eVar;
        if (n.K()) {
            n.V(1622953798, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.form.TaskDifficultySelection (TaskDifficultyButtons.kt:80)");
        }
        e1 d10 = g1.d(Boolean.valueOf(z10), null, q10, (i10 >> 3) & 14, 2);
        Context context = (Context) q10.C(j0.g());
        q10.e(-1939694975);
        TaskDifficultyButtonsKt$TaskDifficultySelection$$inlined$animateColor$1 taskDifficultyButtonsKt$TaskDifficultySelection$$inlined$animateColor$1 = TaskDifficultyButtonsKt$TaskDifficultySelection$$inlined$animateColor$1.INSTANCE;
        boolean booleanValue = ((Boolean) d10.m()).booleanValue();
        q10.e(248022427);
        if (n.K()) {
            n.V(248022427, 0, -1, "com.habitrpg.android.habitica.ui.views.tasks.form.TaskDifficultySelection.<anonymous> (TaskDifficultyButtons.kt:84)");
        }
        q10.e(-1182904829);
        long m138getTintedUiDetails0d7_KjU = booleanValue ? HabiticaTheme.INSTANCE.getColors(q10, 6).m138getTintedUiDetails0d7_KjU() : r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.textColorTintedSecondary));
        q10.N();
        if (n.K()) {
            n.U();
        }
        q10.N();
        b1.c t10 = p1.t(m138getTintedUiDetails0d7_KjU);
        q10.e(1157296644);
        boolean Q = q10.Q(t10);
        i1<p1, p> f10 = q10.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = r.n.a(p1.f146b).invoke(t10);
            q10.J(f10);
        }
        q10.N();
        i1 i1Var = (i1) f10;
        q10.e(-142660079);
        boolean booleanValue2 = ((Boolean) d10.g()).booleanValue();
        q10.e(248022427);
        if (n.K()) {
            n.V(248022427, 0, -1, "com.habitrpg.android.habitica.ui.views.tasks.form.TaskDifficultySelection.<anonymous> (TaskDifficultyButtons.kt:84)");
        }
        q10.e(-1182904829);
        long m138getTintedUiDetails0d7_KjU2 = booleanValue2 ? HabiticaTheme.INSTANCE.getColors(q10, 6).m138getTintedUiDetails0d7_KjU() : r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.textColorTintedSecondary));
        q10.N();
        if (n.K()) {
            n.U();
        }
        q10.N();
        p1 g10 = p1.g(m138getTintedUiDetails0d7_KjU2);
        boolean booleanValue3 = ((Boolean) d10.m()).booleanValue();
        q10.e(248022427);
        if (n.K()) {
            n.V(248022427, 0, -1, "com.habitrpg.android.habitica.ui.views.tasks.form.TaskDifficultySelection.<anonymous> (TaskDifficultyButtons.kt:84)");
        }
        q10.e(-1182904829);
        long m138getTintedUiDetails0d7_KjU3 = booleanValue3 ? HabiticaTheme.INSTANCE.getColors(q10, 6).m138getTintedUiDetails0d7_KjU() : r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.textColorTintedSecondary));
        q10.N();
        if (n.K()) {
            n.U();
        }
        q10.N();
        g3 c10 = g1.c(d10, g10, p1.g(m138getTintedUiDetails0d7_KjU3), taskDifficultyButtonsKt$TaskDifficultySelection$$inlined$animateColor$1.invoke((TaskDifficultyButtonsKt$TaskDifficultySelection$$inlined$animateColor$1) d10.k(), (e1.b) q10, (j0.l) 0), i1Var, "ColorAnimation", q10, 32768);
        q10.N();
        q10.N();
        q10.e(-1939694975);
        TaskDifficultyButtonsKt$TaskDifficultySelection$$inlined$animateColor$2 taskDifficultyButtonsKt$TaskDifficultySelection$$inlined$animateColor$2 = TaskDifficultyButtonsKt$TaskDifficultySelection$$inlined$animateColor$2.INSTANCE;
        boolean booleanValue4 = ((Boolean) d10.m()).booleanValue();
        q10.e(911475303);
        if (n.K()) {
            i12 = 0;
            n.V(911475303, 0, -1, "com.habitrpg.android.habitica.ui.views.tasks.form.TaskDifficultySelection.<anonymous> (TaskDifficultyButtons.kt:87)");
        } else {
            i12 = 0;
        }
        long b10 = booleanValue4 ? r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.textColorTintedPrimary)) : r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.textColorTintedSecondary));
        if (n.K()) {
            n.U();
        }
        q10.N();
        b1.c t11 = p1.t(b10);
        q10.e(1157296644);
        boolean Q2 = q10.Q(t11);
        i1<p1, p> f11 = q10.f();
        if (Q2 || f11 == j0.l.f18688a.a()) {
            f11 = r.n.a(p1.f146b).invoke(t11);
            q10.J(f11);
        }
        q10.N();
        i1 i1Var2 = (i1) f11;
        q10.e(-142660079);
        boolean booleanValue5 = ((Boolean) d10.g()).booleanValue();
        q10.e(911475303);
        if (n.K()) {
            n.V(911475303, i12, -1, "com.habitrpg.android.habitica.ui.views.tasks.form.TaskDifficultySelection.<anonymous> (TaskDifficultyButtons.kt:87)");
        }
        long b11 = booleanValue5 ? r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.textColorTintedPrimary)) : r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.textColorTintedSecondary));
        if (n.K()) {
            n.U();
        }
        q10.N();
        p1 g11 = p1.g(b11);
        boolean booleanValue6 = ((Boolean) d10.m()).booleanValue();
        q10.e(911475303);
        if (n.K()) {
            n.V(911475303, i12, -1, "com.habitrpg.android.habitica.ui.views.tasks.form.TaskDifficultySelection.<anonymous> (TaskDifficultyButtons.kt:87)");
        }
        long b12 = r1.b(ContextExtensionsKt.getThemeColor(context, booleanValue6 ? R.attr.textColorTintedPrimary : R.attr.textColorTintedSecondary));
        if (n.K()) {
            n.U();
        }
        q10.N();
        g3 c11 = g1.c(d10, g11, p1.g(b12), taskDifficultyButtonsKt$TaskDifficultySelection$$inlined$animateColor$2.invoke((TaskDifficultyButtonsKt$TaskDifficultySelection$$inlined$animateColor$2) d10.k(), (e1.b) q10, (j0.l) Integer.valueOf(i12)), i1Var2, "ColorAnimation", q10, 32768);
        q10.N();
        q10.N();
        b.a aVar2 = v0.b.f24258a;
        b.InterfaceC0571b f12 = aVar2.f();
        a.e m10 = w.a.f25135a.m(j2.h.j(6));
        int i13 = ((i10 >> 15) & 14) | 432;
        q10.e(-483455358);
        int i14 = i13 >> 3;
        i0 a10 = w.h.a(m10, f12, q10, (i14 & 112) | (i14 & 14));
        q10.e(-1323940314);
        int a11 = j0.j.a(q10, 0);
        v F = q10.F();
        g.a aVar3 = p1.g.f20790l;
        pc.a<p1.g> a12 = aVar3.a();
        q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(aVar);
        int i15 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
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
        l3.b(a14, a10, aVar3.e());
        l3.b(a14, F, aVar3.g());
        pc.p<p1.g, Integer, w> b13 = aVar3.b();
        if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b13);
        }
        a13.invoke(i2.a(i2.b(q10)), q10, Integer.valueOf((i15 >> 3) & 112));
        q10.e(2058660585);
        w.k kVar = w.k.f25176a;
        int i16 = ((i13 >> 6) & 112) | 6;
        v0.b d11 = aVar2.d();
        androidx.compose.ui.e o10 = m.o(androidx.compose.ui.e.f2335a, j2.h.j(57));
        long b14 = r1.b(ContextExtensionsKt.getThemeColor((Context) q10.C(j0.g()), R.attr.colorTintedBackgroundOffset));
        s0 s0Var = s0.f15068a;
        int i17 = s0.f15069b;
        androidx.compose.ui.e a15 = x0.e.a(androidx.compose.foundation.c.c(o10, b14, s0Var.b(q10, i17).b()), s0Var.b(q10, i17).b());
        q10.e(511388516);
        boolean Q3 = q10.Q(lVar) | q10.Q(taskDifficulty);
        Object f13 = q10.f();
        if (Q3 || f13 == j0.l.f18688a.a()) {
            f13 = new TaskDifficultyButtonsKt$TaskDifficultySelection$1$1$1(lVar, taskDifficulty);
            q10.J(f13);
        }
        q10.N();
        androidx.compose.ui.e e10 = androidx.compose.foundation.e.e(a15, false, null, null, (pc.a) f13, 7, null);
        q10.e(733328855);
        i0 h10 = androidx.compose.foundation.layout.d.h(d11, false, q10, 6);
        q10.e(-1323940314);
        int a16 = j0.j.a(q10, 0);
        v F2 = q10.F();
        pc.a<p1.g> a17 = aVar3.a();
        q<i2<p1.g>, j0.l, Integer, w> a18 = x.a(e10);
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
        l3.b(a19, h10, aVar3.e());
        l3.b(a19, F2, aVar3.g());
        pc.p<p1.g, Integer, w> b15 = aVar3.b();
        if (a19.n() || !qc.q.d(a19.f(), Integer.valueOf(a16))) {
            a19.J(Integer.valueOf(a16));
            a19.I(Integer.valueOf(a16), b15);
        }
        a18.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        androidx.compose.foundation.layout.e eVar2 = androidx.compose.foundation.layout.e.f2083a;
        r.i.c(kVar, z10, null, r.q.z(s.k.g(0.75f, 1500.0f, null, 4, null), 0.0f, 0L, 6, null), r.q.B(s.k.g(0.75f, 1500.0f, null, 4, null), 0.0f, 0L, 6, null), null, ComposableSingletons$TaskDifficultyButtonsKt.INSTANCE.m182getLambda1$Habitica_2311256681_prodRelease(), q10, 1600512 | (i16 & 14) | (i10 & 112), 18);
        u.b(t3Var, null, null, null, null, 0.0f, q1.a.b(q1.f163b, ((p1) c10.getValue()).y(), 0, 2, null), 0, q10, 56, 188);
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        c0.a aVar4 = c0.f239m;
        f2.b(str, null, ((p1) c11.getValue()).y(), t.g(14), null, z10 ? aVar4.d() : aVar4.e(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, ((i10 >> 9) & 14) | 3072, 0, 131026);
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
        w10.a(new TaskDifficultyButtonsKt$TaskDifficultySelection$2(taskDifficulty, z10, t3Var, str, lVar, aVar, i10, i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TaskDifficultySelector(com.habitrpg.shared.habitica.models.tasks.TaskDifficulty r22, pc.l<? super com.habitrpg.shared.habitica.models.tasks.TaskDifficulty, dc.w> r23, androidx.compose.ui.e r24, j0.l r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.tasks.form.TaskDifficultyButtonsKt.TaskDifficultySelector(com.habitrpg.shared.habitica.models.tasks.TaskDifficulty, pc.l, androidx.compose.ui.e, j0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TaskDifficultySelectorPreview(TaskDifficulty taskDifficulty, j0.l lVar, int i10) {
        int i11;
        int i12;
        j0.l q10 = lVar.q(-1647005066);
        if ((i10 & 14) == 0) {
            if (q10.Q(taskDifficulty)) {
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
        } else {
            if (n.K()) {
                n.V(-1647005066, i11, -1, "com.habitrpg.android.habitica.ui.views.tasks.form.TaskDifficultySelectorPreview (TaskDifficultyButtons.kt:131)");
            }
            q10.e(-492369756);
            Object f10 = q10.f();
            l.a aVar = j0.l.f18688a;
            if (f10 == aVar.a()) {
                f10 = d3.e(taskDifficulty, null, 2, null);
                q10.J(f10);
            }
            q10.N();
            j1 j1Var = (j1) f10;
            TaskDifficulty taskDifficulty2 = (TaskDifficulty) j1Var.getValue();
            q10.e(1157296644);
            boolean Q = q10.Q(j1Var);
            Object f11 = q10.f();
            if (Q || f11 == aVar.a()) {
                f11 = new TaskDifficultyButtonsKt$TaskDifficultySelectorPreview$1$1(j1Var);
                q10.J(f11);
            }
            q10.N();
            TaskDifficultySelector(taskDifficulty2, (pc.l) f11, m.s(androidx.compose.ui.e.f2335a, j2.h.j(300)), q10, 384, 0);
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new TaskDifficultyButtonsKt$TaskDifficultySelectorPreview$2(taskDifficulty, i10));
        }
    }
}
