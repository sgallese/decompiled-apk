package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgiu extends zzggv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgiu(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzggv
    public final /* bridge */ /* synthetic */ Object zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgmf zzgmfVar = (zzgmf) zzgtaVar;
        int zzg = zzgmfVar.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgmfVar.zzh().zzA(), "HMAC");
        int zza = zzgmfVar.zzg().zza();
        int i10 = zzg - 2;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return new zzgpk(new zzgpj("HMACSHA224", secretKeySpec), zza);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzgpk(new zzgpj("HMACSHA512", secretKeySpec), zza);
                }
                return new zzgpk(new zzgpj("HMACSHA256", secretKeySpec), zza);
            }
            return new zzgpk(new zzgpj("HMACSHA384", secretKeySpec), zza);
        }
        return new zzgpk(new zzgpj("HMACSHA1", secretKeySpec), zza);
    }
}
