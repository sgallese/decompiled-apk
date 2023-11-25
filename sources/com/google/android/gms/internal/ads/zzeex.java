package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzeex extends zzbpp {
    final /* synthetic */ zzeey zza;
    private final zzedq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeex(zzeey zzeeyVar, zzedq zzedqVar, zzeew zzeewVar) {
        this.zza = zzeeyVar;
        this.zzb = zzedqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zze(String str) throws RemoteException {
        ((zzefj) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzefj) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzeey.zze(this.zza, (View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzefj) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzh(zzboo zzbooVar) throws RemoteException {
        zzeey.zzd(this.zza, zzbooVar);
        ((zzefj) this.zzb.zzc).zzo();
    }
}
