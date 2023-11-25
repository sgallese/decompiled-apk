package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzea {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzep zzc;
    private static final zzep zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzep zzepVar = null;
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
                zzepVar = (zzep) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzepVar;
        zzd = new zzer();
    }

    public static void zzA(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzz(i10, list, z10);
        }
    }

    public static void zzB(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzB(i10, list, z10);
        }
    }

    public static void zzC(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzD(i10, list, z10);
        }
    }

    public static void zzD(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzI(i10, list, z10);
        }
    }

    public static void zzE(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzK(i10, list, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzF(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzbp.zzu(zzchVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzbp.zzu(((Integer) list.get(i11)).intValue());
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
        return size * (zzbp.zzx(i10 << 3) + 4);
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
        return size * (zzbp.zzx(i10 << 3) + 8);
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
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzbp.zzu(zzchVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzbp.zzu(((Integer) list.get(i11)).intValue());
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
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzbp.zzy(zzdcVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzbp.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i10, Object obj, zzdy zzdyVar) {
        if (obj instanceof zzct) {
            int i11 = zzbp.zzb;
            int zza2 = ((zzct) obj).zza();
            return zzbp.zzx(i10 << 3) + zzbp.zzx(zza2) + zza2;
        }
        return zzbp.zzx(i10 << 3) + zzbp.zzv((zzdn) obj, zzdyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzchVar.zze(i11);
                i10 += zzbp.zzx((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzbp.zzx((intValue >> 31) ^ (intValue + intValue));
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
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzdcVar.zze(i11);
                i10 += zzbp.zzy((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzbp.zzy((longValue >> 63) ^ (longValue + longValue));
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
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzbp.zzx(zzchVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzbp.zzx(((Integer) list.get(i11)).intValue());
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
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzbp.zzy(zzdcVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzbp.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzep zzm() {
        return zzc;
    }

    public static zzep zzn() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzo(Object obj, int i10, int i11, Object obj2, zzep zzepVar) {
        if (obj2 == null) {
            obj2 = zzepVar.zzc(obj);
        }
        zzepVar.zzf(obj2, i10, i11);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzp(zzep zzepVar, Object obj, Object obj2) {
        zzepVar.zzh(obj, zzepVar.zze(zzepVar.zzd(obj), zzepVar.zzd(obj2)));
    }

    public static void zzq(Class cls) {
        Class cls2;
        if (!zzcg.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzr(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzc(i10, list, z10);
        }
    }

    public static void zzs(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzg(i10, list, z10);
        }
    }

    public static void zzt(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzj(i10, list, z10);
        }
    }

    public static void zzu(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzl(i10, list, z10);
        }
    }

    public static void zzv(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzn(i10, list, z10);
        }
    }

    public static void zzw(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzp(i10, list, z10);
        }
    }

    public static void zzx(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzs(i10, list, z10);
        }
    }

    public static void zzy(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzu(i10, list, z10);
        }
    }

    public static void zzz(int i10, List list, zzfh zzfhVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfhVar.zzx(i10, list, z10);
        }
    }
}
