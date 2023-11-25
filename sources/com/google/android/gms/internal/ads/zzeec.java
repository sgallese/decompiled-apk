package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeec implements zzedt {
    private final Context zza;
    private final zzcpq zzb;
    private final Executor zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeec(Context context, zzcpq zzcpqVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcpqVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, final zzedq zzedqVar) throws zzfcf, zzehf {
        zzcpn zza = this.zzb.zza(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdet(new zzdfy() { // from class: com.google.android.gms.internal.ads.zzeeb
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(boolean z10, Context context, zzcwv zzcwvVar) {
                zzedq zzedqVar2 = zzedq.this;
                try {
                    ((zzfcw) zzedqVar2.zzb).zzv(z10);
                    ((zzfcw) zzedqVar2.zzb).zzw(context);
                } catch (zzfcf e10) {
                    throw new zzdfx(e10.getCause());
                }
            }
        }, null), new zzcpo(zzfbeVar.zzab));
        zza.zzd().zzo(new zzcns((zzfcw) zzedqVar.zzb), this.zzc);
        ((zzefj) zzedqVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        ((zzfcw) zzedqVar.zzb).zzl(this.zza, zzfbrVar.zza.zza.zzd, zzfbeVar.zzw.toString(), (zzbol) zzedqVar.zzc);
    }
}
