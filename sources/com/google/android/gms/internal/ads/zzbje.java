package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbje implements zzbjf {
    final /* synthetic */ zzcas zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbje(zzbjg zzbjgVar, zzcas zzcasVar) {
        this.zza = zzcasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zza(String str) {
        this.zza.zzd(new zzbmx(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
