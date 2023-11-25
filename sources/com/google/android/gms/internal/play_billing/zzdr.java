package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public final class zzdr {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzeg zzc;
    private static final zzeg zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzeg zzegVar = null;
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
                zzegVar = (zzeg) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzegVar;
        zzd = new zzei();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzA(Object obj, int i10, int i11, Object obj2, zzeg zzegVar) {
        if (obj2 == null) {
            obj2 = zzegVar.zzc(obj);
        }
        zzegVar.zzf(obj2, i10, i11);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzB(zzeg zzegVar, Object obj, Object obj2) {
        zzegVar.zzh(obj, zzegVar.zze(zzegVar.zzd(obj), zzegVar.zzd(obj2)));
    }

    public static void zzC(Class cls) {
        Class cls2;
        if (!zzcb.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzD(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzc(i10, list, z10);
        }
    }

    public static void zzE(int i10, List list, zzey zzeyVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zze(i10, list);
        }
    }

    public static void zzF(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzg(i10, list, z10);
        }
    }

    public static void zzG(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzj(i10, list, z10);
        }
    }

    public static void zzH(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzl(i10, list, z10);
        }
    }

    public static void zzI(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzn(i10, list, z10);
        }
    }

    public static void zzJ(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzp(i10, list, z10);
        }
    }

    public static void zzK(int i10, List list, zzey zzeyVar, zzdp zzdpVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzbj) zzeyVar).zzq(i10, list.get(i11), zzdpVar);
            }
        }
    }

    public static void zzL(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzs(i10, list, z10);
        }
    }

    public static void zzM(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzu(i10, list, z10);
        }
    }

    public static void zzN(int i10, List list, zzey zzeyVar, zzdp zzdpVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzbj) zzeyVar).zzv(i10, list.get(i11), zzdpVar);
            }
        }
    }

    public static void zzO(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzx(i10, list, z10);
        }
    }

    public static void zzP(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzz(i10, list, z10);
        }
    }

    public static void zzQ(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzB(i10, list, z10);
        }
    }

    public static void zzR(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzD(i10, list, z10);
        }
    }

    public static void zzS(int i10, List list, zzey zzeyVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzG(i10, list);
        }
    }

    public static void zzT(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzI(i10, list, z10);
        }
    }

    public static void zzU(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzK(i10, list, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzV(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzbi.zzx(i10 << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = size * zzbi.zzx(i10 << 3);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int zzd2 = ((zzba) list.get(i11)).zzd();
            zzx += zzbi.zzx(zzd2) + zzd2;
        }
        return zzx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzbi.zzx(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzbi.zzu(zzccVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzbi.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzbi.zzx(i10 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzbi.zzx(i10 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, List list, zzdp zzdpVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzbi.zzt(i10, (zzdf) list.get(i12), zzdpVar);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzbi.zzx(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzbi.zzu(zzccVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzbi.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzm(list) + (list.size() * zzbi.zzx(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcu) {
            zzcu zzcuVar = (zzcu) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzbi.zzy(zzcuVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzbi.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(int i10, Object obj, zzdp zzdpVar) {
        if (obj instanceof zzcl) {
            int i11 = zzbi.zzb;
            int zza2 = ((zzcl) obj).zza();
            return zzbi.zzx(i10 << 3) + zzbi.zzx(zza2) + zza2;
        }
        return zzbi.zzx(i10 << 3) + zzbi.zzv((zzdf) obj, zzdpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i10, List list, zzdp zzdpVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzbi.zzx(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzcl) {
                int zza2 = ((zzcl) obj).zza();
                zzx += zzbi.zzx(zza2) + zza2;
            } else {
                zzx += zzbi.zzv((zzdf) obj, zzdpVar);
            }
        }
        return zzx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzq(list) + (size * zzbi.zzx(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzccVar.zze(i11);
                i10 += zzbi.zzx((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzbi.zzx((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzs(list) + (size * zzbi.zzx(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcu) {
            zzcu zzcuVar = (zzcu) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzcuVar.zze(i11);
                i10 += zzbi.zzy((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzbi.zzy((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof zzcn;
        int zzx = zzbi.zzx(i10 << 3) * size;
        if (z10) {
            zzcn zzcnVar = (zzcn) list;
            while (i11 < size) {
                Object zzf = zzcnVar.zzf(i11);
                if (zzf instanceof zzba) {
                    int zzd2 = ((zzba) zzf).zzd();
                    zzx += zzbi.zzx(zzd2) + zzd2;
                } else {
                    zzx += zzbi.zzw((String) zzf);
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzba) {
                    int zzd3 = ((zzba) obj).zzd();
                    zzx += zzbi.zzx(zzd3) + zzd3;
                } else {
                    zzx += zzbi.zzw((String) obj);
                }
                i11++;
            }
        }
        return zzx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzbi.zzx(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzbi.zzx(zzccVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzbi.zzx(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzbi.zzx(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcu) {
            zzcu zzcuVar = (zzcu) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzbi.zzy(zzcuVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzbi.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzeg zzy() {
        return zzc;
    }

    public static zzeg zzz() {
        return zzd;
    }
}
