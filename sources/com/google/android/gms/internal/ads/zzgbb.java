package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgbb {
    private zzgbm zza = null;
    private zzgpp zzb = null;
    private zzgpp zzc = null;
    private Integer zzd = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgbb(zzgba zzgbaVar) {
    }

    public final zzgbb zza(zzgpp zzgppVar) {
        this.zzb = zzgppVar;
        return this;
    }

    public final zzgbb zzb(zzgpp zzgppVar) {
        this.zzc = zzgppVar;
        return this;
    }

    public final zzgbb zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgbb zzd(zzgbm zzgbmVar) {
        this.zza = zzgbmVar;
        return this;
    }

    public final zzgbd zze() throws GeneralSecurityException {
        zzgpo zzb;
        zzgbm zzgbmVar = this.zza;
        if (zzgbmVar != null) {
            zzgpp zzgppVar = this.zzb;
            if (zzgppVar != null && this.zzc != null) {
                if (zzgbmVar.zza() == zzgppVar.zza()) {
                    if (zzgbmVar.zzb() == this.zzc.zza()) {
                        if (this.zza.zzg() && this.zzd == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (!this.zza.zzg() && this.zzd != null) {
                            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        if (this.zza.zzf() == zzgbk.zzc) {
                            zzb = zzgpo.zzb(new byte[0]);
                        } else if (this.zza.zzf() == zzgbk.zzb) {
                            zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
                        } else if (this.zza.zzf() == zzgbk.zza) {
                            zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
                        } else {
                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                        }
                        return new zzgbd(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
                    }
                    throw new GeneralSecurityException("HMAC key size mismatch");
                }
                throw new GeneralSecurityException("AES key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without key material");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }

    private zzgbb() {
    }
}
