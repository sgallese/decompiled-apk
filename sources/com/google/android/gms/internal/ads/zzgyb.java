package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzgyb extends zzgye implements zzanb {
    zzanc zza;
    protected final String zzb = "moov";

    public zzgyb(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final void zzb(zzgyf zzgyfVar, ByteBuffer byteBuffer, long j10, zzamy zzamyVar) throws IOException {
        zzgyfVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzgyfVar;
        this.zzf = zzgyfVar.zzb();
        zzgyfVar.zze(zzgyfVar.zzb() + j10);
        this.zzg = zzgyfVar.zzb();
        this.zzc = zzamyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final void zzc(zzanc zzancVar) {
        this.zza = zzancVar;
    }
}
