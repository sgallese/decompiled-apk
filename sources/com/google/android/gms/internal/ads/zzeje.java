package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeje implements zzedn {
    private final zzbcp zza;
    private final zzfyo zzb;
    private final zzfge zzc;
    private final zzejn zzd;

    public zzeje(zzfge zzfgeVar, zzfyo zzfyoVar, zzbcp zzbcpVar, zzejn zzejnVar) {
        this.zzc = zzfgeVar;
        this.zzb = zzfyoVar;
        this.zza = zzbcpVar;
        this.zzd = zzejnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final com.google.common.util.concurrent.a zza(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzcas zzcasVar = new zzcas();
        zzejj zzejjVar = new zzejj();
        zzejjVar.zzd(new zzejd(this, zzcasVar, zzfbrVar, zzfbeVar, zzejjVar));
        zzfbk zzfbkVar = zzfbeVar.zzt;
        final zzbck zzbckVar = new zzbck(zzejjVar, zzfbkVar.zzb, zzfbkVar.zza);
        zzfge zzfgeVar = this.zzc;
        return zzffo.zzd(new zzffi() { // from class: com.google.android.gms.internal.ads.zzejc
            @Override // com.google.android.gms.internal.ads.zzffi
            public final void zza() {
                zzeje.this.zzc(zzbckVar);
            }
        }, this.zzb, zzffy.CUSTOM_RENDER_SYN, zzfgeVar).zzb(zzffy.CUSTOM_RENDER_ACK).zzd(zzcasVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzfbk zzfbkVar;
        if (this.zza != null && (zzfbkVar = zzfbeVar.zzt) != null && zzfbkVar.zza != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbck zzbckVar) throws Exception {
        this.zza.zze(zzbckVar);
    }
}
