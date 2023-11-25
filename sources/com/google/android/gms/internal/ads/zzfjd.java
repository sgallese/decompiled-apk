package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfjd extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final zzfjb zzc;
    private float zzd;
    private final zzfjo zze;

    public zzfjd(Handler handler, Context context, zzfjb zzfjbVar, zzfjo zzfjoVar) {
        super(handler);
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService("audio");
        this.zzc = zzfjbVar;
        this.zze = zzfjoVar;
    }

    private final float zzc() {
        int streamVolume = this.zzb.getStreamVolume(3);
        int streamMaxVolume = this.zzb.getStreamMaxVolume(3);
        float f10 = 0.0f;
        if (streamMaxVolume > 0 && streamVolume > 0) {
            float f11 = streamVolume / streamMaxVolume;
            f10 = 1.0f;
            if (f11 <= 1.0f) {
                return f11;
            }
        }
        return f10;
    }

    private final void zzd() {
        this.zze.zze(this.zzd);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float zzc = zzc();
        if (zzc != this.zzd) {
            this.zzd = zzc;
            zzd();
        }
    }

    public final void zza() {
        this.zzd = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}
