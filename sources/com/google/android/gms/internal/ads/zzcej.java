package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcej implements zzgi {
    private final zzgi zza;
    private final long zzb;
    private final zzgi zzc;
    private long zzd;
    private Uri zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcej(zzgi zzgiVar, int i10, zzgi zzgiVar2) {
        this.zza = zzgiVar;
        this.zzb = i10;
        this.zzc = zzgiVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int zza = this.zza.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.zzd + zza;
            this.zzd = j12;
            i12 = zza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
            int i13 = i12 + zza2;
            this.zzd += zza2;
            return i13;
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws IOException {
        long j10;
        zzgn zzgnVar2;
        long j11;
        long j12;
        this.zze = zzgnVar.zza;
        long j13 = zzgnVar.zzf;
        long j14 = this.zzb;
        zzgn zzgnVar3 = null;
        if (j13 >= j14) {
            zzgnVar2 = null;
        } else {
            long j15 = zzgnVar.zzg;
            if (j15 != -1) {
                j10 = Math.min(j15, j14 - j13);
            } else {
                j10 = j14 - j13;
            }
            zzgnVar2 = new zzgn(zzgnVar.zza, null, j13, j13, j10, null, 0);
        }
        long j16 = zzgnVar.zzg;
        if (j16 == -1 || zzgnVar.zzf + j16 > this.zzb) {
            long max = Math.max(this.zzb, zzgnVar.zzf);
            long j17 = zzgnVar.zzg;
            if (j17 != -1) {
                j11 = Math.min(j17, (zzgnVar.zzf + j17) - this.zzb);
            } else {
                j11 = -1;
            }
            zzgnVar3 = new zzgn(zzgnVar.zza, null, max, max, j11, null, 0);
        }
        long j18 = 0;
        if (zzgnVar2 != null) {
            j12 = this.zza.zzb(zzgnVar2);
        } else {
            j12 = 0;
        }
        if (zzgnVar3 != null) {
            j18 = this.zzc.zzb(zzgnVar3);
        }
        this.zzd = zzgnVar.zzf;
        if (j12 == -1 || j18 == -1) {
            return -1L;
        }
        return j12 + j18;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Map zze() {
        return zzfug.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhkVar) {
    }
}
