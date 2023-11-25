package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzakk {
    public final int zza;
    public final long zzb;

    private zzakk(int i10, long j10) {
        this.zza = i10;
        this.zzb = j10;
    }

    public static zzakk zza(zzabc zzabcVar, zzfb zzfbVar) throws IOException {
        ((zzaar) zzabcVar).zzm(zzfbVar.zzI(), 0, 8, false);
        zzfbVar.zzG(0);
        return new zzakk(zzfbVar.zzf(), zzfbVar.zzr());
    }
}
