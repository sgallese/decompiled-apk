package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcez;
import com.google.android.gms.internal.ads.zzcgf;
import com.google.android.gms.internal.ads.zzdop;
import com.google.android.gms.internal.ads.zzfbe;
import com.google.android.gms.internal.ads.zzfbi;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzfrv;
import com.google.android.gms.internal.ads.zzfye;
import com.google.android.gms.internal.ads.zzgzh;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzs {
    public static final zzfoe zza = new zzf(Looper.getMainLooper());
    private String zzf;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private boolean zzd = true;
    private final Object zze = new Object();
    private boolean zzg = false;
    private boolean zzh = false;
    private final Executor zzi = Executors.newSingleThreadExecutor();

    public static final boolean zzA(Context context) {
        KeyguardManager zzU;
        if (context == null || (zzU = zzU(context)) == null || !zzU.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    public static final boolean zzB(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzcaa.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzC() {
        int myUid = Process.myUid();
        if (myUid != 0 && myUid != 1000) {
            return false;
        }
        return true;
    }

    public static final boolean zzD(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        if (powerManager.isScreenOn()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzE(Context context) {
        Bundle zzV = zzV(context);
        String string = zzV.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
        if (TextUtils.isEmpty(zzW(zzV)) && !TextUtils.isEmpty(string)) {
            return true;
        }
        return false;
    }

    public static final boolean zzF(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzG(View view, int i10, MotionEvent motionEvent) {
        String str;
        int i11;
        int i12;
        int i13;
        String str2;
        zzfbe zzD;
        zzfbi zzP;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdop) {
                view2 = ((zzdop) view2).getChildAt(0);
            }
            if (!(view2 instanceof com.google.android.gms.ads.formats.zzg) && !(view2 instanceof NativeAdView)) {
                str = "UNKNOWN";
                i11 = 0;
            } else {
                str = "NATIVE";
                i11 = 1;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i13 = rect.width();
                i12 = rect.height();
            } else {
                i12 = 0;
                i13 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            long zzt = zzt(view2);
            view2.getLocationOnScreen(iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            boolean z10 = view2 instanceof zzcgf;
            String str3 = DevicePublicKeyStringDef.NONE;
            if (z10 && (zzP = ((zzcgf) view2).zzP()) != null) {
                str2 = zzP.zzb;
                view2.setContentDescription(str2 + ":" + view2.hashCode());
            } else {
                str2 = DevicePublicKeyStringDef.NONE;
            }
            if ((view2 instanceof zzcez) && (zzD = ((zzcez) view2).zzD()) != null) {
                str = zzfbe.zza(zzD.zzb);
                i11 = zzD.zzf;
                str3 = zzD.zzF;
            }
            zzcaa.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i11), view2.getClass().getName(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i13), Integer.valueOf(i12), Long.valueOf(zzt), Integer.toString(i10, 2)));
        } catch (Exception e10) {
            zzcaa.zzh("Failure getting view location.", e10);
        }
    }

    public static final AlertDialog.Builder zzH(Context context) {
        return new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zzq().zza());
    }

    public static final void zzI(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new zzby(context, str, (String) it.next()).zzb();
        }
    }

    public static final void zzJ(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbds.zzb.zze()).booleanValue()) {
                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String zzK(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb2 = new StringBuilder(8192);
        char[] cArr = new char[RecyclerView.m.FLAG_MOVED];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read != -1) {
                sb2.append(cArr, 0, read);
            } else {
                return sb2.toString();
            }
        }
    }

    public static final int zzL(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            zzcaa.zzj("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    public static final Map zzM(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final int[] zzN(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window != null && (findViewById = window.findViewById(16908290)) != null) {
            return new int[]{findViewById.getWidth(), findViewById.getHeight()};
        }
        return zzr();
    }

    public static final int[] zzO(Activity activity) {
        int[] zzr;
        View findViewById;
        Window window = activity.getWindow();
        if (window != null && (findViewById = window.findViewById(16908290)) != null) {
            zzr = new int[]{findViewById.getTop(), findViewById.getBottom()};
        } else {
            zzr = zzr();
        }
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzr[1])};
    }

    public static final boolean zzP(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10;
        if (!com.google.android.gms.ads.internal.zzt.zzp().zzd && keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode() && !zzl(view)) {
            z10 = false;
        } else {
            z10 = true;
        }
        long zzt = zzt(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbi)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjC)).booleanValue()) {
                    return true;
                }
                if (zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjE)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzQ(Context context, Intent intent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjU)).booleanValue()) {
            try {
                zzY(context, intent);
                return;
            } catch (SecurityException e10) {
                zzcaa.zzk("", e10);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdUtil.startActivityWithUnknownContext");
                return;
            }
        }
        zzY(context, intent);
    }

    public static final void zzR(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzm(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            zzcaa.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e10) {
            zzcaa.zzh("No browser is found.", e10);
        }
    }

    public static final int[] zzS(Activity activity) {
        int[] zzN = zzN(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzN[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzN[1])};
    }

    public static final boolean zzT(View view, Context context) {
        PowerManager powerManager;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            powerManager = (PowerManager) applicationContext.getSystemService("power");
        } else {
            powerManager = null;
        }
        return zzP(view, powerManager, zzU(context));
    }

    private static KeyguardManager zzU(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    private static Bundle zzV(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            zze.zzb("Error getting metadata", e10);
            return null;
        }
    }

    private static String zzW(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (!string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") && !string.matches("^/\\d+~.+$")) {
            return "";
        }
        return string;
    }

    private static boolean zzX(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void zzY(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static int zza(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 > 0) {
            zzcaa.zzj("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
            return 60000;
        }
        return 60000;
    }

    public static List zzd() {
        zzbbj zzbbjVar = zzbbr.zza;
        List zzb = com.google.android.gms.ads.internal.client.zzba.zza().zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = zzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzfrv.zzc(zzfqt.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzl(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzl(android.view.View):boolean");
    }

    public static final void zzm(Context context, Intent intent) {
        Bundle bundle;
        if (intent == null) {
            return;
        }
        if (intent.getExtras() != null) {
            bundle = intent.getExtras();
        } else {
            bundle = new Bundle();
        }
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        bundle.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(bundle);
    }

    public static final String zzn(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzW(zzV(context));
    }

    static final String zzo() {
        StringBuilder sb2 = new StringBuilder((int) UserVerificationMethods.USER_VERIFY_HANDPRINT);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String zzp() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics zzq(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzr() {
        return new int[]{0, 0};
    }

    public static final Map zzs(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        String optString = optJSONArray.optString(i10);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzt(View view) {
        float f10;
        float f11 = Float.MAX_VALUE;
        do {
            f10 = 0.0f;
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f11 = Math.min(f11, view2.getAlpha());
            view = view2.getParent();
        } while (f11 > 0.0f);
        if (f11 >= 0.0f) {
            f10 = f11;
        }
        return Math.round(f10 * 100.0f);
    }

    public static final WebResourceResponse zzu(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            zzcaa.zzk("Could not fetch MRAID JS.", e10);
        }
        return null;
    }

    public static final String zzv() {
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        if (zzd != null) {
            return zzd.getString(R.string.f9408s7);
        }
        return "Test Ad";
    }

    public static final zzbr zzw(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzcaa.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof zzbr) {
                return (zzbr) queryLocalInterface;
            }
            return new zzbp(iBinder);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzx(Context context, String str) {
        Context zza2 = zzbvb.zza(context);
        if (Wrappers.packageManager(zza2).checkPermission(str, zza2.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean zzy(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzz(String str) {
        if (!zzbzz.zzk()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeN)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeP);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeO);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final com.google.common.util.concurrent.a zzb(final Uri uri) {
        return zzfye.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = uri;
                zzfoe zzfoeVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                return zzs.zzM(uri2);
            }
        }, this.zzi);
    }

    public final String zzc(final Context context, String str) {
        String str2;
        synchronized (this.zze) {
            String str3 = this.zzf;
            if (str3 != null) {
                return str3;
            }
            if (str == null) {
                return zzo();
            }
            try {
                zzci zza2 = zzci.zza();
                if (TextUtils.isEmpty(zza2.zza)) {
                    if (ClientLibraryUtils.isPackageSide()) {
                        str2 = (String) zzcf.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcg
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Context context2 = context;
                                SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                    SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                    return defaultUserAgent;
                                }
                                zze.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                        });
                    } else {
                        final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                        str2 = (String) zzcf.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzch
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                SharedPreferences sharedPreferences;
                                Context context2 = remoteContext;
                                Context context3 = context;
                                boolean z10 = false;
                                if (context2 != null) {
                                    zze.zza("Attempting to read user agent from Google Play Services.");
                                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                } else {
                                    zze.zza("Attempting to read user agent from local cache.");
                                    sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                    z10 = true;
                                }
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.zza("Reading user agent from WebSettings");
                                    string = WebSettings.getDefaultUserAgent(context3);
                                    if (z10) {
                                        sharedPreferences.edit().putString("user_agent", string).apply();
                                        zze.zza("Persisting user agent.");
                                    }
                                }
                                return string;
                            }
                        });
                    }
                    zza2.zza = str2;
                }
                this.zzf = zza2.zza;
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.zzf)) {
                this.zzf = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(this.zzf)) {
                this.zzf = zzo();
            }
            this.zzf = this.zzf + " (Mobile; " + str;
            try {
                if (Wrappers.packageManager(context).isCallerInstantApp()) {
                    this.zzf = this.zzf + ";aia";
                }
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdUtil.getUserAgent");
            }
            String str4 = this.zzf + ")";
            this.zzf = str4;
            return str4;
        }
    }

    public final void zzf(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int zza2 = zza(i10);
        zzcaa.zzi("HTTP timeout: " + zza2 + " milliseconds.");
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzg(String str) {
        return zzX(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzac));
    }

    public final boolean zzh(String str) {
        return zzX(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzad));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzi(Context context) {
        if (this.zzh) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbbr.zza(context);
        zzo zzoVar = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjT)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, zzoVar), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, zzoVar), intentFilter);
        }
        this.zzh = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzj(Context context) {
        if (this.zzg) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbbr.zza(context);
        zzq zzqVar = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjT)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new zzr(this, zzqVar), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this, zzqVar), intentFilter);
        }
        this.zzg = true;
        return true;
    }

    public final int zzk(Context context, Uri uri) {
        int i10;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        } else {
            i10 = 0;
        }
        zzbbj zzbbjVar = zzbbr.zzes;
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar);
        zzbbj zzbbjVar2 = zzbbr.zzet;
        if (true == bool.equals(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue()) {
            zzbcs zzbcsVar = new zzbcs();
            zzbcsVar.zze(new zzn(this, zzbcsVar, context, uri));
            zzbcsVar.zzb((Activity) context);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar2)).booleanValue()) {
            androidx.browser.customtabs.d a10 = new d.a().a();
            a10.f1758a.setPackage(zzgzh.zza(context));
            a10.a(context, uri);
            return 5;
        }
        return 5;
    }
}
