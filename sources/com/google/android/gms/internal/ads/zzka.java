package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzka implements zzku {
    private final Object zza;
    private final zztu zzb;
    private zzcw zzc;

    public zzka(Object obj, zztn zztnVar) {
        this.zza = obj;
        this.zzb = zztnVar;
        this.zzc = zztnVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final zzcw zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzcw zzcwVar) {
        this.zzc = zzcwVar;
    }
}
