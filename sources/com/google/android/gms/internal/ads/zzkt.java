package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzkt {
    private final zzct zza = new zzct();
    private final zzcv zzb = new zzcv();
    private final zzlx zzc;
    private final zzej zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzkq zzh;
    private zzkq zzi;
    private zzkq zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzkt(zzlx zzlxVar, zzej zzejVar) {
        this.zzc = zzlxVar;
        this.zzd = zzejVar;
    }

    private final boolean zzA(zzcw zzcwVar, zzts zztsVar) {
        if (!zzC(zztsVar)) {
            return false;
        }
        int i10 = zzcwVar.zzn(zztsVar.zza, this.zza).zzd;
        if (zzcwVar.zze(i10, this.zzb, 0L).zzq != zzcwVar.zza(zztsVar.zza)) {
            return false;
        }
        return true;
    }

    private final boolean zzB(zzcw zzcwVar) {
        zzkq zzkqVar = this.zzh;
        if (zzkqVar == null) {
            return true;
        }
        int zza = zzcwVar.zza(zzkqVar.zzb);
        while (true) {
            zza = zzcwVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzkqVar.zzg() != null && !zzkqVar.zzf.zzg) {
                zzkqVar = zzkqVar.zzg();
            }
            zzkq zzg = zzkqVar.zzg();
            if (zza == -1 || zzg == null || zzcwVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzkqVar = zzg;
        }
        boolean zzm = zzm(zzkqVar);
        zzkqVar.zzf = zzg(zzcwVar, zzkqVar.zzf);
        if (!zzm) {
            return true;
        }
        return false;
    }

    private static final boolean zzC(zzts zztsVar) {
        if (!zztsVar.zzb() && zztsVar.zze == -1) {
            return true;
        }
        return false;
    }

    private final long zzs(zzcw zzcwVar, Object obj, int i10) {
        zzcwVar.zzn(obj, this.zza);
        this.zza.zzi(i10);
        this.zza.zzk(i10);
        return 0L;
    }

    private final zzkr zzt(zzcw zzcwVar, zzkq zzkqVar, long j10) {
        long j11;
        zzkr zzkrVar = zzkqVar.zzf;
        long zze = (zzkqVar.zze() + zzkrVar.zze) - j10;
        if (zzkrVar.zzg) {
            long j12 = 0;
            int zzi = zzcwVar.zzi(zzcwVar.zza(zzkrVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i10 = zzcwVar.zzd(zzi, this.zza, true).zzd;
                Object obj = this.zza.zzc;
                obj.getClass();
                long j13 = zzkrVar.zza.zzd;
                if (zzcwVar.zze(i10, this.zzb, 0L).zzp == zzi) {
                    Pair zzm = zzcwVar.zzm(this.zzb, this.zza, i10, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm != null) {
                        obj = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzkq zzg = zzkqVar.zzg();
                        if (zzg != null && zzg.zzb.equals(obj)) {
                            j13 = zzg.zzf.zza.zzd;
                        } else {
                            j13 = this.zze;
                            this.zze = 1 + j13;
                        }
                        j11 = longValue;
                        j12 = -9223372036854775807L;
                    }
                } else {
                    j11 = 0;
                }
                zzts zzx = zzx(zzcwVar, obj, j11, j13, this.zzb, this.zza);
                if (j12 != -9223372036854775807L && zzkrVar.zzc != -9223372036854775807L) {
                    zzcwVar.zzn(zzkrVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzu(zzcwVar, zzx, j12, j11);
            }
        } else {
            zzts zztsVar = zzkrVar.zza;
            zzcwVar.zzn(zztsVar.zza, this.zza);
            if (zztsVar.zzb()) {
                int i11 = zztsVar.zzb;
                if (this.zza.zza(i11) != -1) {
                    int zzf = this.zza.zzf(i11, zztsVar.zzc);
                    if (zzf < 0) {
                        return zzv(zzcwVar, zztsVar.zza, i11, zzf, zzkrVar.zzc, zztsVar.zzd);
                    }
                    long j14 = zzkrVar.zzc;
                    if (j14 == -9223372036854775807L) {
                        zzcv zzcvVar = this.zzb;
                        zzct zzctVar = this.zza;
                        Pair zzm2 = zzcwVar.zzm(zzcvVar, zzctVar, zzctVar.zzd, -9223372036854775807L, Math.max(0L, zze));
                        if (zzm2 != null) {
                            j14 = ((Long) zzm2.second).longValue();
                        }
                    }
                    zzs(zzcwVar, zztsVar.zza, zztsVar.zzb);
                    return zzw(zzcwVar, zztsVar.zza, Math.max(0L, j14), zzkrVar.zzc, zztsVar.zzd);
                }
            } else {
                int i12 = zztsVar.zze;
                if (i12 != -1) {
                    this.zza.zzm(i12);
                }
                int zze2 = this.zza.zze(zztsVar.zze);
                this.zza.zzn(zztsVar.zze);
                if (zze2 != this.zza.zza(zztsVar.zze)) {
                    return zzv(zzcwVar, zztsVar.zza, zztsVar.zze, zze2, zzkrVar.zze, zztsVar.zzd);
                }
                zzs(zzcwVar, zztsVar.zza, zztsVar.zze);
                return zzw(zzcwVar, zztsVar.zza, 0L, zzkrVar.zze, zztsVar.zzd);
            }
        }
        return null;
    }

    private final zzkr zzu(zzcw zzcwVar, zzts zztsVar, long j10, long j11) {
        zzcwVar.zzn(zztsVar.zza, this.zza);
        if (zztsVar.zzb()) {
            return zzv(zzcwVar, zztsVar.zza, zztsVar.zzb, zztsVar.zzc, j10, zztsVar.zzd);
        }
        return zzw(zzcwVar, zztsVar.zza, j11, j10, zztsVar.zzd);
    }

    private final zzkr zzv(zzcw zzcwVar, Object obj, int i10, int i11, long j10, long j11) {
        zzts zztsVar = new zzts(obj, i10, i11, j11);
        long zzh = zzcwVar.zzn(zztsVar.zza, this.zza).zzh(zztsVar.zzb, zztsVar.zzc);
        if (i11 == this.zza.zze(i10)) {
            this.zza.zzj();
        }
        this.zza.zzn(zztsVar.zzb);
        long j12 = 0;
        if (zzh != -9223372036854775807L && zzh <= 0) {
            j12 = Math.max(0L, (-1) + zzh);
        }
        return new zzkr(zztsVar, j12, j10, -9223372036854775807L, zzh, false, false, false, false);
    }

    private final zzkr zzw(zzcw zzcwVar, Object obj, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        zzcwVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j16);
        if (zzc != -1) {
            this.zza.zzm(zzc);
        }
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzn(zzc);
        }
        zzts zztsVar = new zzts(obj, j12, zzc);
        boolean zzC = zzC(zztsVar);
        boolean zzA = zzA(zzcwVar, zztsVar);
        boolean zzz = zzz(zzcwVar, zztsVar, zzC);
        if (zzc != -1) {
            this.zza.zzn(zzc);
        }
        if (zzc != -1) {
            this.zza.zzi(zzc);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j14 = 0;
            j15 = 0;
        } else {
            j14 = j13;
            j15 = this.zza.zze;
        }
        if (j15 != -9223372036854775807L && j16 >= j15) {
            j16 = Math.max(0L, j15 - 1);
        }
        return new zzkr(zztsVar, j16, j11, j14, j15, false, zzC, zzA, zzz);
    }

    private static zzts zzx(zzcw zzcwVar, Object obj, long j10, long j11, zzcv zzcvVar, zzct zzctVar) {
        zzcwVar.zzn(obj, zzctVar);
        zzcwVar.zze(zzctVar.zzd, zzcvVar, 0L);
        zzcwVar.zza(obj);
        zzctVar.zzb();
        zzcwVar.zzn(obj, zzctVar);
        int zzd = zzctVar.zzd(j10);
        if (zzd == -1) {
            return new zzts(obj, j11, zzctVar.zzc(j10));
        }
        return new zzts(obj, zzd, zzctVar.zze(zzd), j11);
    }

    private final void zzy() {
        final zzts zztsVar;
        final zzfua zzfuaVar = new zzfua();
        for (zzkq zzkqVar = this.zzh; zzkqVar != null; zzkqVar = zzkqVar.zzg()) {
            zzfuaVar.zzf(zzkqVar.zzf.zza);
        }
        zzkq zzkqVar2 = this.zzi;
        if (zzkqVar2 == null) {
            zztsVar = null;
        } else {
            zztsVar = zzkqVar2.zzf.zza;
        }
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzks
            @Override // java.lang.Runnable
            public final void run() {
                zzkt.this.zzj(zzfuaVar, zztsVar);
            }
        });
    }

    private final boolean zzz(zzcw zzcwVar, zzts zztsVar, boolean z10) {
        int zza = zzcwVar.zza(zztsVar.zza);
        if (zzcwVar.zze(zzcwVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzj || zzcwVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) != -1 || !z10) {
            return false;
        }
        return true;
    }

    public final zzkq zza() {
        zzkq zzkqVar = this.zzh;
        if (zzkqVar == null) {
            return null;
        }
        if (zzkqVar == this.zzi) {
            this.zzi = zzkqVar.zzg();
        }
        zzkqVar.zzn();
        int i10 = this.zzk - 1;
        this.zzk = i10;
        if (i10 == 0) {
            this.zzj = null;
            zzkq zzkqVar2 = this.zzh;
            this.zzl = zzkqVar2.zzb;
            this.zzm = zzkqVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzkq zzb() {
        zzkq zzkqVar = this.zzi;
        boolean z10 = false;
        if (zzkqVar != null && zzkqVar.zzg() != null) {
            z10 = true;
        }
        zzdy.zzf(z10);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzkq zzc() {
        return this.zzj;
    }

    public final zzkq zzd() {
        return this.zzh;
    }

    public final zzkq zze() {
        return this.zzi;
    }

    public final zzkr zzf(long j10, zzlg zzlgVar) {
        zzkq zzkqVar = this.zzj;
        if (zzkqVar == null) {
            return zzu(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzr);
        }
        return zzt(zzlgVar.zza, zzkqVar, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzkr zzg(com.google.android.gms.internal.ads.zzcw r19, com.google.android.gms.internal.ads.zzkr r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzts r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzts r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzct r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzct r9 = r0.zza
            r9.zzi(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzct r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzh(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzct r1 = r0.zza
            long r5 = r1.zze
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzct r1 = r0.zza
            int r4 = r3.zzb
            r1.zzn(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzct r4 = r0.zza
            r4.zzn(r1)
        L6e:
            com.google.android.gms.internal.ads.zzkr r15 = new com.google.android.gms.internal.ads.zzkr
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zzg(com.google.android.gms.internal.ads.zzcw, com.google.android.gms.internal.ads.zzkr):com.google.android.gms.internal.ads.zzkr");
    }

    public final zzts zzh(zzcw zzcwVar, Object obj, long j10) {
        long j11;
        int zza;
        int i10 = zzcwVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 != null && (zza = zzcwVar.zza(obj2)) != -1 && zzcwVar.zzd(zza, this.zza, false).zzd == i10) {
            j11 = this.zzm;
        } else {
            zzkq zzkqVar = this.zzh;
            while (true) {
                if (zzkqVar != null) {
                    if (zzkqVar.zzb.equals(obj)) {
                        j11 = zzkqVar.zzf.zza.zzd;
                        break;
                    }
                    zzkqVar = zzkqVar.zzg();
                } else {
                    zzkq zzkqVar2 = this.zzh;
                    while (true) {
                        if (zzkqVar2 != null) {
                            int zza2 = zzcwVar.zza(zzkqVar2.zzb);
                            if (zza2 != -1 && zzcwVar.zzd(zza2, this.zza, false).zzd == i10) {
                                j11 = zzkqVar2.zzf.zza.zzd;
                                break;
                            }
                            zzkqVar2 = zzkqVar2.zzg();
                        } else {
                            j11 = this.zze;
                            this.zze = 1 + j11;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j11;
                            }
                        }
                    }
                }
            }
        }
        long j12 = j11;
        zzcwVar.zzn(obj, this.zza);
        zzcwVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzcwVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcv zzcvVar = this.zzb;
            if (zza3 >= zzcvVar.zzp) {
                zzcwVar.zzd(zza3, this.zza, true);
                this.zza.zzb();
                zzct zzctVar = this.zza;
                if (zzctVar.zzd(zzctVar.zze) != -1) {
                    obj3 = this.zza.zzc;
                    obj3.getClass();
                }
                zza3--;
            } else {
                return zzx(zzcwVar, obj3, j10, j12, zzcvVar, this.zza);
            }
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzkq zzkqVar = this.zzh;
        zzdy.zzb(zzkqVar);
        this.zzl = zzkqVar.zzb;
        this.zzm = zzkqVar.zzf.zza.zzd;
        while (zzkqVar != null) {
            zzkqVar.zzn();
            zzkqVar = zzkqVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzfua zzfuaVar, zzts zztsVar) {
        this.zzc.zzQ(zzfuaVar.zzi(), zztsVar);
    }

    public final void zzk(long j10) {
        zzkq zzkqVar = this.zzj;
        if (zzkqVar != null) {
            zzkqVar.zzm(j10);
        }
    }

    public final boolean zzl(zztq zztqVar) {
        zzkq zzkqVar = this.zzj;
        if (zzkqVar != null && zzkqVar.zza == zztqVar) {
            return true;
        }
        return false;
    }

    public final boolean zzm(zzkq zzkqVar) {
        boolean z10;
        boolean z11 = false;
        if (zzkqVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
        if (zzkqVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzkqVar;
        while (zzkqVar.zzg() != null) {
            zzkqVar = zzkqVar.zzg();
            if (zzkqVar == this.zzi) {
                this.zzi = this.zzh;
                z11 = true;
            }
            zzkqVar.zzn();
            this.zzk--;
        }
        this.zzj.zzo(null);
        zzy();
        return z11;
    }

    public final boolean zzn() {
        zzkq zzkqVar = this.zzj;
        if (zzkqVar == null) {
            return true;
        }
        if (!zzkqVar.zzf.zzi && zzkqVar.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100) {
            return true;
        }
        return false;
    }

    public final boolean zzo(zzcw zzcwVar, long j10, long j11) {
        zzkr zzkrVar;
        long zze;
        boolean z10;
        zzkq zzkqVar = null;
        for (zzkq zzkqVar2 = this.zzh; zzkqVar2 != null; zzkqVar2 = zzkqVar2.zzg()) {
            zzkr zzkrVar2 = zzkqVar2.zzf;
            if (zzkqVar == null) {
                zzkrVar = zzg(zzcwVar, zzkrVar2);
            } else {
                zzkr zzt = zzt(zzcwVar, zzkqVar, j10);
                if (zzt == null) {
                    if (!zzm(zzkqVar)) {
                        return true;
                    }
                    return false;
                } else if (zzkrVar2.zzb == zzt.zzb && zzkrVar2.zza.equals(zzt.zza)) {
                    zzkrVar = zzt;
                } else if (!zzm(zzkqVar)) {
                    return true;
                } else {
                    return false;
                }
            }
            zzkqVar2.zzf = zzkrVar.zza(zzkrVar2.zzc);
            long j12 = zzkrVar2.zze;
            long j13 = zzkrVar.zze;
            if (j12 != -9223372036854775807L && j12 != j13) {
                zzkqVar2.zzq();
                long j14 = zzkrVar.zze;
                if (j14 == -9223372036854775807L) {
                    zze = Long.MAX_VALUE;
                } else {
                    zze = j14 + zzkqVar2.zze();
                }
                if (zzkqVar2 == this.zzi) {
                    boolean z11 = zzkqVar2.zzf.zzf;
                    if (j11 == Long.MIN_VALUE || j11 >= zze) {
                        z10 = true;
                        if (zzm(zzkqVar2) && !z10) {
                            return true;
                        }
                        return false;
                    }
                }
                z10 = false;
                if (zzm(zzkqVar2)) {
                }
                return false;
            }
            zzkqVar = zzkqVar2;
        }
        return true;
    }

    public final boolean zzp(zzcw zzcwVar, int i10) {
        this.zzf = i10;
        return zzB(zzcwVar);
    }

    public final boolean zzq(zzcw zzcwVar, boolean z10) {
        this.zzg = z10;
        return zzB(zzcwVar);
    }

    public final zzkq zzr(zzlp[] zzlpVarArr, zzxl zzxlVar, zzxu zzxuVar, zzlf zzlfVar, zzkr zzkrVar, zzxm zzxmVar) {
        long zze;
        zzkq zzkqVar = this.zzj;
        if (zzkqVar == null) {
            zze = 1000000000000L;
        } else {
            zze = (zzkqVar.zze() + zzkqVar.zzf.zze) - zzkrVar.zzb;
        }
        zzkq zzkqVar2 = new zzkq(zzlpVarArr, zze, zzxlVar, zzxuVar, zzlfVar, zzkrVar, zzxmVar);
        zzkq zzkqVar3 = this.zzj;
        if (zzkqVar3 != null) {
            zzkqVar3.zzo(zzkqVar2);
        } else {
            this.zzh = zzkqVar2;
            this.zzi = zzkqVar2;
        }
        this.zzl = null;
        this.zzj = zzkqVar2;
        this.zzk++;
        zzy();
        return zzkqVar2;
    }
}
