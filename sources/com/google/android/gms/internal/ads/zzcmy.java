package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcmy implements zzcms {
    private final zzdue zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmy(zzdue zzdueVar) {
        this.zza = zzdueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map) {
        char c10;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c10 = 0;
            }
            c10 = 65535;
        } else {
            if (str.equals("flick")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                this.zza.zzl(zzdua.NONE);
                return;
            } else {
                this.zza.zzl(zzdua.FLICK);
                return;
            }
        }
        this.zza.zzl(zzdua.SHAKE);
    }
}
