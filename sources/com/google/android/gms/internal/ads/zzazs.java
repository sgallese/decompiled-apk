package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzazs extends zzgrq implements zzgtb {
    private static final zzazs zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private zzgrz zze = zzgrq.zzaN();
    private String zzi = "";
    private String zzj = "";

    static {
        zzazs zzazsVar = new zzazs();
        zzb = zzazsVar;
        zzgrq.zzaU(zzazs.class, zzazsVar);
    }

    private zzazs() {
    }

    public static zzazo zza() {
        return (zzazo) zzb.zzaA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzazs zzazsVar, Iterable iterable) {
        zzgrz zzgrzVar = zzazsVar.zze;
        if (!zzgrzVar.zzc()) {
            zzazsVar.zze = zzgrq.zzaO(zzgrzVar);
        }
        zzgpr.zzav(iterable, zzazsVar.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzazs zzazsVar, int i10) {
        zzazsVar.zzd |= 1;
        zzazsVar.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzazs zzazsVar, int i10) {
        zzazsVar.zzd |= 2;
        zzazsVar.zzg = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzazs zzazsVar, long j10) {
        zzazsVar.zzd |= 4;
        zzazsVar.zzh = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzazs zzazsVar, String str) {
        str.getClass();
        zzazsVar.zzd |= 8;
        zzazsVar.zzi = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzazs zzazsVar, String str) {
        str.getClass();
        zzazsVar.zzd |= 16;
        zzazsVar.zzj = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzazs zzazsVar, long j10) {
        zzazsVar.zzd |= 32;
        zzazsVar.zzk = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzazs zzazsVar, int i10) {
        zzazsVar.zzd |= 64;
        zzazsVar.zzl = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new zzazo(zzaxlVar);
                }
                return new zzazs();
            }
            return zzgrq.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", zzazn.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
