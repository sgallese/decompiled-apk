package com.google.android.gms.internal.ads;

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
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgva {
    public static final zzgva zza;
    public static final zzgva zzb;
    public static final zzgva zzc;
    public static final zzgva zzd;
    public static final zzgva zze;
    public static final zzgva zzf;
    public static final zzgva zzg;
    public static final zzgva zzh;
    public static final zzgva zzi;
    public static final zzgva zzj;
    public static final zzgva zzk;
    public static final zzgva zzl;
    public static final zzgva zzm;
    public static final zzgva zzn;
    public static final zzgva zzo;
    public static final zzgva zzp;
    public static final zzgva zzq;
    public static final zzgva zzr;
    private static final /* synthetic */ zzgva[] zzs;
    private final zzgvb zzt;

    static {
        zzgva zzgvaVar = new zzgva("DOUBLE", 0, zzgvb.DOUBLE, 1);
        zza = zzgvaVar;
        zzgva zzgvaVar2 = new zzgva("FLOAT", 1, zzgvb.FLOAT, 5);
        zzb = zzgvaVar2;
        zzgvb zzgvbVar = zzgvb.LONG;
        zzgva zzgvaVar3 = new zzgva("INT64", 2, zzgvbVar, 0);
        zzc = zzgvaVar3;
        zzgva zzgvaVar4 = new zzgva("UINT64", 3, zzgvbVar, 0);
        zzd = zzgvaVar4;
        zzgvb zzgvbVar2 = zzgvb.INT;
        zzgva zzgvaVar5 = new zzgva("INT32", 4, zzgvbVar2, 0);
        zze = zzgvaVar5;
        zzgva zzgvaVar6 = new zzgva("FIXED64", 5, zzgvbVar, 1);
        zzf = zzgvaVar6;
        zzgva zzgvaVar7 = new zzgva("FIXED32", 6, zzgvbVar2, 5);
        zzg = zzgvaVar7;
        zzgva zzgvaVar8 = new zzgva("BOOL", 7, zzgvb.BOOLEAN, 0);
        zzh = zzgvaVar8;
        zzgva zzgvaVar9 = new zzgva("STRING", 8, zzgvb.STRING, 2);
        zzi = zzgvaVar9;
        zzgvb zzgvbVar3 = zzgvb.MESSAGE;
        zzgva zzgvaVar10 = new zzgva("GROUP", 9, zzgvbVar3, 3);
        zzj = zzgvaVar10;
        zzgva zzgvaVar11 = new zzgva("MESSAGE", 10, zzgvbVar3, 2);
        zzk = zzgvaVar11;
        zzgva zzgvaVar12 = new zzgva("BYTES", 11, zzgvb.BYTE_STRING, 2);
        zzl = zzgvaVar12;
        zzgva zzgvaVar13 = new zzgva("UINT32", 12, zzgvbVar2, 0);
        zzm = zzgvaVar13;
        zzgva zzgvaVar14 = new zzgva("ENUM", 13, zzgvb.ENUM, 0);
        zzn = zzgvaVar14;
        zzgva zzgvaVar15 = new zzgva("SFIXED32", 14, zzgvbVar2, 5);
        zzo = zzgvaVar15;
        zzgva zzgvaVar16 = new zzgva("SFIXED64", 15, zzgvbVar, 1);
        zzp = zzgvaVar16;
        zzgva zzgvaVar17 = new zzgva("SINT32", 16, zzgvbVar2, 0);
        zzq = zzgvaVar17;
        zzgva zzgvaVar18 = new zzgva("SINT64", 17, zzgvbVar, 0);
        zzr = zzgvaVar18;
        zzs = new zzgva[]{zzgvaVar, zzgvaVar2, zzgvaVar3, zzgvaVar4, zzgvaVar5, zzgvaVar6, zzgvaVar7, zzgvaVar8, zzgvaVar9, zzgvaVar10, zzgvaVar11, zzgvaVar12, zzgvaVar13, zzgvaVar14, zzgvaVar15, zzgvaVar16, zzgvaVar17, zzgvaVar18};
    }

    private zzgva(String str, int i10, zzgvb zzgvbVar, int i11) {
        this.zzt = zzgvbVar;
    }

    public static zzgva[] values() {
        return (zzgva[]) zzs.clone();
    }

    public final zzgvb zza() {
        return this.zzt;
    }
}
