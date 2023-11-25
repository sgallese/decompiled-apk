package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdtz {
    private final zzdtj zza;
    private final zzdoz zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtz(zzdtj zzdtjVar, zzdoz zzdozVar) {
        this.zza = zzdtjVar;
        this.zzb = zzdozVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z10;
        zzdoy zza;
        zzbqq zzbqqVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbko zzbkoVar = (zzbko) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziV)).booleanValue()) {
                    zzdoy zza2 = this.zzb.zza(zzbkoVar.zza);
                    if (zza2 != null && (zzbqqVar = zza2.zzc) != null) {
                        str = zzbqqVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziW)).booleanValue() && (zza = this.zzb.zza(zzbkoVar.zza)) != null && zza.zzd) {
                    z10 = true;
                    List list2 = this.zzd;
                    String str3 = zzbkoVar.zza;
                    list2.add(new zzdty(str3, str2, this.zzb.zzc(str3), zzbkoVar.zzb ? 1 : 0, zzbkoVar.zzd, zzbkoVar.zzc, z10));
                }
                z10 = false;
                List list22 = this.zzd;
                String str32 = zzbkoVar.zza;
                list22.add(new zzdty(str32, str2, this.zzb.zzc(str32), zzbkoVar.zzb ? 1 : 0, zzbkoVar.zzd, zzbkoVar.zzc, z10));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                    return jSONArray;
                }
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzdty) it.next()).zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdtx(this));
    }
}
