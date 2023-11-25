package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgsv {
    public static final boolean zza(Object obj) {
        if (!((zzgsu) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzgsu zzgsuVar = (zzgsu) obj;
        zzgsu zzgsuVar2 = (zzgsu) obj2;
        if (!zzgsuVar2.isEmpty()) {
            if (!zzgsuVar.zze()) {
                zzgsuVar = zzgsuVar.zzb();
            }
            zzgsuVar.zzd(zzgsuVar2);
        }
        return zzgsuVar;
    }
}
