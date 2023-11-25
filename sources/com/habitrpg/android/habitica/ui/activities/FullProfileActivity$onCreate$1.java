package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.android.habitica.ui.views.AppHeaderViewKt;
import com.habitrpg.shared.habitica.models.Avatar;

/* compiled from: FullProfileActivity.kt */
/* loaded from: classes4.dex */
final class FullProfileActivity$onCreate$1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ FullProfileActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FullProfileActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ FullProfileActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FullProfileActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02671 extends qc.r implements pc.a<dc.w> {
            public static final C02671 INSTANCE = new C02671();

            C02671() {
                super(0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FullProfileActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$1$1$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends qc.r implements pc.a<dc.w> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FullProfileActivity fullProfileActivity) {
            super(2);
            this.this$0 = fullProfileActivity;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            j0.j1 j1Var;
            boolean isMyProfile;
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-1620611751, i10, -1, "com.habitrpg.android.habitica.ui.activities.FullProfileActivity.onCreate.<anonymous>.<anonymous> (FullProfileActivity.kt:111)");
            }
            j1Var = this.this$0.member;
            Avatar avatar = (Avatar) j1Var.getValue();
            isMyProfile = this.this$0.isMyProfile();
            AppHeaderViewKt.AppHeaderView(avatar, null, isMyProfile, null, null, null, C02671.INSTANCE, AnonymousClass2.INSTANCE, lVar, Member.$stable | 14155776, 58);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullProfileActivity$onCreate$1(FullProfileActivity fullProfileActivity) {
        super(2);
        this.this$0 = fullProfileActivity;
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
            j0.n.V(-1881839356, i10, -1, "com.habitrpg.android.habitica.ui.activities.FullProfileActivity.onCreate.<anonymous> (FullProfileActivity.kt:110)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, -1620611751, true, new AnonymousClass1(this.this$0)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
