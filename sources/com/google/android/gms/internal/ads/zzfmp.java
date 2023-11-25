package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfmp implements zzflf {
    private final Object zza;
    private final zzfmq zzb;
    private final zzfnb zzc;
    private final zzflc zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmp(Object obj, zzfmq zzfmqVar, zzfnb zzfnbVar, zzflc zzflcVar) {
        this.zza = obj;
        this.zzb = zzfmqVar;
        this.zzc = zzfnbVar;
        this.zzd = zzflcVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzape zza = zzapf.zza();
        zza.zzc(5);
        zza.zza(zzgqi.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzapf) zza.zzal()).zzax(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e10) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e10);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfmz {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(AuthApiStatusCodes.AUTH_API_SERVER_ERROR, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e10) {
            throw new zzfmz(2005, e10);
        }
    }

    public final synchronized int zze() throws zzfmz {
        try {
        } catch (Exception e10) {
            throw new zzfmz(2006, e10);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfmq zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfmz {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e10) {
            throw new zzfmz(2003, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzh() throws zzfmz {
        try {
        } catch (Exception e10) {
            throw new zzfmz(2001, e10);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}
