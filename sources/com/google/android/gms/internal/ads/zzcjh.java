package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcjh implements zzewe {
    private final zzciz zza;
    private Context zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcjh(zzciz zzcizVar, zzcjg zzcjgVar) {
        this.zza = zzcizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewe
    public final /* synthetic */ zzewe zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewe
    public final /* synthetic */ zzewe zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewe
    public final zzewf zzc() {
        zzgzb.zzc(this.zzb, Context.class);
        zzgzb.zzc(this.zzc, String.class);
        return new zzcjj(this.zza, this.zzb, this.zzc, null);
    }
}
