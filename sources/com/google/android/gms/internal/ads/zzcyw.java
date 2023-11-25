package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcyw implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcyx zzcyxVar = (zzcyx) this.zza.get();
        if (zzcyxVar != null) {
            zzcyxVar.zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcyu
                @Override // com.google.android.gms.internal.ads.zzdbr
                public final void zza(Object obj) {
                    ((zzcyy) obj).zza();
                }
            });
        }
    }
}
