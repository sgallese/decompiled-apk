package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzar {
    private String zza;
    private Uri zzb;
    private final zzat zzc = new zzat();
    private final zzba zzd = new zzba(null);
    private final List zze = Collections.emptyList();
    private final zzfud zzf = zzfud.zzl();
    private final zzbd zzg = new zzbd();
    private final zzbl zzh = zzbl.zza;

    public final zzar zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzar zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.internal.ads.zzaw, com.google.android.gms.internal.ads.zzbe] */
    public final zzbp zzc() {
        zzbi zzbiVar;
        Uri uri = this.zzb;
        ?? r11 = 0;
        if (uri != null) {
            zzbiVar = new zzbi(uri, null, null, null, this.zze, null, this.zzf, null, null);
        } else {
            zzbiVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzbp(str, new zzax(this.zzc, r11), zzbiVar, new zzbf(this.zzg), zzbv.zza, this.zzh, null);
    }
}
