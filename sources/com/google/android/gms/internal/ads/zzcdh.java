package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcdh extends zzamx {
    static final zzcdh zzb = new zzcdh();

    zzcdh() {
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final zzanb zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzand();
        }
        if ("mvhd".equals(str)) {
            return new zzane();
        }
        return new zzanf(str);
    }
}
