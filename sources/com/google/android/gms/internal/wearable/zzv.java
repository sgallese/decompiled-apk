package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzv extends zzcg implements zzdo {
    private static final zzv zzb;
    private int zzd;
    private zzu zzf;
    private byte zzg = 2;
    private int zze = 1;

    static {
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzcg.zzab(zzv.class, zzvVar);
    }

    private zzv() {
    }

    public static zzp zza() {
        return (zzp) zzb.zzN();
    }

    public static zzv zzd() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzv zzvVar, zzu zzuVar) {
        zzuVar.getClass();
        zzvVar.zzf = zzuVar;
        zzvVar.zzd |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzv zzvVar, int i10) {
        zzvVar.zze = i10;
        zzvVar.zzd |= 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.wearable.zzcg
    public final Object zzG(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 != 2) {
                if (i11 != 3) {
                    zzm zzmVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (obj == null) {
                                b10 = 0;
                            }
                            this.zzg = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzp(zzmVar);
                }
                return new zzv();
            }
            return zzcg.zzY(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᐉ\u0001", new Object[]{"zzd", "zze", zzr.zza, "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }

    public final zzu zzb() {
        zzu zzuVar = this.zzf;
        if (zzuVar == null) {
            return zzu.zzj();
        }
        return zzuVar;
    }

    public final int zzf() {
        int zza = zzs.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
