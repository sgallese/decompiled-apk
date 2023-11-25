package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzqb extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzqe zza;
    final /* synthetic */ zzqc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqb(zzqc zzqcVar, zzqe zzqeVar) {
        this.zzb = zzqcVar;
        this.zza = zzqeVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        AudioTrack audioTrack2;
        zzpb zzpbVar;
        boolean z10;
        zzpb zzpbVar2;
        audioTrack2 = this.zzb.zza.zzt;
        if (!audioTrack.equals(audioTrack2)) {
            return;
        }
        zzqe zzqeVar = this.zzb.zza;
        zzpbVar = zzqeVar.zzp;
        if (zzpbVar != null) {
            z10 = zzqeVar.zzQ;
            if (z10) {
                zzpbVar2 = zzqeVar.zzp;
                zzpbVar2.zzb();
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zzpb zzpbVar;
        boolean z10;
        zzpb zzpbVar2;
        audioTrack2 = this.zzb.zza.zzt;
        if (!audioTrack.equals(audioTrack2)) {
            return;
        }
        zzqe zzqeVar = this.zzb.zza;
        zzpbVar = zzqeVar.zzp;
        if (zzpbVar != null) {
            z10 = zzqeVar.zzQ;
            if (z10) {
                zzpbVar2 = zzqeVar.zzp;
                zzpbVar2.zzb();
            }
        }
    }
}
