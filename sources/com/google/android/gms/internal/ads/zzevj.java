package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzevj {
    private final zzbun zza;
    private final int zzb;

    public zzevj(zzbun zzbunVar, int i10) {
        this.zza = zzbunVar;
        this.zzb = i10;
    }

    public final int zza() {
        return this.zzb;
    }

    public final PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final String zzc() {
        return this.zza.zzd;
    }

    public final String zzd() {
        return zzfrx.zzc(this.zza.zza.getString("ms"));
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final List zzf() {
        return this.zza.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzh() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzi() {
        return this.zza.zzk;
    }
}
