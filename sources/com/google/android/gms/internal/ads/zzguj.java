package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzguj extends RuntimeException {
    public zzguj(zzgta zzgtaVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgsc zza() {
        return new zzgsc(getMessage());
    }
}
