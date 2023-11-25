package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i10, int i11, zzmi zzmiVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = z10;
        boolean z12 = false;
        if (zzkoVar != null && zzkoVar.zzc(zzmiVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i10) {
        int i11 = i10 / 3;
        return (zzlf) this.zzd[i11 + i11 + 1];
    }

    private final zzmt zzB(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzmt zzmtVar = (zzmt) this.zzd[i12];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzb2 = zzmq.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzD(Object obj, int i10) {
        zzmt zzB = zzB(i10);
        int zzy = zzy(i10) & 1048575;
        if (!zzP(obj, i10)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzE(Object obj, int i10, int i11) {
        zzmt zzB = zzB(i11);
        if (!zzT(obj, i10, i11)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i11) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzF(Class cls, String str) {
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

    private static void zzG(Object obj) {
        if (zzS(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzH(Object obj, Object obj2, int i10) {
        if (!zzP(obj2, i10)) {
            return;
        }
        int zzy = zzy(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzy;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzmt zzB = zzB(i10);
            if (!zzP(obj, i10)) {
                if (!zzS(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                }
                zzJ(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (!zzT(obj2, i11, i10)) {
            return;
        }
        int zzy = zzy(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzy;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzmt zzB = zzB(i10);
            if (!zzT(obj, i11, i10)) {
                if (!zzS(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                }
                zzK(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzJ(Object obj, int i10) {
        int zzv = zzv(i10);
        long j10 = 1048575 & zzv;
        if (j10 == 1048575) {
            return;
        }
        zznu.zzq(obj, j10, (1 << (zzv >>> 20)) | zznu.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zznu.zzq(obj, zzv(i11) & 1048575, i10);
    }

    private final void zzL(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzy(i10) & 1048575, obj2);
        zzJ(obj, i10);
    }

    private final void zzM(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzy(i11) & 1048575, obj2);
        zzK(obj, i10, i11);
    }

    private final void zzN(zzoc zzocVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        zzmb zzmbVar = (zzmb) zzC(i11);
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i10) {
        if (zzP(obj, i10) == zzP(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean zzP(Object obj, int i10) {
        int zzv = zzv(i10);
        long j10 = zzv & 1048575;
        if (j10 == 1048575) {
            int zzy = zzy(i10);
            long j11 = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (Double.doubleToRawLongBits(zznu.zza(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zznu.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zznu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zznu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zznu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zznu.zzw(obj, j11);
                case 8:
                    Object zzf = zznu.zzf(obj, j11);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzka) {
                        if (zzka.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zznu.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzka.zzb.equals(zznu.zzf(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zznu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zznu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zznu.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zznu.zzc(obj, j10) & (1 << (zzv >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzQ(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzP(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzR(Object obj, int i10, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i10 & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i10, int i11) {
        if (zznu.zzc(obj, zzv(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzU(Object obj, long j10) {
        return ((Boolean) zznu.zzf(obj, j10)).booleanValue();
    }

    private static final void zzV(int i10, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i10, (String) obj);
        } else {
            zzocVar.zzd(i10, (zzka) obj);
        }
    }

    static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar == zznl.zzc()) {
            zznl zzf = zznl.zzf();
            zzlbVar.zzc = zzf;
            return zzf;
        }
        return zznlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.zzml zzl(java.lang.Class r31, com.google.android.gms.internal.measurement.zzmf r32, com.google.android.gms.internal.measurement.zzmn r33, com.google.android.gms.internal.measurement.zzlw r34, com.google.android.gms.internal.measurement.zznk r35, com.google.android.gms.internal.measurement.zzko r36, com.google.android.gms.internal.measurement.zzmd r37) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zzmf, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzlw, com.google.android.gms.internal.measurement.zznk, com.google.android.gms.internal.measurement.zzko, com.google.android.gms.internal.measurement.zzmd):com.google.android.gms.internal.measurement.zzml");
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zznu.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zznu.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzo(Object obj) {
        int i10;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzt;
        int zzh;
        int zzx7;
        int zzx8;
        int i11;
        int zzx9;
        int zzx10;
        int zzx11;
        int zzx12;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        int i16 = 0;
        while (i13 < this.zzc.length) {
            int zzy2 = zzy(i13);
            int[] iArr = this.zzc;
            int i17 = iArr[i13];
            int zzx13 = zzx(zzy2);
            if (zzx13 <= 17) {
                int i18 = iArr[i13 + 2];
                int i19 = i18 & i12;
                int i20 = i18 >>> 20;
                if (i19 != i15) {
                    i16 = unsafe.getInt(obj, i19);
                    i15 = i19;
                }
                i10 = 1 << i20;
            } else {
                i10 = 0;
            }
            long j10 = zzy2 & i12;
            switch (zzx13) {
                case 0:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i17 << 3);
                        zzx4 = zzx + 8;
                        i14 += zzx4;
                        break;
                    }
                case 1:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i17 << 3);
                        zzx4 = zzx2 + 4;
                        i14 += zzx4;
                        break;
                    }
                case 2:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzy(unsafe.getLong(obj, j10));
                        zzx3 = zzki.zzx(i17 << 3);
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 3:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzy(unsafe.getLong(obj, j10));
                        zzx3 = zzki.zzx(i17 << 3);
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 4:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzu(unsafe.getInt(obj, j10));
                        zzx3 = zzki.zzx(i17 << 3);
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 5:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i17 << 3);
                        zzx4 = zzx + 8;
                        i14 += zzx4;
                        break;
                    }
                case 6:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i17 << 3);
                        zzx4 = zzx2 + 4;
                        i14 += zzx4;
                        break;
                    }
                case 7:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx4 = zzki.zzx(i17 << 3) + 1;
                        i14 += zzx4;
                        break;
                    }
                case 8:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzka) {
                            int i21 = zzki.zzb;
                            int zzd = ((zzka) object).zzd();
                            zzx5 = zzki.zzx(zzd) + zzd;
                            zzx6 = zzki.zzx(i17 << 3);
                            zzx4 = zzx6 + zzx5;
                            i14 += zzx4;
                            break;
                        } else {
                            zzy = zzki.zzw((String) object);
                            zzx3 = zzki.zzx(i17 << 3);
                            i14 += zzx3 + zzy;
                            break;
                        }
                    }
                case 9:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx4 = zzmv.zzn(i17, unsafe.getObject(obj, j10), zzB(i13));
                        i14 += zzx4;
                        break;
                    }
                case 10:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzka zzkaVar = (zzka) unsafe.getObject(obj, j10);
                        int i22 = zzki.zzb;
                        int zzd2 = zzkaVar.zzd();
                        zzx5 = zzki.zzx(zzd2) + zzd2;
                        zzx6 = zzki.zzx(i17 << 3);
                        zzx4 = zzx6 + zzx5;
                        i14 += zzx4;
                        break;
                    }
                case 11:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzx(unsafe.getInt(obj, j10));
                        zzx3 = zzki.zzx(i17 << 3);
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 12:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzu(unsafe.getInt(obj, j10));
                        zzx3 = zzki.zzx(i17 << 3);
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 13:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i17 << 3);
                        zzx4 = zzx2 + 4;
                        i14 += zzx4;
                        break;
                    }
                case 14:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i17 << 3);
                        zzx4 = zzx + 8;
                        i14 += zzx4;
                        break;
                    }
                case 15:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(obj, j10);
                        zzx3 = zzki.zzx(i17 << 3);
                        zzy = zzki.zzx((i23 >> 31) ^ (i23 + i23));
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 16:
                    if ((i10 & i16) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j10);
                        i14 += zzki.zzx(i17 << 3) + zzki.zzy((j11 >> 63) ^ (j11 + j11));
                        break;
                    }
                case 17:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx4 = zzki.zzt(i17, (zzmi) unsafe.getObject(obj, j10), zzB(i13));
                        i14 += zzx4;
                        break;
                    }
                case 18:
                    zzx4 = zzmv.zzg(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 19:
                    zzx4 = zzmv.zze(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 20:
                    zzx4 = zzmv.zzl(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 21:
                    zzx4 = zzmv.zzw(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 22:
                    zzx4 = zzmv.zzj(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 23:
                    zzx4 = zzmv.zzg(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 24:
                    zzx4 = zzmv.zze(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 25:
                    zzx4 = zzmv.zza(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 26:
                    zzt = zzmv.zzt(i17, (List) unsafe.getObject(obj, j10));
                    i14 += zzt;
                    break;
                case 27:
                    zzt = zzmv.zzo(i17, (List) unsafe.getObject(obj, j10), zzB(i13));
                    i14 += zzt;
                    break;
                case 28:
                    zzt = zzmv.zzb(i17, (List) unsafe.getObject(obj, j10));
                    i14 += zzt;
                    break;
                case 29:
                    zzt = zzmv.zzu(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 30:
                    zzt = zzmv.zzc(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 31:
                    zzt = zzmv.zze(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 32:
                    zzt = zzmv.zzg(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 33:
                    zzt = zzmv.zzp(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 34:
                    zzt = zzmv.zzr(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 35:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 36:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 37:
                    zzh = zzmv.zzm((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 38:
                    zzh = zzmv.zzx((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 39:
                    zzh = zzmv.zzk((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 40:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 41:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i24 = zzmv.zza;
                    zzh = list.size();
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 43:
                    zzh = zzmv.zzv((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 44:
                    zzh = zzmv.zzd((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 45:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 46:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 47:
                    zzh = zzmv.zzq((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 48:
                    zzh = zzmv.zzs((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 49:
                    zzt = zzmv.zzi(i17, (List) unsafe.getObject(obj, j10), zzB(i13));
                    i14 += zzt;
                    break;
                case 50:
                    zzmd.zza(i17, unsafe.getObject(obj, j10), zzC(i13));
                    break;
                case 51:
                    if (zzT(obj, i17, i13)) {
                        zzx9 = zzki.zzx(i17 << 3);
                        zzt = zzx9 + 8;
                        i14 += zzt;
                    }
                    break;
                case 52:
                    if (zzT(obj, i17, i13)) {
                        zzx10 = zzki.zzx(i17 << 3);
                        zzt = zzx10 + 4;
                        i14 += zzt;
                    }
                    break;
                case 53:
                    if (zzT(obj, i17, i13)) {
                        zzh = zzki.zzy(zzz(obj, j10));
                        i11 = zzki.zzx(i17 << 3);
                        i14 += i11 + zzh;
                    }
                    break;
                case 54:
                    if (zzT(obj, i17, i13)) {
                        zzh = zzki.zzy(zzz(obj, j10));
                        i11 = zzki.zzx(i17 << 3);
                        i14 += i11 + zzh;
                    }
                    break;
                case 55:
                    if (zzT(obj, i17, i13)) {
                        zzh = zzki.zzu(zzp(obj, j10));
                        i11 = zzki.zzx(i17 << 3);
                        i14 += i11 + zzh;
                    }
                    break;
                case 56:
                    if (zzT(obj, i17, i13)) {
                        zzx9 = zzki.zzx(i17 << 3);
                        zzt = zzx9 + 8;
                        i14 += zzt;
                    }
                    break;
                case 57:
                    if (zzT(obj, i17, i13)) {
                        zzx10 = zzki.zzx(i17 << 3);
                        zzt = zzx10 + 4;
                        i14 += zzt;
                    }
                    break;
                case 58:
                    if (zzT(obj, i17, i13)) {
                        zzt = zzki.zzx(i17 << 3) + 1;
                        i14 += zzt;
                    }
                    break;
                case 59:
                    if (zzT(obj, i17, i13)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzka) {
                            int i25 = zzki.zzb;
                            int zzd3 = ((zzka) object2).zzd();
                            zzx11 = zzki.zzx(zzd3) + zzd3;
                            zzx12 = zzki.zzx(i17 << 3);
                            zzt = zzx12 + zzx11;
                            i14 += zzt;
                        } else {
                            zzh = zzki.zzw((String) object2);
                            i11 = zzki.zzx(i17 << 3);
                            i14 += i11 + zzh;
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i17, i13)) {
                        zzt = zzmv.zzn(i17, unsafe.getObject(obj, j10), zzB(i13));
                        i14 += zzt;
                    }
                    break;
                case 61:
                    if (zzT(obj, i17, i13)) {
                        zzka zzkaVar2 = (zzka) unsafe.getObject(obj, j10);
                        int i26 = zzki.zzb;
                        int zzd4 = zzkaVar2.zzd();
                        zzx11 = zzki.zzx(zzd4) + zzd4;
                        zzx12 = zzki.zzx(i17 << 3);
                        zzt = zzx12 + zzx11;
                        i14 += zzt;
                    }
                    break;
                case 62:
                    if (zzT(obj, i17, i13)) {
                        zzh = zzki.zzx(zzp(obj, j10));
                        i11 = zzki.zzx(i17 << 3);
                        i14 += i11 + zzh;
                    }
                    break;
                case 63:
                    if (zzT(obj, i17, i13)) {
                        zzh = zzki.zzu(zzp(obj, j10));
                        i11 = zzki.zzx(i17 << 3);
                        i14 += i11 + zzh;
                    }
                    break;
                case 64:
                    if (zzT(obj, i17, i13)) {
                        zzx10 = zzki.zzx(i17 << 3);
                        zzt = zzx10 + 4;
                        i14 += zzt;
                    }
                    break;
                case 65:
                    if (zzT(obj, i17, i13)) {
                        zzx9 = zzki.zzx(i17 << 3);
                        zzt = zzx9 + 8;
                        i14 += zzt;
                    }
                    break;
                case 66:
                    if (zzT(obj, i17, i13)) {
                        int zzp = zzp(obj, j10);
                        i11 = zzki.zzx(i17 << 3);
                        zzh = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                        i14 += i11 + zzh;
                    }
                    break;
                case 67:
                    if (zzT(obj, i17, i13)) {
                        long zzz = zzz(obj, j10);
                        i14 += zzki.zzx(i17 << 3) + zzki.zzy((zzz >> 63) ^ (zzz + zzz));
                    }
                    break;
                case 68:
                    if (zzT(obj, i17, i13)) {
                        zzt = zzki.zzt(i17, (zzmi) unsafe.getObject(obj, j10), zzB(i13));
                        i14 += zzt;
                    }
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        zznk zznkVar = this.zzn;
        int zza2 = i14 + zznkVar.zza(zznkVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zznu.zzf(obj, j10)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzmc) object).zze()) {
            zzmc zzb2 = zzmc.zza().zzb();
            zzmd.zzb(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzmb zzmbVar = (zzmb) zzC;
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzjo.zzm(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzjnVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzjo.zzj(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzjnVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzjo.zzp(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzjo.zzb(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzjo.zzm(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzjnVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzjo.zzj(bArr, i10, zzjnVar);
                    int i22 = zzjnVar.zza;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i15 & 536870912) != 0 && !zznz.zze(bArr, zzj2, zzj2 + i22)) {
                        throw zzll.zzc();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i22, zzlj.zzb));
                        zzj2 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object zzE = zzE(obj, i13, i17);
                    int zzo = zzjo.zzo(zzE, zzB(i17), bArr, i10, i11, zzjnVar);
                    zzM(obj, i13, i17, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzjo.zza(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, zzjnVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzjo.zzj(bArr, i10, zzjnVar);
                    int i23 = zzjnVar.zza;
                    zzlf zzA = zzA(i17);
                    if (zzA != null && !zzA.zza(i23)) {
                        zzd(obj).zzj(i12, Long.valueOf(i23));
                    } else {
                        unsafe.putObject(obj, j10, Integer.valueOf(i23));
                        unsafe.putInt(obj, j11, i13);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int zzj4 = zzjo.zzj(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzke.zzb(zzjnVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzjo.zzm(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzke.zzc(zzjnVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object zzE2 = zzE(obj, i13, i17);
                    int zzn = zzjo.zzn(zzE2, zzB(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzjnVar);
                    zzM(obj, i13, i17, zzE2);
                    return zzn;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0216 -> B:114:0x0217). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0264 -> B:134:0x0265). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x019b -> B:82:0x019c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzs(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.zzjn r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzjn):int");
    }

    private final int zzt(int i10) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzw(i10, 0);
        }
        return -1;
    }

    private final int zzu(int i10, int i11) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzw(i10, i11);
        }
        return -1;
    }

    private final int zzv(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzw(int i10, int i11) {
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

    private static int zzx(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzz(Object obj, long j10) {
        return ((Long) zznu.zzf(obj, j10)).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zza(Object obj) {
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzy2;
        int zzx8;
        int zzx9;
        if (this.zzi) {
            Unsafe unsafe = zzb;
            int i10 = 0;
            for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
                int zzy3 = zzy(i11);
                int zzx10 = zzx(zzy3);
                int i12 = this.zzc[i11];
                int i13 = zzy3 & 1048575;
                if (zzx10 >= zzkt.zzJ.zza() && zzx10 <= zzkt.zzW.zza()) {
                    int i14 = this.zzc[i11 + 2];
                }
                long j10 = i13;
                switch (zzx10) {
                    case 0:
                        if (zzP(obj, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i11)) {
                            zzy = zzki.zzy(zznu.zzd(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i11)) {
                            zzy = zzki.zzy(zznu.zzd(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i11)) {
                            zzy = zzki.zzu(zznu.zzc(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i11)) {
                            zzx4 = zzki.zzx(i12 << 3);
                            zzn = zzx4 + 1;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i11)) {
                            Object zzf = zznu.zzf(obj, j10);
                            if (zzf instanceof zzka) {
                                int i15 = i12 << 3;
                                int i16 = zzki.zzb;
                                int zzd = ((zzka) zzf).zzd();
                                zzx5 = zzki.zzx(zzd) + zzd;
                                zzx6 = zzki.zzx(i15);
                                zzn = zzx6 + zzx5;
                                i10 += zzn;
                                break;
                            } else {
                                zzy = zzki.zzw((String) zzf);
                                zzx3 = zzki.zzx(i12 << 3);
                                i10 += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i11)) {
                            zzn = zzmv.zzn(i12, zznu.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i11)) {
                            zzka zzkaVar = (zzka) zznu.zzf(obj, j10);
                            int i17 = i12 << 3;
                            int i18 = zzki.zzb;
                            int zzd2 = zzkaVar.zzd();
                            zzx5 = zzki.zzx(zzd2) + zzd2;
                            zzx6 = zzki.zzx(i17);
                            zzn = zzx6 + zzx5;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i11)) {
                            zzy = zzki.zzx(zznu.zzc(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i11)) {
                            zzy = zzki.zzu(zznu.zzc(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i11)) {
                            int zzc = zznu.zzc(obj, j10);
                            zzx3 = zzki.zzx(i12 << 3);
                            zzy = zzki.zzx((zzc >> 31) ^ (zzc + zzc));
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i11)) {
                            long zzd3 = zznu.zzd(obj, j10);
                            zzx7 = zzki.zzx(i12 << 3);
                            zzy2 = zzki.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                            zzn = zzx7 + zzy2;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i11)) {
                            zzn = zzki.zzt(i12, (zzmi) zznu.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzmv.zzg(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 19:
                        zzn = zzmv.zze(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 20:
                        zzn = zzmv.zzl(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 21:
                        zzn = zzmv.zzw(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 22:
                        zzn = zzmv.zzj(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 23:
                        zzn = zzmv.zzg(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 24:
                        zzn = zzmv.zze(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 25:
                        zzn = zzmv.zza(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 26:
                        zzn = zzmv.zzt(i12, (List) zznu.zzf(obj, j10));
                        i10 += zzn;
                        break;
                    case 27:
                        zzn = zzmv.zzo(i12, (List) zznu.zzf(obj, j10), zzB(i11));
                        i10 += zzn;
                        break;
                    case 28:
                        zzn = zzmv.zzb(i12, (List) zznu.zzf(obj, j10));
                        i10 += zzn;
                        break;
                    case 29:
                        zzn = zzmv.zzu(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 30:
                        zzn = zzmv.zzc(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 31:
                        zzn = zzmv.zze(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 32:
                        zzn = zzmv.zzg(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 33:
                        zzn = zzmv.zzp(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 34:
                        zzn = zzmv.zzr(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 35:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i19 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i19);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i20 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i20);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzy = zzmv.zzm((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i21 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i21);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzy = zzmv.zzx((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i22 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i22);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzy = zzmv.zzk((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i23 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i23);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i24 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i24);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i25 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i25);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list = (List) unsafe.getObject(obj, j10);
                        int i26 = zzmv.zza;
                        zzy = list.size();
                        if (zzy > 0) {
                            int i27 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i27);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzy = zzmv.zzv((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i28 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i28);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzy = zzmv.zzd((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i29 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i29);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i30 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i30);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i31 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i31);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzy = zzmv.zzq((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i32 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i32);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzy = zzmv.zzs((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i33 = i12 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i33);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzn = zzmv.zzi(i12, (List) zznu.zzf(obj, j10), zzB(i11));
                        i10 += zzn;
                        break;
                    case 50:
                        zzmd.zza(i12, zznu.zzf(obj, j10), zzC(i11));
                        break;
                    case 51:
                        if (zzT(obj, i12, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i12, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzki.zzy(zzz(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzki.zzy(zzz(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzki.zzu(zzp(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i12, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i12, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i12, i11)) {
                            zzx4 = zzki.zzx(i12 << 3);
                            zzn = zzx4 + 1;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i12, i11)) {
                            Object zzf2 = zznu.zzf(obj, j10);
                            if (zzf2 instanceof zzka) {
                                int i34 = i12 << 3;
                                int i35 = zzki.zzb;
                                int zzd4 = ((zzka) zzf2).zzd();
                                zzx5 = zzki.zzx(zzd4) + zzd4;
                                zzx6 = zzki.zzx(i34);
                                zzn = zzx6 + zzx5;
                                i10 += zzn;
                                break;
                            } else {
                                zzy = zzki.zzw((String) zzf2);
                                zzx3 = zzki.zzx(i12 << 3);
                                i10 += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i12, i11)) {
                            zzn = zzmv.zzn(i12, zznu.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i12, i11)) {
                            zzka zzkaVar2 = (zzka) zznu.zzf(obj, j10);
                            int i36 = i12 << 3;
                            int i37 = zzki.zzb;
                            int zzd5 = zzkaVar2.zzd();
                            zzx5 = zzki.zzx(zzd5) + zzd5;
                            zzx6 = zzki.zzx(i36);
                            zzn = zzx6 + zzx5;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzki.zzx(zzp(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzki.zzu(zzp(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i12, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i12, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i12, i11)) {
                            int zzp = zzp(obj, j10);
                            zzx3 = zzki.zzx(i12 << 3);
                            zzy = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i12, i11)) {
                            long zzz = zzz(obj, j10);
                            zzx7 = zzki.zzx(i12 << 3);
                            zzy2 = zzki.zzy((zzz + zzz) ^ (zzz >> 63));
                            zzn = zzx7 + zzy2;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i12, i11)) {
                            zzn = zzki.zzt(i12, (zzmi) zznu.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zznk zznkVar = this.zzn;
            return i10 + zznkVar.zza(zznkVar.zzd(obj));
        }
        return zzo(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzy = zzy(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & zzy;
            int i15 = 37;
            switch (zzx(zzy)) {
                case 0:
                    i10 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zznu.zza(obj, j10));
                    byte[] bArr = zzlj.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zznu.zzb(obj, j10));
                    i12 = i11 + floatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    doubleToLongBits = zznu.zzd(obj, j10);
                    byte[] bArr2 = zzlj.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i12 * 53;
                    doubleToLongBits = zznu.zzd(obj, j10);
                    byte[] bArr3 = zzlj.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i12 * 53;
                    floatToIntBits = zznu.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    doubleToLongBits = zznu.zzd(obj, j10);
                    byte[] bArr4 = zzlj.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i12 * 53;
                    floatToIntBits = zznu.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 7:
                    i11 = i12 * 53;
                    floatToIntBits = zzlj.zza(zznu.zzw(obj, j10));
                    i12 = i11 + floatToIntBits;
                    break;
                case 8:
                    i11 = i12 * 53;
                    floatToIntBits = ((String) zznu.zzf(obj, j10)).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 9:
                    Object zzf = zznu.zzf(obj, j10);
                    if (zzf != null) {
                        i15 = zzf.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    floatToIntBits = zznu.zzf(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 11:
                    i11 = i12 * 53;
                    floatToIntBits = zznu.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 12:
                    i11 = i12 * 53;
                    floatToIntBits = zznu.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 13:
                    i11 = i12 * 53;
                    floatToIntBits = zznu.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    doubleToLongBits = zznu.zzd(obj, j10);
                    byte[] bArr5 = zzlj.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i12 * 53;
                    floatToIntBits = zznu.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = zznu.zzd(obj, j10);
                    byte[] bArr6 = zzlj.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object zzf2 = zznu.zzf(obj, j10);
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
                    floatToIntBits = zznu.zzf(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 50:
                    i11 = i12 * 53;
                    floatToIntBits = zznu.zzf(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 51:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j10));
                        byte[] bArr7 = zzlj.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j10));
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr8 = zzlj.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr9 = zzlj.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr10 = zzlj.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzlj.zza(zzU(obj, j10));
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = ((String) zznu.zzf(obj, j10)).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zznu.zzf(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zznu.zzf(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr11 = zzlj.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr12 = zzlj.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zznu.zzf(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + this.zzn.zzd(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0401, code lost:
    
        if (r6 == 1048575) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0403, code lost:
    
        r27.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0409, code lost:
    
        r2 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x040d, code lost:
    
        if (r2 >= r8.zzl) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x040f, code lost:
    
        r4 = r8.zzj[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zznu.zzf(r12, r8.zzy(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0421, code lost:
    
        if (r5 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0428, code lost:
    
        if (r8.zzA(r4) != null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x042a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x042d, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzmc) r5;
        r0 = (com.google.android.gms.internal.measurement.zzmb) r8.zzC(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0435, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0436, code lost:
    
        if (r9 != 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x043a, code lost:
    
        if (r0 != r32) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0441, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0444, code lost:
    
        if (r0 > r32) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0446, code lost:
    
        if (r3 != r9) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0448, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x044d, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzjn r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzjn):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        if (!zzS(obj)) {
            return;
        }
        if (obj instanceof zzlb) {
            zzlb zzlbVar = (zzlb) obj;
            zzlbVar.zzbP(Integer.MAX_VALUE);
            zzlbVar.zzb = 0;
            zzlbVar.zzbN();
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzy = zzy(i10);
            int i11 = 1048575 & zzy;
            int zzx = zzx(zzy);
            long j10 = i11;
            if (zzx != 9) {
                if (zzx != 60 && zzx != 68) {
                    switch (zzx) {
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
                            this.zzm.zza(obj, j10);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((zzmc) object).zzc();
                                unsafe.putObject(obj, j10, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzT(obj, this.zzc[i10], i10)) {
                    zzB(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            if (zzP(obj, i10)) {
                zzB(i10).zzf(zzb.getObject(obj, j10));
            }
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzy = zzy(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i10)) {
                        zznu.zzo(obj, j10, zznu.zza(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i10)) {
                        zznu.zzp(obj, j10, zznu.zzb(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i10)) {
                        zznu.zzr(obj, j10, zznu.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i10)) {
                        zznu.zzr(obj, j10, zznu.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i10)) {
                        zznu.zzr(obj, j10, zznu.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i10)) {
                        zznu.zzm(obj, j10, zznu.zzw(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i10)) {
                        zznu.zzs(obj, j10, zznu.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzP(obj2, i10)) {
                        zznu.zzs(obj, j10, zznu.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i10)) {
                        zznu.zzr(obj, j10, zznu.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i10)) {
                        zznu.zzr(obj, j10, zznu.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i10);
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
                    this.zzm.zzb(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzmv.zza;
                    zznu.zzs(obj, j10, zzmd.zzb(zznu.zzf(obj, j10), zznu.zzf(obj2, j10)));
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
                    if (zzT(obj2, i11, i10)) {
                        zznu.zzs(obj, j10, zznu.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i11, i10)) {
                        zznu.zzs(obj, j10, zznu.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i10);
                    break;
            }
        }
        zzmv.zzC(this.zzn, obj, obj2);
        if (!this.zzh) {
            return;
        }
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ed, code lost:
    
        if (r0 != r24) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ef, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0300, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x032c, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x034f, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzjn r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzjn):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        int i10;
        int i11 = 1048575;
        if (this.zzi) {
            if (!this.zzh) {
                int length = this.zzc.length;
                for (int i12 = 0; i12 < length; i12 += 3) {
                    int zzy = zzy(i12);
                    int i13 = this.zzc[i12];
                    switch (zzx(zzy)) {
                        case 0:
                            if (zzP(obj, i12)) {
                                zzocVar.zzf(i13, zznu.zza(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzP(obj, i12)) {
                                zzocVar.zzo(i13, zznu.zzb(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzP(obj, i12)) {
                                zzocVar.zzt(i13, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzP(obj, i12)) {
                                zzocVar.zzJ(i13, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzP(obj, i12)) {
                                zzocVar.zzr(i13, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzP(obj, i12)) {
                                zzocVar.zzm(i13, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzP(obj, i12)) {
                                zzocVar.zzk(i13, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzP(obj, i12)) {
                                zzocVar.zzb(i13, zznu.zzw(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzP(obj, i12)) {
                                zzV(i13, zznu.zzf(obj, zzy & 1048575), zzocVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzP(obj, i12)) {
                                zzocVar.zzv(i13, zznu.zzf(obj, zzy & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzP(obj, i12)) {
                                zzocVar.zzd(i13, (zzka) zznu.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzP(obj, i12)) {
                                zzocVar.zzH(i13, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzP(obj, i12)) {
                                zzocVar.zzi(i13, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzP(obj, i12)) {
                                zzocVar.zzw(i13, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzP(obj, i12)) {
                                zzocVar.zzy(i13, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzP(obj, i12)) {
                                zzocVar.zzA(i13, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzP(obj, i12)) {
                                zzocVar.zzC(i13, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzP(obj, i12)) {
                                zzocVar.zzq(i13, zznu.zzf(obj, zzy & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzmv.zzG(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 19:
                            zzmv.zzK(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 20:
                            zzmv.zzN(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 21:
                            zzmv.zzV(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 22:
                            zzmv.zzM(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 23:
                            zzmv.zzJ(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 24:
                            zzmv.zzI(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 25:
                            zzmv.zzE(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 26:
                            zzmv.zzT(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        case 27:
                            zzmv.zzO(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i12));
                            break;
                        case 28:
                            zzmv.zzF(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        case 29:
                            zzmv.zzU(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 30:
                            zzmv.zzH(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 31:
                            zzmv.zzP(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 32:
                            zzmv.zzQ(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 33:
                            zzmv.zzR(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 34:
                            zzmv.zzS(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 35:
                            zzmv.zzG(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 36:
                            zzmv.zzK(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 37:
                            zzmv.zzN(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 38:
                            zzmv.zzV(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 39:
                            zzmv.zzM(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 40:
                            zzmv.zzJ(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 41:
                            zzmv.zzI(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 42:
                            zzmv.zzE(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 43:
                            zzmv.zzU(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 44:
                            zzmv.zzH(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 45:
                            zzmv.zzP(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 46:
                            zzmv.zzQ(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 47:
                            zzmv.zzR(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 48:
                            zzmv.zzS(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 49:
                            zzmv.zzL(i13, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i12));
                            break;
                        case 50:
                            zzN(zzocVar, i13, zznu.zzf(obj, zzy & 1048575), i12);
                            break;
                        case 51:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzf(i13, zzm(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzo(i13, zzn(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzt(i13, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzJ(i13, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzr(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzm(i13, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzk(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzb(i13, zzU(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzT(obj, i13, i12)) {
                                zzV(i13, zznu.zzf(obj, zzy & 1048575), zzocVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzv(i13, zznu.zzf(obj, zzy & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzd(i13, (zzka) zznu.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzH(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzi(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzw(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzy(i13, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzA(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzC(i13, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzq(i13, zznu.zzf(obj, zzy & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zznk zznkVar = this.zzn;
                zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
                return;
            }
            this.zzo.zza(obj);
            throw null;
        } else if (!this.zzh) {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i14 = 0;
            int i15 = 1048575;
            int i16 = 0;
            while (i14 < length2) {
                int zzy2 = zzy(i14);
                int[] iArr = this.zzc;
                int i17 = iArr[i14];
                int zzx = zzx(zzy2);
                if (zzx <= 17) {
                    int i18 = iArr[i14 + 2];
                    int i19 = i18 & i11;
                    if (i19 != i15) {
                        i16 = unsafe.getInt(obj, i19);
                        i15 = i19;
                    }
                    i10 = 1 << (i18 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = zzy2 & i11;
                switch (zzx) {
                    case 0:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzf(i17, zznu.zza(obj, j10));
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 1:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzo(i17, zznu.zzb(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 2:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzt(i17, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 3:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzJ(i17, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 4:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzr(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 5:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzm(i17, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 6:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzk(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 7:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzb(i17, zznu.zzw(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 8:
                        if ((i16 & i10) != 0) {
                            zzV(i17, unsafe.getObject(obj, j10), zzocVar);
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 9:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzv(i17, unsafe.getObject(obj, j10), zzB(i14));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 10:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzd(i17, (zzka) unsafe.getObject(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 11:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzH(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 12:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzi(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 13:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzw(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 14:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzy(i17, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 15:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzA(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 16:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzC(i17, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 17:
                        if ((i16 & i10) != 0) {
                            zzocVar.zzq(i17, unsafe.getObject(obj, j10), zzB(i14));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 18:
                        zzmv.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 19:
                        zzmv.zzK(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 20:
                        zzmv.zzN(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 21:
                        zzmv.zzV(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 22:
                        zzmv.zzM(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 23:
                        zzmv.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 24:
                        zzmv.zzI(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 25:
                        zzmv.zzE(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 26:
                        zzmv.zzT(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar);
                        break;
                    case 27:
                        zzmv.zzO(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, zzB(i14));
                        break;
                    case 28:
                        zzmv.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar);
                        break;
                    case 29:
                        zzmv.zzU(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 30:
                        zzmv.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 31:
                        zzmv.zzP(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 32:
                        zzmv.zzQ(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 33:
                        zzmv.zzR(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 34:
                        zzmv.zzS(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 35:
                        zzmv.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 36:
                        zzmv.zzK(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 37:
                        zzmv.zzN(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 38:
                        zzmv.zzV(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 39:
                        zzmv.zzM(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 40:
                        zzmv.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 41:
                        zzmv.zzI(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 42:
                        zzmv.zzE(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 43:
                        zzmv.zzU(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 44:
                        zzmv.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 45:
                        zzmv.zzP(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 46:
                        zzmv.zzQ(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 47:
                        zzmv.zzR(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 48:
                        zzmv.zzS(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        break;
                    case 49:
                        zzmv.zzL(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzocVar, zzB(i14));
                        break;
                    case 50:
                        zzN(zzocVar, i17, unsafe.getObject(obj, j10), i14);
                        break;
                    case 51:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzf(i17, zzm(obj, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzo(i17, zzn(obj, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzt(i17, zzz(obj, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzJ(i17, zzz(obj, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzr(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzm(i17, zzz(obj, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzk(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzb(i17, zzU(obj, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (zzT(obj, i17, i14)) {
                            zzV(i17, unsafe.getObject(obj, j10), zzocVar);
                            break;
                        }
                        break;
                    case 60:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzv(i17, unsafe.getObject(obj, j10), zzB(i14));
                            break;
                        }
                        break;
                    case 61:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzd(i17, (zzka) unsafe.getObject(obj, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzH(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzi(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzw(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzy(i17, zzz(obj, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzA(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzC(i17, zzz(obj, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (zzT(obj, i17, i14)) {
                            zzocVar.zzq(i17, unsafe.getObject(obj, j10), zzB(i14));
                            break;
                        }
                        break;
                }
                i14 += 3;
                i11 = 1048575;
            }
            zznk zznkVar2 = this.zzn;
            zznkVar2.zzi(zznkVar2.zzd(obj), zzocVar);
        } else {
            this.zzo.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzW;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzy = zzy(i10);
            long j10 = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i10) && Double.doubleToLongBits(zznu.zza(obj, j10)) == Double.doubleToLongBits(zznu.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i10) && Float.floatToIntBits(zznu.zzb(obj, j10)) == Float.floatToIntBits(zznu.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i10) && zznu.zzd(obj, j10) == zznu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i10) && zznu.zzd(obj, j10) == zznu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i10) && zznu.zzc(obj, j10) == zznu.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i10) && zznu.zzd(obj, j10) == zznu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i10) && zznu.zzc(obj, j10) == zznu.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i10) && zznu.zzw(obj, j10) == zznu.zzw(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i10) && zzmv.zzW(zznu.zzf(obj, j10), zznu.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i10) && zzmv.zzW(zznu.zzf(obj, j10), zznu.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i10) && zzmv.zzW(zznu.zzf(obj, j10), zznu.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i10) && zznu.zzc(obj, j10) == zznu.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i10) && zznu.zzc(obj, j10) == zznu.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i10) && zznu.zzc(obj, j10) == zznu.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i10) && zznu.zzd(obj, j10) == zznu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i10) && zznu.zzc(obj, j10) == zznu.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i10) && zznu.zzd(obj, j10) == zznu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i10) && zzmv.zzW(zznu.zzf(obj, j10), zznu.zzf(obj2, j10))) {
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
                    zzW = zzmv.zzW(zznu.zzf(obj, j10), zznu.zzf(obj2, j10));
                    break;
                case 50:
                    zzW = zzmv.zzW(zznu.zzf(obj, j10), zznu.zzf(obj2, j10));
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
                    long zzv = zzv(i10) & 1048575;
                    if (zznu.zzc(obj, zzv) == zznu.zzc(obj2, zzv) && zzmv.zzW(zznu.zzf(obj, j10), zznu.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzW) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzk) {
            int i15 = this.zzj[i14];
            int i16 = this.zzc[i15];
            int zzy = zzy(i15);
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
            if ((268435456 & zzy) != 0 && !zzQ(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx != 60 && zzx != 68) {
                        if (zzx != 49) {
                            if (zzx == 50 && !((zzmc) zznu.zzf(obj, zzy & 1048575)).isEmpty()) {
                                zzmb zzmbVar = (zzmb) zzC(i15);
                                throw null;
                            }
                        }
                    } else if (zzT(obj, i16, i15) && !zzR(obj, zzy, zzB(i15))) {
                        return false;
                    }
                }
                List list = (List) zznu.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmt zzB = zzB(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzB.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzQ(obj, i15, i10, i11, i19) && !zzR(obj, zzy, zzB(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
