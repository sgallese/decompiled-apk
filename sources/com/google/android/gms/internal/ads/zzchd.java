package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzchd implements zzcmp {
    private static zzchd zza;

    /* JADX WARN: Type inference failed for: r12v3, types: [com.google.android.gms.internal.ads.zzchf, com.google.android.gms.internal.ads.zzcju] */
    private static synchronized zzchd zzD(Context context, zzbof zzbofVar, int i10, boolean z10, int i11, zzcih zzcihVar) {
        synchronized (zzchd.class) {
            zzchd zzchdVar = zza;
            if (zzchdVar != null) {
                return zzchdVar;
            }
            zzbbr.zza(context);
            zzfcu zzd = zzfcu.zzd(context);
            zzcag zzc = zzd.zzc(233012000, false, i11);
            zzd.zzf(zzbofVar);
            ?? r12 = 0;
            zzcjv zzcjvVar = new zzcjv(r12);
            zzche zzcheVar = new zzche();
            zzcheVar.zzd(zzc);
            zzcheVar.zzc(context);
            zzcjvVar.zzb(new zzchg(zzcheVar, r12));
            zzcjvVar.zzc(new zzcli(zzcihVar));
            zzchd zza2 = zzcjvVar.zza();
            com.google.android.gms.ads.internal.zzt.zzo().zzs(context, zzc);
            com.google.android.gms.ads.internal.zzt.zzc().zzi(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzj(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzi(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzb().zzd(context);
            com.google.android.gms.ads.internal.zzt.zzv().zzb(context);
            zza2.zza().zzc();
            zzbyg.zzd(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzav)).booleanValue()) {
                    zzaxe zzaxeVar = new zzaxe(new zzaxk(context));
                    zzeba zzebaVar = new zzeba(new zzeaw(context), zza2.zzA());
                    com.google.android.gms.ads.internal.zzt.zzp();
                    new zzebw(context, zzc, zzaxeVar, zzebaVar, UUID.randomUUID().toString(), zza2.zzy()).zzb(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzQ());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzchd zzb(Context context, zzbof zzbofVar, int i10) {
        return zzD(context, zzbofVar, 233012000, false, i10, new zzcih());
    }

    public abstract zzfyo zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    public abstract com.google.android.gms.ads.internal.util.zzcd zza();

    public abstract zzcls zzc();

    public abstract zzcpp zzd();

    public abstract zzcqy zze();

    public abstract zzcyx zzf();

    public abstract zzdfp zzg();

    public abstract zzdgl zzh();

    public abstract zzdnu zzi();

    public abstract zzdsp zzj();

    public abstract zzdue zzk();

    public abstract zzduy zzl();

    public abstract zzecs zzm();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzc zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzg zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzaa zzp();

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final zzeth zzq(zzbun zzbunVar, int i10) {
        return zzr(new zzevj(zzbunVar, i10));
    }

    protected abstract zzeth zzr(zzevj zzevjVar);

    public abstract zzewe zzs();

    public abstract zzexs zzt();

    public abstract zzezj zzu();

    public abstract zzfax zzv();

    public abstract zzfcn zzw();

    public abstract zzfcx zzx();

    public abstract zzfgo zzy();

    public abstract zzfhu zzz();
}
