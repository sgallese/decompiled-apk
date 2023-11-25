package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcwg extends zzdbs implements com.google.android.gms.ads.internal.client.zza {
    public zzcwg(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcwf
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
