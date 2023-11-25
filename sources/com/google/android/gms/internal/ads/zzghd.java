package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzghd implements zzghh {
    private final zzgpo zza;
    private final zzgmv zzb;

    private zzghd(zzgmv zzgmvVar, zzgpo zzgpoVar) {
        this.zzb = zzgmvVar;
        this.zza = zzgpoVar;
    }

    public static zzghd zza(zzgmv zzgmvVar) throws GeneralSecurityException {
        String zzh = zzgmvVar.zzh();
        Charset charset = zzghq.zza;
        byte[] bArr = new byte[zzh.length()];
        for (int i10 = 0; i10 < zzh.length(); i10++) {
            char charAt = zzh.charAt(i10);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i10] = (byte) charAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
        }
        return new zzghd(zzgmvVar, zzgpo.zzb(bArr));
    }

    public static zzghd zzb(zzgmv zzgmvVar) {
        return new zzghd(zzgmvVar, zzghq.zza(zzgmvVar.zzh()));
    }

    public final zzgmv zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzghh
    public final zzgpo zzd() {
        return this.zza;
    }
}
