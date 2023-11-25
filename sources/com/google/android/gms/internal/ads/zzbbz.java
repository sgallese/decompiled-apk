package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzbbz {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbbz zzbbzVar) {
        while (true) {
            try {
                zzbcj zzbcjVar = (zzbcj) zzbbzVar.zza.take();
                zzbci zza = zzbcjVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbbzVar.zzg(zzbbzVar.zzb(zzbbzVar.zzb, zzbcjVar.zzb()), zza);
                }
            } catch (InterruptedException e10) {
                zzcaa.zzk("CsiReporter:reporter interrupted", e10);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbci zzbciVar) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbciVar != null) {
            StringBuilder sb2 = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbciVar.zzb())) {
                sb2.append("&it=");
                sb2.append(zzbciVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbciVar.zza())) {
                sb2.append("&blat=");
                sb2.append(zzbciVar.zza());
            }
            uri = sb2.toString();
        }
        if (this.zzh.get()) {
            File file = this.zzi;
            if (file != null) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file, true);
                    } catch (IOException e10) {
                        e = e10;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    fileOutputStream.write(uri.getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                        return;
                    } catch (IOException e11) {
                        zzcaa.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                        return;
                    }
                } catch (IOException e12) {
                    e = e12;
                    fileOutputStream2 = fileOutputStream;
                    zzcaa.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            return;
                        } catch (IOException e13) {
                            zzcaa.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e14) {
                            zzcaa.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e14);
                        }
                    }
                    throw th;
                }
            }
            zzcaa.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzs.zzI(this.zze, this.zzf, uri);
    }

    public final zzbcf zza(String str) {
        zzbcf zzbcfVar = (zzbcf) this.zzc.get(str);
        if (zzbcfVar != null) {
            return zzbcfVar;
        }
        return zzbcf.zza;
    }

    final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zza(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbdf.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbby
            @Override // java.lang.Runnable
            public final void run() {
                zzbbz.zzc(zzbbz.this);
            }
        });
        Map map2 = this.zzc;
        zzbcf zzbcfVar = zzbcf.zzb;
        map2.put("action", zzbcfVar);
        this.zzc.put("ad_format", zzbcfVar);
        this.zzc.put("e", zzbcf.zzc);
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbcj zzbcjVar) {
        return this.zza.offer(zzbcjVar);
    }
}
