package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zztn extends zzvu {
    private final boolean zzb;
    private final zzcv zzc;
    private final zzct zzd;
    private zztl zze;
    private zztk zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zztn(zztu zztuVar, boolean z10) {
        super(zztuVar);
        boolean z11;
        if (z10) {
            zztuVar.zzv();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzcv();
        this.zzd = new zzct();
        zztuVar.zzM();
        this.zze = zztl.zzq(zztuVar.zzJ());
    }

    private final Object zzK(Object obj) {
        if (this.zze.zzf != null && obj.equals(zztl.zzd)) {
            return this.zze.zzf;
        }
        return obj;
    }

    private final void zzL(long j10) {
        zztk zztkVar = this.zzf;
        int zza = this.zze.zza(zztkVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zztl zztlVar = this.zze;
        zzct zzctVar = this.zzd;
        zztlVar.zzd(zza, zzctVar, false);
        long j11 = zzctVar.zze;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zztkVar.zzs(j10);
    }

    public final zzcw zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    protected final zzts zzD(zzts zztsVar) {
        Object obj = zztsVar.zza;
        if (this.zze.zzf != null && this.zze.zzf.equals(obj)) {
            obj = zztl.zzd;
        }
        return zztsVar.zzc(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    @Override // com.google.android.gms.internal.ads.zzvu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzE(com.google.android.gms.internal.ads.zzcw r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zztl r0 = r14.zze
            com.google.android.gms.internal.ads.zztl r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zztk r15 = r14.zzf
            if (r15 == 0) goto L9b
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L9b
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zztl r0 = r14.zze
            com.google.android.gms.internal.ads.zztl r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcv.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zztl.zzd
            com.google.android.gms.internal.ads.zztl r15 = com.google.android.gms.internal.ads.zztl.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9b
        L36:
            com.google.android.gms.internal.ads.zzcv r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcv r0 = r14.zzc
            java.lang.Object r0 = r0.zzc
            com.google.android.gms.internal.ads.zztk r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zztl r8 = r14.zze
            com.google.android.gms.internal.ads.zzts r5 = r5.zza
            java.lang.Object r5 = r5.zza
            com.google.android.gms.internal.ads.zzct r9 = r14.zzd
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zztl r5 = r14.zze
            com.google.android.gms.internal.ads.zzcv r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzcv r9 = r14.zzc
            com.google.android.gms.internal.ads.zzct r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zztl r0 = r14.zze
            com.google.android.gms.internal.ads.zztl r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zztl r15 = com.google.android.gms.internal.ads.zztl.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zztk r15 = r14.zzf
            if (r15 == 0) goto L9b
            r14.zzL(r4)
            com.google.android.gms.internal.ads.zzts r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zzts r1 = r15.zzc(r0)
        L9b:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zztl r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Laf
            com.google.android.gms.internal.ads.zztk r15 = r14.zzf
            r15.getClass()
            r15.zzr(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztn.zzE(com.google.android.gms.internal.ads.zzcw):void");
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void zzF() {
        if (!this.zzb) {
            this.zzg = true;
            zzB(null, ((zzvu) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zztu
    public final void zzG(zztq zztqVar) {
        ((zztk) zztqVar).zzt();
        if (zztqVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zztu
    /* renamed from: zzH  reason: merged with bridge method [inline-methods] */
    public final zztk zzI(zzts zztsVar, zzxu zzxuVar, long j10) {
        zztk zztkVar = new zztk(zztsVar, zzxuVar, j10);
        zztkVar.zzu(((zzvu) this).zza);
        if (this.zzh) {
            zztkVar.zzr(zztsVar.zzc(zzK(zztsVar.zza)));
        } else {
            this.zzf = zztkVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzvu) this).zza);
            }
        }
        return zztkVar;
    }

    @Override // com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zzst
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzst, com.google.android.gms.internal.ads.zztu
    public final void zzt(zzbp zzbpVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzvq(this.zze.zzc, zzbpVar));
        } else {
            this.zze = zztl.zzq(zzbpVar);
        }
        ((zzvu) this).zza.zzt(zzbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zztu
    public final void zzz() {
    }
}
