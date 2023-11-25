package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzdwd;
import com.google.android.gms.internal.ads.zzfxl;
import com.google.android.gms.internal.ads.zzfye;
import com.google.common.util.concurrent.a;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzak implements zzfxl {
    private final Executor zza;
    private final zzdwd zzb;

    public zzak(Executor executor, zzdwd zzdwdVar) {
        this.zza = executor;
        this.zzb = zzdwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    public final /* bridge */ /* synthetic */ a zza(Object obj) throws Exception {
        final zzbun zzbunVar = (zzbun) obj;
        return zzfye.zzn(this.zzb.zzb(zzbunVar), new zzfxl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final a zza(Object obj2) {
                zzbun zzbunVar2 = zzbun.this;
                zzam zzamVar = new zzam(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzamVar.zzb = zzay.zzb().zzh(zzbunVar2.zza).toString();
                } catch (JSONException unused) {
                    zzamVar.zzb = "{}";
                }
                return zzfye.zzh(zzamVar);
            }
        }, this.zza);
    }
}
