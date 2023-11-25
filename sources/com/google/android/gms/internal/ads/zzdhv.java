package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdhv implements zzfya {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdhx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdhv(zzdhx zzdhxVar, String str, boolean z10) {
        this.zzb = zzdhxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "omid native display exp");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdic zzdicVar;
        zzdic zzdicVar2;
        zzdicVar = this.zzb.zze;
        zzdicVar.zzT((zzcfi) obj);
        zzdhx zzdhxVar = this.zzb;
        zzdicVar2 = zzdhxVar.zze;
        zzcas zzp = zzdicVar2.zzp();
        zzfip zzf = zzdhxVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
