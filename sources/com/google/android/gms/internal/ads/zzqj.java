package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzqj implements zzpb {
    final /* synthetic */ zzqk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzqj(zzqk zzqkVar, zzqi zzqiVar) {
        this.zza = zzqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final void zza(Exception exc) {
        zzes.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzqk.zzaa(this.zza).zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final void zzb() {
        zzqk zzqkVar = this.zza;
        if (zzqk.zzZ(zzqkVar) != null) {
            zzqk.zzZ(zzqkVar).zzb();
        }
    }
}
