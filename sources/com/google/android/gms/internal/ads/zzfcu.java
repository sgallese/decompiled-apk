package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfcu {
    private static zzfcu zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfcu(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            zzcaa.zzh("Failed to retrieve lite SDK info.", e10);
            return null;
        }
    }

    public static zzfcu zzd(Context context) {
        synchronized (zzfcu.class) {
            zzfcu zzfcuVar = zza;
            if (zzfcuVar != null) {
                return zzfcuVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbdm.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcl zzclVar = null;
            if (longValue > 0 && longValue <= 233012802) {
                zzclVar = zza(applicationContext);
            }
            zzfcu zzfcuVar2 = new zzfcu(applicationContext, zzclVar);
            zza = zzfcuVar2;
            return zzfcuVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzen zzg() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar != null) {
            try {
                return zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbof zzb() {
        return (zzbof) this.zzd.get();
    }

    public final zzcag zzc(int i10, boolean z10, int i11) {
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzB = com.google.android.gms.ads.internal.util.zzs.zzB(this.zzb);
        zzcag zzcagVar = new zzcag(233012000, i11, true, zzB);
        if (!((Boolean) zzbdm.zzc.zze()).booleanValue()) {
            return zzcagVar;
        }
        com.google.android.gms.ads.internal.client.zzen zzg = zzg();
        if (zzg == null) {
            return zzcagVar;
        }
        return new zzcag(233012000, zzg.zza(), true, zzB);
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzen zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(com.google.android.gms.internal.ads.zzbof r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbcw r0 = com.google.android.gms.internal.ads.zzbdm.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.ads.internal.client.zzcl r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L1c
        L15:
            com.google.android.gms.internal.ads.zzbof r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L1a
            goto L1c
        L1a:
            goto L13
        L1c:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L21
            r4 = r0
        L21:
            com.google.android.gms.internal.ads.zzfct.zza(r2, r1, r4)
            return
        L25:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfct.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfcu.zzf(com.google.android.gms.internal.ads.zzbof):void");
    }
}
