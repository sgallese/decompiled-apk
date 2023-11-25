package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaxq extends zzgrq implements zzgtb {
    private static final zzaxq zzb;
    private int zzd;
    private int zze;
    private zzayg zzg;
    private zzayi zzh;
    private zzayk zzj;
    private zzazu zzk;
    private zzazk zzl;
    private zzayy zzm;
    private zzaza zzn;
    private int zzf = 1000;
    private zzgrz zzi = zzgrq.zzaN();
    private zzgrz zzo = zzgrq.zzaN();

    static {
        zzaxq zzaxqVar = new zzaxq();
        zzb = zzaxqVar;
        zzgrq.zzaU(zzaxq.class, zzaxqVar);
    }

    private zzaxq() {
    }

    public static zzaxq zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzaxq zzaxqVar, zzaxo zzaxoVar) {
        zzaxqVar.zze = zzaxoVar.zza();
        zzaxqVar.zzd |= 1;
    }

    public static /* synthetic */ void zzf(zzaxq zzaxqVar, zzayi zzayiVar) {
        zzayiVar.getClass();
        zzaxqVar.zzh = zzayiVar;
        zzaxqVar.zzd |= 8;
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
                    return new zzaxp(zzaxlVar);
                }
                return new zzaxq();
            }
            return zzgrq.zzaR(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", zzaxn.zza, "zzf", zzayr.zza, "zzg", "zzh", "zzi", zzaye.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzbag.class});
        }
        return (byte) 1;
    }

    public final zzayi zzd() {
        zzayi zzayiVar = this.zzh;
        if (zzayiVar == null) {
            return zzayi.zzc();
        }
        return zzayiVar;
    }
}
