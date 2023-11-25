package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzib {
    private final AudioManager zza;
    private final zzhz zzb;
    private zzia zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzib(Context context, Handler handler, zzia zziaVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zziaVar;
        this.zzb = new zzhz(this, handler);
        this.zzd = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzib zzibVar, int i10) {
        if (i10 != -3 && i10 != -2) {
            if (i10 != -1) {
                if (i10 != 1) {
                    zzes.zzf("AudioFocusManager", "Unknown focus change type: " + i10);
                    return;
                }
                zzibVar.zzg(1);
                zzibVar.zzf(1);
                return;
            }
            zzibVar.zzf(-1);
            zzibVar.zze();
        } else if (i10 != -2) {
            zzibVar.zzg(3);
        } else {
            zzibVar.zzf(0);
            zzibVar.zzg(2);
        }
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzfk.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i10) {
        int zzY;
        zzia zziaVar = this.zzc;
        if (zziaVar != null) {
            zzjx zzjxVar = (zzjx) zziaVar;
            boolean zzv = zzjxVar.zza.zzv();
            zzY = zzkb.zzY(zzv, i10);
            zzjxVar.zza.zzal(zzv, i10, zzY);
        }
    }

    private final void zzg(int i10) {
        float f10;
        if (this.zzd == i10) {
            return;
        }
        this.zzd = i10;
        if (i10 == 3) {
            f10 = 0.2f;
        } else {
            f10 = 1.0f;
        }
        if (this.zze == f10) {
            return;
        }
        this.zze = f10;
        zzia zziaVar = this.zzc;
        if (zziaVar != null) {
            ((zzjx) zziaVar).zza.zzai();
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z10, int i10) {
        zze();
        if (z10) {
            return 1;
        }
        return -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}
