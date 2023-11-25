package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzyy {
    private final zzzk zza;
    private final zzyz zzb;
    private final zzdj zze;
    private Handler zzf;
    private zzdl zzg;
    private CopyOnWriteArrayList zzh;
    private zzdz zzi;
    private Pair zzj;
    private final ArrayDeque zzc = new ArrayDeque();
    private final ArrayDeque zzd = new ArrayDeque();
    private boolean zzk = true;
    private final zzdn zzl = zzdn.zza;

    public zzyy(zzdj zzdjVar, zzzk zzzkVar, zzyz zzyzVar) {
        this.zze = zzdjVar;
        this.zza = zzzkVar;
        this.zzb = zzyzVar;
    }

    public final void zza(String str) {
        Context context;
        context = this.zzb.zze;
        if (zzfk.zza >= 29) {
            int i10 = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
        }
    }

    public final void zzb(Surface surface, zzfc zzfcVar) {
        Pair pair = this.zzj;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzfc) this.zzj.second).equals(zzfcVar)) {
            return;
        }
        this.zzj = Pair.create(surface, zzfcVar);
    }

    public final void zzc(List list) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzh;
        if (copyOnWriteArrayList == null) {
            this.zzh = new CopyOnWriteArrayList(list);
            return;
        }
        copyOnWriteArrayList.clear();
        this.zzh.addAll(list);
    }

    public final boolean zzd(zzam zzamVar, long j10, zzdz zzdzVar) throws zzil {
        Pair create;
        zzil zzi;
        boolean zzaS;
        Context context;
        int i10;
        if (!this.zzk) {
            return false;
        }
        if (this.zzh == null) {
            this.zzk = false;
            return false;
        }
        this.zzf = zzfk.zzu(null);
        this.zzi = zzdzVar;
        zzs zzsVar = zzamVar.zzy;
        zzs zzsVar2 = zzs.zza;
        try {
            if (zzsVar != null) {
                int i11 = zzsVar.zzf;
                if (i11 != 7) {
                    if (i11 == 6) {
                        create = Pair.create(zzsVar, zzsVar);
                    }
                } else {
                    zzr zzc = zzsVar.zzc();
                    zzc.zzc(6);
                    create = Pair.create(zzsVar, zzc.zzd());
                }
                zzaS = zzyz.zzaS();
                if (!zzaS && (i10 = zzamVar.zzu) != 0) {
                    this.zzh.add(0, zzyx.zza(i10));
                }
                zzdj zzdjVar = this.zze;
                context = this.zzb.zze;
                zzv zzvVar = zzv.zzb;
                zzs zzsVar3 = (zzs) create.first;
                zzs zzsVar4 = (zzs) create.second;
                final Handler handler = this.zzf;
                handler.getClass();
                this.zzg = zzdjVar.zza(context, zzvVar, zzsVar3, zzsVar4, false, new Executor() { // from class: com.google.android.gms.internal.ads.zzyv
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                }, new zzyw(this, zzamVar));
                throw null;
            }
            zzaS = zzyz.zzaS();
            if (!zzaS) {
                this.zzh.add(0, zzyx.zza(i10));
            }
            zzdj zzdjVar2 = this.zze;
            context = this.zzb.zze;
            zzv zzvVar2 = zzv.zzb;
            zzs zzsVar32 = (zzs) create.first;
            zzs zzsVar42 = (zzs) create.second;
            final Handler handler2 = this.zzf;
            handler2.getClass();
            this.zzg = zzdjVar2.zza(context, zzvVar2, zzsVar32, zzsVar42, false, new Executor() { // from class: com.google.android.gms.internal.ads.zzyv
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler2.post(runnable);
                }
            }, new zzyw(this, zzamVar));
            throw null;
        } catch (Exception e10) {
            zzi = this.zzb.zzi(e10, zzamVar, false, 7000);
            throw zzi;
        }
        zzs zzsVar5 = zzs.zza;
        create = Pair.create(zzsVar5, zzsVar5);
    }
}
