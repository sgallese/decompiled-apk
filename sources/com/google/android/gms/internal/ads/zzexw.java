package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzexw implements zzeyv {
    private zzcvp zza;
    private final Executor zzb = zzfyu.zzb();

    public final zzcvp zza() {
        return this.zza;
    }

    public final com.google.common.util.concurrent.a zzb(zzeyw zzeywVar, zzeyu zzeyuVar, zzcvp zzcvpVar) {
        zzcvo zza = zzeyuVar.zza(zzeywVar.zzb);
        zza.zzb(new zzeyz(true));
        zzcvp zzcvpVar2 = (zzcvp) zza.zzh();
        this.zza = zzcvpVar2;
        final zzctl zzb = zzcvpVar2.zzb();
        final zzfdw zzfdwVar = new zzfdw();
        return zzfye.zzm(zzfye.zzn(zzfxv.zzu(zzb.zzj()), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzexu
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                zzfdw zzfdwVar2 = zzfdwVar;
                zzctl zzctlVar = zzb;
                zzfbr zzfbrVar = (zzfbr) obj;
                zzfdwVar2.zzb = zzfbrVar;
                Iterator it = zzfbrVar.zzb.zza.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfbe) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return zzctlVar.zzi(zzfye.zzh(zzfbrVar));
                    }
                }
                return zzfye.zzh(null);
            }
        }, this.zzb), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzexv
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                zzfdw zzfdwVar2 = zzfdw.this;
                zzfdwVar2.zzc = (zzcse) obj;
                return zzfdwVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.a zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
