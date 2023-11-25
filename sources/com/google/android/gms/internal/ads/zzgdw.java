package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgdw extends zzgfv {
    final /* synthetic */ zzgdx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgdw(zzgdx zzgdxVar, Class cls) {
        super(cls);
        this.zza = zzgdxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgma zzgmaVar = (zzgma) zzgtaVar;
        zzglw zzc = zzglx.zzc();
        zzc.zzb(0);
        byte[] zzb = zzghf.zzb(32);
        zzc.zza(zzgqi.zzv(zzb, 0, zzb.length));
        return (zzglx) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzgma.zzd(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzgfu(zzgma.zzc(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzgfu(zzgma.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgma zzgmaVar = (zzgma) zzgtaVar;
    }
}
