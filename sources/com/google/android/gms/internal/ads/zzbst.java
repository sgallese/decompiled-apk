package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbst {
    private static zzbyr zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzdx zzd;
    private final String zze;

    public zzbst(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzdx zzdxVar, String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdxVar;
        this.zze = str;
    }

    public static zzbyr zza(Context context) {
        zzbyr zzbyrVar;
        synchronized (zzbst.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzay.zza().zzr(context, new zzboc());
            }
            zzbyrVar = zza;
        }
        return zzbyrVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzl zza2;
        zzbyr zza3 = zza(this.zzb);
        if (zza3 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zzb);
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zzd;
        if (zzdxVar == null) {
            zza2 = new com.google.android.gms.ads.internal.client.zzm().zza();
        } else {
            zza2 = com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzb, zzdxVar);
        }
        try {
            zza3.zze(wrap, new zzbyv(this.zze, this.zzc.name(), null, zza2), new zzbss(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
