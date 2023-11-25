package com.google.android.gms.internal.wearable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
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
public final class zzca {
    public static final zzca zzA;
    public static final zzca zzB;
    public static final zzca zzC;
    public static final zzca zzD;
    public static final zzca zzE;
    public static final zzca zzF;
    public static final zzca zzG;
    public static final zzca zzH;
    public static final zzca zzI;
    public static final zzca zzJ;
    public static final zzca zzK;
    public static final zzca zzL;
    public static final zzca zzM;
    public static final zzca zzN;
    public static final zzca zzO;
    public static final zzca zzP;
    public static final zzca zzQ;
    public static final zzca zzR;
    public static final zzca zzS;
    public static final zzca zzT;
    public static final zzca zzU;
    public static final zzca zzV;
    public static final zzca zzW;
    public static final zzca zzX;
    public static final zzca zzY;
    private static final zzca[] zzZ;
    public static final zzca zza;
    private static final /* synthetic */ zzca[] zzaa;
    public static final zzca zzb;
    public static final zzca zzc;
    public static final zzca zzd;
    public static final zzca zze;
    public static final zzca zzf;
    public static final zzca zzg;
    public static final zzca zzh;
    public static final zzca zzi;
    public static final zzca zzj;
    public static final zzca zzk;
    public static final zzca zzl;
    public static final zzca zzm;
    public static final zzca zzn;
    public static final zzca zzo;
    public static final zzca zzp;
    public static final zzca zzq;
    public static final zzca zzr;
    public static final zzca zzs;
    public static final zzca zzt;
    public static final zzca zzu;
    public static final zzca zzv;
    public static final zzca zzw;
    public static final zzca zzx;
    public static final zzca zzy;
    public static final zzca zzz;
    private final zzcr zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzcr zzcrVar = zzcr.zze;
        zzca zzcaVar = new zzca("DOUBLE", 0, 0, 1, zzcrVar);
        zza = zzcaVar;
        zzcr zzcrVar2 = zzcr.zzd;
        zzca zzcaVar2 = new zzca("FLOAT", 1, 1, 1, zzcrVar2);
        zzb = zzcaVar2;
        zzcr zzcrVar3 = zzcr.zzc;
        zzca zzcaVar3 = new zzca("INT64", 2, 2, 1, zzcrVar3);
        zzc = zzcaVar3;
        zzca zzcaVar4 = new zzca("UINT64", 3, 3, 1, zzcrVar3);
        zzd = zzcaVar4;
        zzcr zzcrVar4 = zzcr.zzb;
        zzca zzcaVar5 = new zzca("INT32", 4, 4, 1, zzcrVar4);
        zze = zzcaVar5;
        zzca zzcaVar6 = new zzca("FIXED64", 5, 5, 1, zzcrVar3);
        zzf = zzcaVar6;
        zzca zzcaVar7 = new zzca("FIXED32", 6, 6, 1, zzcrVar4);
        zzg = zzcaVar7;
        zzcr zzcrVar5 = zzcr.zzf;
        zzca zzcaVar8 = new zzca("BOOL", 7, 7, 1, zzcrVar5);
        zzh = zzcaVar8;
        zzcr zzcrVar6 = zzcr.zzg;
        zzca zzcaVar9 = new zzca("STRING", 8, 8, 1, zzcrVar6);
        zzi = zzcaVar9;
        zzcr zzcrVar7 = zzcr.zzj;
        zzca zzcaVar10 = new zzca("MESSAGE", 9, 9, 1, zzcrVar7);
        zzj = zzcaVar10;
        zzcr zzcrVar8 = zzcr.zzh;
        zzca zzcaVar11 = new zzca("BYTES", 10, 10, 1, zzcrVar8);
        zzk = zzcaVar11;
        zzca zzcaVar12 = new zzca("UINT32", 11, 11, 1, zzcrVar4);
        zzl = zzcaVar12;
        zzcr zzcrVar9 = zzcr.zzi;
        zzca zzcaVar13 = new zzca("ENUM", 12, 12, 1, zzcrVar9);
        zzm = zzcaVar13;
        zzca zzcaVar14 = new zzca("SFIXED32", 13, 13, 1, zzcrVar4);
        zzn = zzcaVar14;
        zzca zzcaVar15 = new zzca("SFIXED64", 14, 14, 1, zzcrVar3);
        zzo = zzcaVar15;
        zzca zzcaVar16 = new zzca("SINT32", 15, 15, 1, zzcrVar4);
        zzp = zzcaVar16;
        zzca zzcaVar17 = new zzca("SINT64", 16, 16, 1, zzcrVar3);
        zzq = zzcaVar17;
        zzca zzcaVar18 = new zzca("GROUP", 17, 17, 1, zzcrVar7);
        zzr = zzcaVar18;
        zzca zzcaVar19 = new zzca("DOUBLE_LIST", 18, 18, 2, zzcrVar);
        zzs = zzcaVar19;
        zzca zzcaVar20 = new zzca("FLOAT_LIST", 19, 19, 2, zzcrVar2);
        zzt = zzcaVar20;
        zzca zzcaVar21 = new zzca("INT64_LIST", 20, 20, 2, zzcrVar3);
        zzu = zzcaVar21;
        zzca zzcaVar22 = new zzca("UINT64_LIST", 21, 21, 2, zzcrVar3);
        zzv = zzcaVar22;
        zzca zzcaVar23 = new zzca("INT32_LIST", 22, 22, 2, zzcrVar4);
        zzw = zzcaVar23;
        zzca zzcaVar24 = new zzca("FIXED64_LIST", 23, 23, 2, zzcrVar3);
        zzx = zzcaVar24;
        zzca zzcaVar25 = new zzca("FIXED32_LIST", 24, 24, 2, zzcrVar4);
        zzy = zzcaVar25;
        zzca zzcaVar26 = new zzca("BOOL_LIST", 25, 25, 2, zzcrVar5);
        zzz = zzcaVar26;
        zzca zzcaVar27 = new zzca("STRING_LIST", 26, 26, 2, zzcrVar6);
        zzA = zzcaVar27;
        zzca zzcaVar28 = new zzca("MESSAGE_LIST", 27, 27, 2, zzcrVar7);
        zzB = zzcaVar28;
        zzca zzcaVar29 = new zzca("BYTES_LIST", 28, 28, 2, zzcrVar8);
        zzC = zzcaVar29;
        zzca zzcaVar30 = new zzca("UINT32_LIST", 29, 29, 2, zzcrVar4);
        zzD = zzcaVar30;
        zzca zzcaVar31 = new zzca("ENUM_LIST", 30, 30, 2, zzcrVar9);
        zzE = zzcaVar31;
        zzca zzcaVar32 = new zzca("SFIXED32_LIST", 31, 31, 2, zzcrVar4);
        zzF = zzcaVar32;
        zzca zzcaVar33 = new zzca("SFIXED64_LIST", 32, 32, 2, zzcrVar3);
        zzG = zzcaVar33;
        zzca zzcaVar34 = new zzca("SINT32_LIST", 33, 33, 2, zzcrVar4);
        zzH = zzcaVar34;
        zzca zzcaVar35 = new zzca("SINT64_LIST", 34, 34, 2, zzcrVar3);
        zzI = zzcaVar35;
        zzca zzcaVar36 = new zzca("DOUBLE_LIST_PACKED", 35, 35, 3, zzcrVar);
        zzJ = zzcaVar36;
        zzca zzcaVar37 = new zzca("FLOAT_LIST_PACKED", 36, 36, 3, zzcrVar2);
        zzK = zzcaVar37;
        zzca zzcaVar38 = new zzca("INT64_LIST_PACKED", 37, 37, 3, zzcrVar3);
        zzL = zzcaVar38;
        zzca zzcaVar39 = new zzca("UINT64_LIST_PACKED", 38, 38, 3, zzcrVar3);
        zzM = zzcaVar39;
        zzca zzcaVar40 = new zzca("INT32_LIST_PACKED", 39, 39, 3, zzcrVar4);
        zzN = zzcaVar40;
        zzca zzcaVar41 = new zzca("FIXED64_LIST_PACKED", 40, 40, 3, zzcrVar3);
        zzO = zzcaVar41;
        zzca zzcaVar42 = new zzca("FIXED32_LIST_PACKED", 41, 41, 3, zzcrVar4);
        zzP = zzcaVar42;
        zzca zzcaVar43 = new zzca("BOOL_LIST_PACKED", 42, 42, 3, zzcrVar5);
        zzQ = zzcaVar43;
        zzca zzcaVar44 = new zzca("UINT32_LIST_PACKED", 43, 43, 3, zzcrVar4);
        zzR = zzcaVar44;
        zzca zzcaVar45 = new zzca("ENUM_LIST_PACKED", 44, 44, 3, zzcrVar9);
        zzS = zzcaVar45;
        zzca zzcaVar46 = new zzca("SFIXED32_LIST_PACKED", 45, 45, 3, zzcrVar4);
        zzT = zzcaVar46;
        zzca zzcaVar47 = new zzca("SFIXED64_LIST_PACKED", 46, 46, 3, zzcrVar3);
        zzU = zzcaVar47;
        zzca zzcaVar48 = new zzca("SINT32_LIST_PACKED", 47, 47, 3, zzcrVar4);
        zzV = zzcaVar48;
        zzca zzcaVar49 = new zzca("SINT64_LIST_PACKED", 48, 48, 3, zzcrVar3);
        zzW = zzcaVar49;
        zzca zzcaVar50 = new zzca("GROUP_LIST", 49, 49, 2, zzcrVar7);
        zzX = zzcaVar50;
        zzca zzcaVar51 = new zzca("MAP", 50, 50, 4, zzcr.zza);
        zzY = zzcaVar51;
        zzaa = new zzca[]{zzcaVar, zzcaVar2, zzcaVar3, zzcaVar4, zzcaVar5, zzcaVar6, zzcaVar7, zzcaVar8, zzcaVar9, zzcaVar10, zzcaVar11, zzcaVar12, zzcaVar13, zzcaVar14, zzcaVar15, zzcaVar16, zzcaVar17, zzcaVar18, zzcaVar19, zzcaVar20, zzcaVar21, zzcaVar22, zzcaVar23, zzcaVar24, zzcaVar25, zzcaVar26, zzcaVar27, zzcaVar28, zzcaVar29, zzcaVar30, zzcaVar31, zzcaVar32, zzcaVar33, zzcaVar34, zzcaVar35, zzcaVar36, zzcaVar37, zzcaVar38, zzcaVar39, zzcaVar40, zzcaVar41, zzcaVar42, zzcaVar43, zzcaVar44, zzcaVar45, zzcaVar46, zzcaVar47, zzcaVar48, zzcaVar49, zzcaVar50, zzcaVar51};
        zzca[] values = values();
        zzZ = new zzca[values.length];
        for (zzca zzcaVar52 : values) {
            zzZ[zzcaVar52.zzac] = zzcaVar52;
        }
    }

    private zzca(String str, int i10, int i11, int i12, zzcr zzcrVar) {
        this.zzac = i11;
        this.zzab = zzcrVar;
        int i13 = i12 - 1;
        if (i13 != 1) {
            if (i13 != 3) {
                this.zzad = null;
            } else {
                this.zzad = zzcrVar.zza();
            }
        } else {
            this.zzad = zzcrVar.zza();
        }
        if (i12 == 1) {
            zzcr zzcrVar2 = zzcr.zza;
            zzcrVar.ordinal();
        }
    }

    public static zzca[] values() {
        return (zzca[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}
