package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdq extends Exception {
    public final zzdp zza;

    public zzdq(String str, zzdp zzdpVar) {
        super("Unhandled input format: ".concat(String.valueOf(zzdpVar)));
        this.zza = zzdpVar;
    }
}
