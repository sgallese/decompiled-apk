package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzavq implements Comparator {
    public zzavq(zzavr zzavrVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzavf zzavfVar = (zzavf) obj;
        zzavf zzavfVar2 = (zzavf) obj2;
        if (zzavfVar.zzd() < zzavfVar2.zzd()) {
            return -1;
        }
        if (zzavfVar.zzd() <= zzavfVar2.zzd()) {
            if (zzavfVar.zzb() < zzavfVar2.zzb()) {
                return -1;
            }
            if (zzavfVar.zzb() <= zzavfVar2.zzb()) {
                float zza = (zzavfVar.zza() - zzavfVar.zzd()) * (zzavfVar.zzc() - zzavfVar.zzb());
                float zza2 = (zzavfVar2.zza() - zzavfVar2.zzd()) * (zzavfVar2.zzc() - zzavfVar2.zzb());
                if (zza > zza2) {
                    return -1;
                }
                if (zza >= zza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
