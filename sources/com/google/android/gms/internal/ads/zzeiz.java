package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeiz implements zzedn {
    private final Context zza;
    private final zzcqz zzb;
    private final zzbcp zzc;
    private final zzfyo zzd;
    private final zzfge zze;

    public zzeiz(Context context, zzcqz zzcqzVar, zzfge zzfgeVar, zzfyo zzfyoVar, zzbcp zzbcpVar) {
        this.zza = context;
        this.zzb = zzcqzVar;
        this.zze = zzfgeVar;
        this.zzd = zzfyoVar;
        this.zzc = zzbcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final com.google.common.util.concurrent.a zza(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzcqd zza = this.zzb.zza(new zzcst(zzfbrVar, zzfbeVar, null), new zzeix(this, new View(this.zza), null, new zzcsc() { // from class: com.google.android.gms.internal.ads.zzeiv
            @Override // com.google.android.gms.internal.ads.zzcsc
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return null;
            }
        }, (zzfbf) zzfbeVar.zzv.get(0)));
        zzeiy zzk = zza.zzk();
        zzfbk zzfbkVar = zzfbeVar.zzt;
        final zzbck zzbckVar = new zzbck(zzk, zzfbkVar.zzb, zzfbkVar.zza);
        zzfge zzfgeVar = this.zze;
        return zzffo.zzd(new zzffi() { // from class: com.google.android.gms.internal.ads.zzeiw
            @Override // com.google.android.gms.internal.ads.zzffi
            public final void zza() {
                zzeiz.this.zzc(zzbckVar);
            }
        }, this.zzd, zzffy.CUSTOM_RENDER_SYN, zzfgeVar).zzb(zzffy.CUSTOM_RENDER_ACK).zzd(zzfye.zzh(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzfbk zzfbkVar;
        if (this.zzc != null && (zzfbkVar = zzfbeVar.zzt) != null && zzfbkVar.zza != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbck zzbckVar) throws Exception {
        this.zzc.zze(zzbckVar);
    }
}
