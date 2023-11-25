package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzvi implements zzace {
    private boolean zzB;
    private zzra zzC;
    private final zzvc zza;
    private final zzqz zzd;
    private final zzqt zze;
    private zzvh zzf;
    private zzam zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzam zzy;
    private zzam zzz;
    private final zzve zzb = new zzve();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzacd[] zzn = new zzacd[1000];
    private final zzvp zzc = new zzvp(new zzec() { // from class: com.google.android.gms.internal.ads.zzvd
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzA = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzvi(zzxu zzxuVar, zzqz zzqzVar, zzqt zzqtVar) {
        this.zzd = zzqzVar;
        this.zze = zzqtVar;
        this.zza = new zzvc(zzxuVar);
    }

    private final int zzA(int i10) {
        int i11 = this.zzq + i10;
        int i12 = this.zzh;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    private final synchronized int zzB(zzkn zzknVar, zzht zzhtVar, boolean z10, boolean z11, zzve zzveVar) {
        zzhtVar.zzc = false;
        if (!zzJ()) {
            if (!z11 && !this.zzv) {
                zzam zzamVar = this.zzz;
                if (zzamVar == null || (!z10 && zzamVar == this.zzg)) {
                    return -3;
                }
                zzG(zzamVar, zzknVar);
                return -5;
            }
            zzhtVar.zzc(4);
            zzhtVar.zzd = Long.MIN_VALUE;
            return -4;
        }
        zzam zzamVar2 = ((zzvg) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z10 && zzamVar2 == this.zzg) {
            int zzA = zzA(this.zzr);
            if (!zzK(zzA)) {
                zzhtVar.zzc = true;
                return -3;
            }
            zzhtVar.zzc(this.zzl[zzA]);
            if (this.zzr == this.zzo - 1 && (z11 || this.zzv)) {
                zzhtVar.zza(536870912);
            }
            long j10 = this.zzm[zzA];
            zzhtVar.zzd = j10;
            if (j10 < this.zzs) {
                zzhtVar.zza(RecyclerView.UNDEFINED_DURATION);
            }
            zzveVar.zza = this.zzk[zzA];
            zzveVar.zzb = this.zzj[zzA];
            zzveVar.zzc = this.zzn[zzA];
            return -4;
        }
        zzG(zzamVar2, zzknVar);
        return -5;
    }

    private final synchronized long zzC(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.zzo;
        if (i11 != 0) {
            long[] jArr = this.zzm;
            int i12 = this.zzq;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.zzr) != i11) {
                    i11 = i10 + 1;
                }
                int zzz = zzz(i12, i11, j10, false);
                if (zzz == -1) {
                    return -1L;
                }
                return zzE(zzz);
            }
        }
        return -1L;
    }

    private final synchronized long zzD() {
        int i10 = this.zzo;
        if (i10 == 0) {
            return -1L;
        }
        return zzE(i10);
    }

    private final long zzE(int i10) {
        long j10 = this.zzt;
        long j11 = Long.MIN_VALUE;
        if (i10 != 0) {
            int zzA = zzA(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                j11 = Math.max(j11, this.zzm[zzA]);
                if ((this.zzl[zzA] & 1) != 0) {
                    break;
                }
                zzA--;
                if (zzA == -1) {
                    zzA = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j10, j11);
        this.zzo -= i10;
        int i12 = this.zzp + i10;
        this.zzp = i12;
        int i13 = this.zzq + i10;
        this.zzq = i13;
        int i14 = this.zzh;
        if (i13 >= i14) {
            this.zzq = i13 - i14;
        }
        int i15 = this.zzr - i10;
        this.zzr = i15;
        if (i15 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i12);
        if (this.zzo == 0) {
            int i16 = this.zzq;
            if (i16 == 0) {
                i16 = this.zzh;
            }
            return this.zzj[i16 - 1] + this.zzk[r12];
        }
        return this.zzj[this.zzq];
    }

    private final synchronized void zzF(long j10, int i10, long j11, int i11, zzacd zzacdVar) {
        boolean z10;
        boolean z11;
        int i12 = this.zzo;
        if (i12 > 0) {
            if (this.zzj[zzA(i12 - 1)] + this.zzk[r0] <= j11) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzdy.zzd(z11);
        }
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzv = z10;
        this.zzu = Math.max(this.zzu, j10);
        int zzA = zzA(this.zzo);
        this.zzm[zzA] = j10;
        this.zzj[zzA] = j11;
        this.zzk[zzA] = i11;
        this.zzl[zzA] = i10;
        this.zzn[zzA] = zzacdVar;
        this.zzi[zzA] = 0;
        if (this.zzc.zzf() || !((zzvg) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzqy zzqyVar = zzqy.zzb;
            zzvp zzvpVar = this.zzc;
            int i13 = this.zzp + this.zzo;
            zzam zzamVar = this.zzz;
            zzamVar.getClass();
            zzvpVar.zzc(i13, new zzvg(zzamVar, zzqyVar, null));
        }
        int i14 = this.zzo + 1;
        this.zzo = i14;
        int i15 = this.zzh;
        if (i14 == i15) {
            int i16 = i15 + 1000;
            long[] jArr = new long[i16];
            long[] jArr2 = new long[i16];
            long[] jArr3 = new long[i16];
            int[] iArr = new int[i16];
            int[] iArr2 = new int[i16];
            zzacd[] zzacdVarArr = new zzacd[i16];
            int i17 = this.zzq;
            int i18 = i15 - i17;
            System.arraycopy(this.zzj, i17, jArr2, 0, i18);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i18);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i18);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i18);
            System.arraycopy(this.zzn, this.zzq, zzacdVarArr, 0, i18);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i18);
            int i19 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i18, i19);
            System.arraycopy(this.zzm, 0, jArr3, i18, i19);
            System.arraycopy(this.zzl, 0, iArr, i18, i19);
            System.arraycopy(this.zzk, 0, iArr2, i18, i19);
            System.arraycopy(this.zzn, 0, zzacdVarArr, i18, i19);
            System.arraycopy(this.zzi, 0, jArr, i18, i19);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzacdVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i16;
        }
    }

    private final void zzG(zzam zzamVar, zzkn zzknVar) {
        boolean z10;
        zzad zzadVar;
        zzam zzamVar2 = this.zzg;
        if (zzamVar2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzra zzraVar = null;
        if (z10) {
            zzadVar = null;
        } else {
            zzadVar = zzamVar2.zzp;
        }
        this.zzg = zzamVar;
        zzad zzadVar2 = zzamVar.zzp;
        zzknVar.zza = zzamVar.zzc(this.zzd.zza(zzamVar));
        zzknVar.zzb = this.zzC;
        if (!z10 && zzfk.zzD(zzadVar, zzadVar2)) {
            return;
        }
        if (zzamVar.zzp != null) {
            zzraVar = new zzra(new zzqr(new zzrc(1), 6001));
        }
        this.zzC = zzraVar;
        zzknVar.zzb = zzraVar;
    }

    private final void zzH() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzI() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzJ() {
        if (this.zzr != this.zzo) {
            return true;
        }
        return false;
    }

    private final boolean zzK(int i10) {
        if (this.zzC != null) {
            return (this.zzl[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzL(zzam zzamVar) {
        this.zzx = false;
        if (zzfk.zzD(zzamVar, this.zzz)) {
            return false;
        }
        if (!this.zzc.zzf() && ((zzvg) this.zzc.zzb()).zza.equals(zzamVar)) {
            this.zzz = ((zzvg) this.zzc.zzb()).zza;
        } else {
            this.zzz = zzamVar;
        }
        boolean z10 = this.zzA;
        zzam zzamVar2 = this.zzz;
        this.zzA = z10 & zzcc.zze(zzamVar2.zzm, zzamVar2.zzj);
        this.zzB = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzvg zzvgVar) {
        zzqy zzqyVar = zzvgVar.zzb;
        int i10 = zzqx.zza;
    }

    private final int zzz(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.zzm[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.zzl[i10] & 1) != 0) {
                i12 = i13;
                if (j11 == j10) {
                    break;
                }
            }
            i10++;
            if (i10 == this.zzh) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final int zza() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzb(long j10, boolean z10) {
        int i10 = this.zzr;
        int zzA = zzA(i10);
        if (zzJ() && j10 >= this.zzm[zzA]) {
            if (j10 > this.zzu && z10) {
                return this.zzo - i10;
            }
            int zzz = zzz(zzA, this.zzo - i10, j10, true);
            if (zzz == -1) {
                return 0;
            }
            return zzz;
        }
        return 0;
    }

    public final int zzc() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzkn r9, com.google.android.gms.internal.ads.zzht r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.google.android.gms.internal.ads.zzve r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzB(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzg()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzvc r9 = r8.zza
            com.google.android.gms.internal.ads.zzve r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzvc r9 = r8.zza
            com.google.android.gms.internal.ads.zzve r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = -4
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvi.zzd(com.google.android.gms.internal.ads.zzkn, com.google.android.gms.internal.ads.zzht, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final /* synthetic */ int zze(zzt zztVar, int i10, boolean z10) {
        return zzacc.zza(this, zztVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzf(zzt zztVar, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zza(zztVar, i10, z10);
    }

    public final synchronized long zzg() {
        return this.zzu;
    }

    public final synchronized zzam zzh() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzi(long j10, boolean z10, boolean z11) {
        this.zza.zzc(zzC(j10, false, z11));
    }

    public final void zzj() {
        this.zza.zzc(zzD());
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzk(zzam zzamVar) {
        this.zzy = zzamVar;
        boolean zzL = zzL(zzamVar);
        zzvh zzvhVar = this.zzf;
        if (zzvhVar != null && zzL) {
            zzvhVar.zzL(zzamVar);
        }
    }

    public final void zzm() throws IOException {
        zzra zzraVar = this.zzC;
        if (zzraVar == null) {
            return;
        }
        throw zzraVar.zza();
    }

    public final void zzn() {
        zzj();
        zzH();
    }

    public final void zzo() {
        zzp(true);
        zzH();
    }

    public final void zzp(boolean z10) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z10) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
            this.zzA = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final /* synthetic */ void zzq(zzfb zzfbVar, int i10) {
        zzacc.zzb(this, zzfbVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzr(zzfb zzfbVar, int i10, int i11) {
        this.zza.zzh(zzfbVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzs(long j10, int i10, int i11, int i12, zzacd zzacdVar) {
        if (this.zzw) {
            if ((i10 & 1) == 0) {
                return;
            }
            this.zzw = false;
        }
        if (this.zzA) {
            if (j10 < this.zzs) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.zzB) {
                    zzes.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i10 |= 1;
            }
        }
        zzF(j10, i10, (this.zza.zzb() - i11) - i12, i11, zzacdVar);
    }

    public final void zzt(long j10) {
        this.zzs = j10;
    }

    public final void zzu(zzvh zzvhVar) {
        this.zzf = zzvhVar;
    }

    public final synchronized void zzv(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzr + i10 <= this.zzo) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdy.zzd(z10);
        this.zzr += i10;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    public final synchronized boolean zzx(boolean z10) {
        boolean z11 = true;
        if (!zzJ()) {
            if (!z10 && !this.zzv) {
                zzam zzamVar = this.zzz;
                if (zzamVar != null) {
                    if (zzamVar == this.zzg) {
                        return false;
                    }
                } else {
                    z11 = false;
                }
            }
            return z11;
        } else if (((zzvg) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
            return true;
        } else {
            return zzK(zzA(this.zzr));
        }
    }

    public final synchronized boolean zzy(long j10, boolean z10) {
        int zzz;
        zzI();
        int i10 = this.zzr;
        int zzA = zzA(i10);
        if (zzJ() && j10 >= this.zzm[zzA]) {
            if (j10 > this.zzu) {
                if (z10) {
                    z10 = true;
                }
            }
            if (this.zzA) {
                zzz = this.zzo - i10;
                int i11 = zzA;
                while (true) {
                    if (i11 < zzz) {
                        if (this.zzm[i11] >= j10) {
                            zzz = i11 - zzA;
                            break;
                        }
                        i11++;
                    } else if (!z10) {
                        zzz = -1;
                    }
                }
            } else {
                zzz = zzz(zzA, this.zzo - i10, j10, true);
            }
            if (zzz == -1) {
                return false;
            }
            this.zzs = j10;
            this.zzr += zzz;
            return true;
        }
        return false;
    }
}
