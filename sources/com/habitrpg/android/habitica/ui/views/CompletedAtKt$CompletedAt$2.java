package com.habitrpg.android.habitica.ui.views;

import dc.w;
import j0.z1;
import java.util.Date;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CompletedAt.kt */
/* loaded from: classes4.dex */
public final class CompletedAtKt$CompletedAt$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Date $completedAt;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompletedAtKt$CompletedAt$2(Date date, int i10) {
        super(2);
        this.$completedAt = date;
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        CompletedAtKt.CompletedAt(this.$completedAt, lVar, z1.a(this.$$changed | 1));
    }
}
