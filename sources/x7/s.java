package x7;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class s {
    public static void a(PackageManager packageManager, ComponentName componentName, int i10) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 516);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i11 = 0;
                    loop0: while (true) {
                        if (i11 < 3) {
                            ComponentInfo[] componentInfoArr2 = componentInfoArr[i11];
                            if (componentInfoArr2 != null) {
                                int length = componentInfoArr2.length;
                                for (int i12 = 0; i12 < length; i12++) {
                                    componentInfo = componentInfoArr2[i12];
                                    if (componentInfo.name.equals(className)) {
                                        break loop0;
                                    }
                                }
                            }
                            i11++;
                        } else {
                            componentInfo = null;
                            break;
                        }
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }
}
