package com.habitrpg.android.habitica.ui.fragments.support;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.lifecycle.w;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentSupportBugFixBinding;
import com.habitrpg.android.habitica.databinding.KnownIssueBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.AppTestingLevel;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.l;
import java.util.Iterator;
import java.util.Map;
import la.b;
import qc.q;

/* compiled from: BugFixFragment.kt */
/* loaded from: classes4.dex */
public final class BugFixFragment extends Hilt_BugFixFragment<FragmentSupportBugFixBinding> {
    public static final int $stable = 8;
    public AppConfigManager appConfigManager;
    private FragmentSupportBugFixBinding binding;
    private b.c deviceInfo;
    public MainUserViewModel userViewModel;
    private final dc.f versionCode$delegate;
    private final dc.f versionName$delegate;

    public BugFixFragment() {
        dc.f b10;
        dc.f b11;
        b10 = dc.h.b(new BugFixFragment$versionName$2(this));
        this.versionName$delegate = b10;
        b11 = dc.h.b(new BugFixFragment$versionCode$2(this));
        this.versionCode$delegate = b11;
    }

    private final int getVersionCode() {
        return ((Number) this.versionCode$delegate.getValue()).intValue();
    }

    private final String getVersionName() {
        return (String) this.versionName$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(BugFixFragment bugFixFragment, View view) {
        q.i(bugFixFragment, "this$0");
        bugFixFragment.sendEmail("[Android] Bugreport");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2$lambda$1(Map map, View view) {
        q.i(map, "$issue");
        MainNavigationController.INSTANCE.navigate(R.id.FAQDetailFragment, androidx.core.os.e.a(new l("question", map.get("title")), new l("answer", map.get("text"))));
    }

    private final void sendEmail(String str) {
        String e10;
        String str2;
        int i10;
        String str3;
        boolean z10;
        boolean z11;
        int i11;
        Integer lvl;
        int i12 = Build.VERSION.SDK_INT;
        b.c cVar = this.deviceInfo;
        if (cVar == null || (e10 = cVar.a()) == null) {
            e10 = la.b.e();
        }
        b.c cVar2 = this.deviceInfo;
        if (cVar2 == null || (str2 = cVar2.f19633a) == null) {
            str2 = Build.MANUFACTURER;
        }
        int i13 = 0;
        boolean z12 = true;
        String str4 = Uri.encode("Device: " + str2 + " " + e10) + "%0D%0A" + Uri.encode("Android Version: " + i12) + "%0D%0A" + Uri.encode("AppVersion: " + getString(R.string.version_info, getVersionName(), Integer.valueOf(getVersionCode())));
        if (!q.d(getAppConfigManager().testingLevel().name(), AppTestingLevel.PRODUCTION.name())) {
            str4 = ((Object) str4) + " " + Uri.encode(getAppConfigManager().testingLevel().name());
        }
        String str5 = ((Object) str4) + "%0D%0A" + Uri.encode("User ID: " + getUserViewModel().getUserID());
        User f10 = getUserViewModel().getUser().f();
        if (f10 != null) {
            Stats stats = f10.getStats();
            if (stats != null && (lvl = stats.getLvl()) != null) {
                i10 = lvl.intValue();
            } else {
                i10 = 0;
            }
            String encode = Uri.encode("Level: " + i10);
            Preferences preferences = f10.getPreferences();
            if (preferences == null || !preferences.getDisableClasses()) {
                z12 = false;
            }
            if (z12) {
                str3 = "Disabled";
            } else {
                Stats stats2 = f10.getStats();
                if (stats2 == null || (str3 = stats2.getHabitClass()) == null) {
                    str3 = "None";
                }
            }
            String encode2 = Uri.encode("Class: " + str3);
            Preferences preferences2 = f10.getPreferences();
            if (preferences2 != null) {
                z10 = preferences2.getSleep();
            } else {
                z10 = false;
            }
            String encode3 = Uri.encode("Is in Inn: " + z10);
            Preferences preferences3 = f10.getPreferences();
            if (preferences3 != null) {
                z11 = preferences3.getCostume();
            } else {
                z11 = false;
            }
            String encode4 = Uri.encode("Uses Costume: " + z11);
            Preferences preferences4 = f10.getPreferences();
            if (preferences4 != null) {
                i11 = preferences4.getDayStart();
            } else {
                i11 = 0;
            }
            String encode5 = Uri.encode("Custom Day Start: " + i11);
            Preferences preferences5 = f10.getPreferences();
            if (preferences5 != null) {
                i13 = preferences5.getTimezoneOffset();
            }
            str5 = ((Object) str5) + "%0D%0A" + encode + "%0D%0A" + encode2 + "%0D%0A" + encode3 + "%0D%0A" + encode4 + "%0D%0A" + encode5 + "%0D%0A" + Uri.encode("Timezone Offset: " + i13);
        }
        String str6 = ((Object) str5) + "%0D%0ADetails:%0D%0A%0D%0A";
        if (getMainActivity() != null) {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:" + getAppConfigManager().supportEmail() + "?subject=" + Uri.encode(str) + "&body=" + ((Object) str6)));
            startActivity(Intent.createChooser(intent, "Choose an Email client:"));
        }
    }

    public final AppConfigManager getAppConfigManager() {
        AppConfigManager appConfigManager = this.appConfigManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        q.z("appConfigManager");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        setShowsBackButton(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout;
        Button button;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new BugFixFragment$onViewCreated$1(this, null), 2, null);
        FragmentSupportBugFixBinding binding = getBinding();
        if (binding != null && (button = binding.reportBugButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.support.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BugFixFragment.onViewCreated$lambda$0(BugFixFragment.this, view2);
                }
            });
        }
        Iterator<T> it = getAppConfigManager().knownIssues().iterator();
        while (it.hasNext()) {
            final Map map = (Map) it.next();
            Context context = view.getContext();
            q.h(context, "getContext(...)");
            KnownIssueBinding inflate = KnownIssueBinding.inflate(ContextExtensionsKt.getLayoutInflater(context));
            q.h(inflate, "inflate(...)");
            inflate.getRoot().setText((CharSequence) map.get("title"));
            inflate.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.support.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BugFixFragment.onViewCreated$lambda$2$lambda$1(map, view2);
                }
            });
            FragmentSupportBugFixBinding binding2 = getBinding();
            if (binding2 != null && (linearLayout = binding2.knownIssuesLayout) != null) {
                linearLayout.addView(inflate.getRoot());
            }
        }
    }

    public final void setAppConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentSupportBugFixBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentSupportBugFixBinding inflate = FragmentSupportBugFixBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentSupportBugFixBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentSupportBugFixBinding fragmentSupportBugFixBinding) {
        this.binding = fragmentSupportBugFixBinding;
    }
}
