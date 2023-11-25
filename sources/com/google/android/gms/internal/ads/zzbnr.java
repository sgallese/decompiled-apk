package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbnr {
    private final zzbmu zza;
    private com.google.common.util.concurrent.a zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnr(zzbmu zzbmuVar) {
        this.zza = zzbmuVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcas zzcasVar = new zzcas();
            this.zzb = zzcasVar;
            this.zza.zzb(null).zzi(new zzcaw() { // from class: com.google.android.gms.internal.ads.zzbnp
                @Override // com.google.android.gms.internal.ads.zzcaw
                public final void zza(Object obj) {
                    zzcas.this.zzc((zzbmv) obj);
                }
            }, new zzcau() { // from class: com.google.android.gms.internal.ads.zzbnq
                @Override // com.google.android.gms.internal.ads.zzcau
                public final void zza() {
                    zzcas.this.zzd(new zzbmx("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbnu zza(String str, zzbnb zzbnbVar, zzbna zzbnaVar) {
        zzd();
        return new zzbnu(this.zzb, "google.afma.activeView.handleUpdate", zzbnbVar, zzbnaVar);
    }

    public final void zzb(final String str, final zzbir zzbirVar) {
        zzd();
        this.zzb = zzfye.zzn(this.zzb, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzbnn
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                zzbmv zzbmvVar = (zzbmv) obj;
                zzbmvVar.zzq(str, zzbirVar);
                return zzfye.zzh(zzbmvVar);
            }
        }, zzcan.zzf);
    }

    public final void zzc(final String str, final zzbir zzbirVar) {
        this.zzb = zzfye.zzm(this.zzb, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzbno
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                zzbmv zzbmvVar = (zzbmv) obj;
                zzbmvVar.zzr(str, zzbirVar);
                return zzbmvVar;
            }
        }, zzcan.zzf);
    }
}
