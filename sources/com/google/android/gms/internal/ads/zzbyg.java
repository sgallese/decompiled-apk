package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbyg {
    static zzbyg zza;

    public static synchronized zzbyg zzd(Context context) {
        synchronized (zzbyg.class) {
            zzbyg zzbygVar = zza;
            if (zzbygVar != null) {
                return zzbygVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbbr.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
            zzh.zzr(applicationContext);
            zzbxk zzbxkVar = new zzbxk(null);
            zzbxkVar.zzb(applicationContext);
            zzbxkVar.zzc(com.google.android.gms.ads.internal.zzt.zzB());
            zzbxkVar.zza(zzh);
            zzbxkVar.zzd(com.google.android.gms.ads.internal.zzt.zzn());
            zzbyg zze = zzbxkVar.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zzc();
            zzbyk zzc = zza.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzar)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzp();
                Map zzs = com.google.android.gms.ads.internal.util.zzs.zzs((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzat));
                Iterator it = zzs.keySet().iterator();
                while (it.hasNext()) {
                    zzc.zzc((String) it.next());
                }
                zzc.zzd(new zzbyi(zzc, zzs));
            }
            return zza;
        }
    }

    abstract zzbxd zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract zzbxh zzb();

    abstract zzbyk zzc();
}
