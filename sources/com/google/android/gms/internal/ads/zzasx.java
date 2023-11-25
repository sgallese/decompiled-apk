package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzasx extends zzatm {
    private final zzarb zzi;
    private final long zzj;
    private final long zzk;

    public zzasx(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i10, int i11, zzarb zzarbVar, long j10, long j11) {
        super(zzaryVar, "KHu8Xbxzr2mu9S25CNgKE5zXBf18Zj2waiAPYoFRjyhOXCyg+mYLv2x/JjCH7GjX", "NOrE2caDXO4nkFR2Fjy7NgGPKtPlIg1WAorknI/US68=", zzanvVar, i10, 11);
        this.zzi = zzarbVar;
        this.zzj = j10;
        this.zzk = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzarb zzarbVar = this.zzi;
        if (zzarbVar != null) {
            zzaqz zzaqzVar = new zzaqz((String) this.zzf.invoke(null, zzarbVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzz(zzaqzVar.zza.longValue());
                if (zzaqzVar.zzb.longValue() >= 0) {
                    this.zze.zzQ(zzaqzVar.zzb.longValue());
                }
                if (zzaqzVar.zzc.longValue() >= 0) {
                    this.zze.zzf(zzaqzVar.zzc.longValue());
                }
            }
        }
    }
}
