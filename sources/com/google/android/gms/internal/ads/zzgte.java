package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgte implements zzgtt {
    private final zzgta zza;
    private final zzguk zzb;
    private final boolean zzc;
    private final zzgrd zzd;

    private zzgte(zzguk zzgukVar, zzgrd zzgrdVar, zzgta zzgtaVar) {
        this.zzb = zzgukVar;
        this.zzc = zzgrdVar.zzh(zzgtaVar);
        this.zzd = zzgrdVar;
        this.zza = zzgtaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgte zzc(zzguk zzgukVar, zzgrd zzgrdVar, zzgta zzgtaVar) {
        return new zzgte(zzgukVar, zzgrdVar, zzgtaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final int zza(Object obj) {
        zzguk zzgukVar = this.zzb;
        int zzb = zzgukVar.zzb(zzgukVar.zzd(obj));
        if (!this.zzc) {
            return zzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final Object zze() {
        zzgta zzgtaVar = this.zza;
        if (zzgtaVar instanceof zzgrq) {
            return ((zzgrq) zzgtaVar).zzaD();
        }
        return zzgtaVar.zzaP().zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzg(Object obj, Object obj2) {
        zzgtv.zzq(this.zzb, obj, obj2);
        if (!this.zzc) {
            return;
        }
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzh(Object obj, zzgtl zzgtlVar, zzgrc zzgrcVar) throws IOException {
        boolean zzO;
        zzguk zzgukVar = this.zzb;
        zzgrd zzgrdVar = this.zzd;
        Object zzc = zzgukVar.zzc(obj);
        zzgrh zzb = zzgrdVar.zzb(obj);
        while (zzgtlVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzgtlVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzgrdVar.zzc(zzgrcVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzgrdVar.zzf(zzgtlVar, zzc2, zzgrcVar, zzb);
                        } else {
                            zzO = zzgukVar.zzp(zzc, zzgtlVar);
                        }
                    } else {
                        zzO = zzgtlVar.zzO();
                    }
                    if (!zzO) {
                        return;
                    }
                } else {
                    Object obj2 = null;
                    zzgqi zzgqiVar = null;
                    int i10 = 0;
                    while (zzgtlVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzgtlVar.zzd();
                        if (zzd2 == 16) {
                            i10 = zzgtlVar.zzj();
                            obj2 = zzgrdVar.zzc(zzgrcVar, this.zza, i10);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzgrdVar.zzf(zzgtlVar, obj2, zzgrcVar, zzb);
                            } else {
                                zzgqiVar = zzgtlVar.zzp();
                            }
                        } else if (!zzgtlVar.zzO()) {
                            break;
                        }
                    }
                    if (zzgtlVar.zzd() == 12) {
                        if (zzgqiVar != null) {
                            if (obj2 != null) {
                                zzgrdVar.zzg(zzgqiVar, obj2, zzgrcVar, zzb);
                            } else {
                                zzgukVar.zzk(zzc, i10, zzgqiVar);
                            }
                        }
                    } else {
                        throw zzgsc.zzb();
                    }
                }
            } finally {
                zzgukVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgpu zzgpuVar) throws IOException {
        zzgrq zzgrqVar = (zzgrq) obj;
        if (zzgrqVar.zzc == zzgul.zzc()) {
            zzgrqVar.zzc = zzgul.zzf();
        }
        zzgrn zzgrnVar = (zzgrn) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzm(Object obj, zzgqy zzgqyVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
