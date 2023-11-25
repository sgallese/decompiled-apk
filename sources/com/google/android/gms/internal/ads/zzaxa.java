package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaxa {
    private zzawp zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxa(Context context) {
        this.zzc = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zze(zzaxa zzaxaVar) {
        synchronized (zzaxaVar.zzd) {
            zzawp zzawpVar = zzaxaVar.zza;
            if (zzawpVar == null) {
                return;
            }
            zzawpVar.disconnect();
            zzaxaVar.zza = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future zzc(zzawq zzawqVar) {
        zzawu zzawuVar = new zzawu(this);
        zzawy zzawyVar = new zzawy(this, zzawqVar, zzawuVar);
        zzawz zzawzVar = new zzawz(this, zzawuVar);
        synchronized (this.zzd) {
            zzawp zzawpVar = new zzawp(this.zzc, com.google.android.gms.ads.internal.zzt.zzt().zzb(), zzawyVar, zzawzVar);
            this.zza = zzawpVar;
            zzawpVar.checkAvailabilityAndConnect();
        }
        return zzawuVar;
    }
}
