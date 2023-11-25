package com.habitrpg.android.habitica.ui.fragments.preferences;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.w;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.gms.common.Scopes;
import com.google.android.material.textfield.TextInputLayout;
import com.habitrpg.android.habitica.BuildConfig;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.auth.SocialAuthentication;
import com.habitrpg.android.habitica.ui.activities.FixCharacterValuesActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog;
import com.habitrpg.android.habitica.ui.viewmodels.AuthenticationViewModel;
import com.habitrpg.android.habitica.ui.views.ExtraLabelPreference;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import com.habitrpg.android.habitica.ui.views.ValidatingEditText;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaProgressDialog;
import com.habitrpg.common.habitica.api.HostConfig;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import ec.b0;
import io.realm.x0;
import pc.p;
import qc.q;
import yc.v;

/* compiled from: AccountPreferenceFragment.kt */
/* loaded from: classes4.dex */
public final class AccountPreferenceFragment extends Hilt_AccountPreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener, HabiticaAccountDialog.AccountUpdateConfirmed {
    public static final int $stable = 8;
    private HabiticaAccountDialog accountDialog;
    public ApiClient apiClient;
    public HostConfig hostConfig;
    private final androidx.activity.result.b<Intent> pickAccountResult;
    private final androidx.activity.result.b<Intent> recoverFromPlayServicesErrorResult;
    private final yc.j regex;
    private User user;
    public AuthenticationViewModel viewModel;

