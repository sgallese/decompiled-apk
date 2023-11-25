package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgfc extends zzgfd {
    public zzgfc(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    final zzgfb zza(byte[] bArr, int i10) throws InvalidKeyException {
        return new zzgfa(bArr, i10);
    }
}
