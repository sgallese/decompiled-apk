package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzerq implements zzesj {
    private final String zza;
    private final zzfyo zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfca zze;
    private final zzchd zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzerq(zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfca zzfcaVar, zzchd zzchdVar) {
        this.zzb = zzfyoVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfcaVar;
        this.zzf = zzchdVar;
    }

    public static /* synthetic */ com.google.common.util.concurrent.a zzc(zzerq zzerqVar) {
        String str = zzerqVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgY)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzg zzo = zzerqVar.zzf.zzo();
        zzcvq zzcvqVar = new zzcvq();
        zzcvqVar.zze(zzerqVar.zzd);
        zzfby zzfbyVar = new zzfby();
        zzfbyVar.zzs("adUnitId");
        zzfbyVar.zzE(zzerqVar.zze.zzd);
        zzfbyVar.zzr(new com.google.android.gms.ads.internal.client.zzq());
        zzfbyVar.zzx(true);
        zzcvqVar.zzi(zzfbyVar.zzG());
        zzo.zza(zzcvqVar.zzj());
        com.google.android.gms.ads.nonagon.signalgeneration.zzac zzacVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzac();
        zzacVar.zza(str);
        zzo.zzb(zzacVar.zzb());
        new zzdbt();
        return zzfye.zze(zzfye.zzm((zzfxv) zzfye.zzo(zzfxv.zzu(zzo.zzc().zzc()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgZ)).longValue(), TimeUnit.MILLISECONDS, zzerqVar.zzc), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzero
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                zzerr zzerrVar;
                com.google.android.gms.ads.nonagon.signalgeneration.zzam zzamVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzam) obj;
                if (zzamVar != null) {
                    zzerrVar = new zzerr(zzamVar.zza);
                } else {
                    zzerrVar = new zzerr(null);
                }
                return zzerrVar;
            }
        }, zzerqVar.zzb), Exception.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzerp
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                zzcaa.zzh("", (Exception) obj);
                return new zzerr(null);
            }
        }, zzerqVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgX)).booleanValue() && !this.zze.zzq) {
            return zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzern
                @Override // com.google.android.gms.internal.ads.zzfxk
                public final com.google.common.util.concurrent.a zza() {
                    return zzerq.zzc(zzerq.this);
                }
            }, this.zzb);
        }
        return zzfye.zzh(new zzerr(null));
    }
}
