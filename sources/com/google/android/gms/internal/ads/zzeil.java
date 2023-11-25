package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeil implements zzedp {
    private final zzejp zza;
    private final zzdpc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeil(zzejp zzejpVar, zzdpc zzdpcVar) {
        this.zza = zzejpVar;
        this.zzb = zzdpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final zzedq zza(String str, JSONObject jSONObject) throws zzfcf {
        zzbqc zzbqcVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbB)).booleanValue()) {
            try {
                zzbqcVar = this.zzb.zzb(str);
            } catch (RemoteException e10) {
                zzcaa.zzh("Coundn't create RTB adapter: ", e10);
                zzbqcVar = null;
            }
        } else {
            zzbqcVar = this.zza.zza(str);
        }
        if (zzbqcVar == null) {
            return null;
        }
        return new zzedq(zzbqcVar, new zzefj(), str);
    }
}
