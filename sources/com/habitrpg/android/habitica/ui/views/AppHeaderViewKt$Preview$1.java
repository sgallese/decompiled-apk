package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import j0.n;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppHeaderView.kt */
/* loaded from: classes4.dex */
public final class AppHeaderViewKt$Preview$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ dc.l<User, TeamPlan> $data;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppHeaderView.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.AppHeaderViewKt$Preview$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements pc.a<w> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppHeaderView.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.AppHeaderViewKt$Preview$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends r implements pc.a<w> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppHeaderViewKt$Preview$1(dc.l<? extends User, ? extends TeamPlan> lVar) {
        super(2);
        this.$data = lVar;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-1595650486, i10, -1, "com.habitrpg.android.habitica.ui.views.Preview.<anonymous> (AppHeaderView.kt:396)");
        }
        AppHeaderViewKt.AppHeaderView(this.$data.c(), androidx.compose.foundation.layout.j.i(androidx.compose.foundation.c.d(androidx.compose.ui.e.f2335a, HabiticaTheme.INSTANCE.getColors(lVar, HabiticaTheme.$stable).m125getContentBackground0d7_KjU(), null, 2, null), j2.h.j(8)), false, this.$data.d(), null, null, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, lVar, 14155776 | User.$stable | (TeamPlan.$stable << 9), 52);
        if (n.K()) {
            n.U();
        }
    }
}
