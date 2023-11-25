package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzva extends zzst implements zzur {
    private final zzgh zza;
    private final zzqz zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzhk zzh;
    private zzbp zzi;
    private final zzux zzj;
    private final zzxy zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzva(zzbp zzbpVar, zzgh zzghVar, zzux zzuxVar, zzqz zzqzVar, zzxy zzxyVar, int i10, zzuz zzuzVar) {
        this.zzi = zzbpVar;
        this.zza = zzghVar;
        this.zzj = zzuxVar;
        this.zzb = zzqzVar;
        this.zzk = zzxyVar;
        this.zzc = i10;
    }

    private final void zzw() {
        zzbf zzbfVar;
        zzcw zzcwVar;
        long j10 = this.zze;
        boolean z10 = this.zzf;
        boolean z11 = this.zzg;
        zzbp zzJ = zzJ();
        if (z11) {
            zzbfVar = zzJ.zzf;
        } else {
            zzbfVar = null;
        }
        zzvn zzvnVar = new zzvn(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, zzJ, zzbfVar);
        if (this.zzd) {
            zzcwVar = new zzuw(this, zzvnVar);
        } else {
            zzcwVar = zzvnVar;
        }
        zzo(zzcwVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzG(zztq zztqVar) {
        ((zzuv) zztqVar).zzM();
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final zztq zzI(zzts zztsVar, zzxu zzxuVar, long j10) {
        zzgi zza = this.zza.zza();
        zzhk zzhkVar = this.zzh;
        if (zzhkVar != null) {
            zza.zzf(zzhkVar);
        }
        zzbi zzbiVar = zzJ().zzd;
        zzbiVar.getClass();
        Uri uri = zzbiVar.zzb;
        zzux zzuxVar = this.zzj;
        zzb();
        return new zzuv(uri, zza, new zzsv(zzuxVar.zza), this.zzb, zzc(zztsVar), this.zzk, zze(zztsVar), this, zzxuVar, null, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final synchronized zzbp zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zza(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.zze;
        }
        if (!this.zzd && this.zze == j10 && this.zzf == z10 && this.zzg == z11) {
            return;
        }
        this.zze = j10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzst
    protected final void zzn(zzhk zzhkVar) {
        this.zzh = zzhkVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzst, com.google.android.gms.internal.ads.zztu
    public final synchronized void zzt(zzbp zzbpVar) {
        this.zzi = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzst
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzz() {
    }
}
