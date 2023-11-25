package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzqe implements zzpe {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private float zzI;
    private ByteBuffer zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private byte[] zzM;
    private int zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzl zzT;
    private zzpq zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private final zzpu zzY;
    private final zzpm zzZ;
    private final zzpj zzd;
    private final zzqo zze;
    private final zzfud zzf;
    private final zzfud zzg;
    private final zzeb zzh;
    private final zzpi zzi;
    private final ArrayDeque zzj;
    private zzqc zzk;
    private final zzpx zzl;
    private final zzpx zzm;
    private final zzpr zzn;
    private zzoh zzo;
    private zzpb zzp;
    private zzpt zzq;
    private zzpt zzr;
    private zzdo zzs;
    private AudioTrack zzt;
    private zzoj zzu;
    private zzk zzv;
    private zzpw zzw;
    private zzpw zzx;
    private zzch zzy;
    private boolean zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzqe(zzps zzpsVar, zzqd zzqdVar) {
        zzoj zzojVar;
        zzpu zzpuVar;
        zzpr zzprVar;
        zzpm zzpmVar;
        zzojVar = zzpsVar.zza;
        this.zzu = zzojVar;
        zzpuVar = zzpsVar.zzd;
        this.zzY = zzpuVar;
        int i10 = zzfk.zza;
        zzprVar = zzpsVar.zzc;
        this.zzn = zzprVar;
        zzpmVar = zzpsVar.zze;
        zzpmVar.getClass();
        this.zzZ = zzpmVar;
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zzh = zzebVar;
        zzebVar.zze();
        this.zzi = new zzpi(new zzpz(this, null));
        zzpj zzpjVar = new zzpj();
        this.zzd = zzpjVar;
        zzqo zzqoVar = new zzqo();
        this.zze = zzqoVar;
        this.zzf = zzfud.zzo(new zzdv(), zzpjVar, zzqoVar);
        this.zzg = zzfud.zzm(new zzqn());
        this.zzI = 1.0f;
        this.zzv = zzk.zza;
        this.zzS = 0;
        this.zzT = new zzl(0, 0.0f);
        zzch zzchVar = zzch.zza;
        this.zzx = new zzpw(zzchVar, 0L, 0L, null);
        this.zzy = zzchVar;
        this.zzz = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzpx(100L);
        this.zzm = new zzpx(100L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzE(AudioTrack audioTrack, zzeb zzebVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzebVar.zze();
            synchronized (zza) {
                int i10 = zzc - 1;
                zzc = i10;
                if (i10 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            zzebVar.zze();
            synchronized (zza) {
                int i11 = zzc - 1;
                zzc = i11;
                if (i11 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzG() {
        if (this.zzr.zzc == 0) {
            return this.zzA / r0.zzb;
        }
        return this.zzB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzH() {
        if (this.zzr.zzc == 0) {
            return this.zzC / r0.zzd;
        }
        return this.zzD;
    }

    private final AudioTrack zzI(zzpt zzptVar) throws zzpa {
        try {
            return zzptVar.zzb(false, this.zzv, this.zzS);
        } catch (zzpa e10) {
            zzpb zzpbVar = this.zzp;
            if (zzpbVar != null) {
                zzpbVar.zza(e10);
            }
            throw e10;
        }
    }

    private final void zzJ(long j10) {
        zzch zzchVar;
        boolean z10;
        zzox zzoxVar;
        if (zzT()) {
            zzpu zzpuVar = this.zzY;
            zzchVar = this.zzy;
            zzpuVar.zzc(zzchVar);
        } else {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        this.zzy = zzchVar2;
        if (zzT()) {
            zzpu zzpuVar2 = this.zzY;
            z10 = this.zzz;
            zzpuVar2.zzd(z10);
        } else {
            z10 = false;
        }
        this.zzz = z10;
        this.zzj.add(new zzpw(zzchVar2, Math.max(0L, j10), this.zzr.zza(zzH()), null));
        zzO();
        zzpb zzpbVar = this.zzp;
        if (zzpbVar != null) {
            boolean z11 = this.zzz;
            zzoxVar = ((zzqj) zzpbVar).zza.zzc;
            zzoxVar.zzs(z11);
        }
    }

    private final void zzK() {
        if (!this.zzP) {
            this.zzP = true;
            this.zzi.zzc(zzH());
            this.zzt.stop();
        }
    }

    private final void zzL(long j10) throws zzpd {
        ByteBuffer zzb2;
        if (this.zzs.zzh()) {
            while (!this.zzs.zzg()) {
                do {
                    zzb2 = this.zzs.zzb();
                    if (zzb2.hasRemaining()) {
                        zzP(zzb2, j10);
                    } else {
                        ByteBuffer byteBuffer = this.zzJ;
                        if (byteBuffer != null && byteBuffer.hasRemaining()) {
                            this.zzs.zze(this.zzJ);
                        } else {
                            return;
                        }
                    }
                } while (!zzb2.hasRemaining());
                return;
            }
            return;
        }
        ByteBuffer byteBuffer2 = this.zzJ;
        if (byteBuffer2 == null) {
            byteBuffer2 = zzdr.zza;
        }
        zzP(byteBuffer2, j10);
    }

    private final void zzM(zzch zzchVar) {
        long j10 = -9223372036854775807L;
        zzpw zzpwVar = new zzpw(zzchVar, j10, j10, null);
        if (zzR()) {
            this.zzw = zzpwVar;
        } else {
            this.zzx = zzpwVar;
        }
    }

    private final void zzN() {
        if (!zzR()) {
            return;
        }
        if (zzfk.zza >= 21) {
            this.zzt.setVolume(this.zzI);
            return;
        }
        AudioTrack audioTrack = this.zzt;
        float f10 = this.zzI;
        audioTrack.setStereoVolume(f10, f10);
    }

    private final void zzO() {
        zzdo zzdoVar = this.zzr.zzi;
        this.zzs = zzdoVar;
        zzdoVar.zzc();
    }

    private final void zzP(ByteBuffer byteBuffer, long j10) throws zzpd {
        int write;
        zzpb zzpbVar;
        zzlm zzlmVar;
        zzlm zzlmVar2;
        boolean z10;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.zzL;
        boolean z11 = true;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzdy.zzd(z10);
        } else {
            this.zzL = byteBuffer;
            if (zzfk.zza < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.zzM;
                if (bArr == null || bArr.length < remaining) {
                    this.zzM = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.zzM, 0, remaining);
                byteBuffer.position(position);
                this.zzN = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        int i10 = zzfk.zza;
        if (i10 < 21) {
            int zza2 = this.zzi.zza(this.zzC);
            if (zza2 > 0) {
                write = this.zzt.write(this.zzM, this.zzN, Math.min(remaining2, zza2));
                if (write > 0) {
                    this.zzN += write;
                    byteBuffer.position(byteBuffer.position() + write);
                }
            } else {
                write = 0;
            }
        } else {
            write = this.zzt.write(byteBuffer, remaining2, 1);
        }
        this.zzV = SystemClock.elapsedRealtime();
        if (write < 0) {
            if (((i10 < 24 || write != -6) && write != -32) || this.zzD <= 0) {
                z11 = false;
            }
            zzpd zzpdVar = new zzpd(write, this.zzr.zza, z11);
            zzpb zzpbVar2 = this.zzp;
            if (zzpbVar2 != null) {
                zzpbVar2.zza(zzpdVar);
            }
            if (!zzpdVar.zzb) {
                this.zzm.zzb(zzpdVar);
                return;
            } else {
                this.zzu = zzoj.zza;
                throw zzpdVar;
            }
        }
        this.zzm.zza();
        if (zzS(this.zzt)) {
            if (this.zzD > 0) {
                this.zzX = false;
            }
            if (this.zzQ && (zzpbVar = this.zzp) != null && write < remaining2) {
                zzqk zzqkVar = ((zzqj) zzpbVar).zza;
                zzlmVar = zzqkVar.zzm;
                if (zzlmVar != null) {
                    zzlmVar2 = zzqkVar.zzm;
                    zzlmVar2.zza();
                }
            }
        }
        int i11 = this.zzr.zzc;
        if (i11 == 0) {
            this.zzC += write;
        }
        if (write == remaining2) {
            if (i11 != 0) {
                if (byteBuffer != this.zzJ) {
                    z11 = false;
                }
                zzdy.zzf(z11);
                this.zzD += this.zzE * this.zzK;
            }
            this.zzL = null;
        }
    }

    private final boolean zzQ() throws zzpd {
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzL;
            if (byteBuffer == null) {
                return true;
            }
            zzP(byteBuffer, Long.MIN_VALUE);
            if (this.zzL != null) {
                return false;
            }
            return true;
        }
        this.zzs.zzd();
        zzL(Long.MIN_VALUE);
        if (!this.zzs.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzL;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    private final boolean zzR() {
        if (this.zzt != null) {
            return true;
        }
        return false;
    }

    private static boolean zzS(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (zzfk.zza >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean zzT() {
        zzpt zzptVar = this.zzr;
        if (zzptVar.zzc == 0) {
            int i10 = zzptVar.zza.zzB;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final int zza(zzam zzamVar) {
        if ("audio/raw".equals(zzamVar.zzm)) {
            if (!zzfk.zzE(zzamVar.zzB)) {
                zzes.zzf("DefaultAudioSink", "Invalid PCM encoding: " + zzamVar.zzB);
                return 0;
            } else if (zzamVar.zzB == 2) {
                return 2;
            } else {
                return 1;
            }
        } else if (this.zzu.zza(zzamVar) == null) {
            return 0;
        } else {
            return 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final long zzb(boolean z10) {
        long zzn;
        if (zzR() && !this.zzG) {
            long min = Math.min(this.zzi.zzb(z10), this.zzr.zza(zzH()));
            while (!this.zzj.isEmpty() && min >= ((zzpw) this.zzj.getFirst()).zzc) {
                this.zzx = (zzpw) this.zzj.remove();
            }
            zzpw zzpwVar = this.zzx;
            long j10 = min - zzpwVar.zzc;
            if (zzpwVar.zza.equals(zzch.zza)) {
                zzn = this.zzx.zzb + j10;
            } else if (this.zzj.isEmpty()) {
                zzn = this.zzY.zza(j10) + this.zzx.zzb;
            } else {
                zzpw zzpwVar2 = (zzpw) this.zzj.getFirst();
                zzn = zzpwVar2.zzb - zzfk.zzn(zzpwVar2.zzc - min, this.zzx.zza.zzc);
            }
            return zzn + this.zzr.zza(this.zzY.zzb());
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final zzch zzc() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final zzom zzd(zzam zzamVar) {
        if (this.zzW) {
            return zzom.zza;
        }
        return this.zzZ.zza(zzamVar, this.zzv);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    @Override // com.google.android.gms.internal.ads.zzpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(com.google.android.gms.internal.ads.zzam r19, int r20, int[] r21) throws com.google.android.gms.internal.ads.zzoz {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqe.zze(com.google.android.gms.internal.ads.zzam, int, int[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzf() {
        if (zzR()) {
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzX = false;
            this.zzE = 0;
            this.zzx = new zzpw(this.zzy, 0L, 0L, null);
            this.zzH = 0L;
            this.zzw = null;
            this.zzj.clear();
            this.zzJ = null;
            this.zzK = 0;
            this.zzL = null;
            this.zzP = false;
            this.zzO = false;
            this.zze.zzp();
            zzO();
            if (this.zzi.zzi()) {
                this.zzt.pause();
            }
            if (zzS(this.zzt)) {
                zzqc zzqcVar = this.zzk;
                zzqcVar.getClass();
                zzqcVar.zzb(this.zzt);
            }
            if (zzfk.zza < 21 && !this.zzR) {
                this.zzS = 0;
            }
            zzpt zzptVar = this.zzq;
            if (zzptVar != null) {
                this.zzr = zzptVar;
                this.zzq = null;
            }
            this.zzi.zzd();
            final AudioTrack audioTrack = this.zzt;
            final zzeb zzebVar = this.zzh;
            zzebVar.zzc();
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzfk.zzB("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqe.zzE(audioTrack, zzebVar);
                    }
                });
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzg() {
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzh() {
        this.zzQ = false;
        if (zzR() && this.zzi.zzl()) {
            this.zzt.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzi() {
        this.zzQ = true;
        if (zzR()) {
            this.zzi.zzg();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzj() throws zzpd {
        if (!this.zzO && zzR() && zzQ()) {
            zzK();
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzk() {
        zzf();
        zzfud zzfudVar = this.zzf;
        int size = zzfudVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzdr) zzfudVar.get(i10)).zzf();
        }
        zzfud zzfudVar2 = this.zzg;
        int size2 = zzfudVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((zzdr) zzfudVar2.get(i11)).zzf();
        }
        zzdo zzdoVar = this.zzs;
        if (zzdoVar != null) {
            zzdoVar.zzf();
        }
        this.zzQ = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzl(zzk zzkVar) {
        if (this.zzv.equals(zzkVar)) {
            return;
        }
        this.zzv = zzkVar;
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzm(int i10) {
        boolean z10;
        if (this.zzS != i10) {
            this.zzS = i10;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.zzR = z10;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzn(zzl zzlVar) {
        if (this.zzT.equals(zzlVar)) {
            return;
        }
        int i10 = zzlVar.zza;
        if (this.zzt != null) {
            int i11 = this.zzT.zza;
        }
        this.zzT = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzo(zzdz zzdzVar) {
        this.zzi.zzf(zzdzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzp(zzpb zzpbVar) {
        this.zzp = zzpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzq(zzch zzchVar) {
        this.zzy = new zzch(Math.max(0.1f, Math.min(zzchVar.zzc, 8.0f)), Math.max(0.1f, Math.min(zzchVar.zzd, 8.0f)));
        zzM(zzchVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzr(zzoh zzohVar) {
        this.zzo = zzohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzs(AudioDeviceInfo audioDeviceInfo) {
        zzpq zzpqVar;
        if (audioDeviceInfo == null) {
            zzpqVar = null;
        } else {
            zzpqVar = new zzpq(audioDeviceInfo);
        }
        this.zzU = zzpqVar;
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzpo.zza(audioTrack, zzpqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzt(boolean z10) {
        this.zzz = z10;
        zzM(this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzu(float f10) {
        if (this.zzI != f10) {
            this.zzI = f10;
            zzN();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039e A[Catch: zzpa -> 0x03a2, TryCatch #2 {zzpa -> 0x03a2, blocks: (B:36:0x0071, B:49:0x00c2, B:51:0x00ca, B:53:0x00d0, B:54:0x00d7, B:55:0x00e0, B:57:0x00e6, B:59:0x00ea, B:60:0x00ef, B:64:0x0105, B:68:0x011d, B:69:0x0122, B:45:0x0086, B:47:0x008f, B:188:0x0396, B:190:0x039e, B:191:0x03a1, B:39:0x007a, B:41:0x007f), top: B:203:0x0071, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[Catch: zzpa -> 0x03a2, SYNTHETIC, TRY_LEAVE, TryCatch #2 {zzpa -> 0x03a2, blocks: (B:36:0x0071, B:49:0x00c2, B:51:0x00ca, B:53:0x00d0, B:54:0x00d7, B:55:0x00e0, B:57:0x00e6, B:59:0x00ea, B:60:0x00ef, B:64:0x0105, B:68:0x011d, B:69:0x0122, B:45:0x0086, B:47:0x008f, B:188:0x0396, B:190:0x039e, B:191:0x03a1, B:39:0x007a, B:41:0x007f), top: B:203:0x0071, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.zzpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzv(java.nio.ByteBuffer r28, long r29, int r31) throws com.google.android.gms.internal.ads.zzpa, com.google.android.gms.internal.ads.zzpd {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqe.zzv(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final boolean zzw() {
        if (zzR() && this.zzi.zzh(zzH())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final boolean zzx() {
        if (!zzR()) {
            return true;
        }
        if (this.zzO && !zzw()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final boolean zzy(zzam zzamVar) {
        if (zza(zzamVar) != 0) {
            return true;
        }
        return false;
    }
}
