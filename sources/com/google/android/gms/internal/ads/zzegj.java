package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzegj implements zzedt {
    private final Context zza;
    private final zzdgm zzb;
    private final Executor zzc;

    public zzegj(Context context, zzdgm zzdgmVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdgmVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfbr zzfbrVar, int i10) {
        return zzfbrVar.zza.zza.zzg.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf, zzehf {
        zzdic zzah;
        zzboq zzD = ((zzfcw) zzedqVar.zzb).zzD();
        zzbor zzE = ((zzfcw) zzedqVar.zzb).zzE();
        zzbou zzd = ((zzfcw) zzedqVar.zzb).zzd();
        if (zzd != null && zzc(zzfbrVar, 6)) {
            zzah = zzdic.zzt(zzd);
        } else if (zzD != null && zzc(zzfbrVar, 6)) {
            zzah = zzdic.zzai(zzD);
        } else if (zzD != null && zzc(zzfbrVar, 2)) {
            zzah = zzdic.zzag(zzD);
        } else if (zzE != null && zzc(zzfbrVar, 6)) {
            zzah = zzdic.zzaj(zzE);
        } else if (zzE != null && zzc(zzfbrVar, 1)) {
            zzah = zzdic.zzah(zzE);
        } else {
            throw new zzehf(1, "No native ad mappers");
        }
        if (zzfbrVar.zza.zza.zzg.contains(Integer.toString(zzah.zzc()))) {
            zzdie zze = this.zzb.zze(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdio(zzah), new zzdkf(zzE, zzD, zzd));
            ((zzefj) zzedqVar.zzc).zzc(zze.zzj());
            zze.zzd().zzo(new zzcns((zzfcw) zzedqVar.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzehf(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        zzfcw zzfcwVar = (zzfcw) zzedqVar.zzb;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfbrVar.zza.zza.zzd;
        String jSONObject = zzfbeVar.zzw.toString();
        String zzl = com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbeVar.zzt);
        zzbol zzbolVar = (zzbol) zzedqVar.zzc;
        zzfca zzfcaVar = zzfbrVar.zza.zza;
        zzfcwVar.zzp(context, zzlVar, jSONObject, zzl, zzbolVar, zzfcaVar.zzi, zzfcaVar.zzg);
    }
}
