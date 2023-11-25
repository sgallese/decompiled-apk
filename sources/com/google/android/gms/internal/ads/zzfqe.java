package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfqe extends zzfpy {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfqh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqe(zzfqh zzfqhVar, IBinder iBinder) {
        this.zzb = zzfqhVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.zzfpy
    public final void zza() {
        List list;
        List list2;
        this.zzb.zza.zzn = zzfpt.zzb(this.zza);
        zzfqi.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
