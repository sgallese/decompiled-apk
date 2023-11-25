package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeta implements zzesi {
    final String zza;
    final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeta(String str, int i10, zzesz zzeszVar) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzesi
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjw)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                bundle.putString("topics", this.zza);
            }
            int i10 = this.zzb;
            if (i10 != -1) {
                bundle.putInt("atps", i10);
            }
        }
    }
}
