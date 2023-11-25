package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcyr extends zzdbs implements zzcxc, zzcyh {
    private final zzfbe zzb;
    private final AtomicBoolean zzc;

    public zzcyr(Set set, zzfbe zzfbeVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfbeVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhw)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzsVar = this.zzb.zzaf) != null && zzsVar.zza == 3) {
            zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcyq
                @Override // com.google.android.gms.internal.ads.zzdbr
                public final void zza(Object obj) {
                    zzcyr.this.zza((zzcyt) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzcyt zzcytVar) throws Exception {
        zzcytVar.zzh(this.zzb.zzaf);
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        int i10 = this.zzb.zzb;
        if (i10 != 2 && i10 != 5 && i10 != 4 && i10 != 6 && i10 != 7) {
            return;
        }
        zzb();
    }
}
