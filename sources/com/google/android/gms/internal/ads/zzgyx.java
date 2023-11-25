package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgyx extends zzgyp {
    private static final zzgzg zza = zzgyu.zza(Collections.emptyMap());

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgyx(Map map, zzgyv zzgyvVar) {
        super(map);
    }

    public static zzgyw zzc(int i10) {
        return new zzgyw(i10, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zzd  reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzb = zzgyq.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzgzg) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
