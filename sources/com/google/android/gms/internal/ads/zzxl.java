package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzxl {
    private zzxk zza;
    private zzxt zzb;

    public zzlo zzc() {
        throw null;
    }

    public void zzi() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzj(zzk zzkVar) {
        throw null;
    }

    public boolean zzm() {
        throw null;
    }

    public abstract zzxm zzo(zzlp[] zzlpVarArr, zzvs zzvsVar, zzts zztsVar, zzcw zzcwVar) throws zzil;

    public abstract void zzp(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzxt zzq() {
        zzxt zzxtVar = this.zzb;
        zzdy.zzb(zzxtVar);
        return zzxtVar;
    }

    public final void zzr(zzxk zzxkVar, zzxt zzxtVar) {
        this.zza = zzxkVar;
        this.zzb = zzxtVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzs() {
        zzxk zzxkVar = this.zza;
        if (zzxkVar != null) {
            zzxkVar.zzj();
        }
    }
}
