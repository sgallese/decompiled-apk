package com.habitrpg.android.habitica.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentAboutBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import com.habitrpg.common.habitica.helpers.MainNavigationController;

/* compiled from: AboutFragment.kt */
/* loaded from: classes4.dex */
public final class AboutFragment extends Hilt_AboutFragment<FragmentAboutBinding> {
    public static final int $stable = 8;
    public AppConfigManager appConfigManager;
    private FragmentAboutBinding binding;
    private final dc.f versionCode$delegate;
    private final dc.f versionName$delegate;
    private int versionNumberTappedCount;
    private final String privacyPolicyLink = "https://habitica.com/static/privacy";
    private final String termsLink = "https://habitica.com/static/terms";
    private final String androidSourceCodeLink = "https://github.com/HabitRPG/habitrpg-android/";
    private final String twitterLink = "https://twitter.com/habitica";

    public AboutFragment() {
        dc.f b10;
        dc.f b11;
        b10 = dc.h.b(new AboutFragment$versionName$2(this));
        this.versionName$delegate = b10;
        b11 = dc.h.b(new AboutFragment$versionCode$2(this));
        this.versionCode$delegate = b11;
    }

    private final void doTheThing() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FirebaseAnalytics.getInstance(context).a("found_easter_egg", null);
        DataBindingUtils dataBindingUtils = DataBindingUtils.INSTANCE;
        dataBindingUtils.loadImage(context, "Pet-Sabretooth-Base", new AboutFragment$doTheThing$1(this));
        dataBindingUtils.loadImage(context, "Pet-Sabretooth-Golden", new AboutFragment$doTheThing$2(this));
        dataBindingUtils.loadImage(context, "Pet-Sabretooth-Red", new AboutFragment$doTheThing$3(this));
    }

    private final int getVersionCode() {
        return ((Number) this.versionCode$delegate.getValue()).intValue();
    }

    private final String getVersionName() {
        return (String) this.versionName$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityCreated$lambda$3(AboutFragment aboutFragment, View view) {
        qc.q.i(aboutFragment, "this$0");
        boolean z10 = true;
        int i10 = aboutFragment.versionNumberTappedCount + 1;
        aboutFragment.versionNumberTappedCount = i10;
        if (i10 == 1) {
            Context context = aboutFragment.getContext();
            if (context != null) {
                Toast.makeText(context, "Oh! You tapped me!", 0).show();
                return;
            }
            return;
        }
        if (5 > i10 || i10 >= 8) {
            z10 = false;
        }
        if (z10) {
            Context context2 = aboutFragment.getContext();
            if (context2 != null) {
                Toast.makeText(context2, "Only " + (8 - aboutFragment.versionNumberTappedCount) + " taps left!", 0).show();
            }
        } else if (i10 == 8) {
            Context context3 = aboutFragment.getContext();
            if (context3 != null) {
                Toast.makeText(context3, "You were blessed with cats!", 0).show();
            }
            aboutFragment.doTheThing();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$10(View view) {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.bugFixFragment, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$11(AboutFragment aboutFragment, View view) {
        qc.q.i(aboutFragment, "this$0");
        aboutFragment.openGooglePlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$12(AboutFragment aboutFragment, View view) {
        qc.q.i(aboutFragment, "this$0");
        aboutFragment.openGooglePlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(AboutFragment aboutFragment, View view) {
        qc.q.i(aboutFragment, "this$0");
        aboutFragment.openBrowserLink(aboutFragment.privacyPolicyLink);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(AboutFragment aboutFragment, View view) {
        qc.q.i(aboutFragment, "this$0");
        aboutFragment.openBrowserLink(aboutFragment.termsLink);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(View view) {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.guidelinesActivity, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(AboutFragment aboutFragment, View view) {
        qc.q.i(aboutFragment, "this$0");
        aboutFragment.openBrowserLink(aboutFragment.androidSourceCodeLink);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$8(AboutFragment aboutFragment, View view) {
        qc.q.i(aboutFragment, "this$0");
        aboutFragment.openBrowserLink(aboutFragment.twitterLink);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$9(AboutFragment aboutFragment, View view) {
        qc.q.i(aboutFragment, "this$0");
        aboutFragment.openBrowserLink(aboutFragment.androidSourceCodeLink);
    }

    private final void openBrowserLink(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    private final void openGooglePlay() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=com.habitrpg.android.habitica"));
        startActivity(intent);
    }

    public final AppConfigManager getAppConfigManager() {
        AppConfigManager appConfigManager = this.appConfigManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("appConfigManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        TextView textView;
        super.onActivityCreated(bundle);
        FragmentAboutBinding binding = getBinding();
        if (binding != null && (textView = binding.versionInfo) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutFragment.onActivityCreated$lambda$3(AboutFragment.this, view);
                }
            });
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        LinearLayout linearLayout;
        Button button;
        Button button2;
        Button button3;
        TextView textView2;
        TextView textView3;
        Button button4;
        Button button5;
        Button button6;
        LinearLayout linearLayout2;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentAboutBinding binding = getBinding();
        LinearLayout linearLayout3 = null;
        TextView textView4 = null;
        if (binding != null) {
            textView = binding.versionInfo;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(getString(R.string.version_info, getVersionName(), Integer.valueOf(getVersionCode())));
        }
        if (getAppConfigManager().lastVersionCode() > getVersionCode()) {
            FragmentAboutBinding binding2 = getBinding();
            if (binding2 != null) {
                linearLayout2 = binding2.updateAvailableWrapper;
            } else {
                linearLayout2 = null;
            }
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            FragmentAboutBinding binding3 = getBinding();
            if (binding3 != null) {
                textView4 = binding3.updateAvailableTextview;
            }
            if (textView4 != null) {
                textView4.setText(getString(R.string.update_available, getAppConfigManager().lastVersionNumber(), Long.valueOf(getAppConfigManager().lastVersionCode())));
            }
        } else {
            FragmentAboutBinding binding4 = getBinding();
            if (binding4 != null) {
                linearLayout3 = binding4.updateAvailableWrapper;
            }
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
        }
        FragmentAboutBinding binding5 = getBinding();
        if (binding5 != null && (button6 = binding5.privacyPolicyButton) != null) {
            button6.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AboutFragment.onViewCreated$lambda$4(AboutFragment.this, view2);
                }
            });
        }
        FragmentAboutBinding binding6 = getBinding();
        if (binding6 != null && (button5 = binding6.termsButton) != null) {
            button5.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AboutFragment.onViewCreated$lambda$5(AboutFragment.this, view2);
                }
            });
        }
        FragmentAboutBinding binding7 = getBinding();
        if (binding7 != null && (button4 = binding7.guidelinesButton) != null) {
            button4.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AboutFragment.onViewCreated$lambda$6(view2);
                }
            });
        }
        FragmentAboutBinding binding8 = getBinding();
        if (binding8 != null && (textView3 = binding8.sourceCodeLink) != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AboutFragment.onViewCreated$lambda$7(AboutFragment.this, view2);
                }
            });
        }
        FragmentAboutBinding binding9 = getBinding();
        if (binding9 != null && (textView2 = binding9.twitter) != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AboutFragment.onViewCreated$lambda$8(AboutFragment.this, view2);
                }
            });
        }
        FragmentAboutBinding binding10 = getBinding();
        if (binding10 != null && (button3 = binding10.sourceCodeButton) != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AboutFragment.onViewCreated$lambda$9(AboutFragment.this, view2);
                }
            });
        }
        FragmentAboutBinding binding11 = getBinding();
        if (binding11 != null && (button2 = binding11.reportBug) != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AboutFragment.onViewCreated$lambda$10(view2);
                }
            });
        }
        FragmentAboutBinding binding12 = getBinding();
        if (binding12 != null && (button = binding12.googlePlayStoreButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AboutFragment.onViewCreated$lambda$11(AboutFragment.this, view2);
                }
            });
        }
        FragmentAboutBinding binding13 = getBinding();
        if (binding13 != null && (linearLayout = binding13.updateAvailableWrapper) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AboutFragment.onViewCreated$lambda$12(AboutFragment.this, view2);
                }
            });
        }
    }

    public final void setAppConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentAboutBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentAboutBinding inflate = FragmentAboutBinding.inflate(getLayoutInflater(), viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentAboutBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentAboutBinding fragmentAboutBinding) {
        this.binding = fragmentAboutBinding;
    }
}
