package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgbw {
    private zzgcg zza = null;
    private zzgpp zzb = null;
    private Integer zzc = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgbw(zzgbv zzgbvVar) {
    }

    public final zzgbw zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgbw zzb(zzgpp zzgppVar) {
        this.zzb = zzgppVar;
        return this;
    }

    public final zzgbw zzc(zzgcg zzgcgVar) {
        this.zza = zzgcgVar;
        return this;
    }

    public final zzgby zzd() throws GeneralSecurityException {
        zzgpp zzgppVar;
        zzgpo zzb;
        zzgcg zzgcgVar = this.zza;
        if (zzgcgVar != null && (zzgppVar = this.zzb) != null) {
            if (zzgcgVar.zzb() == zzgppVar.zza()) {
                if (zzgcgVar.zzd() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzd() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzc() == zzgce.zzc) {
                    zzb = zzgpo.zzb(new byte[0]);
                } else if (this.zza.zzc() == zzgce.zzb) {
                    zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzc() == zzgce.zza) {
                    zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
                }
                return new zzgby(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzgbw() {
    }
}
