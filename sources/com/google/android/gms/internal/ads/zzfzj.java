package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfzj {
    private final InputStream zza;

    private zzfzj(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzfzj zzb(byte[] bArr) {
        return new zzfzj(new ByteArrayInputStream(bArr));
    }

    public final zzgnd zza() throws IOException {
        try {
            return zzgnd.zzg(this.zza, zzgrc.zza());
        } finally {
            this.zza.close();
        }
    }
}
