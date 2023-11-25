package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgpz implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgqi zzgqiVar = (zzgqi) obj;
        zzgqi zzgqiVar2 = (zzgqi) obj2;
        zzgqc it = zzgqiVar.iterator();
        zzgqc it2 = zzgqiVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgqiVar.zzd()).compareTo(Integer.valueOf(zzgqiVar2.zzd()));
    }
}
