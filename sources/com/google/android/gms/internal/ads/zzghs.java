package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzghs {
    private zzgie zza = null;
    private zzgpp zzb = null;
    private Integer zzc = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzghs(zzghr zzghrVar) {
    }

    public final zzghs zza(zzgpp zzgppVar) throws GeneralSecurityException {
        this.zzb = zzgppVar;
        return this;
    }

    public final zzghs zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzghs zzc(zzgie zzgieVar) {
        this.zza = zzgieVar;
        return this;
    }

    public final zzghu zzd() throws GeneralSecurityException {
        zzgpp zzgppVar;
        zzgpo zzb;
        zzgie zzgieVar = this.zza;
        if (zzgieVar != null && (zzgppVar = this.zzb) != null) {
            if (zzgieVar.zzb() == zzgppVar.zza()) {
                if (zzgieVar.zze() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zze() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzd() == zzgic.zzd) {
                    zzb = zzgpo.zzb(new byte[0]);
                } else if (this.zza.zzd() != zzgic.zzc && this.zza.zzd() != zzgic.zzb) {
                    if (this.zza.zzd() == zzgic.zza) {
                        zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                    }
                } else {
                    zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                }
                return new zzghu(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzghs() {
    }
}
