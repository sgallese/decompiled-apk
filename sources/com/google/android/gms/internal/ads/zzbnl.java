package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbnl implements zzbjf {
    final /* synthetic */ zzbnm zza;
    private final zzbmo zzb;
    private final zzcas zzc;

    public zzbnl(zzbnm zzbnmVar, zzbmo zzbmoVar, zzcas zzcasVar) {
        this.zza = zzbnmVar;
        this.zzb = zzbmoVar;
        this.zzc = zzcasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zza(String str) {
        zzbmo zzbmoVar;
        try {
            if (str == null) {
                this.zzc.zzd(new zzbmx());
            } else {
                this.zzc.zzd(new zzbmx(str));
            }
            zzbmoVar = this.zzb;
        } catch (IllegalStateException unused) {
            zzbmoVar = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbmoVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zzb(JSONObject jSONObject) {
        zzbmo zzbmoVar;
        zzbna zzbnaVar;
        try {
            try {
                zzcas zzcasVar = this.zzc;
                zzbnaVar = this.zza.zza;
                zzcasVar.zzc(zzbnaVar.zza(jSONObject));
                zzbmoVar = this.zzb;
            } catch (IllegalStateException unused) {
                zzbmoVar = this.zzb;
            } catch (JSONException e10) {
                this.zzc.zzd(e10);
                zzbmoVar = this.zzb;
            }
            zzbmoVar.zzb();
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
    }
}
