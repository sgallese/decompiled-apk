package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbiw implements zzbir {
    private final Context zza;

    public zzbiw(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        char c10;
        if (!com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zza)) {
            return;
        }
        String str = (String) map.get("eventName");
        String str2 = (String) map.get("eventId");
        int hashCode = str.hashCode();
        if (hashCode != 94399) {
            if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals("_aa")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    zzcaa.zzg("logScionEvent gmsg contained unsupported eventName");
                    return;
                } else {
                    com.google.android.gms.ads.internal.zzt.zzn().zzk(this.zza, str2);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzn().zzn(this.zza, str2);
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzn().zzm(this.zza, str2);
    }
}
