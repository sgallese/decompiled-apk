package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfvo extends zzfud {
    final /* synthetic */ zzfvp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvo(zzfvp zzfvpVar) {
        this.zza = zzfvpVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.zza.zzc;
        zzfri.zza(i10, i11, "index");
        zzfvp zzfvpVar = this.zza;
        objArr = zzfvpVar.zzb;
        int i12 = i10 + i10;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = zzfvpVar.zzb;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.zza.zzc;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    public final boolean zzf() {
        return true;
    }
}
