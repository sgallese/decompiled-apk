package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzchg {
    private final zzcag zza;
    private final Context zzb;
    private final WeakReference zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchg(zzche zzcheVar, zzchf zzchfVar) {
        zzcag zzcagVar;
        Context context;
        WeakReference weakReference;
        zzcagVar = zzcheVar.zza;
        this.zza = zzcagVar;
        context = zzcheVar.zzb;
        this.zzb = context;
        weakReference = zzcheVar.zzc;
        this.zzc = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzb;
    }

    public final zzaqx zzb() {
        return new zzaqx(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbed zzc() {
        return new zzbed(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcag zzd() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WeakReference zzf() {
        return this.zzc;
    }
}
