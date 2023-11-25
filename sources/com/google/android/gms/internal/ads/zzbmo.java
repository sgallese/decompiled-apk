package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbmo extends zzcaz {
    private final Object zza = new Object();
    private final zzbmt zzb;
    private boolean zzc;

    public zzbmo(zzbmt zzbmtVar) {
        this.zzb = zzbmtVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            zzi(new zzbml(this), new zzcav());
            zzi(new zzbmm(this), new zzbmn(this));
        }
    }
}
