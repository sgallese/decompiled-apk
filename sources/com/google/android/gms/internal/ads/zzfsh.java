package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfsh extends zzfuu {
    final /* synthetic */ zzfsj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsh(zzfsj zzfsjVar) {
        this.zza = zzfsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuu, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzftc.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfsi(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuu, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfsw.zzo(this.zza.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    final Map zza() {
        return this.zza;
    }
}
