package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzcqj {
    private final zzcsc zza;
    private final View zzb;
    private final zzfbf zzc;
    private final zzcfi zzd;

    public zzcqj(View view, zzcfi zzcfiVar, zzcsc zzcscVar, zzfbf zzfbfVar) {
        this.zzb = view;
        this.zzd = zzcfiVar;
        this.zza = zzcscVar;
        this.zzc = zzfbfVar;
    }

    public static final zzddo zzf(final Context context, final zzcag zzcagVar, final zzfbe zzfbeVar, final zzfca zzfcaVar) {
        return new zzddo(new zzcxw() { // from class: com.google.android.gms.internal.ads.zzcqh
            @Override // com.google.android.gms.internal.ads.zzcxw
            public final void zzr() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zzcagVar.zza, zzfbeVar.zzD.toString(), zzfcaVar.zzf);
            }
        }, zzcan.zzf);
    }

    public static final Set zzg(zzcrt zzcrtVar) {
        return Collections.singleton(new zzddo(zzcrtVar, zzcan.zzf));
    }

    public static final zzddo zzh(zzcrr zzcrrVar) {
        return new zzddo(zzcrrVar, zzcan.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcfi zzb() {
        return this.zzd;
    }

    public final zzcsc zzc() {
        return this.zza;
    }

    public zzcxu zzd(Set set) {
        return new zzcxu(set);
    }

    public final zzfbf zze() {
        return this.zzc;
    }
}
