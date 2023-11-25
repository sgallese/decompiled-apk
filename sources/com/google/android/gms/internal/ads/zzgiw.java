package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgiw extends zzgfw {
    private static final zzggu zza = zzggu.zzb(new zzggs() { // from class: com.google.android.gms.internal.ads.zzgis
        @Override // com.google.android.gms.internal.ads.zzggs
        public final Object zza(zzfzp zzfzpVar) {
            return new zzgjl((zzgir) zzfzpVar);
        }
    }, zzgir.class, zzgik.class);
    private static final zzggu zzb = zzggu.zzb(new zzggs() { // from class: com.google.android.gms.internal.ads.zzgit
        @Override // com.google.android.gms.internal.ads.zzggs
        public final Object zza(zzfzp zzfzpVar) {
            return zzgpk.zzc((zzgir) zzfzpVar);
        }
    }, zzgir.class, zzgag.class);

    public zzgiw() {
        super(zzgmf.class, new zzgiu(zzgag.class));
    }

    public static void zzh(boolean z10) throws GeneralSecurityException {
        zzgar.zze(new zzgiw(), true);
        int i10 = zzgjq.zza;
        zzgjq.zzc(zzggi.zzc());
        zzggg.zza().zze(zza);
        zzggg.zza().zze(zzb);
    }

    public static final void zzm(zzgmf zzgmfVar) throws GeneralSecurityException {
        zzgpm.zzb(zzgmfVar.zza(), 0);
        if (zzgmfVar.zzh().zzd() >= 16) {
            zzo(zzgmfVar.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgfu zzn(int i10, int i11, int i12, int i13) {
        zzgmh zzd = zzgmi.zzd();
        zzgmk zzc = zzgml.zzc();
        zzc.zzb(i12);
        zzc.zza(i11);
        zzd.zzb((zzgml) zzc.zzal());
        zzd.zza(i10);
        return new zzgfu((zzgmi) zzd.zzal(), i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(zzgml zzgmlVar) throws GeneralSecurityException {
        if (zzgmlVar.zza() >= 10) {
            int zzg = zzgmlVar.zzg() - 2;
            if (zzg != 1) {
                if (zzg != 2) {
                    if (zzg != 3) {
                        if (zzg != 4) {
                            if (zzg == 5) {
                                if (zzgmlVar.zza() > 28) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        } else if (zzgmlVar.zza() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        } else {
                            return;
                        }
                    } else if (zzgmlVar.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    } else {
                        return;
                    }
                } else if (zzgmlVar.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                } else {
                    return;
                }
            } else if (zzgmlVar.zza() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgiv(this, zzgmi.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzgmf.zzf(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzm((zzgmf) zzgtaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final int zzf() {
        return 2;
    }
}
