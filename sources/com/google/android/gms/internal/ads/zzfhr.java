package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfhr implements Runnable {
    private final zzfhu zzb;
    private String zzc;
    private String zzd;
    private zzfbq zze;
    private com.google.android.gms.ads.internal.client.zze zzf;
    private Future zzg;
    private final List zza = new ArrayList();
    private int zzh = 2;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhr(zzfhu zzfhuVar) {
        this.zzb = zzfhuVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfhr zza(zzfhg zzfhgVar) {
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfhgVar.zzi();
            list.add(zzfhgVar);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcan.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzis)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfhr zzb(String str) {
        if (((Boolean) zzbdd.zzc.zze()).booleanValue() && zzfhq.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfhr zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            this.zzf = zzeVar;
        }
        return this;
    }

    public final synchronized zzfhr zzd(ArrayList arrayList) {
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.zzh = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.zzh = 6;
                            }
                        }
                        this.zzh = 5;
                    }
                    this.zzh = 8;
                }
                this.zzh = 4;
            }
            this.zzh = 3;
        }
        return this;
    }

    public final synchronized zzfhr zze(String str) {
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfhr zzf(zzfbq zzfbqVar) {
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            this.zze = zzfbqVar;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (!((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            return;
        }
        Future future = this.zzg;
        if (future != null) {
            future.cancel(false);
        }
        for (zzfhg zzfhgVar : this.zza) {
            int i10 = this.zzh;
            if (i10 != 2) {
                zzfhgVar.zzm(i10);
            }
            if (!TextUtils.isEmpty(this.zzc)) {
                zzfhgVar.zze(this.zzc);
            }
            if (!TextUtils.isEmpty(this.zzd) && !zzfhgVar.zzk()) {
                zzfhgVar.zzd(this.zzd);
            }
            zzfbq zzfbqVar = this.zze;
            if (zzfbqVar != null) {
                zzfhgVar.zzb(zzfbqVar);
            } else {
                com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
                if (zzeVar != null) {
                    zzfhgVar.zza(zzeVar);
                }
            }
            this.zzb.zzb(zzfhgVar.zzl());
        }
        this.zza.clear();
    }

    public final synchronized zzfhr zzh(int i10) {
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            this.zzh = i10;
        }
        return this;
    }
}
