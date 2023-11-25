package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgts extends zzgqi {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgqi zzd;
    private final zzgqi zze;
    private final int zzf;
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgqi zzC(zzgqi zzgqiVar, zzgqi zzgqiVar2) {
        if (zzgqiVar2.zzd() == 0) {
            return zzgqiVar;
        }
        if (zzgqiVar.zzd() == 0) {
            return zzgqiVar2;
        }
        int zzd = zzgqiVar.zzd() + zzgqiVar2.zzd();
        if (zzd < 128) {
            return zzD(zzgqiVar, zzgqiVar2);
        }
        if (zzgqiVar instanceof zzgts) {
            zzgts zzgtsVar = (zzgts) zzgqiVar;
            if (zzgtsVar.zze.zzd() + zzgqiVar2.zzd() < 128) {
                return new zzgts(zzgtsVar.zzd, zzD(zzgtsVar.zze, zzgqiVar2));
            } else if (zzgtsVar.zzd.zzf() > zzgtsVar.zze.zzf() && zzgtsVar.zzg > zzgqiVar2.zzf()) {
                return new zzgts(zzgtsVar.zzd, new zzgts(zzgtsVar.zze, zzgqiVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzgqiVar.zzf(), zzgqiVar2.zzf()) + 1)) {
            return new zzgts(zzgqiVar, zzgqiVar2);
        }
        return zzgto.zza(new zzgto(null), zzgqiVar, zzgqiVar2);
    }

    private static zzgqi zzD(zzgqi zzgqiVar, zzgqi zzgqiVar2) {
        int zzd = zzgqiVar.zzd();
        int zzd2 = zzgqiVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgqiVar.zzz(bArr, 0, 0, zzd);
        zzgqiVar2.zzz(bArr, 0, zzd, zzd2);
        return new zzgqe(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgqi)) {
            return false;
        }
        zzgqi zzgqiVar = (zzgqi) obj;
        if (this.zzc != zzgqiVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgqiVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgtp zzgtpVar = null;
        zzgtq zzgtqVar = new zzgtq(this, zzgtpVar);
        zzgqd next = zzgtqVar.next();
        zzgtq zzgtqVar2 = new zzgtq(zzgqiVar, zzgtpVar);
        zzgqd next2 = zzgtqVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int zzd = next.zzd() - i10;
            int zzd2 = next2.zzd() - i11;
            int min = Math.min(zzd, zzd2);
            if (i10 == 0) {
                zzg = next.zzg(next2, i11, min);
            } else {
                zzg = next2.zzg(next, i10, min);
            }
            if (!zzg) {
                return false;
            }
            i12 += min;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgtqVar.next();
                i10 = 0;
            } else {
                i10 += min;
            }
            if (min == zzd2) {
                next2 = zzgtqVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqi, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgtm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final byte zza(int i10) {
        zzgqi.zzy(i10, this.zzc);
        return zzb(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        if (i10 < i11) {
            return this.zzd.zzb(i10);
        }
        return this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final int zzd() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else if (i10 >= i14) {
            this.zze.zze(bArr, i10 - i14, i11, i12);
        } else {
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final int zzf() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final boolean zzh() {
        if (this.zzc >= zzc(this.zzg)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final int zzi(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzi(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i15), 0, i12 - i15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final int zzj(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzj(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzj(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzj(this.zzd.zzj(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final zzgqi zzk(int i10, int i11) {
        int zzq = zzgqi.zzq(i10, i11, this.zzc);
        if (zzq == 0) {
            return zzgqi.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzk(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzk(i10 - i12, i11 - i12);
        }
        zzgqi zzgqiVar = this.zzd;
        return new zzgts(zzgqiVar.zzk(i10, zzgqiVar.zzd()), this.zze.zzk(0, i11 - this.zzf));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzgql, com.google.android.gms.internal.ads.zzgtp] */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final zzgqq zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        ?? r22 = 0;
        zzgtq zzgtqVar = new zzgtq(this, r22);
        while (zzgtqVar.hasNext()) {
            arrayList.add(zzgtqVar.next().zzn());
        }
        int i10 = zzgqq.zzd;
        boolean z10 = false;
        int i11 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i11 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z10 |= true;
            } else if (byteBuffer.isDirect()) {
                z10 |= true;
            } else {
                z10 |= true;
            }
        }
        if (z10) {
            return new zzgqm(arrayList, i11, true, r22);
        }
        return zzgqq.zzH(new zzgsd(arrayList), RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    protected final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final ByteBuffer zzn() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final void zzo(zzgpx zzgpxVar) throws IOException {
        this.zzd.zzo(zzgpxVar);
        this.zze.zzo(zzgpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final boolean zzp() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzgqi zzgqiVar = this.zze;
        if (zzgqiVar.zzj(zzj, 0, zzgqiVar.zzd()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    /* renamed from: zzs */
    public final zzgqc iterator() {
        return new zzgtm(this);
    }

    private zzgts(zzgqi zzgqiVar, zzgqi zzgqiVar2) {
        this.zzd = zzgqiVar;
        this.zze = zzgqiVar2;
        int zzd = zzgqiVar.zzd();
        this.zzf = zzd;
        this.zzc = zzd + zzgqiVar2.zzd();
        this.zzg = Math.max(zzgqiVar.zzf(), zzgqiVar2.zzf()) + 1;
    }
}
