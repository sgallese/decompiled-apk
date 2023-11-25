package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzamz extends zzgye {
    private static final zzgyl zza = zzgyl.zzb(zzamz.class);

    public zzamz(zzgyf zzgyfVar, zzamy zzamyVar) throws IOException {
        zzf(zzgyfVar, zzgyfVar.zzc(), zzamyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgye
    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 7);
        sb2.append("model(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgye, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
