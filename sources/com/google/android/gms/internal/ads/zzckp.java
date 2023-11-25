package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzckp implements zzezj {
    private final zzciz zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzckp(zzciz zzcizVar, zzcko zzckoVar) {
        this.zza = zzcizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezj
    public final /* synthetic */ zzezj zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezj
    public final /* synthetic */ zzezj zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezj
    public final /* synthetic */ zzezj zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezj
    public final zzezk zzd() {
        zzgzb.zzc(this.zzb, Context.class);
        zzgzb.zzc(this.zzc, String.class);
        zzgzb.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzckr(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
