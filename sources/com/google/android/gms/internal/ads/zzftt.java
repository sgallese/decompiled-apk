package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzftt extends zzftu implements Map {
    @Override // java.util.Map
    public final void clear() {
        zzb().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return zzb().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return zzb().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return zzb().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && !zzb().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return zzb().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzb().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return zzb().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return zzb().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zzb().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return zzb().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return zzb().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return zzb().values();
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    protected /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    protected abstract Map zzb();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzc() {
        return zzfvz.zza(entrySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r1.hasNext() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r5.equals(r1.next()) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000f, code lost:
    
        if (r5 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1.hasNext() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r1.next() != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.android.gms.internal.ads.zzfut r1 = new com.google.android.gms.internal.ads.zzfut
            r1.<init>(r0)
            r0 = 1
            r2 = 0
            if (r5 != 0) goto L20
        L11:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L1e
            java.lang.Object r5 = r1.next()
            if (r5 != 0) goto L11
            goto L30
        L1e:
            r0 = 0
            goto L30
        L20:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1e
            java.lang.Object r3 = r1.next()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L20
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftt.zzd(java.lang.Object):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zze(Object obj) {
        return zzfuy.zzb(this, obj);
    }
}
