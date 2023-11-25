package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgdl {
    private Integer zza;
    private zzgdm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgdl(zzgdk zzgdkVar) {
        this.zza = null;
        this.zzb = zzgdm.zzc;
    }

    public final zzgdl zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgdl zzb(zzgdm zzgdmVar) {
        this.zzb = zzgdmVar;
        return this;
    }

    public final zzgdo zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                return new zzgdo(num.intValue(), this.zzb, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    private zzgdl() {
        this.zza = null;
        throw null;
    }
}
