package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfya;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
final class zzz implements zzfya {
    final /* synthetic */ zzaa zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzz(zzaa zzaaVar) {
        this.zza = zzaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzdrm zzdrmVar;
        zzdrc zzdrcVar;
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaaVar = this.zza;
        zzdrmVar = zzaaVar.zzr;
        zzdrcVar = zzaaVar.zzj;
        zzf.zzc(zzdrmVar, zzdrcVar, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzcaa.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* synthetic */ void zzb(Object obj) {
        zzam zzamVar = (zzam) obj;
        zzcaa.zze("Initialized webview successfully for SDKCore.");
    }
}
