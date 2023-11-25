package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzghy extends zzgfv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzghy(zzghz zzghzVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgkh zzgkhVar = (zzgkh) zzgtaVar;
        zzgkd zzc = zzgke.zzc();
        zzc.zzc(0);
        byte[] zzb = zzghf.zzb(zzgkhVar.zza());
        zzc.zza(zzgqi.zzv(zzb, 0, zzb.length));
        zzc.zzb(zzgkhVar.zzf());
        return (zzgke) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzgkh.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgkg zzc = zzgkh.zzc();
        zzc.zza(32);
        zzgkj zzc2 = zzgkk.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgkk) zzc2.zzal());
        hashMap.put("AES_CMAC", new zzgfu((zzgkh) zzc.zzal(), 1));
        zzgkg zzc3 = zzgkh.zzc();
        zzc3.zza(32);
        zzgkj zzc4 = zzgkk.zzc();
        zzc4.zza(16);
        zzc3.zzb((zzgkk) zzc4.zzal());
        hashMap.put("AES256_CMAC", new zzgfu((zzgkh) zzc3.zzal(), 1));
        zzgkg zzc5 = zzgkh.zzc();
        zzc5.zza(32);
        zzgkj zzc6 = zzgkk.zzc();
        zzc6.zza(16);
        zzc5.zzb((zzgkk) zzc6.zzal());
        hashMap.put("AES256_CMAC_RAW", new zzgfu((zzgkh) zzc5.zzal(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgkh zzgkhVar = (zzgkh) zzgtaVar;
        zzghz.zzn(zzgkhVar.zzf());
        zzghz.zzo(zzgkhVar.zza());
    }
}
