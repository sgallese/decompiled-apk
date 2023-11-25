package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.login.LockableScrollView;
import com.habitrpg.android.habitica.ui.views.login.LoginBackgroundView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityLoginBinding implements a {
    public final ProgressBar PBAsyncTask;
    public final Button appleLoginButton;
    public final ImageButton backButton;
    public final LockableScrollView backgroundContainer;
    public final LoginBackgroundView backgroundView;
    public final ImageView cityView;
    public final Space cloudAnchor;
    public final EditText confirmPassword;
    public final EditText email;
    public final Button forgotPassword;
    public final LinearLayout formWrapper;
    public final Button googleLoginButton;
    public final CircularProgressIndicator googleLoginProgress;
    public final ImageView leftCloudView;
    public final Button loginBtn;
    public final ScrollView loginScrollview;
    public final ImageView logoView;
    public final AppCompatButton newGameButton;
    public final EditText password;
    public final TextView privacyPolicy;
    public final ImageView rightCloudView;
    private final FrameLayout rootView;
    public final AppCompatButton showLoginButton;
    public final EditText username;

    private ActivityLoginBinding(FrameLayout frameLayout, ProgressBar progressBar, Button button, ImageButton imageButton, LockableScrollView lockableScrollView, LoginBackgroundView loginBackgroundView, ImageView imageView, Space space, EditText editText, EditText editText2, Button button2, LinearLayout linearLayout, Button button3, CircularProgressIndicator circularProgressIndicator, ImageView imageView2, Button button4, ScrollView scrollView, ImageView imageView3, AppCompatButton appCompatButton, EditText editText3, TextView textView, ImageView imageView4, AppCompatButton appCompatButton2, EditText editText4) {
        this.rootView = frameLayout;
        this.PBAsyncTask = progressBar;
        this.appleLoginButton = button;
        this.backButton = imageButton;
        this.backgroundContainer = lockableScrollView;
        this.backgroundView = loginBackgroundView;
        this.cityView = imageView;
        this.cloudAnchor = space;
        this.confirmPassword = editText;
        this.email = editText2;
        this.forgotPassword = button2;
        this.formWrapper = linearLayout;
        this.googleLoginButton = button3;
        this.googleLoginProgress = circularProgressIndicator;
        this.leftCloudView = imageView2;
        this.loginBtn = button4;
        this.loginScrollview = scrollView;
        this.logoView = imageView3;
        this.newGameButton = appCompatButton;
        this.password = editText3;
        this.privacyPolicy = textView;
        this.rightCloudView = imageView4;
        this.showLoginButton = appCompatButton2;
        this.username = editText4;
    }

    public static ActivityLoginBinding bind(View view) {
        int i10 = R.id.PB_AsyncTask;
        ProgressBar progressBar = (ProgressBar) b.a(view, R.id.PB_AsyncTask);
        if (progressBar != null) {
            i10 = R.id.apple_login_button;
            Button button = (Button) b.a(view, R.id.apple_login_button);
            if (button != null) {
                i10 = R.id.back_button;
                ImageButton imageButton = (ImageButton) b.a(view, R.id.back_button);
                if (imageButton != null) {
                    i10 = R.id.background_container;
                    LockableScrollView lockableScrollView = (LockableScrollView) b.a(view, R.id.background_container);
                    if (lockableScrollView != null) {
                        i10 = R.id.background_view;
                        LoginBackgroundView loginBackgroundView = (LoginBackgroundView) b.a(view, R.id.background_view);
                        if (loginBackgroundView != null) {
                            i10 = R.id.city_view;
                            ImageView imageView = (ImageView) b.a(view, R.id.city_view);
                            if (imageView != null) {
                                i10 = R.id.cloud_anchor;
                                Space space = (Space) b.a(view, R.id.cloud_anchor);
                                if (space != null) {
                                    i10 = R.id.confirm_password;
                                    EditText editText = (EditText) b.a(view, R.id.confirm_password);
                                    if (editText != null) {
                                        i10 = R.id.email;
                                        EditText editText2 = (EditText) b.a(view, R.id.email);
                                        if (editText2 != null) {
                                            i10 = R.id.forgot_password;
                                            Button button2 = (Button) b.a(view, R.id.forgot_password);
                                            if (button2 != null) {
                                                i10 = R.id.form_wrapper;
                                                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.form_wrapper);
                                                if (linearLayout != null) {
                                                    i10 = R.id.google_login_button;
                                                    Button button3 = (Button) b.a(view, R.id.google_login_button);
                                                    if (button3 != null) {
                                                        i10 = R.id.google_login_progress;
                                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b.a(view, R.id.google_login_progress);
                                                        if (circularProgressIndicator != null) {
                                                            i10 = R.id.left_cloud_view;
                                                            ImageView imageView2 = (ImageView) b.a(view, R.id.left_cloud_view);
                                                            if (imageView2 != null) {
                                                                i10 = R.id.login_btn;
                                                                Button button4 = (Button) b.a(view, R.id.login_btn);
                                                                if (button4 != null) {
                                                                    i10 = R.id.login_scrollview;
                                                                    ScrollView scrollView = (ScrollView) b.a(view, R.id.login_scrollview);
                                                                    if (scrollView != null) {
                                                                        i10 = R.id.logo_view;
                                                                        ImageView imageView3 = (ImageView) b.a(view, R.id.logo_view);
                                                                        if (imageView3 != null) {
                                                                            i10 = R.id.new_game_button;
                                                                            AppCompatButton appCompatButton = (AppCompatButton) b.a(view, R.id.new_game_button);
                                                                            if (appCompatButton != null) {
                                                                                i10 = R.id.password;
                                                                                EditText editText3 = (EditText) b.a(view, R.id.password);
                                                                                if (editText3 != null) {
                                                                                    i10 = R.id.privacy_policy;
                                                                                    TextView textView = (TextView) b.a(view, R.id.privacy_policy);
                                                                                    if (textView != null) {
                                                                                        i10 = R.id.right_cloud_view;
                                                                                        ImageView imageView4 = (ImageView) b.a(view, R.id.right_cloud_view);
                                                                                        if (imageView4 != null) {
                                                                                            i10 = R.id.show_login_button;
                                                                                            AppCompatButton appCompatButton2 = (AppCompatButton) b.a(view, R.id.show_login_button);
                                                                                            if (appCompatButton2 != null) {
                                                                                                i10 = R.id.username;
                                                                                                EditText editText4 = (EditText) b.a(view, R.id.username);
                                                                                                if (editText4 != null) {
                                                                                                    return new ActivityLoginBinding((FrameLayout) view, progressBar, button, imageButton, lockableScrollView, loginBackgroundView, imageView, space, editText, editText2, button2, linearLayout, button3, circularProgressIndicator, imageView2, button4, scrollView, imageView3, appCompatButton, editText3, textView, imageView4, appCompatButton2, editText4);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_login, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
