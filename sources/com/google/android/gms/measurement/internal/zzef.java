package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzef {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzec zzc;
    private final Object zzd;
    private final Object zze;
    private final Object zzf = new Object();
    private volatile Object zzg = null;
    private volatile Object zzh = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzef(String str, Object obj, Object obj2, zzec zzecVar, zzee zzeeVar) {
        this.zzb = str;
        this.zzd = obj;
        this.zze = obj2;
        this.zzc = zzecVar;
    }

    public final Object zza(Object obj) {
        List<zzef> list;
        Object obj2;
        synchronized (this.zzf) {
        }
        if (obj != null) {
            return obj;
        }
        if (zzed.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (!zzab.zza()) {
                try {
                    list = zzeg.zzaH;
                    for (zzef zzefVar : list) {
                        if (!zzab.zza()) {
                            Object obj3 = null;
                            try {
                                zzec zzecVar = zzefVar.zzc;
                                if (zzecVar != null) {
                                    obj3 = zzecVar.zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (zza) {
                                zzefVar.zzh = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                zzec zzecVar2 = this.zzc;
                if (zzecVar2 == null) {
                    return this.zzd;
                }
                try {
                    return zzecVar2.zza();
                } catch (IllegalStateException unused3) {
                    return this.zzd;
                } catch (SecurityException unused4) {
                    return this.zzd;
                }
            }
            if (this.zzh == null) {
                obj2 = this.zzd;
            } else {
                obj2 = this.zzh;
            }
            return obj2;
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
