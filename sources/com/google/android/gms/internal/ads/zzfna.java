package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.wearable.WearableStatusCodes;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfna {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfnb zzc;
    private final zzflc zzd;
    private final zzfkx zze;
    private zzfmp zzf;
    private final Object zzg = new Object();

    public zzfna(Context context, zzfnb zzfnbVar, zzflc zzflcVar, zzfkx zzfkxVar) {
        this.zzb = context;
        this.zzc = zzfnbVar;
        this.zzd = zzflcVar;
        this.zze = zzfkxVar;
    }

    private final synchronized Class zzd(zzfmq zzfmqVar) throws zzfmz {
        String zzk = zzfmqVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfmqVar.zzc())) {
                try {
                    File zzb = zzfmqVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(zzfmqVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e10) {
                    throw new zzfmz(2008, e10);
                }
            }
            throw new zzfmz(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e11) {
            throw new zzfmz(2026, e11);
        }
    }

    public final zzflf zza() {
        zzfmp zzfmpVar;
        synchronized (this.zzg) {
            zzfmpVar = this.zzf;
        }
        return zzfmpVar;
    }

    public final zzfmq zzb() {
        synchronized (this.zzg) {
            zzfmp zzfmpVar = this.zzf;
            if (zzfmpVar != null) {
                return zzfmpVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(zzfmq zzfmqVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfmp zzfmpVar = new zzfmp(zzd(zzfmqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfmqVar.zze(), null, new Bundle(), 2), zzfmqVar, this.zzc, this.zzd);
                if (zzfmpVar.zzh()) {
                    int zze = zzfmpVar.zze();
                    if (zze == 0) {
                        synchronized (this.zzg) {
                            zzfmp zzfmpVar2 = this.zzf;
                            if (zzfmpVar2 != null) {
                                try {
                                    zzfmpVar2.zzg();
                                } catch (zzfmz e10) {
                                    this.zzd.zzc(e10.zza(), -1L, e10);
                                }
                            }
                            this.zzf = zzfmpVar;
                        }
                        this.zzd.zzd(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    throw new zzfmz((int) WearableStatusCodes.DUPLICATE_LISTENER, "ci: " + zze);
                }
                throw new zzfmz((int) WearableStatusCodes.TARGET_NODE_NOT_CONNECTED, "init failed");
            } catch (Exception e11) {
                throw new zzfmz(2004, e11);
            }
        } catch (zzfmz e12) {
            this.zzd.zzc(e12.zza(), System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.zzd.zzc(WearableStatusCodes.ACCOUNT_KEY_CREATION_FAILED, System.currentTimeMillis() - currentTimeMillis, e13);
            return false;
        }
    }
}
