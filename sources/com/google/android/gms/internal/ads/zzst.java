package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzst implements zztu {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzub zzc = new zzub();
    private final zzqt zzd = new zzqt();
    private Looper zze;
    private zzcw zzf;
    private zzoh zzg;

    @Override // com.google.android.gms.internal.ads.zztu
    public /* synthetic */ zzcw zzM() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzoh zzb() {
        zzoh zzohVar = this.zzg;
        zzdy.zzb(zzohVar);
        return zzohVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzqt zzc(zzts zztsVar) {
        return this.zzd.zza(0, zztsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzqt zzd(int i10, zzts zztsVar) {
        return this.zzd.zza(0, zztsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzub zze(zzts zztsVar) {
        return this.zzc.zza(0, zztsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzub zzf(int i10, zzts zztsVar) {
        return this.zzc.zza(0, zztsVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzg(Handler handler, zzqu zzquVar) {
        this.zzd.zzb(handler, zzquVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzh(Handler handler, zzuc zzucVar) {
        this.zzc.zzb(handler, zzucVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzi(zztt zzttVar) {
        boolean z10 = !this.zzb.isEmpty();
        this.zzb.remove(zzttVar);
        if (z10 && this.zzb.isEmpty()) {
            zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzk(zztt zzttVar) {
        this.zze.getClass();
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.add(zzttVar);
        if (isEmpty) {
            zzl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzm(zztt zzttVar, zzhk zzhkVar, zzoh zzohVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z10 = true;
        if (looper != null && looper != myLooper) {
            z10 = false;
        }
        zzdy.zzd(z10);
        this.zzg = zzohVar;
        zzcw zzcwVar = this.zzf;
        this.zza.add(zzttVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzttVar);
            zzn(zzhkVar);
        } else if (zzcwVar != null) {
            zzk(zzttVar);
            zzttVar.zza(this, zzcwVar);
        }
    }

    protected abstract void zzn(zzhk zzhkVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzo(zzcw zzcwVar) {
        this.zzf = zzcwVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zztt) arrayList.get(i10)).zza(this, zzcwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzp(zztt zzttVar) {
        this.zza.remove(zzttVar);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzttVar);
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzr(zzqu zzquVar) {
        this.zzd.zzc(zzquVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzs(zzuc zzucVar) {
        this.zzc.zzh(zzucVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public /* synthetic */ void zzt(zzbp zzbpVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzu() {
        if (!this.zzb.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public /* synthetic */ boolean zzv() {
        return true;
    }

    protected void zzj() {
    }

    protected void zzl() {
    }
}
