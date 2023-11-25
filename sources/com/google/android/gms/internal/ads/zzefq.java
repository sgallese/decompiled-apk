package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzefq implements zzedn {
    private final Context zza;
    private final zzdom zzb;
    private final zzdfq zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final zzcag zzf;
    private final zzbit zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziy)).booleanValue();
    private final zzecs zzi;

    public zzefq(Context context, zzcag zzcagVar, zzfca zzfcaVar, Executor executor, zzdfq zzdfqVar, zzdom zzdomVar, zzbit zzbitVar, zzecs zzecsVar) {
        this.zza = context;
        this.zzd = zzfcaVar;
        this.zzc = zzdfqVar;
        this.zze = executor;
        this.zzf = zzcagVar;
        this.zzb = zzdomVar;
        this.zzg = zzbitVar;
        this.zzi = zzecsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final com.google.common.util.concurrent.a zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        final zzdoq zzdoqVar = new zzdoq();
        com.google.common.util.concurrent.a zzn = zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzefq.this.zzc(zzfbeVar, zzfbrVar, zzdoqVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefm
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
        final zzdeq zze = this.zzc.zze(new zzcst(zzfbrVar, zzfbeVar, null), new zzdet(new zzefp(this.zza, this.zzf, zzcasVar, zzfbeVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza));
        zzcasVar.zzc(zze);
        zze.zzc().zzo(new zzcxc() { // from class: com.google.android.gms.internal.ads.zzefn
            @Override // com.google.android.gms.internal.ads.zzcxc
            public final void zzq() {
                zzcfi zzcfiVar = zzcfi.this;
                if (zzcfiVar.zzN() != null) {
                    zzcfiVar.zzN().zzq();
                }
            }
        }, zzcan.zzf);
        zzdol zzk = zze.zzk();
        if (this.zzh) {
            zzbitVar = this.zzg;
        } else {
            zzbitVar = null;
        }
        zzk.zzi(zza, true, zzbitVar);
        zze.zzk();
        zzfbk zzfbkVar = zzfbeVar.zzt;
        return zzfye.zzm(zzdol.zzj(zza, zzfbkVar.zzb, zzfbkVar.zza), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj2) {
                zzcfi zzcfiVar = zza;
                zzfbe zzfbeVar2 = zzfbeVar;
                zzdeq zzdeqVar = zze;
                if (zzfbeVar2.zzN) {
                    zzcfiVar.zzae();
                }
                zzcfiVar.zzY();
                zzcfiVar.onPause();
                return zzdeqVar.zzg();
            }
        }, this.zze);
    }
}
