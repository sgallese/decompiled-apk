package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzehc {
    private final Clock zza;
    private final zzehd zzb;
    private final zzfik zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgK)).booleanValue();
    private final zzeds zzf;

    public zzehc(Clock clock, zzehd zzehdVar, zzeds zzedsVar, zzfik zzfikVar) {
        this.zza = clock;
        this.zzb = zzehdVar;
        this.zzf = zzedsVar;
        this.zzc = zzfikVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzg(zzehc zzehcVar, String str, int i10, long j10, String str2, Integer num) {
        String str3 = str + "." + i10 + "." + j10;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbz)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        zzehcVar.zzd.add(str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.common.util.concurrent.a zze(zzfbr zzfbrVar, zzfbe zzfbeVar, com.google.common.util.concurrent.a aVar, zzfig zzfigVar) {
        zzfbi zzfbiVar = zzfbrVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfbeVar.zzx;
        if (str != null) {
            zzfye.zzr(aVar, new zzehb(this, elapsedRealtime, str, zzfbeVar, zzfbiVar, zzfigVar, zzfbrVar), zzcan.zzf);
        }
        return aVar;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}
