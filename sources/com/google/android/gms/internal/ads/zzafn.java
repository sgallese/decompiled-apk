package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzafn implements zzafp {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzafw zzc = new zzafw();
    private zzafo zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzabc zzabcVar, int i10) throws IOException {
        ((zzaar) zzabcVar).zzn(this.zza, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.zza[i11] & 255);
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zza(zzafo zzafoVar) {
        this.zzd = zzafoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r0 == 1) goto L34;
     */
    @Override // com.google.android.gms.internal.ads.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzabc r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafn.zzc(com.google.android.gms.internal.ads.zzabc):boolean");
    }
}
