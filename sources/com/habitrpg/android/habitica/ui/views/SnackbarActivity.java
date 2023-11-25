package com.habitrpg.android.habitica.ui.views;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import qc.q;

/* compiled from: HabiticaSnackbar.kt */
/* loaded from: classes4.dex */
public interface SnackbarActivity {

    /* compiled from: HabiticaSnackbar.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void showSnackbar(SnackbarActivity snackbarActivity, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, View view, Drawable drawable2, Integer num, String str, HabiticaSnackbar.SnackbarDisplayType snackbarDisplayType, boolean z10) {
            q.i(snackbarDisplayType, "displayType");
            HabiticaSnackbar.Companion.showSnackbar(snackbarActivity.snackbarContainer(), drawable, charSequence, charSequence2, view, drawable2, num, str, snackbarDisplayType, (r29 & 512) != 0 ? false : z10, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : false, (r29 & RecyclerView.m.FLAG_MOVED) != 0 ? 0 : 0);
        }

        public static /* synthetic */ void showSnackbar$default(SnackbarActivity snackbarActivity, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, View view, Drawable drawable2, Integer num, String str, HabiticaSnackbar.SnackbarDisplayType snackbarDisplayType, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    drawable = null;
                }
                if ((i10 & 2) != 0) {
                    charSequence = null;
                }
                if ((i10 & 4) != 0) {
                    charSequence2 = null;
                }
                if ((i10 & 8) != 0) {
                    view = null;
                }
                if ((i10 & 16) != 0) {
                    drawable2 = null;
                }
                if ((i10 & 32) != 0) {
                    num = null;
                }
                if ((i10 & 64) != 0) {
                    str = null;
                }
                if ((i10 & 128) != 0) {
                    snackbarDisplayType = HabiticaSnackbar.SnackbarDisplayType.NORMAL;
                }
                if ((i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    z10 = false;
                }
                snackbarActivity.showSnackbar(drawable, charSequence, charSequence2, view, drawable2, num, str, snackbarDisplayType, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSnackbar");
        }
    }

    void showSnackbar(Drawable drawable, CharSequence charSequence, CharSequence charSequence2, View view, Drawable drawable2, Integer num, String str, HabiticaSnackbar.SnackbarDisplayType snackbarDisplayType, boolean z10);

    ViewGroup snackbarContainer();
}
