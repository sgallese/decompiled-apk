package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcpl {
    private final zzfgo zza;
    private final zzdrh zzb;
    private final zzfbr zzc;

    public zzcpl(zzdrh zzdrhVar, zzfbr zzfbrVar, zzfgo zzfgoVar) {
        this.zza = zzfgoVar;
        this.zzb = zzdrhVar;
        this.zzc = zzfbrVar;
    }

    private static String zzb(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return "u";
                        }
                        return "ac";
                    }
                    return "cb";
                }
                return "cc";
            }
            return "bb";
        }
        return "h";
    }

    public final void zza(long j10, int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzfgo zzfgoVar = this.zza;
            zzfgn zzb = zzfgn.zzb("ad_closed");
            zzb.zzg(this.zzc.zzb.zzb);
            zzb.zza("show_time", String.valueOf(j10));
            zzb.zza("ad_format", "app_open_ad");
            zzb.zza("acr", zzb(i10));
            zzfgoVar.zzb(zzb);
            return;
        }
        zzdrg zza = this.zzb.zza();
        zza.zze(this.zzc.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j10));
        zza.zzb("ad_format", "app_open_ad");
        zza.zzb("acr", zzb(i10));
        zza.zzg();
    }
}
