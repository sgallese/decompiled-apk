package com.habitrpg.android.habitica.ui.fragments.preferences;

import android.content.Context;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaProgressDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import dc.w;
import qc.q;
import qc.r;
import retrofit2.HttpException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountPreferenceFragment.kt */
/* loaded from: classes4.dex */
public final class AccountPreferenceFragment$deleteAccount$1 extends r implements pc.l<Throwable, w> {
    final /* synthetic */ HabiticaProgressDialog $dialog;
    final /* synthetic */ AccountPreferenceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceFragment$deleteAccount$1(HabiticaProgressDialog habiticaProgressDialog, AccountPreferenceFragment accountPreferenceFragment) {
        super(1);
        this.$dialog = habiticaProgressDialog;
        this.this$0 = accountPreferenceFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        q.i(th, "throwable");
        HabiticaProgressDialog habiticaProgressDialog = this.$dialog;
        if (habiticaProgressDialog != null) {
            habiticaProgressDialog.dismiss();
        }
        if ((th instanceof HttpException) && ((HttpException) th).code() == 401) {
            Context context = this.this$0.getContext();
            HabiticaAlertDialog habiticaAlertDialog = context != null ? new HabiticaAlertDialog(context) : null;
            if (habiticaAlertDialog != null) {
                habiticaAlertDialog.setTitle(R.string.authentication_error_title);
            }
            if (habiticaAlertDialog != null) {
                habiticaAlertDialog.setMessage(R.string.incorrect_password);
            }
            if (habiticaAlertDialog != null) {
                AlertDialogExtensionsKt.addCloseButton$default(habiticaAlertDialog, false, null, 3, null);
            }
            if (habiticaAlertDialog != null) {
                habiticaAlertDialog.show();
            }
        }
        ExceptionHandler.Companion.reportError(th);
    }
}
