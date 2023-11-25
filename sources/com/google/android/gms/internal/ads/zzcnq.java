package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcnq implements zzcms {
    private final zzdue zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnq(zzdue zzdueVar) {
        this.zza = zzdueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzn(str.equals("true"));
    }
}
