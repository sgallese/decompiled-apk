package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import ca.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        int i10;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            i10 = applicationInfo.minSdkVersion;
            return String.valueOf(i10);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return i(installerPackageName);
        }
        return "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<k8.c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ca.c.c());
        arrayList.add(g9.f.g());
        arrayList.add(ca.h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(ca.h.b("fire-core", "20.3.2"));
        arrayList.add(ca.h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(ca.h.b("device-model", i(Build.DEVICE)));
        arrayList.add(ca.h.b("device-brand", i(Build.BRAND)));
        arrayList.add(ca.h.c("android-target-sdk", new h.a() { // from class: com.google.firebase.g
            @Override // ca.h.a
            public final String a(Object obj) {
                String e10;
                e10 = FirebaseCommonRegistrar.e((Context) obj);
                return e10;
            }
        }));
        arrayList.add(ca.h.c("android-min-sdk", new h.a() { // from class: com.google.firebase.h
            @Override // ca.h.a
            public final String a(Object obj) {
                String f10;
                f10 = FirebaseCommonRegistrar.f((Context) obj);
                return f10;
            }
        }));
        arrayList.add(ca.h.c("android-platform", new h.a() { // from class: com.google.firebase.i
            @Override // ca.h.a
            public final String a(Object obj) {
                String g10;
                g10 = FirebaseCommonRegistrar.g((Context) obj);
                return g10;
            }
        }));
        arrayList.add(ca.h.c("android-installer", new h.a() { // from class: com.google.firebase.j
            @Override // ca.h.a
            public final String a(Object obj) {
                String h10;
                h10 = FirebaseCommonRegistrar.h((Context) obj);
                return h10;
            }
        }));
        String a10 = ca.e.a();
        if (a10 != null) {
            arrayList.add(ca.h.b("kotlin", a10));
        }
        return arrayList;
    }
}
