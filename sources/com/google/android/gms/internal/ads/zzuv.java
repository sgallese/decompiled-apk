package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzuv implements zztq, zzabe, zzxz, zzye, zzvh {
    private static final Map zzb;
    private static final zzam zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzxy zzM;
    private final zzxu zzN;
    private final Uri zzd;
    private final zzgi zze;
    private final zzqz zzf;
    private final zzub zzg;
    private final zzqt zzh;
    private final zzur zzi;
    private final long zzj;
    private final zzul zzl;
    private zztp zzq;
    private zzaeb zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zzuu zzx;
    private zzaca zzy;
    private final zzyh zzk = new zzyh("ProgressiveMediaPeriod");
    private final zzeb zzm = new zzeb(zzdz.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzum
        @Override // java.lang.Runnable
        public final void run() {
            zzuv.this.zzT();
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzun
        @Override // java.lang.Runnable
        public final void run() {
            zzuv.this.zzD();
        }
    };
    private final Handler zzp = zzfk.zzu(null);
    private zzut[] zzt = new zzut[0];
    private zzvi[] zzs = new zzvi[0];
    private long zzH = -9223372036854775807L;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzak zzakVar = new zzak();
        zzakVar.zzH("icy");
        zzakVar.zzS("application/x-icy");
        zzc = zzakVar.zzY();
    }

    public zzuv(Uri uri, zzgi zzgiVar, zzul zzulVar, zzqz zzqzVar, zzqt zzqtVar, zzxy zzxyVar, zzub zzubVar, zzur zzurVar, zzxu zzxuVar, String str, int i10) {
        this.zzd = uri;
        this.zze = zzgiVar;
        this.zzf = zzqzVar;
        this.zzh = zzqtVar;
        this.zzM = zzxyVar;
        this.zzg = zzubVar;
        this.zzi = zzurVar;
        this.zzN = zzxuVar;
        this.zzj = i10;
        this.zzl = zzulVar;
    }

    private final int zzP() {
        int i10 = 0;
        for (zzvi zzviVar : this.zzs) {
            i10 += zzviVar.zzc();
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzQ(boolean z10) {
        int i10 = 0;
        long j10 = Long.MIN_VALUE;
        while (true) {
            zzvi[] zzviVarArr = this.zzs;
            if (i10 < zzviVarArr.length) {
                if (!z10) {
                    zzuu zzuuVar = this.zzx;
                    zzuuVar.getClass();
                    if (!zzuuVar.zzc[i10]) {
                        i10++;
                    }
                }
                j10 = Math.max(j10, zzviVarArr[i10].zzg());
                i10++;
            } else {
                return j10;
            }
        }
    }

    private final zzace zzR(zzut zzutVar) {
        int length = this.zzs.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zzutVar.equals(this.zzt[i10])) {
                return this.zzs[i10];
            }
        }
        zzvi zzviVar = new zzvi(this.zzN, this.zzf, this.zzh);
        zzviVar.zzu(this);
        int i11 = length + 1;
        zzut[] zzutVarArr = (zzut[]) Arrays.copyOf(this.zzt, i11);
        zzutVarArr[length] = zzutVar;
        int i12 = zzfk.zza;
        this.zzt = zzutVarArr;
        zzvi[] zzviVarArr = (zzvi[]) Arrays.copyOf(this.zzs, i11);
        zzviVarArr[length] = zzviVar;
        this.zzs = zzviVarArr;
        return zzviVar;
    }

    private final void zzS() {
        zzdy.zzf(this.zzv);
        this.zzx.getClass();
        this.zzy.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        boolean z10;
        zzbz zzc2;
        int i10;
        if (!this.zzL && !this.zzv && this.zzu && this.zzy != null) {
            for (zzvi zzviVar : this.zzs) {
                if (zzviVar.zzh() == null) {
                    return;
                }
            }
            this.zzm.zzc();
            int length = this.zzs.length;
            zzcy[] zzcyVarArr = new zzcy[length];
            boolean[] zArr = new boolean[length];
            for (int i11 = 0; i11 < length; i11++) {
                zzam zzh = this.zzs[i11].zzh();
                zzh.getClass();
                String str = zzh.zzm;
                boolean zzf = zzcc.zzf(str);
                if (!zzf && !zzcc.zzg(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zArr[i11] = z10;
                this.zzw = z10 | this.zzw;
                zzaeb zzaebVar = this.zzr;
                if (zzaebVar != null) {
                    if (zzf || this.zzt[i11].zzb) {
                        zzbz zzbzVar = zzh.zzk;
                        if (zzbzVar == null) {
                            zzc2 = new zzbz(-9223372036854775807L, zzaebVar);
                        } else {
                            zzc2 = zzbzVar.zzc(zzaebVar);
                        }
                        zzak zzb2 = zzh.zzb();
                        zzb2.zzM(zzc2);
                        zzh = zzb2.zzY();
                    }
                    if (zzf && zzh.zzg == -1 && zzh.zzh == -1 && (i10 = zzaebVar.zza) != -1) {
                        zzak zzb3 = zzh.zzb();
                        zzb3.zzv(i10);
                        zzh = zzb3.zzY();
                    }
                }
                zzcyVarArr[i11] = new zzcy(Integer.toString(i11), zzh.zzc(this.zzf.zza(zzh)));
            }
            this.zzx = new zzuu(new zzvs(zzcyVarArr), zArr);
            this.zzv = true;
            zztp zztpVar = this.zzq;
            zztpVar.getClass();
            zztpVar.zzi(this);
        }
    }

    private final void zzU(int i10) {
        zzS();
        zzuu zzuuVar = this.zzx;
        boolean[] zArr = zzuuVar.zzd;
        if (!zArr[i10]) {
            zzam zzb2 = zzuuVar.zza.zzb(i10).zzb(0);
            this.zzg.zzc(new zzto(1, zzcc.zzb(zzb2.zzm), zzb2, 0, null, zzfk.zzr(this.zzG), -9223372036854775807L));
            zArr[i10] = true;
        }
    }

    private final void zzV(int i10) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i10] && !this.zzs[i10].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzvi zzviVar : this.zzs) {
                zzviVar.zzp(false);
            }
            zztp zztpVar = this.zzq;
            zztpVar.getClass();
            zztpVar.zzg(this);
        }
    }

    private final void zzW() {
        zzuq zzuqVar = new zzuq(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzdy.zzf(zzX());
            long j10 = this.zzz;
            if (j10 != -9223372036854775807L && this.zzH > j10) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzaca zzacaVar = this.zzy;
            zzacaVar.getClass();
            zzuq.zzf(zzuqVar, zzacaVar.zzg(this.zzH).zza.zzc, this.zzH);
            for (zzvi zzviVar : this.zzs) {
                zzviVar.zzt(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzP();
        long zza = this.zzk.zza(zzuqVar, this, zzxy.zza(this.zzB));
        zzgn zzd = zzuq.zzd(zzuqVar);
        this.zzg.zzg(new zztj(zzuq.zzb(zzuqVar), zzd, zzd.zza, Collections.emptyMap(), zza, 0L, 0L), new zzto(1, -1, null, 0, null, zzfk.zzr(zzuq.zzc(zzuqVar)), zzfk.zzr(this.zzz)));
    }

    private final boolean zzX() {
        if (this.zzH != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    private final boolean zzY() {
        if (!this.zzD && !zzX()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzD() {
        if (!this.zzL) {
            zztp zztpVar = this.zzq;
            zztpVar.getClass();
            zztpVar.zzg(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzE() {
        this.zzF = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzF(zzaca zzacaVar) {
        zzaca zzabzVar;
        if (this.zzr == null) {
            zzabzVar = zzacaVar;
        } else {
            zzabzVar = new zzabz(-9223372036854775807L, 0L);
        }
        this.zzy = zzabzVar;
        this.zzz = zzacaVar.zze();
        boolean z10 = false;
        int i10 = 1;
        if (!this.zzF && zzacaVar.zze() == -9223372036854775807L) {
            z10 = true;
        }
        this.zzA = z10;
        if (true == z10) {
            i10 = 7;
        }
        this.zzB = i10;
        this.zzi.zza(this.zzz, zzacaVar.zzh(), this.zzA);
        if (!this.zzv) {
            zzT();
        }
    }

    final void zzG() throws IOException {
        this.zzk.zzi(zzxy.zza(this.zzB));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzH(int i10) throws IOException {
        this.zzs[i10].zzm();
        zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final /* bridge */ /* synthetic */ void zzI(zzyd zzydVar, long j10, long j11, boolean z10) {
        zzuq zzuqVar = (zzuq) zzydVar;
        zzhj zze = zzuq.zze(zzuqVar);
        zztj zztjVar = new zztj(zzuq.zzb(zzuqVar), zzuq.zzd(zzuqVar), zze.zzh(), zze.zzi(), j10, j11, zze.zzg());
        zzuq.zzb(zzuqVar);
        this.zzg.zzd(zztjVar, new zzto(1, -1, null, 0, null, zzfk.zzr(zzuq.zzc(zzuqVar)), zzfk.zzr(this.zzz)));
        if (!z10) {
            for (zzvi zzviVar : this.zzs) {
                zzviVar.zzp(false);
            }
            if (this.zzE > 0) {
                zztp zztpVar = this.zzq;
                zztpVar.getClass();
                zztpVar.zzg(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final /* bridge */ /* synthetic */ void zzJ(zzyd zzydVar, long j10, long j11) {
        zzaca zzacaVar;
        long j12;
        if (this.zzz == -9223372036854775807L && (zzacaVar = this.zzy) != null) {
            boolean zzh = zzacaVar.zzh();
            long zzQ = zzQ(true);
            if (zzQ == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = zzQ + 10000;
            }
            this.zzz = j12;
            this.zzi.zza(j12, zzh, this.zzA);
        }
        zzuq zzuqVar = (zzuq) zzydVar;
        zzhj zze = zzuq.zze(zzuqVar);
        zztj zztjVar = new zztj(zzuq.zzb(zzuqVar), zzuq.zzd(zzuqVar), zze.zzh(), zze.zzi(), j10, j11, zze.zzg());
        zzuq.zzb(zzuqVar);
        this.zzg.zze(zztjVar, new zzto(1, -1, null, 0, null, zzfk.zzr(zzuq.zzc(zzuqVar)), zzfk.zzr(this.zzz)));
        this.zzK = true;
        zztp zztpVar = this.zzq;
        zztpVar.getClass();
        zztpVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzK() {
        for (zzvi zzviVar : this.zzs) {
            zzviVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final void zzL(zzam zzamVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzM() {
        if (this.zzv) {
            for (zzvi zzviVar : this.zzs) {
                zzviVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final void zzN(final zzaca zzacaVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzup
            @Override // java.lang.Runnable
            public final void run() {
                zzuv.this.zzF(zzacaVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzO(int i10) {
        if (!zzY() && this.zzs[i10].zzx(this.zzK)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zza(long j10, zzlr zzlrVar) {
        boolean z10;
        zzS();
        if (!this.zzy.zzh()) {
            return 0L;
        }
        zzaby zzg = this.zzy.zzg(j10);
        long j11 = zzg.zza.zzb;
        long j12 = zzg.zzb.zzb;
        long j13 = zzlrVar.zzf;
        if (j13 == 0) {
            if (zzlrVar.zzg == 0) {
                return j10;
            }
            j13 = 0;
        }
        int i10 = zzfk.zza;
        long j14 = j10 - j13;
        long j15 = zzlrVar.zzg;
        long j16 = j10 + j15;
        long j17 = j10 ^ j16;
        long j18 = j15 ^ j16;
        if (((j13 ^ j10) & (j10 ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        if ((j17 & j18) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z11 = true;
        if (j14 <= j11 && j11 <= j16) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j14 > j12 || j12 > j16) {
            z11 = false;
        }
        if (z10 && z11) {
            if (Math.abs(j11 - j10) > Math.abs(j12 - j10)) {
                return j12;
            }
        } else if (!z10) {
            if (z11) {
                return j12;
            }
            return j14;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        long j10;
        zzS();
        if (this.zzK || this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        if (zzX()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zzuu zzuuVar = this.zzx;
                if (zzuuVar.zzb[i10] && zzuuVar.zzc[i10] && !this.zzs[i10].zzw()) {
                    j10 = Math.min(j10, this.zzs[i10].zzg());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = zzQ(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.zzG;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        if (this.zzD) {
            if (this.zzK || zzP() > this.zzJ) {
                this.zzD = false;
                return this.zzG;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zze(long j10) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j10 = 0;
        }
        this.zzD = false;
        this.zzG = j10;
        if (zzX()) {
            this.zzH = j10;
            return j10;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.zzs[i10].zzy(j10, false) || (!zArr[i10] && this.zzw)) {
                }
            }
            return j10;
        }
        this.zzI = false;
        this.zzH = j10;
        this.zzK = false;
        zzyh zzyhVar = this.zzk;
        if (zzyhVar.zzl()) {
            for (zzvi zzviVar : this.zzs) {
                zzviVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzyhVar.zzh();
            for (zzvi zzviVar2 : this.zzs) {
                zzviVar2.zzp(false);
            }
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2 == 0) goto L19;
     */
    @Override // com.google.android.gms.internal.ads.zztq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzf(com.google.android.gms.internal.ads.zzxf[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzvj[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuv.zzf(com.google.android.gms.internal.ads.zzxf[], boolean[], com.google.android.gms.internal.ads.zzvj[], boolean[], long):long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzg(int i10, zzkn zzknVar, zzht zzhtVar, int i11) {
        if (zzY()) {
            return -3;
        }
        zzU(i10);
        int zzd = this.zzs[i10].zzd(zzknVar, zzhtVar, i11, this.zzK);
        if (zzd == -3) {
            zzV(i10);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        zzS();
        return this.zzx.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzi(int i10, long j10) {
        if (zzY()) {
            return 0;
        }
        zzU(i10);
        zzvi zzviVar = this.zzs[i10];
        int zzb2 = zzviVar.zzb(j10, this.zzK);
        zzviVar.zzv(zzb2);
        if (zzb2 == 0) {
            zzV(i10);
            return 0;
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzj(long j10, boolean z10) {
        zzS();
        if (zzX()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.zzs[i10].zzi(j10, false, zArr[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzk() throws IOException {
        zzG();
        if (this.zzK && !this.zzv) {
            throw zzcd.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztpVar, long j10) {
        this.zzq = zztpVar;
        this.zzm.zze();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j10) {
        if (!this.zzK && !this.zzk.zzk() && !this.zzI) {
            if (!this.zzv || this.zzE != 0) {
                boolean zze = this.zzm.zze();
                if (!this.zzk.zzl()) {
                    zzW();
                    return true;
                }
                return zze;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        if (this.zzk.zzl() && this.zzm.zzd()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    @Override // com.google.android.gms.internal.ads.zzxz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzyb zzt(com.google.android.gms.internal.ads.zzyd r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuv.zzt(com.google.android.gms.internal.ads.zzyd, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzyb");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzace zzu() {
        return zzR(new zzut(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final zzace zzv(int i10, int i11) {
        return zzR(new zzut(i10, false));
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j10) {
    }
}
