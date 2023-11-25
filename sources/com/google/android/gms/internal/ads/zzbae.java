package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbae extends zzgrq implements zzgtb {
    private static final zzbae zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbae zzbaeVar = new zzbae();
        zzb = zzbaeVar;
        zzgrq.zzaU(zzbae.class, zzbaeVar);
    }

    private zzbae() {
    }

    public static zzbad zza() {
        return (zzbad) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzbae zzbaeVar, int i10) {
        zzbaeVar.zzd |= 1;
        zzbaeVar.zze = i10;
    }

    public static /* synthetic */ void zze(zzbae zzbaeVar, int i10) {
        zzbaeVar.zzd |= 2;
        zzbaeVar.zzf = i10;
    }

    public static /* synthetic */ void zzf(zzbae zzbaeVar, int i10) {
        zzbaeVar.zzd |= 4;
        zzbaeVar.zzg = i10;
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
                    return new zzbad(zzaxlVar);
                }
                return new zzbae();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
