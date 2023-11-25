package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzgqe extends zzgqd {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgqe(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgqi) || zzd() != ((zzgqi) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzgqe) {
            zzgqe zzgqeVar = (zzgqe) obj;
            int zzr = zzr();
            int zzr2 = zzgqeVar.zzr();
            if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
                return false;
            }
            return zzg(zzgqeVar, 0, zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public int zzd() {
        return this.zza.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgqd
    final boolean zzg(zzgqi zzgqiVar, int i10, int i11) {
        if (i11 <= zzgqiVar.zzd()) {
            int i12 = i10 + i11;
            if (i12 <= zzgqiVar.zzd()) {
                if (zzgqiVar instanceof zzgqe) {
                    zzgqe zzgqeVar = (zzgqe) zzgqiVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgqeVar.zza;
                    int zzc = zzc() + i11;
                    int zzc2 = zzc();
                    int zzc3 = zzgqeVar.zzc() + i10;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzgqiVar.zzk(i10, i12).equals(zzk(0, i11));
            }
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + zzgqiVar.zzd());
        }
        throw new IllegalArgumentException("Length too large: " + i11 + zzd());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final int zzi(int i10, int i11, int i12) {
        return zzgsa.zzb(i10, this.zza, zzc() + i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final int zzj(int i10, int i11, int i12) {
        int zzc = zzc() + i11;
        return zzguz.zzf(i10, this.zza, zzc, i12 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final zzgqi zzk(int i10, int i11) {
        int zzq = zzgqi.zzq(i10, i11, zzd());
        if (zzq == 0) {
            return zzgqi.zzb;
        }
        return new zzgqb(this.zza, zzc() + i10, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final zzgqq zzl() {
        return zzgqq.zzI(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final void zzo(zzgpx zzgpxVar) throws IOException {
        zzgpxVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final boolean zzp() {
        int zzc = zzc();
        return zzguz.zzj(this.zza, zzc, zzd() + zzc);
    }
}
