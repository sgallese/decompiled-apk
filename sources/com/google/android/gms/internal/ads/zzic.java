package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzic implements zzln, zzlp {
    private final int zzb;
    private zzlq zzd;
    private int zze;
    private zzoh zzf;
    private zzdz zzg;
    private int zzh;
    private zzvj zzi;
    private zzam[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzlo zzp;
    private final Object zza = new Object();
    private final zzkn zzc = new zzkn();
    private long zzm = Long.MIN_VALUE;

    public zzic(int i10) {
        this.zzb = i10;
    }

    private final void zzV(long j10, boolean z10) throws zzil {
        this.zzn = false;
        this.zzl = j10;
        this.zzm = j10;
        zzy(j10, z10);
    }

    protected void zzC(zzam[] zzamVarArr, long j10, long j11) throws zzil {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzD() {
        boolean z10;
        if (this.zzh == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzE(zzam[] zzamVarArr, zzvj zzvjVar, long j10, long j11) throws zzil {
        zzdy.zzf(!this.zzn);
        this.zzi = zzvjVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j10;
        }
        this.zzj = zzamVarArr;
        this.zzk = j11;
        zzC(zzamVarArr, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzF() {
        boolean z10;
        if (this.zzh == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
        zzkn zzknVar = this.zzc;
        zzknVar.zzb = null;
        zzknVar.zza = null;
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzG(long j10) throws zzil {
        zzV(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzH() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzI(zzlo zzloVar) {
        synchronized (this.zza) {
            this.zzp = zzloVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzK() throws zzil {
        boolean z10 = true;
        if (this.zzh != 1) {
            z10 = false;
        }
        zzdy.zzf(z10);
        this.zzh = 2;
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzL() {
        boolean z10;
        if (this.zzh == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
        this.zzh = 1;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final boolean zzM() {
        if (this.zzm == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final boolean zzN() {
        return this.zzn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzO() {
        if (zzM()) {
            return this.zzn;
        }
        zzvj zzvjVar = this.zzi;
        zzvjVar.getClass();
        return zzvjVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzam[] zzP() {
        zzam[] zzamVarArr = this.zzj;
        zzamVarArr.getClass();
        return zzamVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlp
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final int zzbc() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzbd(zzkn zzknVar, zzht zzhtVar, int i10) {
        zzvj zzvjVar = this.zzi;
        zzvjVar.getClass();
        int zza = zzvjVar.zza(zzknVar, zzhtVar, i10);
        if (zza == -4) {
            if (zzhtVar.zzg()) {
                this.zzm = Long.MIN_VALUE;
                if (this.zzn) {
                    return -4;
                }
                return -3;
            }
            long j10 = zzhtVar.zzd + this.zzk;
            zzhtVar.zzd = j10;
            this.zzm = Math.max(this.zzm, j10);
        } else if (zza == -5) {
            zzam zzamVar = zzknVar.zza;
            zzamVar.getClass();
            long j11 = zzamVar.zzq;
            if (j11 != Long.MAX_VALUE) {
                zzak zzb = zzamVar.zzb();
                zzb.zzW(j11 + this.zzk);
                zzknVar.zza = zzb.zzY();
                return -5;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final long zzbe() {
        return this.zzm;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzd(long j10) {
        zzvj zzvjVar = this.zzi;
        zzvjVar.getClass();
        return zzvjVar.zzb(j10 - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public int zze() throws zzil {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzf() {
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzdz zzh() {
        zzdz zzdzVar = this.zzg;
        zzdzVar.getClass();
        return zzdzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzil zzi(Throwable th, zzam zzamVar, boolean z10, int i10) {
        int i11;
        if (zzamVar != null && !this.zzo) {
            this.zzo = true;
            try {
                int zzU = zzU(zzamVar) & 7;
                this.zzo = false;
                i11 = zzU;
            } catch (zzil unused) {
                this.zzo = false;
            } catch (Throwable th2) {
                this.zzo = false;
                throw th2;
            }
            return zzil.zzb(th, zzQ(), this.zze, zzamVar, i11, z10, i10);
        }
        i11 = 4;
        return zzil.zzb(th, zzQ(), this.zze, zzamVar, i11, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzkn zzj() {
        zzkn zzknVar = this.zzc;
        zzknVar.zzb = null;
        zzknVar.zza = null;
        return zzknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public zzkp zzk() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzlq zzm() {
        zzlq zzlqVar = this.zzd;
        zzlqVar.getClass();
        return zzlqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzoh zzn() {
        zzoh zzohVar = this.zzf;
        zzohVar.getClass();
        return zzohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final zzvj zzo() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzp() {
        synchronized (this.zza) {
            this.zzp = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzq() {
        boolean z10 = true;
        if (this.zzh != 1) {
            z10 = false;
        }
        zzdy.zzf(z10);
        zzkn zzknVar = this.zzc;
        zzknVar.zzb = null;
        zzknVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzr(zzlq zzlqVar, zzam[] zzamVarArr, zzvj zzvjVar, long j10, boolean z10, boolean z11, long j11, long j12) throws zzil {
        boolean z12;
        if (this.zzh == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        zzdy.zzf(z12);
        this.zzd = zzlqVar;
        this.zzh = 1;
        zzx(z10, z11);
        zzE(zzamVarArr, zzvjVar, j11, j12);
        zzV(j11, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzu(int i10, zzoh zzohVar, zzdz zzdzVar) {
        this.zze = i10;
        this.zzf = zzohVar;
        this.zzg = zzdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzv() throws IOException {
        zzvj zzvjVar = this.zzi;
        zzvjVar.getClass();
        zzvjVar.zzd();
    }

    protected void zzw() {
        throw null;
    }

    protected void zzy(long j10, boolean z10) throws zzil {
        throw null;
    }

    protected void zzA() throws zzil {
    }

    protected void zzB() {
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final zzlp zzl() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public /* synthetic */ void zzs() {
    }

    protected void zzz() {
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public /* synthetic */ void zzJ(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public void zzt(int i10, Object obj) throws zzil {
    }

    protected void zzx(boolean z10, boolean z11) throws zzil {
    }
}
