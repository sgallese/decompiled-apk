package com.habitrpg.android.habitica.ui.fragments.support;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import qc.r;

/* compiled from: FAQOverviewFragment.kt */
/* loaded from: classes4.dex */
final class FAQOverviewFragment$versionName$2 extends r implements pc.a<String> {
    final /* synthetic */ FAQOverviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FAQOverviewFragment$versionName$2(FAQOverviewFragment fAQOverviewFragment) {
        super(0);
        this.this$0 = fAQOverviewFragment;
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
