package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgnl extends zzgrq implements zzgtb {
    private static final zzgnl zzb;
    private int zzd;
    private int zze;
    private zzgno zzf;

    static {
        zzgnl zzgnlVar = new zzgnl();
        zzb = zzgnlVar;
        zzgrq.zzaU(zzgnl.class, zzgnlVar);
    }

    private zzgnl() {
    }

    public static zzgnk zzc() {
        return (zzgnk) zzb.zzaA();
    }

    public static zzgnl zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgnl) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgnl zzgnlVar, zzgno zzgnoVar) {
        zzgnoVar.getClass();
        zzgnlVar.zzf = zzgnoVar;
        zzgnlVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgnj zzgnjVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgnk(zzgnjVar);
                }
                return new zzgnl();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgno zzf() {
        zzgno zzgnoVar = this.zzf;
        if (zzgnoVar == null) {
            return zzgno.zzc();
        }
        return zzgnoVar;
    }
}
