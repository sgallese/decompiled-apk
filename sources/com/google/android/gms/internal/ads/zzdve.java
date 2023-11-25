package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzdve extends Exception {
    private final int zza;

    public zzdve(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdve(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzdve(int i10, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
