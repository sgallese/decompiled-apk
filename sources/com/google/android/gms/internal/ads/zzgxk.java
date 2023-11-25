package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgxk extends zzgrq implements zzgtb {
    private static final zzgxk zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzgxk zzgxkVar = new zzgxk();
        zzb = zzgxkVar;
        zzgrq.zzaU(zzgxk.class, zzgxkVar);
    }

    private zzgxk() {
    }

    public static zzgxj zza() {
        return (zzgxj) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgxk zzgxkVar, String str) {
        zzgxkVar.zzd |= 1;
        zzgxkVar.zze = str;
    }

    public static /* synthetic */ void zze(zzgxk zzgxkVar, long j10) {
        zzgxkVar.zzd |= 2;
        zzgxkVar.zzf = j10;
    }

    public static /* synthetic */ void zzf(zzgxk zzgxkVar, boolean z10) {
        zzgxkVar.zzd |= 4;
        zzgxkVar.zzg = z10;
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
                    return new zzgxj(zzgvkVar);
                }
                return new zzgxk();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzgxl.zza, "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
