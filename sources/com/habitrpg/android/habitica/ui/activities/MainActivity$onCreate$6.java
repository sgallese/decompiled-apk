package com.habitrpg.android.habitica.ui.activities;

import a1.p1;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.helpers.LifecycleCollectKt;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.android.habitica.ui.views.AppHeaderViewKt;
import com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt;
import com.habitrpg.android.habitica.ui.views.ComposableAvatarViewKt;
import com.habitrpg.android.habitica.ui.views.GroupPlanMemberListKt;
import com.habitrpg.android.habitica.ui.views.HabiticaButtonKt;
import j0.g3;
import j0.l3;
import j0.y2;
import java.util.List;
import p1.g;
import v0.b;
import w.a;

/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
final class MainActivity$onCreate$6 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$6$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ MainActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MainActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$6$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02681 extends qc.r implements pc.a<dc.w> {
            final /* synthetic */ g3<User> $user$delegate;
            final /* synthetic */ MainActivity this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: MainActivity.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$6$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C02691 extends qc.r implements pc.q<pc.a<? extends dc.w>, j0.l, Integer, dc.w> {
                final /* synthetic */ g3<User> $user$delegate;
                final /* synthetic */ MainActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C02691(g3<? extends User> g3Var, MainActivity mainActivity) {
                    super(3);
                    this.$user$delegate = g3Var;
                    this.this$0 = mainActivity;
                }

                @Override // pc.q
                public /* bridge */ /* synthetic */ dc.w invoke(pc.a<? extends dc.w> aVar, j0.l lVar, Integer num) {
                    invoke((pc.a<dc.w>) aVar, lVar, num.intValue());
                    return dc.w.f13270a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r31v0, types: [j0.l, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v13 */
                /* JADX WARN: Type inference failed for: r8v17 */
                public final void invoke(pc.a<dc.w> aVar, j0.l lVar, int i10) {
                    int i11;
                    qc.q.i(aVar, "dismiss");
                    if ((i10 & 14) == 0) {
                        i11 = i10 | (lVar.l(aVar) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 91) == 18 && lVar.t()) {
                        lVar.z();
                        return;
                    }
                    if (j0.n.K()) {
                        j0.n.V(-1925146626, i11, -1, "com.habitrpg.android.habitica.ui.activities.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:312)");
                    }
                    b.a aVar2 = v0.b.f24258a;
                    b.InterfaceC0571b f10 = aVar2.f();
                    w.a aVar3 = w.a.f25135a;
                    a.e m10 = aVar3.m(j2.h.j(4));
                    e.a aVar4 = androidx.compose.ui.e.f2335a;
                    androidx.compose.ui.e i12 = androidx.compose.foundation.layout.j.i(aVar4, j2.h.j(22));
                    g3<User> g3Var = this.$user$delegate;
                    MainActivity mainActivity = this.this$0;
                    lVar.e(-483455358);
                    n1.i0 a10 = w.h.a(m10, f10, lVar, 54);
                    lVar.e(-1323940314);
                    int a11 = j0.j.a(lVar, 0);
                    j0.v F = lVar.F();
                    g.a aVar5 = p1.g.f20790l;
                    pc.a<p1.g> a12 = aVar5.a();
                    pc.q<j0.i2<p1.g>, j0.l, Integer, dc.w> a13 = n1.x.a(i12);
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
                    l3.b(a14, a10, aVar5.e());
                    l3.b(a14, F, aVar5.g());
                    pc.p<p1.g, Integer, dc.w> b10 = aVar5.b();
                    if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                        a14.J(Integer.valueOf(a11));
                        a14.I(Integer.valueOf(a11), b10);
                    }
                    a13.invoke(j0.i2.a(j0.i2.b(lVar)), lVar, 0);
                    lVar.e(2058660585);
                    w.k kVar = w.k.f25176a;
                    ComposableAvatarViewKt.ComposableAvatarView(AnonymousClass1.invoke$lambda$0(g3Var), null, lVar, User.$stable, 2);
                    b.InterfaceC0571b f11 = aVar2.f();
                    a.e m11 = aVar3.m(j2.h.j(15));
                    lVar.e(-483455358);
                    n1.i0 a15 = w.h.a(m11, f11, lVar, 54);
                    lVar.e(-1323940314);
                    int a16 = j0.j.a(lVar, 0);
                    j0.v F2 = lVar.F();
                    pc.a<p1.g> a17 = aVar5.a();
                    pc.q<j0.i2<p1.g>, j0.l, Integer, dc.w> a18 = n1.x.a(aVar4);
                    if (!(lVar.u() instanceof j0.f)) {
                        j0.j.c();
                    }
                    lVar.s();
                    if (lVar.n()) {
                        lVar.B(a17);
                    } else {
                        lVar.H();
                    }
                    j0.l a19 = l3.a(lVar);
                    l3.b(a19, a15, aVar5.e());
                    l3.b(a19, F2, aVar5.g());
                    pc.p<p1.g, Integer, dc.w> b11 = aVar5.b();
                    if (a19.n() || !qc.q.d(a19.f(), Integer.valueOf(a16))) {
                        a19.J(Integer.valueOf(a16));
                        a19.I(Integer.valueOf(a16), b11);
                    }
                    a18.invoke(j0.i2.a(j0.i2.b(lVar)), lVar, 0);
                    lVar.e(2058660585);
                    HabiticaTheme habiticaTheme = HabiticaTheme.INSTANCE;
                    int i13 = HabiticaTheme.$stable;
                    long m140getTintedUiSub0d7_KjU = habiticaTheme.getColors(lVar, i13).m140getTintedUiSub0d7_KjU();
                    p1.a aVar6 = a1.p1.f146b;
                    long f12 = aVar6.f();
                    float f13 = 48;
                    androidx.compose.ui.e i14 = androidx.compose.foundation.layout.m.i(aVar4, j2.h.j(f13));
                    lVar.e(511388516);
                    boolean Q = lVar.Q(aVar) | lVar.Q(g3Var);
                    Object f14 = lVar.f();
                    if (Q || f14 == j0.l.f18688a.a()) {
                        f14 = new MainActivity$onCreate$6$1$1$1$1$1$1$1(aVar, g3Var);
                        lVar.J(f14);
                    }
                    lVar.N();
                    ComposableSingletons$MainActivityKt composableSingletons$MainActivityKt = ComposableSingletons$MainActivityKt.INSTANCE;
                    HabiticaButtonKt.m163HabiticaButtonsucejHM(m140getTintedUiSub0d7_KjU, f12, f14, i14, null, 0L, composableSingletons$MainActivityKt.m20getLambda1$Habitica_2311256681_prodRelease(), lVar, 1575984, 48);
                    long m140getTintedUiSub0d7_KjU2 = habiticaTheme.getColors(lVar, i13).m140getTintedUiSub0d7_KjU();
                    long f15 = aVar6.f();
                    androidx.compose.ui.e i15 = androidx.compose.foundation.layout.m.i(aVar4, j2.h.j(f13));
                    lVar.e(1157296644);
                    boolean Q2 = lVar.Q(aVar);
                    Object f16 = lVar.f();
                    if (Q2 || f16 == j0.l.f18688a.a()) {
                        f16 = new MainActivity$onCreate$6$1$1$1$1$1$2$1(aVar);
                        lVar.J(f16);
                    }
                    lVar.N();
                    HabiticaButtonKt.m163HabiticaButtonsucejHM(m140getTintedUiSub0d7_KjU2, f15, f16, i15, null, 0L, composableSingletons$MainActivityKt.m21getLambda2$Habitica_2311256681_prodRelease(), lVar, 1575984, 48);
                    HabiticaButtonKt.m163HabiticaButtonsucejHM(habiticaTheme.getColors(lVar, i13).m140getTintedUiSub0d7_KjU(), aVar6.f(), new MainActivity$onCreate$6$1$1$1$1$1$3(aVar, g3Var, mainActivity), androidx.compose.foundation.layout.m.i(aVar4, j2.h.j(f13)), null, 0L, composableSingletons$MainActivityKt.m22getLambda3$Habitica_2311256681_prodRelease(), lVar, 1575984, 48);
                    lVar.N();
                    lVar.O();
                    lVar.N();
                    lVar.N();
                    lVar.N();
                    lVar.O();
                    lVar.N();
                    lVar.N();
                    if (j0.n.K()) {
                        j0.n.U();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C02681(MainActivity mainActivity, g3<? extends User> g3Var) {
                super(0);
                this.this$0 = mainActivity;
                this.$user$delegate = g3Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MainActivity mainActivity = this.this$0;
                BottomSheetUtilsKt.showAsBottomSheet(mainActivity, q0.c.c(-1925146626, true, new C02691(this.$user$delegate, mainActivity)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MainActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$6$1$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends qc.r implements pc.a<dc.w> {
            final /* synthetic */ MainActivity this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: MainActivity.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$6$1$2$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C02701 extends qc.r implements pc.q<pc.a<? extends dc.w>, j0.l, Integer, dc.w> {
                final /* synthetic */ MainActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02701(MainActivity mainActivity) {
                    super(3);
                    this.this$0 = mainActivity;
                }

                private static final Group invoke$lambda$0(g3<? extends Group> g3Var) {
                    return g3Var.getValue();
                }

                private static final List<Member> invoke$lambda$1(g3<? extends List<? extends Member>> g3Var) {
                    return (List) g3Var.getValue();
                }

                @Override // pc.q
                public /* bridge */ /* synthetic */ dc.w invoke(pc.a<? extends dc.w> aVar, j0.l lVar, Integer num) {
                    invoke((pc.a<dc.w>) aVar, lVar, num.intValue());
                    return dc.w.f13270a;
                }

                public final void invoke(pc.a<dc.w> aVar, j0.l lVar, int i10) {
                    qc.q.i(aVar, "onClose");
                    if ((i10 & 14) == 0) {
                        i10 |= lVar.l(aVar) ? 4 : 2;
                    }
                    if ((i10 & 91) == 18 && lVar.t()) {
                        lVar.z();
                        return;
                    }
                    if (j0.n.K()) {
                        j0.n.V(765816797, i10, -1, "com.habitrpg.android.habitica.ui.activities.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:372)");
                    }
                    g3 a10 = y2.a(this.this$0.getViewModel().getUserViewModel().getCurrentTeamPlanGroup(), null, null, lVar, 56, 2);
                    List<Member> invoke$lambda$1 = invoke$lambda$1(r0.a.a(this.this$0.getViewModel().getUserViewModel().getCurrentTeamPlanMembers(), lVar, 8));
                    Group invoke$lambda$0 = invoke$lambda$0(a10);
                    lVar.e(1157296644);
                    boolean Q = lVar.Q(aVar);
                    Object f10 = lVar.f();
                    if (Q || f10 == j0.l.f18688a.a()) {
                        f10 = new MainActivity$onCreate$6$1$2$1$1$1(aVar);
                        lVar.J(f10);
                    }
                    lVar.N();
                    GroupPlanMemberListKt.GroupPlanMemberList(invoke$lambda$1, invoke$lambda$0, (pc.l) f10, lVar, (Group.$stable << 3) | 8);
                    if (j0.n.K()) {
                        j0.n.U();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MainActivity mainActivity) {
                super(0);
                this.this$0 = mainActivity;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MainActivity mainActivity = this.this$0;
                BottomSheetUtilsKt.showAsBottomSheet(mainActivity, q0.c.c(765816797, true, new C02701(mainActivity)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MainActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$6$1$3  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends qc.r implements pc.a<dc.w> {
            final /* synthetic */ g3<User> $user$delegate;
            final /* synthetic */ MainActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(MainActivity mainActivity, g3<? extends User> g3Var) {
                super(0);
                this.this$0 = mainActivity;
                this.$user$delegate = g3Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.activity.result.b bVar;
                Flags flags;
                Bundle bundle = new Bundle();
                User invoke$lambda$0 = AnonymousClass1.invoke$lambda$0(this.$user$delegate);
                bundle.putBoolean("isInitialSelection", (invoke$lambda$0 == null || (flags = invoke$lambda$0.getFlags()) == null) ? false : flags.getClassSelected());
                Intent intent = new Intent(this.this$0, ClassSelectionActivity.class);
                intent.putExtras(bundle);
                bVar = this.this$0.classSelectionResult;
                bVar.a(intent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainActivity mainActivity) {
            super(2);
            this.this$0 = mainActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final User invoke$lambda$0(g3<? extends User> g3Var) {
            return g3Var.getValue();
        }

        private static final TeamPlan invoke$lambda$1(g3<? extends TeamPlan> g3Var) {
            return g3Var.getValue();
        }

        private static final List<Member> invoke$lambda$2(g3<? extends List<? extends Member>> g3Var) {
            return (List) g3Var.getValue();
        }

        private static final boolean invoke$lambda$3(j0.j1<Boolean> j1Var) {
            return j1Var.getValue().booleanValue();
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(2123087543, i10, -1, "com.habitrpg.android.habitica.ui.activities.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:299)");
            }
            g3 b10 = r0.a.b(this.this$0.getViewModel().getUser(), null, lVar, 56);
            g3 collectAsStateLifecycleAware = LifecycleCollectKt.collectAsStateLifecycleAware(this.this$0.getViewModel().getUserViewModel().getCurrentTeamPlan(), null, null, lVar, 56, 2);
            g3 a10 = r0.a.a(this.this$0.getViewModel().getUserViewModel().getCurrentTeamPlanMembers(), lVar, 8);
            j0.j1<Boolean> canShowTeamPlanHeader = this.this$0.getViewModel().getCanShowTeamPlanHeader();
            AppHeaderViewKt.AppHeaderView(invoke$lambda$0(b10), null, true, invoke$lambda$3(canShowTeamPlanHeader) ? invoke$lambda$1(collectAsStateLifecycleAware) : null, invoke$lambda$2(a10), new C02681(this.this$0, b10), new AnonymousClass2(this.this$0), new AnonymousClass3(this.this$0, b10), lVar, 33152 | User.$stable | (TeamPlan.$stable << 9), 2);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onCreate$6(MainActivity mainActivity) {
        super(2);
        this.this$0 = mainActivity;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(-811683422, i10, -1, "com.habitrpg.android.habitica.ui.activities.MainActivity.onCreate.<anonymous> (MainActivity.kt:298)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, 2123087543, true, new AnonymousClass1(this.this$0)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
