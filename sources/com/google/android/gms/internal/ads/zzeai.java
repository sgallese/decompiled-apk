package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeai implements zzdba, com.google.android.gms.ads.internal.client.zza, zzcxc, zzcwm {
    private final Context zza;
    private final zzfcq zzb;
    private final zzfbr zzc;
    private final zzfbe zzd;
    private final zzech zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgJ)).booleanValue();
    private final zzfgo zzh;
    private final String zzi;

    public zzeai(Context context, zzfcq zzfcqVar, zzfbr zzfbrVar, zzfbe zzfbeVar, zzech zzechVar, zzfgo zzfgoVar, String str) {
        this.zza = context;
        this.zzb = zzfcqVar;
        this.zzc = zzfbrVar;
        this.zzd = zzfbeVar;
        this.zze = zzechVar;
        this.zzh = zzfgoVar;
        this.zzi = str;
    }

    private final zzfgn zzd(String str) {
        String str2;
        zzfgn zzb = zzfgn.zzb(str);
        zzb.zzh(this.zzc, null);
        zzb.zzf(this.zzd);
        zzb.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzaj) {
            if (true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            zzb.zza("device_connectivity", str2);
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzb.zza("offline_ad", "1");
        }
        return zzb;
    }

    private final void zze(zzfgn zzfgnVar) {
        if (this.zzd.zzaj) {
            this.zze.zzd(new zzecj(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfgnVar), 2));
            return;
        }
        this.zzh.zzb(zzfgnVar);
    }

    private final boolean zzf() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbq);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String zzn = com.google.android.gms.ads.internal.util.zzs.zzn(this.zza);
                    boolean z10 = false;
                    if (str != null && zzn != null) {
                        try {
                            z10 = Pattern.matches(str, zzn);
                        } catch (RuntimeException e10) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!this.zzd.zzaj) {
            return;
        }
        zze(zzd("click"));
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (!this.zzg) {
            return;
        }
        int i10 = zzeVar.zza;
        String str = zzeVar.zzb;
        if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
            i10 = zzeVar3.zza;
            str = zzeVar3.zzb;
        }
        String zza = this.zzb.zza(str);
        zzfgn zzd = zzd("ifts");
        zzd.zza("reason", "adapter");
        if (i10 >= 0) {
            zzd.zza("arec", String.valueOf(i10));
        }
        if (zza != null) {
            zzd.zza("areec", zza);
        }
        this.zzh.zzb(zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        if (!this.zzg) {
            return;
        }
        zzfgo zzfgoVar = this.zzh;
        zzfgn zzd = zzd("ifts");
        zzd.zza("reason", "blocked");
        zzfgoVar.zzb(zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc(zzdfx zzdfxVar) {
        if (!this.zzg) {
            return;
        }
        zzfgn zzd = zzd("ifts");
        zzd.zza("reason", "exception");
        if (!TextUtils.isEmpty(zzdfxVar.getMessage())) {
            zzd.zza("msg", zzdfxVar.getMessage());
        }
        this.zzh.zzb(zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzi() {
        if (!zzf()) {
            return;
        }
        this.zzh.zzb(zzd("adapter_shown"));
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzj() {
        if (!zzf()) {
            return;
        }
        this.zzh.zzb(zzd("adapter_impression"));
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if (!zzf() && !this.zzd.zzaj) {
            return;
        }
        zze(zzd("impression"));
    }
}
