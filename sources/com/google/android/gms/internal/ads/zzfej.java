package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfej {
    private final zzfdn zza;
    private final zzfeh zzb;
    private final zzfdj zzc;
    private zzfep zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfej(zzfdn zzfdnVar, zzfdj zzfdjVar, zzfeh zzfehVar) {
        this.zza = zzfdnVar;
        this.zzc = zzfdjVar;
        this.zzb = zzfehVar;
        zzfdjVar.zzb(new zzfee(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgh)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfei zzfeiVar = (zzfei) this.zzd.pollFirst();
                if (zzfeiVar == null || (zzfeiVar.zza() != null && this.zza.zze(zzfeiVar.zza()))) {
                    zzfep zzfepVar = new zzfep(this.zza, this.zzb, zzfeiVar);
                    this.zze = zzfepVar;
                    zzfepVar.zzd(new zzfef(this, zzfeiVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        if (this.zze == null) {
            return true;
        }
        return false;
    }

    public final synchronized com.google.common.util.concurrent.a zza(zzfei zzfeiVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfeiVar);
    }

    public final synchronized void zze(zzfei zzfeiVar) {
        this.zzd.add(zzfeiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
