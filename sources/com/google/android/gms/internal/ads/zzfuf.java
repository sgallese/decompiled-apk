package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfuf {
    Object[] zza;
    int zzb;
    zzfue zzc;

    public zzfuf() {
        this(4);
    }

    private final void zzd(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzftx.zze(length, i11));
        }
    }

    public final zzfuf zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfta.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfuf zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfug zzc() {
        zzfue zzfueVar = this.zzc;
        if (zzfueVar == null) {
            zzfvs zzj = zzfvs.zzj(this.zzb, this.zza, this);
            zzfue zzfueVar2 = this.zzc;
            if (zzfueVar2 == null) {
                return zzj;
            }
            throw zzfueVar2.zza();
        }
        throw zzfueVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuf(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }
}
