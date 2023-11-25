package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbku;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
final class zzei extends zzbku {
    final /* synthetic */ zzej zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzei(zzej zzejVar, zzeh zzehVar) {
        this.zza = zzejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zzb(List list) throws RemoteException {
        int i10;
        ArrayList arrayList;
        synchronized (zzej.zzg(this.zza)) {
            zzej.zzk(this.zza, false);
            zzej.zzj(this.zza, true);
            arrayList = new ArrayList(zzej.zzi(this.zza));
            zzej.zzi(this.zza).clear();
        }
        InitializationStatus zzd = zzej.zzd(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(zzd);
        }
    }
}
