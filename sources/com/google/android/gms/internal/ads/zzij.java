package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzij implements zzkp {
    private final zzlu zza;
    private final zzii zzb;
    private zzln zzc;
    private zzkp zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzij(zzii zziiVar, zzdz zzdzVar) {
        this.zzb = zziiVar;
        this.zza = new zzlu(zzdzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z10) {
        zzln zzlnVar = this.zzc;
        if (zzlnVar != null && !zzlnVar.zzS() && (this.zzc.zzT() || (!z10 && !this.zzc.zzM()))) {
            zzkp zzkpVar = this.zzd;
            zzkpVar.getClass();
            long zza = zzkpVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzch zzc = zzkpVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        } else {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzkp zzkpVar2 = this.zzd;
        zzkpVar2.getClass();
        return zzkpVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzch zzc() {
        zzkp zzkpVar = this.zzd;
        if (zzkpVar != null) {
            return zzkpVar.zzc();
        }
        return this.zza.zzc();
    }

    public final void zzd(zzln zzlnVar) {
        if (zzlnVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzln zzlnVar) throws zzil {
        zzkp zzkpVar;
        zzkp zzk = zzlnVar.zzk();
        if (zzk != null && zzk != (zzkpVar = this.zzd)) {
            if (zzkpVar == null) {
                this.zzd = zzk;
                this.zzc = zzlnVar;
                zzk.zzg(this.zza.zzc());
                return;
            }
            throw zzil.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void zzf(long j10) {
        this.zza.zzb(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzch zzchVar) {
        zzkp zzkpVar = this.zzd;
        if (zzkpVar != null) {
            zzkpVar.zzg(zzchVar);
            zzchVar = this.zzd.zzc();
        }
        this.zza.zzg(zzchVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
