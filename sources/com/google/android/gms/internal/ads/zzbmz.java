package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbmz {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbni zzc;
    private zzbni zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    public final zzbni zza(Context context, zzcag zzcagVar, zzfhu zzfhuVar) {
        zzbni zzbniVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbni(zzc(context), zzcagVar, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zza), zzfhuVar);
            }
            zzbniVar = this.zzc;
        }
        return zzbniVar;
    }

    public final zzbni zzb(Context context, zzcag zzcagVar, zzfhu zzfhuVar) {
        zzbni zzbniVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbni(zzc(context), zzcagVar, (String) zzbdt.zzb.zze(), zzfhuVar);
            }
            zzbniVar = this.zzd;
        }
        return zzbniVar;
    }
}
