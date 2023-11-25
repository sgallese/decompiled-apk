package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzhn {
    private int zza;

    public final void zza(int i10) {
        this.zza = i10 | this.zza;
    }

    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int i10) {
        this.zza = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzd(int i10) {
        if ((this.zza & i10) == i10) {
            return true;
        }
        return false;
    }

    public final boolean zze() {
        return zzd(268435456);
    }

    public final boolean zzf() {
        return zzd(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean zzg() {
        return zzd(4);
    }

    public final boolean zzh() {
        return zzd(1);
    }

    public final boolean zzi() {
        return zzd(536870912);
    }
}
