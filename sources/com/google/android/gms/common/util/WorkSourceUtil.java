package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.core.content.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static Boolean zzj;

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:2|3)|4|(22:54|55|7|8|9|10|11|12|13|(13:46|47|16|(10:41|42|19|(7:36|37|22|(6:28|29|30|31|25|26)|24|25|26)|21|22|(0)|24|25|26)|18|19|(0)|21|22|(0)|24|25|26)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L18
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L18
            r5[r3] = r6     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L18
            goto L1a
        L18:
            r5 = r4
        L1a:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r5
            boolean r5 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L32
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L32
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L32
            r5[r3] = r8     // Catch: java.lang.Exception -> L32
            r5[r2] = r6     // Catch: java.lang.Exception -> L32
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L32
            goto L33
        L32:
            r0 = r4
        L33:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L3e
            goto L3f
        L3e:
            r0 = r4
        L3f:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r0
            java.lang.String r0 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L4e
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4e
            r5[r3] = r8     // Catch: java.lang.Exception -> L4e
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L4e
            goto L50
        L4e:
            r0 = r4
        L50:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L66
            java.lang.String r0 = "getName"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L65
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L65
            r5[r3] = r8     // Catch: java.lang.Exception -> L65
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L65
            goto L67
        L65:
        L66:
            r0 = r4
        L67:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L80
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L7a
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch: java.lang.Exception -> L7a
            goto L81
        L7a:
            r0 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r8, r0)
        L80:
            r0 = r4
        L81:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto La4
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L9e
            java.lang.String r8 = "addNode"
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L9e
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9e
            r7[r3] = r9     // Catch: java.lang.Exception -> L9e
            r7[r2] = r6     // Catch: java.lang.Exception -> L9e
            java.lang.reflect.Method r0 = r0.getMethod(r8, r7)     // Catch: java.lang.Exception -> L9e
            goto La5
        L9e:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain class"
            android.util.Log.w(r5, r6, r0)
        La4:
            r0 = r4
        La5:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lb9
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lb9
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> Lb9
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> Lba
            goto Lba
        Lb9:
            r0 = r4
        Lba:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r0
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(WorkSource workSource, int i10, String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    @KeepForSdk
    public static WorkSource fromPackage(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @KeepForSdk
    public static WorkSource fromPackageAndModuleExperimentalPi(Context context, String str, String str2) {
        Method method;
        if (context != null && context.getPackageManager() != null && str2 != null && str != null) {
            int i10 = -1;
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                } else {
                    i10 = applicationInfo.uid;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
            if (i10 < 0) {
                return null;
            }
            WorkSource workSource = new WorkSource();
            Method method2 = zzg;
            if (method2 != null && (method = zzh) != null) {
                try {
                    Object invoke = method2.invoke(workSource, new Object[0]);
                    int i11 = zza;
                    if (i10 != i11) {
                        method.invoke(invoke, Integer.valueOf(i10), str);
                    }
                    method.invoke(invoke, Integer.valueOf(i11), str2);
                } catch (Exception e10) {
                    Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e10);
                }
            } else {
                add(workSource, i10, str);
            }
            return workSource;
        }
        Log.w("WorkSourceUtil", "Unexpected null arguments");
        return null;
    }

    @KeepForSdk
    public static int get(WorkSource workSource, int i10) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i10));
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }

    @KeepForSdk
    public static String getName(WorkSource workSource, int i10) {
        Method method = zzf;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return null;
            }
        }
        return null;
    }

    @KeepForSdk
    public static List<String> getNames(WorkSource workSource) {
        int size;
        ArrayList arrayList = new ArrayList();
        if (workSource == null) {
            size = 0;
        } else {
            size = size(workSource);
        }
        if (size != 0) {
            for (int i10 = 0; i10 < size; i10++) {
                String name = getName(workSource, i10);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static synchronized boolean hasWorkSourcePermission(Context context) {
        synchronized (WorkSourceUtil.class) {
            Boolean bool = zzj;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z10 = false;
            if (context == null) {
                return false;
            }
            if (a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            zzj = valueOf;
            return valueOf.booleanValue();
        }
    }

    @KeepForSdk
    public static boolean isEmpty(WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        if (size(workSource) != 0) {
            return false;
        }
        return true;
    }

    @KeepForSdk
    public static int size(WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }
}
