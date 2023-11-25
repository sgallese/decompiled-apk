package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzsz implements zzuc, zzqu {
    final /* synthetic */ zztb zza;
    private final Object zzb;
    private zzub zzc;
    private zzqt zzd;

    public zzsz(zztb zztbVar, Object obj) {
        this.zza = zztbVar;
        this.zzc = zztbVar.zze(null);
        this.zzd = zztbVar.zzc(null);
        this.zzb = obj;
    }

    private final zzto zzf(zzto zztoVar) {
        zztb zztbVar = this.zza;
        Object obj = this.zzb;
        long j10 = zztoVar.zzc;
        zztbVar.zzx(obj, j10);
        zztb zztbVar2 = this.zza;
        Object obj2 = this.zzb;
        long j11 = zztoVar.zzd;
        zztbVar2.zzx(obj2, j11);
        if (j10 == zztoVar.zzc && j11 == zztoVar.zzd) {
            return zztoVar;
        }
        return new zzto(1, zztoVar.zza, zztoVar.zzb, 0, null, j10, j11);
    }

    private final boolean zzg(int i10, zzts zztsVar) {
        zzts zztsVar2;
        if (zztsVar != null) {
            zztsVar2 = this.zza.zzy(this.zzb, zztsVar);
            if (zztsVar2 == null) {
                return false;
            }
        } else {
            zztsVar2 = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzub zzubVar = this.zzc;
        int i11 = zzubVar.zza;
        if (!zzfk.zzD(zzubVar.zzb, zztsVar2)) {
            this.zzc = this.zza.zzf(0, zztsVar2);
        }
        zzqt zzqtVar = this.zzd;
        int i12 = zzqtVar.zza;
        if (!zzfk.zzD(zzqtVar.zzb, zztsVar2)) {
            this.zzd = this.zza.zzd(0, zztsVar2);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzac(int i10, zzts zztsVar, zzto zztoVar) {
        if (zzg(0, zztsVar)) {
            this.zzc.zzc(zzf(zztoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzad(int i10, zzts zztsVar, zztj zztjVar, zzto zztoVar) {
        if (zzg(0, zztsVar)) {
            this.zzc.zzd(zztjVar, zzf(zztoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzae(int i10, zzts zztsVar, zztj zztjVar, zzto zztoVar) {
        if (zzg(0, zztsVar)) {
            this.zzc.zze(zztjVar, zzf(zztoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzaf(int i10, zzts zztsVar, zztj zztjVar, zzto zztoVar, IOException iOException, boolean z10) {
        if (zzg(0, zztsVar)) {
            this.zzc.zzf(zztjVar, zzf(zztoVar), iOException, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzag(int i10, zzts zztsVar, zztj zztjVar, zzto zztoVar) {
        if (zzg(0, zztsVar)) {
            this.zzc.zzg(zztjVar, zzf(zztoVar));
        }
    }
}
