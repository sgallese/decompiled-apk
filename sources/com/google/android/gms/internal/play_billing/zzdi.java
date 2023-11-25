package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public final class zzdi<T> implements zzdp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzeq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzdf zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzct zzl;
    private final zzeg zzm;
    private final zzbo zzn;
    private final int zzo;
    private final zzdk zzp;
    private final zzda zzq;

    private zzdi(int[] iArr, Object[] objArr, int i10, int i11, zzdf zzdfVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzdk zzdkVar, zzct zzctVar, zzeg zzegVar, zzbo zzboVar, zzda zzdaVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzo = i12;
        boolean z11 = false;
        if (zzboVar != null && zzboVar.zzc(zzdfVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i13;
        this.zzk = i14;
        this.zzp = zzdkVar;
        this.zzl = zzctVar;
        this.zzm = zzegVar;
        this.zzn = zzboVar;
        this.zzg = zzdfVar;
        this.zzq = zzdaVar;
    }

    private final zzce zzA(int i10) {
        int i11 = i10 / 3;
        return (zzce) this.zzd[i11 + i11 + 1];
    }

    private final zzdp zzB(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzdp zzdpVar = (zzdp) this.zzd[i12];
        if (zzdpVar != null) {
            return zzdpVar;
        }
        zzdp zzb2 = zzdn.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzD(Object obj, int i10) {
        zzdp zzB = zzB(i10);
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
        zzdp zzB = zzB(i11);
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
            zzdp zzB = zzB(i10);
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
            zzdp zzB = zzB(i10);
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
        zzeq.zzq(obj, j10, (1 << (zzv >>> 20)) | zzeq.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzeq.zzq(obj, zzv(i11) & 1048575, i10);
    }

    private final void zzL(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzy(i10) & 1048575, obj2);
        zzJ(obj, i10);
    }

    private final void zzM(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzy(i11) & 1048575, obj2);
        zzK(obj, i10, i11);
    }

    private final void zzN(zzey zzeyVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        zzcy zzcyVar = (zzcy) zzC(i11);
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
                    if (Double.doubleToRawLongBits(zzeq.zza(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzeq.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzeq.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzeq.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzeq.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzeq.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzeq.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzeq.zzw(obj, j11);
                case 8:
                    Object zzf = zzeq.zzf(obj, j11);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzba) {
                        if (zzba.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzeq.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzba.zzb.equals(zzeq.zzf(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzeq.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzeq.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzeq.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzeq.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzeq.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzeq.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzeq.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzeq.zzc(obj, j10) & (1 << (zzv >>> 20))) == 0) {
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

    private static boolean zzR(Object obj, int i10, zzdp zzdpVar) {
        return zzdpVar.zzk(zzeq.zzf(obj, i10 & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcb) {
            return ((zzcb) obj).zzt();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i10, int i11) {
        if (zzeq.zzc(obj, zzv(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzU(Object obj, long j10) {
        return ((Boolean) zzeq.zzf(obj, j10)).booleanValue();
    }

    private static final void zzV(int i10, Object obj, zzey zzeyVar) throws IOException {
        if (obj instanceof String) {
            zzeyVar.zzF(i10, (String) obj);
        } else {
            zzeyVar.zzd(i10, (zzba) obj);
        }
    }

    static zzeh zzd(Object obj) {
        zzcb zzcbVar = (zzcb) obj;
        zzeh zzehVar = zzcbVar.zzc;
        if (zzehVar == zzeh.zzc()) {
            zzeh zzf = zzeh.zzf();
            zzcbVar.zzc = zzf;
            return zzf;
        }
        return zzehVar;
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
    public static com.google.android.gms.internal.play_billing.zzdi zzl(java.lang.Class r30, com.google.android.gms.internal.play_billing.zzdc r31, com.google.android.gms.internal.play_billing.zzdk r32, com.google.android.gms.internal.play_billing.zzct r33, com.google.android.gms.internal.play_billing.zzeg r34, com.google.android.gms.internal.play_billing.zzbo r35, com.google.android.gms.internal.play_billing.zzda r36) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzdc, com.google.android.gms.internal.play_billing.zzdk, com.google.android.gms.internal.play_billing.zzct, com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzbo, com.google.android.gms.internal.play_billing.zzda):com.google.android.gms.internal.play_billing.zzdi");
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zzeq.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zzeq.zzf(obj, j10)).floatValue();
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
                        zzx = zzbi.zzx(i17 << 3);
                        zzx4 = zzx + 8;
                        i14 += zzx4;
                        break;
                    }
                case 1:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i17 << 3);
                        zzx4 = zzx2 + 4;
                        i14 += zzx4;
                        break;
                    }
                case 2:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzy(unsafe.getLong(obj, j10));
                        zzx3 = zzbi.zzx(i17 << 3);
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 3:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzy(unsafe.getLong(obj, j10));
                        zzx3 = zzbi.zzx(i17 << 3);
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 4:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzu(unsafe.getInt(obj, j10));
                        zzx3 = zzbi.zzx(i17 << 3);
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 5:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i17 << 3);
                        zzx4 = zzx + 8;
                        i14 += zzx4;
                        break;
                    }
                case 6:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i17 << 3);
                        zzx4 = zzx2 + 4;
                        i14 += zzx4;
                        break;
                    }
                case 7:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx4 = zzbi.zzx(i17 << 3) + 1;
                        i14 += zzx4;
                        break;
                    }
                case 8:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzba) {
                            int i21 = zzbi.zzb;
                            int zzd = ((zzba) object).zzd();
                            zzx5 = zzbi.zzx(zzd) + zzd;
                            zzx6 = zzbi.zzx(i17 << 3);
                            zzx4 = zzx6 + zzx5;
                            i14 += zzx4;
                            break;
                        } else {
                            zzy = zzbi.zzw((String) object);
                            zzx3 = zzbi.zzx(i17 << 3);
                            i14 += zzx3 + zzy;
                            break;
                        }
                    }
                case 9:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx4 = zzdr.zzn(i17, unsafe.getObject(obj, j10), zzB(i13));
                        i14 += zzx4;
                        break;
                    }
                case 10:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzba zzbaVar = (zzba) unsafe.getObject(obj, j10);
                        int i22 = zzbi.zzb;
                        int zzd2 = zzbaVar.zzd();
                        zzx5 = zzbi.zzx(zzd2) + zzd2;
                        zzx6 = zzbi.zzx(i17 << 3);
                        zzx4 = zzx6 + zzx5;
                        i14 += zzx4;
                        break;
                    }
                case 11:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzx(unsafe.getInt(obj, j10));
                        zzx3 = zzbi.zzx(i17 << 3);
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 12:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzu(unsafe.getInt(obj, j10));
                        zzx3 = zzbi.zzx(i17 << 3);
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 13:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i17 << 3);
                        zzx4 = zzx2 + 4;
                        i14 += zzx4;
                        break;
                    }
                case 14:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i17 << 3);
                        zzx4 = zzx + 8;
                        i14 += zzx4;
                        break;
                    }
                case 15:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(obj, j10);
                        zzx3 = zzbi.zzx(i17 << 3);
                        zzy = zzbi.zzx((i23 >> 31) ^ (i23 + i23));
                        i14 += zzx3 + zzy;
                        break;
                    }
                case 16:
                    if ((i10 & i16) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j10);
                        i14 += zzbi.zzx(i17 << 3) + zzbi.zzy((j11 >> 63) ^ (j11 + j11));
                        break;
                    }
                case 17:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        zzx4 = zzbi.zzt(i17, (zzdf) unsafe.getObject(obj, j10), zzB(i13));
                        i14 += zzx4;
                        break;
                    }
                case 18:
                    zzx4 = zzdr.zzg(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 19:
                    zzx4 = zzdr.zze(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 20:
                    zzx4 = zzdr.zzl(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 21:
                    zzx4 = zzdr.zzw(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 22:
                    zzx4 = zzdr.zzj(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 23:
                    zzx4 = zzdr.zzg(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 24:
                    zzx4 = zzdr.zze(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 25:
                    zzx4 = zzdr.zza(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzx4;
                    break;
                case 26:
                    zzt = zzdr.zzt(i17, (List) unsafe.getObject(obj, j10));
                    i14 += zzt;
                    break;
                case 27:
                    zzt = zzdr.zzo(i17, (List) unsafe.getObject(obj, j10), zzB(i13));
                    i14 += zzt;
                    break;
                case 28:
                    zzt = zzdr.zzb(i17, (List) unsafe.getObject(obj, j10));
                    i14 += zzt;
                    break;
                case 29:
                    zzt = zzdr.zzu(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 30:
                    zzt = zzdr.zzc(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 31:
                    zzt = zzdr.zze(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 32:
                    zzt = zzdr.zzg(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 33:
                    zzt = zzdr.zzp(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 34:
                    zzt = zzdr.zzr(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 35:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 36:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 37:
                    zzh = zzdr.zzm((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 38:
                    zzh = zzdr.zzx((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 39:
                    zzh = zzdr.zzk((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 40:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 41:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i24 = zzdr.zza;
                    zzh = list.size();
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 43:
                    zzh = zzdr.zzv((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 44:
                    zzh = zzdr.zzd((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 45:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 46:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 47:
                    zzh = zzdr.zzq((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 48:
                    zzh = zzdr.zzs((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i17 << 3);
                        i11 = zzx8 + zzx7;
                        i14 += i11 + zzh;
                    }
                    break;
                case 49:
                    zzt = zzdr.zzi(i17, (List) unsafe.getObject(obj, j10), zzB(i13));
                    i14 += zzt;
                    break;
                case 50:
                    zzda.zza(i17, unsafe.getObject(obj, j10), zzC(i13));
                    break;
                case 51:
                    if (zzT(obj, i17, i13)) {
                        zzx9 = zzbi.zzx(i17 << 3);
                        zzt = zzx9 + 8;
                        i14 += zzt;
                    }
                    break;
                case 52:
                    if (zzT(obj, i17, i13)) {
                        zzx10 = zzbi.zzx(i17 << 3);
                        zzt = zzx10 + 4;
                        i14 += zzt;
                    }
                    break;
                case 53:
                    if (zzT(obj, i17, i13)) {
                        zzh = zzbi.zzy(zzz(obj, j10));
                        i11 = zzbi.zzx(i17 << 3);
                        i14 += i11 + zzh;
                    }
                    break;
                case 54:
                    if (zzT(obj, i17, i13)) {
                        zzh = zzbi.zzy(zzz(obj, j10));
                        i11 = zzbi.zzx(i17 << 3);
                        i14 += i11 + zzh;
                    }
                    break;
                case 55:
                    if (zzT(obj, i17, i13)) {
                        zzh = zzbi.zzu(zzp(obj, j10));
                        i11 = zzbi.zzx(i17 << 3);
                        i14 += i11 + zzh;
                    }
                    break;
                case 56:
                    if (zzT(obj, i17, i13)) {
                        zzx9 = zzbi.zzx(i17 << 3);
                        zzt = zzx9 + 8;
                        i14 += zzt;
                    }
                    break;
                case 57:
                    if (zzT(obj, i17, i13)) {
                        zzx10 = zzbi.zzx(i17 << 3);
                        zzt = zzx10 + 4;
                        i14 += zzt;
                    }
                    break;
                case 58:
                    if (zzT(obj, i17, i13)) {
                        zzt = zzbi.zzx(i17 << 3) + 1;
                        i14 += zzt;
                    }
                    break;
                case 59:
                    if (zzT(obj, i17, i13)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzba) {
                            int i25 = zzbi.zzb;
                            int zzd3 = ((zzba) object2).zzd();
                            zzx11 = zzbi.zzx(zzd3) + zzd3;
                            zzx12 = zzbi.zzx(i17 << 3);
                            zzt = zzx12 + zzx11;
                            i14 += zzt;
                        } else {
                            zzh = zzbi.zzw((String) object2);
                            i11 = zzbi.zzx(i17 << 3);
                            i14 += i11 + zzh;
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i17, i13)) {
                        zzt = zzdr.zzn(i17, unsafe.getObject(obj, j10), zzB(i13));
                        i14 += zzt;
                    }
                    break;
                case 61:
                    if (zzT(obj, i17, i13)) {
                        zzba zzbaVar2 = (zzba) unsafe.getObject(obj, j10);
                        int i26 = zzbi.zzb;
                        int zzd4 = zzbaVar2.zzd();
                        zzx11 = zzbi.zzx(zzd4) + zzd4;
                        zzx12 = zzbi.zzx(i17 << 3);
                        zzt = zzx12 + zzx11;
                        i14 += zzt;
                    }
                    break;
                case 62:
                    if (zzT(obj, i17, i13)) {
                        zzh = zzbi.zzx(zzp(obj, j10));
                        i11 = zzbi.zzx(i17 << 3);
                        i14 += i11 + zzh;
                    }
                    break;
                case 63:
                    if (zzT(obj, i17, i13)) {
                        zzh = zzbi.zzu(zzp(obj, j10));
                        i11 = zzbi.zzx(i17 << 3);
                        i14 += i11 + zzh;
                    }
                    break;
                case 64:
                    if (zzT(obj, i17, i13)) {
                        zzx10 = zzbi.zzx(i17 << 3);
                        zzt = zzx10 + 4;
                        i14 += zzt;
                    }
                    break;
                case 65:
                    if (zzT(obj, i17, i13)) {
                        zzx9 = zzbi.zzx(i17 << 3);
                        zzt = zzx9 + 8;
                        i14 += zzt;
                    }
                    break;
                case 66:
                    if (zzT(obj, i17, i13)) {
                        int zzp = zzp(obj, j10);
                        i11 = zzbi.zzx(i17 << 3);
                        zzh = zzbi.zzx((zzp >> 31) ^ (zzp + zzp));
                        i14 += i11 + zzh;
                    }
                    break;
                case 67:
                    if (zzT(obj, i17, i13)) {
                        long zzz = zzz(obj, j10);
                        i14 += zzbi.zzx(i17 << 3) + zzbi.zzy((zzz >> 63) ^ (zzz + zzz));
                    }
                    break;
                case 68:
                    if (zzT(obj, i17, i13)) {
                        zzt = zzbi.zzt(i17, (zzdf) unsafe.getObject(obj, j10), zzB(i13));
                        i14 += zzt;
                    }
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        zzeg zzegVar = this.zzm;
        int zza2 = i14 + zzegVar.zza(zzegVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzn.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzeq.zzf(obj, j10)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzcz) object).zze()) {
            zzcz zzb2 = zzcz.zza().zzb();
            zzda.zzb(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzcy zzcyVar = (zzcy) zzC;
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzao.zzp(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzao.zzb(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzao.zzm(bArr, i10, zzanVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzanVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzao.zzj(bArr, i10, zzanVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzanVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzao.zzp(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzao.zzb(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzao.zzm(bArr, i10, zzanVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzanVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzao.zzj(bArr, i10, zzanVar);
                    int i22 = zzanVar.zza;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i15 & 536870912) != 0 && !zzev.zze(bArr, zzj2, zzj2 + i22)) {
                        throw zzci.zzc();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i22, zzcg.zzb));
                        zzj2 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object zzE = zzE(obj, i13, i17);
                    int zzo = zzao.zzo(zzE, zzB(i17), bArr, i10, i11, zzanVar);
                    zzM(obj, i13, i17, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzao.zza(bArr, i10, zzanVar);
                    unsafe.putObject(obj, j10, zzanVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzao.zzj(bArr, i10, zzanVar);
                    int i23 = zzanVar.zza;
                    zzce zzA = zzA(i17);
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
                    int zzj4 = zzao.zzj(bArr, i10, zzanVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzbe.zzb(zzanVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzao.zzm(bArr, i10, zzanVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzbe.zzc(zzanVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object zzE2 = zzE(obj, i13, i17);
                    int zzn = zzao.zzn(zzE2, zzB(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzanVar);
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
    private final int zzs(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.play_billing.zzan r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.play_billing.zzan):int");
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
        return ((Long) zzeq.zzf(obj, j10)).longValue();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
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
        zzew zzewVar = zzew.zza;
        if (this.zzo - 1 != 0) {
            Unsafe unsafe = zzb;
            int i10 = 0;
            for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
                int zzy3 = zzy(i11);
                int zzx10 = zzx(zzy3);
                int i12 = this.zzc[i11];
                int i13 = zzy3 & 1048575;
                if (zzx10 >= zzbt.zzJ.zza() && zzx10 <= zzbt.zzW.zza()) {
                    int i14 = this.zzc[i11 + 2];
                }
                long j10 = i13;
                switch (zzx10) {
                    case 0:
                        if (zzP(obj, i11)) {
                            zzx = zzbi.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i11)) {
                            zzx2 = zzbi.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i11)) {
                            zzy = zzbi.zzy(zzeq.zzd(obj, j10));
                            zzx3 = zzbi.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i11)) {
                            zzy = zzbi.zzy(zzeq.zzd(obj, j10));
                            zzx3 = zzbi.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i11)) {
                            zzy = zzbi.zzu(zzeq.zzc(obj, j10));
                            zzx3 = zzbi.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i11)) {
                            zzx = zzbi.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i11)) {
                            zzx2 = zzbi.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i11)) {
                            zzx4 = zzbi.zzx(i12 << 3);
                            zzn = zzx4 + 1;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i11)) {
                            Object zzf = zzeq.zzf(obj, j10);
                            if (zzf instanceof zzba) {
                                int i15 = i12 << 3;
                                int i16 = zzbi.zzb;
                                int zzd = ((zzba) zzf).zzd();
                                zzx5 = zzbi.zzx(zzd) + zzd;
                                zzx6 = zzbi.zzx(i15);
                                zzn = zzx6 + zzx5;
                                i10 += zzn;
                                break;
                            } else {
                                zzy = zzbi.zzw((String) zzf);
                                zzx3 = zzbi.zzx(i12 << 3);
                                i10 += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i11)) {
                            zzn = zzdr.zzn(i12, zzeq.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i11)) {
                            zzba zzbaVar = (zzba) zzeq.zzf(obj, j10);
                            int i17 = i12 << 3;
                            int i18 = zzbi.zzb;
                            int zzd2 = zzbaVar.zzd();
                            zzx5 = zzbi.zzx(zzd2) + zzd2;
                            zzx6 = zzbi.zzx(i17);
                            zzn = zzx6 + zzx5;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i11)) {
                            zzy = zzbi.zzx(zzeq.zzc(obj, j10));
                            zzx3 = zzbi.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i11)) {
                            zzy = zzbi.zzu(zzeq.zzc(obj, j10));
                            zzx3 = zzbi.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i11)) {
                            zzx2 = zzbi.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i11)) {
                            zzx = zzbi.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i11)) {
                            int zzc = zzeq.zzc(obj, j10);
                            zzx3 = zzbi.zzx(i12 << 3);
                            zzy = zzbi.zzx((zzc >> 31) ^ (zzc + zzc));
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i11)) {
                            long zzd3 = zzeq.zzd(obj, j10);
                            zzx7 = zzbi.zzx(i12 << 3);
                            zzy2 = zzbi.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                            zzn = zzx7 + zzy2;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i11)) {
                            zzn = zzbi.zzt(i12, (zzdf) zzeq.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzdr.zzg(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 19:
                        zzn = zzdr.zze(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 20:
                        zzn = zzdr.zzl(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 21:
                        zzn = zzdr.zzw(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 22:
                        zzn = zzdr.zzj(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 23:
                        zzn = zzdr.zzg(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 24:
                        zzn = zzdr.zze(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 25:
                        zzn = zzdr.zza(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 26:
                        zzn = zzdr.zzt(i12, (List) zzeq.zzf(obj, j10));
                        i10 += zzn;
                        break;
                    case 27:
                        zzn = zzdr.zzo(i12, (List) zzeq.zzf(obj, j10), zzB(i11));
                        i10 += zzn;
                        break;
                    case 28:
                        zzn = zzdr.zzb(i12, (List) zzeq.zzf(obj, j10));
                        i10 += zzn;
                        break;
                    case 29:
                        zzn = zzdr.zzu(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 30:
                        zzn = zzdr.zzc(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 31:
                        zzn = zzdr.zze(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 32:
                        zzn = zzdr.zzg(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 33:
                        zzn = zzdr.zzp(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 34:
                        zzn = zzdr.zzr(i12, (List) zzeq.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 35:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i19 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i19);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i20 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i20);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzy = zzdr.zzm((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i21 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i21);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzy = zzdr.zzx((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i22 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i22);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzy = zzdr.zzk((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i23 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i23);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i24 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i24);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i25 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i25);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list = (List) unsafe.getObject(obj, j10);
                        int i26 = zzdr.zza;
                        zzy = list.size();
                        if (zzy > 0) {
                            int i27 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i27);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzy = zzdr.zzv((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i28 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i28);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzy = zzdr.zzd((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i29 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i29);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i30 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i30);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i31 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i31);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzy = zzdr.zzq((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i32 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i32);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzy = zzdr.zzs((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i33 = i12 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i33);
                            zzx3 = zzx9 + zzx8;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzn = zzdr.zzi(i12, (List) zzeq.zzf(obj, j10), zzB(i11));
                        i10 += zzn;
                        break;
                    case 50:
                        zzda.zza(i12, zzeq.zzf(obj, j10), zzC(i11));
                        break;
                    case 51:
                        if (zzT(obj, i12, i11)) {
                            zzx = zzbi.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i12, i11)) {
                            zzx2 = zzbi.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzbi.zzy(zzz(obj, j10));
                            zzx3 = zzbi.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzbi.zzy(zzz(obj, j10));
                            zzx3 = zzbi.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzbi.zzu(zzp(obj, j10));
                            zzx3 = zzbi.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i12, i11)) {
                            zzx = zzbi.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i12, i11)) {
                            zzx2 = zzbi.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i12, i11)) {
                            zzx4 = zzbi.zzx(i12 << 3);
                            zzn = zzx4 + 1;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i12, i11)) {
                            Object zzf2 = zzeq.zzf(obj, j10);
                            if (zzf2 instanceof zzba) {
                                int i34 = i12 << 3;
                                int i35 = zzbi.zzb;
                                int zzd4 = ((zzba) zzf2).zzd();
                                zzx5 = zzbi.zzx(zzd4) + zzd4;
                                zzx6 = zzbi.zzx(i34);
                                zzn = zzx6 + zzx5;
                                i10 += zzn;
                                break;
                            } else {
                                zzy = zzbi.zzw((String) zzf2);
                                zzx3 = zzbi.zzx(i12 << 3);
                                i10 += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i12, i11)) {
                            zzn = zzdr.zzn(i12, zzeq.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i12, i11)) {
                            zzba zzbaVar2 = (zzba) zzeq.zzf(obj, j10);
                            int i36 = i12 << 3;
                            int i37 = zzbi.zzb;
                            int zzd5 = zzbaVar2.zzd();
                            zzx5 = zzbi.zzx(zzd5) + zzd5;
                            zzx6 = zzbi.zzx(i36);
                            zzn = zzx6 + zzx5;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzbi.zzx(zzp(obj, j10));
                            zzx3 = zzbi.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzbi.zzu(zzp(obj, j10));
                            zzx3 = zzbi.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i12, i11)) {
                            zzx2 = zzbi.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i12, i11)) {
                            zzx = zzbi.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i12, i11)) {
                            int zzp = zzp(obj, j10);
                            zzx3 = zzbi.zzx(i12 << 3);
                            zzy = zzbi.zzx((zzp >> 31) ^ (zzp + zzp));
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i12, i11)) {
                            long zzz = zzz(obj, j10);
                            zzx7 = zzbi.zzx(i12 << 3);
                            zzy2 = zzbi.zzy((zzz + zzz) ^ (zzz >> 63));
                            zzn = zzx7 + zzy2;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i12, i11)) {
                            zzn = zzbi.zzt(i12, (zzdf) zzeq.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzeg zzegVar = this.zzm;
            return i10 + zzegVar.zza(zzegVar.zzd(obj));
        }
        return zzo(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
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
                    doubleToLongBits = Double.doubleToLongBits(zzeq.zza(obj, j10));
                    byte[] bArr = zzcg.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zzeq.zzb(obj, j10));
                    i12 = i11 + floatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j10);
                    byte[] bArr2 = zzcg.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i12 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j10);
                    byte[] bArr3 = zzcg.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i12 * 53;
                    floatToIntBits = zzeq.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j10);
                    byte[] bArr4 = zzcg.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i12 * 53;
                    floatToIntBits = zzeq.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 7:
                    i11 = i12 * 53;
                    floatToIntBits = zzcg.zza(zzeq.zzw(obj, j10));
                    i12 = i11 + floatToIntBits;
                    break;
                case 8:
                    i11 = i12 * 53;
                    floatToIntBits = ((String) zzeq.zzf(obj, j10)).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 9:
                    Object zzf = zzeq.zzf(obj, j10);
                    if (zzf != null) {
                        i15 = zzf.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    floatToIntBits = zzeq.zzf(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 11:
                    i11 = i12 * 53;
                    floatToIntBits = zzeq.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 12:
                    i11 = i12 * 53;
                    floatToIntBits = zzeq.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 13:
                    i11 = i12 * 53;
                    floatToIntBits = zzeq.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j10);
                    byte[] bArr5 = zzcg.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i12 * 53;
                    floatToIntBits = zzeq.zzc(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j10);
                    byte[] bArr6 = zzcg.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object zzf2 = zzeq.zzf(obj, j10);
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
                    floatToIntBits = zzeq.zzf(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 50:
                    i11 = i12 * 53;
                    floatToIntBits = zzeq.zzf(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 51:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j10));
                        byte[] bArr7 = zzcg.zzd;
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
                        byte[] bArr8 = zzcg.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr9 = zzcg.zzd;
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
                        byte[] bArr10 = zzcg.zzd;
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
                        floatToIntBits = zzcg.zza(zzU(obj, j10));
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = ((String) zzeq.zzf(obj, j10)).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzeq.zzf(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzeq.zzf(obj, j10).hashCode();
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
                        byte[] bArr11 = zzcg.zzd;
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
                        byte[] bArr12 = zzcg.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzeq.zzf(obj, j10).hashCode();
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
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0401, code lost:
    
        if (r6 == 1048575) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0403, code lost:
    
        r27.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0409, code lost:
    
        r2 = r8.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x040d, code lost:
    
        if (r2 >= r8.zzk) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x040f, code lost:
    
        r4 = r8.zzi[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r8.zzy(r4) & 1048575);
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
    
        r5 = (com.google.android.gms.internal.play_billing.zzcz) r5;
        r0 = (com.google.android.gms.internal.play_billing.zzcy) r8.zzC(r4);
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
    
        throw com.google.android.gms.internal.play_billing.zzci.zze();
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
    
        throw com.google.android.gms.internal.play_billing.zzci.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.play_billing.zzan r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzan):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final Object zze() {
        return ((zzcb) this.zzg).zzi();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzf(Object obj) {
        if (!zzS(obj)) {
            return;
        }
        if (obj instanceof zzcb) {
            zzcb zzcbVar = (zzcb) obj;
            zzcbVar.zzq(Integer.MAX_VALUE);
            zzcbVar.zza = 0;
            zzcbVar.zzo();
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
                            this.zzl.zza(obj, j10);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((zzcz) object).zzc();
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
        this.zzm.zzg(obj);
        if (this.zzh) {
            this.zzn.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
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
                        zzeq.zzo(obj, j10, zzeq.zza(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i10)) {
                        zzeq.zzp(obj, j10, zzeq.zzb(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i10)) {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i10)) {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i10)) {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i10)) {
                        zzeq.zzm(obj, j10, zzeq.zzw(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i10)) {
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
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
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i10)) {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i10)) {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
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
                    this.zzl.zzb(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzdr.zza;
                    zzeq.zzs(obj, j10, zzda.zzb(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10)));
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
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
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
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
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
        zzdr.zzB(this.zzm, obj, obj2);
        if (!this.zzh) {
            return;
        }
        this.zzn.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e6, code lost:
    
        if (r0 != r15) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x030a, code lost:
    
        if (r0 != r15) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02a3, code lost:
    
        if (r0 != r5) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02a5, code lost:
    
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r13 = r32;
        r11 = r33;
        r1 = r19;
        r2 = r22;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02b9, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r29, byte[] r30, int r31, int r32, com.google.android.gms.internal.play_billing.zzan r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.play_billing.zzan):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzi(Object obj, zzey zzeyVar) throws IOException {
        int i10;
        zzew zzewVar = zzew.zza;
        int i11 = 1048575;
        if (this.zzo - 1 != 0) {
            if (!this.zzh) {
                int length = this.zzc.length;
                for (int i12 = 0; i12 < length; i12 += 3) {
                    int zzy = zzy(i12);
                    int i13 = this.zzc[i12];
                    switch (zzx(zzy)) {
                        case 0:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzf(i13, zzeq.zza(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzo(i13, zzeq.zzb(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzt(i13, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzJ(i13, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzr(i13, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzm(i13, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzk(i13, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzb(i13, zzeq.zzw(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzP(obj, i12)) {
                                zzV(i13, zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzv(i13, zzeq.zzf(obj, zzy & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzd(i13, (zzba) zzeq.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzH(i13, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzi(i13, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzw(i13, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzy(i13, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzA(i13, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzC(i13, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzq(i13, zzeq.zzf(obj, zzy & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzdr.zzF(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 19:
                            zzdr.zzJ(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 20:
                            zzdr.zzM(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 21:
                            zzdr.zzU(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 22:
                            zzdr.zzL(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 23:
                            zzdr.zzI(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 24:
                            zzdr.zzH(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 25:
                            zzdr.zzD(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 26:
                            zzdr.zzS(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                            break;
                        case 27:
                            zzdr.zzN(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, zzB(i12));
                            break;
                        case 28:
                            zzdr.zzE(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                            break;
                        case 29:
                            zzdr.zzT(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 30:
                            zzdr.zzG(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 31:
                            zzdr.zzO(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 32:
                            zzdr.zzP(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 33:
                            zzdr.zzQ(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 34:
                            zzdr.zzR(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 35:
                            zzdr.zzF(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 36:
                            zzdr.zzJ(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 37:
                            zzdr.zzM(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 38:
                            zzdr.zzU(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 39:
                            zzdr.zzL(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 40:
                            zzdr.zzI(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 41:
                            zzdr.zzH(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 42:
                            zzdr.zzD(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 43:
                            zzdr.zzT(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 44:
                            zzdr.zzG(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 45:
                            zzdr.zzO(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 46:
                            zzdr.zzP(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 47:
                            zzdr.zzQ(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 48:
                            zzdr.zzR(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 49:
                            zzdr.zzK(i13, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, zzB(i12));
                            break;
                        case 50:
                            zzN(zzeyVar, i13, zzeq.zzf(obj, zzy & 1048575), i12);
                            break;
                        case 51:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzf(i13, zzm(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzo(i13, zzn(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzt(i13, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzJ(i13, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzr(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzm(i13, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzk(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzb(i13, zzU(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzT(obj, i13, i12)) {
                                zzV(i13, zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzv(i13, zzeq.zzf(obj, zzy & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzd(i13, (zzba) zzeq.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzH(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzi(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzw(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzy(i13, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzA(i13, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzC(i13, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzq(i13, zzeq.zzf(obj, zzy & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zzeg zzegVar = this.zzm;
                zzegVar.zzi(zzegVar.zzd(obj), zzeyVar);
                return;
            }
            this.zzn.zza(obj);
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
                            zzeyVar.zzf(i17, zzeq.zza(obj, j10));
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 1:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzo(i17, zzeq.zzb(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 2:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzt(i17, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 3:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzJ(i17, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 4:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzr(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 5:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzm(i17, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 6:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzk(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 7:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzb(i17, zzeq.zzw(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 8:
                        if ((i16 & i10) != 0) {
                            zzV(i17, unsafe.getObject(obj, j10), zzeyVar);
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 9:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzv(i17, unsafe.getObject(obj, j10), zzB(i14));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 10:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzd(i17, (zzba) unsafe.getObject(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 11:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzH(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 12:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzi(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 13:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzw(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 14:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzy(i17, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 15:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzA(i17, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 16:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzC(i17, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 17:
                        if ((i16 & i10) != 0) {
                            zzeyVar.zzq(i17, unsafe.getObject(obj, j10), zzB(i14));
                        } else {
                            continue;
                        }
                        i14 += 3;
                        i11 = 1048575;
                    case 18:
                        zzdr.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 19:
                        zzdr.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 20:
                        zzdr.zzM(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 21:
                        zzdr.zzU(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 22:
                        zzdr.zzL(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 23:
                        zzdr.zzI(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 24:
                        zzdr.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 25:
                        zzdr.zzD(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        continue;
                        i14 += 3;
                        i11 = 1048575;
                    case 26:
                        zzdr.zzS(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar);
                        break;
                    case 27:
                        zzdr.zzN(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, zzB(i14));
                        break;
                    case 28:
                        zzdr.zzE(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar);
                        break;
                    case 29:
                        zzdr.zzT(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 30:
                        zzdr.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 31:
                        zzdr.zzO(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 32:
                        zzdr.zzP(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 33:
                        zzdr.zzQ(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 34:
                        zzdr.zzR(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 35:
                        zzdr.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 36:
                        zzdr.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 37:
                        zzdr.zzM(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 38:
                        zzdr.zzU(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 39:
                        zzdr.zzL(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 40:
                        zzdr.zzI(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 41:
                        zzdr.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 42:
                        zzdr.zzD(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 43:
                        zzdr.zzT(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 44:
                        zzdr.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 45:
                        zzdr.zzO(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 46:
                        zzdr.zzP(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 47:
                        zzdr.zzQ(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 48:
                        zzdr.zzR(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        break;
                    case 49:
                        zzdr.zzK(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzeyVar, zzB(i14));
                        break;
                    case 50:
                        zzN(zzeyVar, i17, unsafe.getObject(obj, j10), i14);
                        break;
                    case 51:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzf(i17, zzm(obj, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzo(i17, zzn(obj, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzt(i17, zzz(obj, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzJ(i17, zzz(obj, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzr(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzm(i17, zzz(obj, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzk(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzb(i17, zzU(obj, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (zzT(obj, i17, i14)) {
                            zzV(i17, unsafe.getObject(obj, j10), zzeyVar);
                            break;
                        }
                        break;
                    case 60:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzv(i17, unsafe.getObject(obj, j10), zzB(i14));
                            break;
                        }
                        break;
                    case 61:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzd(i17, (zzba) unsafe.getObject(obj, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzH(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzi(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzw(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzy(i17, zzz(obj, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzA(i17, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzC(i17, zzz(obj, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (zzT(obj, i17, i14)) {
                            zzeyVar.zzq(i17, unsafe.getObject(obj, j10), zzB(i14));
                            break;
                        }
                        break;
                }
                i14 += 3;
                i11 = 1048575;
            }
            zzeg zzegVar2 = this.zzm;
            zzegVar2.zzi(zzegVar2.zzd(obj), zzeyVar);
        } else {
            this.zzn.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzV;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzy = zzy(i10);
            long j10 = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i10) && Double.doubleToLongBits(zzeq.zza(obj, j10)) == Double.doubleToLongBits(zzeq.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i10) && Float.floatToIntBits(zzeq.zzb(obj, j10)) == Float.floatToIntBits(zzeq.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i10) && zzeq.zzd(obj, j10) == zzeq.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i10) && zzeq.zzd(obj, j10) == zzeq.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i10) && zzeq.zzd(obj, j10) == zzeq.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i10) && zzeq.zzw(obj, j10) == zzeq.zzw(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i10) && zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i10) && zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i10) && zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i10) && zzeq.zzd(obj, j10) == zzeq.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i10) && zzeq.zzd(obj, j10) == zzeq.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i10) && zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
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
                    zzV = zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10));
                    break;
                case 50:
                    zzV = zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10));
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
                    if (zzeq.zzc(obj, zzv) == zzeq.zzc(obj2, zzv) && zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzV) {
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

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzj) {
            int i15 = this.zzi[i14];
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
                            if (zzx == 50 && !((zzcz) zzeq.zzf(obj, zzy & 1048575)).isEmpty()) {
                                zzcy zzcyVar = (zzcy) zzC(i15);
                                throw null;
                            }
                        }
                    } else if (zzT(obj, i16, i15) && !zzR(obj, zzy, zzB(i15))) {
                        return false;
                    }
                }
                List list = (List) zzeq.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzdp zzB = zzB(i15);
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
        this.zzn.zza(obj);
        throw null;
    }
}
