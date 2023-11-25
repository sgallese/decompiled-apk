package com.google.android.gms.internal.wearable;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzao extends AbstractList implements RandomAccess, Serializable {
    final long[] zza;
    final int zzb;
    final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(long[] jArr, int i10, int i11) {
        this.zza = jArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if ((obj instanceof Long) && zzap.zza(this.zza, ((Long) obj).longValue(), this.zzb, this.zzc) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzao) {
            zzao zzaoVar = (zzao) obj;
            int i10 = this.zzc - this.zzb;
            if (zzaoVar.zzc - zzaoVar.zzb != i10) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.zza[this.zzb + i11] != zzaoVar.zza[zzaoVar.zzb + i11]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzaf.zza(i10, this.zzc - this.zzb, "index");
        return Long.valueOf(this.zza[this.zzb + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.zzb; i11 < this.zzc; i11++) {
            long j10 = this.zza[i11];
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int zza;
        if ((obj instanceof Long) && (zza = zzap.zza(this.zza, ((Long) obj).longValue(), this.zzb, this.zzc)) >= 0) {
            return zza - this.zzb;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Long) {
            long[] jArr = this.zza;
            long longValue = ((Long) obj).longValue();
            int i10 = this.zzb;
            int i11 = this.zzc - 1;
            while (true) {
                if (i11 >= i10) {
                    if (jArr[i11] == longValue) {
                        break;
                    }
                    i11--;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - this.zzb;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        Long l10 = (Long) obj;
        zzaf.zza(i10, this.zzc - this.zzb, "index");
        long[] jArr = this.zza;
        int i11 = this.zzb + i10;
        long j10 = jArr[i11];
        l10.getClass();
        jArr[i11] = l10.longValue();
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        zzaf.zzb(i10, i11, this.zzc - this.zzb);
        if (i10 == i11) {
            return Collections.emptyList();
        }
        long[] jArr = this.zza;
        int i12 = this.zzb;
        return new zzao(jArr, i10 + i12, i12 + i11);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.zzc - this.zzb) * 10);
        sb2.append('[');
        sb2.append(this.zza[this.zzb]);
        int i10 = this.zzb;
        while (true) {
            i10++;
            if (i10 < this.zzc) {
                sb2.append(", ");
                sb2.append(this.zza[i10]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
