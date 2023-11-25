package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzakd {
    private final List zza;
    private final zzace[] zzb;

    public zzakd(List list) {
        this.zza = list;
        this.zzb = new zzace[list.size()];
    }

    public final void zza(long j10, zzfb zzfbVar) {
        if (zzfbVar.zza() < 9) {
            return;
        }
        int zzf = zzfbVar.zzf();
        int zzf2 = zzfbVar.zzf();
        int zzl = zzfbVar.zzl();
        if (zzf == 434 && zzf2 == 1195456820 && zzl == 3) {
            zzaao.zzb(j10, zzfbVar, this.zzb);
        }
    }

    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzakaVar.zzc();
            zzace zzv = zzabeVar.zzv(zzakaVar.zza(), 3);
            zzam zzamVar = (zzam) this.zza.get(i10);
            String str = zzamVar.zzm;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            zzdy.zze(z10, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzak zzakVar = new zzak();
            zzakVar.zzH(zzakaVar.zzb());
            zzakVar.zzS(str);
            zzakVar.zzU(zzamVar.zze);
            zzakVar.zzK(zzamVar.zzd);
            zzakVar.zzu(zzamVar.zzE);
            zzakVar.zzI(zzamVar.zzo);
            zzv.zzk(zzakVar.zzY());
            this.zzb[i10] = zzv;
        }
    }
}
