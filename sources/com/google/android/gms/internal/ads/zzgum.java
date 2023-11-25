package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgum extends zzguk {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final /* synthetic */ int zza(Object obj) {
        return ((zzgul) obj).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzgul) obj).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgrq zzgrqVar = (zzgrq) obj;
        zzgul zzgulVar = zzgrqVar.zzc;
        if (zzgulVar == zzgul.zzc()) {
            zzgul zzf = zzgul.zzf();
            zzgrqVar.zzc = zzf;
            return zzf;
        }
        return zzgulVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzgrq) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (!zzgul.zzc().equals(obj2)) {
            if (zzgul.zzc().equals(obj)) {
                return zzgul.zze((zzgul) obj, (zzgul) obj2);
            }
            ((zzgul) obj).zzd((zzgul) obj2);
            return obj;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* synthetic */ Object zzf() {
        return zzgul.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* synthetic */ Object zzg(Object obj) {
        ((zzgul) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i10, int i11) {
        ((zzgul) obj).zzj((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i10, long j10) {
        ((zzgul) obj).zzj((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i10, Object obj2) {
        ((zzgul) obj).zzj((i10 << 3) | 3, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i10, zzgqi zzgqiVar) {
        ((zzgul) obj).zzj((i10 << 3) | 2, zzgqiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i10, long j10) {
        ((zzgul) obj).zzj(i10 << 3, Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final void zzm(Object obj) {
        ((zzgrq) obj).zzc.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgrq) obj).zzc = (zzgul) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgrq) obj).zzc = (zzgul) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final boolean zzq(zzgtl zzgtlVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguk
    public final /* synthetic */ void zzr(Object obj, zzgqy zzgqyVar) throws IOException {
        ((zzgul) obj).zzk(zzgqyVar);
    }
}
