package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbtf implements zzbth {
    static zzbth zza;
    static zzbth zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzcag zzh;
    private final Object zzd = new Object();
    private final WeakHashMap zzf = new WeakHashMap();

    protected zzbtf(Context context, zzcag zzcagVar) {
        zzfod.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzcagVar;
    }

    public static zzbth zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbds.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhv)).booleanValue()) {
                        zza = new zzbtf(context, zzcag.zza());
                    }
                }
                zza = new zzbtg();
            }
        }
        return zza;
    }

    public static zzbth zzb(Context context, zzcag zzcagVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbds.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhv)).booleanValue()) {
                        zzbtf zzbtfVar = new zzbtf(context, zzcagVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbtfVar.zzd) {
                                zzbtfVar.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbte(zzbtfVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbtd(zzbtfVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbtfVar;
                    }
                }
                zzb = new zzbtg();
            }
        }
        return zzb;
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzfrx.zzc(zzbzt.zzf(zzc(th)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zze(Thread thread, Throwable th) {
        if (th != null) {
            boolean z10 = false;
            boolean z11 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z10 |= zzbzt.zzo(stackTraceElement.getClassName());
                    z11 |= zzbtf.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z10 && !z11) {
                zzg(th, "", 1.0f);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzg(Throwable th, String str, float f10) {
        Throwable th2;
        Throwable th3;
        String str2;
        int i10;
        String str3;
        String str4;
        Handler handler = zzbzt.zza;
        boolean z10 = false;
        if (((Boolean) zzbds.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                linkedList.push(th4);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th5 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th5.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z11 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzbzt.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z11 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        } else {
                            arrayList.add(stackTraceElement);
                        }
                    }
                }
                if (z11) {
                    if (th2 == null) {
                        th3 = new Throwable(th5.getMessage());
                    } else {
                        th3 = new Throwable(th5.getMessage(), th2);
                    }
                    th2 = th3;
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String zzc2 = zzc(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziu)).booleanValue()) {
            str2 = zzd(th);
        } else {
            str2 = "";
        }
        double d10 = f10;
        double random = Math.random();
        if (f10 > 0.0f) {
            i10 = (int) (1.0f / f10);
        } else {
            i10 = 1;
        }
        if (random < d10) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                z10 = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th6) {
                zzcaa.zzh("Error fetching instant app info", th6);
            }
            try {
                str3 = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzcaa.zzj("Cannot obtain package name, proceeding.");
                str3 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z10)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str5 = Build.MANUFACTURER;
            String str6 = Build.MODEL;
            if (!str6.startsWith(str5)) {
                str6 = str5 + " " + str6;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzc2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "559203513").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(zzbds.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze)));
            if (true != this.zzh.zze) {
                str4 = "0";
            } else {
                str4 = "1";
            }
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("lite", str4);
            if (!TextUtils.isEmpty(str2)) {
                appendQueryParameter3.appendQueryParameter("hash", str2);
            }
            arrayList2.add(appendQueryParameter3.toString());
            for (final String str7 : arrayList2) {
                final zzcaf zzcafVar = new zzcaf(null);
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcaf.this.zza(str7);
                    }
                });
            }
        }
    }
}
