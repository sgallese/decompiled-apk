package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzenv implements zzesi {
    private final Integer zza;

    private zzenv(Integer num) {
        this.zza = num;
    }

    public static /* bridge */ /* synthetic */ zzenv zzb() {
        int extensionVersion;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjo)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            int i10 = 0;
            if (Build.VERSION.SDK_INT >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion > 3) {
                    i10 = SdkExtensions.getExtensionVersion(1000000);
                }
            }
            return new zzenv(Integer.valueOf(i10));
        }
        return new zzenv(null);
    }

    @Override // com.google.android.gms.internal.ads.zzesi
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Integer num = this.zza;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
