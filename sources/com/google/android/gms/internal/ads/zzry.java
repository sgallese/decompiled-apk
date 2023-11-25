package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzry extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzrw zzc;
    public final String zzd;
    public final zzry zze;

    public zzry(zzam zzamVar, Throwable th, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + String.valueOf(zzamVar), th, zzamVar.zzm, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i10), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzry zza(zzry zzryVar, zzry zzryVar2) {
        return new zzry(zzryVar.getMessage(), zzryVar.getCause(), zzryVar.zza, false, zzryVar.zzc, zzryVar.zzd, zzryVar2);
    }

    public zzry(zzam zzamVar, Throwable th, boolean z10, zzrw zzrwVar) {
        this("Decoder init failed: " + zzrwVar.zza + ", " + String.valueOf(zzamVar), th, zzamVar.zzm, false, zzrwVar, (zzfk.zza < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }

    private zzry(String str, Throwable th, String str2, boolean z10, zzrw zzrwVar, String str3, zzry zzryVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzrwVar;
        this.zzd = str3;
        this.zze = zzryVar;
    }
}
