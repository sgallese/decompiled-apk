package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzghf {
    private static final ThreadLocal zza = new zzghe();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SecureRandom zza() {
        SecureRandom zzc = zzc();
        zzc.nextLong();
        return zzc;
    }

    public static byte[] zzb(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom zzc() {
        try {
            try {
                try {
                    return SecureRandom.getInstance("SHA1PRNG", ProviderInstaller.PROVIDER_NAME);
                } catch (GeneralSecurityException unused) {
                    return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                }
            } catch (GeneralSecurityException unused2) {
                return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
            }
        } catch (GeneralSecurityException unused3) {
            return new SecureRandom();
        }
    }
}
