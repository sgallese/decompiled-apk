package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzftm extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzftm() {
        zzm(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzh(zzftm zzftmVar) {
        Object obj = zzftmVar.zze;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzp() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzq(Object obj) {
        if (zzo()) {
            return -1;
        }
        int zzb = zzftv.zzb(obj);
        int zzp = zzp();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzc = zzftn.zzc(obj2, zzb & zzp);
        if (zzc != 0) {
            int i10 = ~zzp;
            int i11 = zzb & i10;
            do {
                int i12 = zzc - 1;
                int[] iArr = this.zza;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.zzb;
                    objArr.getClass();
                    if (zzfrd.zza(obj, objArr[i12])) {
                        return i12;
                    }
                }
                zzc = i13 & zzp;
            } while (zzc != 0);
        }
        return -1;
    }

    private final int zzr(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object zzd2 = zzftn.zzd(i11);
        if (i13 != 0) {
            zzftn.zze(zzd2, i12 & i14, i13 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int zzc = zzftn.zzc(obj, i15);
            while (zzc != 0) {
                int i16 = zzc - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int zzc2 = zzftn.zzc(zzd2, i19);
                zzftn.zze(zzd2, i19, zzc);
                iArr[i16] = ((~i14) & i18) | (zzc2 & i14);
                zzc = i17 & i10;
            }
        }
        this.zze = zzd2;
        zzt(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzs(Object obj) {
        if (zzo()) {
            return zzd;
        }
        int zzp = zzp();
        Object obj2 = this.zze;
        obj2.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        int zzb = zzftn.zzb(obj, null, zzp, obj2, iArr, objArr, null);
        if (zzb == -1) {
            return zzd;
        }
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        Object obj3 = objArr2[zzb];
        zzn(zzb, zzp);
        this.zzg--;
        zzl();
        return obj3;
    }

    private final void zzt(int i10) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzo()) {
            return;
        }
        zzl();
        Map zzj = zzj();
        if (zzj == null) {
            Object[] objArr = this.zzb;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.zzg, (Object) null);
            Object[] objArr2 = this.zzc;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.zzg, (Object) null);
            Object obj = this.zze;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.zza;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.zzg, 0);
            this.zzg = 0;
            return;
        }
        this.zzf = zzfwl.zzb(size(), 3, 1073741823);
        zzj.clear();
        this.zze = null;
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.containsKey(obj);
        }
        if (zzq(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzj = zzj();
        if (zzj == null) {
            for (int i10 = 0; i10 < this.zzg; i10++) {
                Object[] objArr = this.zzc;
                objArr.getClass();
                if (zzfrd.zza(obj, objArr[i10])) {
                    return true;
                }
            }
            return false;
        }
        return zzj.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            zzftg zzftgVar = new zzftg(this);
            this.zzi = zzftgVar;
            return zzftgVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.get(obj);
        }
        int zzq = zzq(obj);
        if (zzq == -1) {
            return null;
        }
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr[zzq];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            zzftj zzftjVar = new zzftj(this);
            this.zzh = zzftjVar;
            return zzftjVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzo()) {
            zzfri.zzj(zzo(), "Arrays already allocated");
            int i10 = this.zzf;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzftn.zzd(max2);
            zzt(max2 - 1);
            this.zza = new int[i10];
            this.zzb = new Object[i10];
            this.zzc = new Object[i10];
        }
        Map zzj = zzj();
        if (zzj == null) {
            int[] iArr = this.zza;
            iArr.getClass();
            Object[] objArr = this.zzb;
            objArr.getClass();
            Object[] objArr2 = this.zzc;
            objArr2.getClass();
            int i11 = this.zzg;
            int i12 = i11 + 1;
            int zzb = zzftv.zzb(obj);
            int zzp = zzp();
            int i13 = zzb & zzp;
            Object obj3 = this.zze;
            obj3.getClass();
            int zzc = zzftn.zzc(obj3, i13);
            if (zzc == 0) {
                if (i12 > zzp) {
                    zzp = zzr(zzp, zzftn.zza(zzp), zzb, i11);
                } else {
                    Object obj4 = this.zze;
                    obj4.getClass();
                    zzftn.zze(obj4, i13, i12);
                }
            } else {
                int i14 = ~zzp;
                int i15 = zzb & i14;
                int i16 = 0;
                while (true) {
                    int i17 = zzc - 1;
                    int i18 = iArr[i17];
                    int i19 = i18 & i14;
                    if (i19 == i15 && zzfrd.zza(obj, objArr[i17])) {
                        Object obj5 = objArr2[i17];
                        objArr2[i17] = obj2;
                        return obj5;
                    }
                    int i20 = i18 & zzp;
                    i16++;
                    if (i20 == 0) {
                        if (i16 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(zzp() + 1, 1.0f);
                            int zze = zze();
                            while (zze >= 0) {
                                Object[] objArr3 = this.zzb;
                                objArr3.getClass();
                                Object obj6 = objArr3[zze];
                                Object[] objArr4 = this.zzc;
                                objArr4.getClass();
                                linkedHashMap.put(obj6, objArr4[zze]);
                                zze = zzf(zze);
                            }
                            this.zze = linkedHashMap;
                            this.zza = null;
                            this.zzb = null;
                            this.zzc = null;
                            zzl();
                            return linkedHashMap.put(obj, obj2);
                        } else if (i12 > zzp) {
                            zzp = zzr(zzp, zzftn.zza(zzp), zzb, i11);
                        } else {
                            iArr[i17] = (i12 & zzp) | i19;
                        }
                    } else {
                        zzc = i20;
                    }
                }
            }
            int[] iArr2 = this.zza;
            iArr2.getClass();
            int length = iArr2.length;
            if (i12 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                int[] iArr3 = this.zza;
                iArr3.getClass();
                this.zza = Arrays.copyOf(iArr3, min);
                Object[] objArr5 = this.zzb;
                objArr5.getClass();
                this.zzb = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.zzc;
                objArr6.getClass();
                this.zzc = Arrays.copyOf(objArr6, min);
            }
            int i21 = (~zzp) & zzb;
            int[] iArr4 = this.zza;
            iArr4.getClass();
            iArr4[i11] = i21;
            Object[] objArr7 = this.zzb;
            objArr7.getClass();
            objArr7[i11] = obj;
            Object[] objArr8 = this.zzc;
            objArr8.getClass();
            objArr8[i11] = obj2;
            this.zzg = i12;
            zzl();
            return null;
        }
        return zzj.put(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.remove(obj);
        }
        Object zzs = zzs(obj);
        if (zzs == zzd) {
            return null;
        }
        return zzs;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.size();
        }
        return this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            zzftl zzftlVar = new zzftl(this);
            this.zzj = zzftlVar;
            return zzftlVar;
        }
        return collection;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzf(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.zzg) {
            return i11;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzj() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzl() {
        this.zzf += 32;
    }

    final void zzm(int i10) {
        this.zzf = zzfwl.zzb(8, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzn(int i10, int i11) {
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        int size = size() - 1;
        if (i10 < size) {
            Object obj2 = objArr[size];
            objArr[i10] = obj2;
            objArr2[i10] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            iArr[i10] = iArr[size];
            iArr[size] = 0;
            int zzb = zzftv.zzb(obj2) & i11;
            int zzc = zzftn.zzc(obj, zzb);
            int i12 = size + 1;
            if (zzc == i12) {
                zzftn.zze(obj, zzb, i10 + 1);
                return;
            }
            while (true) {
                int i13 = zzc - 1;
                int i14 = iArr[i13];
                int i15 = i14 & i11;
                if (i15 != i12) {
                    zzc = i15;
                } else {
                    iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                    return;
                }
            }
        } else {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzo() {
        if (this.zze == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftm(int i10) {
        zzm(8);
    }
}
