package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfzv {
    private final zzgmv zza;

    private zzfzv(zzgmv zzgmvVar) {
        this.zza = zzgmvVar;
    }

    public static zzfzv zzc(String str, byte[] bArr, int i10) {
        zzgnw zzgnwVar;
        zzgmu zza = zzgmv.zza();
        zza.zzb(str);
        zza.zzc(zzgqi.zzv(bArr, 0, bArr.length));
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                zzgnwVar = zzgnw.RAW;
            } else {
                zzgnwVar = zzgnw.LEGACY;
            }
        } else {
            zzgnwVar = zzgnw.TINK;
        }
        zza.zza(zzgnwVar);
        return new zzfzv((zzgmv) zza.zzal());
    }

    public final zzgah zza() throws GeneralSecurityException {
        try {
            zzgmv zze = zzgmv.zze(zzb().zzax(), zzgrc.zza());
            zzggi zzc = zzggi.zzc();
            zzghd zza = zzghd.zza(zze);
            if (!zzc.zzi(zza)) {
                return new zzgfz(zza);
            }
            return zzc.zzb(zza);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    final zzgmv zzb() {
        try {
            zzgmv zzgmvVar = this.zza;
            if (zzgmvVar == null) {
                return ((zzghd) zzggi.zzc().zzd(null, zzghd.class)).zzc();
            }
            return zzgmvVar;
        } catch (GeneralSecurityException e10) {
            throw new zzghp("Parsing parameters failed in getProto(). You probably want to call some Tink register function for null", e10);
        }
    }
}
