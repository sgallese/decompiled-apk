package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbnu implements zzfxl {
    private final zzbna zza;
    private final zzbnb zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final com.google.common.util.concurrent.a zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnu(com.google.common.util.concurrent.a aVar, String str, zzbnb zzbnbVar, zzbna zzbnaVar) {
        this.zzd = aVar;
        this.zzb = zzbnbVar;
        this.zza = zzbnaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    public final com.google.common.util.concurrent.a zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final com.google.common.util.concurrent.a zzb(final Object obj) {
        return zzfye.zzn(this.zzd, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzbns
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj2) {
                return zzbnu.this.zzc(obj, (zzbmv) obj2);
            }
        }, zzcan.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(Object obj, zzbmv zzbmvVar) throws Exception {
        zzcas zzcasVar = new zzcas();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbiq.zzo.zzc(uuid, new zzbnt(this, zzcasVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbmvVar.zzl(this.zzc, jSONObject);
        return zzcasVar;
    }
}
