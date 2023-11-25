package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfui extends zzfty implements Set {
    private transient zzfud zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i10) {
        boolean z10;
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfri.zzf(z10, "collection too large");
        return 1073741824;
    }

    public static zzfuh zzj(int i10) {
        return new zzfuh(i10);
    }

    public static zzfui zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzs(array.length, array);
    }

    public static zzfui zzm() {
        return zzfvt.zza;
    }

    public static zzfui zzn(Object obj) {
        return new zzfwa(obj);
    }

    public static zzfui zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzs(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfui zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzs(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfui zzs(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int zzh = zzh(i10);
                Object[] objArr2 = new Object[zzh];
                int i11 = zzh - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    zzfvl.zza(obj, i14);
                    int hashCode = obj.hashCode();
                    int zza = zzftv.zza(hashCode);
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
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zzfwa(obj3);
                }
                if (zzh(i13) < zzh / 2) {
                    return zzs(i13, objArr);
                }
                if (zzt(i13, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new zzfvt(objArr, i12, objArr2, i11, i13);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzfwa(obj4);
        }
        return zzfvt.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(int i10, int i11) {
        if (i10 < (i11 >> 1) + (i11 >> 2)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfui) && zzr() && ((zzfui) obj).zzr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzfvz.zzc(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfvz.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    public zzfud zzd() {
        zzfud zzfudVar = this.zza;
        if (zzfudVar == null) {
            zzfud zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return zzfudVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfty, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzfwd iterator();

    zzfud zzi() {
        Object[] array = toArray();
        int i10 = zzfud.zzd;
        return zzfud.zzi(array, array.length);
    }

    boolean zzr() {
        return false;
    }
}
