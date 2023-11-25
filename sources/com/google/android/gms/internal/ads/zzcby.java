package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcby {
    private final Context zza;
    private final zzccj zzb;
    private final ViewGroup zzc;
    private zzcbx zzd;

    public zzcby(Context context, ViewGroup viewGroup, zzcfi zzcfiVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcfiVar;
        this.zzd = null;
    }

    public final zzcbx zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzcbx zzcbxVar = this.zzd;
        if (zzcbxVar != null) {
            return zzcbxVar.zzl();
        }
        return null;
    }

    public final void zzc(int i10, int i11, int i12, int i13) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcbx zzcbxVar = this.zzd;
        if (zzcbxVar != null) {
            zzcbxVar.zzF(i10, i11, i12, i13);
        }
    }

    public final void zzd(int i10, int i11, int i12, int i13, int i14, boolean z10, zzcci zzcciVar) {
        if (this.zzd != null) {
            return;
        }
        zzbcb.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzccj zzccjVar = this.zzb;
        zzcbx zzcbxVar = new zzcbx(context, zzccjVar, i14, z10, zzccjVar.zzm().zza(), zzcciVar);
        this.zzd = zzcbxVar;
        this.zzc.addView(zzcbxVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i10, i11, i12, i13);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcbx zzcbxVar = this.zzd;
        if (zzcbxVar != null) {
            zzcbxVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcbx zzcbxVar = this.zzd;
        if (zzcbxVar != null) {
            zzcbxVar.zzu();
        }
    }

    public final void zzg(int i10) {
        zzcbx zzcbxVar = this.zzd;
        if (zzcbxVar != null) {
            zzcbxVar.zzC(i10);
        }
    }
}
