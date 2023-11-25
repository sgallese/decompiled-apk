package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzahu extends zzahy {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzfb zzfbVar) {
        return zzk(zzfbVar, zza);
    }

    private static boolean zzk(zzfb zzfbVar, byte[] bArr) {
        if (zzfbVar.zza() < 8) {
            return false;
        }
        int zzc = zzfbVar.zzc();
        byte[] bArr2 = new byte[8];
        zzfbVar.zzC(bArr2, 0, 8);
        zzfbVar.zzG(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final long zza(zzfb zzfbVar) {
        return zzg(zzabw.zzc(zzfbVar.zzI()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzahy
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final boolean zzc(zzfb zzfbVar, long j10, zzahv zzahvVar) throws zzcd {
        if (zzk(zzfbVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzfbVar.zzI(), zzfbVar.zzd());
            int i10 = copyOf[9] & 255;
            List zzd = zzabw.zzd(copyOf);
            if (zzahvVar.zza != null) {
                return true;
            }
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/opus");
            zzakVar.zzw(i10);
            zzakVar.zzT(48000);
            zzakVar.zzI(zzd);
            zzahvVar.zza = zzakVar.zzY();
            return true;
        } else if (zzk(zzfbVar, zzb)) {
            zzdy.zzb(zzahvVar.zza);
            if (this.zzc) {
                return true;
            }
            this.zzc = true;
            zzfbVar.zzH(8);
            zzbz zzb2 = zzack.zzb(zzfud.zzk(zzack.zzc(zzfbVar, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzak zzb3 = zzahvVar.zza.zzb();
            zzb3.zzM(zzb2.zzd(zzahvVar.zza.zzk));
            zzahvVar.zza = zzb3.zzY();
            return true;
        } else {
            zzdy.zzb(zzahvVar.zza);
            return false;
        }
    }
}
