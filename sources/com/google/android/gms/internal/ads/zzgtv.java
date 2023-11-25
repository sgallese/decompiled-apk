package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgtv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzguk zzc;
    private static final zzguk zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzguk zzgukVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzgukVar = (zzguk) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzgukVar;
        zzd = new zzgum();
    }

    public static void zzA(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzu(i10, list, z10);
        }
    }

    public static void zzB(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzx(i10, list, z10);
        }
    }

    public static void zzC(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzz(i10, list, z10);
        }
    }

    public static void zzD(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzB(i10, list, z10);
        }
    }

    public static void zzE(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzD(i10, list, z10);
        }
    }

    public static void zzF(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzI(i10, list, z10);
        }
    }

    public static void zzG(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzK(i10, list, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgqx.zzx(zzgrrVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgqx.zzx(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgqx.zzA(i10 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgqx.zzA(i10 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgqx.zzx(zzgrrVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgqx.zzx(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsp) {
            zzgsp zzgspVar = (zzgsp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgqx.zzB(zzgspVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgqx.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i10, Object obj, zzgtt zzgttVar) {
        if (obj instanceof zzgsg) {
            int i11 = zzgqx.zzf;
            int zza2 = ((zzgsg) obj).zza();
            return zzgqx.zzA(i10 << 3) + zzgqx.zzA(zza2) + zza2;
        }
        return zzgqx.zzA(i10 << 3) + zzgqx.zzy((zzgta) obj, zzgttVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzgrrVar.zze(i11);
                i10 += zzgqx.zzA((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzgqx.zzA((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsp) {
            zzgsp zzgspVar = (zzgsp) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzgspVar.zze(i11);
                i10 += zzgqx.zzB((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzgqx.zzB((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgqx.zzA(zzgrrVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgqx.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsp) {
            zzgsp zzgspVar = (zzgsp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgqx.zzB(zzgspVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgqx.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzguk zzm() {
        return zzc;
    }

    public static zzguk zzn() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzo(Object obj, int i10, List list, zzgru zzgruVar, Object obj2, zzguk zzgukVar) {
        if (zzgruVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzgruVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzp(obj, i10, intValue, obj2, zzgukVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgruVar.zza(intValue2)) {
                    obj2 = zzp(obj, i10, intValue2, obj2, zzgukVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzp(Object obj, int i10, int i11, Object obj2, zzguk zzgukVar) {
        if (obj2 == null) {
            obj2 = zzgukVar.zzc(obj);
        }
        zzgukVar.zzl(obj2, i10, i11);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzq(zzguk zzgukVar, Object obj, Object obj2) {
        zzgukVar.zzo(obj, zzgukVar.zze(zzgukVar.zzd(obj), zzgukVar.zzd(obj2)));
    }

    public static void zzr(Class cls) {
        Class cls2;
        if (!zzgrq.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzs(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void zzt(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzc(i10, list, z10);
        }
    }

    public static void zzu(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzg(i10, list, z10);
        }
    }

    public static void zzv(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzj(i10, list, z10);
        }
    }

    public static void zzw(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzl(i10, list, z10);
        }
    }

    public static void zzx(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzn(i10, list, z10);
        }
    }

    public static void zzy(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzp(i10, list, z10);
        }
    }

    public static void zzz(int i10, List list, zzgqy zzgqyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqyVar.zzs(i10, list, z10);
        }
    }
}
