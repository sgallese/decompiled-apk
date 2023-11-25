package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcbf implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcbn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbf(zzcbn zzcbnVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcbnVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbo zzcboVar;
        zzcbo zzcboVar2;
        zzcbn.zzl(this.zzb, this.zza);
        zzcbn zzcbnVar = this.zzb;
        zzcboVar = zzcbnVar.zzq;
        if (zzcboVar != null) {
            zzcboVar2 = zzcbnVar.zzq;
            zzcboVar2.zzf();
        }
    }
}
