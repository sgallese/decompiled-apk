package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzftg extends AbstractSet {
    final /* synthetic */ zzftm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftg(zzftm zzftmVar) {
        this.zza = zzftmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzq;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzq = this.zza.zzq(entry.getKey());
            if (zzq != -1) {
                Object[] objArr = this.zza.zzc;
                objArr.getClass();
                if (zzfrd.zza(objArr[zzq], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzftm zzftmVar = this.zza;
        Map zzj = zzftmVar.zzj();
        if (zzj != null) {
            return zzj.entrySet().iterator();
        }
        return new zzfte(zzftmVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzp;
        int i10;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzftm zzftmVar = this.zza;
        if (!zzftmVar.zzo()) {
            zzp = zzftmVar.zzp();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object zzh = zzftm.zzh(this.zza);
            zzftm zzftmVar2 = this.zza;
            int[] iArr = zzftmVar2.zza;
            iArr.getClass();
            Object[] objArr = zzftmVar2.zzb;
            objArr.getClass();
            Object[] objArr2 = zzftmVar2.zzc;
            objArr2.getClass();
            int zzb = zzftn.zzb(key, value, zzp, zzh, iArr, objArr, objArr2);
            if (zzb == -1) {
                return false;
            }
            this.zza.zzn(zzb, zzp);
            zzftm zzftmVar3 = this.zza;
            i10 = zzftmVar3.zzg;
            zzftmVar3.zzg = i10 - 1;
            this.zza.zzl();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
