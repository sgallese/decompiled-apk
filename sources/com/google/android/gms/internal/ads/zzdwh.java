package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzdwh implements zzfya {
    final /* synthetic */ zzdwi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwh(zzdwi zzdwiVar) {
        this.zza = zzdwiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        Pattern pattern;
        zzebe zzebeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
            pattern = zzdwi.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzebeVar = this.zza.zzf;
                zzebeVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzebe zzebeVar;
        zzebe zzebeVar2;
        zzfbr zzfbrVar = (zzfbr) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
            zzebeVar = this.zza.zzf;
            zzebeVar.zzi(zzfbrVar.zzb.zzb.zze);
            zzebeVar2 = this.zza.zzf;
            zzebeVar2.zzj(zzfbrVar.zzb.zzb.zzf);
        }
    }
}
