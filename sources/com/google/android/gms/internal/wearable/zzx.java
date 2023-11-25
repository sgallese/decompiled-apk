package com.google.android.gms.internal.wearable;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzx extends zzcg implements zzdo {
    private static final zzx zzb;
    private byte zze = 2;
    private zzcn zzd = zzcg.zzU();

    static {
        zzx zzxVar = new zzx();
        zzb = zzxVar;
        zzcg.zzab(zzx.class, zzxVar);
    }

    private zzx() {
    }

    public static zzn zza() {
        return (zzn) zzb.zzN();
    }

    public static zzx zzc(byte[] bArr) throws zzcq {
        return (zzx) zzcg.zzQ(zzb, bArr);
    }

    public static zzx zzd(byte[] bArr, zzbu zzbuVar) throws zzcq {
        return (zzx) zzcg.zzR(zzb, bArr, zzbuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzx zzxVar, Iterable iterable) {
        zzcn zzcnVar = zzxVar.zzd;
        if (!zzcnVar.zzc()) {
            zzxVar.zzd = zzcg.zzV(zzcnVar);
        }
        zzar.zzJ(iterable, zzxVar.zzd);
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
                            this.zze = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzn(zzmVar);
                }
                return new zzx();
            }
            return zzcg.zzY(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", zzw.class});
        }
        return Byte.valueOf(this.zze);
    }

    public final List zze() {
        return this.zzd;
    }
}
