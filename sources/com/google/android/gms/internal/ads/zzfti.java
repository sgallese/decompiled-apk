package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
abstract class zzfti implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzftm zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfti(zzftm zzftmVar, zzfth zzfthVar) {
        int i10;
        this.zze = zzftmVar;
        i10 = zzftmVar.zzf;
        this.zzb = i10;
        this.zzc = zzftmVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i10;
        i10 = this.zze.zzf;
        if (i10 == this.zzb) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzc >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i10 = this.zzc;
            this.zzd = i10;
            Object zza = zza(i10);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        zzb();
        if (this.zzd >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfri.zzj(z10, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzftm zzftmVar = this.zze;
        int i10 = this.zzd;
        Object[] objArr = zzftmVar.zzb;
        objArr.getClass();
        zzftmVar.remove(objArr[i10]);
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i10);
}
