package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfsi implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzfsj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsi(zzfsj zzfsjVar) {
        this.zzc = zzfsjVar;
        this.zza = zzfsjVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        int i10;
        if (this.zzb != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfri.zzj(z10, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfsw zzfswVar = this.zzc.zzb;
        i10 = zzfswVar.zzb;
        zzfswVar.zzb = i10 - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
