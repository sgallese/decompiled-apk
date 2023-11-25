package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdkb implements zzcxc {
    private final zzdic zza;
    private final zzdih zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdkb(zzdic zzdicVar, zzdih zzdihVar, Executor executor, Executor executor2) {
        this.zza = zzdicVar;
        this.zzb = zzdihVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcfi zzcfiVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // java.lang.Runnable
            public final void run() {
                zzcfi.this.zzd("onSdkImpression", new androidx.collection.a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if (!this.zzb.zzd()) {
            return;
        }
        zzdic zzdicVar = this.zza;
        zzfip zzu = zzdicVar.zzu();
        if (zzu == null && zzdicVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
            zzdic zzdicVar2 = this.zza;
            com.google.common.util.concurrent.a zzw = zzdicVar2.zzw();
            zzcas zzp = zzdicVar2.zzp();
            if (zzw != null && zzp != null) {
                zzfye.zzr(zzfye.zzl(zzw, zzp), new zzdka(this), this.zzd);
            }
        } else if (zzu == null) {
        } else {
            zzdic zzdicVar3 = this.zza;
            zzcfi zzr = zzdicVar3.zzr();
            zzcfi zzs = zzdicVar3.zzs();
            if (zzr == null) {
                if (zzs != null) {
                    zzr = zzs;
                } else {
                    zzr = null;
                }
            }
            if (zzr != null) {
                zzb(zzr);
            }
        }
    }
}
