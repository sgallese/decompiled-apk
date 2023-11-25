package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfol extends zzfws {
    Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfol(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final String zza() {
        Object obj = this.zza;
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    protected final void zzb() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final boolean zzc(Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final boolean zzd(Throwable th) {
        return super.zzd(th);
    }
}
