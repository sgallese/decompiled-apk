package com.habitrpg.android.habitica.ui.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.Wearable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.databinding.ActivityLoginBinding;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.extensions.WindowExtensionsKt;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.ui.helpers.KeyboardUtilKt;
import com.habitrpg.android.habitica.ui.viewmodels.AuthenticationViewModel;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.login.LockableScrollView;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.models.auth.UserAuthResponse;
import java.util.HashMap;

/* compiled from: LoginActivity.kt */
/* loaded from: classes4.dex */
public final class LoginActivity extends Hilt_LoginActivity {
    public static final int REQUEST_CODE_PICK_ACCOUNT = 1000;
    public ApiClient apiClient;
    private ActivityLoginBinding binding;
    public AppConfigManager configManager;
    private boolean isRegistering;
    private boolean isShowingForm;
    private final View.OnClickListener loginClick = new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.c1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LoginActivity.loginClick$lambda$0(LoginActivity.this, view);
        }
    };
    private final androidx.activity.result.b<Intent> pickAccountResult;
    private final androidx.activity.result.b<Intent> recoverFromPlayServicesErrorResult;
    public SharedPreferences sharedPrefs;
    public AuthenticationViewModel viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LoginActivity.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        public final void hide(View view) {
            qc.q.i(view, "v");
            view.setVisibility(8);
        }

        public final void show(View view) {
            qc.q.i(view, "v");
            view.setVisibility(0);
        }
    }

    public LoginActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.activities.d1
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                LoginActivity.pickAccountResult$lambda$11(LoginActivity.this, (ActivityResult) obj);
            }
        });
        qc.q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.pickAccountResult = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.activities.e1
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                LoginActivity.recoverFromPlayServicesErrorResult$lambda$12(LoginActivity.this, (ActivityResult) obj);
            }
        });
        qc.q.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.recoverFromPlayServicesErrorResult = registerForActivityResult2;
    }

    private final void backButtonClicked() {
        if (this.isShowingForm) {
            hideForm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAuthResponse(UserAuthResponse userAuthResponse) {
        getViewModel().handleAuthResponse(userAuthResponse);
        try {
            MessageClient messageClient = Wearable.getMessageClient((Activity) this);
            qc.q.h(messageClient, "getMessageClient(...)");
            CapabilityClient capabilityClient = Wearable.getCapabilityClient((Activity) this);
            qc.q.h(capabilityClient, "getCapabilityClient(...)");
            ad.g.d(androidx.lifecycle.w.a(this), ad.a1.b(), null, new LoginActivity$handleAuthResponse$1(capabilityClient, messageClient, userAuthResponse, null), 2, null);
        } catch (Exception unused) {
        }
        handleAuthResponse(userAuthResponse.getNewUser());
    }

    private final void hideForm() {
        this.isShowingForm = false;
        ActivityLoginBinding activityLoginBinding = this.binding;
        ActivityLoginBinding activityLoginBinding2 = null;
        if (activityLoginBinding == null) {
            qc.q.z("binding");
            activityLoginBinding = null;
        }
        LockableScrollView lockableScrollView = activityLoginBinding.backgroundContainer;
        int[] iArr = new int[1];
        ActivityLoginBinding activityLoginBinding3 = this.binding;
        if (activityLoginBinding3 == null) {
            qc.q.z("binding");
            activityLoginBinding3 = null;
        }
        iArr[0] = activityLoginBinding3.backgroundContainer.getBottom();
        ObjectAnimator duration = ObjectAnimator.ofInt(lockableScrollView, "scrollY", iArr).setDuration(1000L);
        qc.q.h(duration, "setDuration(...)");
        ActivityLoginBinding activityLoginBinding4 = this.binding;
        if (activityLoginBinding4 == null) {
            qc.q.z("binding");
            activityLoginBinding4 = null;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(activityLoginBinding4.newGameButton, View.ALPHA, 1.0f).setDuration(700L);
        qc.q.h(duration2, "setDuration(...)");
        ActivityLoginBinding activityLoginBinding5 = this.binding;
        if (activityLoginBinding5 == null) {
            qc.q.z("binding");
            activityLoginBinding5 = null;
        }
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(activityLoginBinding5.showLoginButton, View.ALPHA, 1.0f).setDuration(700L);
        qc.q.h(duration3, "setDuration(...)");
        int[] iArr2 = new int[2];
        ActivityLoginBinding activityLoginBinding6 = this.binding;
        if (activityLoginBinding6 == null) {
            qc.q.z("binding");
            activityLoginBinding6 = null;
        }
        iArr2[0] = activityLoginBinding6.logoView.getMeasuredHeight();
        ActivityLoginBinding activityLoginBinding7 = this.binding;
        if (activityLoginBinding7 == null) {
            qc.q.z("binding");
            activityLoginBinding7 = null;
        }
        iArr2[1] = (int) (activityLoginBinding7.logoView.getMeasuredHeight() * 1.333333d);
        ValueAnimator ofInt = ValueAnimator.ofInt(iArr2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.habitrpg.android.habitica.ui.activities.b1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoginActivity.hideForm$lambda$14(LoginActivity.this, valueAnimator);
            }
        });
        duration3.setStartDelay(300L);
        ActivityLoginBinding activityLoginBinding8 = this.binding;
        if (activityLoginBinding8 == null) {
            qc.q.z("binding");
            activityLoginBinding8 = null;
        }
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(activityLoginBinding8.loginScrollview, View.ALPHA, 0.0f).setDuration(800L);
        qc.q.h(duration4, "setDuration(...)");
        duration4.addListener(new AnimatorListenerAdapter() { // from class: com.habitrpg.android.habitica.ui.activities.LoginActivity$hideForm$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ActivityLoginBinding activityLoginBinding9;
                ActivityLoginBinding activityLoginBinding10;
                ActivityLoginBinding activityLoginBinding11;
                qc.q.i(animator, "animation");
                activityLoginBinding9 = LoginActivity.this.binding;
                ActivityLoginBinding activityLoginBinding12 = null;
                if (activityLoginBinding9 == null) {
                    qc.q.z("binding");
                    activityLoginBinding9 = null;
                }
                activityLoginBinding9.newGameButton.setVisibility(0);
                activityLoginBinding10 = LoginActivity.this.binding;
                if (activityLoginBinding10 == null) {
                    qc.q.z("binding");
                    activityLoginBinding10 = null;
                }
                activityLoginBinding10.showLoginButton.setVisibility(0);
                activityLoginBinding11 = LoginActivity.this.binding;
                if (activityLoginBinding11 == null) {
                    qc.q.z("binding");
                } else {
                    activityLoginBinding12 = activityLoginBinding11;
                }
                activityLoginBinding12.loginScrollview.setVisibility(4);
            }
        });
        ActivityLoginBinding activityLoginBinding9 = this.binding;
        if (activityLoginBinding9 == null) {
            qc.q.z("binding");
        } else {
            activityLoginBinding2 = activityLoginBinding9;
        }
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(activityLoginBinding2.backButton, View.ALPHA, 0.0f).setDuration(800L);
        qc.q.h(duration5, "setDuration(...)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration4, duration5, ofInt);
        animatorSet.play(duration2).after(duration4);
        animatorSet.play(duration3).after(duration4);
        animatorSet.start();
        KeyboardUtilKt.dismissKeyboard(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideForm$lambda$14(LoginActivity loginActivity, ValueAnimator valueAnimator) {
        Integer num;
        int i10;
        qc.q.i(loginActivity, "this$0");
        qc.q.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ActivityLoginBinding activityLoginBinding = null;
        if (animatedValue instanceof Integer) {
            num = (Integer) animatedValue;
        } else {
            num = null;
        }
        ActivityLoginBinding activityLoginBinding2 = loginActivity.binding;
        if (activityLoginBinding2 == null) {
            qc.q.z("binding");
            activityLoginBinding2 = null;
        }
        ViewGroup.LayoutParams layoutParams = activityLoginBinding2.logoView.getLayoutParams();
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        layoutParams.height = i10;
        ActivityLoginBinding activityLoginBinding3 = loginActivity.binding;
        if (activityLoginBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityLoginBinding = activityLoginBinding3;
        }
        activityLoginBinding.logoView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideProgress() {
        runOnUiThread(new Runnable() { // from class: com.habitrpg.android.habitica.ui.activities.z0
            @Override // java.lang.Runnable
            public final void run() {
                LoginActivity.hideProgress$lambda$10(LoginActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideProgress$lambda$10(LoginActivity loginActivity) {
        qc.q.i(loginActivity, "this$0");
        ActivityLoginBinding activityLoginBinding = loginActivity.binding;
        ActivityLoginBinding activityLoginBinding2 = null;
        if (activityLoginBinding == null) {
            qc.q.z("binding");
            activityLoginBinding = null;
        }
        activityLoginBinding.googleLoginProgress.setVisibility(8);
        ActivityLoginBinding activityLoginBinding3 = loginActivity.binding;
        if (activityLoginBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityLoginBinding2 = activityLoginBinding3;
        }
        activityLoginBinding2.PBAsyncTask.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loginClick$lambda$0(LoginActivity loginActivity, View view) {
        qc.q.i(loginActivity, "this$0");
        ActivityLoginBinding activityLoginBinding = loginActivity.binding;
        if (activityLoginBinding == null) {
            qc.q.z("binding");
            activityLoginBinding = null;
        }
        activityLoginBinding.PBAsyncTask.setVisibility(0);
        if (loginActivity.isRegistering) {
            loginActivity.registerWithPassword();
        } else {
            loginActivity.loginWithPassword();
        }
    }

    private final void loginWithPassword() {
        boolean z10;
        int i10;
        boolean z11;
        ActivityLoginBinding activityLoginBinding = this.binding;
        if (activityLoginBinding == null) {
            qc.q.z("binding");
            activityLoginBinding = null;
        }
        String obj = activityLoginBinding.username.getText().toString();
        boolean z12 = true;
        int length = obj.length() - 1;
        int i11 = 0;
        boolean z13 = false;
        while (i11 <= length) {
            if (!z13) {
                i10 = i11;
            } else {
                i10 = length;
            }
            if (qc.q.k(obj.charAt(i10), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z13) {
                if (!z11) {
                    z13 = true;
                } else {
                    i11++;
                }
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        String obj2 = obj.subSequence(i11, length + 1).toString();
        ActivityLoginBinding activityLoginBinding2 = this.binding;
        if (activityLoginBinding2 == null) {
            qc.q.z("binding");
            activityLoginBinding2 = null;
        }
        String obj3 = activityLoginBinding2.password.getText().toString();
        if (obj2.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (obj3.length() != 0) {
                z12 = false;
            }
            if (!z12) {
                ad.g.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine(new LoginActivity$loginWithPassword$1(this)), null, new LoginActivity$loginWithPassword$2(this, obj2, obj3, null), 2, null);
                return;
            }
        }
        showValidationError(R.string.login_validation_error_fieldsmissing);
    }

    private final void newGameButtonClicked() {
        this.isRegistering = true;
        showForm();
        setRegistering();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(LoginActivity loginActivity) {
        qc.q.i(loginActivity, "this$0");
        ActivityLoginBinding activityLoginBinding = loginActivity.binding;
        ActivityLoginBinding activityLoginBinding2 = null;
        if (activityLoginBinding == null) {
            qc.q.z("binding");
            activityLoginBinding = null;
        }
        LockableScrollView lockableScrollView = activityLoginBinding.backgroundContainer;
        ActivityLoginBinding activityLoginBinding3 = loginActivity.binding;
        if (activityLoginBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityLoginBinding2 = activityLoginBinding3;
        }
        lockableScrollView.scrollTo(0, activityLoginBinding2.backgroundContainer.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(LoginActivity loginActivity, View view) {
        qc.q.i(loginActivity, "this$0");
        loginActivity.newGameButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6(LoginActivity loginActivity, View view) {
        qc.q.i(loginActivity, "this$0");
        loginActivity.showLoginButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(LoginActivity loginActivity, View view) {
        qc.q.i(loginActivity, "this$0");
        loginActivity.backButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(LoginActivity loginActivity, View view) {
        qc.q.i(loginActivity, "this$0");
        loginActivity.onForgotPasswordClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9(LoginActivity loginActivity, View view) {
        qc.q.i(loginActivity, "this$0");
        ActivityLoginBinding activityLoginBinding = loginActivity.binding;
        if (activityLoginBinding == null) {
            qc.q.z("binding");
            activityLoginBinding = null;
        }
        activityLoginBinding.googleLoginProgress.setVisibility(0);
        loginActivity.getViewModel().handleGoogleLogin(loginActivity, loginActivity.pickAccountResult);
    }

    private final void onForgotPasswordClicked() {
        EditText editText = new EditText(this);
        if (Build.VERSION.SDK_INT >= 26) {
            editText.setAutofillHints(new String[]{"emailAddress"});
        }
        editText.setInputType(33);
        editText.setHint(getString(R.string.forgot_password_hint_example));
        editText.setTextSize(16.0f);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
        habiticaAlertDialog.setTitle(R.string.forgot_password_title);
        habiticaAlertDialog.setMessage(R.string.forgot_password_description);
        habiticaAlertDialog.setAdditionalContentView(editText);
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.send, true, false, false, (pc.p) new LoginActivity$onForgotPasswordClicked$1(this, editText), 12, (Object) null);
        AlertDialogExtensionsKt.addCancelButton$default(habiticaAlertDialog, false, null, 3, null);
        habiticaAlertDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickAccountResult$lambda$11(LoginActivity loginActivity, ActivityResult activityResult) {
        qc.q.i(loginActivity, "this$0");
        ActivityLoginBinding activityLoginBinding = null;
        String str = null;
        if (activityResult.b() == -1) {
            AuthenticationViewModel viewModel = loginActivity.getViewModel();
            Intent a10 = activityResult.a();
            if (a10 != null) {
                str = a10.getStringExtra("authAccount");
            }
            viewModel.setGoogleEmail(str);
            loginActivity.getViewModel().handleGoogleLoginResult(loginActivity, loginActivity.recoverFromPlayServicesErrorResult, new LoginActivity$pickAccountResult$1$1(loginActivity));
            return;
        }
        ActivityLoginBinding activityLoginBinding2 = loginActivity.binding;
        if (activityLoginBinding2 == null) {
            qc.q.z("binding");
        } else {
            activityLoginBinding = activityLoginBinding2;
        }
        activityLoginBinding.googleLoginProgress.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recoverFromPlayServicesErrorResult$lambda$12(LoginActivity loginActivity, ActivityResult activityResult) {
        qc.q.i(loginActivity, "this$0");
        if (activityResult.b() != 0) {
            loginActivity.getViewModel().handleGoogleLoginResult(loginActivity, null, new LoginActivity$recoverFromPlayServicesErrorResult$1$1(loginActivity));
        }
    }

    private final void registerWithPassword() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean z14;
        int i11;
        boolean z15;
        ActivityLoginBinding activityLoginBinding = this.binding;
        ActivityLoginBinding activityLoginBinding2 = null;
        if (activityLoginBinding == null) {
            qc.q.z("binding");
            activityLoginBinding = null;
        }
        String obj = activityLoginBinding.username.getText().toString();
        int length = obj.length() - 1;
        int i12 = 0;
        boolean z16 = false;
        while (i12 <= length) {
            if (!z16) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (qc.q.k(obj.charAt(i11), 32) <= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z16) {
                if (!z15) {
                    z16 = true;
                } else {
                    i12++;
                }
            } else if (!z15) {
                break;
            } else {
                length--;
            }
        }
        String obj2 = obj.subSequence(i12, length + 1).toString();
        ActivityLoginBinding activityLoginBinding3 = this.binding;
        if (activityLoginBinding3 == null) {
            qc.q.z("binding");
            activityLoginBinding3 = null;
        }
        String obj3 = activityLoginBinding3.email.getText().toString();
        int length2 = obj3.length() - 1;
        int i13 = 0;
        boolean z17 = false;
        while (i13 <= length2) {
            if (!z17) {
                i10 = i13;
            } else {
                i10 = length2;
            }
            if (qc.q.k(obj3.charAt(i10), 32) <= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z17) {
                if (!z14) {
                    z17 = true;
                } else {
                    i13++;
                }
            } else if (!z14) {
                break;
            } else {
                length2--;
            }
        }
        String obj4 = obj3.subSequence(i13, length2 + 1).toString();
        ActivityLoginBinding activityLoginBinding4 = this.binding;
        if (activityLoginBinding4 == null) {
            qc.q.z("binding");
            activityLoginBinding4 = null;
        }
        String obj5 = activityLoginBinding4.password.getText().toString();
        ActivityLoginBinding activityLoginBinding5 = this.binding;
        if (activityLoginBinding5 == null) {
            qc.q.z("binding");
        } else {
            activityLoginBinding2 = activityLoginBinding5;
        }
        String obj6 = activityLoginBinding2.confirmPassword.getText().toString();
        if (obj2.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (obj5.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (obj4.length() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    if (obj6.length() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        if (obj5.length() < getConfigManager().minimumPasswordLength()) {
                            String string = getString(R.string.password_too_short, Long.valueOf(getConfigManager().minimumPasswordLength()));
                            qc.q.h(string, "getString(...)");
                            showValidationError(string);
                            return;
                        }
                        ad.g.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine(new LoginActivity$registerWithPassword$1(this)), null, new LoginActivity$registerWithPassword$2(this, obj2, obj4, obj5, obj6, null), 2, null);
                        return;
                    }
                }
            }
        }
        showValidationError(R.string.login_validation_error_fieldsmissing);
    }

    private final void resetLayout() {
        ActivityLoginBinding activityLoginBinding = null;
        if (this.isRegistering) {
            ActivityLoginBinding activityLoginBinding2 = this.binding;
            if (activityLoginBinding2 == null) {
                qc.q.z("binding");
                activityLoginBinding2 = null;
            }
            if (activityLoginBinding2.email.getVisibility() == 8) {
                Companion companion = Companion;
                ActivityLoginBinding activityLoginBinding3 = this.binding;
                if (activityLoginBinding3 == null) {
                    qc.q.z("binding");
                    activityLoginBinding3 = null;
                }
                EditText editText = activityLoginBinding3.email;
                qc.q.h(editText, Scopes.EMAIL);
                companion.show(editText);
            }
            ActivityLoginBinding activityLoginBinding4 = this.binding;
            if (activityLoginBinding4 == null) {
                qc.q.z("binding");
                activityLoginBinding4 = null;
            }
            if (activityLoginBinding4.confirmPassword.getVisibility() == 8) {
                Companion companion2 = Companion;
                ActivityLoginBinding activityLoginBinding5 = this.binding;
                if (activityLoginBinding5 == null) {
                    qc.q.z("binding");
                } else {
                    activityLoginBinding = activityLoginBinding5;
                }
                EditText editText2 = activityLoginBinding.confirmPassword;
                qc.q.h(editText2, "confirmPassword");
                companion2.show(editText2);
                return;
            }
            return;
        }
        ActivityLoginBinding activityLoginBinding6 = this.binding;
        if (activityLoginBinding6 == null) {
            qc.q.z("binding");
            activityLoginBinding6 = null;
        }
        if (activityLoginBinding6.email.getVisibility() == 0) {
            Companion companion3 = Companion;
            ActivityLoginBinding activityLoginBinding7 = this.binding;
            if (activityLoginBinding7 == null) {
                qc.q.z("binding");
                activityLoginBinding7 = null;
            }
            EditText editText3 = activityLoginBinding7.email;
            qc.q.h(editText3, Scopes.EMAIL);
            companion3.hide(editText3);
        }
        ActivityLoginBinding activityLoginBinding8 = this.binding;
        if (activityLoginBinding8 == null) {
            qc.q.z("binding");
            activityLoginBinding8 = null;
        }
        if (activityLoginBinding8.confirmPassword.getVisibility() == 0) {
            Companion companion4 = Companion;
            ActivityLoginBinding activityLoginBinding9 = this.binding;
            if (activityLoginBinding9 == null) {
                qc.q.z("binding");
            } else {
                activityLoginBinding = activityLoginBinding9;
            }
            EditText editText4 = activityLoginBinding.confirmPassword;
            qc.q.h(editText4, "confirmPassword");
            companion4.hide(editText4);
        }
    }

    private final void setRegistering() {
        ActivityLoginBinding activityLoginBinding = null;
        if (this.isRegistering) {
            ActivityLoginBinding activityLoginBinding2 = this.binding;
            if (activityLoginBinding2 == null) {
                qc.q.z("binding");
                activityLoginBinding2 = null;
            }
            activityLoginBinding2.loginBtn.setText(getString(R.string.register_btn));
            ActivityLoginBinding activityLoginBinding3 = this.binding;
            if (activityLoginBinding3 == null) {
                qc.q.z("binding");
                activityLoginBinding3 = null;
            }
            activityLoginBinding3.username.setHint(R.string.username);
            if (Build.VERSION.SDK_INT >= 26) {
                ActivityLoginBinding activityLoginBinding4 = this.binding;
                if (activityLoginBinding4 == null) {
                    qc.q.z("binding");
                    activityLoginBinding4 = null;
                }
                activityLoginBinding4.username.setAutofillHints(new String[]{"newUsername"});
                ActivityLoginBinding activityLoginBinding5 = this.binding;
                if (activityLoginBinding5 == null) {
                    qc.q.z("binding");
                    activityLoginBinding5 = null;
                }
                activityLoginBinding5.password.setAutofillHints(new String[]{"newPassword"});
            }
            ActivityLoginBinding activityLoginBinding6 = this.binding;
            if (activityLoginBinding6 == null) {
                qc.q.z("binding");
                activityLoginBinding6 = null;
            }
            activityLoginBinding6.password.setImeOptions(5);
            ActivityLoginBinding activityLoginBinding7 = this.binding;
            if (activityLoginBinding7 == null) {
                qc.q.z("binding");
            } else {
                activityLoginBinding = activityLoginBinding7;
            }
            activityLoginBinding.googleLoginButton.setText(R.string.register_btn_google);
        } else {
            ActivityLoginBinding activityLoginBinding8 = this.binding;
            if (activityLoginBinding8 == null) {
                qc.q.z("binding");
                activityLoginBinding8 = null;
            }
            activityLoginBinding8.loginBtn.setText(getString(R.string.login_btn));
            ActivityLoginBinding activityLoginBinding9 = this.binding;
            if (activityLoginBinding9 == null) {
                qc.q.z("binding");
                activityLoginBinding9 = null;
            }
            activityLoginBinding9.username.setHint(R.string.email_username);
            if (Build.VERSION.SDK_INT >= 26) {
                ActivityLoginBinding activityLoginBinding10 = this.binding;
                if (activityLoginBinding10 == null) {
                    qc.q.z("binding");
                    activityLoginBinding10 = null;
                }
                activityLoginBinding10.username.setAutofillHints(new String[]{"username"});
                ActivityLoginBinding activityLoginBinding11 = this.binding;
                if (activityLoginBinding11 == null) {
                    qc.q.z("binding");
                    activityLoginBinding11 = null;
                }
                activityLoginBinding11.password.setAutofillHints(new String[]{"password"});
            }
            ActivityLoginBinding activityLoginBinding12 = this.binding;
            if (activityLoginBinding12 == null) {
                qc.q.z("binding");
                activityLoginBinding12 = null;
            }
            activityLoginBinding12.password.setImeOptions(6);
            ActivityLoginBinding activityLoginBinding13 = this.binding;
            if (activityLoginBinding13 == null) {
                qc.q.z("binding");
            } else {
                activityLoginBinding = activityLoginBinding13;
            }
            activityLoginBinding.googleLoginButton.setText(R.string.login_btn_google);
        }
        resetLayout();
    }

    private final void showForm() {
        this.isShowingForm = true;
        ActivityLoginBinding activityLoginBinding = this.binding;
        if (activityLoginBinding == null) {
            qc.q.z("binding");
            activityLoginBinding = null;
        }
        ObjectAnimator duration = ObjectAnimator.ofInt(activityLoginBinding.backgroundContainer, "scrollY", 0).setDuration(1000L);
        qc.q.h(duration, "setDuration(...)");
        ActivityLoginBinding activityLoginBinding2 = this.binding;
        if (activityLoginBinding2 == null) {
            qc.q.z("binding");
            activityLoginBinding2 = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(activityLoginBinding2.newGameButton, View.ALPHA, 0.0f);
        ActivityLoginBinding activityLoginBinding3 = this.binding;
        if (activityLoginBinding3 == null) {
            qc.q.z("binding");
            activityLoginBinding3 = null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(activityLoginBinding3.showLoginButton, View.ALPHA, 0.0f);
        int[] iArr = new int[2];
        ActivityLoginBinding activityLoginBinding4 = this.binding;
        if (activityLoginBinding4 == null) {
            qc.q.z("binding");
            activityLoginBinding4 = null;
        }
        iArr[0] = activityLoginBinding4.logoView.getMeasuredHeight();
        ActivityLoginBinding activityLoginBinding5 = this.binding;
        if (activityLoginBinding5 == null) {
            qc.q.z("binding");
            activityLoginBinding5 = null;
        }
        iArr[1] = (int) (activityLoginBinding5.logoView.getMeasuredHeight() * 0.75d);
        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.habitrpg.android.habitica.ui.activities.a1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoginActivity.showForm$lambda$13(LoginActivity.this, valueAnimator);
            }
        });
        if (this.isRegistering) {
            ofFloat.setStartDelay(600L);
            ofFloat.setDuration(400L);
            ofFloat2.setDuration(400L);
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.habitrpg.android.habitica.ui.activities.LoginActivity$showForm$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ActivityLoginBinding activityLoginBinding6;
                    ActivityLoginBinding activityLoginBinding7;
                    ActivityLoginBinding activityLoginBinding8;
                    ActivityLoginBinding activityLoginBinding9;
                    qc.q.i(animator, "animation");
                    activityLoginBinding6 = LoginActivity.this.binding;
                    ActivityLoginBinding activityLoginBinding10 = null;
                    if (activityLoginBinding6 == null) {
                        qc.q.z("binding");
                        activityLoginBinding6 = null;
                    }
                    activityLoginBinding6.newGameButton.setVisibility(8);
                    activityLoginBinding7 = LoginActivity.this.binding;
                    if (activityLoginBinding7 == null) {
                        qc.q.z("binding");
                        activityLoginBinding7 = null;
                    }
                    activityLoginBinding7.showLoginButton.setVisibility(8);
                    activityLoginBinding8 = LoginActivity.this.binding;
                    if (activityLoginBinding8 == null) {
                        qc.q.z("binding");
                        activityLoginBinding8 = null;
                    }
                    activityLoginBinding8.loginScrollview.setVisibility(0);
                    activityLoginBinding9 = LoginActivity.this.binding;
                    if (activityLoginBinding9 == null) {
                        qc.q.z("binding");
                    } else {
                        activityLoginBinding10 = activityLoginBinding9;
                    }
                    activityLoginBinding10.loginScrollview.setAlpha(1.0f);
                }
            });
        } else {
            ofFloat2.setStartDelay(600L);
            ofFloat2.setDuration(400L);
            ofFloat.setDuration(400L);
            ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.habitrpg.android.habitica.ui.activities.LoginActivity$showForm$3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ActivityLoginBinding activityLoginBinding6;
                    ActivityLoginBinding activityLoginBinding7;
                    ActivityLoginBinding activityLoginBinding8;
                    ActivityLoginBinding activityLoginBinding9;
                    qc.q.i(animator, "animation");
                    activityLoginBinding6 = LoginActivity.this.binding;
                    ActivityLoginBinding activityLoginBinding10 = null;
                    if (activityLoginBinding6 == null) {
                        qc.q.z("binding");
                        activityLoginBinding6 = null;
                    }
                    activityLoginBinding6.newGameButton.setVisibility(8);
                    activityLoginBinding7 = LoginActivity.this.binding;
                    if (activityLoginBinding7 == null) {
                        qc.q.z("binding");
                        activityLoginBinding7 = null;
                    }
                    activityLoginBinding7.showLoginButton.setVisibility(8);
                    activityLoginBinding8 = LoginActivity.this.binding;
                    if (activityLoginBinding8 == null) {
                        qc.q.z("binding");
                        activityLoginBinding8 = null;
                    }
                    activityLoginBinding8.loginScrollview.setVisibility(0);
                    activityLoginBinding9 = LoginActivity.this.binding;
                    if (activityLoginBinding9 == null) {
                        qc.q.z("binding");
                    } else {
                        activityLoginBinding10 = activityLoginBinding9;
                    }
                    activityLoginBinding10.loginScrollview.setAlpha(1.0f);
                }
            });
        }
        ActivityLoginBinding activityLoginBinding6 = this.binding;
        if (activityLoginBinding6 == null) {
            qc.q.z("binding");
            activityLoginBinding6 = null;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(activityLoginBinding6.backButton, View.ALPHA, 1.0f).setDuration(800L);
        qc.q.h(duration2, "setDuration(...)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, ofFloat, ofFloat2, ofInt);
        animatorSet.play(duration2).after(duration);
        ActivityLoginBinding activityLoginBinding7 = this.binding;
        if (activityLoginBinding7 == null) {
            qc.q.z("binding");
            activityLoginBinding7 = null;
        }
        int childCount = activityLoginBinding7.formWrapper.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ActivityLoginBinding activityLoginBinding8 = this.binding;
            if (activityLoginBinding8 == null) {
                qc.q.z("binding");
                activityLoginBinding8 = null;
            }
            View childAt = activityLoginBinding8.formWrapper.getChildAt(i10);
            childAt.setAlpha(0.0f);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(childAt, View.ALPHA, 1.0f).setDuration(400L);
            qc.q.h(duration3, "setDuration(...)");
            duration3.setStartDelay(i10 * 100);
            animatorSet.play(duration3).after(duration);
        }
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showForm$lambda$13(LoginActivity loginActivity, ValueAnimator valueAnimator) {
        Integer num;
        int i10;
        qc.q.i(loginActivity, "this$0");
        qc.q.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ActivityLoginBinding activityLoginBinding = null;
        if (animatedValue instanceof Integer) {
            num = (Integer) animatedValue;
        } else {
            num = null;
        }
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        ActivityLoginBinding activityLoginBinding2 = loginActivity.binding;
        if (activityLoginBinding2 == null) {
            qc.q.z("binding");
            activityLoginBinding2 = null;
        }
        ViewGroup.LayoutParams layoutParams = activityLoginBinding2.logoView.getLayoutParams();
        layoutParams.height = i10;
        ActivityLoginBinding activityLoginBinding3 = loginActivity.binding;
        if (activityLoginBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityLoginBinding = activityLoginBinding3;
        }
        activityLoginBinding.logoView.setLayoutParams(layoutParams);
    }

    private final void showLoginButtonClicked() {
        this.isRegistering = false;
        showForm();
        setRegistering();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPasswordEmailConfirmation() {
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
        habiticaAlertDialog.setMessage(R.string.forgot_password_confirmation);
        AlertDialogExtensionsKt.addOkButton$default(habiticaAlertDialog, false, null, 3, null);
        habiticaAlertDialog.show();
    }

    private final void showValidationError(int i10) {
        String string = getString(i10);
        qc.q.h(string, "getString(...)");
        showValidationError(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(335544320);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSetupActivity() {
        Intent intent = new Intent(this, SetupActivity.class);
        intent.addFlags(335544320);
        startActivity(intent);
        finish();
    }

    private final void toggleRegistering() {
        this.isRegistering = !this.isRegistering;
        setRegistering();
    }

    @Override // android.app.Activity
    public void finish() {
        KeyboardUtilKt.dismissKeyboard(this);
        super.finish();
    }

    public final ApiClient getApiClient() {
        ApiClient apiClient = this.apiClient;
        if (apiClient != null) {
            return apiClient;
        }
        qc.q.z("apiClient");
        return null;
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("configManager");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityLoginBinding inflate = ActivityLoginBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        FrameLayout root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_login);
    }

    public final SharedPreferences getSharedPrefs() {
        SharedPreferences sharedPreferences = this.sharedPrefs;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        qc.q.z("sharedPrefs");
        return null;
    }

    public final AuthenticationViewModel getViewModel() {
        AuthenticationViewModel authenticationViewModel = this.viewModel;
        if (authenticationViewModel != null) {
            return authenticationViewModel;
        }
        qc.q.z("viewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public void loadTheme$Habitica_2311256681_prodRelease(SharedPreferences sharedPreferences, boolean z10) {
        qc.q.i(sharedPreferences, "sharedPreferences");
        super.loadTheme$Habitica_2311256681_prodRelease(sharedPreferences, z10);
        Window window = getWindow();
        qc.q.h(window, "getWindow(...)");
        WindowExtensionsKt.updateStatusBarColor(window, R.color.black_20_alpha, false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.isShowingForm) {
            hideForm();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().requestFeature(8);
        super.onCreate(bundle);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.k();
        }
        androidx.preference.k.n(this, R.xml.preferences_fragment, false);
        ActivityLoginBinding activityLoginBinding = this.binding;
        ActivityLoginBinding activityLoginBinding2 = null;
        if (activityLoginBinding == null) {
            qc.q.z("binding");
            activityLoginBinding = null;
        }
        activityLoginBinding.loginBtn.setOnClickListener(this.loginClick);
        ActivityLoginBinding activityLoginBinding3 = this.binding;
        if (activityLoginBinding3 == null) {
            qc.q.z("binding");
            activityLoginBinding3 = null;
        }
        SpannableString spannableString = new SpannableString(activityLoginBinding3.forgotPassword.getText());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        ActivityLoginBinding activityLoginBinding4 = this.binding;
        if (activityLoginBinding4 == null) {
            qc.q.z("binding");
            activityLoginBinding4 = null;
        }
        activityLoginBinding4.forgotPassword.setText(spannableString);
        ActivityLoginBinding activityLoginBinding5 = this.binding;
        if (activityLoginBinding5 == null) {
            qc.q.z("binding");
            activityLoginBinding5 = null;
        }
        activityLoginBinding5.privacyPolicy.setMovementMethod(LinkMovementMethod.getInstance());
        this.isRegistering = true;
        HashMap hashMap = new HashMap();
        String simpleName = LoginActivity.class.getSimpleName();
        qc.q.h(simpleName, "getSimpleName(...)");
        hashMap.put("page", simpleName);
        ActivityLoginBinding activityLoginBinding6 = this.binding;
        if (activityLoginBinding6 == null) {
            qc.q.z("binding");
            activityLoginBinding6 = null;
        }
        activityLoginBinding6.backgroundContainer.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.activities.f1
            @Override // java.lang.Runnable
            public final void run() {
                LoginActivity.onCreate$lambda$4(LoginActivity.this);
            }
        });
        ActivityLoginBinding activityLoginBinding7 = this.binding;
        if (activityLoginBinding7 == null) {
            qc.q.z("binding");
            activityLoginBinding7 = null;
        }
        activityLoginBinding7.backgroundContainer.setScrollable(false);
        getWindow().setStatusBarColor(androidx.core.content.a.c(this, R.color.black_20_alpha));
        getWindow().addFlags(67108864);
        ActivityLoginBinding activityLoginBinding8 = this.binding;
        if (activityLoginBinding8 == null) {
            qc.q.z("binding");
            activityLoginBinding8 = null;
        }
        activityLoginBinding8.newGameButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.onCreate$lambda$5(LoginActivity.this, view);
            }
        });
        ActivityLoginBinding activityLoginBinding9 = this.binding;
        if (activityLoginBinding9 == null) {
            qc.q.z("binding");
            activityLoginBinding9 = null;
        }
        activityLoginBinding9.showLoginButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.onCreate$lambda$6(LoginActivity.this, view);
            }
        });
        ActivityLoginBinding activityLoginBinding10 = this.binding;
        if (activityLoginBinding10 == null) {
            qc.q.z("binding");
            activityLoginBinding10 = null;
        }
        activityLoginBinding10.backButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.onCreate$lambda$7(LoginActivity.this, view);
            }
        });
        ActivityLoginBinding activityLoginBinding11 = this.binding;
        if (activityLoginBinding11 == null) {
            qc.q.z("binding");
            activityLoginBinding11 = null;
        }
        activityLoginBinding11.forgotPassword.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.onCreate$lambda$8(LoginActivity.this, view);
            }
        });
        ActivityLoginBinding activityLoginBinding12 = this.binding;
        if (activityLoginBinding12 == null) {
            qc.q.z("binding");
        } else {
            activityLoginBinding2 = activityLoginBinding12;
        }
        activityLoginBinding2.googleLoginButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.onCreate$lambda$9(LoginActivity.this, view);
            }
        });
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_toggleRegistering) {
            toggleRegistering();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void setApiClient(ApiClient apiClient) {
        qc.q.i(apiClient, "<set-?>");
        this.apiClient = apiClient;
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setSharedPrefs(SharedPreferences sharedPreferences) {
        qc.q.i(sharedPreferences, "<set-?>");
        this.sharedPrefs = sharedPreferences;
    }

    public final void setViewModel(AuthenticationViewModel authenticationViewModel) {
        qc.q.i(authenticationViewModel, "<set-?>");
        this.viewModel = authenticationViewModel;
    }

    private final void showValidationError(String str) {
        ActivityLoginBinding activityLoginBinding = this.binding;
        if (activityLoginBinding == null) {
            qc.q.z("binding");
            activityLoginBinding = null;
        }
        activityLoginBinding.PBAsyncTask.setVisibility(8);
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
        habiticaAlertDialog.setTitle(R.string.login_validation_error_title);
        habiticaAlertDialog.setMessage(str);
        AlertDialogExtensionsKt.addOkButton$default(habiticaAlertDialog, false, null, 3, null);
        habiticaAlertDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAuthResponse(boolean z10) {
        hideProgress();
        KeyboardUtilKt.dismissKeyboard(this);
        if (this.isRegistering) {
            FirebaseAnalytics.getInstance(this).a("user_registered", null);
        }
        ad.g.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new LoginActivity$handleAuthResponse$2(this, z10, null), 2, null);
    }
}
