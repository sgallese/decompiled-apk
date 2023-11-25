package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzekc implements zzelm {
    final /* synthetic */ zzekd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekc(zzekd zzekdVar) {
        this.zza = zzekdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqc zzcqcVar;
        zzcqc zzcqcVar2;
        zzcqc zzcqcVar3;
        zzcqc zzcqcVar4 = (zzcqc) obj;
        synchronized (this.zza) {
            zzekd zzekdVar = this.zza;
            zzcqcVar = zzekdVar.zzi;
            if (zzcqcVar != null) {
                zzcqcVar3 = zzekdVar.zzi;
                zzcqcVar3.zzb();
            }
            this.zza.zzi = zzcqcVar4;
            zzcqcVar2 = this.zza.zzi;
            zzcqcVar2.zzj();
        }
    }
}
