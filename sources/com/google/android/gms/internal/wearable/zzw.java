package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzw extends zzcg implements zzdo {
    private static final zzw zzb;
    private int zzd;
    private zzv zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        zzw zzwVar = new zzw();
        zzb = zzwVar;
        zzcg.zzab(zzw.class, zzwVar);
    }

    private zzw() {
    }

    public static zzo zza() {
        return (zzo) zzb.zzN();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzw zzwVar, String str) {
        str.getClass();
        zzwVar.zzd |= 1;
        zzwVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzw zzwVar, zzv zzvVar) {
        zzvVar.getClass();
        zzwVar.zzf = zzvVar;
        zzwVar.zzd |= 2;
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
                    return new zzo(zzmVar);
                }
                return new zzw();
            }
            return zzcg.zzY(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }

    public final zzv zzb() {
        zzv zzvVar = this.zzf;
        if (zzvVar == null) {
            return zzv.zzd();
        }
        return zzvVar;
    }

    public final String zzd() {
        return this.zze;
    }
}
