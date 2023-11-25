package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeqa implements zzesi {
    public final zzfbd zza;

    public zzeqa(zzfbd zzfbdVar) {
        this.zza = zzfbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesi
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfbd zzfbdVar = this.zza;
        if (zzfbdVar != null) {
            bundle.putBoolean("render_in_browser", zzfbdVar.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
