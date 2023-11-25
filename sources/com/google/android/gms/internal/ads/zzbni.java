package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbni {
    static final com.google.android.gms.ads.internal.util.zzbb zza = new zzbng();
    static final com.google.android.gms.ads.internal.util.zzbb zzb = new zzbnh();
    private final zzbmu zzc;

    public zzbni(Context context, zzcag zzcagVar, String str, zzfhu zzfhuVar) {
        this.zzc = new zzbmu(context, zzcagVar, str, zza, zzb, zzfhuVar);
    }

    public final zzbmy zza(String str, zzbnb zzbnbVar, zzbna zzbnaVar) {
        return new zzbnm(this.zzc, str, zzbnbVar, zzbnaVar);
    }

    public final zzbnr zzb() {
        return new zzbnr(this.zzc);
    }
}
