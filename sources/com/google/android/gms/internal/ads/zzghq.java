package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzghq {
    public static final Charset zza = Charset.forName("UTF-8");

    public static final zzgpo zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i10] = (byte) charAt;
            } else {
                throw new zzghp("Not a printable ASCII character: " + charAt);
            }
        }
        return zzgpo.zzb(bArr);
    }
}
