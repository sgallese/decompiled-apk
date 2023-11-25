package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzatu extends zzgrq implements zzgtb {
    private static final zzatu zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzatu zzatuVar = new zzatu();
        zzb = zzatuVar;
        zzgrq.zzaU(zzatu.class, zzatuVar);
    }

    private zzatu() {
    }

    public static zzatt zze() {
        return (zzatt) zzb.zzaA();
    }

    public static zzatu zzg() {
        return zzb;
    }

    public static zzatu zzh(zzgqi zzgqiVar) throws zzgsc {
        return (zzatu) zzgrq.zzaE(zzb, zzgqiVar);
    }

    public static zzatu zzi(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzatu) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzatu zzatuVar, String str) {
        str.getClass();
        zzatuVar.zzd |= 1;
        zzatuVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzatu zzatuVar, long j10) {
        zzatuVar.zzd |= 16;
        zzatuVar.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzatu zzatuVar, String str) {
        str.getClass();
        zzatuVar.zzd |= 2;
        zzatuVar.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzatu zzatuVar, long j10) {
        zzatuVar.zzd |= 4;
        zzatuVar.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzatu zzatuVar, long j10) {
        zzatuVar.zzd |= 8;
        zzatuVar.zzh = j10;
    }

    public final long zza() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzats zzatsVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzatt(zzatsVar);
                }
                return new zzatu();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}
