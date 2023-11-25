package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzau extends zzaq implements Set {
    private transient zzat zza;

    static int zzf(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    public static zzau zzi(Object obj, Object obj2) {
        return zzk(2, obj, obj2);
    }

    private static zzau zzk(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int zzf = zzf(i10);
                Object[] objArr2 = new Object[zzf];
                int i11 = zzf - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int zza = zzap.zza(hashCode);
                        while (true) {
                            int i15 = zza & i11;
                            Object obj2 = objArr2[i15];
                            if (obj2 == null) {
                                objArr[i13] = obj;
                                objArr2[i15] = obj;
                                i12 += hashCode;
                                i13++;
                                break;
                            } else if (!obj2.equals(obj)) {
                                zza++;
                            }
                        }
                    } else {
                        throw new NullPointerException("at index " + i14);
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zzay(obj3);
                }
                if (zzf(i13) >= zzf / 2) {
                    if (i13 <= 0) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new zzax(objArr, i12, objArr2, i11, i13);
                }
                return zzk(i13, objArr);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzay(obj4);
        }
        return zzax.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzau) && zzj() && ((zzau) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i10;
        int i11 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.fido.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzaz iterator();

    public final zzat zzg() {
        zzat zzatVar = this.zza;
        if (zzatVar == null) {
            zzat zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzatVar;
    }

    zzat zzh() {
        Object[] array = toArray();
        int i10 = zzat.zzd;
        return zzat.zzg(array, array.length);
    }

    boolean zzj() {
        return false;
    }
}
