package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
abstract class zzguk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzd(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i10, int i11);

    abstract void zzi(Object obj, int i10, long j10);

    abstract void zzj(Object obj, int i10, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzk(Object obj, int i10, zzgqi zzgqiVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzl(Object obj, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzm(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzp(Object obj, zzgtl zzgtlVar) throws IOException {
        int zzd = zzgtlVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                zzh(obj, i10, zzgtlVar.zzf());
                                return true;
                            }
                            throw zzgsc.zza();
                        }
                        return false;
                    }
                    Object zzf = zzf();
                    int i12 = i10 << 3;
                    while (zzgtlVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzgtlVar)) {
                    }
                    if ((4 | i12) == zzgtlVar.zzd()) {
                        zzg(zzf);
                        zzj(obj, i10, zzf);
                        return true;
                    }
                    throw zzgsc.zzb();
                }
                zzk(obj, i10, zzgtlVar.zzp());
                return true;
            }
            zzi(obj, i10, zzgtlVar.zzk());
            return true;
        }
        zzl(obj, i10, zzgtlVar.zzl());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzq(zzgtl zzgtlVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzr(Object obj, zzgqy zzgqyVar) throws IOException;
}
