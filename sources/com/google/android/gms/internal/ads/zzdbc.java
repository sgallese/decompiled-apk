package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdbc extends zzdbs implements zzbhj {
    public zzdbc(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final synchronized void zzb(final String str, final String str2) {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbb
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
