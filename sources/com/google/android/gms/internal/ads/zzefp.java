package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzefp implements zzdfy {
    private final Context zza;
    private final zzcag zzb;
    private final com.google.common.util.concurrent.a zzc;
    private final zzfbe zzd;
    private final zzcfi zze;
    private final zzfca zzf;
    private final zzbit zzg;
    private final boolean zzh;
    private final zzecs zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefp(Context context, zzcag zzcagVar, com.google.common.util.concurrent.a aVar, zzfbe zzfbeVar, zzcfi zzcfiVar, zzfca zzfcaVar, boolean z10, zzbit zzbitVar, zzecs zzecsVar) {
        this.zza = context;
        this.zzb = zzcagVar;
        this.zzc = aVar;
        this.zzd = zzfbeVar;
        this.zze = zzcfiVar;
        this.zzf = zzfcaVar;
        this.zzg = zzbitVar;
        this.zzh = z10;
        this.zzi = zzecsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z10, Context context, zzcwv zzcwvVar) {
        boolean z11;
        boolean z12;
        float f10;
        zzecs zzecsVar;
        zzdeq zzdeqVar = (zzdeq) zzfye.zzq(this.zzc);
        this.zze.zzan(true);
        if (this.zzh) {
            z11 = this.zzg.zze(false);
        } else {
            z11 = false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzF = com.google.android.gms.ads.internal.util.zzs.zzF(this.zza);
        boolean z13 = this.zzh;
        if (z13) {
            z12 = this.zzg.zzd();
        } else {
            z12 = false;
        }
        if (z13) {
            f10 = this.zzg.zza();
        } else {
            f10 = 0.0f;
        }
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(z11, zzF, z12, f10, -1, z10, this.zzd.zzP, false);
        if (zzcwvVar != null) {
            zzcwvVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzdfn zzh = zzdeqVar.zzh();
        zzcfi zzcfiVar = this.zze;
        zzfbe zzfbeVar = this.zzd;
        int i10 = zzfbeVar.zzR;
        zzcag zzcagVar = this.zzb;
        String str = zzfbeVar.zzC;
        zzfbk zzfbkVar = zzfbeVar.zzt;
        String str2 = zzfbkVar.zzb;
        String str3 = zzfbkVar.zza;
        String str4 = this.zzf.zzf;
        if (zzfbeVar.zzaj) {
            zzecsVar = this.zzi;
        } else {
            zzecsVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcfiVar, i10, zzcagVar, str, zzjVar, str2, str3, str4, zzcwvVar, zzecsVar), true);
    }
}
