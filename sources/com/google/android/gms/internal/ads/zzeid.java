package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeid implements zzedn {
    private final Context zza;
    private final zzdom zzb;
    private final zzdnv zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final zzcag zzf;
    private final zzbit zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziy)).booleanValue();
    private final zzecs zzi;

    public zzeid(Context context, zzcag zzcagVar, zzfca zzfcaVar, Executor executor, zzdnv zzdnvVar, zzdom zzdomVar, zzbit zzbitVar, zzecs zzecsVar) {
        this.zza = context;
        this.zzd = zzfcaVar;
        this.zzc = zzdnvVar;
        this.zze = executor;
        this.zzf = zzcagVar;
        this.zzb = zzdomVar;
        this.zzg = zzbitVar;
        this.zzi = zzecsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final com.google.common.util.concurrent.a zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        final zzdoq zzdoqVar = new zzdoq();
        com.google.common.util.concurrent.a zzn = zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzehw
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzeid.this.zzc(zzfbeVar, zzfbrVar, zzdoqVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehx
            @Override // java.lang.Runnable
            public final void run() {
                zzdoq.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzfbk zzfbkVar = zzfbeVar.zzt;
        if (zzfbkVar != null && zzfbkVar.zza != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(final zzfbe zzfbeVar, zzfbr zzfbrVar, zzdoq zzdoqVar, Object obj) throws Exception {
        zzbit zzbitVar;
        final zzcfi zza = this.zzb.zza(this.zzd.zze, zzfbeVar, zzfbrVar.zzb.zzb);
        zza.zzZ(zzfbeVar.zzX);
        zzdoqVar.zza(this.zza, (View) zza);
        zzcas zzcasVar = new zzcas();
        final zzdnr zze = this.zzc.zze(new zzcst(zzfbrVar, zzfbeVar, null), new zzdns(new zzeic(this.zza, this.zzb, this.zzd, this.zzf, zzfbeVar, zzcasVar, zza, this.zzg, this.zzh, this.zzi), zza));
        zzcasVar.zzc(zze);
        zzbji.zzb(zza, zze.zzg());
        zze.zzc().zzo(new zzcxc() { // from class: com.google.android.gms.internal.ads.zzehy
            @Override // com.google.android.gms.internal.ads.zzcxc
            public final void zzq() {
                zzcfi zzcfiVar = zzcfi.this;
                if (zzcfiVar.zzN() != null) {
                    zzcfiVar.zzN().zzq();
                }
            }
        }, zzcan.zzf);
        zzdol zzl = zze.zzl();
        if (this.zzh) {
            zzbitVar = this.zzg;
        } else {
            zzbitVar = null;
        }
        zzl.zzi(zza, true, zzbitVar);
        zze.zzl();
        zzfbk zzfbkVar = zzfbeVar.zzt;
        return zzfye.zzm(zzdol.zzj(zza, zzfbkVar.zzb, zzfbkVar.zza), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzehz
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj2) {
                zzcfi zzcfiVar = zza;
                zzfbe zzfbeVar2 = zzfbeVar;
                zzdnr zzdnrVar = zze;
                if (zzfbeVar2.zzN) {
                    zzcfiVar.zzae();
                }
                zzcfiVar.zzY();
                zzcfiVar.onPause();
                return zzdnrVar.zzk();
            }
        }, this.zze);
    }
}
