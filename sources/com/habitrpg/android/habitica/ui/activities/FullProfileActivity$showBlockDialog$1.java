package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FullProfileActivity.kt */
/* loaded from: classes4.dex */
public final class FullProfileActivity$showBlockDialog$1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
    final /* synthetic */ FullProfileActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullProfileActivity$showBlockDialog$1(FullProfileActivity fullProfileActivity) {
        super(2);
        this.this$0 = fullProfileActivity;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        this.this$0.useBlock();
    }
}
