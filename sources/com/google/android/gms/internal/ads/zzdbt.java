package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdbt {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzeys zzo;

    public final zzdbt zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzddo(zzaVar, executor));
        return this;
    }

    public final zzdbt zzb(zzcwl zzcwlVar, Executor executor) {
        this.zzi.add(new zzddo(zzcwlVar, executor));
        return this;
    }

    public final zzdbt zzc(zzcwy zzcwyVar, Executor executor) {
        this.zzl.add(new zzddo(zzcwyVar, executor));
        return this;
    }

    public final zzdbt zzd(zzcxc zzcxcVar, Executor executor) {
        this.zzf.add(new zzddo(zzcxcVar, executor));
        return this;
    }

    public final zzdbt zze(zzcwi zzcwiVar, Executor executor) {
        this.zze.add(new zzddo(zzcwiVar, executor));
        return this;
    }

    public final zzdbt zzf(zzcxw zzcxwVar, Executor executor) {
        this.zzh.add(new zzddo(zzcxwVar, executor));
        return this;
    }

    public final zzdbt zzg(zzcyh zzcyhVar, Executor executor) {
        this.zzg.add(new zzddo(zzcyhVar, executor));
        return this;
    }

    public final zzdbt zzh(com.google.android.gms.ads.internal.overlay.zzo zzoVar, Executor executor) {
        this.zzn.add(new zzddo(zzoVar, executor));
        return this;
    }

    public final zzdbt zzi(zzcyt zzcytVar, Executor executor) {
        this.zzm.add(new zzddo(zzcytVar, executor));
        return this;
    }

    public final zzdbt zzj(zzczd zzczdVar, Executor executor) {
        this.zzb.add(new zzddo(zzczdVar, executor));
        return this;
    }

    public final zzdbt zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzddo(appEventListener, executor));
        return this;
    }

    public final zzdbt zzl(zzddw zzddwVar, Executor executor) {
        this.zzd.add(new zzddo(zzddwVar, executor));
        return this;
    }

    public final zzdbt zzm(zzeys zzeysVar) {
        this.zzo = zzeysVar;
        return this;
    }

    public final zzdbv zzn() {
        return new zzdbv(this, null);
    }
}
