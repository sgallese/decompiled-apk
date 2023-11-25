package com.google.android.gms.internal.wearable;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzet implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzeu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzet(zzeu zzeuVar) {
        zzcv zzcvVar;
        this.zzb = zzeuVar;
        zzcvVar = zzeuVar.zza;
        this.zza = zzcvVar.iterator();
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
