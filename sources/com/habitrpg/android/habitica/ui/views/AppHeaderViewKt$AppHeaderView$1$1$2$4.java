package com.habitrpg.android.habitica.ui.views;

import a1.q1;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import f0.s0;
import j0.i2;
import j0.l3;
import j0.n;
import j0.v;
import n1.i0;
import n1.x;
import p1.g;
import pc.p;
import pc.q;
import qc.r;
import t.u;
import v0.b;
import w.a;
import w.b0;
import w.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppHeaderView.kt */
/* loaded from: classes4.dex */
public final class AppHeaderViewKt$AppHeaderView$1$1$2$4 extends r implements q<r.j, j0.l, Integer, w> {
    final /* synthetic */ TeamPlan $teamPlan;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppHeaderView.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.AppHeaderViewKt$AppHeaderView$1$1$2$4$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements pc.a<w> {
        final /* synthetic */ TeamPlan $teamPlan;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TeamPlan teamPlan) {
            super(0);
            this.$teamPlan = teamPlan;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
            dc.l[] lVarArr = new dc.l[2];
            TeamPlan teamPlan = this.$teamPlan;
            lVarArr[0] = dc.r.a("groupID", teamPlan != null ? teamPlan.getId() : null);
            lVarArr[1] = dc.r.a("tabToOpen", 1);
            mainNavigationController.navigate(R.id.guildFragment, androidx.core.os.e.a(lVarArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppHeaderViewKt$AppHeaderView$1$1$2$4(TeamPlan teamPlan) {
        super(3);
        this.$teamPlan = teamPlan;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(r.j jVar, j0.l lVar, Integer num) {
        invoke(jVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(r.j jVar, j0.l lVar, int i10) {
        qc.q.i(jVar, "$this$AnimatedVisibility");
        if (n.K()) {
            n.V(-1715907804, i10, -1, "com.habitrpg.android.habitica.ui.views.AppHeaderView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppHeaderView.kt:207)");
        }
        a.e b10 = w.a.f25135a.b();
        b.c h10 = v0.b.f24258a.h();
        androidx.compose.ui.e e10 = androidx.compose.foundation.e.e(androidx.compose.foundation.c.d(x0.e.a(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.m.s(androidx.compose.foundation.layout.j.m(androidx.compose.ui.e.f2335a, j2.h.j(12), 0.0f, 0.0f, 0.0f, 14, null), j2.h.j(72)), j2.h.j(48)), s0.f15068a.b(lVar, s0.f15069b).b()), s1.c.a(R.color.window_background, lVar, 6), null, 2, null), false, null, null, new AnonymousClass1(this.$teamPlan), 7, null);
        lVar.e(693286680);
        i0 a10 = y.a(b10, h10, lVar, 54);
        lVar.e(-1323940314);
        int a11 = j0.j.a(lVar, 0);
        v F = lVar.F();
        g.a aVar = p1.g.f20790l;
        pc.a<p1.g> a12 = aVar.a();
        q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(e10);
        if (!(lVar.u() instanceof j0.f)) {
            j0.j.c();
        }
        lVar.s();
        if (lVar.n()) {
            lVar.B(a12);
        } else {
            lVar.H();
        }
        j0.l a14 = l3.a(lVar);
        l3.b(a14, a10, aVar.e());
        l3.b(a14, F, aVar.g());
        p<p1.g, Integer, w> b11 = aVar.b();
        if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b11);
        }
        a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        b0 b0Var = b0.f25155a;
        u.a(s1.f.d(R.drawable.icon_chat, lVar, 6), null, null, null, null, 0.0f, q1.a.b(q1.f163b, s1.c.a(R.color.text_ternary, lVar, 6), 0, 2, null), lVar, 56, 60);
        lVar.N();
        lVar.O();
        lVar.N();
        lVar.N();
        if (n.K()) {
            n.U();
        }
    }
}
