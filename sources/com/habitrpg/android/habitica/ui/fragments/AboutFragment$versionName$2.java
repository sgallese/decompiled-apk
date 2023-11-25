package com.habitrpg.android.habitica.ui.fragments;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.habitrpg.android.habitica.ui.activities.MainActivity;

/* compiled from: AboutFragment.kt */
/* loaded from: classes4.dex */
final class AboutFragment$versionName$2 extends qc.r implements pc.a<String> {
    final /* synthetic */ AboutFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutFragment$versionName$2(AboutFragment aboutFragment) {
        super(0);
        this.this$0 = aboutFragment;
    }

    @Override // pc.a
    public final String invoke() {
        PackageManager packageManager;
        try {
            MainActivity mainActivity = this.this$0.getMainActivity();
            String str = null;
            if (mainActivity != null && (packageManager = mainActivity.getPackageManager()) != null) {
                MainActivity mainActivity2 = this.this$0.getMainActivity();
                String packageName = mainActivity2 != null ? mainActivity2.getPackageName() : null;
                if (packageName == null) {
                    packageName = "";
                }
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                if (packageInfo != null) {
                    str = packageInfo.versionName;
                }
            }
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }
}
