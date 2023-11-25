package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzatm implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzary zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzanv zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzatm(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i10, int i11) {
        this.zzb = zzaryVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzanvVar;
        this.zzg = i10;
        this.zzh = i11;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzl();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzl() throws Exception {
        long nanoTime;
        Method zzj;
        int i10;
        try {
            nanoTime = System.nanoTime();
            zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzj == null) {
            return null;
        }
        zza();
        zzaqs zzd = this.zzb.zzd();
        if (zzd != null && (i10 = this.zzg) != Integer.MIN_VALUE) {
            zzd.zzc(this.zzh, i10, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }
}
