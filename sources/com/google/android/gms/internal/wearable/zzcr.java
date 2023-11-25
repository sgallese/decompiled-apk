package com.google.android.gms.internal.wearable;

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
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzcr {
    public static final zzcr zza;
    public static final zzcr zzb;
    public static final zzcr zzc;
    public static final zzcr zzd;
    public static final zzcr zze;
    public static final zzcr zzf;
    public static final zzcr zzg;
    public static final zzcr zzh;
    public static final zzcr zzi;
    public static final zzcr zzj;
    private static final /* synthetic */ zzcr[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzcr zzcrVar = new zzcr("VOID", 0, Void.class, Void.class, null);
        zza = zzcrVar;
        Class cls = Integer.TYPE;
        zzcr zzcrVar2 = new zzcr("INT", 1, cls, Integer.class, 0);
        zzb = zzcrVar2;
        zzcr zzcrVar3 = new zzcr("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzcrVar3;
        zzcr zzcrVar4 = new zzcr("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzcrVar4;
        zzcr zzcrVar5 = new zzcr("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzcrVar5;
        zzcr zzcrVar6 = new zzcr("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzcrVar6;
        zzcr zzcrVar7 = new zzcr("STRING", 6, String.class, String.class, "");
        zzg = zzcrVar7;
        zzcr zzcrVar8 = new zzcr("BYTE_STRING", 7, zzbh.class, zzbh.class, zzbh.zzb);
        zzh = zzcrVar8;
        zzcr zzcrVar9 = new zzcr("ENUM", 8, cls, Integer.class, null);
        zzi = zzcrVar9;
        zzcr zzcrVar10 = new zzcr("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzcrVar10;
        zzk = new zzcr[]{zzcrVar, zzcrVar2, zzcrVar3, zzcrVar4, zzcrVar5, zzcrVar6, zzcrVar7, zzcrVar8, zzcrVar9, zzcrVar10};
    }

    private zzcr(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzcr[] values() {
        return (zzcr[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
