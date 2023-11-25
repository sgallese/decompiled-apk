package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcot {
    private final String zza;
    private final zzbnr zzb;
    private final Executor zzc;
    private zzcoy zzd;
    private final zzbir zze = new zzcoq(this);
    private final zzbir zzf = new zzcos(this);

    public zzcot(String str, zzbnr zzbnrVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbnrVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzg(zzcot zzcotVar, Map map) {
        if (map != null) {
            String str = (String) map.get("hashCode");
            if (!TextUtils.isEmpty(str) && str.equals(zzcotVar.zza)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void zzc(zzcoy zzcoyVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcoyVar;
    }

    public final void zzd(zzcfi zzcfiVar) {
        zzcfiVar.zzad("/updateActiveView", this.zze);
        zzcfiVar.zzad("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcfi zzcfiVar) {
        zzcfiVar.zzau("/updateActiveView", this.zze);
        zzcfiVar.zzau("/untrackActiveViewUnit", this.zzf);
    }
}
