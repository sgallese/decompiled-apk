package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzawu extends zzcas {
    final /* synthetic */ zzaxa zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawu(zzaxa zzaxaVar) {
        this.zza = zzaxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcas, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        zzaxa.zze(this.zza);
        return super.cancel(z10);
    }
}
