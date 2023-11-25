package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzaho extends zzahy {
    private zzabo zza;
    private zzahn zzb;

    private static boolean zzd(byte[] bArr) {
        if (bArr[0] != -1) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final long zza(zzfb zzfbVar) {
        if (zzd(zzfbVar.zzI())) {
            int i10 = (zzfbVar.zzI()[2] & 255) >> 4;
            if (i10 != 6) {
                if (i10 == 7) {
                    i10 = 7;
                }
                int zza = zzabk.zza(zzfbVar, i10);
                zzfbVar.zzG(0);
                return zza;
            }
            zzfbVar.zzH(4);
            zzfbVar.zzv();
            int zza2 = zzabk.zza(zzfbVar, i10);
            zzfbVar.zzG(0);
            return zza2;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzahy
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final boolean zzc(zzfb zzfbVar, long j10, zzahv zzahvVar) {
        byte[] zzI = zzfbVar.zzI();
        zzabo zzaboVar = this.zza;
        if (zzaboVar == null) {
            zzabo zzaboVar2 = new zzabo(zzI, 17);
            this.zza = zzaboVar2;
            zzahvVar.zza = zzaboVar2.zzc(Arrays.copyOfRange(zzI, 9, zzfbVar.zzd()), null);
            return true;
        } else if ((zzI[0] & Byte.MAX_VALUE) == 3) {
            zzabn zzb = zzabl.zzb(zzfbVar);
            zzabo zzf = zzaboVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzahn(zzf, zzb);
            return true;
        } else if (!zzd(zzI)) {
            return true;
        } else {
            zzahn zzahnVar = this.zzb;
            if (zzahnVar != null) {
                zzahnVar.zza(j10);
                zzahvVar.zzb = this.zzb;
            }
            zzahvVar.zza.getClass();
            return false;
        }
    }
}
