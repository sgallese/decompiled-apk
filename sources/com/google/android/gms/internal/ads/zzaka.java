package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaka {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzaka(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = i10 + "/";
        }
        this.zza = str;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = RecyclerView.UNDEFINED_DURATION;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public final int zza() {
        zzd();
        return this.zzd;
    }

    public final String zzb() {
        zzd();
        return this.zze;
    }

    public final void zzc() {
        int i10;
        int i11 = this.zzd;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.zzb;
        } else {
            i10 = i11 + this.zzc;
        }
        this.zzd = i10;
        this.zze = this.zza + i10;
    }
}
