package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgcn {
    private zzgcx zza = null;
    private zzgpp zzb = null;
    private Integer zzc = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgcn(zzgcm zzgcmVar) {
    }

    public final zzgcn zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgcn zzb(zzgpp zzgppVar) {
        this.zzb = zzgppVar;
        return this;
    }

    public final zzgcn zzc(zzgcx zzgcxVar) {
        this.zza = zzgcxVar;
        return this;
    }

    public final zzgcp zzd() throws GeneralSecurityException {
        zzgpp zzgppVar;
        zzgpo zzb;
        zzgcx zzgcxVar = this.zza;
        if (zzgcxVar != null && (zzgppVar = this.zzb) != null) {
            if (zzgcxVar.zza() == zzgppVar.zza()) {
                if (zzgcxVar.zzc() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzc() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzb() == zzgcv.zzc) {
                    zzb = zzgpo.zzb(new byte[0]);
                } else if (this.zza.zzb() == zzgcv.zzb) {
                    zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzb() == zzgcv.zza) {
                    zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
                }
                return new zzgcp(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzgcn() {
    }
}
