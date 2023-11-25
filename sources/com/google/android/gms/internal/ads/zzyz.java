package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzyz extends zzsa {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private long zzB;
    private int zzC;
    private long zzD;
    private zzdn zzE;
    private zzdn zzF;
    private int zzG;
    private zzzd zzH;
    private final Context zze;
    private final zzzk zzf;
    private final zzzv zzg;
    private final zzyy zzh;
    private final boolean zzi;
    private zzyr zzj;
    private boolean zzk;
    private boolean zzl;
    private Surface zzm;
    private zzzc zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzyz(Context context, zzrs zzrsVar, zzsc zzscVar, long j10, boolean z10, Handler handler, zzzw zzzwVar, int i10, float f10) {
        super(2, zzrsVar, zzscVar, false, 30.0f);
        zzyu zzyuVar = new zzyu(null);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        zzzk zzzkVar = new zzzk(applicationContext);
        this.zzf = zzzkVar;
        this.zzg = new zzzv(handler, zzzwVar);
        this.zzh = new zzyy(zzyuVar, zzzkVar, this);
        this.zzi = "NVIDIA".equals(zzfk.zzc);
        this.zzu = -9223372036854775807L;
        this.zzp = 1;
        this.zzE = zzdn.zza;
        this.zzG = 0;
        this.zzF = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (r3.equals("video/av01") != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzZ(com.google.android.gms.internal.ads.zzrw r10, com.google.android.gms.internal.ads.zzam r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyz.zzZ(com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzam):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04c0, code lost:
    
        if (r0.equals("deb") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x07a0, code lost:
    
        if (r10 != 0) goto L515;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean zzaN(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyz.zzaN(java.lang.String):boolean");
    }

    private static List zzaO(Context context, zzsc zzscVar, zzam zzamVar, boolean z10, boolean z11) throws zzsj {
        String str = zzamVar.zzm;
        if (str == null) {
            return zzfud.zzl();
        }
        if (zzfk.zza >= 26 && "video/dolby-vision".equals(str) && !zzyq.zza(context)) {
            List zzf = zzsp.zzf(zzscVar, zzamVar, z10, z11);
            if (!zzf.isEmpty()) {
                return zzf;
            }
        }
        return zzsp.zzh(zzscVar, zzamVar, z10, z11);
    }

    private final void zzaP(zzdn zzdnVar) {
        if (!zzdnVar.equals(zzdn.zza) && !zzdnVar.equals(this.zzF)) {
            this.zzF = zzdnVar;
            this.zzg.zzt(zzdnVar);
        }
    }

    private final void zzaQ() {
        zzdn zzdnVar = this.zzF;
        if (zzdnVar != null) {
            this.zzg.zzt(zzdnVar);
        }
    }

    private final void zzaR() {
        Surface surface = this.zzm;
        zzzc zzzcVar = this.zzn;
        if (surface == zzzcVar) {
            this.zzm = null;
        }
        zzzcVar.release();
        this.zzn = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzaS() {
        if (zzfk.zza >= 21) {
            return true;
        }
        return false;
    }

    private static boolean zzaT(long j10) {
        if (j10 < -30000) {
            return true;
        }
        return false;
    }

    private final boolean zzaU(zzrw zzrwVar) {
        if (zzfk.zza < 23 || zzaN(zzrwVar.zza)) {
            return false;
        }
        if (zzrwVar.zzf && !zzzc.zzb(this.zze)) {
            return false;
        }
        return true;
    }

    protected static int zzaa(zzrw zzrwVar, zzam zzamVar) {
        if (zzamVar.zzn != -1) {
            int size = zzamVar.zzo.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) zzamVar.zzo.get(i11)).length;
            }
            return zzamVar.zzn + i10;
        }
        return zzZ(zzrwVar, zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final void zzA() {
        this.zzw = 0;
        zzh();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzv = elapsedRealtime;
        this.zzA = zzfk.zzp(elapsedRealtime);
        this.zzB = 0L;
        this.zzC = 0;
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final void zzB() {
        this.zzu = -9223372036854775807L;
        if (this.zzw > 0) {
            zzh();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzw, elapsedRealtime - this.zzv);
            this.zzw = 0;
            this.zzv = elapsedRealtime;
        }
        int i10 = this.zzC;
        if (i10 != 0) {
            this.zzg.zzr(this.zzB, i10);
            this.zzB = 0L;
            this.zzC = 0;
        }
        this.zzf.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzln
    public final void zzJ(float f10, float f11) throws zzil {
        super.zzJ(f10, f11);
        this.zzf.zze(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlp
    public final String zzQ() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzln
    public final boolean zzT() {
        zzzc zzzcVar;
        if (super.zzT() && (this.zzq || (((zzzcVar = this.zzn) != null && this.zzm == zzzcVar) || zzaq() == null))) {
            this.zzu = -9223372036854775807L;
            return true;
        } else if (this.zzu == -9223372036854775807L) {
            return false;
        } else {
            zzh();
            if (SystemClock.elapsedRealtime() < this.zzu) {
                return true;
            }
            this.zzu = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final float zzV(float f10, zzam zzamVar, zzam[] zzamVarArr) {
        float f11 = -1.0f;
        for (zzam zzamVar2 : zzamVarArr) {
            float f12 = zzamVar2.zzt;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final int zzW(zzsc zzscVar, zzam zzamVar) throws zzsj {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13 = 128;
        if (!zzcc.zzg(zzamVar.zzm)) {
            return 128;
        }
        int i14 = 0;
        if (zzamVar.zzp != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        List zzaO = zzaO(this.zze, zzscVar, zzamVar, z10, false);
        if (z10 && zzaO.isEmpty()) {
            zzaO = zzaO(this.zze, zzscVar, zzamVar, false, false);
        }
        if (zzaO.isEmpty()) {
            return 129;
        }
        if (!zzsa.zzaE(zzamVar)) {
            return 130;
        }
        zzrw zzrwVar = (zzrw) zzaO.get(0);
        boolean zze = zzrwVar.zze(zzamVar);
        if (!zze) {
            for (int i15 = 1; i15 < zzaO.size(); i15++) {
                zzrw zzrwVar2 = (zzrw) zzaO.get(i15);
                if (zzrwVar2.zze(zzamVar)) {
                    zzrwVar = zzrwVar2;
                    z11 = false;
                    zze = true;
                    break;
                }
            }
        }
        z11 = true;
        if (true != zze) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        if (true != zzrwVar.zzf(zzamVar)) {
            i11 = 8;
        } else {
            i11 = 16;
        }
        if (true != zzrwVar.zzg) {
            i12 = 0;
        } else {
            i12 = 64;
        }
        if (true != z11) {
            i13 = 0;
        }
        if (zzfk.zza >= 26 && "video/dolby-vision".equals(zzamVar.zzm) && !zzyq.zza(this.zze)) {
            i13 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (zze) {
            List zzaO2 = zzaO(this.zze, zzscVar, zzamVar, z10, true);
            if (!zzaO2.isEmpty()) {
                zzrw zzrwVar3 = (zzrw) zzsp.zzi(zzaO2, zzamVar).get(0);
                if (zzrwVar3.zze(zzamVar) && zzrwVar3.zzf(zzamVar)) {
                    i14 = 32;
                }
            }
        }
        return i10 | i11 | i14 | i12 | i13;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final zzie zzX(zzrw zzrwVar, zzam zzamVar, zzam zzamVar2) {
        int i10;
        int i11;
        zzie zzb2 = zzrwVar.zzb(zzamVar, zzamVar2);
        int i12 = zzb2.zze;
        int i13 = zzamVar2.zzr;
        zzyr zzyrVar = this.zzj;
        if (i13 > zzyrVar.zza || zzamVar2.zzs > zzyrVar.zzb) {
            i12 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (zzaa(zzrwVar, zzamVar2) > this.zzj.zzc) {
            i12 |= 64;
        }
        String str = zzrwVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb2.zzd;
            i11 = 0;
        }
        return new zzie(str, zzamVar, zzamVar2, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final zzie zzY(zzkn zzknVar) throws zzil {
        zzie zzY = super.zzY(zzknVar);
        this.zzg.zzf(zzknVar.zza, zzY);
        return zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final boolean zzaD(zzrw zzrwVar) {
        if (this.zzm == null && !zzaU(zzrwVar)) {
            return false;
        }
        return true;
    }

    final void zzaG() {
        this.zzs = true;
        if (!this.zzq) {
            this.zzq = true;
            this.zzg.zzq(this.zzm);
            this.zzo = true;
        }
    }

    protected final void zzaH(zzrt zzrtVar, int i10, long j10) {
        int i11 = zzfk.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzrtVar.zzn(i10, true);
        Trace.endSection();
        ((zzsa) this).zza.zze++;
        this.zzx = 0;
        zzh();
        this.zzA = zzfk.zzp(SystemClock.elapsedRealtime());
        zzaP(this.zzE);
        zzaG();
    }

    protected final void zzaI(zzrt zzrtVar, int i10, long j10, long j11) {
        int i11 = zzfk.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzrtVar.zzm(i10, j11);
        Trace.endSection();
        ((zzsa) this).zza.zze++;
        this.zzx = 0;
        zzh();
        this.zzA = zzfk.zzp(SystemClock.elapsedRealtime());
        zzaP(this.zzE);
        zzaG();
    }

    protected final void zzaJ(zzrt zzrtVar, int i10, long j10) {
        int i11 = zzfk.zza;
        Trace.beginSection("skipVideoBuffer");
        zzrtVar.zzn(i10, false);
        Trace.endSection();
        ((zzsa) this).zza.zzf++;
    }

    protected final void zzaK(int i10, int i11) {
        zzid zzidVar = ((zzsa) this).zza;
        zzidVar.zzh += i10;
        int i12 = i10 + i11;
        zzidVar.zzg += i12;
        this.zzw += i12;
        int i13 = this.zzx + i12;
        this.zzx = i13;
        zzidVar.zzi = Math.max(i13, zzidVar.zzi);
    }

    protected final void zzaL(long j10) {
        zzid zzidVar = ((zzsa) this).zza;
        zzidVar.zzk += j10;
        zzidVar.zzl++;
        this.zzB += j10;
        this.zzC++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0112, code lost:
    
        if (true == r12) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0114, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0116, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0117, code lost:
    
        if (true == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0119, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011d, code lost:
    
        r3 = new android.graphics.Point(r13, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0208  */
    @Override // com.google.android.gms.internal.ads.zzsa
    @android.annotation.TargetApi(17)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.zzrr zzab(com.google.android.gms.internal.ads.zzrw r20, com.google.android.gms.internal.ads.zzam r21, android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyz.zzab(com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzam, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzrr");
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final List zzac(zzsc zzscVar, zzam zzamVar, boolean z10) throws zzsj {
        return zzsp.zzi(zzaO(this.zze, zzscVar, zzamVar, false, false), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzad(Exception exc) {
        zzes.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzae(String str, zzrr zzrrVar, long j10, long j11) {
        this.zzg.zza(str, j10, j11);
        this.zzk = zzaN(str);
        zzrw zzas = zzas();
        zzas.getClass();
        boolean z10 = false;
        if (zzfk.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzas.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzas.zzh();
            int length = zzh.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (zzh[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.zzl = z10;
        this.zzh.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzaf(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzag(zzam zzamVar, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        zzrt zzaq = zzaq();
        if (zzaq != null) {
            zzaq.zzq(this.zzp);
        }
        mediaFormat.getClass();
        int i10 = 0;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        float f10 = zzamVar.zzv;
        if (zzaS()) {
            int i11 = zzamVar.zzu;
            if (i11 == 90 || i11 == 270) {
                f10 = 1.0f / f10;
                int i12 = integer2;
                integer2 = integer;
                integer = i12;
            }
        } else {
            i10 = zzamVar.zzu;
        }
        this.zzE = new zzdn(integer, integer2, i10, f10);
        this.zzf.zzc(zzamVar.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzai(long j10) {
        super.zzai(j10);
        this.zzy--;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzaj() {
        this.zzq = false;
        int i10 = zzfk.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzak(zzht zzhtVar) throws zzil {
        this.zzy++;
        int i10 = zzfk.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final boolean zzam(long j10, long j11, zzrt zzrtVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzam zzamVar) throws zzil {
        boolean z12;
        int zzd2;
        zzrtVar.getClass();
        if (this.zzt == -9223372036854775807L) {
            this.zzt = j10;
        }
        if (j12 != this.zzz) {
            this.zzf.zzd(j12);
            this.zzz = j12;
        }
        long zzap = j12 - zzap();
        if (z10 && !z11) {
            zzaJ(zzrtVar, i10, zzap);
            return true;
        }
        int zzbc = zzbc();
        zzh();
        long zzp = zzfk.zzp(SystemClock.elapsedRealtime());
        long zzao = (long) ((j12 - j10) / zzao());
        if (zzbc == 2) {
            zzao -= zzp - j11;
        }
        if (this.zzm == this.zzn) {
            if (zzaT(zzao)) {
                zzaJ(zzrtVar, i10, zzap);
                zzaL(zzao);
                return true;
            }
            return false;
        }
        int zzbc2 = zzbc();
        boolean z13 = this.zzs;
        boolean z14 = zzbc2 == 2;
        boolean z15 = z13 ? !this.zzq : z14 || this.zzr;
        zzh();
        long zzp2 = zzfk.zzp(SystemClock.elapsedRealtime()) - this.zzA;
        if (this.zzu == -9223372036854775807L && j10 >= zzap() && (z15 || (z14 && zzaT(zzao) && zzp2 > 100000))) {
            zzh();
            long nanoTime = System.nanoTime();
            if (zzfk.zza >= 21) {
                zzaI(zzrtVar, i10, zzap, nanoTime);
            } else {
                zzaH(zzrtVar, i10, zzap);
            }
            zzaL(zzao);
            return true;
        } else if (zzbc != 2 || j10 == this.zzt) {
            return false;
        } else {
            zzh();
            long nanoTime2 = System.nanoTime();
            long zza = this.zzf.zza((zzao * 1000) + nanoTime2);
            long j13 = this.zzu;
            long j14 = (zza - nanoTime2) / 1000;
            if (j14 < -500000 && !z11 && (zzd2 = zzd(j10)) != 0) {
                if (j13 != -9223372036854775807L) {
                    zzid zzidVar = ((zzsa) this).zza;
                    zzidVar.zzd += zzd2;
                    zzidVar.zzf += this.zzy;
                } else {
                    ((zzsa) this).zza.zzj++;
                    zzaK(zzd2, this.zzy);
                }
                zzaz();
                return false;
            } else if (zzaT(j14) && !z11) {
                if (j13 != -9223372036854775807L) {
                    zzaJ(zzrtVar, i10, zzap);
                    z12 = true;
                } else {
                    Trace.beginSection("dropVideoBuffer");
                    zzrtVar.zzn(i10, false);
                    Trace.endSection();
                    z12 = true;
                    zzaK(0, 1);
                }
                zzaL(j14);
                return z12;
            } else if (zzfk.zza >= 21) {
                if (j14 < 50000) {
                    if (zza == this.zzD) {
                        zzaJ(zzrtVar, i10, zzap);
                    } else {
                        zzaI(zzrtVar, i10, zzap, zza);
                    }
                    zzaL(j14);
                    this.zzD = zza;
                    return true;
                }
                return false;
            } else if (j14 < 30000) {
                if (j14 > 11000) {
                    try {
                        Thread.sleep(((-10000) + j14) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                zzaH(zzrtVar, i10, zzap);
                zzaL(j14);
                return true;
            } else {
                return false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final zzru zzar(Throwable th, zzrw zzrwVar) {
        return new zzyp(th, zzrwVar, this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    @TargetApi(29)
    protected final void zzat(zzht zzhtVar) throws zzil {
        if (!this.zzl) {
            return;
        }
        ByteBuffer byteBuffer = zzhtVar.zze;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b10 = byteBuffer.get();
            short s10 = byteBuffer.getShort();
            short s11 = byteBuffer.getShort();
            byte b11 = byteBuffer.get();
            byte b12 = byteBuffer.get();
            byteBuffer.position(0);
            if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                if (b12 == 0 || b12 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzrt zzaq = zzaq();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzaq.zzp(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzav(zzam zzamVar) throws zzil {
        this.zzh.zzd(zzamVar, zzap(), zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzax() {
        super.zzax();
        this.zzy = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzln
    public final void zzs() {
        this.zzr = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzli
    public final void zzt(int i10, Object obj) throws zzil {
        zzzc zzzcVar;
        Surface surface;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 13) {
                                if (i10 == 14) {
                                    obj.getClass();
                                    zzfc zzfcVar = (zzfc) obj;
                                    if (zzfcVar.zzb() != 0 && zzfcVar.zza() != 0 && (surface = this.zzm) != null) {
                                        this.zzh.zzb(surface, zzfcVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            this.zzh.zzc((List) obj);
                            return;
                        }
                        this.zzf.zzj(((Integer) obj).intValue());
                        return;
                    }
                    int intValue = ((Integer) obj).intValue();
                    this.zzp = intValue;
                    zzrt zzaq = zzaq();
                    if (zzaq != null) {
                        zzaq.zzq(intValue);
                        return;
                    }
                    return;
                }
                int intValue2 = ((Integer) obj).intValue();
                if (this.zzG != intValue2) {
                    this.zzG = intValue2;
                    return;
                }
                return;
            }
            this.zzH = (zzzd) obj;
            return;
        }
        if (obj instanceof Surface) {
            zzzcVar = (Surface) obj;
        } else {
            zzzcVar = null;
        }
        if (zzzcVar == null) {
            zzzc zzzcVar2 = this.zzn;
            if (zzzcVar2 != null) {
                zzzcVar = zzzcVar2;
            } else {
                zzrw zzas = zzas();
                if (zzas != null && zzaU(zzas)) {
                    zzzcVar = zzzc.zza(this.zze, zzas.zzf);
                    this.zzn = zzzcVar;
                }
            }
        }
        if (this.zzm != zzzcVar) {
            this.zzm = zzzcVar;
            this.zzf.zzi(zzzcVar);
            this.zzo = false;
            int zzbc = zzbc();
            zzrt zzaq2 = zzaq();
            if (zzaq2 != null) {
                if (zzfk.zza >= 23 && zzzcVar != null && !this.zzk) {
                    zzaq2.zzo(zzzcVar);
                } else {
                    zzaw();
                    zzau();
                }
            }
            if (zzzcVar != null && zzzcVar != this.zzn) {
                zzaQ();
                this.zzq = false;
                int i11 = zzfk.zza;
                if (zzbc == 2) {
                    this.zzu = -9223372036854775807L;
                    return;
                }
                return;
            }
            this.zzF = null;
            this.zzq = false;
            int i12 = zzfk.zza;
        } else if (zzzcVar != null && zzzcVar != this.zzn) {
            zzaQ();
            if (this.zzo) {
                this.zzg.zzq(this.zzm);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    protected final void zzw() {
        this.zzF = null;
        this.zzq = false;
        int i10 = zzfk.zza;
        this.zzo = false;
        try {
            super.zzw();
        } finally {
            this.zzg.zzc(((zzsa) this).zza);
            this.zzg.zzt(zzdn.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    protected final void zzx(boolean z10, boolean z11) throws zzil {
        super.zzx(z10, z11);
        zzm();
        this.zzg.zze(((zzsa) this).zza);
        this.zzr = z11;
        this.zzs = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    protected final void zzy(long j10, boolean z10) throws zzil {
        super.zzy(j10, z10);
        this.zzq = false;
        int i10 = zzfk.zza;
        this.zzf.zzf();
        this.zzz = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzx = 0;
        this.zzu = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    @TargetApi(17)
    protected final void zzz() {
        try {
            super.zzz();
            if (this.zzn != null) {
                zzaR();
            }
        } catch (Throwable th) {
            if (this.zzn != null) {
                zzaR();
            }
            throw th;
        }
    }
}
