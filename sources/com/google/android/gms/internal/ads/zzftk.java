package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzftk extends zzfsx {
    final /* synthetic */ zzftm zza;
    private final Object zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftk(zzftm zzftmVar, int i10) {
        this.zza = zzftmVar;
        Object[] objArr = zzftmVar.zzb;
        objArr.getClass();
        this.zzb = objArr[i10];
        this.zzc = i10;
    }

    private final void zza() {
        int zzq;
        int i10 = this.zzc;
        if (i10 != -1 && i10 < this.zza.size()) {
            Object obj = this.zzb;
            zzftm zzftmVar = this.zza;
            int i11 = this.zzc;
            Object[] objArr = zzftmVar.zzb;
            objArr.getClass();
            if (zzfrd.zza(obj, objArr[i11])) {
                return;
            }
        }
        zzq = this.zza.zzq(this.zzb);
        this.zzc = zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, java.util.Map.Entry
    public final Object getValue() {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = this.zza.zzc;
        objArr.getClass();
        return objArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object[] objArr = this.zza.zzc;
        objArr.getClass();
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
