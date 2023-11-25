package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzals;
import com.google.android.gms.internal.ads.zzaly;
import com.google.android.gms.internal.ads.zzamd;
import com.google.android.gms.internal.ads.zzame;
import com.google.android.gms.internal.ads.zzaml;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbzt;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzax extends zzame {
    private final Context zzc;

    private zzax(Context context, zzamd zzamdVar) {
        super(zzamdVar);
        this.zzc = context;
    }

    public static zzals zzb(Context context) {
        zzals zzalsVar = new zzals(new zzaml(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzax(context, new zzamp()), 4);
        zzalsVar.zzd();
        return zzalsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzame, com.google.android.gms.internal.ads.zzali
    public final zzall zza(zzalp zzalpVar) throws zzaly {
        if (zzalpVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzen), zzalpVar.zzk())) {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (zzbzt.zzs(this.zzc, 13400000)) {
                    zzall zza = new zzbkn(this.zzc).zza(zzalpVar);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzalpVar.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzalpVar.zzk())));
                }
            }
        }
        return super.zza(zzalpVar);
    }
}
