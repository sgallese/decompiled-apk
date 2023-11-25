package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzals;
import com.google.android.gms.internal.ads.zzamv;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcas;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzbo {
    private static zzals zzb;
    private static final Object zzc = new Object();
    @Deprecated
    public static final zzbj zza = new zzbg();

    public zzbo(Context context) {
        zzals zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbbr.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzem)).booleanValue()) {
                        zza2 = zzax.zzb(context);
                        zzb = zza2;
                    }
                }
                zza2 = zzamv.zza(context, null);
                zzb = zza2;
            }
        }
    }

    public final com.google.common.util.concurrent.a zza(String str) {
        zzcas zzcasVar = new zzcas();
        zzb.zza(new zzbn(str, null, zzcasVar));
        return zzcasVar;
    }

    public final com.google.common.util.concurrent.a zzb(int i10, String str, Map map, byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbh zzbhVar = new zzbh(this, str, zzblVar);
        zzbzz zzbzzVar = new zzbzz(null);
        zzbi zzbiVar = new zzbi(this, i10, str, zzblVar, zzbhVar, bArr, map, zzbzzVar);
        if (zzbzz.zzk()) {
            try {
                zzbzzVar.zzd(str, "GET", zzbiVar.zzl(), zzbiVar.zzx());
            } catch (zzakx e10) {
                zzcaa.zzj(e10.getMessage());
            }
        }
        zzb.zza(zzbiVar);
        return zzblVar;
    }
}
