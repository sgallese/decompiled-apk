package com.google.android.gms.internal.wearable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzff {
    public static final zzff zza;
    public static final zzff zzb;
    public static final zzff zzc;
    public static final zzff zzd;
    public static final zzff zze;
    public static final zzff zzf;
    public static final zzff zzg;
    public static final zzff zzh;
    public static final zzff zzi;
    public static final zzff zzj;
    public static final zzff zzk;
    public static final zzff zzl;
    public static final zzff zzm;
    public static final zzff zzn;
    public static final zzff zzo;
    public static final zzff zzp;
    public static final zzff zzq;
    public static final zzff zzr;
    private static final /* synthetic */ zzff[] zzs;
    private final zzfg zzt;

    static {
        zzff zzffVar = new zzff("DOUBLE", 0, zzfg.DOUBLE, 1);
        zza = zzffVar;
        zzff zzffVar2 = new zzff("FLOAT", 1, zzfg.FLOAT, 5);
        zzb = zzffVar2;
        zzfg zzfgVar = zzfg.LONG;
        zzff zzffVar3 = new zzff("INT64", 2, zzfgVar, 0);
        zzc = zzffVar3;
        zzff zzffVar4 = new zzff("UINT64", 3, zzfgVar, 0);
        zzd = zzffVar4;
        zzfg zzfgVar2 = zzfg.INT;
        zzff zzffVar5 = new zzff("INT32", 4, zzfgVar2, 0);
        zze = zzffVar5;
        zzff zzffVar6 = new zzff("FIXED64", 5, zzfgVar, 1);
        zzf = zzffVar6;
        zzff zzffVar7 = new zzff("FIXED32", 6, zzfgVar2, 5);
        zzg = zzffVar7;
        zzff zzffVar8 = new zzff("BOOL", 7, zzfg.BOOLEAN, 0);
        zzh = zzffVar8;
        zzff zzffVar9 = new zzff("STRING", 8, zzfg.STRING, 2);
        zzi = zzffVar9;
        zzfg zzfgVar3 = zzfg.MESSAGE;
        zzff zzffVar10 = new zzff("GROUP", 9, zzfgVar3, 3);
        zzj = zzffVar10;
        zzff zzffVar11 = new zzff("MESSAGE", 10, zzfgVar3, 2);
        zzk = zzffVar11;
        zzff zzffVar12 = new zzff("BYTES", 11, zzfg.BYTE_STRING, 2);
        zzl = zzffVar12;
        zzff zzffVar13 = new zzff("UINT32", 12, zzfgVar2, 0);
        zzm = zzffVar13;
        zzff zzffVar14 = new zzff("ENUM", 13, zzfg.ENUM, 0);
        zzn = zzffVar14;
        zzff zzffVar15 = new zzff("SFIXED32", 14, zzfgVar2, 5);
        zzo = zzffVar15;
        zzff zzffVar16 = new zzff("SFIXED64", 15, zzfgVar, 1);
        zzp = zzffVar16;
        zzff zzffVar17 = new zzff("SINT32", 16, zzfgVar2, 0);
        zzq = zzffVar17;
        zzff zzffVar18 = new zzff("SINT64", 17, zzfgVar, 0);
        zzr = zzffVar18;
        zzs = new zzff[]{zzffVar, zzffVar2, zzffVar3, zzffVar4, zzffVar5, zzffVar6, zzffVar7, zzffVar8, zzffVar9, zzffVar10, zzffVar11, zzffVar12, zzffVar13, zzffVar14, zzffVar15, zzffVar16, zzffVar17, zzffVar18};
    }

    private zzff(String str, int i10, zzfg zzfgVar, int i11) {
        this.zzt = zzfgVar;
    }

    public static zzff[] values() {
        return (zzff[]) zzs.clone();
    }

    public final zzfg zza() {
        return this.zzt;
    }
}
