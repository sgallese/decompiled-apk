package com.habitrpg.android.habitica.ui.fragments;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.habitrpg.android.habitica.ui.activities.MainActivity;

/* compiled from: AboutFragment.kt */
/* loaded from: classes4.dex */
final class AboutFragment$versionCode$2 extends qc.r implements pc.a<Integer> {
    final /* synthetic */ AboutFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutFragment$versionCode$2(AboutFragment aboutFragment) {
        super(0);
        this.this$0 = aboutFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final Integer invoke() {
        PackageManager packageManager;
        int i10 = 0;
        try {
            MainActivity mainActivity = this.this$0.getMainActivity();
            if (mainActivity != null && (packageManager = mainActivity.getPackageManager()) != null) {
                MainActivity mainActivity2 = this.this$0.getMainActivity();
                String packageName = mainActivity2 != null ? mainActivity2.getPackageName() : null;
                if (packageName == null) {
                    packageName = "";
                }
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                if (packageInfo != null) {
                    i10 = packageInfo.versionCode;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return Integer.valueOf(i10);
    }
}
