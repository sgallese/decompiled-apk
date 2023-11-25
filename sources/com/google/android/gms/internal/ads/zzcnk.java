package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcnk implements zzcms {
    private final zzfbd zza;

    public zzcnk(zzfbd zzfbdVar) {
        this.zza = zzfbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zza.zzb(Boolean.parseBoolean(str));
            } catch (Exception e10) {
                throw new IllegalStateException("Invalid render_in_browser state", e10);
            }
        }
    }
}
