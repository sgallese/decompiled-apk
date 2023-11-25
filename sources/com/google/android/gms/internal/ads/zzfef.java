package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfef implements zzfya {
    final /* synthetic */ zzfei zza;
    final /* synthetic */ zzfej zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfef(zzfej zzfejVar, zzfei zzfeiVar) {
        this.zzb = zzfejVar;
        this.zza = zzfeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i10;
        Void r42 = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfej zzfejVar = this.zzb;
            i10 = zzfejVar.zzf;
            if (i10 == 1) {
                zzfejVar.zzh();
            }
        }
    }
}
