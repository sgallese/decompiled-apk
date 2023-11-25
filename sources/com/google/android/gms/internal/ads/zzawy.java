package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzawy implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzawq zza;
    final /* synthetic */ zzcas zzb;
    final /* synthetic */ zzaxa zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawy(zzaxa zzaxaVar, zzawq zzawqVar, zzcas zzcasVar) {
        this.zzc = zzaxaVar;
        this.zza = zzawqVar;
        this.zzb = zzcasVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z10;
        final zzawp zzawpVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzaxa zzaxaVar = this.zzc;
            z10 = zzaxaVar.zzb;
            if (!z10) {
                zzaxaVar.zzb = true;
                zzawpVar = this.zzc.zza;
                if (zzawpVar == null) {
                    return;
                }
                zzfyo zzfyoVar = zzcan.zza;
                final zzawq zzawqVar = this.zza;
                final zzcas zzcasVar = this.zzb;
                final com.google.common.util.concurrent.a zza = zzfyoVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzawv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzawn zzf;
                        zzawy zzawyVar = zzawy.this;
                        zzawp zzawpVar2 = zzawpVar;
                        zzawq zzawqVar2 = zzawqVar;
                        zzcas zzcasVar2 = zzcasVar;
                        try {
                            zzaws zzq = zzawpVar2.zzq();
                            if (zzawpVar2.zzp()) {
                                zzf = zzq.zzg(zzawqVar2);
                            } else {
                                zzf = zzq.zzf(zzawqVar2);
                            }
                            if (!zzf.zze()) {
                                zzcasVar2.zzd(new RuntimeException("No entry contents."));
                                zzaxa.zze(zzawyVar.zzc);
                                return;
                            }
                            zzawx zzawxVar = new zzawx(zzawyVar, zzf.zzc(), 1);
                            int read = zzawxVar.read();
                            if (read != -1) {
                                zzawxVar.unread(read);
                                zzcasVar2.zzc(zzaxc.zzb(zzawxVar, zzf.zzd(), zzf.zzg(), zzf.zza(), zzf.zzf()));
                                return;
                            }
                            throw new IOException("Unable to read from cache.");
                        } catch (RemoteException | IOException e10) {
                            zzcaa.zzh("Unable to obtain a cache service instance.", e10);
                            zzcasVar2.zzd(e10);
                            zzaxa.zze(zzawyVar.zzc);
                        }
                    }
                });
                final zzcas zzcasVar2 = this.zzb;
                zzcasVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaww
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcas zzcasVar3 = zzcas.this;
                        Future future = zza;
                        if (zzcasVar3.isCancelled()) {
                            future.cancel(true);
                        }
                    }
                }, zzcan.zzf);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}
