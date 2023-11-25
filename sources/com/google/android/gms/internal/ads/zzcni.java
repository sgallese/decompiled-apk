package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcni implements zzcms {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzcni(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            this.zzb.zzH(parseBoolean);
            if (parseBoolean) {
                Context context = this.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
                    context.deleteDatabase("OfflineUpload.db");
                }
                try {
                    zzfoi zzj = zzfoi.zzj(context);
                    zzfoj zzi = zzfoj.zzi(context);
                    zzj.zzk();
                    zzj.zzl();
                    zzi.zzj();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcL)).booleanValue()) {
                        zzi.zzk();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcM)).booleanValue()) {
                        zzi.zzl();
                    }
                } catch (IOException e10) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "clearStorageOnIdlessMode");
                }
            }
        }
        map.remove("gad_idless");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        com.google.android.gms.ads.internal.zzt.zzn().zzr(bundle);
    }
}
