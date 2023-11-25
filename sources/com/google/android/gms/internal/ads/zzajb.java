package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzajb implements zzaio {
    private final String zza;
    private final zzfb zzb;
    private final zzfa zzc;
    private zzace zzd;
    private String zze;
    private zzam zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzajb(String str) {
        this.zza = str;
        zzfb zzfbVar = new zzfb((int) UserVerificationMethods.USER_VERIFY_ALL);
        this.zzb = zzfbVar;
        byte[] zzI = zzfbVar.zzI();
        this.zzc = new zzfa(zzI, zzI.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzfa zzfaVar) throws zzcd {
        int zza = zzfaVar.zza();
        zzzy zzb = zzzz.zzb(zzfaVar, true);
        this.zzu = zzb.zzc;
        this.zzr = zzb.zza;
        this.zzt = zzb.zzb;
        return zza - zzfaVar.zza();
    }

    private static long zzg(zzfa zzfaVar) {
        return zzfaVar.zzd((zzfaVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
    
        if (r14.zzl == false) goto L88;
     */
    @Override // com.google.android.gms.internal.ads.zzaio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzfb r15) throws com.google.android.gms.internal.ads.zzcd {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajb.zza(com.google.android.gms.internal.ads.zzfb):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzd = zzabeVar.zzv(zzakaVar.zza(), 1);
        this.zze = zzakaVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzk = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z10) {
    }
}
