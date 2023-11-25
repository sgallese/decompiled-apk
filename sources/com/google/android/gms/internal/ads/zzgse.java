package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
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
public final class zzgse {
    public static final zzgse zza;
    public static final zzgse zzb;
    public static final zzgse zzc;
    public static final zzgse zzd;
    public static final zzgse zze;
    public static final zzgse zzf;
    public static final zzgse zzg;
    public static final zzgse zzh;
    public static final zzgse zzi;
    public static final zzgse zzj;
    private static final /* synthetic */ zzgse[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzgse zzgseVar = new zzgse("VOID", 0, Void.class, Void.class, null);
        zza = zzgseVar;
        Class cls = Integer.TYPE;
        zzgse zzgseVar2 = new zzgse("INT", 1, cls, Integer.class, 0);
        zzb = zzgseVar2;
        zzgse zzgseVar3 = new zzgse("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgseVar3;
        zzgse zzgseVar4 = new zzgse("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgseVar4;
        zzgse zzgseVar5 = new zzgse("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgseVar5;
        zzgse zzgseVar6 = new zzgse("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgseVar6;
        zzgse zzgseVar7 = new zzgse("STRING", 6, String.class, String.class, "");
        zzg = zzgseVar7;
        zzgse zzgseVar8 = new zzgse("BYTE_STRING", 7, zzgqi.class, zzgqi.class, zzgqi.zzb);
        zzh = zzgseVar8;
        zzgse zzgseVar9 = new zzgse("ENUM", 8, cls, Integer.class, null);
        zzi = zzgseVar9;
        zzgse zzgseVar10 = new zzgse("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgseVar10;
        zzk = new zzgse[]{zzgseVar, zzgseVar2, zzgseVar3, zzgseVar4, zzgseVar5, zzgseVar6, zzgseVar7, zzgseVar8, zzgseVar9, zzgseVar10};
    }

    private zzgse(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzgse[] values() {
        return (zzgse[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
