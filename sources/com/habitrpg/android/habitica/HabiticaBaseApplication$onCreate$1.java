package com.habitrpg.android.habitica;

import com.habitrpg.android.habitica.helpers.Analytics;
import qc.r;

/* compiled from: HabiticaBaseApplication.kt */
/* loaded from: classes4.dex */
final class HabiticaBaseApplication$onCreate$1 extends r implements pc.l<Throwable, dc.w> {
    public static final HabiticaBaseApplication$onCreate$1 INSTANCE = new HabiticaBaseApplication$onCreate$1();

    HabiticaBaseApplication$onCreate$1() {
        super(1);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        invoke2(th);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        qc.q.i(th, "it");
        Analytics.INSTANCE.logException(th);
    }
}
