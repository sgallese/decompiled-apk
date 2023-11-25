package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgfz extends zzgah {
    private final zzghd zza;

    public zzgfz(zzghd zzghdVar) {
        this.zza = zzghdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfz)) {
            return false;
        }
        zzghd zzghdVar = ((zzgfz) obj).zza;
        if (!this.zza.zzc().zzf().equals(zzghdVar.zzc().zzf()) || !this.zza.zzc().zzh().equals(zzghdVar.zzc().zzh()) || !this.zza.zzc().zzg().equals(zzghdVar.zzc().zzg())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzghd zzghdVar = this.zza;
        return Arrays.hashCode(new Object[]{zzghdVar.zzc(), zzghdVar.zzd()});
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzc().zzh();
        zzgnw zzf = this.zza.zzc().zzf();
        zzgnw zzgnwVar = zzgnw.UNKNOWN_PREFIX;
        int ordinal = zzf.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    public final zzghd zza() {
        return this.zza;
    }
}
