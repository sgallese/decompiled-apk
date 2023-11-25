package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i10, int i11, zzfw zzfwVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzh = z10;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
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

    private final void zzB(Object obj, Object obj2, int i10) {
        long zzv = zzv(i10) & 1048575;
        if (!zzG(obj2, i10)) {
            return;
        }
        Object zzf = zzhi.zzf(obj, zzv);
        Object zzf2 = zzhi.zzf(obj2, zzv);
        if (zzf != null && zzf2 != null) {
            zzhi.zzp(obj, zzv, zzez.zzg(zzf, zzf2));
            zzD(obj, i10);
        } else if (zzf2 != null) {
            zzhi.zzp(obj, zzv, zzf2);
            zzD(obj, i10);
        }
    }

    private final void zzC(Object obj, Object obj2, int i10) {
        Object obj3;
        int zzv = zzv(i10);
        int i11 = this.zzc[i10];
        long j10 = zzv & 1048575;
        if (!zzJ(obj2, i11, i10)) {
            return;
        }
        if (zzJ(obj, i11, i10)) {
            obj3 = zzhi.zzf(obj, j10);
        } else {
            obj3 = null;
        }
        Object zzf = zzhi.zzf(obj2, j10);
        if (obj3 != null && zzf != null) {
            zzhi.zzp(obj, j10, zzez.zzg(obj3, zzf));
            zzE(obj, i11, i10);
        } else if (zzf != null) {
            zzhi.zzp(obj, j10, zzf);
            zzE(obj, i11, i10);
        }
    }

    private final void zzD(Object obj, int i10) {
        int zzs = zzs(i10);
        long j10 = 1048575 & zzs;
        if (j10 == 1048575) {
            return;
        }
        zzhi.zzn(obj, j10, (1 << (zzs >>> 20)) | zzhi.zzc(obj, j10));
    }

    private final void zzE(Object obj, int i10, int i11) {
        zzhi.zzn(obj, zzs(i11) & 1048575, i10);
    }

    private final boolean zzF(Object obj, Object obj2, int i10) {
        if (zzG(obj, i10) == zzG(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean zzG(Object obj, int i10) {
        int zzs = zzs(i10);
        long j10 = zzs & 1048575;
        if (j10 == 1048575) {
            int zzv = zzv(i10);
            long j11 = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzhi.zza(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzhi.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzhi.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzhi.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzhi.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzhi.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzhi.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzhi.zzt(obj, j11);
                case 8:
                    Object zzf = zzhi.zzf(obj, j11);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzee) {
                        if (zzee.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzhi.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzee.zzb.equals(zzhi.zzf(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzhi.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzhi.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzhi.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzhi.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzhi.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzhi.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzhi.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((zzhi.zzc(obj, j10) & (1 << (zzs >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    private final boolean zzH(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzG(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzI(Object obj, int i10, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i10 & 1048575));
    }

    private final boolean zzJ(Object obj, int i10, int i11) {
        if (zzhi.zzc(obj, zzs(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar == zzgz.zza()) {
            zzgz zzc = zzgz.zzc();
            zzeuVar.zzc = zzc;
            return zzc;
        }
        return zzgzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        zzgv zzgvVar = (zzgv) zzftVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.auth.zzfz zzk(com.google.android.gms.internal.auth.zzgg r34, com.google.android.gms.internal.auth.zzgb r35, com.google.android.gms.internal.auth.zzfk r36, com.google.android.gms.internal.auth.zzgy r37, com.google.android.gms.internal.auth.zzel r38, com.google.android.gms.internal.auth.zzfr r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzk(com.google.android.gms.internal.auth.zzgg, com.google.android.gms.internal.auth.zzgb, com.google.android.gms.internal.auth.zzfk, com.google.android.gms.internal.auth.zzgy, com.google.android.gms.internal.auth.zzel, com.google.android.gms.internal.auth.zzfr):com.google.android.gms.internal.auth.zzfz");
    }

    private static int zzl(Object obj, long j10) {
        return ((Integer) zzhi.zzf(obj, j10)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzfq) object).zze()) {
            zzfq zzb2 = zzfq.zza().zzb();
            zzfr.zza(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzfp zzfpVar = (zzfp) zzz;
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzdt.zzm(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzdsVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzdt.zzj(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzdsVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzdt.zzn(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzdt.zzb(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzdt.zzm(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzdsVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i18 = zzdsVar.zza;
                    if (i18 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i15 & 536870912) != 0 && !zzhm.zzd(bArr, zzj2, zzj2 + i18)) {
                        throw zzfa.zzb();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i18, zzez.zzb));
                        zzj2 += i18;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int zzd = zzdt.zzd(zzy(i17), bArr, i10, i11, zzdsVar);
                    Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzd;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzdt.zza(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j10, zzdsVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i19 = zzdsVar.zza;
                    zzex zzx = zzx(i17);
                    if (zzx != null && !zzx.zza()) {
                        zzc(obj).zzf(i12, Long.valueOf(i19));
                    } else {
                        unsafe.putObject(obj, j10, Integer.valueOf(i19));
                        unsafe.putInt(obj, j11, i13);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int zzj4 = zzdt.zzj(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzdt.zzm(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    int zzc = zzdt.zzc(zzy(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzdsVar);
                    Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j10, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzez.zzg(object2, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzc;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    private final int zzo(Object obj, byte[] bArr, int i10, int i11, zzds zzdsVar) throws IOException {
        byte b10;
        int i12;
        int zzq;
        int i13;
        int i14;
        Unsafe unsafe;
        int i15;
        int i16;
        int i17;
        int zzm;
        int zzd;
        int i18;
        int i19;
        int i20;
        zzfz<T> zzfzVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i21 = i11;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i22 = 1048575;
        int i23 = -1;
        int i24 = i10;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 1048575;
        while (i24 < i21) {
            int i29 = i24 + 1;
            byte b11 = bArr2[i24];
            if (b11 < 0) {
                i12 = zzdt.zzk(b11, bArr2, i29, zzdsVar2);
                b10 = zzdsVar2.zza;
            } else {
                b10 = b11;
                i12 = i29;
            }
            int i30 = b10 >>> 3;
            int i31 = b10 & 7;
            if (i30 > i25) {
                zzq = zzfzVar.zzr(i30, i26 / 3);
            } else {
                zzq = zzfzVar.zzq(i30);
            }
            int i32 = zzq;
            if (i32 == i23) {
                i13 = i12;
                i14 = i30;
                unsafe = unsafe2;
                i15 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i33 = iArr[i32 + 1];
                int zzu = zzu(i33);
                long j10 = i33 & i22;
                if (zzu <= 17) {
                    int i34 = iArr[i32 + 2];
                    int i35 = 1 << (i34 >>> 20);
                    int i36 = i34 & 1048575;
                    if (i36 != i28) {
                        if (i28 != 1048575) {
                            unsafe2.putInt(obj2, i28, i27);
                        }
                        if (i36 != 1048575) {
                            i27 = unsafe2.getInt(obj2, i36);
                        }
                        i28 = i36;
                    }
                    switch (zzu) {
                        case 0:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i17 = i12;
                            i14 = i30;
                            if (i31 == 1) {
                                zzhi.zzl(obj2, j10, Double.longBitsToDouble(zzdt.zzn(bArr2, i17)));
                                i24 = i17 + 8;
                                i27 |= i35;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 1:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i17 = i12;
                            i14 = i30;
                            if (i31 == 5) {
                                zzhi.zzm(obj2, j10, Float.intBitsToFloat(zzdt.zzb(bArr2, i17)));
                                i24 = i17 + 4;
                                i27 |= i35;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 2:
                        case 3:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i17 = i12;
                            i14 = i30;
                            if (i31 == 0) {
                                zzm = zzdt.zzm(bArr2, i17, zzdsVar2);
                                unsafe2.putLong(obj, j10, zzdsVar2.zzb);
                                i27 |= i35;
                                i24 = zzm;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 4:
                        case 11:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i17 = i12;
                            i14 = i30;
                            if (i31 == 0) {
                                i24 = zzdt.zzj(bArr2, i17, zzdsVar2);
                                unsafe2.putInt(obj2, j10, zzdsVar2.zza);
                                i27 |= i35;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 5:
                        case 14:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i14 = i30;
                            if (i31 == 1) {
                                i17 = i12;
                                unsafe2.putLong(obj, j10, zzdt.zzn(bArr2, i12));
                                i24 = i17 + 8;
                                i27 |= i35;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i17 = i12;
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 6:
                        case 13:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i14 = i30;
                            if (i31 == 5) {
                                unsafe2.putInt(obj2, j10, zzdt.zzb(bArr2, i12));
                                i24 = i12 + 4;
                                i27 |= i35;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i17 = i12;
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 7:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i14 = i30;
                            if (i31 == 0) {
                                i24 = zzdt.zzm(bArr2, i12, zzdsVar2);
                                zzhi.zzk(obj2, j10, zzdsVar2.zzb != 0);
                                i27 |= i35;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i17 = i12;
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 8:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i14 = i30;
                            if (i31 == 2) {
                                if ((536870912 & i33) == 0) {
                                    i24 = zzdt.zzg(bArr2, i12, zzdsVar2);
                                } else {
                                    i24 = zzdt.zzh(bArr2, i12, zzdsVar2);
                                }
                                unsafe2.putObject(obj2, j10, zzdsVar2.zzc);
                                i27 |= i35;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i17 = i12;
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 9:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i14 = i30;
                            if (i31 == 2) {
                                zzd = zzdt.zzd(zzfzVar.zzy(i16), bArr2, i12, i21, zzdsVar2);
                                Object object = unsafe2.getObject(obj2, j10);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j10, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j10, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i27 |= i35;
                                i24 = zzd;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i17 = i12;
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 10:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i14 = i30;
                            if (i31 == 2) {
                                zzd = zzdt.zza(bArr2, i12, zzdsVar2);
                                unsafe2.putObject(obj2, j10, zzdsVar2.zzc);
                                i27 |= i35;
                                i24 = zzd;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i17 = i12;
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 12:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i14 = i30;
                            if (i31 == 0) {
                                zzd = zzdt.zzj(bArr2, i12, zzdsVar2);
                                unsafe2.putInt(obj2, j10, zzdsVar2.zza);
                                i27 |= i35;
                                i24 = zzd;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i17 = i12;
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 15:
                            zzdsVar2 = zzdsVar;
                            i16 = i32;
                            i14 = i30;
                            if (i31 == 0) {
                                zzd = zzdt.zzj(bArr2, i12, zzdsVar2);
                                unsafe2.putInt(obj2, j10, zzei.zzb(zzdsVar2.zza));
                                i27 |= i35;
                                i24 = zzd;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                            i17 = i12;
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                        case 16:
                            if (i31 != 0) {
                                i14 = i30;
                                i16 = i32;
                                i17 = i12;
                                i13 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                break;
                            } else {
                                zzdsVar2 = zzdsVar;
                                zzm = zzdt.zzm(bArr2, i12, zzdsVar2);
                                i16 = i32;
                                i14 = i30;
                                unsafe2.putLong(obj, j10, zzei.zzc(zzdsVar2.zzb));
                                i27 |= i35;
                                i24 = zzm;
                                i26 = i16;
                                i25 = i14;
                                break;
                            }
                        default:
                            i14 = i30;
                            i16 = i32;
                            i17 = i12;
                            i13 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            break;
                    }
                } else {
                    zzdsVar2 = zzdsVar;
                    i16 = i32;
                    int i37 = i12;
                    i14 = i30;
                    if (zzu == 27) {
                        if (i31 == 2) {
                            zzey zzeyVar = (zzey) unsafe2.getObject(obj2, j10);
                            if (!zzeyVar.zzc()) {
                                int size = zzeyVar.size();
                                zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j10, zzeyVar);
                            }
                            i24 = zzdt.zze(zzfzVar.zzy(i16), b10, bArr, i37, i11, zzeyVar, zzdsVar);
                            i27 = i27;
                            i26 = i16;
                            i25 = i14;
                        } else {
                            i18 = i37;
                            i19 = i27;
                            i20 = i28;
                            unsafe = unsafe2;
                            i15 = i16;
                        }
                    } else if (zzu <= 49) {
                        i19 = i27;
                        i20 = i28;
                        unsafe = unsafe2;
                        i15 = i16;
                        i24 = zzp(obj, bArr, i37, i11, b10, i14, i31, i16, i33, zzu, j10, zzdsVar);
                        if (i24 != i37) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i21 = i11;
                            zzdsVar2 = zzdsVar;
                            i28 = i20;
                            i25 = i14;
                            i27 = i19;
                            i26 = i15;
                            unsafe2 = unsafe;
                            i23 = -1;
                            i22 = 1048575;
                            zzfzVar = this;
                        } else {
                            i13 = i24;
                            i28 = i20;
                            i27 = i19;
                        }
                    } else {
                        i18 = i37;
                        i19 = i27;
                        i20 = i28;
                        unsafe = unsafe2;
                        i15 = i16;
                        if (zzu != 50) {
                            i24 = zzn(obj, bArr, i18, i11, b10, i14, i31, i33, zzu, j10, i15, zzdsVar);
                            if (i24 != i18) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i21 = i11;
                                zzdsVar2 = zzdsVar;
                                i28 = i20;
                                i25 = i14;
                                i27 = i19;
                                i26 = i15;
                                unsafe2 = unsafe;
                                i23 = -1;
                                i22 = 1048575;
                                zzfzVar = this;
                            } else {
                                i13 = i24;
                                i28 = i20;
                                i27 = i19;
                            }
                        } else if (i31 == 2) {
                            i24 = zzm(obj, bArr, i18, i11, i15, j10, zzdsVar);
                            if (i24 != i18) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i21 = i11;
                                zzdsVar2 = zzdsVar;
                                i28 = i20;
                                i25 = i14;
                                i27 = i19;
                                i26 = i15;
                                unsafe2 = unsafe;
                                i23 = -1;
                                i22 = 1048575;
                                zzfzVar = this;
                            } else {
                                i13 = i24;
                                i28 = i20;
                                i27 = i19;
                            }
                        }
                    }
                    i13 = i18;
                    i28 = i20;
                    i27 = i19;
                }
                i23 = -1;
                i22 = 1048575;
            }
            i24 = zzdt.zzi(b10, bArr, i13, i11, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i21 = i11;
            zzdsVar2 = zzdsVar;
            i25 = i14;
            i26 = i15;
            unsafe2 = unsafe;
            i23 = -1;
            i22 = 1048575;
        }
        int i38 = i27;
        int i39 = i28;
        Unsafe unsafe3 = unsafe2;
        if (i39 != 1048575) {
            unsafe3.putInt(obj, i39, i38);
        }
        if (i24 == i11) {
            return i24;
        }
        throw zzfa.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzp(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.auth.zzds r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzp(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.auth.zzds):int");
    }

    private final int zzq(int i10) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzt(i10, 0);
        }
        return -1;
    }

    private final int zzr(int i10, int i11) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzt(i10, i11);
        }
        return -1;
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzt(int i10, int i11) {
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

    private static int zzu(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzv(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzw(Object obj, long j10) {
        return ((Long) zzhi.zzf(obj, j10)).longValue();
    }

    private final zzex zzx(int i10) {
        int i11 = i10 / 3;
        return (zzex) this.zzd[i11 + i11 + 1];
    }

    private final zzgh zzy(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgh zzghVar = (zzgh) this.zzd[i12];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzb2 = zzge.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i10;
        int zzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzv = zzv(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & zzv;
            int i14 = 37;
            switch (zzu(zzv)) {
                case 0:
                    i10 = i11 * 53;
                    zzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j10)));
                    i11 = i10 + zzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    zzc = Float.floatToIntBits(zzhi.zzb(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 2:
                    i10 = i11 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 3:
                    i10 = i11 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 4:
                    i10 = i11 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 5:
                    i10 = i11 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 6:
                    i10 = i11 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    zzc = zzez.zza(zzhi.zzt(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 8:
                    i10 = i11 * 53;
                    zzc = ((String) zzhi.zzf(obj, j10)).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 9:
                    Object zzf = zzhi.zzf(obj, j10);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    zzc = zzhi.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 11:
                    i10 = i11 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 14:
                    i10 = i11 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 15:
                    i10 = i11 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 16:
                    i10 = i11 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzhi.zzf(obj, j10);
                    if (zzf2 != null) {
                        i14 = zzf2.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
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
                    i10 = i11 * 53;
                    zzc = zzhi.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 50:
                    i10 = i11 * 53;
                    zzc = zzhi.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 51:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j10)).doubleValue()));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j10)).floatValue());
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzez.zzc(zzw(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzez.zzc(zzw(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzez.zzc(zzw(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzez.zza(((Boolean) zzhi.zzf(obj, j10)).booleanValue());
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = ((String) zzhi.zzf(obj, j10)).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzhi.zzf(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzhi.zzf(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzez.zzc(zzw(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzez.zzc(zzw(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzhi.zzf(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i11 * 53) + this.zzm.zza(obj).hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0334, code lost:
    
        if (r0 != r20) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0336, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r17;
        r2 = r19;
        r3 = r21;
        r5 = r22;
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034e, code lost:
    
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0371, code lost:
    
        if (r0 != r15) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0397, code lost:
    
        if (r0 != r15) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.auth.zzds r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i10;
        int i11 = this.zzj;
        while (true) {
            i10 = this.zzk;
            if (i11 >= i10) {
                break;
            }
            long zzv = zzv(this.zzi[i11]) & 1048575;
            Object zzf = zzhi.zzf(obj, zzv);
            if (zzf != null) {
                ((zzfq) zzf).zzc();
                zzhi.zzp(obj, zzv, zzf);
            }
            i11++;
        }
        int length = this.zzi.length;
        while (i10 < length) {
            this.zzl.zza(obj, this.zzi[i10]);
            i10++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzv = zzv(i10);
            long j10 = 1048575 & zzv;
            int i11 = this.zzc[i10];
            switch (zzu(zzv)) {
                case 0:
                    if (zzG(obj2, i10)) {
                        zzhi.zzl(obj, j10, zzhi.zza(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(obj2, i10)) {
                        zzhi.zzm(obj, j10, zzhi.zzb(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(obj2, i10)) {
                        zzhi.zzk(obj, j10, zzhi.zzt(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(obj2, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i10);
                    break;
                case 10:
                    if (zzG(obj2, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
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
                    zzgj.zzi(this.zzp, obj, obj2, j10);
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
                    if (zzJ(obj2, i11, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
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
                    if (zzJ(obj2, i11, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
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
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i10, int i11, zzds zzdsVar) throws IOException {
        if (this.zzh) {
            zzo(obj, bArr, i10, i11, zzdsVar);
        } else {
            zzb(obj, bArr, i10, i11, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzh;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzv = zzv(i10);
            long j10 = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(obj, obj2, i10) && Double.doubleToLongBits(zzhi.zza(obj, j10)) == Double.doubleToLongBits(zzhi.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzF(obj, obj2, i10) && Float.floatToIntBits(zzhi.zzb(obj, j10)) == Float.floatToIntBits(zzhi.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzF(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzF(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzF(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzF(obj, obj2, i10) && zzhi.zzt(obj, j10) == zzhi.zzt(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzF(obj, obj2, i10) && zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzF(obj, obj2, i10) && zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzF(obj, obj2, i10) && zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzF(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzF(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzF(obj, obj2, i10) && zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
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
                    zzh = zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10));
                    break;
                case 50:
                    zzh = zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10));
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
                    long zzs = zzs(i10) & 1048575;
                    if (zzhi.zzc(obj, zzs) == zzhi.zzc(obj2, zzs) && zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzh) {
                return false;
            }
        }
        if (!this.zzm.zza(obj).equals(this.zzm.zza(obj2))) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzj) {
            int i15 = this.zzi[i14];
            int i16 = this.zzc[i15];
            int zzv = zzv(i15);
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
            if ((268435456 & zzv) != 0 && !zzH(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu != 60 && zzu != 68) {
                        if (zzu != 49) {
                            if (zzu == 50 && !((zzfq) zzhi.zzf(obj, zzv & 1048575)).isEmpty()) {
                                zzfp zzfpVar = (zzfp) zzz(i15);
                                throw null;
                            }
                        }
                    } else if (zzJ(obj, i16, i15) && !zzI(obj, zzv, zzy(i15))) {
                        return false;
                    }
                }
                List list = (List) zzhi.zzf(obj, zzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgh zzy = zzy(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzy.zzi(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzH(obj, i15, i10, i11, i19) && !zzI(obj, zzv, zzy(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return true;
    }
}
