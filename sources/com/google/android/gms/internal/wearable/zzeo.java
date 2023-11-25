package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzeo extends RuntimeException {
    public zzeo(zzdn zzdnVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzcq zza() {
        return new zzcq(getMessage());
    }
}
