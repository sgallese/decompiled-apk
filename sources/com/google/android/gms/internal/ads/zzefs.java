package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzefs implements zzdfy {
    private final zzfbe zza;
    private final zzbqc zzb;
    private final AdFormat zzc;
    private zzcxa zzd = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefs(zzfbe zzfbeVar, zzbqc zzbqcVar, AdFormat adFormat) {
        this.zza = zzfbeVar;
        this.zzb = zzbqcVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z10, Context context, zzcwv zzcwvVar) throws zzdfx {
        boolean zzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 6) {
                        zzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzdfx("Adapter failed to show.");
                }
                zzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            } else {
                zzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            }
            if (zzs) {
                if (this.zzd == null) {
                    return;
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbt)).booleanValue() && this.zza.zzZ == 2) {
                    this.zzd.zza();
                    return;
                }
                return;
            }
            throw new zzdfx("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdfx(th);
        }
    }

    public final void zzb(zzcxa zzcxaVar) {
        this.zzd = zzcxaVar;
    }
}
