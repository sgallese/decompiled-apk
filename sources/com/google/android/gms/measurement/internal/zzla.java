package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzla implements zzlm {
    final /* synthetic */ zzlf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzla(zzlf zzlfVar) {
        this.zza = zzlfVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlm
    public final void zza(String str, String str2, Bundle bundle) {
        zzgd zzgdVar;
        zzgd zzgdVar2;
        if (TextUtils.isEmpty(str)) {
            zzlf zzlfVar = this.zza;
            zzgdVar = zzlfVar.zzn;
            if (zzgdVar != null) {
                zzgdVar2 = zzlfVar.zzn;
                zzgdVar2.zzaA().zzd().zzb("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.zza.zzaB().zzp(new zzkz(this, str, "_err", bundle));
    }
}