    public AccountPreferenceFragment() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.preferences.a
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                AccountPreferenceFragment.pickAccountResult$lambda$8(AccountPreferenceFragment.this, (ActivityResult) obj);
            }
        });
        q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.pickAccountResult = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.preferences.b
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                AccountPreferenceFragment.recoverFromPlayServicesErrorResult$lambda$10(AccountPreferenceFragment.this, (ActivityResult) obj);
            }
        });
        q.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.recoverFromPlayServicesErrorResult = registerForActivityResult2;
        this.regex = new yc.j("[^a-zA-Z0-9_-]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configurePreference(Preference preference, String str) {
        EditTextPreference editTextPreference;
        if (preference instanceof EditTextPreference) {
            editTextPreference = (EditTextPreference) preference;
        } else {
            editTextPreference = null;
        }
        if (editTextPreference != null) {
            editTextPreference.setText(str);
        }
        if (preference != null) {
            preference.setSummary(str);
        }
    }

    private final void copyValue(String str, CharSequence charSequence) {
        ClipboardManager clipboardManager;
        SnackbarActivity snackbarActivity;
        Context context = getContext();
        String str2 = null;
        if (context != null) {
            clipboardManager = (ClipboardManager) androidx.core.content.a.i(context, ClipboardManager.class);
        } else {
            clipboardManager = null;
        }
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(str, charSequence));
        }
        if (Build.VERSION.SDK_INT <= 32) {
            androidx.fragment.app.q activity = getActivity();
            if (activity instanceof SnackbarActivity) {
                snackbarActivity = (SnackbarActivity) activity;
            } else {
                snackbarActivity = null;
            }
            if (snackbarActivity != null) {
                Context context2 = getContext();
                if (context2 != null) {
                    str2 = context2.getString(R.string.copied_to_clipboard, str);
                }
                SnackbarActivity.DefaultImpls.showSnackbar$default(snackbarActivity, null, null, str2, null, null, null, null, HabiticaSnackbar.SnackbarDisplayType.SUCCESS, false, 379, null);
            }
        }
    }

    private final void deleteAccount(String str) {
        HabiticaProgressDialog habiticaProgressDialog;
        Context context = getContext();
        if (context != null) {
            habiticaProgressDialog = HabiticaProgressDialog.Companion.show(context, R.string.deleting_account);
        } else {
            habiticaProgressDialog = null;
        }
        ExceptionHandlerKt.launchCatching(w.a(this), new AccountPreferenceFragment$deleteAccount$1(habiticaProgressDialog, this), new AccountPreferenceFragment$deleteAccount$2(this, str, habiticaProgressDialog, null));
    }

    private final void disconnect(String str, String str2) {
        Context context = getContext();
        if (context != null) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
            habiticaAlertDialog.setTitle(R.string.are_you_sure);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.disconnect, true, false, false, (p) new AccountPreferenceFragment$disconnect$1$1(this, str, str2), 12, (Object) null);
            AlertDialogExtensionsKt.addCancelButton$default(habiticaAlertDialog, false, null, 3, null);
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayAuthenticationSuccess(String str) {
        SnackbarActivity snackbarActivity;
        androidx.fragment.app.q activity = getActivity();
        String str2 = null;
        if (activity instanceof SnackbarActivity) {
            snackbarActivity = (SnackbarActivity) activity;
        } else {
            snackbarActivity = null;
        }
        if (snackbarActivity != null) {
            Context context = getContext();
            if (context != null) {
                str2 = context.getString(R.string.added_social_auth, str);
            }
            SnackbarActivity.DefaultImpls.showSnackbar$default(snackbarActivity, null, null, str2, null, null, null, null, HabiticaSnackbar.SnackbarDisplayType.SUCCESS, false, 379, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayDisconnectSuccess(String str) {
        SnackbarActivity snackbarActivity;
        androidx.fragment.app.q activity = getActivity();
        String str2 = null;
        if (activity instanceof SnackbarActivity) {
            snackbarActivity = (SnackbarActivity) activity;
        } else {
            snackbarActivity = null;
        }
        if (snackbarActivity != null) {
            Context context = getContext();
            if (context != null) {
                str2 = context.getString(R.string.removed_social_auth, str);
            }
            SnackbarActivity.DefaultImpls.showSnackbar$default(snackbarActivity, null, null, str2, null, null, null, null, HabiticaSnackbar.SnackbarDisplayType.SUCCESS, false, 379, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickAccountResult$lambda$8(AccountPreferenceFragment accountPreferenceFragment, ActivityResult activityResult) {
        String str;
        q.i(accountPreferenceFragment, "this$0");
        if (activityResult.b() == -1) {
            AuthenticationViewModel viewModel = accountPreferenceFragment.getViewModel();
            Intent a10 = activityResult.a();
            if (a10 != null) {
                str = a10.getStringExtra("authAccount");
            } else {
                str = null;
            }
            viewModel.setGoogleEmail(str);
            androidx.fragment.app.q activity = accountPreferenceFragment.getActivity();
            if (activity != null) {
                accountPreferenceFragment.getViewModel().handleGoogleLoginResult(activity, accountPreferenceFragment.recoverFromPlayServicesErrorResult, new AccountPreferenceFragment$pickAccountResult$1$1$1(accountPreferenceFragment));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recoverFromPlayServicesErrorResult$lambda$10(AccountPreferenceFragment accountPreferenceFragment, ActivityResult activityResult) {
        androidx.fragment.app.q activity;
        q.i(accountPreferenceFragment, "this$0");
        if (activityResult.b() != 0 && (activity = accountPreferenceFragment.getActivity()) != null) {
            accountPreferenceFragment.getViewModel().handleGoogleLoginResult(activity, null, new AccountPreferenceFragment$recoverFromPlayServicesErrorResult$1$1$1(accountPreferenceFragment));
        }
    }

    private final void resetAccount() {
        HabiticaProgressDialog habiticaProgressDialog;
        Context context = getContext();
        if (context != null) {
            habiticaProgressDialog = HabiticaProgressDialog.Companion.show(context, R.string.resetting_account);
        } else {
            habiticaProgressDialog = null;
        }
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AccountPreferenceFragment$resetAccount$1(this, habiticaProgressDialog, null), 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r1.isActive() == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showAccountDeleteConfirmation(com.habitrpg.android.habitica.models.user.User r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L17
            com.habitrpg.android.habitica.models.user.Purchases r1 = r12.getPurchased()
            if (r1 == 0) goto L17
            com.habitrpg.android.habitica.models.user.SubscriptionPlan r1 = r1.getPlan()
            if (r1 == 0) goto L17
            boolean r1 = r1.isActive()
            r2 = 1
            if (r1 != r2) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            r1 = 0
            if (r2 == 0) goto L69
            com.habitrpg.android.habitica.models.user.Purchases r2 = r12.getPurchased()
            if (r2 == 0) goto L2c
            com.habitrpg.android.habitica.models.user.SubscriptionPlan r2 = r2.getPlan()
            if (r2 == 0) goto L2c
            java.util.Date r2 = r2.realmGet$dateTerminated()
            goto L2d
        L2c:
            r2 = r1
        L2d:
            if (r2 != 0) goto L69
            android.content.Context r12 = r11.getContext()
            if (r12 == 0) goto L3b
            com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog r2 = new com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog
            r2.<init>(r12)
            goto L3c
        L3b:
            r2 = r1
        L3c:
            if (r2 == 0) goto L44
            r12 = 2131953360(0x7f1306d0, float:1.9543189E38)
            r2.setTitle(r12)
        L44:
            if (r2 == 0) goto L4c
            r12 = 2131952067(0x7f1301c3, float:1.9540566E38)
            r2.setMessage(r12)
        L4c:
            if (r2 == 0) goto L5d
            r4 = 2131952290(0x7f1302a2, float:1.9541019E38)
            r5 = 0
            r6 = 0
            r7 = 0
            com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showAccountDeleteConfirmation$1 r8 = com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showAccountDeleteConfirmation$1.INSTANCE
            r9 = 12
            r10 = 0
            r3 = r2
            com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.addButton$default(r3, r4, r5, r6, r7, r8, r9, r10)
        L5d:
            if (r2 == 0) goto L63
            r12 = 3
            com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt.addCloseButton$default(r2, r0, r1, r12, r1)
        L63:
            if (r2 == 0) goto L68
            r2.show()
        L68:
            return
        L69:
            android.content.Context r0 = r11.getContext()
            if (r0 == 0) goto L74
            com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r1 = new com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog
            r1.<init>(r0)
        L74:
            if (r1 != 0) goto L77
            goto L7c
        L77:
            java.lang.String r0 = "delete_account"
            r1.setAccountAction(r0)
        L7c:
            if (r1 != 0) goto L7f
            goto L82
        L7f:
            r1.setAccountUpdateConfirmed(r11)
        L82:
            if (r1 != 0) goto L85
            goto L88
        L85:
            r1.setUser(r12)
        L88:
            if (r1 == 0) goto L93
            androidx.fragment.app.FragmentManager r12 = r11.getChildFragmentManager()
            java.lang.String r0 = "HabiticaAccountDialog"
            r1.show(r12, r0)
        L93:
            if (r1 == 0) goto L97
            r11.accountDialog = r1
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment.showAccountDeleteConfirmation(com.habitrpg.android.habitica.models.user.User):void");
    }

    private final void showAccountResetConfirmation(User user) {
        HabiticaAccountDialog habiticaAccountDialog;
        Context context = getContext();
        if (context != null) {
            habiticaAccountDialog = new HabiticaAccountDialog(context);
        } else {
            habiticaAccountDialog = null;
        }
        if (habiticaAccountDialog != null) {
            habiticaAccountDialog.setAccountAction("reset_account");
        }
        if (habiticaAccountDialog != null) {
            habiticaAccountDialog.setAccountUpdateConfirmed(this);
        }
        if (habiticaAccountDialog != null) {
            habiticaAccountDialog.setUser(user);
        }
        if (habiticaAccountDialog != null) {
            habiticaAccountDialog.show(getParentFragmentManager(), "account");
        }
        if (habiticaAccountDialog != null) {
            this.accountDialog = habiticaAccountDialog;
        }
    }

    private final void showAddPasswordDialog(boolean z10) {
        LayoutInflater layoutInflater;
        View view;
        ValidatingEditText validatingEditText;
        ValidatingEditText validatingEditText2;
        ValidatingEditText validatingEditText3;
        int i10;
        Context context = getContext();
        if (context != null) {
            layoutInflater = ContextExtensionsKt.getLayoutInflater(context);
        } else {
            layoutInflater = null;
        }
        if (layoutInflater != null) {
            view = layoutInflater.inflate(R.layout.dialog_edittext_add_local_auth, (ViewGroup) null);
        } else {
            view = null;
        }
        if (view != null) {
            validatingEditText = (ValidatingEditText) view.findViewById(R.id.email_edit_text);
        } else {
            validatingEditText = null;
        }
        if (validatingEditText != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            validatingEditText.setVisibility(i10);
        }
        if (validatingEditText != null) {
            validatingEditText.setValidator(AccountPreferenceFragment$showAddPasswordDialog$1.INSTANCE);
        }
        if (validatingEditText != null) {
            validatingEditText.setErrorText(getString(R.string.email_invalid));
        }
        if (view != null) {
            validatingEditText2 = (ValidatingEditText) view.findViewById(R.id.password_edit_text);
        } else {
            validatingEditText2 = null;
        }
        if (validatingEditText2 != null) {
            validatingEditText2.setValidator(AccountPreferenceFragment$showAddPasswordDialog$2.INSTANCE);
        }
        if (validatingEditText2 != null) {
            validatingEditText2.setErrorText(getString(R.string.password_too_short, 8));
        }
        if (view != null) {
            validatingEditText3 = (ValidatingEditText) view.findViewById(R.id.password_repeat_edit_text);
        } else {
            validatingEditText3 = null;
        }
        if (validatingEditText3 != null) {
            validatingEditText3.setValidator(new AccountPreferenceFragment$showAddPasswordDialog$3(validatingEditText2));
        }
        if (validatingEditText3 != null) {
            validatingEditText3.setErrorText(getString(R.string.password_not_matching));
        }
        Context context2 = getContext();
        if (context2 != null) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context2);
            if (z10) {
                habiticaAlertDialog.setTitle(R.string.add_email_and_password);
            } else {
                habiticaAlertDialog.setTitle(R.string.add_password);
            }
            habiticaAlertDialog.addButton(R.string.add, true, false, false, (p<? super HabiticaAlertDialog, ? super Integer, dc.w>) new AccountPreferenceFragment$showAddPasswordDialog$4$1(this, validatingEditText, validatingEditText2, validatingEditText3, z10, context2));
            AlertDialogExtensionsKt.addCancelButton$default(habiticaAlertDialog, false, null, 3, null);
            habiticaAlertDialog.setAdditionalContentView(view);
            habiticaAlertDialog.setAdditionalContentSidePadding(12);
            habiticaAlertDialog.show();
        }
    }

    private final void showChangePasswordDialog() {
        LayoutInflater layoutInflater;
        View view;
        ValidatingEditText validatingEditText;
        ValidatingEditText validatingEditText2;
        ValidatingEditText validatingEditText3;
        Context context = getContext();
        if (context != null) {
            layoutInflater = ContextExtensionsKt.getLayoutInflater(context);
        } else {
            layoutInflater = null;
        }
        if (layoutInflater != null) {
            view = layoutInflater.inflate(R.layout.dialog_edittext_change_pw, (ViewGroup) null);
        } else {
            view = null;
        }
        if (view != null) {
            validatingEditText = (ValidatingEditText) view.findViewById(R.id.old_password_edit_text);
        } else {
            validatingEditText = null;
        }
        if (view != null) {
            validatingEditText2 = (ValidatingEditText) view.findViewById(R.id.new_password_edit_text);
        } else {
            validatingEditText2 = null;
        }
        if (validatingEditText2 != null) {
            validatingEditText2.setValidator(AccountPreferenceFragment$showChangePasswordDialog$1.INSTANCE);
        }
        if (validatingEditText2 != null) {
            validatingEditText2.setErrorText(getString(R.string.password_too_short, 8));
        }
        if (view != null) {
            validatingEditText3 = (ValidatingEditText) view.findViewById(R.id.new_password_repeat_edit_text);
        } else {
            validatingEditText3 = null;
        }
        if (validatingEditText3 != null) {
            validatingEditText3.setValidator(new AccountPreferenceFragment$showChangePasswordDialog$2(validatingEditText2));
        }
        if (validatingEditText3 != null) {
            validatingEditText3.setErrorText(getString(R.string.password_not_matching));
        }
        Context context2 = getContext();
        if (context2 != null) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context2);
            habiticaAlertDialog.setTitle(R.string.change_password);
            habiticaAlertDialog.addButton(R.string.change, true, false, false, (p<? super HabiticaAlertDialog, ? super Integer, dc.w>) new AccountPreferenceFragment$showChangePasswordDialog$3$1(this, validatingEditText2, validatingEditText3, validatingEditText, context2));
            AlertDialogExtensionsKt.addCancelButton$default(habiticaAlertDialog, false, null, 3, null);
            habiticaAlertDialog.setAdditionalContentView(view);
            habiticaAlertDialog.setAdditionalContentSidePadding(12);
            habiticaAlertDialog.show();
        }
    }

    private final void showConfirmUsernameDialog() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
        habiticaAlertDialog.setTitle(R.string.confirm_username_title);
        habiticaAlertDialog.setMessage(R.string.confirm_username_description);
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.confirm, true, false, false, (p) new AccountPreferenceFragment$showConfirmUsernameDialog$1(this), 12, (Object) null);
        AlertDialogExtensionsKt.addCancelButton$default(habiticaAlertDialog, false, null, 3, null);
        habiticaAlertDialog.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (r4.getHasPassword() == true) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showEmailDialog() {
        /*
            r13 = this;
            android.content.Context r0 = r13.getContext()
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.LayoutInflater r0 = com.habitrpg.common.habitica.extensions.ContextExtensionsKt.getLayoutInflater(r0)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L17
            r2 = 2131492981(0x7f0c0075, float:1.860943E38)
            android.view.View r0 = r0.inflate(r2, r1)
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 == 0) goto L24
            r2 = 2131296721(0x7f0901d1, float:1.8211367E38)
            android.view.View r2 = r0.findViewById(r2)
            com.habitrpg.android.habitica.ui.views.ValidatingEditText r2 = (com.habitrpg.android.habitica.ui.views.ValidatingEditText) r2
            goto L25
        L24:
            r2 = r1
        L25:
            if (r2 != 0) goto L28
            goto L43
        L28:
            com.habitrpg.android.habitica.models.user.User r3 = r13.getUser$Habitica_2311256681_prodRelease()
            if (r3 == 0) goto L3f
            com.habitrpg.android.habitica.models.user.Authentication r3 = r3.getAuthentication()
            if (r3 == 0) goto L3f
            com.habitrpg.android.habitica.models.auth.LocalAuthentication r3 = r3.getLocalAuthentication()
            if (r3 == 0) goto L3f
            java.lang.String r3 = r3.getEmail()
            goto L40
        L3f:
            r3 = r1
        L40:
            r2.setText(r3)
        L43:
            if (r2 != 0) goto L46
            goto L4b
        L46:
            com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showEmailDialog$1 r3 = com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showEmailDialog$1.INSTANCE
            r2.setValidator(r3)
        L4b:
            if (r2 != 0) goto L4e
            goto L58
        L4e:
            r3 = 2131952113(0x7f1301f1, float:1.954066E38)
            java.lang.String r3 = r13.getString(r3)
            r2.setErrorText(r3)
        L58:
            if (r0 == 0) goto L64
            r3 = 2131296924(0x7f09029c, float:1.8211778E38)
            android.view.View r3 = r0.findViewById(r3)
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            goto L65
        L64:
            r3 = r1
        L65:
            if (r3 != 0) goto L68
            goto L7a
        L68:
            android.content.Context r4 = r13.getContext()
            if (r4 == 0) goto L76
            r5 = 2131952111(0x7f1301ef, float:1.9540656E38)
            java.lang.String r4 = r4.getString(r5)
            goto L77
        L76:
            r4 = r1
        L77:
            r3.setHint(r4)
        L7a:
            if (r0 == 0) goto L86
            r3 = 2131297220(0x7f0903c4, float:1.8212379E38)
            android.view.View r3 = r0.findViewById(r3)
            com.habitrpg.android.habitica.ui.views.ValidatingEditText r3 = (com.habitrpg.android.habitica.ui.views.ValidatingEditText) r3
            goto L87
        L86:
            r3 = r1
        L87:
            com.habitrpg.android.habitica.models.user.User r4 = r13.getUser$Habitica_2311256681_prodRelease()
            r5 = 0
            if (r4 == 0) goto L9c
            com.habitrpg.android.habitica.models.user.Authentication r4 = r4.getAuthentication()
            if (r4 == 0) goto L9c
            boolean r4 = r4.getHasPassword()
            r6 = 1
            if (r4 != r6) goto L9c
            goto L9d
        L9c:
            r6 = 0
        L9d:
            if (r6 != 0) goto La7
            if (r3 != 0) goto La2
            goto La7
        La2:
            r4 = 8
            r3.setVisibility(r4)
        La7:
            android.content.Context r4 = r13.getContext()
            if (r4 == 0) goto Lda
            com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog r12 = new com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog
            r12.<init>(r4)
            r6 = 2131951881(0x7f130109, float:1.954019E38)
            r12.setTitle(r6)
            r7 = 2131951872(0x7f130100, float:1.954017E38)
            r8 = 1
            r9 = 0
            r10 = 0
            com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showEmailDialog$2$1 r11 = new com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showEmailDialog$2$1
            r11.<init>(r13, r2, r3)
            r6 = r12
            r6.addButton(r7, r8, r9, r10, r11)
            r2 = 3
            com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt.addCancelButton$default(r12, r5, r1, r2, r1)
            r12.setAdditionalContentView(r0)
            r0 = 12
            int r0 = com.habitrpg.common.habitica.extensions.IntExtensionsKt.dpToPx(r0, r4)
            r12.setAdditionalContentSidePadding(r0)
            r12.show()
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment.showEmailDialog():void");
    }

    private final void showLoginNameDialog() {
        String str;
        User user$Habitica_2311256681_prodRelease = getUser$Habitica_2311256681_prodRelease();
        if (user$Habitica_2311256681_prodRelease != null) {
            str = user$Habitica_2311256681_prodRelease.getUsername();
        } else {
            str = null;
        }
        String string = getString(R.string.username);
        q.h(string, "getString(...)");
        showSingleEntryDialog(str, string, new AccountPreferenceFragment$showLoginNameDialog$1(this), new AccountPreferenceFragment$showLoginNameDialog$2(this));
    }

    private final void showSingleEntryDialog(String str, String str2, pc.l<? super String, Boolean> lVar, pc.l<? super String, dc.w> lVar2) {
        LayoutInflater layoutInflater;
        View view;
        ValidatingEditText validatingEditText;
        TextInputLayout textInputLayout;
        Context context = getContext();
        if (context != null) {
            layoutInflater = ContextExtensionsKt.getLayoutInflater(context);
        } else {
            layoutInflater = null;
        }
        if (layoutInflater != null) {
            view = layoutInflater.inflate(R.layout.dialog_edittext, (ViewGroup) null);
        } else {
            view = null;
        }
        if (view != null) {
            validatingEditText = (ValidatingEditText) view.findViewById(R.id.edit_text);
        } else {
            validatingEditText = null;
        }
        if (validatingEditText != null) {
            validatingEditText.setText(str);
        }
        if (validatingEditText != null) {
            validatingEditText.setValidator(lVar);
        }
        if (validatingEditText != null) {
            validatingEditText.setErrorText(getString(R.string.username_requirements));
        }
        if (view != null) {
            textInputLayout = (TextInputLayout) view.findViewById(R.id.input_layout);
        } else {
            textInputLayout = null;
        }
        if (textInputLayout != null) {
            textInputLayout.setHint(str2);
        }
        Context context2 = getContext();
        if (context2 != null) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context2);
            habiticaAlertDialog.setTitle(str2);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.save, true, false, false, (p) new AccountPreferenceFragment$showSingleEntryDialog$1$1(this, validatingEditText, lVar2), 4, (Object) null);
            AlertDialogExtensionsKt.addCancelButton$default(habiticaAlertDialog, false, null, 3, null);
            habiticaAlertDialog.setAdditionalContentView(view);
            habiticaAlertDialog.setAdditionalContentSidePadding(IntExtensionsKt.dpToPx(12, context2));
            habiticaAlertDialog.getScrollView().setScrollable(false);
            habiticaAlertDialog.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showSingleEntryDialog$default(AccountPreferenceFragment accountPreferenceFragment, String str, String str2, pc.l lVar, pc.l lVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        accountPreferenceFragment.showSingleEntryDialog(str, str2, lVar, lVar2);
    }

    private final void updateUser(String str, String str2, String str3) {
        showSingleEntryDialog$default(this, str2, str3, null, new AccountPreferenceFragment$updateUser$1(str2, this, str), 4, null);
    }

    private final void updateUserFields() {
        String str;
        String string;
        boolean z10;
        boolean z11;
        Integer num;
        boolean z12;
        String str2;
        String str3;
        Integer num2;
        String str4;
        SocialAuthentication facebookAuthentication;
        x0<String> emails;
        Object c02;
        Integer num3;
        String str5;
        SocialAuthentication appleAuthentication;
        x0<String> emails2;
        Object c03;
        Integer num4;
        String str6;
        SocialAuthentication googleAuthentication;
        x0<String> emails3;
        Object c04;
        boolean z13;
        LocalAuthentication localAuthentication;
        LocalAuthentication localAuthentication2;
        User user$Habitica_2311256681_prodRelease = getUser$Habitica_2311256681_prodRelease();
        if (user$Habitica_2311256681_prodRelease == null) {
            return;
        }
        Preference findPreference = findPreference("username");
        Authentication authentication = user$Habitica_2311256681_prodRelease.getAuthentication();
        String str7 = null;
        if (authentication != null && (localAuthentication2 = authentication.getLocalAuthentication()) != null) {
            str = localAuthentication2.getUsername();
        } else {
            str = null;
        }
        configurePreference(findPreference, str);
        Preference findPreference2 = findPreference(Scopes.EMAIL);
        Authentication authentication2 = user$Habitica_2311256681_prodRelease.getAuthentication();
        if (authentication2 == null || (localAuthentication = authentication2.getLocalAuthentication()) == null || (string = localAuthentication.getEmail()) == null) {
            string = getString(R.string.not_set);
            q.h(string, "getString(...)");
        }
        configurePreference(findPreference2, string);
        Preference findPreference3 = findPreference("confirm_username");
        boolean z14 = true;
        if (findPreference3 != null) {
            Flags flags = user$Habitica_2311256681_prodRelease.getFlags();
            if (flags != null && flags.getVerifiedUsername()) {
                z13 = true;
            } else {
                z13 = false;
            }
            findPreference3.setVisible(!z13);
        }
        ExtraLabelPreference extraLabelPreference = (ExtraLabelPreference) findPreference("password");
        Authentication authentication3 = user$Habitica_2311256681_prodRelease.getAuthentication();
        if (authentication3 != null && authentication3.getHasPassword()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (extraLabelPreference != null) {
                extraLabelPreference.setSummary("···········");
            }
            if (extraLabelPreference != null) {
                extraLabelPreference.setExtraText(getString(R.string.change_password));
            }
        } else {
            if (extraLabelPreference != null) {
                extraLabelPreference.setSummary(getString(R.string.not_set));
            }
            if (extraLabelPreference != null) {
                extraLabelPreference.setExtraText(getString(R.string.add_password));
            }
        }
        ExtraLabelPreference extraLabelPreference2 = (ExtraLabelPreference) findPreference("google_auth");
        Authentication authentication4 = user$Habitica_2311256681_prodRelease.getAuthentication();
        if (authentication4 != null && authentication4.getHasGoogleAuth()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (extraLabelPreference2 != null) {
                Authentication authentication5 = user$Habitica_2311256681_prodRelease.getAuthentication();
                if (authentication5 != null && (googleAuthentication = authentication5.getGoogleAuthentication()) != null && (emails3 = googleAuthentication.getEmails()) != null) {
                    c04 = b0.c0(emails3);
                    str6 = (String) c04;
                } else {
                    str6 = null;
                }
                extraLabelPreference2.setSummary(str6);
            }
            if (extraLabelPreference2 != null) {
                extraLabelPreference2.setExtraText(getString(R.string.disconnect));
            }
            if (extraLabelPreference2 != null) {
                Context context = getContext();
                if (context != null) {
                    num4 = Integer.valueOf(androidx.core.content.a.c(context, R.color.text_red));
                } else {
                    num4 = null;
                }
                extraLabelPreference2.setExtraTextColor(num4);
            }
        } else {
            if (extraLabelPreference2 != null) {
                extraLabelPreference2.setSummary(getString(R.string.not_connected));
            }
            if (extraLabelPreference2 != null) {
                extraLabelPreference2.setExtraText(getString(R.string.connect));
            }
            if (extraLabelPreference2 != null) {
                Context context2 = getContext();
                if (context2 != null) {
                    num = Integer.valueOf(androidx.core.content.a.c(context2, R.color.text_ternary));
                } else {
                    num = null;
                }
                extraLabelPreference2.setExtraTextColor(num);
            }
        }
        ExtraLabelPreference extraLabelPreference3 = (ExtraLabelPreference) findPreference("apple_auth");
        Authentication authentication6 = user$Habitica_2311256681_prodRelease.getAuthentication();
        if (authentication6 != null && authentication6.getHasAppleAuth()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (extraLabelPreference3 != null) {
                Authentication authentication7 = user$Habitica_2311256681_prodRelease.getAuthentication();
                if (authentication7 != null && (appleAuthentication = authentication7.getAppleAuthentication()) != null && (emails2 = appleAuthentication.getEmails()) != null) {
                    c03 = b0.c0(emails2);
                    str5 = (String) c03;
                } else {
                    str5 = null;
                }
                extraLabelPreference3.setSummary(str5);
            }
            if (extraLabelPreference3 != null) {
                extraLabelPreference3.setExtraText(getString(R.string.disconnect));
            }
            if (extraLabelPreference3 != null) {
                Context context3 = getContext();
                if (context3 != null) {
                    num3 = Integer.valueOf(androidx.core.content.a.c(context3, R.color.text_red));
                } else {
                    num3 = null;
                }
                extraLabelPreference3.setExtraTextColor(num3);
            }
        } else if (extraLabelPreference3 != null) {
            extraLabelPreference3.setVisible(false);
        }
        ExtraLabelPreference extraLabelPreference4 = (ExtraLabelPreference) findPreference("facebook_auth");
        Authentication authentication8 = user$Habitica_2311256681_prodRelease.getAuthentication();
        if (authentication8 == null || !authentication8.getHasFacebookAuth()) {
            z14 = false;
        }
        if (z14) {
            if (extraLabelPreference4 != null) {
                Authentication authentication9 = user$Habitica_2311256681_prodRelease.getAuthentication();
                if (authentication9 != null && (facebookAuthentication = authentication9.getFacebookAuthentication()) != null && (emails = facebookAuthentication.getEmails()) != null) {
                    c02 = b0.c0(emails);
                    str4 = (String) c02;
                } else {
                    str4 = null;
                }
                extraLabelPreference4.setSummary(str4);
            }
            if (extraLabelPreference4 != null) {
                extraLabelPreference4.setExtraText(getString(R.string.disconnect));
            }
            if (extraLabelPreference4 != null) {
                Context context4 = getContext();
                if (context4 != null) {
                    num2 = Integer.valueOf(androidx.core.content.a.c(context4, R.color.text_red));
                } else {
                    num2 = null;
                }
                extraLabelPreference4.setExtraTextColor(num2);
            }
        } else if (extraLabelPreference4 != null) {
            extraLabelPreference4.setVisible(false);
        }
        Preference findPreference4 = findPreference("display_name");
        Profile profile = user$Habitica_2311256681_prodRelease.getProfile();
        if (profile != null) {
            str2 = profile.getName();
        } else {
            str2 = null;
        }
        configurePreference(findPreference4, str2);
        Preference findPreference5 = findPreference("photo_url");
        Profile profile2 = user$Habitica_2311256681_prodRelease.getProfile();
        if (profile2 != null) {
            str3 = profile2.getImageUrl();
        } else {
            str3 = null;
        }
        configurePreference(findPreference5, str3);
        Preference findPreference6 = findPreference(NavigationDrawerFragment.SIDEBAR_ABOUT);
        Profile profile3 = user$Habitica_2311256681_prodRelease.getProfile();
        if (profile3 != null) {
            str7 = profile3.getBlurb();
        }
        configurePreference(findPreference6, str7);
        configurePreference(findPreference("UserID"), user$Habitica_2311256681_prodRelease.getId());
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.AccountUpdateConfirmed
    public void deletionConfirmClicked(String str) {
        q.i(str, "confirmationString");
        deleteAccount(str);
    }

    public final ApiClient getApiClient() {
        ApiClient apiClient = this.apiClient;
        if (apiClient != null) {
            return apiClient;
        }
        q.z("apiClient");
        return null;
    }

    public final HostConfig getHostConfig() {
        HostConfig hostConfig = this.hostConfig;
        if (hostConfig != null) {
            return hostConfig;
        }
        q.z("hostConfig");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.preferences.BasePreferencesFragment
    public User getUser$Habitica_2311256681_prodRelease() {
        return this.user;
    }

    public final AuthenticationViewModel getViewModel() {
        AuthenticationViewModel authenticationViewModel = this.viewModel;
        if (authenticationViewModel != null) {
            return authenticationViewModel;
        }
        q.z("viewModel");
        return null;
    }

    @Override // androidx.preference.h, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Flags flags;
        super.onCreate(bundle);
        Preference findPreference = findPreference("confirm_username");
        if (findPreference != null) {
            User user$Habitica_2311256681_prodRelease = getUser$Habitica_2311256681_prodRelease();
            boolean z10 = false;
            if (user$Habitica_2311256681_prodRelease != null && (flags = user$Habitica_2311256681_prodRelease.getFlags()) != null && !flags.getVerifiedUsername()) {
                z10 = true;
            }
            findPreference.setVisible(z10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        SharedPreferences l10 = getPreferenceManager().l();
        if (l10 != null) {
            l10.unregisterOnSharedPreferenceChangeListener(this);
        }
        super.onPause();
    }

    @Override // androidx.preference.h, androidx.preference.k.c
    public boolean onPreferenceTreeClick(Preference preference) {
        Profile profile;
        Authentication authentication;
        Profile profile2;
        boolean z10;
        Authentication authentication2;
        LocalAuthentication localAuthentication;
        String email;
        boolean u10;
        Authentication authentication3;
        boolean z11;
        Authentication authentication4;
        LocalAuthentication localAuthentication2;
        String email2;
        boolean u11;
        Authentication authentication5;
        Profile profile3;
        Authentication authentication6;
        q.i(preference, "preference");
        String key = preference.getKey();
        if (key != null) {
            String str = null;
            boolean z12 = false;
            switch (key.hashCode()) {
                case -1752163770:
                    if (key.equals("UserID")) {
                        String string = getString(R.string.SP_userID);
                        q.h(string, "getString(...)");
                        User user$Habitica_2311256681_prodRelease = getUser$Habitica_2311256681_prodRelease();
                        if (user$Habitica_2311256681_prodRelease != null) {
                            str = user$Habitica_2311256681_prodRelease.getId();
                        }
                        copyValue(string, str);
                        return true;
                    }
                    break;
                case -1248498827:
                    if (key.equals("confirm_username")) {
                        showConfirmUsernameDialog();
                        break;
                    }
                    break;
                case -936715367:
                    if (key.equals("delete_account")) {
                        showAccountDeleteConfirmation(getUser$Habitica_2311256681_prodRelease());
                        break;
                    }
                    break;
                case -847656478:
                    if (key.equals("photo_url")) {
                        User user$Habitica_2311256681_prodRelease2 = getUser$Habitica_2311256681_prodRelease();
                        if (user$Habitica_2311256681_prodRelease2 != null && (profile = user$Habitica_2311256681_prodRelease2.getProfile()) != null) {
                            str = profile.getImageUrl();
                        }
                        String string2 = getString(R.string.photo_url);
                        q.h(string2, "getString(...)");
                        updateUser("profile.imageUrl", str, string2);
                        break;
                    }
                    break;
                case -335268882:
                    if (key.equals("google_auth")) {
                        User user$Habitica_2311256681_prodRelease3 = getUser$Habitica_2311256681_prodRelease();
                        if (user$Habitica_2311256681_prodRelease3 != null && (authentication = user$Habitica_2311256681_prodRelease3.getAuthentication()) != null && authentication.getHasGoogleAuth()) {
                            z12 = true;
                        }
                        if (z12) {
                            disconnect(BuildConfig.STORE, "Google");
                            break;
                        } else {
                            androidx.fragment.app.q activity = getActivity();
                            if (activity != null) {
                                getViewModel().handleGoogleLogin(activity, this.pickAccountResult);
                                break;
                            }
                        }
                    }
                    break;
                case -265713450:
                    if (key.equals("username")) {
                        showLoginNameDialog();
                        break;
                    }
                    break;
                case -125137091:
                    if (key.equals("reset_account")) {
                        showAccountResetConfirmation(getUser$Habitica_2311256681_prodRelease());
                        break;
                    }
                    break;
                case 92611469:
                    if (key.equals(NavigationDrawerFragment.SIDEBAR_ABOUT)) {
                        User user$Habitica_2311256681_prodRelease4 = getUser$Habitica_2311256681_prodRelease();
                        if (user$Habitica_2311256681_prodRelease4 != null && (profile2 = user$Habitica_2311256681_prodRelease4.getProfile()) != null) {
                            str = profile2.getBlurb();
                        }
                        String string3 = getString(R.string.about);
                        q.h(string3, "getString(...)");
                        updateUser("profile.blurb", str, string3);
                        break;
                    }
                    break;
                case 96619420:
                    if (key.equals(Scopes.EMAIL)) {
                        User user$Habitica_2311256681_prodRelease5 = getUser$Habitica_2311256681_prodRelease();
                        if (user$Habitica_2311256681_prodRelease5 != null && (authentication3 = user$Habitica_2311256681_prodRelease5.getAuthentication()) != null && authentication3.getHasPassword()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            User user$Habitica_2311256681_prodRelease6 = getUser$Habitica_2311256681_prodRelease();
                            if (user$Habitica_2311256681_prodRelease6 != null && (authentication2 = user$Habitica_2311256681_prodRelease6.getAuthentication()) != null && (localAuthentication = authentication2.getLocalAuthentication()) != null && (email = localAuthentication.getEmail()) != null) {
                                u10 = v.u(email);
                                if ((!u10) == true) {
                                    z12 = true;
                                }
                            }
                            if (!z12) {
                                showAddPasswordDialog(true);
                                break;
                            }
                        }
                        showEmailDialog();
                        break;
                    }
                    break;
                case 1216985755:
                    if (key.equals("password")) {
                        User user$Habitica_2311256681_prodRelease7 = getUser$Habitica_2311256681_prodRelease();
                        if (user$Habitica_2311256681_prodRelease7 != null && (authentication5 = user$Habitica_2311256681_prodRelease7.getAuthentication()) != null && authentication5.getHasPassword()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            showChangePasswordDialog();
                            break;
                        } else {
                            User user$Habitica_2311256681_prodRelease8 = getUser$Habitica_2311256681_prodRelease();
                            if (user$Habitica_2311256681_prodRelease8 != null && (authentication4 = user$Habitica_2311256681_prodRelease8.getAuthentication()) != null && (localAuthentication2 = authentication4.getLocalAuthentication()) != null && (email2 = localAuthentication2.getEmail()) != null) {
                                u11 = v.u(email2);
                                if ((!u11) == true) {
                                    z12 = true;
                                }
                            }
                            showAddPasswordDialog(!z12);
                            break;
                        }
                    }
                    break;
                case 1615086568:
                    if (key.equals("display_name")) {
                        User user$Habitica_2311256681_prodRelease9 = getUser$Habitica_2311256681_prodRelease();
                        if (user$Habitica_2311256681_prodRelease9 != null && (profile3 = user$Habitica_2311256681_prodRelease9.getProfile()) != null) {
                            str = profile3.getName();
                        }
                        String string4 = getString(R.string.display_name);
                        q.h(string4, "getString(...)");
                        updateUser("profile.name", str, string4);
                        break;
                    }
                    break;
                case 1620494209:
                    if (key.equals("facebook_auth")) {
                        User user$Habitica_2311256681_prodRelease10 = getUser$Habitica_2311256681_prodRelease();
                        if (user$Habitica_2311256681_prodRelease10 != null && (authentication6 = user$Habitica_2311256681_prodRelease10.getAuthentication()) != null && authentication6.getHasFacebookAuth()) {
                            z12 = true;
                        }
                        if (z12) {
                            disconnect("facebook", "Facebook");
                            break;
                        }
                    }
                    break;
                case 1770289183:
                    if (key.equals("APIToken")) {
                        String string5 = getString(R.string.SP_APIToken_title);
                        q.h(string5, "getString(...)");
                        copyValue(string5, getHostConfig().getApiKey());
                        return true;
                    }
                    break;
                case 1814847702:
                    if (key.equals("fixCharacterValues")) {
                        Intent intent = new Intent(getActivity(), FixCharacterValuesActivity.class);
                        androidx.fragment.app.q activity2 = getActivity();
                        if (activity2 != null) {
                            activity2.startActivity(intent);
                            break;
                        }
                    }
                    break;
            }
        }
        return super.onPreferenceTreeClick(preference);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SharedPreferences l10 = getPreferenceManager().l();
        if (l10 != null) {
            l10.registerOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.AccountUpdateConfirmed
    public void resetConfirmedClicked() {
        resetAccount();
    }

    public final void setApiClient(ApiClient apiClient) {
        q.i(apiClient, "<set-?>");
        this.apiClient = apiClient;
    }

    public final void setHostConfig(HostConfig hostConfig) {
        q.i(hostConfig, "<set-?>");
        this.hostConfig = hostConfig;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.preferences.BasePreferencesFragment
    public void setUser$Habitica_2311256681_prodRelease(User user) {
        this.user = user;
        updateUserFields();
    }

    public final void setViewModel(AuthenticationViewModel authenticationViewModel) {
        q.i(authenticationViewModel, "<set-?>");
        this.viewModel = authenticationViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.preferences.BasePreferencesFragment
    protected void setupPreferences() {
        updateUserFields();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
    }
}
