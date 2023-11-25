package com.habitrpg.android.habitica.ui.views.progress;

import androidx.compose.foundation.c;
import b0.i;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import f0.s0;
import g0.e;
import j0.l;
import j0.n;
import j2.h;
import pc.p;
import pc.q;
import qc.r;
import r.j;

/* compiled from: HabiticaPullRefreshIndicator.kt */
/* loaded from: classes4.dex */
final class HabiticaPullRefreshIndicatorKt$HabiticaPullRefreshIndicator$1 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $isRefreshing;
    final /* synthetic */ e $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HabiticaPullRefreshIndicator.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.progress.HabiticaPullRefreshIndicatorKt$HabiticaPullRefreshIndicator$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements q<j, l, Integer, w> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ boolean $isRefreshing;
        final /* synthetic */ e $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z10, e eVar, int i10) {
            super(3);
            this.$isRefreshing = z10;
            this.$state = eVar;
            this.$$dirty = i10;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ w invoke(j jVar, l lVar, Integer num) {
            invoke(jVar, lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j jVar, l lVar, int i10) {
            qc.q.i(jVar, "$this$AnimatedVisibility");
            if (n.K()) {
                n.V(-207976581, i10, -1, "com.habitrpg.android.habitica.ui.views.progress.HabiticaPullRefreshIndicator.<anonymous>.<anonymous> (HabiticaPullRefreshIndicator.kt:60)");
            }
            HabiticaCircularProgressViewKt.m171HabiticaCircularProgressViewQuyCDyQ(c.c(androidx.compose.foundation.layout.j.i(t.e.f(androidx.compose.ui.e.f2335a, h.j(1), HabiticaTheme.INSTANCE.getColors(lVar, 6).m141getWindowBackground0d7_KjU(), i.g()), h.j(4)), s0.f15068a.a(lVar, s0.f15069b).n(), i.g()), this.$isRefreshing ? 1.0f : this.$state.j(), this.$isRefreshing, h.j(40), 0, h.j(6), lVar, ((this.$$dirty << 3) & 896) | 199680, 16);
            if (n.K()) {
                n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaPullRefreshIndicatorKt$HabiticaPullRefreshIndicator$1(boolean z10, e eVar, int i10) {
        super(2);
        this.$isRefreshing = z10;
        this.$state = eVar;
        this.$$dirty = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-2101355869, i10, -1, "com.habitrpg.android.habitica.ui.views.progress.HabiticaPullRefreshIndicator.<anonymous> (HabiticaPullRefreshIndicator.kt:55)");
        }
        r.i.e(this.$isRefreshing || this.$state.j() > 0.0f, null, r.q.v(null, 0.0f, 3, null), r.q.x(null, 0.0f, 3, null), null, q0.c.b(lVar, -207976581, true, new AnonymousClass1(this.$isRefreshing, this.$state, this.$$dirty)), lVar, 200064, 18);
        if (n.K()) {
            n.U();
        }
    }
}
