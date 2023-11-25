package com.habitrpg.android.habitica.extensions;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import pc.p;
import qc.q;

/* compiled from: AlertDialogExtensions.kt */
/* loaded from: classes4.dex */
public final class AlertDialogExtensionsKt {
    public static final void addCancelButton(HabiticaAlertDialog habiticaAlertDialog, boolean z10, p<? super HabiticaAlertDialog, ? super Integer, w> pVar) {
        q.i(habiticaAlertDialog, "<this>");
        habiticaAlertDialog.addButton(R.string.cancel, z10, false, true, pVar);
    }

    public static /* synthetic */ void addCancelButton$default(HabiticaAlertDialog habiticaAlertDialog, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        addCancelButton(habiticaAlertDialog, z10, pVar);
    }

    public static final void addCloseButton(HabiticaAlertDialog habiticaAlertDialog, boolean z10, p<? super HabiticaAlertDialog, ? super Integer, w> pVar) {
        q.i(habiticaAlertDialog, "<this>");
        habiticaAlertDialog.addButton(R.string.close, z10, false, true, pVar);
    }

    public static /* synthetic */ void addCloseButton$default(HabiticaAlertDialog habiticaAlertDialog, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        addCloseButton(habiticaAlertDialog, z10, pVar);
    }

    public static final void addOkButton(HabiticaAlertDialog habiticaAlertDialog, boolean z10, p<? super HabiticaAlertDialog, ? super Integer, w> pVar) {
        q.i(habiticaAlertDialog, "<this>");
        habiticaAlertDialog.addButton(R.string.ok, z10, false, true, pVar);
    }

    public static /* synthetic */ void addOkButton$default(HabiticaAlertDialog habiticaAlertDialog, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        addOkButton(habiticaAlertDialog, z10, pVar);
    }
}
