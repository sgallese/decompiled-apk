package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgdi extends zzgfv {
    final /* synthetic */ zzgdj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgdi(zzgdj zzgdjVar, Class cls) {
        super(cls);
        this.zza = zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzglq zzc = zzglr.zzc();
        byte[] zzb = zzghf.zzb(((zzglu) zzgtaVar).zza());
        zzc.zza(zzgqi.zzv(zzb, 0, zzb.length));
        zzc.zzb(0);
        return (zzglr) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzglu.zzf(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzgdj.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzgdj.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzgdj.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzgdj.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgpm.zza(((zzglu) zzgtaVar).zza());
    }
}
