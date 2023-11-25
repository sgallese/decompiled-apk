package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdmy implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzcfu zzb;
    private final Context zzc;
    private final zzdrh zzd;
    private final zzfgo zze;
    private final zzech zzf;
    private final Executor zzg;
    private final zzaqx zzh;
    private final zzcag zzi;
    private final zzfik zzj;
    private final zzecs zzk;

    public zzdmy(Context context, Executor executor, zzaqx zzaqxVar, zzcag zzcagVar, com.google.android.gms.ads.internal.zza zzaVar, zzcfu zzcfuVar, zzech zzechVar, zzfik zzfikVar, zzdrh zzdrhVar, zzfgo zzfgoVar, zzecs zzecsVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzaqxVar;
        this.zzi = zzcagVar;
        this.zza = zzaVar;
        this.zzb = zzcfuVar;
        this.zzf = zzechVar;
        this.zzj = zzfikVar;
        this.zzd = zzdrhVar;
        this.zze = zzfgoVar;
        this.zzk = zzecsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Context zza(zzdmy zzdmyVar) {
        return zzdmyVar.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzaqx zzb(zzdmy zzdmyVar) {
        return zzdmyVar.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdmy zzdmyVar) {
        return zzdmyVar.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzcag zzd(zzdmy zzdmyVar) {
        return zzdmyVar.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzcfu zze(zzdmy zzdmyVar) {
        return zzdmyVar.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzdrh zzf(zzdmy zzdmyVar) {
        return zzdmyVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzech zzg(zzdmy zzdmyVar) {
        return zzdmyVar.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzecs zzh(zzdmy zzdmyVar) {
        return zzdmyVar.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfgo zzi(zzdmy zzdmyVar) {
        return zzdmyVar.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfik zzj(zzdmy zzdmyVar) {
        return zzdmyVar.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Executor zzk(zzdmy zzdmyVar) {
        return zzdmyVar.zzg;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdnb zzdnbVar = new zzdnb(this);
        zzdnbVar.zzh();
        return zzdnbVar;
    }
}
