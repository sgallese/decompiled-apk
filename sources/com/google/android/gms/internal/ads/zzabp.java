package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzabp implements zzabc {
    private final zzabc zza;

    public zzabp(zzabc zzabcVar) {
        this.zza = zzabcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        return this.zza.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final int zzb(byte[] bArr, int i10, int i11) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final int zzc(int i10) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public long zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public long zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzg(int i10) throws IOException {
        ((zzaar) this.zza).zzl(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzh(byte[] bArr, int i10, int i11) throws IOException {
        ((zzaar) this.zza).zzm(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzi(byte[] bArr, int i10, int i11) throws IOException {
        ((zzaar) this.zza).zzn(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzj() {
        this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzk(int i10) throws IOException {
        ((zzaar) this.zza).zzo(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzm(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.zza.zzm(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzn(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.zza.zzn(bArr, 0, 8, true);
    }
}
