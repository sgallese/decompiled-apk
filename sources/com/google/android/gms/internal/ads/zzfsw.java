package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfsw extends zzfsz implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfsw(Map map) {
        zzfri.zze(map.isEmpty());
        this.zza = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzo(zzfsw zzfswVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfswVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfswVar.zzb -= size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Collection zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzb(Collection collection) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsz
    final Collection zzf() {
        return new zzfsy(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfsz
    public final Iterator zzg() {
        return new zzfsg(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzh(Object obj, List list, zzfst zzfstVar) {
        if (list instanceof RandomAccess) {
            return new zzfsp(this, obj, list, zzfstVar);
        }
        return new zzfsv(this, obj, list, zzfstVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfsz
    Map zzj() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfsn(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfsq(this, (SortedMap) map);
        }
        return new zzfsj(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfsz
    Set zzl() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfso(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfsr(this, (SortedMap) map);
        }
        return new zzfsm(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfsz, com.google.android.gms.internal.ads.zzfuz
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }
}
