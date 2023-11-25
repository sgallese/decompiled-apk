package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzehd {
    private final zzfcq zza;
    private final zzdoz zzb;
    private final zzdrh zzc;
    private final zzfgo zzd;

    public zzehd(zzfcq zzfcqVar, zzdoz zzdozVar, zzdrh zzdrhVar, zzfgo zzfgoVar) {
        this.zza = zzfcqVar;
        this.zzb = zzdozVar;
        this.zzc = zzdrhVar;
        this.zzd = zzfgoVar;
    }

    public final void zza(zzfbi zzfbiVar, zzfbe zzfbeVar, int i10, zzedr zzedrVar, long j10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzfgn zzb = zzfgn.zzb("adapter_status");
            zzb.zzg(zzfbiVar);
            zzb.zzf(zzfbeVar);
            zzb.zza("adapter_l", String.valueOf(j10));
            zzb.zza("sc", Integer.toString(i10));
            if (zzedrVar != null) {
                zzb.zza("arec", Integer.toString(zzedrVar.zzb().zza));
                String zza = this.zza.zza(zzedrVar.getMessage());
                if (zza != null) {
                    zzb.zza("areec", zza);
                }
            }
            zzdoy zzb2 = this.zzb.zzb(zzfbeVar.zzu);
            if (zzb2 != null) {
                zzb.zza("ancn", zzb2.zza);
                zzbqq zzbqqVar = zzb2.zzb;
                if (zzbqqVar != null) {
                    zzb.zza("adapter_v", zzbqqVar.toString());
                }
                zzbqq zzbqqVar2 = zzb2.zzc;
                if (zzbqqVar2 != null) {
                    zzb.zza("adapter_sv", zzbqqVar2.toString());
                }
            }
            this.zzd.zzb(zzb);
            return;
        }
        zzdrg zza2 = this.zzc.zza();
        zza2.zze(zzfbiVar);
        zza2.zzd(zzfbeVar);
        zza2.zzb("action", "adapter_status");
        zza2.zzb("adapter_l", String.valueOf(j10));
        zza2.zzb("sc", Integer.toString(i10));
        if (zzedrVar != null) {
            zza2.zzb("arec", Integer.toString(zzedrVar.zzb().zza));
            String zza3 = this.zza.zza(zzedrVar.getMessage());
            if (zza3 != null) {
                zza2.zzb("areec", zza3);
            }
        }
        zzdoy zzb3 = this.zzb.zzb(zzfbeVar.zzu);
        if (zzb3 != null) {
            zza2.zzb("ancn", zzb3.zza);
            zzbqq zzbqqVar3 = zzb3.zzb;
            if (zzbqqVar3 != null) {
                zza2.zzb("adapter_v", zzbqqVar3.toString());
            }
            zzbqq zzbqqVar4 = zzb3.zzc;
            if (zzbqqVar4 != null) {
                zza2.zzb("adapter_sv", zzbqqVar4.toString());
            }
        }
        zza2.zzg();
    }
}
