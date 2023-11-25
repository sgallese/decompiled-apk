package com.google.android.gms.internal.wearable;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzal extends AbstractList implements RandomAccess, Serializable {
    final float[] zza;
    final int zzb;
    final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(float[] fArr, int i10, int i11) {
        this.zza = fArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if ((obj instanceof Float) && zzam.zza(this.zza, ((Float) obj).floatValue(), this.zzb, this.zzc) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            int i10 = this.zzc - this.zzb;
            if (zzalVar.zzc - zzalVar.zzb != i10) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.zza[this.zzb + i11] != zzalVar.zza[zzalVar.zzb + i11]) {
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
        return Float.valueOf(this.zza[this.zzb + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.zzb; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + Float.valueOf(this.zza[i11]).hashCode();
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int zza;
        if ((obj instanceof Float) && (zza = zzam.zza(this.zza, ((Float) obj).floatValue(), this.zzb, this.zzc)) >= 0) {
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
        if (obj instanceof Float) {
            float[] fArr = this.zza;
            float floatValue = ((Float) obj).floatValue();
            int i10 = this.zzb;
            int i11 = this.zzc - 1;
            while (true) {
                if (i11 >= i10) {
                    if (fArr[i11] == floatValue) {
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
        Float f10 = (Float) obj;
        zzaf.zza(i10, this.zzc - this.zzb, "index");
        float[] fArr = this.zza;
        int i11 = this.zzb + i10;
        float f11 = fArr[i11];
        f10.getClass();
        fArr[i11] = f10.floatValue();
        return Float.valueOf(f11);
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
        float[] fArr = this.zza;
        int i12 = this.zzb;
        return new zzal(fArr, i10 + i12, i12 + i11);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.zzc - this.zzb) * 12);
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
