package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgqt extends zzgqx {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgqt(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzJ(byte b10) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzK(int i10, boolean z10) throws IOException {
        zzs(i10 << 3);
        zzJ(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzL(int i10, zzgqi zzgqiVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzs(zzgqiVar.zzd());
        zzgqiVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgqx, com.google.android.gms.internal.ads.zzgpx
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zze(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzh(int i10, int i11) throws IOException {
        zzs((i10 << 3) | 5);
        zzi(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzi(int i10) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.zzc = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzj(int i10, long j10) throws IOException {
        zzs((i10 << 3) | 1);
        zzk(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzk(long j10) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.zzc = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzl(int i10, int i11) throws IOException {
        zzs(i10 << 3);
        zzm(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzm(int i10) throws IOException {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzn(int i10, zzgta zzgtaVar, zzgtt zzgttVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzs(((zzgpr) zzgtaVar).zzat(zzgttVar));
        zzgttVar.zzm(zzgtaVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzo(int i10, String str) throws IOException {
        zzs((i10 << 3) | 2);
        zzp(str);
    }

    public final void zzp(String str) throws IOException {
        int i10 = this.zzc;
        try {
            int zzA = zzgqx.zzA(str.length() * 3);
            int zzA2 = zzgqx.zzA(str.length());
            if (zzA2 == zzA) {
                int i11 = i10 + zzA2;
                this.zzc = i11;
                int zzd = zzguz.zzd(str, this.zza, i11, this.zzb - i11);
                this.zzc = i10;
                zzs((zzd - i10) - zzA2);
                this.zzc = zzd;
                return;
            }
            zzs(zzguz.zze(str));
            byte[] bArr = this.zza;
            int i12 = this.zzc;
            this.zzc = zzguz.zzd(str, bArr, i12, this.zzb - i12);
        } catch (zzguy e10) {
            this.zzc = i10;
            zzE(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgqu(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzq(int i10, int i11) throws IOException {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzr(int i10, int i11) throws IOException {
        zzs(i10 << 3);
        zzs(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzs(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
            }
        }
        byte[] bArr2 = this.zza;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzt(int i10, long j10) throws IOException {
        zzs(i10 << 3);
        zzu(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzu(long j10) throws IOException {
        boolean z10;
        z10 = zzgqx.zzb;
        if (z10 && this.zzb - this.zzc >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzguu.zzq(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            zzguu.zzq(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
            }
        }
        byte[] bArr4 = this.zza;
        int i13 = this.zzc;
        this.zzc = i13 + 1;
        bArr4[i13] = (byte) j10;
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final void zzI() {
    }
}
