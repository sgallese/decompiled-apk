package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzgyo {
    final LinkedHashMap zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgyo(int i10) {
        this.zza = zzgyq.zzb(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgyo zza(Object obj, zzgzg zzgzgVar) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgzb.zza(obj, "key");
        zzgzb.zza(zzgzgVar, "provider");
        linkedHashMap.put(obj, zzgzgVar);
        return this;
    }
}
