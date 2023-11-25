package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzatj extends zzatm {
    private final View zzi;

    public zzatj(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i10, int i11, View view) {
        super(zzaryVar, "0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", zzanvVar, i10, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdg);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjR);
            zzasc zzascVar = new zzasc((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzaoq zza = zzaor.zza();
            zza.zzb(zzascVar.zza.longValue());
            zza.zzd(zzascVar.zzb.longValue());
            zza.zze(zzascVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzascVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzascVar.zzd.longValue());
            }
            this.zze.zzY((zzaor) zza.zzal());
        }
    }
}
