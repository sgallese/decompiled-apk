package com.habitrpg.android.habitica.ui.fragments.purchases;

import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.android.habitica.ui.views.promo.BirthdayMenuViewKt;
import dc.w;
import java.util.Date;

/* compiled from: SubscriptionFragment.kt */
/* loaded from: classes4.dex */
final class SubscriptionFragment$onViewCreated$7 extends qc.r implements pc.p<j0.l, Integer, w> {
    final /* synthetic */ Date $birthdayEventEnd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment$onViewCreated$7$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, w> {
        final /* synthetic */ Date $birthdayEventEnd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Date date) {
            super(2);
            this.$birthdayEventEnd = date;
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
            if (j0.n.K()) {
                j0.n.V(-823606152, i10, -1, "com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment.onViewCreated.<anonymous>.<anonymous> (SubscriptionFragment.kt:110)");
            }
            BirthdayMenuViewKt.BirthdayBanner(this.$birthdayEventEnd, androidx.compose.foundation.layout.j.m(x0.e.a(androidx.compose.foundation.layout.j.k(androidx.compose.ui.e.f2335a, j2.h.j(20), 0.0f, 2, null), HabiticaTheme.INSTANCE.getShapes(lVar, HabiticaTheme.$stable).b()), 0.0f, 0.0f, 0.0f, j2.h.j(10), 7, null), lVar, 8, 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionFragment$onViewCreated$7(Date date) {
        super(2);
        this.$birthdayEventEnd = date;
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
        if (j0.n.K()) {
            j0.n.V(-1147778067, i10, -1, "com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment.onViewCreated.<anonymous> (SubscriptionFragment.kt:109)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, -823606152, true, new AnonymousClass1(this.$birthdayEventEnd)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
