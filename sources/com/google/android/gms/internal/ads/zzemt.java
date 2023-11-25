package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzemt implements zzesj {
    private final Set zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemt(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzfye.zzh(new zzesi() { // from class: com.google.android.gms.internal.ads.zzems
            @Override // com.google.android.gms.internal.ads.zzesi
            public final void zzj(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
