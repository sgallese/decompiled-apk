package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import d8.c;
import d8.d;
import d8.e;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public final class zzk {
    private final zzam zza;
    private final zzv zzb;
    private final zzba zzc;

    public zzk(zzam zzamVar, zzv zzvVar, zzba zzbaVar) {
        this.zza = zzamVar;
        this.zzb = zzvVar;
        this.zzc = zzbaVar;
    }

    public final int getConsentStatus() {
        return this.zza.zza();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzc();
    }

    public final void requestConsentInfoUpdate(Activity activity, e eVar, d dVar, c cVar) {
        this.zzb.zzc(activity, eVar, dVar, cVar);
    }

    public final void reset() {
        this.zzc.zzb(null);
        this.zza.zzd();
    }
}
