package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdqq implements zzdba, com.google.android.gms.ads.internal.client.zza, zzcxc, zzcwm {
    private final Context zza;
    private final zzfcq zzb;
    private final zzdrh zzc;
    private final zzfbr zzd;
    private final zzfbe zze;
    private final zzech zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgJ)).booleanValue();

    public zzdqq(Context context, zzfcq zzfcqVar, zzdrh zzdrhVar, zzfbr zzfbrVar, zzfbe zzfbeVar, zzech zzechVar) {
        this.zza = context;
        this.zzb = zzfcqVar;
        this.zzc = zzdrhVar;
        this.zzd = zzfbrVar;
        this.zze = zzfbeVar;
        this.zzf = zzechVar;
    }

    private final zzdrg zzd(String str) {
        String str2;
        zzdrg zza = this.zzc.zza();
        zza.zze(this.zzd.zzb.zzb);
        zza.zzd(this.zze);
        zza.zzb("action", str);
        boolean z10 = false;
        if (!this.zze.zzu.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzaj) {
            if (true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            zza.zzb("device_connectivity", str2);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgS)).booleanValue()) {
            if (com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(this.zzd.zza.zza) != 1) {
                z10 = true;
            }
            zza.zzb("scar", String.valueOf(z10));
            if (z10) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zza.zzc("ragent", zzlVar.zzp);
                zza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzlVar)));
            }
        }
        return zza;
    }

    private final void zze(zzdrg zzdrgVar) {
        if (this.zze.zzaj) {
            this.zzf.zzd(new zzecj(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdrgVar.zzf(), 2));
            return;
        }
        zzdrgVar.zzg();
    }

    private final boolean zzf() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
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
                    this.zzg = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!this.zze.zzaj) {
            return;
        }
        zze(zzd("click"));
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (!this.zzh) {
            return;
        }
        zzdrg zzd = zzd("ifts");
        zzd.zzb("reason", "adapter");
        int i10 = zzeVar.zza;
        String str = zzeVar.zzb;
        if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
            i10 = zzeVar3.zza;
            str = zzeVar3.zzb;
        }
        if (i10 >= 0) {
            zzd.zzb("arec", String.valueOf(i10));
        }
        String zza = this.zzb.zza(str);
        if (zza != null) {
            zzd.zzb("areec", zza);
        }
        zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        if (!this.zzh) {
            return;
        }
        zzdrg zzd = zzd("ifts");
        zzd.zzb("reason", "blocked");
        zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc(zzdfx zzdfxVar) {
        if (!this.zzh) {
            return;
        }
        zzdrg zzd = zzd("ifts");
        zzd.zzb("reason", "exception");
        if (!TextUtils.isEmpty(zzdfxVar.getMessage())) {
            zzd.zzb("msg", zzdfxVar.getMessage());
        }
        zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzi() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_shown").zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzj() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_impression").zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if (!zzf() && !this.zze.zzaj) {
            return;
        }
        zze(zzd("impression"));
    }
}
