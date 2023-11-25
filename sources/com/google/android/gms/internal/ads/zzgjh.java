package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgjh implements zzgag {
    private final zzgao zza;
    private final zzgju zzb;
    private final zzgju zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgjh(zzgao zzgaoVar, zzgjg zzgjgVar) {
        zzgju zzgjuVar;
        this.zza = zzgaoVar;
        if (zzgaoVar.zzf()) {
            zzgjv zzb = zzggf.zza().zzb();
            zzgka zza = zzggc.zza(zzgaoVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzgjuVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzgjuVar = zzggc.zza;
            this.zzb = zzgjuVar;
        }
        this.zzc = zzgjuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgag
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        Logger logger;
        byte[] bArr4;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzgak zzgakVar : this.zza.zze(copyOf)) {
                if (zzgakVar.zzc().equals(zzgnw.LEGACY)) {
                    bArr4 = zzgji.zzb;
                    bArr3 = zzgom.zzb(bArr2, bArr4);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((zzgag) zzgakVar.zze()).zza(copyOfRange, bArr3);
                    zzgakVar.zza();
                    return;
                } catch (GeneralSecurityException e10) {
                    logger = zzgji.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e10.toString()));
                }
            }
            for (zzgak zzgakVar2 : this.zza.zze(zzfzn.zza)) {
                try {
                    ((zzgag) zzgakVar2.zze()).zza(bArr, bArr2);
                    zzgakVar2.zza();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
