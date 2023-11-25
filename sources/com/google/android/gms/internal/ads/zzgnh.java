package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgnh extends zzgrq implements zzgtb {
    private static final zzgnh zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgnh zzgnhVar = new zzgnh();
        zzb = zzgnhVar;
        zzgrq.zzaU(zzgnh.class, zzgnhVar);
    }

    private zzgnh() {
    }

    public static zzgng zza() {
        return (zzgng) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgnh zzgnhVar, String str) {
        str.getClass();
        zzgnhVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgne zzgneVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgng(zzgneVar);
                }
                return new zzgnh();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
