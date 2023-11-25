package com.google.android.gms.internal.wearable;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzaz implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzbh zzbhVar = (zzbh) obj;
        zzbh zzbhVar2 = (zzbh) obj2;
        zzay zzayVar = new zzay(zzbhVar);
        zzay zzayVar2 = new zzay(zzbhVar2);
        while (zzayVar.hasNext() && zzayVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzayVar.zza() & 255).compareTo(Integer.valueOf(zzayVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzbhVar.zzd()).compareTo(Integer.valueOf(zzbhVar2.zzd()));
    }
}
