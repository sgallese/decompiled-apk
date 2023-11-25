package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgvw extends zzgrq implements zzgtb {
    private static final zzgvw zzb;
    private int zzd;
    private String zze = "";

    static {
        zzgvw zzgvwVar = new zzgvw();
        zzb = zzgvwVar;
        zzgrq.zzaU(zzgvw.class, zzgvwVar);
    }

    private zzgvw() {
    }

    public static zzgvv zza() {
        return (zzgvv) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgvw zzgvwVar, String str) {
        zzgvwVar.zzd |= 1;
        zzgvwVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgvk zzgvkVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgvv(zzgvkVar);
                }
                return new zzgvw();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
