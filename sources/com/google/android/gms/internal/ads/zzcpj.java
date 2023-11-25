package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcpj implements zzgyt {
    private final zzgzg zza;

    public zzcpj(zzgzg zzgzgVar) {
        this.zza = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcsu) this.zza).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
