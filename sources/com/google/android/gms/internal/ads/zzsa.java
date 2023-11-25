package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzsa extends zzic {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private zzrw zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private int zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzid zza;
    private boolean zzaa;
    private long zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzrz zzag;
    private long zzah;
    private boolean zzai;
    private zzra zzaj;
    private zzra zzak;
    private final zzrs zzc;
    private final zzsc zzd;
    private final float zze;
    private final zzht zzf;
    private final zzht zzg;
    private final zzht zzh;
    private final zzro zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzql zzl;
    private zzam zzm;
    private zzam zzn;
    private MediaCrypto zzo;
    private boolean zzp;
    private long zzq;
    private float zzr;
    private float zzs;
    private zzrt zzt;
    private zzam zzu;
    private MediaFormat zzv;
    private boolean zzw;
    private float zzx;
    private ArrayDeque zzy;
    private zzry zzz;

    public zzsa(int i10, zzrs zzrsVar, zzsc zzscVar, boolean z10, float f10) {
        super(i10);
        this.zzc = zzrsVar;
        zzscVar.getClass();
        this.zzd = zzscVar;
        this.zze = f10;
        this.zzf = new zzht(0, 0);
        this.zzg = new zzht(0, 0);
        this.zzh = new zzht(2, 0);
        zzro zzroVar = new zzro();
        this.zzi = zzroVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzr = 1.0f;
        this.zzs = 1.0f;
        this.zzq = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        zzaJ(zzrz.zza);
        zzroVar.zzj(0);
        zzroVar.zzb.order(ByteOrder.nativeOrder());
        this.zzl = new zzql();
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzV = 0;
        this.zzM = -1;
        this.zzN = -1;
        this.zzL = -9223372036854775807L;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
    }

    private final void zzZ() {
        this.zzT = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzS = false;
        this.zzR = false;
        this.zzl.zzb();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zzaE(zzam zzamVar) {
        if (zzamVar.zzF != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0355, code lost:
    
        if ("stvm8".equals(r5) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0365, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L166;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x042e  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.internal.ads.zzsq] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzaF(com.google.android.gms.internal.ads.zzrw r21, android.media.MediaCrypto r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.zzaF(com.google.android.gms.internal.ads.zzrw, android.media.MediaCrypto):void");
    }

    @TargetApi(23)
    private final void zzaG() throws zzil {
        int i10 = this.zzX;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.zzae = true;
                    zzal();
                    return;
                }
                zzaw();
                zzau();
                return;
            }
            zzah();
            zzaK();
            return;
        }
        zzah();
    }

    private final void zzaH() {
        this.zzM = -1;
        this.zzg.zzb = null;
    }

    private final void zzaI() {
        this.zzN = -1;
        this.zzO = null;
    }

    private final void zzaJ(zzrz zzrzVar) {
        this.zzag = zzrzVar;
        if (zzrzVar.zzc != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final void zzaK() throws zzil {
        this.zzaj = this.zzak;
        this.zzW = 0;
        this.zzX = 0;
    }

    @TargetApi(23)
    private final boolean zzaL() throws zzil {
        if (this.zzY) {
            this.zzW = 1;
            if (!this.zzD && !this.zzF) {
                this.zzX = 2;
            } else {
                this.zzX = 3;
                return false;
            }
        } else {
            zzaK();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaM() throws zzil {
        zzrt zzrtVar = this.zzt;
        boolean z10 = 0;
        if (zzrtVar == null || this.zzW == 2 || this.zzad) {
            return false;
        }
        if (this.zzM < 0) {
            int zza = zzrtVar.zza();
            this.zzM = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzt.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzW == 1) {
            if (!this.zzK) {
                this.zzZ = true;
                this.zzt.zzj(this.zzM, 0, 0, 0L, 4);
                zzaH();
            }
            this.zzW = 2;
            return false;
        } else if (this.zzI) {
            this.zzI = false;
            this.zzg.zzb.put(zzb);
            this.zzt.zzj(this.zzM, 0, 38, 0L, 0);
            zzaH();
            this.zzY = true;
            return true;
        } else {
            if (this.zzV == 1) {
                for (int i10 = 0; i10 < this.zzu.zzo.size(); i10++) {
                    this.zzg.zzb.put((byte[]) this.zzu.zzo.get(i10));
                }
                this.zzV = 2;
            }
            int position = this.zzg.zzb.position();
            zzkn zzj = zzj();
            try {
                int zzbd = zzbd(zzj, this.zzg, 0);
                if (zzM() || this.zzg.zzi()) {
                    this.zzac = this.zzab;
                }
                if (zzbd == -3) {
                    return false;
                }
                if (zzbd == -5) {
                    if (this.zzV == 2) {
                        this.zzg.zzb();
                        this.zzV = 1;
                    }
                    zzY(zzj);
                    return true;
                }
                zzht zzhtVar = this.zzg;
                if (zzhtVar.zzg()) {
                    if (this.zzV == 2) {
                        zzhtVar.zzb();
                        this.zzV = 1;
                    }
                    this.zzad = true;
                    if (!this.zzY) {
                        zzaG();
                        return false;
                    }
                    try {
                        if (!this.zzK) {
                            this.zzZ = true;
                            this.zzt.zzj(this.zzM, 0, 0, 0L, 4);
                            zzaH();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw zzi(e10, this.zzm, false, zzfk.zzi(e10.getErrorCode()));
                    }
                } else if (!this.zzY && !zzhtVar.zzh()) {
                    zzhtVar.zzb();
                    if (this.zzV == 2) {
                        this.zzV = 1;
                    }
                    return true;
                } else {
                    boolean zzl = zzhtVar.zzl();
                    if (zzl) {
                        zzhtVar.zza.zzb(position);
                    }
                    if (this.zzC && !zzl) {
                        ByteBuffer byteBuffer = this.zzg.zzb;
                        byte[] bArr = zzfy.zza;
                        int position2 = byteBuffer.position();
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            int i13 = i11 + 1;
                            if (i13 < position2) {
                                int i14 = byteBuffer.get(i11) & 255;
                                if (i12 == 3) {
                                    if (i14 == 1) {
                                        if ((byteBuffer.get(i13) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer.duplicate();
                                            duplicate.position(i11 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer.position(0);
                                            byteBuffer.put(duplicate);
                                            break;
                                        }
                                        i14 = 1;
                                    }
                                } else if (i14 == 0) {
                                    i12++;
                                }
                                if (i14 != 0) {
                                    i12 = 0;
                                }
                                i11 = i13;
                            } else {
                                byteBuffer.clear();
                                break;
                            }
                        }
                        if (this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzC = false;
                    }
                    long j10 = this.zzg.zzd;
                    if (this.zzaf) {
                        if (!this.zzk.isEmpty()) {
                            ((zzrz) this.zzk.peekLast()).zzd.zzd(j10, this.zzm);
                        } else {
                            this.zzag.zzd.zzd(j10, this.zzm);
                        }
                        this.zzaf = false;
                    }
                    this.zzab = Math.max(this.zzab, j10);
                    this.zzg.zzk();
                    zzht zzhtVar2 = this.zzg;
                    if (zzhtVar2.zze()) {
                        zzat(zzhtVar2);
                    }
                    zzak(this.zzg);
                    try {
                        if (zzl) {
                            this.zzt.zzk(this.zzM, 0, this.zzg.zza, j10, 0);
                        } else {
                            this.zzt.zzj(this.zzM, 0, this.zzg.zzb.limit(), j10, 0);
                        }
                        zzaH();
                        this.zzY = true;
                        this.zzV = 0;
                        zzid zzidVar = this.zza;
                        z10 = zzidVar.zzc + 1;
                        zzidVar.zzc = z10;
                        return true;
                    } catch (MediaCodec.CryptoException e11) {
                        throw zzi(e11, this.zzm, z10, zzfk.zzi(e11.getErrorCode()));
                    }
                }
            } catch (zzhs e12) {
                zzad(e12);
                zzaO(0);
                zzah();
                return true;
            }
        }
    }

    private final boolean zzaN() {
        if (this.zzN >= 0) {
            return true;
        }
        return false;
    }

    private final boolean zzaO(int i10) throws zzil {
        zzkn zzj = zzj();
        this.zzf.zzb();
        int zzbd = zzbd(zzj, this.zzf, i10 | 4);
        if (zzbd == -5) {
            zzY(zzj);
            return true;
        } else if (zzbd == -4 && this.zzf.zzg()) {
            this.zzad = true;
            zzaG();
            return false;
        } else {
            return false;
        }
    }

    private final boolean zzaP(long j10) {
        if (this.zzq != -9223372036854775807L) {
            zzh();
            if (SystemClock.elapsedRealtime() - j10 >= this.zzq) {
                return false;
            }
            return true;
        }
        return true;
    }

    private final boolean zzaQ(zzam zzamVar) throws zzil {
        if (zzfk.zza >= 23 && this.zzt != null && this.zzX != 3 && zzbc() != 0) {
            float zzV = zzV(this.zzs, zzamVar, zzP());
            float f10 = this.zzx;
            if (f10 == zzV) {
                return true;
            }
            if (zzV == -1.0f) {
                zzaa();
                return false;
            } else if (f10 == -1.0f && zzV <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzV);
                this.zzt.zzp(bundle);
                this.zzx = zzV;
            }
        }
        return true;
    }

    private final void zzaa() throws zzil {
        if (this.zzY) {
            this.zzW = 1;
            this.zzX = 3;
            return;
        }
        zzaw();
        zzau();
    }

    private final void zzah() {
        try {
            this.zzt.zzi();
        } finally {
            zzax();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzC(com.google.android.gms.internal.ads.zzam[] r16, long r17, long r19) throws com.google.android.gms.internal.ads.zzil {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.ads.zzrz r1 = r0.zzag
            long r1 = r1.zzc
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L21
            com.google.android.gms.internal.ads.zzrz r1 = new com.google.android.gms.internal.ads.zzrz
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.zzaJ(r1)
            return
        L21:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L57
            long r1 = r0.zzab
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L39
            long r5 = r0.zzah
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L57
        L39:
            com.google.android.gms.internal.ads.zzrz r1 = new com.google.android.gms.internal.ads.zzrz
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.zzaJ(r1)
            com.google.android.gms.internal.ads.zzrz r1 = r0.zzag
            long r1 = r1.zzc
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L56
            r15.zzaj()
        L56:
            return
        L57:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zzrz r9 = new com.google.android.gms.internal.ads.zzrz
            long r3 = r0.zzab
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.zzC(com.google.android.gms.internal.ads.zzam[], long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzln
    public void zzJ(float f10, float f11) throws zzil {
        this.zzr = f10;
        this.zzs = f11;
        zzaQ(this.zzu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0275, code lost:
    
        if (r15.zzn != null) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0324 A[LOOP:2: B:89:0x015f->B:195:0x0324, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x032b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzR(long r24, long r26) throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.zzR(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public boolean zzS() {
        return this.zzae;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public boolean zzT() {
        if (this.zzm == null) {
            return false;
        }
        if (!zzO() && !zzaN()) {
            if (this.zzL == -9223372036854775807L) {
                return false;
            }
            zzh();
            if (SystemClock.elapsedRealtime() >= this.zzL) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final int zzU(zzam zzamVar) throws zzil {
        try {
            return zzW(this.zzd, zzamVar);
        } catch (zzsj e10) {
            throw zzi(e10, zzamVar, false, WearableStatusCodes.UNKNOWN_LISTENER);
        }
    }

    protected float zzV(float f10, zzam zzamVar, zzam[] zzamVarArr) {
        throw null;
    }

    protected abstract int zzW(zzsc zzscVar, zzam zzamVar) throws zzsj;

    protected zzie zzX(zzrw zzrwVar, zzam zzamVar, zzam zzamVar2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (zzaL() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
    
        if (zzaL() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a0, code lost:
    
        if (zzaL() == false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzie zzY(com.google.android.gms.internal.ads.zzkn r12) throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.zzY(com.google.android.gms.internal.ads.zzkn):com.google.android.gms.internal.ads.zzie");
    }

    protected final boolean zzaA() {
        boolean z10;
        if (this.zzt == null) {
            return false;
        }
        int i10 = this.zzX;
        if (i10 != 3 && !this.zzD && ((!this.zzE || this.zzaa) && (!this.zzF || !this.zzZ))) {
            if (i10 == 2) {
                int i11 = zzfk.zza;
                if (i11 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdy.zzf(z10);
                if (i11 >= 23) {
                    try {
                        zzaK();
                    } catch (zzil e10) {
                        zzes.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                        zzaw();
                        return true;
                    }
                }
            }
            zzah();
            return false;
        }
        zzaw();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaB() {
        return this.zzR;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaC(zzam zzamVar) {
        if (this.zzak == null && zzan(zzamVar)) {
            return true;
        }
        return false;
    }

    protected boolean zzaD(zzrw zzrwVar) {
        return true;
    }

    protected abstract zzrr zzab(zzrw zzrwVar, zzam zzamVar, MediaCrypto mediaCrypto, float f10);

    protected abstract List zzac(zzsc zzscVar, zzam zzamVar, boolean z10) throws zzsj;

    protected void zzad(Exception exc) {
        throw null;
    }

    protected void zzae(String str, zzrr zzrrVar, long j10, long j11) {
        throw null;
    }

    protected void zzaf(String str) {
        throw null;
    }

    protected void zzag(zzam zzamVar, MediaFormat mediaFormat) throws zzil {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzai(long j10) {
        this.zzah = j10;
        while (!this.zzk.isEmpty() && j10 >= ((zzrz) this.zzk.peek()).zzb) {
            zzaJ((zzrz) this.zzk.poll());
            zzaj();
        }
    }

    protected void zzak(zzht zzhtVar) throws zzil {
        throw null;
    }

    protected abstract boolean zzam(long j10, long j11, zzrt zzrtVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzam zzamVar) throws zzil;

    protected boolean zzan(zzam zzamVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float zzao() {
        return this.zzr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzap() {
        return this.zzag.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzrt zzaq() {
        return this.zzt;
    }

    protected zzru zzar(Throwable th, zzrw zzrwVar) {
        return new zzru(th, zzrwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzrw zzas() {
        return this.zzA;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2 A[Catch: zzry -> 0x0105, TryCatch #0 {zzry -> 0x0105, blocks: (B:25:0x0051, B:28:0x0056, B:30:0x006c, B:31:0x0077, B:36:0x0086, B:38:0x008e, B:39:0x0096, B:41:0x009a, B:52:0x00c2, B:54:0x00e2, B:56:0x00eb, B:59:0x00f4, B:60:0x00f6, B:55:0x00e5, B:61:0x00f7, B:63:0x00fa, B:64:0x0104, B:34:0x007b, B:35:0x0085, B:44:0x00a9, B:49:0x00b2, B:50:0x00c0), top: B:69:0x0051, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5 A[Catch: zzry -> 0x0105, TryCatch #0 {zzry -> 0x0105, blocks: (B:25:0x0051, B:28:0x0056, B:30:0x006c, B:31:0x0077, B:36:0x0086, B:38:0x008e, B:39:0x0096, B:41:0x009a, B:52:0x00c2, B:54:0x00e2, B:56:0x00eb, B:59:0x00f4, B:60:0x00f6, B:55:0x00e5, B:61:0x00f7, B:63:0x00fa, B:64:0x0104, B:34:0x007b, B:35:0x0085, B:44:0x00a9, B:49:0x00b2, B:50:0x00c0), top: B:69:0x0051, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzau() throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.zzau():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzra, android.media.MediaCrypto, com.google.android.gms.internal.ads.zzrt] */
    public final void zzaw() {
        try {
            zzrt zzrtVar = this.zzt;
            if (zzrtVar != null) {
                zzrtVar.zzl();
                this.zza.zzb++;
                zzaf(this.zzA.zza);
            }
        } finally {
            this.zzt = null;
            this.zzo = null;
            this.zzaj = null;
            zzay();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzax() {
        zzaH();
        zzaI();
        this.zzL = -9223372036854775807L;
        this.zzZ = false;
        this.zzY = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
        this.zzV = this.zzU ? 1 : 0;
    }

    protected final void zzay() {
        zzax();
        this.zzy = null;
        this.zzA = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzaa = false;
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzC = false;
        this.zzD = false;
        this.zzE = false;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzU = false;
        this.zzV = 0;
        this.zzp = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaz() throws zzil {
        boolean zzaA = zzaA();
        if (zzaA) {
            zzau();
        }
        return zzaA;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlp
    public final int zze() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzic
    public void zzw() {
        this.zzm = null;
        zzaJ(zzrz.zza);
        this.zzk.clear();
        zzaA();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzic
    public void zzx(boolean z10, boolean z11) throws zzil {
        this.zza = new zzid();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzic
    public void zzy(long j10, boolean z10) throws zzil {
        this.zzad = false;
        this.zzae = false;
        if (this.zzR) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzS = false;
            this.zzl.zzb();
        } else {
            zzaz();
        }
        zzfh zzfhVar = this.zzag.zzd;
        if (zzfhVar.zza() > 0) {
            this.zzaf = true;
        }
        zzfhVar.zze();
        this.zzk.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzic
    public void zzz() {
        try {
            zzZ();
            zzaw();
        } finally {
            this.zzak = null;
        }
    }

    protected void zzaj() {
    }

    protected void zzal() throws zzil {
    }

    protected void zzat(zzht zzhtVar) throws zzil {
    }

    protected void zzav(zzam zzamVar) throws zzil {
    }
}
