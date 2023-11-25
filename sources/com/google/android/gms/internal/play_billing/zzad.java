package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
final class zzad extends zzy {
    private final transient zzx zza;
    private final transient zzu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(zzx zzxVar, zzu zzuVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr
    public final zzu zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr
    /* renamed from: zze */
    public final zzah iterator() {
        return this.zzb.listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzr
    public final boolean zzf() {
        throw null;
    }
}
