package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcxa extends zzdbs {
    private boolean zzb;

    public zzcxa(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcwz
                @Override // com.google.android.gms.internal.ads.zzdbr
                public final void zza(Object obj) {
                    ((zzcxc) obj).zzq();
                }
            });
            this.zzb = true;
        }
    }
}
