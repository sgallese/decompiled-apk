package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzajp {
    private final List zza;
    private final zzace[] zzb;

    public zzajp(List list) {
        this.zza = list;
        this.zzb = new zzace[list.size()];
    }

    public final void zza(long j10, zzfb zzfbVar) {
        zzaao.zza(j10, zzfbVar, this.zzb);
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
            String str2 = zzamVar.zzb;
            if (str2 == null) {
                str2 = zzakaVar.zzb();
            }
            zzak zzakVar = new zzak();
            zzakVar.zzH(str2);
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
