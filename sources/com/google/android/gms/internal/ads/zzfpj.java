package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfpj extends zzfpv {
    final /* synthetic */ zzfpk zza;
    private final zzfpp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpj(zzfpk zzfpkVar, zzfpp zzfppVar) {
        this.zza = zzfpkVar;
        this.zzb = zzfppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfpn zzc = zzfpo.zzc();
        zzc.zzb(i10);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i10 == 8157) {
            this.zza.zzc();
        }
    }
}
