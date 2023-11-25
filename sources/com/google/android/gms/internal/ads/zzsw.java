package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzsw implements zzvj {
    public final zzvj zza;
    final /* synthetic */ zzsx zzb;
    private boolean zzc;

    public zzsw(zzsx zzsxVar, zzvj zzvjVar) {
        this.zzb = zzsxVar;
        this.zza = zzvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zza(zzkn zzknVar, zzht zzhtVar, int i10) {
        zzsx zzsxVar = this.zzb;
        if (zzsxVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhtVar.zzc(4);
            return -4;
        }
        long zzb = zzsxVar.zzb();
        int zza = this.zza.zza(zzknVar, zzhtVar, i10);
        if (zza == -5) {
            zzam zzamVar = zzknVar.zza;
            zzamVar.getClass();
            int i11 = zzamVar.zzC;
            int i12 = 0;
            if (i11 == 0) {
                if (zzamVar.zzD != 0) {
                    i11 = 0;
                }
                return -5;
            }
            if (this.zzb.zzb == Long.MIN_VALUE) {
                i12 = zzamVar.zzD;
            }
            zzak zzb2 = zzamVar.zzb();
            zzb2.zzC(i11);
            zzb2.zzD(i12);
            zzknVar.zza = zzb2.zzY();
            return -5;
        }
        long j10 = this.zzb.zzb;
        if (j10 != Long.MIN_VALUE && ((zza == -4 && zzhtVar.zzd >= j10) || (zza == -3 && zzb == Long.MIN_VALUE && !zzhtVar.zzc))) {
            zzhtVar.zzb();
            zzhtVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zzb(long j10) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j10);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final boolean zze() {
        if (!this.zzb.zzq() && this.zza.zze()) {
            return true;
        }
        return false;
    }
}
