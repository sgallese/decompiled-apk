package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgeo extends zzgfv {
    final /* synthetic */ zzgep zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgeo(zzgep zzgepVar, Class cls) {
        super(cls);
        this.zza = zzgepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgof zzgofVar = (zzgof) zzgtaVar;
        zzgob zzc = zzgoc.zzc();
        zzc.zzb(0);
        byte[] zzb = zzghf.zzb(32);
        zzc.zza(zzgqi.zzv(zzb, 0, zzb.length));
        return (zzgoc) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzgof.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzgfu(zzgof.zzd(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzgfu(zzgof.zzd(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgof zzgofVar = (zzgof) zzgtaVar;
    }
}
