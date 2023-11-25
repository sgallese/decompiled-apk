package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbnt implements zzbjf {
    final /* synthetic */ zzbnu zza;
    private final zzcas zzb;

    public zzbnt(zzbnu zzbnuVar, zzcas zzcasVar) {
        this.zza = zzbnuVar;
        this.zzb = zzcasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzb.zzd(new zzbmx());
            } else {
                this.zzb.zzd(new zzbmx(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.zzb.zzd(e10);
        }
    }
}
