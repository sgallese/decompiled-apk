package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzhz implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzib zza;
    private final Handler zzb;

    public zzhz(zzib zzibVar, Handler handler) {
        this.zza = zzibVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhy
            @Override // java.lang.Runnable
            public final void run() {
                zzhz zzhzVar = zzhz.this;
                zzib.zzc(zzhzVar.zza, i10);
            }
        });
    }
}
