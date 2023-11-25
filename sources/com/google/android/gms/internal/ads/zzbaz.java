package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbaz extends zzgrq implements zzgtb {
    private static final zzbaz zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbaz zzbazVar = new zzbaz();
        zzb = zzbazVar;
        zzgrq.zzaU(zzbaz.class, zzbazVar);
    }

    private zzbaz() {
    }

    public static zzbay zza() {
        return (zzbay) zzb.zzaA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzbaz zzbazVar, boolean z10) {
        zzbazVar.zzd |= 1;
        zzbazVar.zze = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzbaz zzbazVar, int i10) {
        zzbazVar.zzd |= 2;
        zzbazVar.zzf = i10;
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
                    return new zzbay(zzaxlVar);
                }
                return new zzbaz();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
