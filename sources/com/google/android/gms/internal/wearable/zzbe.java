package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public class zzbe extends zzbd {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbe(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.wearable.zzbh
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbh) || zzd() != ((zzbh) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            int zzl = zzl();
            int zzl2 = zzbeVar.zzl();
            if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzbeVar.zzd()) {
                if (zzd <= zzbeVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzbeVar.zza;
                    zzbeVar.zzc();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < zzd) {
                        if (bArr[i10] != bArr2[i11]) {
                            return false;
                        }
                        i10++;
                        i11++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzbeVar.zzd());
            }
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.wearable.zzbh
    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzbh
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.wearable.zzbh
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.wearable.zzbh
    protected void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.wearable.zzbh
    protected final int zzf(int i10, int i11, int i12) {
        return zzco.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.wearable.zzbh
    public final zzbh zzg(int i10, int i11) {
        int zzk = zzbh.zzk(0, i11, zzd());
        if (zzk == 0) {
            return zzbh.zzb;
        }
        return new zzbb(this.zza, 0, zzk);
    }

    @Override // com.google.android.gms.internal.wearable.zzbh
    protected final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzbh
    public final void zzi(zzax zzaxVar) throws IOException {
        ((zzbm) zzaxVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.wearable.zzbh
    public final boolean zzj() {
        return zzfe.zze(this.zza, 0, zzd());
    }
}
