package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfb {
    private static final zzfui zza = zzfui.zzo(zzfqu.zza, zzfqu.zzc, zzfqu.zzf, zzfqu.zzd, zzfqu.zze);
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfb(byte[] bArr, int i10) {
        this.zzb = bArr;
        this.zzd = i10;
    }

    public final void zzA(int i10) {
        byte[] bArr = this.zzb;
        if (i10 > bArr.length) {
            this.zzb = Arrays.copyOf(bArr, i10);
        }
    }

    public final void zzB(zzfa zzfaVar, int i10) {
        zzC(zzfaVar.zza, 0, i10);
        zzfaVar.zzj(0);
    }

    public final void zzC(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.zzb, this.zzc, bArr, i10, i11);
        this.zzc += i11;
    }

    public final void zzD(int i10) {
        byte[] bArr = this.zzb;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        zzE(bArr, i10);
    }

    public final void zzE(byte[] bArr, int i10) {
        this.zzb = bArr;
        this.zzd = i10;
        this.zzc = 0;
    }

    public final void zzF(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzb.length) {
            z10 = true;
        }
        zzdy.zzd(z10);
        this.zzd = i10;
    }

    public final void zzG(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzd) {
            z10 = true;
        }
        zzdy.zzd(z10);
        this.zzc = i10;
    }

    public final void zzH(int i10) {
        zzG(this.zzc + i10);
    }

    public final byte[] zzI() {
        return this.zzb;
    }

    public final int zza() {
        return this.zzd - this.zzc;
    }

    public final int zzb() {
        return this.zzb.length;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zzb[this.zzc] & 255;
    }

    public final int zzf() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        int i14 = bArr[i11] & 255;
        int i15 = i13 + 1;
        int i16 = bArr[i13] & 255;
        this.zzc = i15 + 1;
        return (bArr[i15] & 255) | (i12 << 24) | (i14 << 16) | (i16 << 8);
    }

    public final int zzg() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        int i14 = bArr[i11] & 255;
        this.zzc = i13 + 1;
        return (bArr[i13] & 255) | ((i12 << 24) >> 8) | (i14 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        int i14 = bArr[i11] & 255;
        int i15 = i13 + 1;
        int i16 = bArr[i13] & 255;
        this.zzc = i15 + 1;
        return ((bArr[i15] & 255) << 24) | i12 | (i14 << 8) | (i16 << 16);
    }

    public final int zzi() {
        int zzh = zzh();
        if (zzh >= 0) {
            return zzh;
        }
        throw new IllegalStateException("Top bit not zero: " + zzh);
    }

    public final int zzj() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.zzc = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final int zzk() {
        return (zzl() << 21) | (zzl() << 14) | (zzl() << 7) | zzl();
    }

    public final int zzl() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int zzm() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        int i13 = bArr[i11] & 255;
        this.zzc = i11 + 1 + 2;
        return i13 | (i12 << 8);
    }

    public final int zzn() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        int i14 = bArr[i11] & 255;
        this.zzc = i13 + 1;
        return (bArr[i13] & 255) | (i12 << 16) | (i14 << 8);
    }

    public final int zzo() {
        int zzf = zzf();
        if (zzf >= 0) {
            return zzf;
        }
        throw new IllegalStateException("Top bit not zero: " + zzf);
    }

    public final int zzp() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.zzc = i11 + 1;
        return (bArr[i11] & 255) | (i12 << 8);
    }

    public final long zzq() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        long j14 = bArr[i14];
        int i16 = i15 + 1;
        long j15 = bArr[i15];
        int i17 = i16 + 1;
        long j16 = bArr[i16];
        this.zzc = i17 + 1;
        return ((bArr[i17] & 255) << 56) | ((j16 & 255) << 48) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40);
    }

    public final long zzr() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        long j12 = bArr[i12];
        this.zzc = i12 + 1 + 1;
        return ((bArr[r2] & 255) << 24) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final long zzs() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        long j14 = bArr[i14];
        int i16 = i15 + 1;
        long j15 = bArr[i15];
        long j16 = bArr[i16];
        this.zzc = i16 + 1 + 1;
        return (bArr[r3] & 255) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | ((j16 & 255) << 8);
    }

    public final long zzt() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        long j12 = bArr[i12];
        this.zzc = i12 + 1 + 1;
        return (bArr[r2] & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public final long zzu() {
        long zzs = zzs();
        if (zzs >= 0) {
            return zzs;
        }
        throw new IllegalStateException("Top bit not zero: " + zzs);
    }

    public final long zzv() {
        int i10;
        int i11;
        long j10 = this.zzb[this.zzc];
        int i12 = 7;
        while (true) {
            i10 = 0;
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((i13 & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i10 = 7 - i12;
            } else if (i12 == 7) {
                i10 = 1;
            }
        }
        if (i10 != 0) {
            for (i11 = 1; i11 < i10; i11++) {
                if ((this.zzb[this.zzc + i11] & 192) == 128) {
                    j10 = (j10 << 6) | (r2 & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
                }
            }
            this.zzc += i10;
            return j10;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
    }

    public final String zzw(char c10) {
        int i10 = this.zzd;
        int i11 = this.zzc;
        if (i10 - i11 != 0) {
            while (i11 < this.zzd && this.zzb[i11] != 0) {
                i11++;
            }
            byte[] bArr = this.zzb;
            int i12 = this.zzc;
            String zzx = zzfk.zzx(bArr, i12, i11 - i12);
            this.zzc = i11;
            if (i11 < this.zzd) {
                this.zzc = i11 + 1;
            }
            return zzx;
        }
        return null;
    }

    public final String zzx(int i10) {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int i12 = this.zzc;
        int i13 = (i12 + i10) - 1;
        if (i13 < this.zzd && this.zzb[i13] == 0) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        String zzx = zzfk.zzx(this.zzb, i12, i11);
        this.zzc += i10;
        return zzx;
    }

    public final String zzy(int i10, Charset charset) {
        byte[] bArr = this.zzb;
        int i11 = this.zzc;
        String str = new String(bArr, i11, i10, charset);
        this.zzc = i11 + i10;
        return str;
    }

    public final short zzz() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.zzc = i11 + 1;
        return (short) ((bArr[i11] & 255) | (i12 << 8));
    }

    public zzfb() {
        this.zzb = zzfk.zzf;
    }

    public zzfb(int i10) {
        this.zzb = new byte[i10];
        this.zzd = i10;
    }

    public zzfb(byte[] bArr) {
        this.zzb = bArr;
        this.zzd = bArr.length;
    }
}
