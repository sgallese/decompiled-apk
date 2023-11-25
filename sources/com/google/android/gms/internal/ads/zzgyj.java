package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgyj implements Iterator {
    int zza = 0;
    final /* synthetic */ zzgyk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgyj(zzgyk zzgykVar) {
        this.zzb = zzgykVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza >= this.zzb.zza.size() && !this.zzb.zzb.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            List list = this.zzb.zza;
            int i10 = this.zza;
            this.zza = i10 + 1;
            return list.get(i10);
        }
        zzgyk zzgykVar = this.zzb;
        zzgykVar.zza.add(zzgykVar.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
