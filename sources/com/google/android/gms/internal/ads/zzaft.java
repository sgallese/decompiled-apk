package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaft {
    public byte[] zzM;
    public zzacf zzS;
    public boolean zzT;
    public zzace zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzacd zzi;
    public byte[] zzj;
    public zzad zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = m.e.DEFAULT_DRAG_ANIMATION_DURATION;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    private static Pair zzf(zzfb zzfbVar) throws zzcd {
        try {
            zzfbVar.zzH(16);
            long zzr = zzfbVar.zzr();
            if (zzr == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzr == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzr == 826496599) {
                int zzc = zzfbVar.zzc() + 20;
                byte[] zzI = zzfbVar.zzI();
                while (true) {
                    int length = zzI.length;
                    if (zzc < length - 4) {
                        if (zzI[zzc] == 0 && zzI[zzc + 1] == 0 && zzI[zzc + 2] == 1 && zzI[zzc + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzI, zzc, length)));
                        }
                        zzc++;
                    } else {
                        throw zzcd.zza("Failed to find FourCC VC1 initialization data", null);
                    }
                }
            } else {
                zzes.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcd.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzcd {
        int i10;
        int i11;
        try {
            if (bArr[0] == 2) {
                int i12 = 1;
                int i13 = 0;
                while (true) {
                    i10 = bArr[i12] & 255;
                    if (i10 != 255) {
                        break;
                    }
                    i12++;
                    i13 += 255;
                }
                int i14 = i13 + i10;
                int i15 = i12 + 1;
                int i16 = 0;
                while (true) {
                    i11 = bArr[i15] & 255;
                    if (i11 != 255) {
                        break;
                    }
                    i15++;
                    i16 += 255;
                }
                int i17 = i15 + 1;
                int i18 = i16 + i11;
                if (bArr[i17] == 1) {
                    byte[] bArr2 = new byte[i14];
                    System.arraycopy(bArr, i17, bArr2, 0, i14);
                    int i19 = i17 + i14;
                    if (bArr[i19] == 3) {
                        int i20 = i19 + i18;
                        if (bArr[i20] == 5) {
                            int length = bArr.length - i20;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i20, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzcd.zza("Error parsing vorbis codec private", null);
                    }
                    throw zzcd.zza("Error parsing vorbis codec private", null);
                }
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            throw zzcd.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcd.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzfb zzfbVar) throws zzcd {
        UUID uuid;
        UUID uuid2;
        try {
            int zzj = zzfbVar.zzj();
            if (zzj == 1) {
                return true;
            }
            if (zzj == 65534) {
                zzfbVar.zzG(24);
                long zzs = zzfbVar.zzs();
                uuid = zzafu.zzf;
                if (zzs == uuid.getMostSignificantBits()) {
                    long zzs2 = zzfbVar.zzs();
                    uuid2 = zzafu.zzf;
                    if (zzs2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcd.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzcd {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzcd.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void zze(zzabe zzabeVar, int i10) throws zzcd {
        char c10;
        List singletonList;
        zzfud zzfudVar;
        String str;
        String str2;
        int i11;
        byte[] bArr;
        int i12;
        float f10;
        zzs zzsVar;
        Map map;
        Map map2;
        byte[] bArr2;
        int i13;
        Map map3;
        zzaax zza;
        String str3 = this.zzb;
        int i14 = 1;
        int i15 = 4;
        int i16 = 0;
        int i17 = -1;
        switch (str3.hashCode()) {
            case -2095576542:
                if (str3.equals("V_MPEG4/ISO/AP")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -2095575984:
                if (str3.equals("V_MPEG4/ISO/SP")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1985379776:
                if (str3.equals("A_MS/ACM")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case -1784763192:
                if (str3.equals("A_TRUEHD")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -1730367663:
                if (str3.equals("A_VORBIS")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -1482641358:
                if (str3.equals("A_MPEG/L2")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -1482641357:
                if (str3.equals("A_MPEG/L3")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case -1373388978:
                if (str3.equals("V_MS/VFW/FOURCC")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -933872740:
                if (str3.equals("S_DVBSUB")) {
                    c10 = ' ';
                    break;
                }
                c10 = 65535;
                break;
            case -538363189:
                if (str3.equals("V_MPEG4/ISO/ASP")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -538363109:
                if (str3.equals("V_MPEG4/ISO/AVC")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -425012669:
                if (str3.equals("S_VOBSUB")) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case -356037306:
                if (str3.equals("A_DTS/LOSSLESS")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 62923557:
                if (str3.equals("A_AAC")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 62923603:
                if (str3.equals("A_AC3")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 62927045:
                if (str3.equals("A_DTS")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 82318131:
                if (str3.equals("V_AV1")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 82338133:
                if (str3.equals("V_VP8")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82338134:
                if (str3.equals("V_VP9")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 99146302:
                if (str3.equals("S_HDMV/PGS")) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            case 444813526:
                if (str3.equals("V_THEORA")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 542569478:
                if (str3.equals("A_DTS/EXPRESS")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 635596514:
                if (str3.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 725948237:
                if (str3.equals("A_PCM/INT/BIG")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case 725957860:
                if (str3.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 738597099:
                if (str3.equals("S_TEXT/ASS")) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case 855502857:
                if (str3.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1045209816:
                if (str3.equals("S_TEXT/WEBVTT")) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case 1422270023:
                if (str3.equals("S_TEXT/UTF8")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 1809237540:
                if (str3.equals("V_MPEG2")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1950749482:
                if (str3.equals("A_EAC3")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 1950789798:
                if (str3.equals("A_FLAC")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 1951062397:
                if (str3.equals("A_OPUS")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        String str4 = "audio/raw";
        switch (c10) {
            case 0:
                str4 = "video/x-vnd.on2.vp8";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 1:
                str4 = "video/x-vnd.on2.vp9";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 2:
                str4 = "video/av01";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 3:
                str4 = "video/mpeg2";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 4:
            case 5:
            case 6:
                byte[] bArr3 = this.zzj;
                if (bArr3 == null) {
                    singletonList = null;
                } else {
                    singletonList = Collections.singletonList(bArr3);
                }
                str4 = "video/mp4v-es";
                zzfudVar = singletonList;
                i11 = -1;
                str2 = null;
                i15 = -1;
                break;
            case 7:
                zzaag zza2 = zzaag.zza(new zzfb(zzi(this.zzb)));
                zzfudVar = zza2.zza;
                this.zzW = zza2.zzb;
                str = zza2.zzi;
                str4 = "video/avc";
                str2 = str;
                i11 = -1;
                i15 = -1;
                break;
            case '\b':
                zzabr zza3 = zzabr.zza(new zzfb(zzi(this.zzb)));
                zzfudVar = zza3.zza;
                this.zzW = zza3.zzb;
                str = zza3.zzg;
                str4 = "video/hevc";
                str2 = str;
                i11 = -1;
                i15 = -1;
                break;
            case '\t':
                Pair zzf = zzf(new zzfb(zzi(this.zzb)));
                str4 = (String) zzf.first;
                singletonList = (List) zzf.second;
                zzfudVar = singletonList;
                i11 = -1;
                str2 = null;
                i15 = -1;
                break;
            case '\n':
                str4 = "video/x-unknown";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 11:
                str4 = "audio/vorbis";
                zzfudVar = zzg(zzi(str3));
                i11 = 8192;
                str2 = null;
                i15 = -1;
                break;
            case '\f':
                ArrayList arrayList = new ArrayList(3);
                arrayList.add(zzi(this.zzb));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList.add(allocate.order(byteOrder).putLong(this.zzQ).array());
                arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzR).array());
                str4 = "audio/opus";
                zzfudVar = arrayList;
                i11 = 5760;
                str2 = null;
                i15 = -1;
                break;
            case '\r':
                List singletonList2 = Collections.singletonList(zzi(str3));
                zzzy zza4 = zzzz.zza(this.zzj);
                this.zzP = zza4.zza;
                this.zzN = zza4.zzb;
                str4 = "audio/mp4a-latm";
                str2 = zza4.zzc;
                i15 = -1;
                zzfudVar = singletonList2;
                i11 = -1;
                break;
            case 14:
                str4 = "audio/mpeg-L2";
                i11 = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 15:
                str4 = "audio/mpeg";
                i11 = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 16:
                str4 = "audio/ac3";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 17:
                str4 = "audio/eac3";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 18:
                this.zzS = new zzacf();
                str4 = "audio/true-hd";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 19:
            case 20:
                str4 = "audio/vnd.dts";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 21:
                str4 = "audio/vnd.dts.hd";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 22:
                singletonList = Collections.singletonList(zzi(str3));
                str4 = "audio/flac";
                zzfudVar = singletonList;
                i11 = -1;
                str2 = null;
                i15 = -1;
                break;
            case 23:
                if (zzh(new zzfb(zzi(this.zzb)))) {
                    i15 = zzfk.zzk(this.zzO);
                    if (i15 == 0) {
                        zzes.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    }
                    i11 = -1;
                    zzfudVar = null;
                    str2 = null;
                    break;
                } else {
                    zzes.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                }
                str4 = "audio/x-unknown";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 24:
                i15 = zzfk.zzk(this.zzO);
                if (i15 == 0) {
                    zzes.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    str4 = "audio/x-unknown";
                    i11 = -1;
                    zzfudVar = null;
                    str2 = null;
                    i15 = -1;
                    break;
                }
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                break;
            case 25:
                int i18 = this.zzO;
                if (i18 == 8) {
                    i11 = -1;
                    zzfudVar = null;
                    str2 = null;
                    i15 = 3;
                    break;
                } else {
                    if (i18 == 16) {
                        i15 = 268435456;
                    } else if (i18 == 24) {
                        i15 = 1342177280;
                    } else if (i18 == 32) {
                        i15 = 1610612736;
                    } else {
                        zzes.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i18 + ". Setting mimeType to audio/x-unknown");
                        str4 = "audio/x-unknown";
                        i11 = -1;
                        zzfudVar = null;
                        str2 = null;
                        i15 = -1;
                        break;
                    }
                    i11 = -1;
                    zzfudVar = null;
                    str2 = null;
                    break;
                }
            case 26:
                int i19 = this.zzO;
                if (i19 != 32) {
                    zzes.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i19 + ". Setting mimeType to audio/x-unknown");
                    str4 = "audio/x-unknown";
                    i11 = -1;
                    zzfudVar = null;
                    str2 = null;
                    i15 = -1;
                    break;
                }
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                break;
            case 27:
                str4 = "application/x-subrip";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 28:
                bArr = zzafu.zzc;
                zzfudVar = zzfud.zzn(bArr, zzi(this.zzb));
                str4 = "text/x-ssa";
                i11 = -1;
                str2 = null;
                i15 = -1;
                break;
            case 29:
                str4 = "text/vtt";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case 30:
                singletonList = zzfud.zzm(zzi(str3));
                str4 = "application/vobsub";
                zzfudVar = singletonList;
                i11 = -1;
                str2 = null;
                i15 = -1;
                break;
            case 31:
                str4 = "application/pgs";
                i11 = -1;
                zzfudVar = null;
                str2 = null;
                i15 = -1;
                break;
            case ' ':
                byte[] bArr4 = new byte[4];
                System.arraycopy(zzi(str3), 0, bArr4, 0, 4);
                singletonList = zzfud.zzm(bArr4);
                str4 = "application/dvbsubs";
                zzfudVar = singletonList;
                i11 = -1;
                str2 = null;
                i15 = -1;
                break;
            default:
                throw zzcd.zza("Unrecognized codec identifier.", null);
        }
        if (this.zzM != null && (zza = zzaax.zza(new zzfb(this.zzM))) != null) {
            str2 = zza.zza;
            str4 = "video/dolby-vision";
        }
        String str5 = str4;
        boolean z10 = this.zzU;
        if (true != this.zzT) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        int i20 = (z10 ? 1 : 0) | i12;
        zzak zzakVar = new zzak();
        if (zzcc.zzf(str5)) {
            zzakVar.zzw(this.zzN);
            zzakVar.zzT(this.zzP);
            zzakVar.zzN(i15);
        } else if (zzcc.zzg(str5)) {
            if (this.zzp == 0) {
                int i21 = this.zzn;
                if (i21 == -1) {
                    i21 = this.zzl;
                }
                this.zzn = i21;
                int i22 = this.zzo;
                if (i22 == -1) {
                    i22 = this.zzm;
                }
                this.zzo = i22;
            }
            if (this.zzn != -1 && (i13 = this.zzo) != -1) {
                f10 = (this.zzm * r6) / (this.zzl * i13);
            } else {
                f10 = -1.0f;
            }
            if (this.zzw) {
                if (this.zzC != -1.0f && this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f) {
                    bArr2 = new byte[25];
                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                    order.put((byte) 0);
                    order.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                    order.putShort((short) (this.zzK + 0.5f));
                    order.putShort((short) (this.zzL + 0.5f));
                    order.putShort((short) this.zzA);
                    order.putShort((short) this.zzB);
                } else {
                    bArr2 = null;
                }
                zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr2);
            } else {
                zzsVar = null;
            }
            if (this.zza != null) {
                map = zzafu.zzg;
                if (map.containsKey(this.zza)) {
                    map2 = zzafu.zzg;
                    i17 = ((Integer) map2.get(this.zza)).intValue();
                }
            }
            if (this.zzq == 0 && Float.compare(this.zzr, 0.0f) == 0 && Float.compare(this.zzs, 0.0f) == 0) {
                if (Float.compare(this.zzt, 0.0f) != 0) {
                    if (Float.compare(this.zzt, 90.0f) == 0) {
                        i16 = 90;
                    } else if (Float.compare(this.zzt, -180.0f) != 0 && Float.compare(this.zzt, 180.0f) != 0) {
                        if (Float.compare(this.zzt, -90.0f) == 0) {
                            i16 = 270;
                        }
                    } else {
                        i16 = 180;
                    }
                }
                zzakVar.zzX(this.zzl);
                zzakVar.zzF(this.zzm);
                zzakVar.zzP(f10);
                zzakVar.zzR(i16);
                zzakVar.zzQ(this.zzu);
                zzakVar.zzV(this.zzv);
                zzakVar.zzy(zzsVar);
                i14 = 2;
            }
            i16 = i17;
            zzakVar.zzX(this.zzl);
            zzakVar.zzF(this.zzm);
            zzakVar.zzP(f10);
            zzakVar.zzR(i16);
            zzakVar.zzQ(this.zzu);
            zzakVar.zzV(this.zzv);
            zzakVar.zzy(zzsVar);
            i14 = 2;
        } else if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"text/vtt".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
            throw zzcd.zza("Unexpected MIME type.", null);
        } else {
            i14 = 3;
        }
        if (this.zza != null) {
            map3 = zzafu.zzg;
            if (!map3.containsKey(this.zza)) {
                zzakVar.zzJ(this.zza);
            }
        }
        zzakVar.zzG(i10);
        zzakVar.zzS(str5);
        zzakVar.zzL(i11);
        zzakVar.zzK(this.zzY);
        zzakVar.zzU(i20);
        zzakVar.zzI(zzfudVar);
        zzakVar.zzx(str2);
        zzakVar.zzB(this.zzk);
        zzam zzY = zzakVar.zzY();
        zzace zzv = zzabeVar.zzv(this.zzc, i14);
        this.zzV = zzv;
        zzv.zzk(zzY);
    }
}
