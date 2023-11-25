package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzkl implements Handler.Callback, zztp, zzxk, zzle, zzii, zzlh {
    private boolean zzA;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private zzkk zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    private zzil zzL;
    private final zzjg zzN;
    private final zzig zzO;
    private final zzln[] zza;
    private final Set zzb;
    private final zzlp[] zzc;
    private final zzxl zzd;
    private final zzxm zze;
    private final zzko zzf;
    private final zzxt zzg;
    private final zzej zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcv zzk;
    private final zzct zzl;
    private final long zzm;
    private final zzij zzn;
    private final ArrayList zzo;
    private final zzdz zzp;
    private final zzkt zzq;
    private final zzlf zzr;
    private final long zzs;
    private zzlr zzt;
    private zzlg zzu;
    private zzkj zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzB = 0;
    private boolean zzC = false;
    private boolean zzx = false;
    private long zzM = -9223372036854775807L;

    public zzkl(zzln[] zzlnVarArr, zzxl zzxlVar, zzxm zzxmVar, zzko zzkoVar, zzxt zzxtVar, int i10, boolean z10, zzlx zzlxVar, zzlr zzlrVar, zzig zzigVar, long j10, boolean z11, Looper looper, zzdz zzdzVar, zzjg zzjgVar, zzoh zzohVar, Looper looper2) {
        this.zzN = zzjgVar;
        this.zza = zzlnVarArr;
        this.zzd = zzxlVar;
        this.zze = zzxmVar;
        this.zzf = zzkoVar;
        this.zzg = zzxtVar;
        this.zzt = zzlrVar;
        this.zzO = zzigVar;
        this.zzs = j10;
        this.zzp = zzdzVar;
        this.zzm = zzkoVar.zza();
        zzkoVar.zzf();
        zzlg zzi = zzlg.zzi(zzxmVar);
        this.zzu = zzi;
        this.zzv = new zzkj(zzi);
        int length = zzlnVarArr.length;
        this.zzc = new zzlp[2];
        zzlo zzc = zzxlVar.zzc();
        for (int i11 = 0; i11 < 2; i11++) {
            zzlnVarArr[i11].zzu(i11, zzohVar, zzdzVar);
            this.zzc[i11] = zzlnVarArr[i11].zzl();
            this.zzc[i11].zzI(zzc);
        }
        this.zzn = new zzij(this, zzdzVar);
        this.zzo = new ArrayList();
        this.zzb = Collections.newSetFromMap(new IdentityHashMap());
        this.zzk = new zzcv();
        this.zzl = new zzct();
        zzxlVar.zzr(this, zzxtVar);
        this.zzK = true;
        zzej zzb = zzdzVar.zzb(looper, null);
        this.zzq = new zzkt(zzlxVar, zzb);
        this.zzr = new zzlf(this, zzlxVar, zzb, zzohVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzi = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.zzj = looper3;
        this.zzh = zzdzVar.zzb(looper3, this);
    }

    private final void zzA(zzln zzlnVar) throws zzil {
        if (!zzae(zzlnVar)) {
            return;
        }
        this.zzn.zzd(zzlnVar);
        zzal(zzlnVar);
        zzlnVar.zzq();
        this.zzG--;
    }

    private final void zzB() throws zzil {
        int length = this.zza.length;
        zzC(new boolean[2]);
    }

    private final void zzC(boolean[] zArr) throws zzil {
        boolean z10;
        boolean z11;
        boolean z12;
        zzkq zze = this.zzq.zze();
        zzxm zzi = zze.zzi();
        int i10 = 0;
        while (true) {
            int length = this.zza.length;
            if (i10 >= 2) {
                break;
            }
            if (!zzi.zzb(i10) && this.zzb.remove(this.zza[i10])) {
                this.zza[i10].zzF();
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i11 < 2) {
                if (zzi.zzb(i11)) {
                    boolean z13 = zArr[i11];
                    zzln zzlnVar = this.zza[i11];
                    if (!zzae(zzlnVar)) {
                        zzkq zze2 = this.zzq.zze();
                        if (zze2 == this.zzq.zzd()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zzxm zzi2 = zze2.zzi();
                        zzlq zzlqVar = zzi2.zzb[i11];
                        zzam[] zzaj = zzaj(zzi2.zzc[i11]);
                        if (zzah() && this.zzu.zze == 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z13 && z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.zzG++;
                        this.zzb.add(zzlnVar);
                        zzlnVar.zzr(zzlqVar, zzaj, zze2.zzc[i11], this.zzI, z12, z10, zze2.zzf(), zze2.zze());
                        zzlnVar.zzt(11, new zzke(this));
                        this.zzn.zze(zzlnVar);
                        if (z11) {
                            zzlnVar.zzK();
                        }
                    }
                }
                i11++;
            } else {
                zze.zzg = true;
                return;
            }
        }
    }

    private final void zzD(IOException iOException, int i10) {
        zzil zzc = zzil.zzc(iOException, i10);
        zzkq zzd = this.zzq.zzd();
        if (zzd != null) {
            zzc = zzc.zza(zzd.zzf.zza);
        }
        zzes.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzW(false, false);
        this.zzu = this.zzu.zzf(zzc);
    }

    private final void zzE(boolean z10) {
        zzts zztsVar;
        long zzc;
        zzkq zzc2 = this.zzq.zzc();
        if (zzc2 == null) {
            zztsVar = this.zzu.zzb;
        } else {
            zztsVar = zzc2.zzf.zza;
        }
        boolean z11 = !this.zzu.zzk.equals(zztsVar);
        if (z11) {
            this.zzu = this.zzu.zzc(zztsVar);
        }
        zzlg zzlgVar = this.zzu;
        if (zzc2 == null) {
            zzc = zzlgVar.zzr;
        } else {
            zzc = zzc2.zzc();
        }
        zzlgVar.zzp = zzc;
        this.zzu.zzq = zzt();
        if ((z11 || z10) && zzc2 != null && zzc2.zzd) {
            zzZ(zzc2.zzf.zza, zzc2.zzh(), zzc2.zzi());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzF(com.google.android.gms.internal.ads.zzcw r28, boolean r29) throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zzF(com.google.android.gms.internal.ads.zzcw, boolean):void");
    }

    private final void zzG(zzch zzchVar, boolean z10) throws zzil {
        zzH(zzchVar, zzchVar.zzc, true, z10);
    }

    private final void zzH(zzch zzchVar, float f10, boolean z10, boolean z11) throws zzil {
        int i10;
        zzkl zzklVar = this;
        if (z10) {
            if (z11) {
                zzklVar.zzv.zza(1);
            }
            zzlg zzlgVar = zzklVar.zzu;
            zzklVar = this;
            zzklVar.zzu = new zzlg(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzd, zzlgVar.zze, zzlgVar.zzf, zzlgVar.zzg, zzlgVar.zzh, zzlgVar.zzi, zzlgVar.zzj, zzlgVar.zzk, zzlgVar.zzl, zzlgVar.zzm, zzchVar, zzlgVar.zzp, zzlgVar.zzq, zzlgVar.zzr, zzlgVar.zzs, zzlgVar.zzo);
        }
        float f11 = zzchVar.zzc;
        zzkq zzd = zzklVar.zzq.zzd();
        while (true) {
            i10 = 0;
            if (zzd == null) {
                break;
            }
            zzxf[] zzxfVarArr = zzd.zzi().zzc;
            int length = zzxfVarArr.length;
            while (i10 < length) {
                zzxf zzxfVar = zzxfVarArr[i10];
                i10++;
            }
            zzd = zzd.zzg();
        }
        zzln[] zzlnVarArr = zzklVar.zza;
        int length2 = zzlnVarArr.length;
        while (i10 < 2) {
            zzln zzlnVar = zzlnVarArr[i10];
            if (zzlnVar != null) {
                zzlnVar.zzJ(f10, zzchVar.zzc);
            }
            i10++;
        }
    }

    private final void zzI() {
        long zze;
        long j10;
        boolean z10 = false;
        if (zzad()) {
            zzkq zzc = this.zzq.zzc();
            long zzu = zzu(zzc.zzd());
            if (zzc == this.zzq.zzd()) {
                zze = this.zzI;
                j10 = zzc.zze();
            } else {
                zze = this.zzI - zzc.zze();
                j10 = zzc.zzf.zzb;
            }
            long j11 = zze - j10;
            boolean zzg = this.zzf.zzg(j11, zzu, this.zzn.zzc().zzc);
            if (!zzg && zzu < 500000 && this.zzm > 0) {
                this.zzq.zzd().zza.zzj(this.zzu.zzr, false);
                z10 = this.zzf.zzg(j11, zzu, this.zzn.zzc().zzc);
            } else {
                z10 = zzg;
            }
        }
        this.zzA = z10;
        if (z10) {
            this.zzq.zzc().zzk(this.zzI);
        }
        zzY();
    }

    private final void zzJ() {
        boolean z10;
        this.zzv.zzc(this.zzu);
        z10 = this.zzv.zzg;
        if (z10) {
            zzjg zzjgVar = this.zzN;
            zzjgVar.zza.zzU(this.zzv);
            this.zzv = new zzkj(this.zzu);
        }
    }

    private final void zzK() throws zzil {
        int i10;
        boolean z10;
        float f10 = this.zzn.zzc().zzc;
        zzkq zze = this.zzq.zze();
        boolean z11 = true;
        for (zzkq zzd = this.zzq.zzd(); zzd != null && zzd.zzd; zzd = zzd.zzg()) {
            zzxm zzj = zzd.zzj(f10, this.zzu.zza);
            zzxm zzi = zzd.zzi();
            boolean z12 = false;
            if (zzi != null && zzi.zzc.length == zzj.zzc.length) {
                for (int i11 = 0; i11 < zzj.zzc.length; i11++) {
                    if (zzj.zza(zzi, i11)) {
                    }
                }
                if (zzd != zze) {
                    z12 = true;
                }
                z11 &= z12;
            }
            if (z11) {
                zzkq zzd2 = this.zzq.zzd();
                boolean zzm = this.zzq.zzm(zzd2);
                int length = this.zza.length;
                boolean[] zArr = new boolean[2];
                long zzb = zzd2.zzb(zzj, this.zzu.zzr, zzm, zArr);
                zzlg zzlgVar = this.zzu;
                if (zzlgVar.zze != 4 && zzb != zzlgVar.zzr) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzlg zzlgVar2 = this.zzu;
                i10 = 2;
                this.zzu = zzz(zzlgVar2.zzb, zzb, zzlgVar2.zzc, zzlgVar2.zzd, z10, 5);
                if (z10) {
                    zzO(zzb);
                }
                int length2 = this.zza.length;
                boolean[] zArr2 = new boolean[2];
                int i12 = 0;
                while (true) {
                    zzln[] zzlnVarArr = this.zza;
                    int length3 = zzlnVarArr.length;
                    if (i12 >= 2) {
                        break;
                    }
                    zzln zzlnVar = zzlnVarArr[i12];
                    boolean zzae = zzae(zzlnVar);
                    zArr2[i12] = zzae;
                    zzvj zzvjVar = zzd2.zzc[i12];
                    if (zzae) {
                        if (zzvjVar != zzlnVar.zzo()) {
                            zzA(zzlnVar);
                        } else if (zArr[i12]) {
                            zzlnVar.zzG(this.zzI);
                        }
                    }
                    i12++;
                }
                zzC(zArr2);
            } else {
                i10 = 2;
                this.zzq.zzm(zzd);
                if (zzd.zzd) {
                    zzd.zza(zzj, Math.max(zzd.zzf.zzb, this.zzI - zzd.zze()), false);
                }
            }
            zzE(true);
            if (this.zzu.zze != 4) {
                zzI();
                zzaa();
                this.zzh.zzi(i10);
                return;
            }
            return;
        }
    }

    private final void zzL() throws zzil {
        zzK();
        zzR(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzM(boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zzM(boolean, boolean, boolean, boolean):void");
    }

    private final void zzN() {
        zzkq zzd = this.zzq.zzd();
        boolean z10 = false;
        if (zzd != null && zzd.zzf.zzh && this.zzx) {
            z10 = true;
        }
        this.zzy = z10;
    }

    private final void zzO(long j10) throws zzil {
        long zze;
        zzkq zzd = this.zzq.zzd();
        if (zzd == null) {
            zze = 1000000000000L;
        } else {
            zze = zzd.zze();
        }
        long j11 = j10 + zze;
        this.zzI = j11;
        this.zzn.zzf(j11);
        zzln[] zzlnVarArr = this.zza;
        int length = zzlnVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzln zzlnVar = zzlnVarArr[i10];
            if (zzae(zzlnVar)) {
                zzlnVar.zzG(this.zzI);
            }
        }
        for (zzkq zzd2 = this.zzq.zzd(); zzd2 != null; zzd2 = zzd2.zzg()) {
            for (zzxf zzxfVar : zzd2.zzi().zzc) {
            }
        }
    }

    private final void zzP(zzcw zzcwVar, zzcw zzcwVar2) {
        if (zzcwVar.zzo() && zzcwVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        Object obj = ((zzki) this.zzo.get(size)).zzb;
        int i10 = zzfk.zza;
        throw null;
    }

    private final void zzQ(long j10, long j11) {
        this.zzh.zzj(2, j10 + j11);
    }

    private final void zzR(boolean z10) throws zzil {
        zzts zztsVar = this.zzq.zzd().zzf.zza;
        long zzw = zzw(zztsVar, this.zzu.zzr, true, false);
        if (zzw != this.zzu.zzr) {
            zzlg zzlgVar = this.zzu;
            this.zzu = zzz(zztsVar, zzw, zzlgVar.zzc, zzlgVar.zzd, z10, 5);
        }
    }

    private final void zzS(zzch zzchVar) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzchVar);
    }

    private final void zzT(boolean z10, int i10, boolean z11, int i11) throws zzil {
        this.zzv.zza(z11 ? 1 : 0);
        this.zzv.zzb(i11);
        this.zzu = this.zzu.zze(z10, i10);
        this.zzz = false;
        for (zzkq zzd = this.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
            for (zzxf zzxfVar : zzd.zzi().zzc) {
            }
        }
        if (!zzah()) {
            zzX();
            zzaa();
            return;
        }
        int i12 = this.zzu.zze;
        if (i12 == 3) {
            zzV();
            this.zzh.zzi(2);
        } else if (i12 == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzU(int i10) {
        zzlg zzlgVar = this.zzu;
        if (zzlgVar.zze != i10) {
            if (i10 != 2) {
                this.zzM = -9223372036854775807L;
            }
            this.zzu = zzlgVar.zzg(i10);
        }
    }

    private final void zzV() throws zzil {
        this.zzz = false;
        this.zzn.zzh();
        zzln[] zzlnVarArr = this.zza;
        int length = zzlnVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzln zzlnVar = zzlnVarArr[i10];
            if (zzae(zzlnVar)) {
                zzlnVar.zzK();
            }
        }
    }

    private final void zzW(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.zzD) {
            z12 = false;
        } else {
            z12 = true;
        }
        zzM(z12, false, true, false);
        this.zzv.zza(z11 ? 1 : 0);
        this.zzf.zzd();
        zzU(1);
    }

    private final void zzX() throws zzil {
        this.zzn.zzi();
        zzln[] zzlnVarArr = this.zza;
        int length = zzlnVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzln zzlnVar = zzlnVarArr[i10];
            if (zzae(zzlnVar)) {
                zzal(zzlnVar);
            }
        }
    }

    private final void zzY() {
        boolean z10;
        zzkq zzc = this.zzq.zzc();
        if (!this.zzA && (zzc == null || !zzc.zza.zzp())) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzlg zzlgVar = this.zzu;
        if (z10 != zzlgVar.zzg) {
            this.zzu = new zzlg(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzd, zzlgVar.zze, zzlgVar.zzf, z10, zzlgVar.zzh, zzlgVar.zzi, zzlgVar.zzj, zzlgVar.zzk, zzlgVar.zzl, zzlgVar.zzm, zzlgVar.zzn, zzlgVar.zzp, zzlgVar.zzq, zzlgVar.zzr, zzlgVar.zzs, zzlgVar.zzo);
        }
    }

    private final void zzZ(zzts zztsVar, zzvs zzvsVar, zzxm zzxmVar) {
        this.zzf.zze(this.zzu.zza, zztsVar, this.zza, zzvsVar, zzxmVar.zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[LOOP:0: B:32:0x00ab->B:39:0x00bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c6 -> B:32:0x00ab). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzaa() throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zzaa():void");
    }

    private final void zzab(zzcw zzcwVar, zzts zztsVar, zzcw zzcwVar2, zzts zztsVar2, long j10, boolean z10) throws zzil {
        Object obj;
        zzch zzchVar;
        if (!zzai(zzcwVar, zztsVar)) {
            if (zztsVar.zzb()) {
                zzchVar = zzch.zza;
            } else {
                zzchVar = this.zzu.zzn;
            }
            if (!this.zzn.zzc().equals(zzchVar)) {
                zzS(zzchVar);
                zzH(this.zzu.zzn, zzchVar.zzc, false, false);
                return;
            }
            return;
        }
        zzcwVar.zze(zzcwVar.zzn(zztsVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzig zzigVar = this.zzO;
        zzbf zzbfVar = this.zzk.zzl;
        int i10 = zzfk.zza;
        zzigVar.zzd(zzbfVar);
        if (j10 != -9223372036854775807L) {
            this.zzO.zze(zzs(zzcwVar, zztsVar.zza, j10));
            return;
        }
        Object obj2 = this.zzk.zzc;
        if (!zzcwVar2.zzo()) {
            obj = zzcwVar2.zze(zzcwVar2.zzn(zztsVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc;
        } else {
            obj = null;
        }
        if (zzfk.zzD(obj, obj2) && !z10) {
            return;
        }
        this.zzO.zze(-9223372036854775807L);
    }

    private final synchronized void zzac(zzfry zzfryVar, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!Boolean.valueOf(((zzkc) zzfryVar).zza.zzw).booleanValue() && j10 > 0) {
            try {
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzad() {
        zzkq zzc = this.zzq.zzc();
        if (zzc == null || zzc.zzd() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private static boolean zzae(zzln zzlnVar) {
        if (zzlnVar.zzbc() != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzaf() {
        zzkq zzd = this.zzq.zzd();
        long j10 = zzd.zzf.zze;
        if (!zzd.zzd) {
            return false;
        }
        if (j10 != -9223372036854775807L && this.zzu.zzr >= j10 && zzah()) {
            return false;
        }
        return true;
    }

    private static boolean zzag(zzlg zzlgVar, zzct zzctVar) {
        zzts zztsVar = zzlgVar.zzb;
        zzcw zzcwVar = zzlgVar.zza;
        if (!zzcwVar.zzo() && !zzcwVar.zzn(zztsVar.zza, zzctVar).zzg) {
            return false;
        }
        return true;
    }

    private final boolean zzah() {
        zzlg zzlgVar = this.zzu;
        if (zzlgVar.zzl && zzlgVar.zzm == 0) {
            return true;
        }
        return false;
    }

    private final boolean zzai(zzcw zzcwVar, zzts zztsVar) {
        if (!zztsVar.zzb() && !zzcwVar.zzo()) {
            zzcwVar.zze(zzcwVar.zzn(zztsVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzcv zzcvVar = this.zzk;
                if (zzcvVar.zzj && zzcvVar.zzg != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzam[] zzaj(zzxf zzxfVar) {
        int i10;
        if (zzxfVar != null) {
            i10 = zzxfVar.zzc();
        } else {
            i10 = 0;
        }
        zzam[] zzamVarArr = new zzam[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            zzamVarArr[i11] = zzxfVar.zzd(i11);
        }
        return zzamVarArr;
    }

    private static final void zzak(zzlj zzljVar) throws zzil {
        zzljVar.zzj();
        try {
            zzljVar.zzc().zzt(zzljVar.zza(), zzljVar.zzg());
        } finally {
            zzljVar.zzh(true);
        }
    }

    private static final void zzal(zzln zzlnVar) {
        if (zzlnVar.zzbc() == 2) {
            zzlnVar.zzL();
        }
    }

    private static final void zzam(zzln zzlnVar, long j10) {
        zzlnVar.zzH();
        if (!(zzlnVar instanceof zzvw)) {
            return;
        }
        zzvw zzvwVar = (zzvw) zzlnVar;
        throw null;
    }

    static Object zze(zzcv zzcvVar, zzct zzctVar, int i10, boolean z10, Object obj, zzcw zzcwVar, zzcw zzcwVar2) {
        int zza = zzcwVar.zza(obj);
        int zzb = zzcwVar.zzb();
        int i11 = 0;
        int i12 = zza;
        int i13 = -1;
        while (true) {
            if (i11 >= zzb || i13 != -1) {
                break;
            }
            i12 = zzcwVar.zzi(i12, zzctVar, zzcvVar, i10, z10);
            if (i12 == -1) {
                i13 = -1;
                break;
            }
            i13 = zzcwVar2.zza(zzcwVar.zzf(i12));
            i11++;
        }
        if (i13 == -1) {
            return null;
        }
        return zzcwVar2.zzf(i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzr(zzlj zzljVar) {
        try {
            zzak(zzljVar);
        } catch (zzil e10) {
            zzes.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private final long zzs(zzcw zzcwVar, Object obj, long j10) {
        long elapsedRealtime;
        zzcwVar.zze(zzcwVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzcv zzcvVar = this.zzk;
        if (zzcvVar.zzg != -9223372036854775807L && zzcvVar.zzb()) {
            zzcv zzcvVar2 = this.zzk;
            if (zzcvVar2.zzj) {
                long j11 = zzcvVar2.zzh;
                if (j11 == -9223372036854775807L) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j11 + SystemClock.elapsedRealtime();
                }
                return zzfk.zzp(elapsedRealtime - this.zzk.zzg) - j10;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzu.zzp);
    }

    private final long zzu(long j10) {
        zzkq zzc = this.zzq.zzc();
        if (zzc == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.zzI - zzc.zze()));
    }

    private final long zzv(zzts zztsVar, long j10, boolean z10) throws zzil {
        boolean z11;
        if (this.zzq.zzd() != this.zzq.zze()) {
            z11 = true;
        } else {
            z11 = false;
        }
        return zzw(zztsVar, j10, z11, z10);
    }

    private final long zzw(zzts zztsVar, long j10, boolean z10, boolean z11) throws zzil {
        zzX();
        this.zzz = false;
        if (z11 || this.zzu.zze == 3) {
            zzU(2);
        }
        zzkq zzd = this.zzq.zzd();
        zzkq zzkqVar = zzd;
        while (zzkqVar != null && !zztsVar.equals(zzkqVar.zzf.zza)) {
            zzkqVar = zzkqVar.zzg();
        }
        if (z10 || zzd != zzkqVar || (zzkqVar != null && zzkqVar.zze() + j10 < 0)) {
            zzln[] zzlnVarArr = this.zza;
            int length = zzlnVarArr.length;
            for (int i10 = 0; i10 < 2; i10++) {
                zzA(zzlnVarArr[i10]);
            }
            if (zzkqVar != null) {
                while (this.zzq.zzd() != zzkqVar) {
                    this.zzq.zza();
                }
                this.zzq.zzm(zzkqVar);
                zzkqVar.zzp(1000000000000L);
                zzB();
            }
        }
        if (zzkqVar != null) {
            this.zzq.zzm(zzkqVar);
            if (!zzkqVar.zzd) {
                zzkqVar.zzf = zzkqVar.zzf.zzb(j10);
            } else if (zzkqVar.zze) {
                j10 = zzkqVar.zza.zze(j10);
                zzkqVar.zza.zzj(j10 - this.zzm, false);
            }
            zzO(j10);
            zzI();
        } else {
            this.zzq.zzi();
            zzO(j10);
        }
        zzE(false);
        this.zzh.zzi(2);
        return j10;
    }

    private final Pair zzx(zzcw zzcwVar) {
        long j10 = 0;
        if (zzcwVar.zzo()) {
            return Pair.create(zzlg.zzj(), 0L);
        }
        Pair zzl = zzcwVar.zzl(this.zzk, this.zzl, zzcwVar.zzg(this.zzC), -9223372036854775807L);
        zzts zzh = this.zzq.zzh(zzcwVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzh.zzb()) {
            zzcwVar.zzn(zzh.zza, this.zzl);
            if (zzh.zzc == this.zzl.zze(zzh.zzb)) {
                this.zzl.zzj();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(zzh, Long.valueOf(j10));
    }

    private static Pair zzy(zzcw zzcwVar, zzkk zzkkVar, boolean z10, int i10, boolean z11, zzcv zzcvVar, zzct zzctVar) {
        zzcw zzcwVar2;
        Pair zzl;
        zzcw zzcwVar3 = zzkkVar.zza;
        if (zzcwVar.zzo()) {
            return null;
        }
        if (true == zzcwVar3.zzo()) {
            zzcwVar2 = zzcwVar;
        } else {
            zzcwVar2 = zzcwVar3;
        }
        try {
            zzl = zzcwVar2.zzl(zzcvVar, zzctVar, zzkkVar.zzb, zzkkVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzcwVar.equals(zzcwVar2)) {
            return zzl;
        }
        if (zzcwVar.zza(zzl.first) != -1) {
            if (zzcwVar2.zzn(zzl.first, zzctVar).zzg && zzcwVar2.zze(zzctVar.zzd, zzcvVar, 0L).zzp == zzcwVar2.zza(zzl.first)) {
                return zzcwVar.zzl(zzcvVar, zzctVar, zzcwVar.zzn(zzl.first, zzctVar).zzd, zzkkVar.zzc);
            }
            return zzl;
        }
        Object zze = zze(zzcvVar, zzctVar, i10, z11, zzl.first, zzcwVar2, zzcwVar);
        if (zze != null) {
            return zzcwVar.zzl(zzcvVar, zzctVar, zzcwVar.zzn(zze, zzctVar).zzd, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzlg zzz(com.google.android.gms.internal.ads.zzts r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zzz(com.google.android.gms.internal.ads.zzts, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzlg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:413:0x0802, code lost:
    
        if (zzaf() != false) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x08a3, code lost:
    
        if (r7 == false) goto L450;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:294:0x061b A[Catch: RuntimeException -> 0x0a38, IOException -> 0x0a63, zzsu -> 0x0a6b, zzgj -> 0x0a73, zzcd -> 0x0a7b, zzqr -> 0x0a92, zzil -> 0x0a9c, TryCatch #9 {zzcd -> 0x0a7b, zzgj -> 0x0a73, zzil -> 0x0a9c, zzqr -> 0x0a92, zzsu -> 0x0a6b, IOException -> 0x0a63, RuntimeException -> 0x0a38, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00c7, B:36:0x00d6, B:37:0x00da, B:38:0x00eb, B:40:0x00fa, B:41:0x0116, B:42:0x0129, B:43:0x0132, B:45:0x0144, B:46:0x0150, B:47:0x0160, B:49:0x016c, B:52:0x0177, B:53:0x017e, B:54:0x018b, B:58:0x0192, B:60:0x019a, B:62:0x019e, B:64:0x01a4, B:66:0x01ac, B:68:0x01b4, B:69:0x01b7, B:71:0x01bc, B:78:0x01c9, B:79:0x01ca, B:83:0x01d1, B:85:0x01df, B:86:0x01e2, B:87:0x01e7, B:89:0x01f7, B:90:0x01fa, B:91:0x01ff, B:92:0x0204, B:94:0x0210, B:95:0x021c, B:97:0x0228, B:99:0x0254, B:100:0x0274, B:101:0x0279, B:102:0x027d, B:104:0x0282, B:105:0x0293, B:107:0x029f, B:108:0x02a2, B:115:0x02ad, B:116:0x02ae, B:117:0x02b3, B:118:0x02bb, B:119:0x02cd, B:121:0x02f4, B:187:0x040b, B:171:0x03d8, B:170:0x03d4, B:196:0x041c, B:197:0x0429, B:122:0x0316, B:126:0x0329, B:128:0x0339, B:130:0x0350, B:132:0x035a, B:198:0x042a, B:200:0x043e, B:203:0x0448, B:205:0x0457, B:207:0x0463, B:209:0x0492, B:210:0x0497, B:211:0x049b, B:213:0x049f, B:215:0x04ac, B:284:0x05f4, B:286:0x05fc, B:288:0x0604, B:291:0x0609, B:292:0x0615, B:294:0x061b, B:296:0x0623, B:299:0x0633, B:301:0x0639, B:302:0x0653, B:304:0x0659, B:306:0x065e, B:308:0x0663, B:310:0x0667, B:312:0x066d, B:314:0x0671, B:316:0x0679, B:318:0x067f, B:320:0x0689, B:323:0x068f, B:324:0x0692, B:326:0x069b, B:328:0x06ad, B:330:0x06b6, B:332:0x06be, B:337:0x06c8, B:338:0x06f4, B:340:0x06fa, B:342:0x0700, B:343:0x0707, B:218:0x04bb, B:220:0x04c1, B:223:0x04c7, B:226:0x04d2, B:228:0x04d7, B:231:0x04e5, B:233:0x04eb, B:234:0x04f3, B:235:0x04f6, B:237:0x04fe, B:239:0x050c, B:241:0x0548, B:243:0x0552, B:246:0x055d, B:248:0x0565, B:249:0x0568, B:251:0x056c, B:253:0x0572, B:255:0x057e, B:257:0x0588, B:259:0x0599, B:261:0x059f, B:262:0x05aa, B:263:0x05af, B:265:0x05ba, B:268:0x05bf, B:270:0x05c5, B:272:0x05cd, B:274:0x05d3, B:276:0x05d9, B:280:0x05e7, B:282:0x05ee, B:283:0x05f1, B:214:0x04a9, B:346:0x0713, B:350:0x071e, B:352:0x0728, B:353:0x072d, B:355:0x073b, B:356:0x0753, B:358:0x0759, B:360:0x0761, B:362:0x0768, B:366:0x0771, B:371:0x0780, B:377:0x078d, B:379:0x0793, B:389:0x07a6, B:391:0x07ab, B:393:0x07b7, B:395:0x07bd, B:399:0x07ca, B:401:0x07d2, B:403:0x07d6, B:404:0x07e1, B:406:0x07e7, B:460:0x08d7, B:463:0x08df, B:465:0x08e4, B:467:0x08ec, B:469:0x08fa, B:470:0x0901, B:471:0x0905, B:473:0x090b, B:475:0x0914, B:477:0x091a, B:479:0x0925, B:486:0x0949, B:488:0x094f, B:492:0x0958, B:494:0x095c, B:499:0x0965, B:501:0x096b, B:503:0x09cb, B:505:0x09d0, B:514:0x09e1, B:516:0x09e5, B:517:0x09ed, B:518:0x09f4, B:480:0x092c, B:483:0x093a, B:484:0x0941, B:485:0x0942, B:407:0x07f0, B:442:0x0892, B:444:0x0898, B:446:0x089c, B:450:0x08a5, B:452:0x08b3, B:454:0x08bb, B:456:0x08c5, B:457:0x08ca, B:458:0x08cf, B:459:0x08d4, B:410:0x07fa, B:412:0x07fe, B:439:0x0882, B:441:0x088e, B:416:0x0809, B:418:0x080d, B:420:0x0821, B:422:0x082f, B:424:0x083b, B:428:0x0844, B:430:0x084e, B:436:0x0859, B:392:0x07b0, B:519:0x09f9, B:523:0x0a00, B:524:0x0a08, B:528:0x0a26), top: B:598:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x068f A[Catch: RuntimeException -> 0x0a38, IOException -> 0x0a63, zzsu -> 0x0a6b, zzgj -> 0x0a73, zzcd -> 0x0a7b, zzqr -> 0x0a92, zzil -> 0x0a9c, TryCatch #9 {zzcd -> 0x0a7b, zzgj -> 0x0a73, zzil -> 0x0a9c, zzqr -> 0x0a92, zzsu -> 0x0a6b, IOException -> 0x0a63, RuntimeException -> 0x0a38, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00c7, B:36:0x00d6, B:37:0x00da, B:38:0x00eb, B:40:0x00fa, B:41:0x0116, B:42:0x0129, B:43:0x0132, B:45:0x0144, B:46:0x0150, B:47:0x0160, B:49:0x016c, B:52:0x0177, B:53:0x017e, B:54:0x018b, B:58:0x0192, B:60:0x019a, B:62:0x019e, B:64:0x01a4, B:66:0x01ac, B:68:0x01b4, B:69:0x01b7, B:71:0x01bc, B:78:0x01c9, B:79:0x01ca, B:83:0x01d1, B:85:0x01df, B:86:0x01e2, B:87:0x01e7, B:89:0x01f7, B:90:0x01fa, B:91:0x01ff, B:92:0x0204, B:94:0x0210, B:95:0x021c, B:97:0x0228, B:99:0x0254, B:100:0x0274, B:101:0x0279, B:102:0x027d, B:104:0x0282, B:105:0x0293, B:107:0x029f, B:108:0x02a2, B:115:0x02ad, B:116:0x02ae, B:117:0x02b3, B:118:0x02bb, B:119:0x02cd, B:121:0x02f4, B:187:0x040b, B:171:0x03d8, B:170:0x03d4, B:196:0x041c, B:197:0x0429, B:122:0x0316, B:126:0x0329, B:128:0x0339, B:130:0x0350, B:132:0x035a, B:198:0x042a, B:200:0x043e, B:203:0x0448, B:205:0x0457, B:207:0x0463, B:209:0x0492, B:210:0x0497, B:211:0x049b, B:213:0x049f, B:215:0x04ac, B:284:0x05f4, B:286:0x05fc, B:288:0x0604, B:291:0x0609, B:292:0x0615, B:294:0x061b, B:296:0x0623, B:299:0x0633, B:301:0x0639, B:302:0x0653, B:304:0x0659, B:306:0x065e, B:308:0x0663, B:310:0x0667, B:312:0x066d, B:314:0x0671, B:316:0x0679, B:318:0x067f, B:320:0x0689, B:323:0x068f, B:324:0x0692, B:326:0x069b, B:328:0x06ad, B:330:0x06b6, B:332:0x06be, B:337:0x06c8, B:338:0x06f4, B:340:0x06fa, B:342:0x0700, B:343:0x0707, B:218:0x04bb, B:220:0x04c1, B:223:0x04c7, B:226:0x04d2, B:228:0x04d7, B:231:0x04e5, B:233:0x04eb, B:234:0x04f3, B:235:0x04f6, B:237:0x04fe, B:239:0x050c, B:241:0x0548, B:243:0x0552, B:246:0x055d, B:248:0x0565, B:249:0x0568, B:251:0x056c, B:253:0x0572, B:255:0x057e, B:257:0x0588, B:259:0x0599, B:261:0x059f, B:262:0x05aa, B:263:0x05af, B:265:0x05ba, B:268:0x05bf, B:270:0x05c5, B:272:0x05cd, B:274:0x05d3, B:276:0x05d9, B:280:0x05e7, B:282:0x05ee, B:283:0x05f1, B:214:0x04a9, B:346:0x0713, B:350:0x071e, B:352:0x0728, B:353:0x072d, B:355:0x073b, B:356:0x0753, B:358:0x0759, B:360:0x0761, B:362:0x0768, B:366:0x0771, B:371:0x0780, B:377:0x078d, B:379:0x0793, B:389:0x07a6, B:391:0x07ab, B:393:0x07b7, B:395:0x07bd, B:399:0x07ca, B:401:0x07d2, B:403:0x07d6, B:404:0x07e1, B:406:0x07e7, B:460:0x08d7, B:463:0x08df, B:465:0x08e4, B:467:0x08ec, B:469:0x08fa, B:470:0x0901, B:471:0x0905, B:473:0x090b, B:475:0x0914, B:477:0x091a, B:479:0x0925, B:486:0x0949, B:488:0x094f, B:492:0x0958, B:494:0x095c, B:499:0x0965, B:501:0x096b, B:503:0x09cb, B:505:0x09d0, B:514:0x09e1, B:516:0x09e5, B:517:0x09ed, B:518:0x09f4, B:480:0x092c, B:483:0x093a, B:484:0x0941, B:485:0x0942, B:407:0x07f0, B:442:0x0892, B:444:0x0898, B:446:0x089c, B:450:0x08a5, B:452:0x08b3, B:454:0x08bb, B:456:0x08c5, B:457:0x08ca, B:458:0x08cf, B:459:0x08d4, B:410:0x07fa, B:412:0x07fe, B:439:0x0882, B:441:0x088e, B:416:0x0809, B:418:0x080d, B:420:0x0821, B:422:0x082f, B:424:0x083b, B:428:0x0844, B:430:0x084e, B:436:0x0859, B:392:0x07b0, B:519:0x09f9, B:523:0x0a00, B:524:0x0a08, B:528:0x0a26), top: B:598:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06ad A[Catch: RuntimeException -> 0x0a38, IOException -> 0x0a63, zzsu -> 0x0a6b, zzgj -> 0x0a73, zzcd -> 0x0a7b, zzqr -> 0x0a92, zzil -> 0x0a9c, TryCatch #9 {zzcd -> 0x0a7b, zzgj -> 0x0a73, zzil -> 0x0a9c, zzqr -> 0x0a92, zzsu -> 0x0a6b, IOException -> 0x0a63, RuntimeException -> 0x0a38, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00c7, B:36:0x00d6, B:37:0x00da, B:38:0x00eb, B:40:0x00fa, B:41:0x0116, B:42:0x0129, B:43:0x0132, B:45:0x0144, B:46:0x0150, B:47:0x0160, B:49:0x016c, B:52:0x0177, B:53:0x017e, B:54:0x018b, B:58:0x0192, B:60:0x019a, B:62:0x019e, B:64:0x01a4, B:66:0x01ac, B:68:0x01b4, B:69:0x01b7, B:71:0x01bc, B:78:0x01c9, B:79:0x01ca, B:83:0x01d1, B:85:0x01df, B:86:0x01e2, B:87:0x01e7, B:89:0x01f7, B:90:0x01fa, B:91:0x01ff, B:92:0x0204, B:94:0x0210, B:95:0x021c, B:97:0x0228, B:99:0x0254, B:100:0x0274, B:101:0x0279, B:102:0x027d, B:104:0x0282, B:105:0x0293, B:107:0x029f, B:108:0x02a2, B:115:0x02ad, B:116:0x02ae, B:117:0x02b3, B:118:0x02bb, B:119:0x02cd, B:121:0x02f4, B:187:0x040b, B:171:0x03d8, B:170:0x03d4, B:196:0x041c, B:197:0x0429, B:122:0x0316, B:126:0x0329, B:128:0x0339, B:130:0x0350, B:132:0x035a, B:198:0x042a, B:200:0x043e, B:203:0x0448, B:205:0x0457, B:207:0x0463, B:209:0x0492, B:210:0x0497, B:211:0x049b, B:213:0x049f, B:215:0x04ac, B:284:0x05f4, B:286:0x05fc, B:288:0x0604, B:291:0x0609, B:292:0x0615, B:294:0x061b, B:296:0x0623, B:299:0x0633, B:301:0x0639, B:302:0x0653, B:304:0x0659, B:306:0x065e, B:308:0x0663, B:310:0x0667, B:312:0x066d, B:314:0x0671, B:316:0x0679, B:318:0x067f, B:320:0x0689, B:323:0x068f, B:324:0x0692, B:326:0x069b, B:328:0x06ad, B:330:0x06b6, B:332:0x06be, B:337:0x06c8, B:338:0x06f4, B:340:0x06fa, B:342:0x0700, B:343:0x0707, B:218:0x04bb, B:220:0x04c1, B:223:0x04c7, B:226:0x04d2, B:228:0x04d7, B:231:0x04e5, B:233:0x04eb, B:234:0x04f3, B:235:0x04f6, B:237:0x04fe, B:239:0x050c, B:241:0x0548, B:243:0x0552, B:246:0x055d, B:248:0x0565, B:249:0x0568, B:251:0x056c, B:253:0x0572, B:255:0x057e, B:257:0x0588, B:259:0x0599, B:261:0x059f, B:262:0x05aa, B:263:0x05af, B:265:0x05ba, B:268:0x05bf, B:270:0x05c5, B:272:0x05cd, B:274:0x05d3, B:276:0x05d9, B:280:0x05e7, B:282:0x05ee, B:283:0x05f1, B:214:0x04a9, B:346:0x0713, B:350:0x071e, B:352:0x0728, B:353:0x072d, B:355:0x073b, B:356:0x0753, B:358:0x0759, B:360:0x0761, B:362:0x0768, B:366:0x0771, B:371:0x0780, B:377:0x078d, B:379:0x0793, B:389:0x07a6, B:391:0x07ab, B:393:0x07b7, B:395:0x07bd, B:399:0x07ca, B:401:0x07d2, B:403:0x07d6, B:404:0x07e1, B:406:0x07e7, B:460:0x08d7, B:463:0x08df, B:465:0x08e4, B:467:0x08ec, B:469:0x08fa, B:470:0x0901, B:471:0x0905, B:473:0x090b, B:475:0x0914, B:477:0x091a, B:479:0x0925, B:486:0x0949, B:488:0x094f, B:492:0x0958, B:494:0x095c, B:499:0x0965, B:501:0x096b, B:503:0x09cb, B:505:0x09d0, B:514:0x09e1, B:516:0x09e5, B:517:0x09ed, B:518:0x09f4, B:480:0x092c, B:483:0x093a, B:484:0x0941, B:485:0x0942, B:407:0x07f0, B:442:0x0892, B:444:0x0898, B:446:0x089c, B:450:0x08a5, B:452:0x08b3, B:454:0x08bb, B:456:0x08c5, B:457:0x08ca, B:458:0x08cf, B:459:0x08d4, B:410:0x07fa, B:412:0x07fe, B:439:0x0882, B:441:0x088e, B:416:0x0809, B:418:0x080d, B:420:0x0821, B:422:0x082f, B:424:0x083b, B:428:0x0844, B:430:0x084e, B:436:0x0859, B:392:0x07b0, B:519:0x09f9, B:523:0x0a00, B:524:0x0a08, B:528:0x0a26), top: B:598:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06fa A[Catch: RuntimeException -> 0x0a38, IOException -> 0x0a63, zzsu -> 0x0a6b, zzgj -> 0x0a73, zzcd -> 0x0a7b, zzqr -> 0x0a92, zzil -> 0x0a9c, TryCatch #9 {zzcd -> 0x0a7b, zzgj -> 0x0a73, zzil -> 0x0a9c, zzqr -> 0x0a92, zzsu -> 0x0a6b, IOException -> 0x0a63, RuntimeException -> 0x0a38, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00c7, B:36:0x00d6, B:37:0x00da, B:38:0x00eb, B:40:0x00fa, B:41:0x0116, B:42:0x0129, B:43:0x0132, B:45:0x0144, B:46:0x0150, B:47:0x0160, B:49:0x016c, B:52:0x0177, B:53:0x017e, B:54:0x018b, B:58:0x0192, B:60:0x019a, B:62:0x019e, B:64:0x01a4, B:66:0x01ac, B:68:0x01b4, B:69:0x01b7, B:71:0x01bc, B:78:0x01c9, B:79:0x01ca, B:83:0x01d1, B:85:0x01df, B:86:0x01e2, B:87:0x01e7, B:89:0x01f7, B:90:0x01fa, B:91:0x01ff, B:92:0x0204, B:94:0x0210, B:95:0x021c, B:97:0x0228, B:99:0x0254, B:100:0x0274, B:101:0x0279, B:102:0x027d, B:104:0x0282, B:105:0x0293, B:107:0x029f, B:108:0x02a2, B:115:0x02ad, B:116:0x02ae, B:117:0x02b3, B:118:0x02bb, B:119:0x02cd, B:121:0x02f4, B:187:0x040b, B:171:0x03d8, B:170:0x03d4, B:196:0x041c, B:197:0x0429, B:122:0x0316, B:126:0x0329, B:128:0x0339, B:130:0x0350, B:132:0x035a, B:198:0x042a, B:200:0x043e, B:203:0x0448, B:205:0x0457, B:207:0x0463, B:209:0x0492, B:210:0x0497, B:211:0x049b, B:213:0x049f, B:215:0x04ac, B:284:0x05f4, B:286:0x05fc, B:288:0x0604, B:291:0x0609, B:292:0x0615, B:294:0x061b, B:296:0x0623, B:299:0x0633, B:301:0x0639, B:302:0x0653, B:304:0x0659, B:306:0x065e, B:308:0x0663, B:310:0x0667, B:312:0x066d, B:314:0x0671, B:316:0x0679, B:318:0x067f, B:320:0x0689, B:323:0x068f, B:324:0x0692, B:326:0x069b, B:328:0x06ad, B:330:0x06b6, B:332:0x06be, B:337:0x06c8, B:338:0x06f4, B:340:0x06fa, B:342:0x0700, B:343:0x0707, B:218:0x04bb, B:220:0x04c1, B:223:0x04c7, B:226:0x04d2, B:228:0x04d7, B:231:0x04e5, B:233:0x04eb, B:234:0x04f3, B:235:0x04f6, B:237:0x04fe, B:239:0x050c, B:241:0x0548, B:243:0x0552, B:246:0x055d, B:248:0x0565, B:249:0x0568, B:251:0x056c, B:253:0x0572, B:255:0x057e, B:257:0x0588, B:259:0x0599, B:261:0x059f, B:262:0x05aa, B:263:0x05af, B:265:0x05ba, B:268:0x05bf, B:270:0x05c5, B:272:0x05cd, B:274:0x05d3, B:276:0x05d9, B:280:0x05e7, B:282:0x05ee, B:283:0x05f1, B:214:0x04a9, B:346:0x0713, B:350:0x071e, B:352:0x0728, B:353:0x072d, B:355:0x073b, B:356:0x0753, B:358:0x0759, B:360:0x0761, B:362:0x0768, B:366:0x0771, B:371:0x0780, B:377:0x078d, B:379:0x0793, B:389:0x07a6, B:391:0x07ab, B:393:0x07b7, B:395:0x07bd, B:399:0x07ca, B:401:0x07d2, B:403:0x07d6, B:404:0x07e1, B:406:0x07e7, B:460:0x08d7, B:463:0x08df, B:465:0x08e4, B:467:0x08ec, B:469:0x08fa, B:470:0x0901, B:471:0x0905, B:473:0x090b, B:475:0x0914, B:477:0x091a, B:479:0x0925, B:486:0x0949, B:488:0x094f, B:492:0x0958, B:494:0x095c, B:499:0x0965, B:501:0x096b, B:503:0x09cb, B:505:0x09d0, B:514:0x09e1, B:516:0x09e5, B:517:0x09ed, B:518:0x09f4, B:480:0x092c, B:483:0x093a, B:484:0x0941, B:485:0x0942, B:407:0x07f0, B:442:0x0892, B:444:0x0898, B:446:0x089c, B:450:0x08a5, B:452:0x08b3, B:454:0x08bb, B:456:0x08c5, B:457:0x08ca, B:458:0x08cf, B:459:0x08d4, B:410:0x07fa, B:412:0x07fe, B:439:0x0882, B:441:0x088e, B:416:0x0809, B:418:0x080d, B:420:0x0821, B:422:0x082f, B:424:0x083b, B:428:0x0844, B:430:0x084e, B:436:0x0859, B:392:0x07b0, B:519:0x09f9, B:523:0x0a00, B:524:0x0a08, B:528:0x0a26), top: B:598:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07a6 A[Catch: RuntimeException -> 0x0a38, IOException -> 0x0a63, zzsu -> 0x0a6b, zzgj -> 0x0a73, zzcd -> 0x0a7b, zzqr -> 0x0a92, zzil -> 0x0a9c, TryCatch #9 {zzcd -> 0x0a7b, zzgj -> 0x0a73, zzil -> 0x0a9c, zzqr -> 0x0a92, zzsu -> 0x0a6b, IOException -> 0x0a63, RuntimeException -> 0x0a38, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00c7, B:36:0x00d6, B:37:0x00da, B:38:0x00eb, B:40:0x00fa, B:41:0x0116, B:42:0x0129, B:43:0x0132, B:45:0x0144, B:46:0x0150, B:47:0x0160, B:49:0x016c, B:52:0x0177, B:53:0x017e, B:54:0x018b, B:58:0x0192, B:60:0x019a, B:62:0x019e, B:64:0x01a4, B:66:0x01ac, B:68:0x01b4, B:69:0x01b7, B:71:0x01bc, B:78:0x01c9, B:79:0x01ca, B:83:0x01d1, B:85:0x01df, B:86:0x01e2, B:87:0x01e7, B:89:0x01f7, B:90:0x01fa, B:91:0x01ff, B:92:0x0204, B:94:0x0210, B:95:0x021c, B:97:0x0228, B:99:0x0254, B:100:0x0274, B:101:0x0279, B:102:0x027d, B:104:0x0282, B:105:0x0293, B:107:0x029f, B:108:0x02a2, B:115:0x02ad, B:116:0x02ae, B:117:0x02b3, B:118:0x02bb, B:119:0x02cd, B:121:0x02f4, B:187:0x040b, B:171:0x03d8, B:170:0x03d4, B:196:0x041c, B:197:0x0429, B:122:0x0316, B:126:0x0329, B:128:0x0339, B:130:0x0350, B:132:0x035a, B:198:0x042a, B:200:0x043e, B:203:0x0448, B:205:0x0457, B:207:0x0463, B:209:0x0492, B:210:0x0497, B:211:0x049b, B:213:0x049f, B:215:0x04ac, B:284:0x05f4, B:286:0x05fc, B:288:0x0604, B:291:0x0609, B:292:0x0615, B:294:0x061b, B:296:0x0623, B:299:0x0633, B:301:0x0639, B:302:0x0653, B:304:0x0659, B:306:0x065e, B:308:0x0663, B:310:0x0667, B:312:0x066d, B:314:0x0671, B:316:0x0679, B:318:0x067f, B:320:0x0689, B:323:0x068f, B:324:0x0692, B:326:0x069b, B:328:0x06ad, B:330:0x06b6, B:332:0x06be, B:337:0x06c8, B:338:0x06f4, B:340:0x06fa, B:342:0x0700, B:343:0x0707, B:218:0x04bb, B:220:0x04c1, B:223:0x04c7, B:226:0x04d2, B:228:0x04d7, B:231:0x04e5, B:233:0x04eb, B:234:0x04f3, B:235:0x04f6, B:237:0x04fe, B:239:0x050c, B:241:0x0548, B:243:0x0552, B:246:0x055d, B:248:0x0565, B:249:0x0568, B:251:0x056c, B:253:0x0572, B:255:0x057e, B:257:0x0588, B:259:0x0599, B:261:0x059f, B:262:0x05aa, B:263:0x05af, B:265:0x05ba, B:268:0x05bf, B:270:0x05c5, B:272:0x05cd, B:274:0x05d3, B:276:0x05d9, B:280:0x05e7, B:282:0x05ee, B:283:0x05f1, B:214:0x04a9, B:346:0x0713, B:350:0x071e, B:352:0x0728, B:353:0x072d, B:355:0x073b, B:356:0x0753, B:358:0x0759, B:360:0x0761, B:362:0x0768, B:366:0x0771, B:371:0x0780, B:377:0x078d, B:379:0x0793, B:389:0x07a6, B:391:0x07ab, B:393:0x07b7, B:395:0x07bd, B:399:0x07ca, B:401:0x07d2, B:403:0x07d6, B:404:0x07e1, B:406:0x07e7, B:460:0x08d7, B:463:0x08df, B:465:0x08e4, B:467:0x08ec, B:469:0x08fa, B:470:0x0901, B:471:0x0905, B:473:0x090b, B:475:0x0914, B:477:0x091a, B:479:0x0925, B:486:0x0949, B:488:0x094f, B:492:0x0958, B:494:0x095c, B:499:0x0965, B:501:0x096b, B:503:0x09cb, B:505:0x09d0, B:514:0x09e1, B:516:0x09e5, B:517:0x09ed, B:518:0x09f4, B:480:0x092c, B:483:0x093a, B:484:0x0941, B:485:0x0942, B:407:0x07f0, B:442:0x0892, B:444:0x0898, B:446:0x089c, B:450:0x08a5, B:452:0x08b3, B:454:0x08bb, B:456:0x08c5, B:457:0x08ca, B:458:0x08cf, B:459:0x08d4, B:410:0x07fa, B:412:0x07fe, B:439:0x0882, B:441:0x088e, B:416:0x0809, B:418:0x080d, B:420:0x0821, B:422:0x082f, B:424:0x083b, B:428:0x0844, B:430:0x084e, B:436:0x0859, B:392:0x07b0, B:519:0x09f9, B:523:0x0a00, B:524:0x0a08, B:528:0x0a26), top: B:598:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x094f A[Catch: RuntimeException -> 0x0a38, IOException -> 0x0a63, zzsu -> 0x0a6b, zzgj -> 0x0a73, zzcd -> 0x0a7b, zzqr -> 0x0a92, zzil -> 0x0a9c, TryCatch #9 {zzcd -> 0x0a7b, zzgj -> 0x0a73, zzil -> 0x0a9c, zzqr -> 0x0a92, zzsu -> 0x0a6b, IOException -> 0x0a63, RuntimeException -> 0x0a38, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00c7, B:36:0x00d6, B:37:0x00da, B:38:0x00eb, B:40:0x00fa, B:41:0x0116, B:42:0x0129, B:43:0x0132, B:45:0x0144, B:46:0x0150, B:47:0x0160, B:49:0x016c, B:52:0x0177, B:53:0x017e, B:54:0x018b, B:58:0x0192, B:60:0x019a, B:62:0x019e, B:64:0x01a4, B:66:0x01ac, B:68:0x01b4, B:69:0x01b7, B:71:0x01bc, B:78:0x01c9, B:79:0x01ca, B:83:0x01d1, B:85:0x01df, B:86:0x01e2, B:87:0x01e7, B:89:0x01f7, B:90:0x01fa, B:91:0x01ff, B:92:0x0204, B:94:0x0210, B:95:0x021c, B:97:0x0228, B:99:0x0254, B:100:0x0274, B:101:0x0279, B:102:0x027d, B:104:0x0282, B:105:0x0293, B:107:0x029f, B:108:0x02a2, B:115:0x02ad, B:116:0x02ae, B:117:0x02b3, B:118:0x02bb, B:119:0x02cd, B:121:0x02f4, B:187:0x040b, B:171:0x03d8, B:170:0x03d4, B:196:0x041c, B:197:0x0429, B:122:0x0316, B:126:0x0329, B:128:0x0339, B:130:0x0350, B:132:0x035a, B:198:0x042a, B:200:0x043e, B:203:0x0448, B:205:0x0457, B:207:0x0463, B:209:0x0492, B:210:0x0497, B:211:0x049b, B:213:0x049f, B:215:0x04ac, B:284:0x05f4, B:286:0x05fc, B:288:0x0604, B:291:0x0609, B:292:0x0615, B:294:0x061b, B:296:0x0623, B:299:0x0633, B:301:0x0639, B:302:0x0653, B:304:0x0659, B:306:0x065e, B:308:0x0663, B:310:0x0667, B:312:0x066d, B:314:0x0671, B:316:0x0679, B:318:0x067f, B:320:0x0689, B:323:0x068f, B:324:0x0692, B:326:0x069b, B:328:0x06ad, B:330:0x06b6, B:332:0x06be, B:337:0x06c8, B:338:0x06f4, B:340:0x06fa, B:342:0x0700, B:343:0x0707, B:218:0x04bb, B:220:0x04c1, B:223:0x04c7, B:226:0x04d2, B:228:0x04d7, B:231:0x04e5, B:233:0x04eb, B:234:0x04f3, B:235:0x04f6, B:237:0x04fe, B:239:0x050c, B:241:0x0548, B:243:0x0552, B:246:0x055d, B:248:0x0565, B:249:0x0568, B:251:0x056c, B:253:0x0572, B:255:0x057e, B:257:0x0588, B:259:0x0599, B:261:0x059f, B:262:0x05aa, B:263:0x05af, B:265:0x05ba, B:268:0x05bf, B:270:0x05c5, B:272:0x05cd, B:274:0x05d3, B:276:0x05d9, B:280:0x05e7, B:282:0x05ee, B:283:0x05f1, B:214:0x04a9, B:346:0x0713, B:350:0x071e, B:352:0x0728, B:353:0x072d, B:355:0x073b, B:356:0x0753, B:358:0x0759, B:360:0x0761, B:362:0x0768, B:366:0x0771, B:371:0x0780, B:377:0x078d, B:379:0x0793, B:389:0x07a6, B:391:0x07ab, B:393:0x07b7, B:395:0x07bd, B:399:0x07ca, B:401:0x07d2, B:403:0x07d6, B:404:0x07e1, B:406:0x07e7, B:460:0x08d7, B:463:0x08df, B:465:0x08e4, B:467:0x08ec, B:469:0x08fa, B:470:0x0901, B:471:0x0905, B:473:0x090b, B:475:0x0914, B:477:0x091a, B:479:0x0925, B:486:0x0949, B:488:0x094f, B:492:0x0958, B:494:0x095c, B:499:0x0965, B:501:0x096b, B:503:0x09cb, B:505:0x09d0, B:514:0x09e1, B:516:0x09e5, B:517:0x09ed, B:518:0x09f4, B:480:0x092c, B:483:0x093a, B:484:0x0941, B:485:0x0942, B:407:0x07f0, B:442:0x0892, B:444:0x0898, B:446:0x089c, B:450:0x08a5, B:452:0x08b3, B:454:0x08bb, B:456:0x08c5, B:457:0x08ca, B:458:0x08cf, B:459:0x08d4, B:410:0x07fa, B:412:0x07fe, B:439:0x0882, B:441:0x088e, B:416:0x0809, B:418:0x080d, B:420:0x0821, B:422:0x082f, B:424:0x083b, B:428:0x0844, B:430:0x084e, B:436:0x0859, B:392:0x07b0, B:519:0x09f9, B:523:0x0a00, B:524:0x0a08, B:528:0x0a26), top: B:598:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x095c A[Catch: RuntimeException -> 0x0a38, IOException -> 0x0a63, zzsu -> 0x0a6b, zzgj -> 0x0a73, zzcd -> 0x0a7b, zzqr -> 0x0a92, zzil -> 0x0a9c, TryCatch #9 {zzcd -> 0x0a7b, zzgj -> 0x0a73, zzil -> 0x0a9c, zzqr -> 0x0a92, zzsu -> 0x0a6b, IOException -> 0x0a63, RuntimeException -> 0x0a38, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00c7, B:36:0x00d6, B:37:0x00da, B:38:0x00eb, B:40:0x00fa, B:41:0x0116, B:42:0x0129, B:43:0x0132, B:45:0x0144, B:46:0x0150, B:47:0x0160, B:49:0x016c, B:52:0x0177, B:53:0x017e, B:54:0x018b, B:58:0x0192, B:60:0x019a, B:62:0x019e, B:64:0x01a4, B:66:0x01ac, B:68:0x01b4, B:69:0x01b7, B:71:0x01bc, B:78:0x01c9, B:79:0x01ca, B:83:0x01d1, B:85:0x01df, B:86:0x01e2, B:87:0x01e7, B:89:0x01f7, B:90:0x01fa, B:91:0x01ff, B:92:0x0204, B:94:0x0210, B:95:0x021c, B:97:0x0228, B:99:0x0254, B:100:0x0274, B:101:0x0279, B:102:0x027d, B:104:0x0282, B:105:0x0293, B:107:0x029f, B:108:0x02a2, B:115:0x02ad, B:116:0x02ae, B:117:0x02b3, B:118:0x02bb, B:119:0x02cd, B:121:0x02f4, B:187:0x040b, B:171:0x03d8, B:170:0x03d4, B:196:0x041c, B:197:0x0429, B:122:0x0316, B:126:0x0329, B:128:0x0339, B:130:0x0350, B:132:0x035a, B:198:0x042a, B:200:0x043e, B:203:0x0448, B:205:0x0457, B:207:0x0463, B:209:0x0492, B:210:0x0497, B:211:0x049b, B:213:0x049f, B:215:0x04ac, B:284:0x05f4, B:286:0x05fc, B:288:0x0604, B:291:0x0609, B:292:0x0615, B:294:0x061b, B:296:0x0623, B:299:0x0633, B:301:0x0639, B:302:0x0653, B:304:0x0659, B:306:0x065e, B:308:0x0663, B:310:0x0667, B:312:0x066d, B:314:0x0671, B:316:0x0679, B:318:0x067f, B:320:0x0689, B:323:0x068f, B:324:0x0692, B:326:0x069b, B:328:0x06ad, B:330:0x06b6, B:332:0x06be, B:337:0x06c8, B:338:0x06f4, B:340:0x06fa, B:342:0x0700, B:343:0x0707, B:218:0x04bb, B:220:0x04c1, B:223:0x04c7, B:226:0x04d2, B:228:0x04d7, B:231:0x04e5, B:233:0x04eb, B:234:0x04f3, B:235:0x04f6, B:237:0x04fe, B:239:0x050c, B:241:0x0548, B:243:0x0552, B:246:0x055d, B:248:0x0565, B:249:0x0568, B:251:0x056c, B:253:0x0572, B:255:0x057e, B:257:0x0588, B:259:0x0599, B:261:0x059f, B:262:0x05aa, B:263:0x05af, B:265:0x05ba, B:268:0x05bf, B:270:0x05c5, B:272:0x05cd, B:274:0x05d3, B:276:0x05d9, B:280:0x05e7, B:282:0x05ee, B:283:0x05f1, B:214:0x04a9, B:346:0x0713, B:350:0x071e, B:352:0x0728, B:353:0x072d, B:355:0x073b, B:356:0x0753, B:358:0x0759, B:360:0x0761, B:362:0x0768, B:366:0x0771, B:371:0x0780, B:377:0x078d, B:379:0x0793, B:389:0x07a6, B:391:0x07ab, B:393:0x07b7, B:395:0x07bd, B:399:0x07ca, B:401:0x07d2, B:403:0x07d6, B:404:0x07e1, B:406:0x07e7, B:460:0x08d7, B:463:0x08df, B:465:0x08e4, B:467:0x08ec, B:469:0x08fa, B:470:0x0901, B:471:0x0905, B:473:0x090b, B:475:0x0914, B:477:0x091a, B:479:0x0925, B:486:0x0949, B:488:0x094f, B:492:0x0958, B:494:0x095c, B:499:0x0965, B:501:0x096b, B:503:0x09cb, B:505:0x09d0, B:514:0x09e1, B:516:0x09e5, B:517:0x09ed, B:518:0x09f4, B:480:0x092c, B:483:0x093a, B:484:0x0941, B:485:0x0942, B:407:0x07f0, B:442:0x0892, B:444:0x0898, B:446:0x089c, B:450:0x08a5, B:452:0x08b3, B:454:0x08bb, B:456:0x08c5, B:457:0x08ca, B:458:0x08cf, B:459:0x08d4, B:410:0x07fa, B:412:0x07fe, B:439:0x0882, B:441:0x088e, B:416:0x0809, B:418:0x080d, B:420:0x0821, B:422:0x082f, B:424:0x083b, B:428:0x0844, B:430:0x084e, B:436:0x0859, B:392:0x07b0, B:519:0x09f9, B:523:0x0a00, B:524:0x0a08, B:528:0x0a26), top: B:598:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x096b A[Catch: RuntimeException -> 0x0a38, IOException -> 0x0a63, zzsu -> 0x0a6b, zzgj -> 0x0a73, zzcd -> 0x0a7b, zzqr -> 0x0a92, zzil -> 0x0a9c, TryCatch #9 {zzcd -> 0x0a7b, zzgj -> 0x0a73, zzil -> 0x0a9c, zzqr -> 0x0a92, zzsu -> 0x0a6b, IOException -> 0x0a63, RuntimeException -> 0x0a38, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00c7, B:36:0x00d6, B:37:0x00da, B:38:0x00eb, B:40:0x00fa, B:41:0x0116, B:42:0x0129, B:43:0x0132, B:45:0x0144, B:46:0x0150, B:47:0x0160, B:49:0x016c, B:52:0x0177, B:53:0x017e, B:54:0x018b, B:58:0x0192, B:60:0x019a, B:62:0x019e, B:64:0x01a4, B:66:0x01ac, B:68:0x01b4, B:69:0x01b7, B:71:0x01bc, B:78:0x01c9, B:79:0x01ca, B:83:0x01d1, B:85:0x01df, B:86:0x01e2, B:87:0x01e7, B:89:0x01f7, B:90:0x01fa, B:91:0x01ff, B:92:0x0204, B:94:0x0210, B:95:0x021c, B:97:0x0228, B:99:0x0254, B:100:0x0274, B:101:0x0279, B:102:0x027d, B:104:0x0282, B:105:0x0293, B:107:0x029f, B:108:0x02a2, B:115:0x02ad, B:116:0x02ae, B:117:0x02b3, B:118:0x02bb, B:119:0x02cd, B:121:0x02f4, B:187:0x040b, B:171:0x03d8, B:170:0x03d4, B:196:0x041c, B:197:0x0429, B:122:0x0316, B:126:0x0329, B:128:0x0339, B:130:0x0350, B:132:0x035a, B:198:0x042a, B:200:0x043e, B:203:0x0448, B:205:0x0457, B:207:0x0463, B:209:0x0492, B:210:0x0497, B:211:0x049b, B:213:0x049f, B:215:0x04ac, B:284:0x05f4, B:286:0x05fc, B:288:0x0604, B:291:0x0609, B:292:0x0615, B:294:0x061b, B:296:0x0623, B:299:0x0633, B:301:0x0639, B:302:0x0653, B:304:0x0659, B:306:0x065e, B:308:0x0663, B:310:0x0667, B:312:0x066d, B:314:0x0671, B:316:0x0679, B:318:0x067f, B:320:0x0689, B:323:0x068f, B:324:0x0692, B:326:0x069b, B:328:0x06ad, B:330:0x06b6, B:332:0x06be, B:337:0x06c8, B:338:0x06f4, B:340:0x06fa, B:342:0x0700, B:343:0x0707, B:218:0x04bb, B:220:0x04c1, B:223:0x04c7, B:226:0x04d2, B:228:0x04d7, B:231:0x04e5, B:233:0x04eb, B:234:0x04f3, B:235:0x04f6, B:237:0x04fe, B:239:0x050c, B:241:0x0548, B:243:0x0552, B:246:0x055d, B:248:0x0565, B:249:0x0568, B:251:0x056c, B:253:0x0572, B:255:0x057e, B:257:0x0588, B:259:0x0599, B:261:0x059f, B:262:0x05aa, B:263:0x05af, B:265:0x05ba, B:268:0x05bf, B:270:0x05c5, B:272:0x05cd, B:274:0x05d3, B:276:0x05d9, B:280:0x05e7, B:282:0x05ee, B:283:0x05f1, B:214:0x04a9, B:346:0x0713, B:350:0x071e, B:352:0x0728, B:353:0x072d, B:355:0x073b, B:356:0x0753, B:358:0x0759, B:360:0x0761, B:362:0x0768, B:366:0x0771, B:371:0x0780, B:377:0x078d, B:379:0x0793, B:389:0x07a6, B:391:0x07ab, B:393:0x07b7, B:395:0x07bd, B:399:0x07ca, B:401:0x07d2, B:403:0x07d6, B:404:0x07e1, B:406:0x07e7, B:460:0x08d7, B:463:0x08df, B:465:0x08e4, B:467:0x08ec, B:469:0x08fa, B:470:0x0901, B:471:0x0905, B:473:0x090b, B:475:0x0914, B:477:0x091a, B:479:0x0925, B:486:0x0949, B:488:0x094f, B:492:0x0958, B:494:0x095c, B:499:0x0965, B:501:0x096b, B:503:0x09cb, B:505:0x09d0, B:514:0x09e1, B:516:0x09e5, B:517:0x09ed, B:518:0x09f4, B:480:0x092c, B:483:0x093a, B:484:0x0941, B:485:0x0942, B:407:0x07f0, B:442:0x0892, B:444:0x0898, B:446:0x089c, B:450:0x08a5, B:452:0x08b3, B:454:0x08bb, B:456:0x08c5, B:457:0x08ca, B:458:0x08cf, B:459:0x08d4, B:410:0x07fa, B:412:0x07fe, B:439:0x0882, B:441:0x088e, B:416:0x0809, B:418:0x080d, B:420:0x0821, B:422:0x082f, B:424:0x083b, B:428:0x0844, B:430:0x084e, B:436:0x0859, B:392:0x07b0, B:519:0x09f9, B:523:0x0a00, B:524:0x0a08, B:528:0x0a26), top: B:598:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x09d0 A[Catch: RuntimeException -> 0x0a38, IOException -> 0x0a63, zzsu -> 0x0a6b, zzgj -> 0x0a73, zzcd -> 0x0a7b, zzqr -> 0x0a92, zzil -> 0x0a9c, TryCatch #9 {zzcd -> 0x0a7b, zzgj -> 0x0a73, zzil -> 0x0a9c, zzqr -> 0x0a92, zzsu -> 0x0a6b, IOException -> 0x0a63, RuntimeException -> 0x0a38, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00c7, B:36:0x00d6, B:37:0x00da, B:38:0x00eb, B:40:0x00fa, B:41:0x0116, B:42:0x0129, B:43:0x0132, B:45:0x0144, B:46:0x0150, B:47:0x0160, B:49:0x016c, B:52:0x0177, B:53:0x017e, B:54:0x018b, B:58:0x0192, B:60:0x019a, B:62:0x019e, B:64:0x01a4, B:66:0x01ac, B:68:0x01b4, B:69:0x01b7, B:71:0x01bc, B:78:0x01c9, B:79:0x01ca, B:83:0x01d1, B:85:0x01df, B:86:0x01e2, B:87:0x01e7, B:89:0x01f7, B:90:0x01fa, B:91:0x01ff, B:92:0x0204, B:94:0x0210, B:95:0x021c, B:97:0x0228, B:99:0x0254, B:100:0x0274, B:101:0x0279, B:102:0x027d, B:104:0x0282, B:105:0x0293, B:107:0x029f, B:108:0x02a2, B:115:0x02ad, B:116:0x02ae, B:117:0x02b3, B:118:0x02bb, B:119:0x02cd, B:121:0x02f4, B:187:0x040b, B:171:0x03d8, B:170:0x03d4, B:196:0x041c, B:197:0x0429, B:122:0x0316, B:126:0x0329, B:128:0x0339, B:130:0x0350, B:132:0x035a, B:198:0x042a, B:200:0x043e, B:203:0x0448, B:205:0x0457, B:207:0x0463, B:209:0x0492, B:210:0x0497, B:211:0x049b, B:213:0x049f, B:215:0x04ac, B:284:0x05f4, B:286:0x05fc, B:288:0x0604, B:291:0x0609, B:292:0x0615, B:294:0x061b, B:296:0x0623, B:299:0x0633, B:301:0x0639, B:302:0x0653, B:304:0x0659, B:306:0x065e, B:308:0x0663, B:310:0x0667, B:312:0x066d, B:314:0x0671, B:316:0x0679, B:318:0x067f, B:320:0x0689, B:323:0x068f, B:324:0x0692, B:326:0x069b, B:328:0x06ad, B:330:0x06b6, B:332:0x06be, B:337:0x06c8, B:338:0x06f4, B:340:0x06fa, B:342:0x0700, B:343:0x0707, B:218:0x04bb, B:220:0x04c1, B:223:0x04c7, B:226:0x04d2, B:228:0x04d7, B:231:0x04e5, B:233:0x04eb, B:234:0x04f3, B:235:0x04f6, B:237:0x04fe, B:239:0x050c, B:241:0x0548, B:243:0x0552, B:246:0x055d, B:248:0x0565, B:249:0x0568, B:251:0x056c, B:253:0x0572, B:255:0x057e, B:257:0x0588, B:259:0x0599, B:261:0x059f, B:262:0x05aa, B:263:0x05af, B:265:0x05ba, B:268:0x05bf, B:270:0x05c5, B:272:0x05cd, B:274:0x05d3, B:276:0x05d9, B:280:0x05e7, B:282:0x05ee, B:283:0x05f1, B:214:0x04a9, B:346:0x0713, B:350:0x071e, B:352:0x0728, B:353:0x072d, B:355:0x073b, B:356:0x0753, B:358:0x0759, B:360:0x0761, B:362:0x0768, B:366:0x0771, B:371:0x0780, B:377:0x078d, B:379:0x0793, B:389:0x07a6, B:391:0x07ab, B:393:0x07b7, B:395:0x07bd, B:399:0x07ca, B:401:0x07d2, B:403:0x07d6, B:404:0x07e1, B:406:0x07e7, B:460:0x08d7, B:463:0x08df, B:465:0x08e4, B:467:0x08ec, B:469:0x08fa, B:470:0x0901, B:471:0x0905, B:473:0x090b, B:475:0x0914, B:477:0x091a, B:479:0x0925, B:486:0x0949, B:488:0x094f, B:492:0x0958, B:494:0x095c, B:499:0x0965, B:501:0x096b, B:503:0x09cb, B:505:0x09d0, B:514:0x09e1, B:516:0x09e5, B:517:0x09ed, B:518:0x09f4, B:480:0x092c, B:483:0x093a, B:484:0x0941, B:485:0x0942, B:407:0x07f0, B:442:0x0892, B:444:0x0898, B:446:0x089c, B:450:0x08a5, B:452:0x08b3, B:454:0x08bb, B:456:0x08c5, B:457:0x08ca, B:458:0x08cf, B:459:0x08d4, B:410:0x07fa, B:412:0x07fe, B:439:0x0882, B:441:0x088e, B:416:0x0809, B:418:0x080d, B:420:0x0821, B:422:0x082f, B:424:0x083b, B:428:0x0844, B:430:0x084e, B:436:0x0859, B:392:0x07b0, B:519:0x09f9, B:523:0x0a00, B:524:0x0a08, B:528:0x0a26), top: B:598:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0661 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.google.android.gms.internal.ads.zzxt, com.google.android.gms.internal.ads.zzhk] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r54) {
        /*
            Method dump skipped, instructions count: 2952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void zza(zzch zzchVar) {
        this.zzh.zzc(16, zzchVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final /* bridge */ /* synthetic */ void zzg(zzvl zzvlVar) {
        this.zzh.zzc(9, (zztq) zzvlVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztqVar) {
        this.zzh.zzc(8, zztqVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzcw zzcwVar, int i10, long j10) {
        this.zzh.zzc(3, new zzkk(zzcwVar, i10, j10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final synchronized void zzm(zzlj zzljVar) {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzljVar).zza();
            return;
        }
        zzes.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzljVar.zzh(false);
    }

    public final void zzn(boolean z10, int i10) {
        this.zzh.zzd(1, z10 ? 1 : 0, i10).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzac(new zzkc(this), this.zzs);
            return this.zzw;
        }
        return true;
    }

    public final void zzq(List list, int i10, long j10, zzvm zzvmVar) {
        this.zzh.zzc(17, new zzkg(list, zzvmVar, i10, j10, null)).zza();
    }
}
