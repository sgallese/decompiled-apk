package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzedy implements zzedn {
    private final zzcpq zza;
    private final Context zzb;
    private final zzdom zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final zzcag zzf;
    private final zzbit zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziy)).booleanValue();
    private final zzecs zzi;

    public zzedy(zzcpq zzcpqVar, Context context, Executor executor, zzdom zzdomVar, zzfca zzfcaVar, zzcag zzcagVar, zzbit zzbitVar, zzecs zzecsVar) {
        this.zzb = context;
        this.zza = zzcpqVar;
        this.zze = executor;
        this.zzc = zzdomVar;
        this.zzd = zzfcaVar;
        this.zzf = zzcagVar;
        this.zzg = zzbitVar;
        this.zzi = zzecsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final com.google.common.util.concurrent.a zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        final zzdoq zzdoqVar = new zzdoq();
        com.google.common.util.concurrent.a zzn = zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzedy.this.zzc(zzfbeVar, zzfbrVar, zzdoqVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedx
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
        final zzcfi zza = this.zzc.zza(this.zzd.zze, zzfbeVar, zzfbrVar.zzb.zzb);
        zza.zzZ(zzfbeVar.zzX);
        zzdoqVar.zza(this.zzb, (View) zza);
        zzcas zzcasVar = new zzcas();
        final zzcpn zza2 = this.zza.zza(new zzcst(zzfbrVar, zzfbeVar, null), new zzdet(new zzeea(this.zzf, zzcasVar, zzfbeVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza), new zzcpo(zzfbeVar.zzab));
        zzdol zzh = zza2.zzh();
        if (this.zzh) {
            zzbitVar = this.zzg;
        } else {
            zzbitVar = null;
        }
        zzh.zzi(zza, false, zzbitVar);
        zzcasVar.zzc(zza2);
        zza2.zzc().zzo(new zzcxc() { // from class: com.google.android.gms.internal.ads.zzedu
            @Override // com.google.android.gms.internal.ads.zzcxc
            public final void zzq() {
                zzcfi zzcfiVar = zzcfi.this;
                if (zzcfiVar.zzN() != null) {
                    zzcfiVar.zzN().zzq();
                }
            }
        }, zzcan.zzf);
        zza2.zzh();
        zzfbk zzfbkVar = zzfbeVar.zzt;
        return zzfye.zzm(zzdol.zzj(zza, zzfbkVar.zzb, zzfbkVar.zza), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzedv
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj2) {
                zzcfi zzcfiVar = zza;
                zzfbe zzfbeVar2 = zzfbeVar;
                zzcpn zzcpnVar = zza2;
                if (zzfbeVar2.zzN) {
                    zzcfiVar.zzae();
                }
                zzcfiVar.zzY();
                zzcfiVar.onPause();
                return zzcpnVar.zza();
            }
        }, this.zze);
    }
}
