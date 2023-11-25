package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdtj {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdpc zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdrq zzl;
    private final zzcag zzm;
    private final zzdcz zzo;
    private final zzfhu zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcas zze = new zzcas();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();

    public zzdtj(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdpc zzdpcVar, ScheduledExecutorService scheduledExecutorService, zzdrq zzdrqVar, zzcag zzcagVar, zzdcz zzdczVar, zzfhu zzfhuVar) {
        this.zzh = zzdpcVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdrqVar;
        this.zzm = zzcagVar;
        this.zzo = zzdczVar;
        this.zzp = zzfhuVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzj(final zzdtj zzdtjVar, String str) {
        int i10 = 5;
        final zzfhg zza = zzfhf.zza(zzdtjVar.zzf, 5);
        zza.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfhg zza2 = zzfhf.zza(zzdtjVar.zzf, i10);
                zza2.zzh();
                zza2.zzd(next);
                final Object obj = new Object();
                final zzcas zzcasVar = new zzcas();
                com.google.common.util.concurrent.a zzo = zzfye.zzo(zzcasVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbL)).longValue(), TimeUnit.SECONDS, zzdtjVar.zzk);
                zzdtjVar.zzl.zzc(next);
                zzdtjVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdta
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdtj.this.zzq(obj, zzcasVar, next, elapsedRealtime, zza2);
                    }
                }, zzdtjVar.zzi);
                arrayList.add(zzo);
                final zzdti zzdtiVar = new zzdti(zzdtjVar, obj, next, elapsedRealtime, zza2, zzcasVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbky(optString, bundle));
                            i11++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdtjVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfcw zzc = zzdtjVar.zzh.zzc(next, new JSONObject());
                        zzdtjVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdte
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdtj.this.zzn(zzc, zzdtiVar, arrayList2, next);
                            }
                        });
                    } catch (RemoteException e10) {
                        zzcaa.zzh("", e10);
                    }
                } catch (zzfcf unused2) {
                    zzdtiVar.zze("Failed to create Adapter.");
                }
                i10 = 5;
            }
            zzfye.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdtb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdtj.this.zzf(zza);
                    return null;
                }
            }, zzdtjVar.zzi);
        } catch (JSONException e11) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e11);
            zzdtjVar.zzo.zza("MalformedJson");
            zzdtjVar.zzl.zza("MalformedJson");
            zzdtjVar.zze.zzd(e11);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e11, "AdapterInitializer.updateAdapterStatus");
            zzfhu zzfhuVar = zzdtjVar.zzp;
            zza.zzg(e11);
            zza.zzf(false);
            zzfhuVar.zzb(zza.zzl());
        }
    }

    private final synchronized com.google.common.util.concurrent.a zzu() {
        String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzfye.zzh(zzc);
        }
        final zzcas zzcasVar = new zzcas();
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtf
            @Override // java.lang.Runnable
            public final void run() {
                zzdtj.this.zzo(zzcasVar);
            }
        });
        return zzcasVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z10, String str2, int i10) {
        this.zzn.put(str, new zzbko(str, z10, i10, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzf(zzfhg zzfhgVar) throws Exception {
        this.zze.zzc(Boolean.TRUE);
        zzfhu zzfhuVar = this.zzp;
        zzfhgVar.zzf(true);
        zzfhuVar.zzb(zzfhgVar.zzl());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbko zzbkoVar = (zzbko) this.zzn.get(str);
            arrayList.add(new zzbko(str, zzbkoVar.zzb, zzbkoVar.zzc, zzbkoVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(zzfcw zzfcwVar, zzbks zzbksVar, List list, String str) {
        try {
            try {
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfcwVar.zzi(context, zzbksVar, list);
            } catch (zzfcf unused) {
                zzbksVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(final zzcas zzcasVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsy
            @Override // java.lang.Runnable
            public final void run() {
                zzcas zzcasVar2 = zzcasVar;
                String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
                if (!TextUtils.isEmpty(zzc)) {
                    zzcasVar2.zzc(zzc);
                } else {
                    zzcasVar2.zzd(new Exception());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Object obj, zzcas zzcasVar, String str, long j10, zzfhg zzfhgVar) {
        synchronized (obj) {
            if (!zzcasVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j10));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfhu zzfhuVar = this.zzp;
                zzfhgVar.zzc("Timeout");
                zzfhgVar.zzf(false);
                zzfhuVar.zzb(zzfhgVar.zzl());
                zzcasVar.zzc(Boolean.FALSE);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbdp.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbK)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdtj.this.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    com.google.common.util.concurrent.a zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtc
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdtj.this.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbM)).longValue(), TimeUnit.SECONDS);
                    zzfye.zzr(zzu, new zzdth(this), this.zzi);
                    return;
                }
            }
        }
        if (!this.zza) {
            zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzc(Boolean.FALSE);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(final zzbkv zzbkvVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtd
            @Override // java.lang.Runnable
            public final void run() {
                zzdtj zzdtjVar = zzdtj.this;
                try {
                    zzbkvVar.zzb(zzdtjVar.zzg());
                } catch (RemoteException e10) {
                    zzcaa.zzh("", e10);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
