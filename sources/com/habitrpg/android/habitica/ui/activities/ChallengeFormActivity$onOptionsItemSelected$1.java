package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaProgressDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;

/* compiled from: ChallengeFormActivity.kt */
/* loaded from: classes4.dex */
final class ChallengeFormActivity$onOptionsItemSelected$1 extends qc.r implements pc.l<Throwable, dc.w> {
    final /* synthetic */ HabiticaProgressDialog $dialog;
    final /* synthetic */ ChallengeFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFormActivity$onOptionsItemSelected$1(HabiticaProgressDialog habiticaProgressDialog, ChallengeFormActivity challengeFormActivity) {
        super(1);
        this.$dialog = habiticaProgressDialog;
        this.this$0 = challengeFormActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        invoke2(th);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        qc.q.i(th, "it");
        HabiticaProgressDialog habiticaProgressDialog = this.$dialog;
        if (habiticaProgressDialog != null) {
            habiticaProgressDialog.dismiss();
        }
        this.this$0.savingInProgress = false;
        ExceptionHandler.Companion.reportError(th);
    }
}
