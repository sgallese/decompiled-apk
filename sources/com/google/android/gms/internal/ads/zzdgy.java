package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzdgy implements zzbir {
    private final WeakReference zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdgy(zzdgz zzdgzVar, zzdgx zzdgxVar) {
        this.zza = new WeakReference(zzdgzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        zzdgz zzdgzVar = (zzdgz) this.zza.get();
        if (zzdgzVar == null) {
            return;
        }
        zzdgz.zzc(zzdgzVar).zza();
    }
}
