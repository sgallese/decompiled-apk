package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzok {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzok zza(boolean z10) {
        this.zza = true;
        return this;
    }

    public final zzok zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzok zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzom zzd() {
        if (!this.zza && (this.zzb || this.zzc)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new zzom(this, null);
    }
}
