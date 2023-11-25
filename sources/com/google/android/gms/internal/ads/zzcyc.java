package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcyc extends zzdbs implements zzbhh {
    private final Bundle zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcyc(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcyb
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
