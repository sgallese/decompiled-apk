package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfvq extends zzfui {
    private final transient zzfug zza;
    private final transient zzfud zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvq(zzfug zzfugVar, zzfud zzfudVar) {
        this.zza = zzfugVar;
        this.zzb = zzfudVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfty, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfui, com.google.android.gms.internal.ads.zzfty, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfty
    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfui, com.google.android.gms.internal.ads.zzfty
    public final zzfud zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfui, com.google.android.gms.internal.ads.zzfty
    /* renamed from: zze */
    public final zzfwd iterator() {
        return this.zzb.listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfty
    public final boolean zzf() {
        throw null;
    }
}
