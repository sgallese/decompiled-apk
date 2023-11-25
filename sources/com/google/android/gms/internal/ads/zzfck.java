package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfck {
    private final zzfbe zza;
    private final zzfbi zzb;
    private final zzech zzc;
    private final zzfik zzd;
    private final zzfhr zze;
    private final zzcob zzf;

    public zzfck(zzech zzechVar, zzfik zzfikVar, zzfbe zzfbeVar, zzfbi zzfbiVar, zzcob zzcobVar, zzfhr zzfhrVar) {
        this.zza = zzfbeVar;
        this.zzb = zzfbiVar;
        this.zzc = zzechVar;
        this.zzd = zzfikVar;
        this.zzf = zzcobVar;
        this.zze = zzfhrVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i10) {
        if (!this.zza.zzaj) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        this.zzc.zzd(new zzecj(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzb.zzb, str, i10));
    }

    public final void zzc(List list, int i10) {
        com.google.common.util.concurrent.a zzh;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjo)).booleanValue()) {
                zzh = this.zzf.zzc(str, com.google.android.gms.ads.internal.client.zzay.zze());
            } else {
                zzh = zzfye.zzh(str);
            }
            zzfye.zzr(zzh, new zzfcj(this, i10), zzcan.zza);
        }
    }
}
