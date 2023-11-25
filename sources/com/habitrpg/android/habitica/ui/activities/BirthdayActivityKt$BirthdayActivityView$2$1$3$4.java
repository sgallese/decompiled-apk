package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BirthdayActivity.kt */
/* loaded from: classes4.dex */
public final class BirthdayActivityKt$BirthdayActivityView$2$1$3$4 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ boolean $hasEquipped;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayActivityKt$BirthdayActivityView$2$1$3$4(boolean z10) {
        super(2);
        this.$hasEquipped = z10;
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
            j0.n.V(1426884429, i10, -1, "com.habitrpg.android.habitica.ui.activities.BirthdayActivityView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BirthdayActivity.kt:384)");
        }
        f0.f2.b(s1.h.a(this.$hasEquipped ? R.string.unequip : R.string.equip, lVar, 0), null, 0L, j2.t.g(18), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 3072, 0, 131062);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
