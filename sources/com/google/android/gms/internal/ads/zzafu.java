package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzafu implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzafq
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i10 = zzabh.zza;
            return new zzabb[]{new zzafu(0)};
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private zzaft zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzet zzJ;
    private zzet zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzabe zzai;
    private final zzafp zzh;
    private final zzafw zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzfb zzl;
    private final zzfb zzm;
    private final zzfb zzn;
    private final zzfb zzo;
    private final zzfb zzp;
    private final zzfb zzq;
    private final zzfb zzr;
    private final zzfb zzs;
    private final zzfb zzt;
    private final zzfb zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i10 = zzfk.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfqu.zzc);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzafu() {
        this(0);
    }

    private final int zzn(zzabc zzabcVar, zzaft zzaftVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(zzaftVar.zzb)) {
            zzv(zzabcVar, zzb, i10);
            int i12 = this.zzaa;
            zzu();
            return i12;
        } else if ("S_TEXT/ASS".equals(zzaftVar.zzb)) {
            zzv(zzabcVar, zzd, i10);
            int i13 = this.zzaa;
            zzu();
            return i13;
        } else if ("S_TEXT/WEBVTT".equals(zzaftVar.zzb)) {
            zzv(zzabcVar, zze, i10);
            int i14 = this.zzaa;
            zzu();
            return i14;
        } else {
            zzace zzaceVar = zzaftVar.zzV;
            boolean z11 = true;
            if (!this.zzac) {
                if (zzaftVar.zzg) {
                    this.zzV &= -1073741825;
                    int i15 = 128;
                    if (!this.zzad) {
                        ((zzaar) zzabcVar).zzn(this.zzn.zzI(), 0, 1, false);
                        this.zzZ++;
                        if ((this.zzn.zzI()[0] & 128) != 128) {
                            this.zzag = this.zzn.zzI()[0];
                            this.zzad = true;
                        } else {
                            throw zzcd.zza("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b10 = this.zzag;
                    if ((b10 & 1) == 1) {
                        int i16 = b10 & 2;
                        this.zzV |= 1073741824;
                        if (!this.zzah) {
                            ((zzaar) zzabcVar).zzn(this.zzs.zzI(), 0, 8, false);
                            this.zzZ += 8;
                            this.zzah = true;
                            byte[] zzI = this.zzn.zzI();
                            if (i16 != 2) {
                                i15 = 0;
                            }
                            zzI[0] = (byte) (i15 | 8);
                            this.zzn.zzG(0);
                            zzaceVar.zzr(this.zzn, 1, 1);
                            this.zzaa++;
                            this.zzs.zzG(0);
                            zzaceVar.zzr(this.zzs, 8, 1);
                            this.zzaa += 8;
                        }
                        if (i16 == 2) {
                            if (!this.zzae) {
                                ((zzaar) zzabcVar).zzn(this.zzn.zzI(), 0, 1, false);
                                this.zzZ++;
                                this.zzn.zzG(0);
                                this.zzaf = this.zzn.zzl();
                                this.zzae = true;
                            }
                            int i17 = this.zzaf * 4;
                            this.zzn.zzD(i17);
                            ((zzaar) zzabcVar).zzn(this.zzn.zzI(), 0, i17, false);
                            this.zzZ += i17;
                            int i18 = (this.zzaf >> 1) + 1;
                            int i19 = (i18 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i19) {
                                this.zzv = ByteBuffer.allocate(i19);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i18);
                            int i20 = 0;
                            int i21 = 0;
                            while (true) {
                                i11 = this.zzaf;
                                if (i20 >= i11) {
                                    break;
                                }
                                int zzo = this.zzn.zzo();
                                if (i20 % 2 == 0) {
                                    this.zzv.putShort((short) (zzo - i21));
                                } else {
                                    this.zzv.putInt(zzo - i21);
                                }
                                i20++;
                                i21 = zzo;
                            }
                            int i22 = (i10 - this.zzZ) - i21;
                            if ((i11 & 1) == 1) {
                                this.zzv.putInt(i22);
                            } else {
                                this.zzv.putShort((short) i22);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzE(this.zzv.array(), i19);
                            zzaceVar.zzr(this.zzt, i19, 1);
                            this.zzaa += i19;
                        }
                    }
                } else {
                    byte[] bArr = zzaftVar.zzh;
                    if (bArr != null) {
                        this.zzq.zzE(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzaftVar.zzb) ? zzaftVar.zzf > 0 : z10) {
                    this.zzV |= 268435456;
                    this.zzu.zzD(0);
                    int zzd2 = (this.zzq.zzd() + i10) - this.zzZ;
                    this.zzn.zzD(4);
                    this.zzn.zzI()[0] = (byte) ((zzd2 >> 24) & 255);
                    this.zzn.zzI()[1] = (byte) ((zzd2 >> 16) & 255);
                    this.zzn.zzI()[2] = (byte) ((zzd2 >> 8) & 255);
                    this.zzn.zzI()[3] = (byte) (zzd2 & 255);
                    zzaceVar.zzr(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
                this.zzac = true;
            }
            int zzd3 = i10 + this.zzq.zzd();
            if (!"V_MPEG4/ISO/AVC".equals(zzaftVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzaftVar.zzb)) {
                if (zzaftVar.zzS != null) {
                    if (this.zzq.zzd() != 0) {
                        z11 = false;
                    }
                    zzdy.zzf(z11);
                    zzaftVar.zzS.zzd(zzabcVar);
                }
                while (true) {
                    int i23 = this.zzZ;
                    if (i23 >= zzd3) {
                        break;
                    }
                    int zzo2 = zzo(zzabcVar, zzaceVar, zzd3 - i23);
                    this.zzZ += zzo2;
                    this.zzaa += zzo2;
                }
            } else {
                byte[] zzI2 = this.zzm.zzI();
                zzI2[0] = 0;
                zzI2[1] = 0;
                zzI2[2] = 0;
                int i24 = zzaftVar.zzW;
                int i25 = 4 - i24;
                while (this.zzZ < zzd3) {
                    int i26 = this.zzab;
                    if (i26 == 0) {
                        int min = Math.min(i24, this.zzq.zza());
                        ((zzaar) zzabcVar).zzn(zzI2, i25 + min, i24 - min, false);
                        if (min > 0) {
                            this.zzq.zzC(zzI2, i25, min);
                        }
                        this.zzZ += i24;
                        this.zzm.zzG(0);
                        this.zzab = this.zzm.zzo();
                        this.zzl.zzG(0);
                        zzacc.zzb(zzaceVar, this.zzl, 4);
                        this.zzaa += 4;
                    } else {
                        int zzo3 = zzo(zzabcVar, zzaceVar, i26);
                        this.zzZ += zzo3;
                        this.zzaa += zzo3;
                        this.zzab -= zzo3;
                    }
                }
            }
            if ("A_VORBIS".equals(zzaftVar.zzb)) {
                this.zzo.zzG(0);
                zzacc.zzb(zzaceVar, this.zzo, 4);
                this.zzaa += 4;
            }
            int i27 = this.zzaa;
            zzu();
            return i27;
        }
    }

    private final int zzo(zzabc zzabcVar, zzace zzaceVar, int i10) throws IOException {
        int zza2 = this.zzq.zza();
        if (zza2 > 0) {
            int min = Math.min(i10, zza2);
            zzacc.zzb(zzaceVar, this.zzq, min);
            return min;
        }
        return zzacc.zza(zzaceVar, zzabcVar, i10, false);
    }

    private final long zzp(long j10) throws zzcd {
        long j11 = this.zzy;
        if (j11 != -9223372036854775807L) {
            return zzfk.zzq(j10, j11, 1000L);
        }
        throw zzcd.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzq(int i10) throws zzcd {
        if (this.zzJ != null && this.zzK != null) {
            return;
        }
        throw zzcd.zza("Element " + i10 + " must be in a Cues", null);
    }

    private final void zzr(int i10) throws zzcd {
        if (this.zzB != null) {
            return;
        }
        throw zzcd.zza("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 BREAK  A[LOOP:0: B:45:0x00c5->B:50:0x00dd], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzs(com.google.android.gms.internal.ads.zzaft r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafu.zzs(com.google.android.gms.internal.ads.zzaft, long, int, int, int):void");
    }

    private final void zzt(zzabc zzabcVar, int i10) throws IOException {
        if (this.zzn.zzd() >= i10) {
            return;
        }
        if (this.zzn.zzb() < i10) {
            zzfb zzfbVar = this.zzn;
            int zzb2 = zzfbVar.zzb();
            zzfbVar.zzA(Math.max(zzb2 + zzb2, i10));
        }
        ((zzaar) zzabcVar).zzn(this.zzn.zzI(), this.zzn.zzd(), i10 - this.zzn.zzd(), false);
        this.zzn.zzF(i10);
    }

    private final void zzu() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzD(0);
    }

    private final void zzv(zzabc zzabcVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        if (this.zzr.zzb() < i11) {
            zzfb zzfbVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i11 + i10);
            zzfbVar.zzE(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzI(), 0, length);
        }
        ((zzaar) zzabcVar).zzn(this.zzr.zzI(), length, i10, false);
        this.zzr.zzG(0);
        this.zzr.zzF(i11);
    }

    private static byte[] zzw(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzd(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = zzfk.zza;
        return format.getBytes(zzfqu.zzc);
    }

    private static int[] zzx(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        if (length >= i10) {
            return iArr;
        }
        return new int[Math.max(length + length, i10)];
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (this.zzh.zzc(zzabcVar)) {
                long zzf2 = zzabcVar.zzf();
                if (this.zzF) {
                    this.zzH = zzf2;
                    zzabxVar.zza = this.zzG;
                    this.zzF = false;
                    return 1;
                } else if (this.zzC) {
                    long j10 = this.zzH;
                    if (j10 != -1) {
                        zzabxVar.zza = j10;
                        this.zzH = -1L;
                        return 1;
                    }
                }
            } else {
                for (int i10 = 0; i10 < this.zzj.size(); i10++) {
                    zzaft zzaftVar = (zzaft) this.zzj.valueAt(i10);
                    zzaft.zzd(zzaftVar);
                    zzacf zzacfVar = zzaftVar.zzS;
                    if (zzacfVar != null) {
                        zzacfVar.zza(zzaftVar.zzV, zzaftVar.zzi);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzai = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzu();
        for (int i10 = 0; i10 < this.zzj.size(); i10++) {
            zzacf zzacfVar = ((zzaft) this.zzj.valueAt(i10)).zzS;
            if (zzacfVar != null) {
                zzacfVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        return new zzafv().zza(zzabcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x027e, code lost:
    
        throw com.google.android.gms.internal.ads.zzcd.zza("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(int r20, int r21, com.google.android.gms.internal.ads.zzabc r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafu.zzg(int, int, com.google.android.gms.internal.ads.zzabc):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e8, code lost:
    
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L188;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(int r22) throws com.google.android.gms.internal.ads.zzcd {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafu.zzh(int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(int i10, double d10) throws zzcd {
        if (i10 != 181) {
            if (i10 != 17545) {
                switch (i10) {
                    case 21969:
                        zzr(i10);
                        this.zzB.zzC = (float) d10;
                        return;
                    case 21970:
                        zzr(i10);
                        this.zzB.zzD = (float) d10;
                        return;
                    case 21971:
                        zzr(i10);
                        this.zzB.zzE = (float) d10;
                        return;
                    case 21972:
                        zzr(i10);
                        this.zzB.zzF = (float) d10;
                        return;
                    case 21973:
                        zzr(i10);
                        this.zzB.zzG = (float) d10;
                        return;
                    case 21974:
                        zzr(i10);
                        this.zzB.zzH = (float) d10;
                        return;
                    case 21975:
                        zzr(i10);
                        this.zzB.zzI = (float) d10;
                        return;
                    case 21976:
                        zzr(i10);
                        this.zzB.zzJ = (float) d10;
                        return;
                    case 21977:
                        zzr(i10);
                        this.zzB.zzK = (float) d10;
                        return;
                    case 21978:
                        zzr(i10);
                        this.zzB.zzL = (float) d10;
                        return;
                    default:
                        switch (i10) {
                            case 30323:
                                zzr(i10);
                                this.zzB.zzr = (float) d10;
                                return;
                            case 30324:
                                zzr(i10);
                                this.zzB.zzs = (float) d10;
                                return;
                            case 30325:
                                zzr(i10);
                                this.zzB.zzt = (float) d10;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.zzz = (long) d10;
            return;
        }
        zzr(i10);
        this.zzB.zzP = (int) d10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(int i10, long j10) throws zzcd {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        zzr(i10);
                        this.zzB.zzd = (int) j10;
                        return;
                    case 136:
                        zzr(i10);
                        zzaft zzaftVar = this.zzB;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        zzaftVar.zzU = z10;
                        return;
                    case 155:
                        this.zzP = zzp(j10);
                        return;
                    case 159:
                        zzr(i10);
                        this.zzB.zzN = (int) j10;
                        return;
                    case 176:
                        zzr(i10);
                        this.zzB.zzl = (int) j10;
                        return;
                    case 179:
                        zzq(i10);
                        this.zzJ.zzc(zzp(j10));
                        return;
                    case 186:
                        zzr(i10);
                        this.zzB.zzm = (int) j10;
                        return;
                    case 215:
                        zzr(i10);
                        this.zzB.zzc = (int) j10;
                        return;
                    case 231:
                        this.zzI = zzp(j10);
                        return;
                    case 238:
                        this.zzW = (int) j10;
                        return;
                    case 241:
                        if (!this.zzL) {
                            zzq(i10);
                            this.zzK.zzc(j10);
                            this.zzL = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzX = true;
                        return;
                    case 16871:
                        zzr(i10);
                        zzaft.zzb(this.zzB, (int) j10);
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw zzcd.zza("ContentCompAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw zzcd.zza("DocTypeReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw zzcd.zza("EBMLReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw zzcd.zza("ContentEncAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw zzcd.zza("AESSettingsCipherMode " + j10 + " not supported", null);
                        }
                        return;
                    case 21420:
                        this.zzE = j10 + this.zzx;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        zzr(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        this.zzB.zzv = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.zzB.zzv = 1;
                                return;
                            }
                            this.zzB.zzv = 2;
                            return;
                        }
                        this.zzB.zzv = 0;
                        return;
                    case 21680:
                        zzr(i10);
                        this.zzB.zzn = (int) j10;
                        return;
                    case 21682:
                        zzr(i10);
                        this.zzB.zzp = (int) j10;
                        return;
                    case 21690:
                        zzr(i10);
                        this.zzB.zzo = (int) j10;
                        return;
                    case 21930:
                        zzr(i10);
                        zzaft zzaftVar2 = this.zzB;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        zzaftVar2.zzT = z10;
                        return;
                    case 21998:
                        zzr(i10);
                        this.zzB.zzf = (int) j10;
                        return;
                    case 22186:
                        zzr(i10);
                        this.zzB.zzQ = j10;
                        return;
                    case 22203:
                        zzr(i10);
                        this.zzB.zzR = j10;
                        return;
                    case 25188:
                        zzr(i10);
                        this.zzB.zzO = (int) j10;
                        return;
                    case 30114:
                        this.zzY = j10;
                        return;
                    case 30321:
                        zzr(i10);
                        int i12 = (int) j10;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        this.zzB.zzq = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.zzB.zzq = 2;
                                return;
                            }
                            this.zzB.zzq = 1;
                            return;
                        }
                        this.zzB.zzq = 0;
                        return;
                    case 2352003:
                        zzr(i10);
                        this.zzB.zze = (int) j10;
                        return;
                    case 2807729:
                        this.zzy = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                zzr(i10);
                                int i13 = (int) j10;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        this.zzB.zzz = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.zzB.zzz = 2;
                                return;
                            case 21946:
                                zzr(i10);
                                int zzb2 = zzs.zzb((int) j10);
                                if (zzb2 != -1) {
                                    this.zzB.zzy = zzb2;
                                    return;
                                }
                                return;
                            case 21947:
                                zzr(i10);
                                this.zzB.zzw = true;
                                int zza2 = zzs.zza((int) j10);
                                if (zza2 != -1) {
                                    this.zzB.zzx = zza2;
                                    return;
                                }
                                return;
                            case 21948:
                                zzr(i10);
                                this.zzB.zzA = (int) j10;
                                return;
                            case 21949:
                                zzr(i10);
                                this.zzB.zzB = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw zzcd.zza("ContentEncodingScope " + j10 + " not supported", null);
            }
        } else if (j10 == 0) {
        } else {
            throw zzcd.zza("ContentEncodingOrder " + j10 + " not supported", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzk(int i10, long j10, long j11) throws zzcd {
        zzdy.zzb(this.zzai);
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 187) {
                    if (i10 != 19899) {
                        if (i10 != 20533) {
                            if (i10 != 21968) {
                                if (i10 != 408125543) {
                                    if (i10 != 475249515) {
                                        if (i10 == 524531317 && !this.zzC) {
                                            if (this.zzk && this.zzG != -1) {
                                                this.zzF = true;
                                                return;
                                            }
                                            this.zzai.zzN(new zzabz(this.zzA, 0L));
                                            this.zzC = true;
                                            return;
                                        }
                                        return;
                                    }
                                    this.zzJ = new zzet(32);
                                    this.zzK = new zzet(32);
                                    return;
                                }
                                long j12 = this.zzx;
                                if (j12 != -1 && j12 != j10) {
                                    throw zzcd.zza("Multiple Segment elements not supported", null);
                                }
                                this.zzx = j10;
                                this.zzw = j11;
                                return;
                            }
                            zzr(i10);
                            this.zzB.zzw = true;
                            return;
                        }
                        zzr(i10);
                        this.zzB.zzg = true;
                        return;
                    }
                    this.zzD = -1;
                    this.zzE = -1L;
                    return;
                }
                this.zzL = false;
                return;
            }
            this.zzB = new zzaft();
            return;
        }
        this.zzX = false;
        this.zzY = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzl(int i10, String str) throws zzcd {
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 == 2274716) {
                        zzr(i10);
                        zzaft.zzc(this.zzB, str);
                        return;
                    }
                    return;
                }
                zzr(i10);
                this.zzB.zza = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw zzcd.zza("DocType " + str + " not supported", null);
            } else {
                return;
            }
        }
        zzr(i10);
        this.zzB.zzb = str;
    }

    public zzafu(int i10) {
        zzafn zzafnVar = new zzafn();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzafnVar;
        zzafnVar.zza(new zzafs(this, null));
        this.zzk = true;
        this.zzi = new zzafw();
        this.zzj = new SparseArray();
        this.zzn = new zzfb(4);
        this.zzo = new zzfb(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzfb(4);
        this.zzl = new zzfb(zzfy.zza);
        this.zzm = new zzfb(4);
        this.zzq = new zzfb();
        this.zzr = new zzfb();
        this.zzs = new zzfb(8);
        this.zzt = new zzfb();
        this.zzu = new zzfb();
        this.zzS = new int[1];
    }
}
