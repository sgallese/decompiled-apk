package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzguo implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzgup zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzguo(zzgup zzgupVar) {
        zzgsi zzgsiVar;
        this.zzb = zzgupVar;
        zzgsiVar = zzgupVar.zza;
        this.zza = zzgsiVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
