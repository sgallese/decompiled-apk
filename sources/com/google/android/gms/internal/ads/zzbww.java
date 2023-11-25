package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbww implements zzbxb {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzgvu zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbwy zzi;
    private final zzbwx zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbww(Context context, zzcag zzcagVar, zzbwy zzbwyVar, String str, zzbwx zzbwxVar) {
        Preconditions.checkNotNull(zzbwyVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzbwxVar;
        this.zzi = zzbwyVar;
        Iterator it = zzbwyVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgvu zza = zzgxp.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzgvv zza2 = zzgvw.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zza2.zza(str2);
        }
        zza.zzg((zzgvw) zza2.zzal());
        zzgxj zza3 = zzgxk.zza();
        zza3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = zzcagVar.zza;
        if (str3 != null) {
            zza3.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza3.zzb(apkVersion);
        }
        zza.zzf((zzgxk) zza3.zzal());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final zzbwy zza() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzb(Map map) throws Exception {
        zzgxh zzgxhVar;
        com.google.common.util.concurrent.a zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgxhVar = (zzgxh) this.zze.get(str);
                            }
                            if (zzgxhVar == null) {
                                zzbxa.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                boolean z10 = false;
                                for (int i10 = 0; i10 < length; i10++) {
                                    zzgxhVar.zza(optJSONArray.getJSONObject(i10).getString("threat_type"));
                                }
                                boolean z11 = this.zza;
                                if (length > 0) {
                                    z10 = true;
                                }
                                this.zza = z10 | z11;
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (((Boolean) zzbdr.zzb.zze()).booleanValue()) {
                    zzcaa.zzf("Failed to get SafeBrowsing metadata", e10);
                }
                return zzfye.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z12 = this.zza;
        if ((z12 && this.zzi.zzg) || ((this.zzm && this.zzi.zzf) || (!z12 && this.zzi.zzd))) {
            synchronized (this.zzj) {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzc((zzgxi) ((zzgxh) it.next()).zzal());
                }
                this.zzd.zza(this.zzf);
                this.zzd.zzb(this.zzg);
                if (zzbxa.zzb()) {
                    StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                    for (zzgxi zzgxiVar : this.zzd.zzm()) {
                        sb2.append("    [");
                        sb2.append(zzgxiVar.zza());
                        sb2.append("] ");
                        sb2.append(zzgxiVar.zze());
                    }
                    zzbxa.zza(sb2.toString());
                }
                com.google.common.util.concurrent.a zzb2 = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzgxp) this.zzd.zzal()).zzax());
                if (zzbxa.zzb()) {
                    zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwr
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbxa.zza("Pinged SB successfully.");
                        }
                    }, zzcan.zza);
                }
                zzm = zzfye.zzm(zzb2, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzbws
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj) {
                        String str2 = (String) obj;
                        int i11 = zzbww.zzb;
                        return null;
                    }
                }, zzcan.zzf);
            }
            return zzm;
        }
        return zzfye.zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzd(String str, Map map, int i10) {
        String str2;
        String str3;
        synchronized (this.zzj) {
            if (i10 == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i10 == 3) {
                    ((zzgxh) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzgxh zzc2 = zzgxi.zzc();
            int zza = zzgxg.zza(i10);
            if (zza != 0) {
                zzc2.zze(zza);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzgwh zza2 = zzgwk.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        str2 = (String) entry.getKey();
                    } else {
                        str2 = "";
                    }
                    if (entry.getValue() != null) {
                        str3 = (String) entry.getValue();
                    } else {
                        str3 = "";
                    }
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzgwf zza3 = zzgwg.zza();
                        zza3.zza(zzgqi.zzw(str2));
                        zza3.zzb(zzgqi.zzw(str3));
                        zza2.zza((zzgwg) zza3.zzal());
                    }
                }
            }
            zzc2.zzc((zzgwk) zza2.zzal());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            com.google.common.util.concurrent.a zzh = zzfye.zzh(Collections.emptyMap());
            zzfxl zzfxlVar = new zzfxl() { // from class: com.google.android.gms.internal.ads.zzbwt
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    return zzbww.this.zzb((Map) obj);
                }
            };
            zzfyo zzfyoVar = zzcan.zzf;
            com.google.common.util.concurrent.a zzn = zzfye.zzn(zzh, zzfxlVar, zzfyoVar);
            com.google.common.util.concurrent.a zzo = zzfye.zzo(zzn, 10L, TimeUnit.SECONDS, zzcan.zzd);
            zzfye.zzr(zzn, new zzbwv(this, zzo), zzfyoVar);
            zzc.add(zzo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgqf zzt = zzgqi.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzgvu zzgvuVar = this.zzd;
            zzgxa zza = zzgxc.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzgvuVar.zzi((zzgxc) zza.zzal());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbxb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbwy r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.zzl
            if (r0 == 0) goto Lc
            return
        Lc:
            com.google.android.gms.ads.internal.zzt.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.zzcaa.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.zzcaa.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.zzcaa.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbxa.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbwu r8 = new com.google.android.gms.internal.ads.zzbwu
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L8e
            r8.run()
            return
        L8e:
            com.google.android.gms.internal.ads.zzfyo r0 = com.google.android.gms.internal.ads.zzcan.zza
            r0.execute(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbww.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final boolean zzi() {
        if (PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl) {
            return true;
        }
        return false;
    }
}
