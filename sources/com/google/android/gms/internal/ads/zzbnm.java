package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbnm implements zzbmy {
    private final zzbna zza;
    private final zzbnb zzb;
    private final zzbmu zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnm(zzbmu zzbmuVar, String str, zzbnb zzbnbVar, zzbna zzbnaVar) {
        this.zzc = zzbmuVar;
        this.zzd = str;
        this.zzb = zzbnbVar;
        this.zza = zzbnaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzd(zzbnm zzbnmVar, zzbmo zzbmoVar, zzbmv zzbmvVar, Object obj, zzcas zzcasVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbiq.zzo.zzc(uuid, new zzbnl(zzbnmVar, zzbmoVar, zzcasVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbnmVar.zzb.zzb(obj));
            zzbmvVar.zzl(zzbnmVar.zzd, jSONObject);
        } catch (Exception e10) {
            try {
                zzcasVar.zzd(e10);
                zzcaa.zzh("Unable to invokeJavascript", e10);
            } finally {
                zzbmoVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    public final com.google.common.util.concurrent.a zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final com.google.common.util.concurrent.a zzb(Object obj) {
        zzcas zzcasVar = new zzcas();
        zzbmo zzb = this.zzc.zzb(null);
        zzb.zzi(new zzbnj(this, zzb, obj, zzcasVar), new zzbnk(this, zzcasVar, zzb));
        return zzcasVar;
    }
}
