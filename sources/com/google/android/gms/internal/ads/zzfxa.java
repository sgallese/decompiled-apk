package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfxa extends zzfxu implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    com.google.common.util.concurrent.a zza;
    Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxa(com.google.common.util.concurrent.a aVar, Object obj) {
        aVar.getClass();
        this.zza = aVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        com.google.common.util.concurrent.a aVar = this.zza;
        Object obj = this.zzb;
        boolean isCancelled = isCancelled();
        boolean z11 = true;
        if (aVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = isCancelled | z10;
        if (obj != null) {
            z11 = false;
        }
        if (z12 | z11) {
            return;
        }
        this.zza = null;
        if (aVar.isCancelled()) {
            zzs(aVar);
            return;
        }
        try {
            try {
                Object zze = zze(obj, zzfye.zzp(aVar));
                this.zzb = null;
                zzf(zze);
            } catch (Throwable th) {
                try {
                    zzfyv.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e10) {
            zzd(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e11) {
            zzd(e11);
        } catch (ExecutionException e12) {
            zzd(e12.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfws
    public final String zza() {
        String str;
        com.google.common.util.concurrent.a aVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (aVar != null) {
            str = "inputFuture=[" + aVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj.toString() + "]";
        } else if (zza != null) {
            return str.concat(zza);
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    protected final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zze(Object obj, Object obj2) throws Exception;

    abstract void zzf(Object obj);
}
