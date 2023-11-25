package com.habitrpg.android.habitica.ui.viewmodels;

import ad.a1;
import ad.l0;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.activity.result.b;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.api.HostConfig;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.KeyHelper;
import com.habitrpg.common.habitica.models.auth.UserAuthResponse;
import dc.w;
import pc.l;
import qc.b0;
import qc.h;
import qc.q;

/* compiled from: AuthenticationViewModel.kt */
/* loaded from: classes4.dex */
public final class AuthenticationViewModel {
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private static final int REQUEST_CODE_RECOVER_FROM_PLAY_SERVICES_ERROR = 1001;
    private final ApiClient apiClient;
    private final AuthenticationHandler authenticationHandler;
    private String googleEmail;
    private final HostConfig hostConfig;
    private final KeyHelper keyHelper;
    private final SharedPreferences sharedPrefs;
    private final UserRepository userRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AuthenticationViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public AuthenticationViewModel(ApiClient apiClient, UserRepository userRepository, SharedPreferences sharedPreferences, AuthenticationHandler authenticationHandler, HostConfig hostConfig, KeyHelper keyHelper) {
        q.i(apiClient, "apiClient");
        q.i(userRepository, "userRepository");
        q.i(sharedPreferences, "sharedPrefs");
        q.i(authenticationHandler, "authenticationHandler");
        q.i(hostConfig, "hostConfig");
        this.apiClient = apiClient;
        this.userRepository = userRepository;
        this.sharedPrefs = sharedPreferences;
        this.authenticationHandler = authenticationHandler;
        this.hostConfig = hostConfig;
        this.keyHelper = keyHelper;
    }

    private final boolean checkPlayServices(Activity activity) {
        Dialog errorDialog;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        q.h(googleApiAvailability, "getInstance(...)");
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(activity);
        if (isGooglePlayServicesAvailable != 0) {
            if (googleApiAvailability.isUserResolvableError(isGooglePlayServicesAvailable) && (errorDialog = googleApiAvailability.getErrorDialog(activity, isGooglePlayServicesAvailable, PLAY_SERVICES_RESOLUTION_REQUEST)) != null) {
                errorDialog.show();
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleGoogleAuthException(Exception exc, Activity activity, b<Intent> bVar) {
        if (exc instanceof GooglePlayServicesAvailabilityException) {
            GoogleApiAvailability.getInstance();
            GooglePlayServicesUtil.showErrorDialogFragment(((GooglePlayServicesAvailabilityException) exc).getConnectionStatusCode(), activity, null, 1001, new DialogInterface.OnCancelListener() { // from class: com.habitrpg.android.habitica.ui.viewmodels.a
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    AuthenticationViewModel.handleGoogleAuthException$lambda$0(dialogInterface);
                }
            });
        } else if ((exc instanceof UserRecoverableAuthException) && !activity.isFinishing()) {
            bVar.a(((UserRecoverableAuthException) exc).getIntent());
        }
    }

    private final void saveTokens(String str, String str2) throws Exception {
        int i10;
        this.apiClient.updateAuthenticationCredentials(str2, str);
        this.authenticationHandler.updateUserID(str2);
        SharedPreferences.Editor edit = this.sharedPrefs.edit();
        edit.putString("UserID", str2);
        KeyHelper keyHelper = this.keyHelper;
        String str3 = null;
        if (keyHelper != null && Build.VERSION.SDK_INT >= 23) {
            try {
                str3 = keyHelper.encrypt(str);
            } catch (Exception unused) {
            }
        }
        if (str3 != null) {
            i10 = str3.length();
        } else {
            i10 = 0;
        }
        if (i10 > 5) {
            edit.putString(str2, str3);
        } else {
            edit.putString("APIToken", str);
        }
        edit.apply();
    }

    public final ApiClient getApiClient() {
        return this.apiClient;
    }

    public final AuthenticationHandler getAuthenticationHandler() {
        return this.authenticationHandler;
    }

    public final String getGoogleEmail() {
        return this.googleEmail;
    }

    public final HostConfig getHostConfig() {
        return this.hostConfig;
    }

    public final SharedPreferences getSharedPrefs() {
        return this.sharedPrefs;
    }

    public final UserRepository getUserRepository() {
        return this.userRepository;
    }

    public final void handleAuthResponse(UserAuthResponse userAuthResponse) {
        q.i(userAuthResponse, "userAuthResponse");
        try {
            saveTokens(userAuthResponse.getApiToken(), userAuthResponse.getId());
        } catch (Exception e10) {
            Analytics.INSTANCE.logException(e10);
        }
    }

    public final void handleGoogleLogin(Activity activity, b<Intent> bVar) {
        q.i(activity, "activity");
        q.i(bVar, "pickAccountResult");
        if (!checkPlayServices(activity)) {
            return;
        }
        try {
            bVar.a(AccountManager.newChooseAccountIntent(null, null, new String[]{"com.google"}, true, null, null, null, null));
        } catch (ActivityNotFoundException unused) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(activity);
            habiticaAlertDialog.setTitle(R.string.authentication_error_title);
            habiticaAlertDialog.setMessage(R.string.google_services_missing);
            AlertDialogExtensionsKt.addCloseButton$default(habiticaAlertDialog, false, null, 3, null);
            habiticaAlertDialog.show();
        }
    }

    public final void handleGoogleLoginResult(Activity activity, b<Intent> bVar, l<? super Boolean, w> lVar) {
        q.i(activity, "activity");
        q.i(lVar, "onSuccess");
        ExceptionHandlerKt.launchCatching(l0.a(a1.b()), new AuthenticationViewModel$handleGoogleLoginResult$1(bVar, this, activity), new AuthenticationViewModel$handleGoogleLoginResult$2(activity, this, "oauth2:profile email", new b0(), lVar, null));
    }

    public final void setGoogleEmail(String str) {
        this.googleEmail = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGoogleAuthException$lambda$0(DialogInterface dialogInterface) {
    }
}
