package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgqb extends zzgqe {
    private final int zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgqb(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzgqi.zzq(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe, com.google.android.gms.internal.ads.zzgqi
    public final byte zza(int i10) {
        zzgqi.zzy(i10, this.zzd);
        return this.zza[this.zzc + i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgqe, com.google.android.gms.internal.ads.zzgqi
    public final byte zzb(int i10) {
        return this.zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe, com.google.android.gms.internal.ads.zzgqi
    public final int zzd() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgqe, com.google.android.gms.internal.ads.zzgqi
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, this.zzc + i10, bArr, i11, i12);
    }
}
