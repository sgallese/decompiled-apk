package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgtq implements Iterator {
    private final ArrayDeque zza;
    private zzgqd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgtq(zzgqi zzgqiVar, zzgtp zzgtpVar) {
        zzgqi zzgqiVar2;
        if (zzgqiVar instanceof zzgts) {
            zzgts zzgtsVar = (zzgts) zzgqiVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzgtsVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgtsVar);
            zzgqiVar2 = zzgtsVar.zzd;
            this.zzb = zzb(zzgqiVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzgqd) zzgqiVar;
    }

    private final zzgqd zzb(zzgqi zzgqiVar) {
        while (zzgqiVar instanceof zzgts) {
            zzgts zzgtsVar = (zzgts) zzgqiVar;
            this.zza.push(zzgtsVar);
            zzgqiVar = zzgtsVar.zzd;
        }
        return (zzgqd) zzgqiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzgqd next() {
        zzgqd zzgqdVar;
        zzgqi zzgqiVar;
        zzgqd zzgqdVar2 = this.zzb;
        if (zzgqdVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgqdVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgqiVar = ((zzgts) this.zza.pop()).zze;
            zzgqdVar = zzb(zzgqiVar);
        } while (zzgqdVar.zzd() == 0);
        this.zzb = zzgqdVar;
        return zzgqdVar2;
    }
}
