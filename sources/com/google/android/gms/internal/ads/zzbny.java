package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbny {
    private static zzbny zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbny() {
    }

    public static zzbny zza() {
        if (zza == null) {
            zza = new zzbny();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnx
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                String str2 = str;
                zzbbr.zza(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzai)).booleanValue());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzap)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzchc) zzcae.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzcac() { // from class: com.google.android.gms.internal.ads.zzbnw
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.zzcac
                        public final Object zza(Object obj) {
                            return zzchb.zzb(obj);
                        }
                    })).zze(ObjectWrapper.wrap(context2), new zzbnv(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str2, bundle)));
                } catch (RemoteException | zzcad | NullPointerException e10) {
                    zzcaa.zzl("#007 Could not call remote method.", e10);
                }
            }
        });
        thread.start();
        return thread;
    }
}
