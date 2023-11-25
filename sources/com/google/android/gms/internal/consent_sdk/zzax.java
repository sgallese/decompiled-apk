package com.google.android.gms.internal.consent_sdk;

import d8.b;
import d8.f;
import d8.g;
import d8.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public final class zzax implements h, g {
    private final h zza;
    private final g zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzax(h hVar, g gVar, zzav zzavVar) {
        this.zza = hVar;
        this.zzb = gVar;
    }

    @Override // d8.g
    public final void onConsentFormLoadFailure(f fVar) {
        this.zzb.onConsentFormLoadFailure(fVar);
    }

    @Override // d8.h
    public final void onConsentFormLoadSuccess(b bVar) {
        this.zza.onConsentFormLoadSuccess(bVar);
    }
}
