package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzrr {
    public final zzrw zza;
    public final MediaFormat zzb;
    public final zzam zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzrr(zzrw zzrwVar, MediaFormat mediaFormat, zzam zzamVar, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.zza = zzrwVar;
        this.zzb = mediaFormat;
        this.zzc = zzamVar;
        this.zzd = surface;
    }

    public static zzrr zza(zzrw zzrwVar, MediaFormat mediaFormat, zzam zzamVar, MediaCrypto mediaCrypto) {
        return new zzrr(zzrwVar, mediaFormat, zzamVar, null, null, 0);
    }

    public static zzrr zzb(zzrw zzrwVar, MediaFormat mediaFormat, zzam zzamVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzrr(zzrwVar, mediaFormat, zzamVar, surface, null, 0);
    }
}
