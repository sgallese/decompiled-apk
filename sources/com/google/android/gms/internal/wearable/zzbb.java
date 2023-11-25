package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzbb extends zzbe {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbb(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzbh.zzk(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.wearable.zzbe, com.google.android.gms.internal.wearable.zzbh
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzbe, com.google.android.gms.internal.wearable.zzbh
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.wearable.zzbe
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.wearable.zzbe, com.google.android.gms.internal.wearable.zzbh
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.wearable.zzbe, com.google.android.gms.internal.wearable.zzbh
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }
}
