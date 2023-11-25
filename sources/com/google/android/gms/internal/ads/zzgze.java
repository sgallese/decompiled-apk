package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgze implements zzgyt {
    private static final zzgyt zza = zzgyu.zza(Collections.emptySet());
    private final List zzb;
    private final List zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgze(List list, List list2, zzgzc zzgzcVar) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static zzgzd zza(int i10, int i11) {
        return new zzgzd(i10, i11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zzc  reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.zzb.size();
        ArrayList arrayList = new ArrayList(this.zzc.size());
        int size2 = this.zzc.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((zzgzg) this.zzc.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza2 = zzgyq.zza(size);
        int size3 = this.zzb.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object zzb = ((zzgzg) this.zzb.get(i11)).zzb();
            zzb.getClass();
            zza2.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                obj.getClass();
                zza2.add(obj);
            }
        }
        return Collections.unmodifiableSet(zza2);
    }
}
