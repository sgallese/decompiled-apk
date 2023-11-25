package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeeo implements zzedn {
    private final zzcqz zza;
    private final Context zzb;
    private final zzdom zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final zzfqw zzf;

    public zzeeo(zzcqz zzcqzVar, Context context, Executor executor, zzdom zzdomVar, zzfca zzfcaVar, zzfqw zzfqwVar) {
        this.zzb = context;
        this.zza = zzcqzVar;
        this.zze = executor;
        this.zzc = zzdomVar;
        this.zzd = zzfcaVar;
        this.zzf = zzfqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final com.google.common.util.concurrent.a zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        return zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzeeo.this.zzc(zzfbrVar, zzfbeVar, obj);
            }
        }, this.zze);
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
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(zzfbr zzfbrVar, zzfbe zzfbeVar, Object obj) throws Exception {
        View zzdopVar;
        com.google.android.gms.ads.internal.client.zzq zza = zzfce.zza(this.zzb, zzfbeVar.zzv);
        final zzcfi zza2 = this.zzc.zza(zza, zzfbeVar, zzfbrVar.zzb.zzb);
        zza2.zzZ(zzfbeVar.zzX);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) {
            zzdopVar = zzcrq.zza(this.zzb, (View) zza2, zzfbeVar);
        } else {
            zzdopVar = new zzdop(this.zzb, (View) zza2, (com.google.android.gms.ads.internal.util.zzas) this.zzf.apply(zzfbeVar));
        }
        final zzcqd zza3 = this.zza.zza(new zzcst(zzfbrVar, zzfbeVar, null), new zzcqj(zzdopVar, zza2, new zzcsc() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // com.google.android.gms.internal.ads.zzcsc
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzcfi.this.zzq();
            }
        }, zzfce.zzb(zza)));
        zza3.zzh().zzi(zza2, false, null);
        zzcxa zzc = zza3.zzc();
        zzcxc zzcxcVar = new zzcxc() { // from class: com.google.android.gms.internal.ads.zzeek
            @Override // com.google.android.gms.internal.ads.zzcxc
            public final void zzq() {
                zzcfi zzcfiVar = zzcfi.this;
                if (zzcfiVar.zzN() != null) {
                    zzcfiVar.zzN().zzq();
                }
            }
        };
        zzfyo zzfyoVar = zzcan.zzf;
        zzc.zzo(zzcxcVar, zzfyoVar);
        zza3.zzh();
        zzfbk zzfbkVar = zzfbeVar.zzt;
        com.google.common.util.concurrent.a zzj = zzdol.zzj(zza2, zzfbkVar.zzb, zzfbkVar.zza);
        if (zzfbeVar.zzN) {
            zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeel
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfi.this.zzae();
                }
            }, this.zze);
        }
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeem
            @Override // java.lang.Runnable
            public final void run() {
                zzeeo.this.zzd(zza2);
            }
        }, this.zze);
        return zzfye.zzm(zzj, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeen
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj2) {
                return zzcqd.this.zza();
            }
        }, zzfyoVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcfi zzcfiVar) {
        zzcfiVar.zzY();
        zzcge zzq = zzcfiVar.zzq();
        com.google.android.gms.ads.internal.client.zzfl zzflVar = this.zzd.zza;
        if (zzflVar != null && zzq != null) {
            zzq.zzs(zzflVar);
        }
    }
}
