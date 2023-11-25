package o4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PackageManagerHelper.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f20484a = androidx.work.l.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        int i10;
        Object obj;
        String str = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i10, 1);
            androidx.work.l c10 = androidx.work.l.c();
            String str2 = f20484a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z10) {
                obj = "enabled";
            } else {
                obj = "disabled";
            }
            objArr[1] = obj;
            c10.a(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            androidx.work.l c11 = androidx.work.l.c();
            String str3 = f20484a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z10) {
                str = "disabled";
            }
            objArr2[1] = str;
            c11.a(str3, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
