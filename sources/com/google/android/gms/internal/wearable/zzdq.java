package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzdq<T> implements zzdy<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzez.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzdn zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdb zzl;
    private final zzep zzm;
    private final zzbv zzn;
    private final zzds zzo;
    private final zzdi zzp;

    private zzdq(int[] iArr, Object[] objArr, int i10, int i11, zzdn zzdnVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzds zzdsVar, zzdb zzdbVar, zzep zzepVar, zzbv zzbvVar, zzdi zzdiVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        boolean z11 = false;
        if (zzbvVar != null && zzbvVar.zzc(zzdnVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i13;
        this.zzk = i14;
        this.zzo = zzdsVar;
        this.zzl = zzdbVar;
        this.zzm = zzepVar;
        this.zzn = zzbvVar;
        this.zzg = zzdnVar;
        this.zzp = zzdiVar;
    }

    private static void zzA(Object obj) {
        if (zzL(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzB(Object obj, Object obj2, int i10) {
        if (!zzI(obj2, i10)) {
            return;
        }
        int zzs = zzs(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzs;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzdy zzv = zzv(i10);
            if (!zzI(obj, i10)) {
                if (!zzL(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                }
                zzD(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzC(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (!zzM(obj2, i11, i10)) {
            return;
        }
        int zzs = zzs(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzs;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzdy zzv = zzv(i10);
            if (!zzM(obj, i11, i10)) {
                if (!zzL(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                }
                zzE(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzD(Object obj, int i10) {
        int zzp = zzp(i10);
        long j10 = 1048575 & zzp;
        if (j10 == 1048575) {
            return;
        }
        zzez.zzq(obj, j10, (1 << (zzp >>> 20)) | zzez.zzc(obj, j10));
    }

    private final void zzE(Object obj, int i10, int i11) {
        zzez.zzq(obj, zzp(i11) & 1048575, i10);
    }

    private final void zzF(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzs(i10) & 1048575, obj2);
        zzD(obj, i10);
    }

    private final void zzG(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzs(i11) & 1048575, obj2);
        zzE(obj, i10, i11);
    }

    private final boolean zzH(Object obj, Object obj2, int i10) {
        if (zzI(obj, i10) == zzI(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean zzI(Object obj, int i10) {
        int zzp = zzp(i10);
        long j10 = zzp & 1048575;
        if (j10 == 1048575) {
            int zzs = zzs(i10);
            long j11 = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzez.zza(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzez.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzez.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzez.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzez.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzez.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzez.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzez.zzw(obj, j11);
                case 8:
                    Object zzf = zzez.zzf(obj, j11);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzbh) {
                        if (zzbh.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzez.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzbh.zzb.equals(zzez.zzf(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzez.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzez.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzez.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzez.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzez.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzez.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzez.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzez.zzc(obj, j10) & (1 << (zzp >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzJ(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzI(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzK(Object obj, int i10, zzdy zzdyVar) {
        return zzdyVar.zzk(zzez.zzf(obj, i10 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcg) {
            return ((zzcg) obj).zzaf();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        if (zzez.zzc(obj, zzp(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzN(Object obj, long j10) {
        return ((Boolean) zzez.zzf(obj, j10)).booleanValue();
    }

    private static final void zzO(int i10, Object obj, zzfh zzfhVar) throws IOException {
        if (obj instanceof String) {
            zzfhVar.zzF(i10, (String) obj);
        } else {
            zzfhVar.zzd(i10, (zzbh) obj);
        }
    }

    static zzeq zzd(Object obj) {
        zzcg zzcgVar = (zzcg) obj;
        zzeq zzeqVar = zzcgVar.zzc;
        if (zzeqVar == zzeq.zzc()) {
            zzeq zzf = zzeq.zzf();
            zzcgVar.zzc = zzf;
            return zzf;
        }
        return zzeqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.wearable.zzdq zzl(java.lang.Class r30, com.google.android.gms.internal.wearable.zzdk r31, com.google.android.gms.internal.wearable.zzds r32, com.google.android.gms.internal.wearable.zzdb r33, com.google.android.gms.internal.wearable.zzep r34, com.google.android.gms.internal.wearable.zzbv r35, com.google.android.gms.internal.wearable.zzdi r36) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzdq.zzl(java.lang.Class, com.google.android.gms.internal.wearable.zzdk, com.google.android.gms.internal.wearable.zzds, com.google.android.gms.internal.wearable.zzdb, com.google.android.gms.internal.wearable.zzep, com.google.android.gms.internal.wearable.zzbv, com.google.android.gms.internal.wearable.zzdi):com.google.android.gms.internal.wearable.zzdq");
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zzez.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zzez.zzf(obj, j10)).floatValue();
    }

    private static int zzo(Object obj, long j10) {
        return ((Integer) zzez.zzf(obj, j10)).intValue();
    }

    private final int zzp(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzq(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzt(Object obj, long j10) {
        return ((Long) zzez.zzf(obj, j10)).longValue();
    }

    private final zzck zzu(int i10) {
        int i11 = i10 / 3;
        return (zzck) this.zzd[i11 + i11 + 1];
    }

    private final zzdy zzv(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzdy zzdyVar = (zzdy) this.zzd[i12];
        if (zzdyVar != null) {
            return zzdyVar;
        }
        zzdy zzb2 = zzdv.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzx(Object obj, int i10) {
        zzdy zzv = zzv(i10);
        int zzs = zzs(i10) & 1048575;
        if (!zzI(obj, i10)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i10, int i11) {
        zzdy zzv = zzv(i11);
        if (!zzM(obj, i10, i11)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i11) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzdy
    public final int zza(Object obj) {
        int i10;
        int i11;
        int i12;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzh;
        int zzx7;
        int zzy2;
        int size;
        int zzl;
        int zzx8;
        int zzx9;
        int zzx10;
        int i13;
        int zzx11;
        int zzx12;
        int i14;
        int i15;
        Unsafe unsafe = zzb;
        boolean z10 = false;
        int i16 = 1048575;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (i19 < this.zzc.length) {
            int zzs = zzs(i19);
            int zzr = zzr(zzs);
            int[] iArr = this.zzc;
            int i21 = iArr[i19];
            int i22 = iArr[i19 + 2];
            int i23 = i22 & i16;
            if (zzr <= 17) {
                if (i23 != i17) {
                    if (i23 == i16) {
                        i15 = 0;
                    } else {
                        i15 = unsafe.getInt(obj, i23);
                    }
                    i18 = i15;
                    i17 = i23;
                }
                i12 = 1 << (i22 >>> 20);
                i10 = i17;
                i11 = i18;
            } else {
                i10 = i17;
                i11 = i18;
                i12 = 0;
            }
            int i24 = zzs & i16;
            if (zzr >= zzca.zzJ.zza()) {
                zzca.zzW.zza();
            }
            long j10 = i24;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzx = zzbp.zzx(i21 << 3);
                        zzh = zzx + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzx2 = zzbp.zzx(i21 << 3);
                        zzh = zzx2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzy = zzbp.zzy(unsafe.getLong(obj, j10));
                        zzx3 = zzbp.zzx(i21 << 3);
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzy = zzbp.zzy(unsafe.getLong(obj, j10));
                        zzx3 = zzbp.zzx(i21 << 3);
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzy = zzbp.zzu(unsafe.getInt(obj, j10));
                        zzx3 = zzbp.zzx(i21 << 3);
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzx = zzbp.zzx(i21 << 3);
                        zzh = zzx + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzx2 = zzbp.zzx(i21 << 3);
                        zzh = zzx2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzx4 = zzbp.zzx(i21 << 3);
                        zzh = zzx4 + 1;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzbh) {
                            int i25 = zzbp.zzb;
                            int zzd = ((zzbh) object).zzd();
                            zzx5 = zzbp.zzx(zzd) + zzd;
                            zzx6 = zzbp.zzx(i21 << 3);
                            zzh = zzx6 + zzx5;
                            i20 += zzh;
                            break;
                        } else {
                            zzy = zzbp.zzw((String) object);
                            zzx3 = zzbp.zzx(i21 << 3);
                            i13 = zzx3 + zzy;
                            i20 += i13;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzh = zzea.zzh(i21, unsafe.getObject(obj, j10), zzv(i19));
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzbh zzbhVar = (zzbh) unsafe.getObject(obj, j10);
                        int i26 = zzbp.zzb;
                        int zzd2 = zzbhVar.zzd();
                        zzx5 = zzbp.zzx(zzd2) + zzd2;
                        zzx6 = zzbp.zzx(i21 << 3);
                        zzh = zzx6 + zzx5;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzy = zzbp.zzx(unsafe.getInt(obj, j10));
                        zzx3 = zzbp.zzx(i21 << 3);
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzy = zzbp.zzu(unsafe.getInt(obj, j10));
                        zzx3 = zzbp.zzx(i21 << 3);
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzx2 = zzbp.zzx(i21 << 3);
                        zzh = zzx2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzx = zzbp.zzx(i21 << 3);
                        zzh = zzx + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        int i27 = unsafe.getInt(obj, j10);
                        zzx3 = zzbp.zzx(i21 << 3);
                        zzy = zzbp.zzx((i27 >> 31) ^ (i27 + i27));
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        long j11 = unsafe.getLong(obj, j10);
                        zzx7 = zzbp.zzx(i21 << 3);
                        zzy2 = zzbp.zzy((j11 >> 63) ^ (j11 + j11));
                        zzx9 = zzx7 + zzy2;
                        i20 += zzx9;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzJ(obj, i19, i10, i11, i12)) {
                        zzh = zzbp.zzt(i21, (zzdn) unsafe.getObject(obj, j10), zzv(i19));
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzh = zzea.zzd(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 19:
                    zzh = zzea.zzb(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i28 = zzea.zza;
                    if (list.size() != 0) {
                        zzx3 = zzea.zzg(list);
                        zzy = list.size() * zzbp.zzx(i21 << 3);
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    }
                    i13 = 0;
                    i20 += i13;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i29 = zzea.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzea.zzl(list2);
                        zzx8 = zzbp.zzx(i21 << 3);
                        zzh = zzl + (size * zzx8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i30 = zzea.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzea.zzf(list3);
                        zzx8 = zzbp.zzx(i21 << 3);
                        zzh = zzl + (size * zzx8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 23:
                    zzh = zzea.zzd(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 24:
                    zzh = zzea.zzb(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzea.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzbp.zzx(i21 << 3) + 1);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i32 = zzea.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        zzx9 = 0;
                    } else {
                        boolean z11 = list5 instanceof zzcv;
                        zzx9 = zzbp.zzx(i21 << 3) * size3;
                        if (z11) {
                            zzcv zzcvVar = (zzcv) list5;
                            for (int i33 = 0; i33 < size3; i33++) {
                                Object zzf = zzcvVar.zzf(i33);
                                if (zzf instanceof zzbh) {
                                    int zzd3 = ((zzbh) zzf).zzd();
                                    zzx9 += zzbp.zzx(zzd3) + zzd3;
                                } else {
                                    zzx9 += zzbp.zzw((String) zzf);
                                }
                            }
                        } else {
                            for (int i34 = 0; i34 < size3; i34++) {
                                Object obj2 = list5.get(i34);
                                if (obj2 instanceof zzbh) {
                                    int zzd4 = ((zzbh) obj2).zzd();
                                    zzx9 += zzbp.zzx(zzd4) + zzd4;
                                } else {
                                    zzx9 += zzbp.zzw((String) obj2);
                                }
                            }
                        }
                    }
                    i20 += zzx9;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    zzdy zzv = zzv(i19);
                    int i35 = zzea.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzx10 = 0;
                    } else {
                        zzx10 = zzbp.zzx(i21 << 3) * size4;
                        for (int i36 = 0; i36 < size4; i36++) {
                            Object obj3 = list6.get(i36);
                            if (obj3 instanceof zzct) {
                                int zza2 = ((zzct) obj3).zza();
                                zzx10 += zzbp.zzx(zza2) + zza2;
                            } else {
                                zzx10 += zzbp.zzv((zzdn) obj3, zzv);
                            }
                        }
                    }
                    i20 += zzx10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i37 = zzea.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        i13 = size5 * zzbp.zzx(i21 << 3);
                        for (int i38 = 0; i38 < list7.size(); i38++) {
                            int zzd5 = ((zzbh) list7.get(i38)).zzd();
                            i13 += zzbp.zzx(zzd5) + zzd5;
                        }
                        i20 += i13;
                        break;
                    }
                    i13 = 0;
                    i20 += i13;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i39 = zzea.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzea.zzk(list8);
                        zzx8 = zzbp.zzx(i21 << 3);
                        zzh = zzl + (size * zzx8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i40 = zzea.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzea.zza(list9);
                        zzx8 = zzbp.zzx(i21 << 3);
                        zzh = zzl + (size * zzx8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 31:
                    zzh = zzea.zzb(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 32:
                    zzh = zzea.zzd(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i41 = zzea.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzea.zzi(list10);
                        zzx8 = zzbp.zzx(i21 << 3);
                        zzh = zzl + (size * zzx8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    int i42 = zzea.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzea.zzj(list11);
                        zzx8 = zzbp.zzx(i21 << 3);
                        zzh = zzl + (size * zzx8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 35:
                    zzy = zzea.zze((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzy = zzea.zzc((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzy = zzea.zzg((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzy = zzea.zzl((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzy = zzea.zzf((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzy = zzea.zze((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzy = zzea.zzc((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    int i43 = zzea.zza;
                    zzy = list12.size();
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzy = zzea.zzk((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzy = zzea.zza((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzy = zzea.zzc((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzy = zzea.zze((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzy = zzea.zzi((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzy = zzea.zzj((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzx11 = zzbp.zzx(zzy);
                        zzx12 = zzbp.zzx(i21 << 3);
                        zzx3 = zzx12 + zzx11;
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    zzdy zzv2 = zzv(i19);
                    int i44 = zzea.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i14 = 0;
                    } else {
                        i14 = 0;
                        for (int i45 = 0; i45 < size6; i45++) {
                            i14 += zzbp.zzt(i21, (zzdn) list13.get(i45), zzv2);
                        }
                    }
                    i20 += i14;
                    break;
                case 50:
                    zzdh zzdhVar = (zzdh) unsafe.getObject(obj, j10);
                    zzdg zzdgVar = (zzdg) zzw(i19);
                    if (zzdhVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzdhVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        break;
                    }
                case 51:
                    if (zzM(obj, i21, i19)) {
                        zzx = zzbp.zzx(i21 << 3);
                        zzh = zzx + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i21, i19)) {
                        zzx2 = zzbp.zzx(i21 << 3);
                        zzh = zzx2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i21, i19)) {
                        zzy = zzbp.zzy(zzt(obj, j10));
                        zzx3 = zzbp.zzx(i21 << 3);
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i21, i19)) {
                        zzy = zzbp.zzy(zzt(obj, j10));
                        zzx3 = zzbp.zzx(i21 << 3);
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i21, i19)) {
                        zzy = zzbp.zzu(zzo(obj, j10));
                        zzx3 = zzbp.zzx(i21 << 3);
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i21, i19)) {
                        zzx = zzbp.zzx(i21 << 3);
                        zzh = zzx + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i21, i19)) {
                        zzx2 = zzbp.zzx(i21 << 3);
                        zzh = zzx2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i21, i19)) {
                        zzx4 = zzbp.zzx(i21 << 3);
                        zzh = zzx4 + 1;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i21, i19)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzbh) {
                            int i46 = zzbp.zzb;
                            int zzd6 = ((zzbh) object2).zzd();
                            zzx5 = zzbp.zzx(zzd6) + zzd6;
                            zzx6 = zzbp.zzx(i21 << 3);
                            zzh = zzx6 + zzx5;
                            i20 += zzh;
                            break;
                        } else {
                            zzy = zzbp.zzw((String) object2);
                            zzx3 = zzbp.zzx(i21 << 3);
                            i13 = zzx3 + zzy;
                            i20 += i13;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i21, i19)) {
                        zzh = zzea.zzh(i21, unsafe.getObject(obj, j10), zzv(i19));
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i21, i19)) {
                        zzbh zzbhVar2 = (zzbh) unsafe.getObject(obj, j10);
                        int i47 = zzbp.zzb;
                        int zzd7 = zzbhVar2.zzd();
                        zzx5 = zzbp.zzx(zzd7) + zzd7;
                        zzx6 = zzbp.zzx(i21 << 3);
                        zzh = zzx6 + zzx5;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i21, i19)) {
                        zzy = zzbp.zzx(zzo(obj, j10));
                        zzx3 = zzbp.zzx(i21 << 3);
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i21, i19)) {
                        zzy = zzbp.zzu(zzo(obj, j10));
                        zzx3 = zzbp.zzx(i21 << 3);
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i21, i19)) {
                        zzx2 = zzbp.zzx(i21 << 3);
                        zzh = zzx2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i21, i19)) {
                        zzx = zzbp.zzx(i21 << 3);
                        zzh = zzx + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i21, i19)) {
                        int zzo = zzo(obj, j10);
                        zzx3 = zzbp.zzx(i21 << 3);
                        zzy = zzbp.zzx((zzo >> 31) ^ (zzo + zzo));
                        i13 = zzx3 + zzy;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i21, i19)) {
                        long zzt = zzt(obj, j10);
                        zzx7 = zzbp.zzx(i21 << 3);
                        zzy2 = zzbp.zzy((zzt >> 63) ^ (zzt + zzt));
                        zzx9 = zzx7 + zzy2;
                        i20 += zzx9;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i21, i19)) {
                        zzh = zzbp.zzt(i21, (zzdn) unsafe.getObject(obj, j10), zzv(i19));
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
            }
            i19 += 3;
            i17 = i10;
            i18 = i11;
            z10 = false;
            i16 = 1048575;
        }
        zzep zzepVar = this.zzm;
        int zza3 = i20 + zzepVar.zza(zzepVar.zzd(obj));
        if (!this.zzh) {
            return zza3;
        }
        this.zzn.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.zzdy
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzs = zzs(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & zzs;
            int i15 = 37;
            switch (zzr(zzs)) {
                case 0:
                    i10 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzez.zza(obj, j10));
                    byte[] bArr = zzco.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zzez.zzb(obj, j10));
                    i12 = i11 + floatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    doubleToLongBits = zzez.zzd(obj, j10);
                    byte[] bArr2 = zzco.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i12 * 53;
                    doubleToLongBits = zzez.zzd(obj, j10);
                    byte[] bArr3 = zzco.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i12 * 53;
                    floatToIntBits = zzez.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    doubleToLongBits = zzez.zzd(obj, j10);
                    byte[] bArr4 = zzco.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i12 * 53;
                    floatToIntBits = zzez.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 7:
                    i11 = i12 * 53;
                    floatToIntBits = zzco.zza(zzez.zzw(obj, j10));
                    i12 = i11 + floatToIntBits;
                    break;
                case 8:
                    i11 = i12 * 53;
                    floatToIntBits = ((String) zzez.zzf(obj, j10)).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 9:
                    Object zzf = zzez.zzf(obj, j10);
                    if (zzf != null) {
                        i15 = zzf.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    floatToIntBits = zzez.zzf(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 11:
                    i11 = i12 * 53;
                    floatToIntBits = zzez.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 12:
                    i11 = i12 * 53;
                    floatToIntBits = zzez.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 13:
                    i11 = i12 * 53;
                    floatToIntBits = zzez.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    doubleToLongBits = zzez.zzd(obj, j10);
                    byte[] bArr5 = zzco.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i12 * 53;
                    floatToIntBits = zzez.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = zzez.zzd(obj, j10);
                    byte[] bArr6 = zzco.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object zzf2 = zzez.zzf(obj, j10);
                    if (zzf2 != null) {
                        i15 = zzf2.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    floatToIntBits = zzez.zzf(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 50:
                    i11 = i12 * 53;
                    floatToIntBits = zzez.zzf(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j10));
                        byte[] bArr7 = zzco.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j10));
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzt(obj, j10);
                        byte[] bArr8 = zzco.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzt(obj, j10);
                        byte[] bArr9 = zzco.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzo(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzt(obj, j10);
                        byte[] bArr10 = zzco.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzo(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzco.zza(zzN(obj, j10));
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = ((String) zzez.zzf(obj, j10)).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzez.zzf(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzez.zzf(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzo(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzo(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzo(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzt(obj, j10);
                        byte[] bArr11 = zzco.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzo(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzt(obj, j10);
                        byte[] bArr12 = zzco.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzez.zzf(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + this.zzm.zzd(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzn.zza(obj);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0cfa, code lost:
    
        if (r6 == 1048575) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0cfc, code lost:
    
        r13.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0d00, code lost:
    
        r2 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0d04, code lost:
    
        if (r2 >= r0.zzk) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0d06, code lost:
    
        r3 = r0.zzi[r2];
        r5 = r0.zzc[r3];
        r5 = com.google.android.gms.internal.wearable.zzez.zzf(r7, r0.zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0d1b, code lost:
    
        if (r5 != null) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0d22, code lost:
    
        if (r0.zzu(r3) != null) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0d24, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0d27, code lost:
    
        r5 = (com.google.android.gms.internal.wearable.zzdh) r5;
        r1 = (com.google.android.gms.internal.wearable.zzdg) r0.zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0d2f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0d30, code lost:
    
        if (r8 != 0) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0d32, code lost:
    
        if (r1 != r9) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0d39, code lost:
    
        throw com.google.android.gms.internal.wearable.zzcq.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0d3a, code lost:
    
        if (r1 > r9) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0d3c, code lost:
    
        if (r4 != r8) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d3e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0d43, code lost:
    
        throw com.google.android.gms.internal.wearable.zzcq.zze();
     */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:253:0x0602 -> B:254:0x0603). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:286:0x06ac -> B:287:0x06ad). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:306:0x06fc -> B:307:0x06fd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.google.android.gms.internal.wearable.zzau r45) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzdq.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.wearable.zzau):int");
    }

    @Override // com.google.android.gms.internal.wearable.zzdy
    public final Object zze() {
        return ((zzcg) this.zzg).zzP();
    }

    @Override // com.google.android.gms.internal.wearable.zzdy
    public final void zzf(Object obj) {
        if (!zzL(obj)) {
            return;
        }
        if (obj instanceof zzcg) {
            zzcg zzcgVar = (zzcg) obj;
            zzcgVar.zzac(Integer.MAX_VALUE);
            zzcgVar.zza = 0;
            zzcgVar.zzaa();
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzs = zzs(i10);
            int i11 = 1048575 & zzs;
            int zzr = zzr(zzs);
            long j10 = i11;
            if (zzr != 9) {
                if (zzr != 60 && zzr != 68) {
                    switch (zzr) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.zzl.zza(obj, j10);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((zzdh) object).zzc();
                                unsafe.putObject(obj, j10, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzM(obj, this.zzc[i10], i10)) {
                    zzv(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            if (zzI(obj, i10)) {
                zzv(i10).zzf(zzb.getObject(obj, j10));
            }
        }
        this.zzm.zzg(obj);
        if (this.zzh) {
            this.zzn.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzdy
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzs = zzs(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & zzs;
            switch (zzr(zzs)) {
                case 0:
                    if (zzI(obj2, i10)) {
                        zzez.zzo(obj, j10, zzez.zza(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i10)) {
                        zzez.zzp(obj, j10, zzez.zzb(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i10)) {
                        zzez.zzr(obj, j10, zzez.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i10)) {
                        zzez.zzr(obj, j10, zzez.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i10)) {
                        zzez.zzq(obj, j10, zzez.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i10)) {
                        zzez.zzr(obj, j10, zzez.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i10)) {
                        zzez.zzq(obj, j10, zzez.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i10)) {
                        zzez.zzm(obj, j10, zzez.zzw(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i10)) {
                        zzez.zzs(obj, j10, zzez.zzf(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i10);
                    break;
                case 10:
                    if (zzI(obj2, i10)) {
                        zzez.zzs(obj, j10, zzez.zzf(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i10)) {
                        zzez.zzq(obj, j10, zzez.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i10)) {
                        zzez.zzq(obj, j10, zzez.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i10)) {
                        zzez.zzq(obj, j10, zzez.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i10)) {
                        zzez.zzr(obj, j10, zzez.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i10)) {
                        zzez.zzq(obj, j10, zzez.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i10)) {
                        zzez.zzr(obj, j10, zzez.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzea.zza;
                    zzez.zzs(obj, j10, zzdi.zza(zzez.zzf(obj, j10), zzez.zzf(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i11, i10)) {
                        zzez.zzs(obj, j10, zzez.zzf(obj2, j10));
                        zzE(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i11, i10)) {
                        zzez.zzs(obj, j10, zzez.zzf(obj2, j10));
                        zzE(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i10);
                    break;
            }
        }
        zzea.zzp(this.zzm, obj, obj2);
        if (!this.zzh) {
            return;
        }
        this.zzn.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.zzdy
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzau zzauVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zzauVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzdy
    public final void zzi(Object obj, zzfh zzfhVar) throws IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i14 = 1048575;
            int i15 = 1048575;
            int i16 = 0;
            int i17 = 0;
            while (i17 < length) {
                int zzs = zzs(i17);
                int[] iArr = this.zzc;
                int i18 = iArr[i17];
                int zzr = zzr(zzs);
                if (zzr <= 17) {
                    int i19 = iArr[i17 + 2];
                    int i20 = i19 & i14;
                    if (i20 != i15) {
                        if (i20 == i14) {
                            i13 = 0;
                        } else {
                            i13 = unsafe.getInt(obj, i20);
                        }
                        i16 = i13;
                        i15 = i20;
                    }
                    i10 = i15;
                    i11 = i16;
                    i12 = 1 << (i19 >>> 20);
                } else {
                    i10 = i15;
                    i11 = i16;
                    i12 = 0;
                }
                long j10 = zzs & i14;
                switch (zzr) {
                    case 0:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzf(i18, zzez.zza(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzo(i18, zzez.zzb(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzt(i18, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzJ(i18, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzr(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzm(i18, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzk(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzb(i18, zzez.zzw(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzO(i18, unsafe.getObject(obj, j10), zzfhVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzv(i18, unsafe.getObject(obj, j10), zzv(i17));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzd(i18, (zzbh) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzH(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzi(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzw(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzy(i18, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzA(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzC(i18, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzJ(obj, i17, i10, i11, i12)) {
                            zzfhVar.zzq(i18, unsafe.getObject(obj, j10), zzv(i17));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzea.zzs(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 19:
                        zzea.zzw(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 20:
                        zzea.zzy(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 21:
                        zzea.zzE(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 22:
                        zzea.zzx(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 23:
                        zzea.zzv(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 24:
                        zzea.zzu(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 25:
                        zzea.zzr(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 26:
                        int i21 = this.zzc[i17];
                        List list = (List) unsafe.getObject(obj, j10);
                        int i22 = zzea.zza;
                        if (list != null && !list.isEmpty()) {
                            zzfhVar.zzG(i21, list);
                            break;
                        }
                        break;
                    case 27:
                        int i23 = this.zzc[i17];
                        List list2 = (List) unsafe.getObject(obj, j10);
                        zzdy zzv = zzv(i17);
                        int i24 = zzea.zza;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i25 = 0; i25 < list2.size(); i25++) {
                                ((zzbq) zzfhVar).zzv(i23, list2.get(i25), zzv);
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i26 = this.zzc[i17];
                        List list3 = (List) unsafe.getObject(obj, j10);
                        int i27 = zzea.zza;
                        if (list3 != null && !list3.isEmpty()) {
                            zzfhVar.zze(i26, list3);
                            break;
                        }
                        break;
                    case 29:
                        zzea.zzD(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 30:
                        zzea.zzt(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 31:
                        zzea.zzz(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 32:
                        zzea.zzA(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 33:
                        zzea.zzB(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 34:
                        zzea.zzC(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, false);
                        break;
                    case 35:
                        zzea.zzs(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 36:
                        zzea.zzw(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 37:
                        zzea.zzy(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 38:
                        zzea.zzE(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 39:
                        zzea.zzx(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 40:
                        zzea.zzv(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 41:
                        zzea.zzu(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 42:
                        zzea.zzr(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 43:
                        zzea.zzD(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 44:
                        zzea.zzt(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 45:
                        zzea.zzz(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 46:
                        zzea.zzA(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 47:
                        zzea.zzB(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 48:
                        zzea.zzC(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzfhVar, true);
                        break;
                    case 49:
                        int i28 = this.zzc[i17];
                        List list4 = (List) unsafe.getObject(obj, j10);
                        zzdy zzv2 = zzv(i17);
                        int i29 = zzea.zza;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i30 = 0; i30 < list4.size(); i30++) {
                                ((zzbq) zzfhVar).zzq(i28, list4.get(i30), zzv2);
                            }
                            break;
                        }
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j10) != null) {
                            zzdg zzdgVar = (zzdg) zzw(i17);
                            throw null;
                        }
                        break;
                    case 51:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzf(i18, zzm(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzo(i18, zzn(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzt(i18, zzt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzJ(i18, zzt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzr(i18, zzo(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzm(i18, zzt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzk(i18, zzo(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzb(i18, zzN(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzM(obj, i18, i17)) {
                            zzO(i18, unsafe.getObject(obj, j10), zzfhVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzv(i18, unsafe.getObject(obj, j10), zzv(i17));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzd(i18, (zzbh) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzH(i18, zzo(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzi(i18, zzo(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzw(i18, zzo(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzy(i18, zzt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzA(i18, zzo(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzC(i18, zzt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzM(obj, i18, i17)) {
                            zzfhVar.zzq(i18, unsafe.getObject(obj, j10), zzv(i17));
                            break;
                        } else {
                            break;
                        }
                }
                i17 += 3;
                i15 = i10;
                i16 = i11;
                i14 = 1048575;
            }
            zzep zzepVar = this.zzm;
            zzepVar.zzi(zzepVar.zzd(obj), zzfhVar);
            return;
        }
        this.zzn.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.zzdy
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzF;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzs = zzs(i10);
            long j10 = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i10) && Double.doubleToLongBits(zzez.zza(obj, j10)) == Double.doubleToLongBits(zzez.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i10) && Float.floatToIntBits(zzez.zzb(obj, j10)) == Float.floatToIntBits(zzez.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i10) && zzez.zzd(obj, j10) == zzez.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i10) && zzez.zzd(obj, j10) == zzez.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i10) && zzez.zzc(obj, j10) == zzez.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i10) && zzez.zzd(obj, j10) == zzez.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i10) && zzez.zzc(obj, j10) == zzez.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i10) && zzez.zzw(obj, j10) == zzez.zzw(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i10) && zzea.zzF(zzez.zzf(obj, j10), zzez.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i10) && zzea.zzF(zzez.zzf(obj, j10), zzez.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i10) && zzea.zzF(zzez.zzf(obj, j10), zzez.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i10) && zzez.zzc(obj, j10) == zzez.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i10) && zzez.zzc(obj, j10) == zzez.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i10) && zzez.zzc(obj, j10) == zzez.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i10) && zzez.zzd(obj, j10) == zzez.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i10) && zzez.zzc(obj, j10) == zzez.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i10) && zzez.zzd(obj, j10) == zzez.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i10) && zzea.zzF(zzez.zzf(obj, j10), zzez.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzF = zzea.zzF(zzez.zzf(obj, j10), zzez.zzf(obj2, j10));
                    break;
                case 50:
                    zzF = zzea.zzF(zzez.zzf(obj, j10), zzez.zzf(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzp = zzp(i10) & 1048575;
                    if (zzez.zzc(obj, zzp) == zzez.zzc(obj2, zzp) && zzea.zzF(zzez.zzf(obj, j10), zzez.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj);
        this.zzn.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.zzdy
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzj) {
            int i15 = this.zzi[i14];
            int i16 = this.zzc[i15];
            int zzs = zzs(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & zzs) != 0 && !zzJ(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr != 60 && zzr != 68) {
                        if (zzr != 49) {
                            if (zzr == 50 && !((zzdh) zzez.zzf(obj, zzs & 1048575)).isEmpty()) {
                                zzdg zzdgVar = (zzdg) zzw(i15);
                                throw null;
                            }
                        }
                    } else if (zzM(obj, i16, i15) && !zzK(obj, zzs, zzv(i15))) {
                        return false;
                    }
                }
                List list = (List) zzez.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzdy zzv = zzv(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzv.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i15, i10, i11, i19) && !zzK(obj, zzs, zzv(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj);
        throw null;
    }
}
