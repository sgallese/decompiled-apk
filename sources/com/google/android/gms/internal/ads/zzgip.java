package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgip {
    private zzgjc zza = null;
    private zzgpp zzb = null;
    private Integer zzc = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgip(zzgio zzgioVar) {
    }

    public final zzgip zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgip zzb(zzgpp zzgppVar) {
        this.zzb = zzgppVar;
        return this;
    }

    public final zzgip zzc(zzgjc zzgjcVar) {
        this.zza = zzgjcVar;
        return this;
    }

    public final zzgir zzd() throws GeneralSecurityException {
        zzgpp zzgppVar;
        zzgpo zzb;
        zzgjc zzgjcVar = this.zza;
        if (zzgjcVar != null && (zzgppVar = this.zzb) != null) {
            if (zzgjcVar.zzb() == zzgppVar.zza()) {
                if (zzgjcVar.zzg() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzg() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzf() == zzgja.zzd) {
                    zzb = zzgpo.zzb(new byte[0]);
                } else if (this.zza.zzf() != zzgja.zzc && this.zza.zzf() != zzgja.zzb) {
                    if (this.zza.zzf() == zzgja.zza) {
                        zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                    }
                } else {
                    zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                }
                return new zzgir(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzgip() {
    }
}
