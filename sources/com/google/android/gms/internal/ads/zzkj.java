package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzkj {
    public zzlg zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    private boolean zzg;

    public zzkj(zzlg zzlgVar) {
        this.zza = zzlgVar;
    }

    public final void zza(int i10) {
        boolean z10 = true;
        if (1 != ((this.zzg ? 1 : 0) | i10)) {
            z10 = false;
        }
        this.zzg = z10;
        this.zzb += i10;
    }

    public final void zzb(int i10) {
        this.zzg = true;
        this.zze = true;
        this.zzf = i10;
    }

    public final void zzc(zzlg zzlgVar) {
        boolean z10;
        boolean z11 = this.zzg;
        if (this.zza != zzlgVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzg = z11 | z10;
        this.zza = zzlgVar;
    }

    public final void zzd(int i10) {
        boolean z10 = true;
        if (this.zzc && this.zzd != 5) {
            if (i10 != 5) {
                z10 = false;
            }
            zzdy.zzd(z10);
            return;
        }
        this.zzg = true;
        this.zzc = true;
        this.zzd = i10;
    }
}
