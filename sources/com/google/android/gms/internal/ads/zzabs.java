package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzabs {
    private final zzfb zza = new zzfb(10);

    public final zzbz zza(zzabc zzabcVar, zzaep zzaepVar) throws IOException {
        zzbz zzbzVar = null;
        int i10 = 0;
        while (true) {
            try {
                ((zzaar) zzabcVar).zzm(this.zza.zzI(), 0, 10, false);
                this.zza.zzG(0);
                if (this.zza.zzn() != 4801587) {
                    break;
                }
                this.zza.zzH(3);
                int zzk = this.zza.zzk();
                int i11 = zzk + 10;
                if (zzbzVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.zza.zzI(), 0, bArr, 0, 10);
                    ((zzaar) zzabcVar).zzm(bArr, 10, zzk, false);
                    zzbzVar = zzaer.zza(bArr, i11, zzaepVar, new zzads());
                } else {
                    ((zzaar) zzabcVar).zzl(zzk, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        zzabcVar.zzj();
        ((zzaar) zzabcVar).zzl(i10, false);
        return zzbzVar;
    }
}
