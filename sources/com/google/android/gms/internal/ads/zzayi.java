package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzayi extends zzgrq implements zzgtb {
    private static final zzayi zzb;
    private int zzd;
    private String zze = "";
    private zzgrz zzf = zzgrq.zzaN();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzayi zzayiVar = new zzayi();
        zzb = zzayiVar;
        zzgrq.zzaU(zzayi.class, zzayiVar);
    }

    private zzayi() {
    }

    public static zzayi zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzayi zzayiVar, String str) {
        str.getClass();
        zzayiVar.zzd |= 1;
        zzayiVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzaxl zzaxlVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzayh(zzaxlVar);
                }
                return new zzayi();
            }
            zzgru zzgruVar = zzayr.zza;
            return zzgrq.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", zzaye.class, "zzg", zzgruVar, "zzh", zzgruVar, "zzi", zzgruVar});
        }
        return (byte) 1;
    }
}
