package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzahl implements zzaca {
    final /* synthetic */ zzahm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzahl(zzahm zzahmVar, zzahk zzahkVar) {
        this.zza = zzahmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        zzahy zzahyVar;
        long j10;
        zzahm zzahmVar = this.zza;
        zzahyVar = zzahmVar.zzd;
        j10 = zzahmVar.zzf;
        return zzahyVar.zzf(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        zzahy zzahyVar;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        zzahm zzahmVar = this.zza;
        zzahyVar = zzahmVar.zzd;
        long zzg = zzahyVar.zzg(j10);
        j11 = zzahmVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzahm zzahmVar2 = this.zza;
        j12 = zzahmVar2.zzc;
        j13 = zzahmVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j12 - j13));
        j14 = this.zza.zzf;
        long longValue = j11 + multiply.divide(BigInteger.valueOf(j14)).longValue();
        zzahm zzahmVar3 = this.zza;
        j15 = zzahmVar3.zzb;
        j16 = zzahmVar3.zzc;
        zzacb zzacbVar = new zzacb(j10, Math.max(j15, Math.min(longValue - 30000, j16 - 1)));
        return new zzaby(zzacbVar, zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
