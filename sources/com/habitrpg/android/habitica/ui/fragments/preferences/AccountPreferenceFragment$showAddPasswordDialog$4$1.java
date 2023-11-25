package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import android.content.Context;
import androidx.fragment.app.q;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.helpers.KeyboardUtil;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import com.habitrpg.android.habitica.ui.views.ValidatingEditText;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountPreferenceFragment.kt */
/* loaded from: classes4.dex */
public final class AccountPreferenceFragment$showAddPasswordDialog$4$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ValidatingEditText $emailEditText;
    final /* synthetic */ ValidatingEditText $passwordEditText;
    final /* synthetic */ ValidatingEditText $passwordRepeatEditText;
    final /* synthetic */ boolean $showEmail;
    final /* synthetic */ AccountPreferenceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountPreferenceFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showAddPasswordDialog$4$1$1", f = "AccountPreferenceFragment.kt", l = {362}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showAddPasswordDialog$4$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $email;
        final /* synthetic */ ValidatingEditText $passwordEditText;
        final /* synthetic */ ValidatingEditText $passwordRepeatEditText;
        int label;
        final /* synthetic */ AccountPreferenceFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AccountPreferenceFragment accountPreferenceFragment, String str, ValidatingEditText validatingEditText, ValidatingEditText validatingEditText2, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = accountPreferenceFragment;
            this.$email = str;
            this.$passwordEditText = validatingEditText;
            this.$passwordRepeatEditText = validatingEditText2;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$email, this.$passwordEditText, this.$passwordRepeatEditText, this.$context, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            String str;
            String str2;
            String str3;
            String str4;
            String username;
            SnackbarActivity snackbarActivity;
            d10 = ic.d.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ApiClient apiClient = this.this$0.getApiClient();
                User user$Habitica_2311256681_prodRelease = this.this$0.getUser$Habitica_2311256681_prodRelease();
                if (user$Habitica_2311256681_prodRelease == null || (username = user$Habitica_2311256681_prodRelease.getUsername()) == null) {
                    str = "";
                } else {
                    str = username;
                }
                String str5 = this.$email;
                if (str5 == null) {
                    str2 = "";
                } else {
                    str2 = str5;
                }
                String text = this.$passwordEditText.getText();
                if (text == null) {
                    str3 = "";
                } else {
                    str3 = text;
                }
                String text2 = this.$passwordRepeatEditText.getText();
                if (text2 == null) {
                    str4 = "";
                } else {
                    str4 = text2;
                }
                this.label = 1;
                if (apiClient.registerUser(str, str2, str3, str4, this) == d10) {
                    return d10;
                }
            }
            q activity = this.this$0.getActivity();
            if (activity instanceof SnackbarActivity) {
                snackbarActivity = (SnackbarActivity) activity;
            } else {
                snackbarActivity = null;
            }
            SnackbarActivity snackbarActivity2 = snackbarActivity;
            if (snackbarActivity2 != null) {
                SnackbarActivity.DefaultImpls.showSnackbar$default(snackbarActivity2, null, null, this.$context.getString(R.string.password_added), null, null, null, null, HabiticaSnackbar.SnackbarDisplayType.SUCCESS, false, 379, null);
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceFragment$showAddPasswordDialog$4$1(AccountPreferenceFragment accountPreferenceFragment, ValidatingEditText validatingEditText, ValidatingEditText validatingEditText2, ValidatingEditText validatingEditText3, boolean z10, Context context) {
        super(2);
        this.this$0 = accountPreferenceFragment;
        this.$emailEditText = validatingEditText;
        this.$passwordEditText = validatingEditText2;
        this.$passwordRepeatEditText = validatingEditText3;
        this.$showEmail = z10;
        this.$context = context;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        Authentication authentication;
        String findFirstSocialEmail;
        String str;
        qc.q.i(habiticaAlertDialog, "dialog");
        KeyboardUtil.Companion.dismissKeyboard(this.this$0.getActivity());
        ValidatingEditText validatingEditText = this.$emailEditText;
        if (validatingEditText != null) {
            ValidatingEditText.showErrorIfNecessary$default(validatingEditText, null, 1, null);
        }
        ValidatingEditText validatingEditText2 = this.$passwordEditText;
        if (validatingEditText2 != null) {
            ValidatingEditText.showErrorIfNecessary$default(validatingEditText2, null, 1, null);
        }
        ValidatingEditText validatingEditText3 = this.$passwordRepeatEditText;
        if (validatingEditText3 != null) {
            ValidatingEditText.showErrorIfNecessary$default(validatingEditText3, null, 1, null);
        }
        boolean z10 = false;
        if (this.$showEmail) {
            ValidatingEditText validatingEditText4 = this.$emailEditText;
            if (!(validatingEditText4 != null && validatingEditText4.isValid())) {
                return;
            }
        }
        ValidatingEditText validatingEditText5 = this.$passwordEditText;
        if (validatingEditText5 != null && validatingEditText5.isValid()) {
            ValidatingEditText validatingEditText6 = this.$passwordRepeatEditText;
            if (validatingEditText6 != null && validatingEditText6.isValid()) {
                z10 = true;
            }
            if (z10) {
                if (this.$showEmail) {
                    ValidatingEditText validatingEditText7 = this.$emailEditText;
                    if (validatingEditText7 != null) {
                        findFirstSocialEmail = validatingEditText7.getText();
                        str = findFirstSocialEmail;
                    }
                    str = null;
                } else {
                    User user$Habitica_2311256681_prodRelease = this.this$0.getUser$Habitica_2311256681_prodRelease();
                    if (user$Habitica_2311256681_prodRelease != null && (authentication = user$Habitica_2311256681_prodRelease.getAuthentication()) != null) {
                        findFirstSocialEmail = authentication.findFirstSocialEmail();
                        str = findFirstSocialEmail;
                    }
                    str = null;
                }
                ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, str, this.$passwordEditText, this.$passwordRepeatEditText, this.$context, null), 1, null);
                habiticaAlertDialog.dismiss();
            }
        }
    }
}
