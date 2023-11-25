package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgca extends zzgfv {
    final /* synthetic */ zzgcb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgca(zzgcb zzgcbVar, Class cls) {
        super(cls);
        this.zza = zzgcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzglf zzglfVar = (zzglf) zzgtaVar;
        zzglb zzc = zzglc.zzc();
        byte[] zzb = zzghf.zzb(zzglfVar.zza());
        zzc.zza(zzgqi.zzv(zzb, 0, zzb.length));
        zzc.zzb(zzglfVar.zzf());
        zzc.zzc(0);
        return (zzglc) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzglf.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzgcb.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzgcb.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzgcb.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzgcb.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzglf zzglfVar = (zzglf) zzgtaVar;
        zzgpm.zza(zzglfVar.zza());
        if (zzglfVar.zzf().zza() != 12 && zzglfVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
