package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BirthdayActivity.kt */
/* loaded from: classes4.dex */
public final class BirthdayActivityKt$BirthdayActivityView$2$1$3$7 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ String $price;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayActivityKt$BirthdayActivityView$2$1$3$7(String str) {
        super(2);
        this.$price = str;
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
            j0.n.V(-1063423274, i10, -1, "com.habitrpg.android.habitica.ui.activities.BirthdayActivityView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BirthdayActivity.kt:413)");
        }
        f0.f2.b(s1.h.b(R.string.buy_for_x, new Object[]{this.$price}, lVar, 70), null, 0L, j2.t.g(18), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 3072, 0, 131062);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
