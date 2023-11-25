package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzemw implements zzesj {
    private final zzfyo zza;
    private final zzdpc zzb;
    private final zzdtj zzc;
    private final zzemy zzd;

    public zzemw(zzfyo zzfyoVar, zzdpc zzdpcVar, zzdtj zzdtjVar, zzemy zzemyVar) {
        this.zza = zzfyoVar;
        this.zzb = zzdpcVar;
        this.zzc = zzdtjVar;
        this.zzd = zzemyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        zzbbj zzbbjVar = zzbbr.zzku;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue() && this.zzd.zza() != null) {
            zzemx zza = this.zzd.zza();
            zza.getClass();
            return zzfye.zzh(zza);
        }
        if (!zzfrx.zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbo)) && (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue() || (!this.zzd.zzd() && this.zzc.zzt()))) {
            this.zzd.zzc(true);
            return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzemw.this.zzc();
                }
            });
        }
        return zzfye.zzh(new zzemx(new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzemx zzc() throws Exception {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbo)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfcw zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzku)).booleanValue() || zzt) {
                    try {
                        zzbqq zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzfcf unused) {
                    }
                }
                try {
                    zzbqq zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfcf unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfcf unused3) {
            }
        }
        zzemx zzemxVar = new zzemx(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzku)).booleanValue()) {
            this.zzd.zzb(zzemxVar);
        }
        return zzemxVar;
    }
}
