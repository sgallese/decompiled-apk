package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgcu {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzgcv zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgcu(zzgct zzgctVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgcv.zzc;
    }

    public final zzgcu zza(int i10) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzgcu zzb(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgcu zzc(int i10) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgcu zzd(zzgcv zzgcvVar) {
        this.zzd = zzgcvVar;
        return this;
    }

    public final zzgcx zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzd != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        int intValue = num.intValue();
                        this.zzb.intValue();
                        this.zzc.intValue();
                        return new zzgcx(intValue, 12, 16, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    private zzgcu() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }
}
