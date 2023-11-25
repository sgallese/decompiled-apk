package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbkn implements zzali {
    private volatile zzbka zza;
    private final Context zzb;

    public zzbkn(Context context) {
        this.zzb = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzbkn zzbknVar) {
        if (zzbknVar.zza == null) {
            return;
        }
        zzbknVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final zzall zza(zzalp zzalpVar) throws zzaly {
        Parcelable.Creator<zzbkb> creator = zzbkb.CREATOR;
        Map zzl = zzalpVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        zzbkb zzbkbVar = new zzbkb(zzalpVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        try {
            zzcas zzcasVar = new zzcas();
            this.zza = new zzbka(this.zzb, com.google.android.gms.ads.internal.zzt.zzt().zzb(), new zzbkl(this, zzcasVar), new zzbkm(this, zzcasVar));
            this.zza.checkAvailabilityAndConnect();
            zzbkj zzbkjVar = new zzbkj(this, zzbkbVar);
            zzfyo zzfyoVar = zzcan.zza;
            com.google.common.util.concurrent.a zzo = zzfye.zzo(zzfye.zzn(zzcasVar, zzbkjVar, zzfyoVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeo)).intValue(), TimeUnit.MILLISECONDS, zzcan.zzd);
            zzo.addListener(new zzbkk(this), zzfyoVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            zzbkd zzbkdVar = (zzbkd) new zzbul(parcelFileDescriptor).zza(zzbkd.CREATOR);
            if (zzbkdVar == null) {
                return null;
            }
            if (!zzbkdVar.zza) {
                if (zzbkdVar.zze.length != zzbkdVar.zzf.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbkdVar.zze;
                    if (i10 < strArr3.length) {
                        hashMap.put(strArr3[i10], zzbkdVar.zzf[i10]);
                        i10++;
                    } else {
                        return new zzall(zzbkdVar.zzc, zzbkdVar.zzd, hashMap, zzbkdVar.zzg, zzbkdVar.zzh);
                    }
                }
            } else {
                throw new zzaly(zzbkdVar.zzb);
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
