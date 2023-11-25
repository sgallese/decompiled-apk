package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgtd<T> implements zzgtt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzguu.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgta zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzgso zzm;
    private final zzguk zzn;
    private final zzgrd zzo;
    private final zzgtf zzp;
    private final zzgsv zzq;

    private zzgtd(int[] iArr, Object[] objArr, int i10, int i11, zzgta zzgtaVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzgtf zzgtfVar, zzgso zzgsoVar, zzguk zzgukVar, zzgrd zzgrdVar, zzgsv zzgsvVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzgtaVar instanceof zzgrq;
        boolean z11 = false;
        if (zzgrdVar != null && zzgrdVar.zzh(zzgtaVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzp = zzgtfVar;
        this.zzm = zzgsoVar;
        this.zzn = zzgukVar;
        this.zzo = zzgrdVar;
        this.zzg = zzgtaVar;
        this.zzq = zzgsvVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzgtt zzx = zzx(i10);
        int zzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzgtt zzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (!zzN(obj2, i10)) {
            return;
        }
        int zzu = zzu(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzu;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzgtt zzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (!zzR(obj2, i11, i10)) {
            return;
        }
        int zzu = zzu(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzu;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzgtt zzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzG(Object obj, int i10, zzgtl zzgtlVar) throws IOException {
        if (zzM(i10)) {
            zzguu.zzv(obj, i10 & 1048575, zzgtlVar.zzs());
        } else if (this.zzi) {
            zzguu.zzv(obj, i10 & 1048575, zzgtlVar.zzr());
        } else {
            zzguu.zzv(obj, i10 & 1048575, zzgtlVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = 1048575 & zzr;
        if (j10 == 1048575) {
            return;
        }
        zzguu.zzt(obj, j10, (1 << (zzr >>> 20)) | zzguu.zzd(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzguu.zzt(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        if (zzN(obj, i10) == zzN(obj2, i10)) {
            return true;
        }
        return false;
    }

    private static boolean zzM(int i10) {
        if ((i10 & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzN(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = zzr & 1048575;
        if (j10 == 1048575) {
            int zzu = zzu(i10);
            long j11 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzguu.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzguu.zzc(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzguu.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzguu.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzguu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzguu.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzguu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzguu.zzz(obj, j11);
                case 8:
                    Object zzh = zzguu.zzh(obj, j11);
                    if (zzh instanceof String) {
                        if (((String) zzh).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzh instanceof zzgqi) {
                        if (zzgqi.zzb.equals(zzh)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzguu.zzh(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzgqi.zzb.equals(zzguu.zzh(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzguu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzguu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzguu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzguu.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzguu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzguu.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzguu.zzh(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzguu.zzd(obj, j10) & (1 << (zzr >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzN(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzP(Object obj, int i10, zzgtt zzgttVar) {
        return zzgttVar.zzk(zzguu.zzh(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgrq) {
            return ((zzgrq) obj).zzaY();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        if (zzguu.zzd(obj, zzr(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzguu.zzh(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzgqy zzgqyVar) throws IOException {
        if (obj instanceof String) {
            zzgqyVar.zzF(i10, (String) obj);
        } else {
            zzgqyVar.zzd(i10, (zzgqi) obj);
        }
    }

    static zzgul zzd(Object obj) {
        zzgrq zzgrqVar = (zzgrq) obj;
        zzgul zzgulVar = zzgrqVar.zzc;
        if (zzgulVar == zzgul.zzc()) {
            zzgul zzf = zzgul.zzf();
            zzgrqVar.zzc = zzf;
            return zzf;
        }
        return zzgulVar;
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
    public static com.google.android.gms.internal.ads.zzgtd zzl(java.lang.Class r30, com.google.android.gms.internal.ads.zzgsx r31, com.google.android.gms.internal.ads.zzgtf r32, com.google.android.gms.internal.ads.zzgso r33, com.google.android.gms.internal.ads.zzguk r34, com.google.android.gms.internal.ads.zzgrd r35, com.google.android.gms.internal.ads.zzgsv r36) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgtd.zzl(java.lang.Class, com.google.android.gms.internal.ads.zzgsx, com.google.android.gms.internal.ads.zzgtf, com.google.android.gms.internal.ads.zzgso, com.google.android.gms.internal.ads.zzguk, com.google.android.gms.internal.ads.zzgrd, com.google.android.gms.internal.ads.zzgsv):com.google.android.gms.internal.ads.zzgtd");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzguu.zzh(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzguu.zzh(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzguu.zzh(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzs(i10, 0);
        }
        return -1;
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
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

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzguu.zzh(obj, j10)).longValue();
    }

    private final zzgru zzw(int i10) {
        int i11 = i10 / 3;
        return (zzgru) this.zzd[i11 + i11 + 1];
    }

    private final zzgtt zzx(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgtt zzgttVar = (zzgtt) this.zzd[i12];
        if (zzgttVar != null) {
            return zzgttVar;
        }
        zzgtt zzb2 = zzgti.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzguk zzgukVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzh = zzguu.zzh(obj, zzu(i10) & 1048575);
        if (zzh == null) {
            return obj2;
        }
        if (zzw(i10) == null) {
            return obj2;
        }
        zzgsu zzgsuVar = (zzgsu) zzh;
        zzgst zzgstVar = (zzgst) zzz(i10);
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final int zza(Object obj) {
        int i10;
        int i11;
        int i12;
        int zzA;
        int zzA2;
        int zzB;
        int zzA3;
        int zzA4;
        int zzA5;
        int zzA6;
        int zzh;
        int zzA7;
        int zzB2;
        int size;
        int zzl;
        int zzA8;
        int zzA9;
        int zzA10;
        int i13;
        int zzA11;
        int zzA12;
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
            int zzu = zzu(i19);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i21 = iArr[i19];
            int i22 = iArr[i19 + 2];
            int i23 = i22 & i16;
            if (zzt <= 17) {
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
            int i24 = zzu & i16;
            if (zzt >= zzgri.zzJ.zza()) {
                zzgri.zzW.zza();
            }
            long j10 = i24;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzA = zzgqx.zzA(i21 << 3);
                        zzh = zzA + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzA2 = zzgqx.zzA(i21 << 3);
                        zzh = zzA2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzB = zzgqx.zzB(unsafe.getLong(obj, j10));
                        zzA3 = zzgqx.zzA(i21 << 3);
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzB = zzgqx.zzB(unsafe.getLong(obj, j10));
                        zzA3 = zzgqx.zzA(i21 << 3);
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzB = zzgqx.zzx(unsafe.getInt(obj, j10));
                        zzA3 = zzgqx.zzA(i21 << 3);
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzA = zzgqx.zzA(i21 << 3);
                        zzh = zzA + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzA2 = zzgqx.zzA(i21 << 3);
                        zzh = zzA2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzA4 = zzgqx.zzA(i21 << 3);
                        zzh = zzA4 + 1;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzgqi) {
                            int i25 = zzgqx.zzf;
                            int zzd = ((zzgqi) object).zzd();
                            zzA5 = zzgqx.zzA(zzd) + zzd;
                            zzA6 = zzgqx.zzA(i21 << 3);
                            zzh = zzA6 + zzA5;
                            i20 += zzh;
                            break;
                        } else {
                            zzB = zzgqx.zzz((String) object);
                            zzA3 = zzgqx.zzA(i21 << 3);
                            i13 = zzA3 + zzB;
                            i20 += i13;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzh = zzgtv.zzh(i21, unsafe.getObject(obj, j10), zzx(i19));
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzgqi zzgqiVar = (zzgqi) unsafe.getObject(obj, j10);
                        int i26 = zzgqx.zzf;
                        int zzd2 = zzgqiVar.zzd();
                        zzA5 = zzgqx.zzA(zzd2) + zzd2;
                        zzA6 = zzgqx.zzA(i21 << 3);
                        zzh = zzA6 + zzA5;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzB = zzgqx.zzA(unsafe.getInt(obj, j10));
                        zzA3 = zzgqx.zzA(i21 << 3);
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzB = zzgqx.zzx(unsafe.getInt(obj, j10));
                        zzA3 = zzgqx.zzA(i21 << 3);
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzA2 = zzgqx.zzA(i21 << 3);
                        zzh = zzA2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzA = zzgqx.zzA(i21 << 3);
                        zzh = zzA + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        int i27 = unsafe.getInt(obj, j10);
                        zzA3 = zzgqx.zzA(i21 << 3);
                        zzB = zzgqx.zzA((i27 >> 31) ^ (i27 + i27));
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        long j11 = unsafe.getLong(obj, j10);
                        zzA7 = zzgqx.zzA(i21 << 3);
                        zzB2 = zzgqx.zzB((j11 >> 63) ^ (j11 + j11));
                        zzA9 = zzA7 + zzB2;
                        i20 += zzA9;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i19, i10, i11, i12)) {
                        zzh = zzgqx.zzw(i21, (zzgta) unsafe.getObject(obj, j10), zzx(i19));
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzh = zzgtv.zzd(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 19:
                    zzh = zzgtv.zzb(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i28 = zzgtv.zza;
                    if (list.size() != 0) {
                        zzA3 = zzgtv.zzg(list);
                        zzB = list.size() * zzgqx.zzA(i21 << 3);
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    }
                    i13 = 0;
                    i20 += i13;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i29 = zzgtv.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzgtv.zzl(list2);
                        zzA8 = zzgqx.zzA(i21 << 3);
                        zzh = zzl + (size * zzA8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i30 = zzgtv.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzgtv.zzf(list3);
                        zzA8 = zzgqx.zzA(i21 << 3);
                        zzh = zzl + (size * zzA8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 23:
                    zzh = zzgtv.zzd(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 24:
                    zzh = zzgtv.zzb(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzgtv.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzgqx.zzA(i21 << 3) + 1);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i32 = zzgtv.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        zzA9 = 0;
                    } else {
                        boolean z11 = list5 instanceof zzgsi;
                        zzA9 = zzgqx.zzA(i21 << 3) * size3;
                        if (z11) {
                            zzgsi zzgsiVar = (zzgsi) list5;
                            for (int i33 = 0; i33 < size3; i33++) {
                                Object zzf = zzgsiVar.zzf(i33);
                                if (zzf instanceof zzgqi) {
                                    int zzd3 = ((zzgqi) zzf).zzd();
                                    zzA9 += zzgqx.zzA(zzd3) + zzd3;
                                } else {
                                    zzA9 += zzgqx.zzz((String) zzf);
                                }
                            }
                        } else {
                            for (int i34 = 0; i34 < size3; i34++) {
                                Object obj2 = list5.get(i34);
                                if (obj2 instanceof zzgqi) {
                                    int zzd4 = ((zzgqi) obj2).zzd();
                                    zzA9 += zzgqx.zzA(zzd4) + zzd4;
                                } else {
                                    zzA9 += zzgqx.zzz((String) obj2);
                                }
                            }
                        }
                    }
                    i20 += zzA9;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    zzgtt zzx = zzx(i19);
                    int i35 = zzgtv.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA10 = 0;
                    } else {
                        zzA10 = zzgqx.zzA(i21 << 3) * size4;
                        for (int i36 = 0; i36 < size4; i36++) {
                            Object obj3 = list6.get(i36);
                            if (obj3 instanceof zzgsg) {
                                int zza2 = ((zzgsg) obj3).zza();
                                zzA10 += zzgqx.zzA(zza2) + zza2;
                            } else {
                                zzA10 += zzgqx.zzy((zzgta) obj3, zzx);
                            }
                        }
                    }
                    i20 += zzA10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i37 = zzgtv.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        i13 = size5 * zzgqx.zzA(i21 << 3);
                        for (int i38 = 0; i38 < list7.size(); i38++) {
                            int zzd5 = ((zzgqi) list7.get(i38)).zzd();
                            i13 += zzgqx.zzA(zzd5) + zzd5;
                        }
                        i20 += i13;
                        break;
                    }
                    i13 = 0;
                    i20 += i13;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i39 = zzgtv.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzgtv.zzk(list8);
                        zzA8 = zzgqx.zzA(i21 << 3);
                        zzh = zzl + (size * zzA8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i40 = zzgtv.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzgtv.zza(list9);
                        zzA8 = zzgqx.zzA(i21 << 3);
                        zzh = zzl + (size * zzA8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 31:
                    zzh = zzgtv.zzb(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 32:
                    zzh = zzgtv.zzd(i21, (List) unsafe.getObject(obj, j10), z10);
                    i20 += zzh;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i41 = zzgtv.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzgtv.zzi(list10);
                        zzA8 = zzgqx.zzA(i21 << 3);
                        zzh = zzl + (size * zzA8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    int i42 = zzgtv.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzgtv.zzj(list11);
                        zzA8 = zzgqx.zzA(i21 << 3);
                        zzh = zzl + (size * zzA8);
                        i20 += zzh;
                        break;
                    }
                    zzh = 0;
                    i20 += zzh;
                case 35:
                    zzB = zzgtv.zze((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzB = zzgtv.zzc((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzB = zzgtv.zzg((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzB = zzgtv.zzl((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzB = zzgtv.zzf((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzB = zzgtv.zze((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzB = zzgtv.zzc((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    int i43 = zzgtv.zza;
                    zzB = list12.size();
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzB = zzgtv.zzk((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzB = zzgtv.zza((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzB = zzgtv.zzc((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzB = zzgtv.zze((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzB = zzgtv.zzi((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzB = zzgtv.zzj((List) unsafe.getObject(obj, j10));
                    if (zzB > 0) {
                        zzA11 = zzgqx.zzA(zzB);
                        zzA12 = zzgqx.zzA(i21 << 3);
                        zzA3 = zzA12 + zzA11;
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    zzgtt zzx2 = zzx(i19);
                    int i44 = zzgtv.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i14 = 0;
                    } else {
                        i14 = 0;
                        for (int i45 = 0; i45 < size6; i45++) {
                            i14 += zzgqx.zzw(i21, (zzgta) list13.get(i45), zzx2);
                        }
                    }
                    i20 += i14;
                    break;
                case 50:
                    zzgsu zzgsuVar = (zzgsu) unsafe.getObject(obj, j10);
                    zzgst zzgstVar = (zzgst) zzz(i19);
                    if (zzgsuVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzgsuVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        break;
                    }
                case 51:
                    if (zzR(obj, i21, i19)) {
                        zzA = zzgqx.zzA(i21 << 3);
                        zzh = zzA + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i21, i19)) {
                        zzA2 = zzgqx.zzA(i21 << 3);
                        zzh = zzA2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i21, i19)) {
                        zzB = zzgqx.zzB(zzv(obj, j10));
                        zzA3 = zzgqx.zzA(i21 << 3);
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i21, i19)) {
                        zzB = zzgqx.zzB(zzv(obj, j10));
                        zzA3 = zzgqx.zzA(i21 << 3);
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i21, i19)) {
                        zzB = zzgqx.zzx(zzp(obj, j10));
                        zzA3 = zzgqx.zzA(i21 << 3);
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i21, i19)) {
                        zzA = zzgqx.zzA(i21 << 3);
                        zzh = zzA + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i21, i19)) {
                        zzA2 = zzgqx.zzA(i21 << 3);
                        zzh = zzA2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i21, i19)) {
                        zzA4 = zzgqx.zzA(i21 << 3);
                        zzh = zzA4 + 1;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i21, i19)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzgqi) {
                            int i46 = zzgqx.zzf;
                            int zzd6 = ((zzgqi) object2).zzd();
                            zzA5 = zzgqx.zzA(zzd6) + zzd6;
                            zzA6 = zzgqx.zzA(i21 << 3);
                            zzh = zzA6 + zzA5;
                            i20 += zzh;
                            break;
                        } else {
                            zzB = zzgqx.zzz((String) object2);
                            zzA3 = zzgqx.zzA(i21 << 3);
                            i13 = zzA3 + zzB;
                            i20 += i13;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i21, i19)) {
                        zzh = zzgtv.zzh(i21, unsafe.getObject(obj, j10), zzx(i19));
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i21, i19)) {
                        zzgqi zzgqiVar2 = (zzgqi) unsafe.getObject(obj, j10);
                        int i47 = zzgqx.zzf;
                        int zzd7 = zzgqiVar2.zzd();
                        zzA5 = zzgqx.zzA(zzd7) + zzd7;
                        zzA6 = zzgqx.zzA(i21 << 3);
                        zzh = zzA6 + zzA5;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i21, i19)) {
                        zzB = zzgqx.zzA(zzp(obj, j10));
                        zzA3 = zzgqx.zzA(i21 << 3);
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i21, i19)) {
                        zzB = zzgqx.zzx(zzp(obj, j10));
                        zzA3 = zzgqx.zzA(i21 << 3);
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i21, i19)) {
                        zzA2 = zzgqx.zzA(i21 << 3);
                        zzh = zzA2 + 4;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i21, i19)) {
                        zzA = zzgqx.zzA(i21 << 3);
                        zzh = zzA + 8;
                        i20 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i21, i19)) {
                        int zzp = zzp(obj, j10);
                        zzA3 = zzgqx.zzA(i21 << 3);
                        zzB = zzgqx.zzA((zzp >> 31) ^ (zzp + zzp));
                        i13 = zzA3 + zzB;
                        i20 += i13;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i21, i19)) {
                        long zzv = zzv(obj, j10);
                        zzA7 = zzgqx.zzA(i21 << 3);
                        zzB2 = zzgqx.zzB((zzv >> 63) ^ (zzv + zzv));
                        zzA9 = zzA7 + zzB2;
                        i20 += zzA9;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i21, i19)) {
                        zzh = zzgqx.zzw(i21, (zzgta) unsafe.getObject(obj, j10), zzx(i19));
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
        zzguk zzgukVar = this.zzn;
        int zza3 = i20 + zzgukVar.zza(zzgukVar.zzd(obj));
        if (!this.zzh) {
            return zza3;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzu = zzu(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & zzu;
            int i15 = 37;
            switch (zzt(zzu)) {
                case 0:
                    i10 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzguu.zzb(obj, j10));
                    byte[] bArr = zzgsa.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zzguu.zzc(obj, j10));
                    i12 = i11 + floatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    doubleToLongBits = zzguu.zzf(obj, j10);
                    byte[] bArr2 = zzgsa.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i12 * 53;
                    doubleToLongBits = zzguu.zzf(obj, j10);
                    byte[] bArr3 = zzgsa.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i12 * 53;
                    floatToIntBits = zzguu.zzd(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    doubleToLongBits = zzguu.zzf(obj, j10);
                    byte[] bArr4 = zzgsa.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i12 * 53;
                    floatToIntBits = zzguu.zzd(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 7:
                    i11 = i12 * 53;
                    floatToIntBits = zzgsa.zza(zzguu.zzz(obj, j10));
                    i12 = i11 + floatToIntBits;
                    break;
                case 8:
                    i11 = i12 * 53;
                    floatToIntBits = ((String) zzguu.zzh(obj, j10)).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 9:
                    Object zzh = zzguu.zzh(obj, j10);
                    if (zzh != null) {
                        i15 = zzh.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    floatToIntBits = zzguu.zzh(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 11:
                    i11 = i12 * 53;
                    floatToIntBits = zzguu.zzd(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 12:
                    i11 = i12 * 53;
                    floatToIntBits = zzguu.zzd(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 13:
                    i11 = i12 * 53;
                    floatToIntBits = zzguu.zzd(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    doubleToLongBits = zzguu.zzf(obj, j10);
                    byte[] bArr5 = zzgsa.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i12 * 53;
                    floatToIntBits = zzguu.zzd(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = zzguu.zzf(obj, j10);
                    byte[] bArr6 = zzgsa.zzd;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object zzh2 = zzguu.zzh(obj, j10);
                    if (zzh2 != null) {
                        i15 = zzh2.hashCode();
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
                    floatToIntBits = zzguu.zzh(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 50:
                    i11 = i12 * 53;
                    floatToIntBits = zzguu.zzh(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zzgsa.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr8 = zzgsa.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr9 = zzgsa.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr10 = zzgsa.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzgsa.zza(zzS(obj, j10));
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = ((String) zzguu.zzh(obj, j10)).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzguu.zzh(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzguu.zzh(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr11 = zzgsa.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr12 = zzgsa.zzd;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzguu.zzh(obj, j10).hashCode();
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
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0c10, code lost:
    
        if (r5 == r0) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0c12, code lost:
    
        r12.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0c16, code lost:
    
        r11 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0c1b, code lost:
    
        if (r11 >= r6.zzl) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0c1d, code lost:
    
        zzy(r34, r6.zzj[r11], null, r6.zzn, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0c30, code lost:
    
        if (r8 != 0) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0c34, code lost:
    
        if (r9 != r37) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0c3b, code lost:
    
        throw com.google.android.gms.internal.ads.zzgsc.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0c3e, code lost:
    
        if (r9 > r37) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0c40, code lost:
    
        if (r10 != r8) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0c42, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0c47, code lost:
    
        throw com.google.android.gms.internal.ads.zzgsc.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x063f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x0545 -> B:199:0x0546). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:230:0x05ec -> B:231:0x05ed). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:250:0x063c -> B:251:0x063d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzgpu r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgtd.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgpu):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final Object zze() {
        return ((zzgrq) this.zzg).zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzf(Object obj) {
        if (!zzQ(obj)) {
            return;
        }
        if (obj instanceof zzgrq) {
            zzgrq zzgrqVar = (zzgrq) obj;
            zzgrqVar.zzaV(Integer.MAX_VALUE);
            zzgrqVar.zza = 0;
            zzgrqVar.zzaT();
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzu = zzu(i10);
            int i11 = 1048575 & zzu;
            int zzt = zzt(zzu);
            long j10 = i11;
            if (zzt != 9) {
                if (zzt != 60 && zzt != 68) {
                    switch (zzt) {
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
                            this.zzm.zzb(obj, j10);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((zzgsu) object).zzc();
                                unsafe.putObject(obj, j10, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzR(obj, this.zzc[i10], i10)) {
                    zzx(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            if (zzN(obj, i10)) {
                zzx(i10).zzf(zzb.getObject(obj, j10));
            }
        }
        this.zzn.zzm(obj);
        if (this.zzh) {
            this.zzo.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & zzu;
            switch (zzt(zzu)) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzguu.zzr(obj, j10, zzguu.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzguu.zzs(obj, j10, zzguu.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i10)) {
                        zzguu.zzu(obj, j10, zzguu.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i10)) {
                        zzguu.zzu(obj, j10, zzguu.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i10)) {
                        zzguu.zzt(obj, j10, zzguu.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i10)) {
                        zzguu.zzu(obj, j10, zzguu.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i10)) {
                        zzguu.zzt(obj, j10, zzguu.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i10)) {
                        zzguu.zzp(obj, j10, zzguu.zzz(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i10)) {
                        zzguu.zzv(obj, j10, zzguu.zzh(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzguu.zzv(obj, j10, zzguu.zzh(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i10)) {
                        zzguu.zzt(obj, j10, zzguu.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i10)) {
                        zzguu.zzt(obj, j10, zzguu.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i10)) {
                        zzguu.zzt(obj, j10, zzguu.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i10)) {
                        zzguu.zzu(obj, j10, zzguu.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i10)) {
                        zzguu.zzt(obj, j10, zzguu.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i10)) {
                        zzguu.zzu(obj, j10, zzguu.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
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
                    this.zzm.zzc(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzgtv.zza;
                    zzguu.zzv(obj, j10, zzgsv.zzb(zzguu.zzh(obj, j10), zzguu.zzh(obj2, j10)));
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
                    if (zzR(obj2, i11, i10)) {
                        zzguu.zzv(obj, j10, zzguu.zzh(obj2, j10));
                        zzI(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i11, i10)) {
                        zzguu.zzv(obj, j10, zzguu.zzh(obj2, j10));
                        zzI(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzgtv.zzq(this.zzn, obj, obj2);
        if (!this.zzh) {
            return;
        }
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0621 A[Catch: all -> 0x0616, TryCatch #1 {all -> 0x0616, blocks: (B:157:0x05ef, B:171:0x061c, B:173:0x0621, B:174:0x0626), top: B:199:0x05ef }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0659 A[LOOP:2: B:189:0x0655->B:191:0x0659, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x062c A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgtt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.zzgtl r19, com.google.android.gms.internal.ads.zzgrc r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgtd.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzgtl, com.google.android.gms.internal.ads.zzgrc):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgpu zzgpuVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zzgpuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzs;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzu = zzu(i10);
            long j10 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i10) && Double.doubleToLongBits(zzguu.zzb(obj, j10)) == Double.doubleToLongBits(zzguu.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i10) && Float.floatToIntBits(zzguu.zzc(obj, j10)) == Float.floatToIntBits(zzguu.zzc(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i10) && zzguu.zzf(obj, j10) == zzguu.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i10) && zzguu.zzf(obj, j10) == zzguu.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i10) && zzguu.zzd(obj, j10) == zzguu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i10) && zzguu.zzf(obj, j10) == zzguu.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i10) && zzguu.zzd(obj, j10) == zzguu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i10) && zzguu.zzz(obj, j10) == zzguu.zzz(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i10) && zzgtv.zzs(zzguu.zzh(obj, j10), zzguu.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i10) && zzgtv.zzs(zzguu.zzh(obj, j10), zzguu.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i10) && zzgtv.zzs(zzguu.zzh(obj, j10), zzguu.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i10) && zzguu.zzd(obj, j10) == zzguu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i10) && zzguu.zzd(obj, j10) == zzguu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i10) && zzguu.zzd(obj, j10) == zzguu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i10) && zzguu.zzf(obj, j10) == zzguu.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i10) && zzguu.zzd(obj, j10) == zzguu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i10) && zzguu.zzf(obj, j10) == zzguu.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i10) && zzgtv.zzs(zzguu.zzh(obj, j10), zzguu.zzh(obj2, j10))) {
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
                    zzs = zzgtv.zzs(zzguu.zzh(obj, j10), zzguu.zzh(obj2, j10));
                    break;
                case 50:
                    zzs = zzgtv.zzs(zzguu.zzh(obj, j10), zzguu.zzh(obj2, j10));
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
                    long zzr = zzr(i10) & 1048575;
                    if (zzguu.zzd(obj, zzr) == zzguu.zzd(obj2, zzr) && zzgtv.zzs(zzguu.zzh(obj, j10), zzguu.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzs) {
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

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzk) {
            int i15 = this.zzj[i14];
            int i16 = this.zzc[i15];
            int zzu = zzu(i15);
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
            if ((268435456 & zzu) != 0 && !zzO(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt != 60 && zzt != 68) {
                        if (zzt != 49) {
                            if (zzt == 50 && !((zzgsu) zzguu.zzh(obj, zzu & 1048575)).isEmpty()) {
                                zzgst zzgstVar = (zzgst) zzz(i15);
                                throw null;
                            }
                        }
                    } else if (zzR(obj, i16, i15) && !zzP(obj, zzu, zzx(i15))) {
                        return false;
                    }
                }
                List list = (List) zzguu.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgtt zzx = zzx(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzx.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i15, i10, i11, i19) && !zzP(obj, zzu, zzx(i15))) {
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

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzm(Object obj, zzgqy zzgqyVar) throws IOException {
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
                int zzu = zzu(i17);
                int[] iArr = this.zzc;
                int i18 = iArr[i17];
                int zzt = zzt(zzu);
                if (zzt <= 17) {
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
                long j10 = zzu & i14;
                switch (zzt) {
                    case 0:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzf(i18, zzguu.zzb(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzo(i18, zzguu.zzc(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzt(i18, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzJ(i18, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzr(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzm(i18, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzk(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzb(i18, zzguu.zzz(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzT(i18, unsafe.getObject(obj, j10), zzgqyVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzv(i18, unsafe.getObject(obj, j10), zzx(i17));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzd(i18, (zzgqi) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzH(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzi(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzw(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzy(i18, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzA(i18, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzC(i18, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzO(obj, i17, i10, i11, i12)) {
                            zzgqyVar.zzq(i18, unsafe.getObject(obj, j10), zzx(i17));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzgtv.zzu(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 19:
                        zzgtv.zzy(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 20:
                        zzgtv.zzA(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 21:
                        zzgtv.zzG(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 22:
                        zzgtv.zzz(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 23:
                        zzgtv.zzx(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 24:
                        zzgtv.zzw(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 25:
                        zzgtv.zzt(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 26:
                        int i21 = this.zzc[i17];
                        List list = (List) unsafe.getObject(obj, j10);
                        int i22 = zzgtv.zza;
                        if (list != null && !list.isEmpty()) {
                            zzgqyVar.zzG(i21, list);
                            break;
                        }
                        break;
                    case 27:
                        int i23 = this.zzc[i17];
                        List list2 = (List) unsafe.getObject(obj, j10);
                        zzgtt zzx = zzx(i17);
                        int i24 = zzgtv.zza;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i25 = 0; i25 < list2.size(); i25++) {
                                zzgqyVar.zzv(i23, list2.get(i25), zzx);
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i26 = this.zzc[i17];
                        List list3 = (List) unsafe.getObject(obj, j10);
                        int i27 = zzgtv.zza;
                        if (list3 != null && !list3.isEmpty()) {
                            zzgqyVar.zze(i26, list3);
                            break;
                        }
                        break;
                    case 29:
                        zzgtv.zzF(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 30:
                        zzgtv.zzv(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 31:
                        zzgtv.zzB(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 32:
                        zzgtv.zzC(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 33:
                        zzgtv.zzD(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 34:
                        zzgtv.zzE(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, false);
                        break;
                    case 35:
                        zzgtv.zzu(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 36:
                        zzgtv.zzy(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 37:
                        zzgtv.zzA(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 38:
                        zzgtv.zzG(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 39:
                        zzgtv.zzz(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 40:
                        zzgtv.zzx(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 41:
                        zzgtv.zzw(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 42:
                        zzgtv.zzt(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 43:
                        zzgtv.zzF(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 44:
                        zzgtv.zzv(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 45:
                        zzgtv.zzB(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 46:
                        zzgtv.zzC(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 47:
                        zzgtv.zzD(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 48:
                        zzgtv.zzE(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgqyVar, true);
                        break;
                    case 49:
                        int i28 = this.zzc[i17];
                        List list4 = (List) unsafe.getObject(obj, j10);
                        zzgtt zzx2 = zzx(i17);
                        int i29 = zzgtv.zza;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i30 = 0; i30 < list4.size(); i30++) {
                                zzgqyVar.zzq(i28, list4.get(i30), zzx2);
                            }
                            break;
                        }
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j10) != null) {
                            zzgst zzgstVar = (zzgst) zzz(i17);
                            throw null;
                        }
                        break;
                    case 51:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzf(i18, zzn(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzo(i18, zzo(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzt(i18, zzv(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzJ(i18, zzv(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzr(i18, zzp(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzm(i18, zzv(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzk(i18, zzp(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzb(i18, zzS(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzR(obj, i18, i17)) {
                            zzT(i18, unsafe.getObject(obj, j10), zzgqyVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzv(i18, unsafe.getObject(obj, j10), zzx(i17));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzd(i18, (zzgqi) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzH(i18, zzp(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzi(i18, zzp(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzw(i18, zzp(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzy(i18, zzv(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzA(i18, zzp(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzC(i18, zzv(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzR(obj, i18, i17)) {
                            zzgqyVar.zzq(i18, unsafe.getObject(obj, j10), zzx(i17));
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
            zzguk zzgukVar = this.zzn;
            zzgukVar.zzr(zzgukVar.zzd(obj), zzgqyVar);
            return;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
