package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@SuppressLint({"InlinedApi"})
/* loaded from: classes3.dex */
public final class zzsp {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzsj {
        int i10;
        int i11;
        int i12 = zzd;
        if (i12 == -1) {
            zzrw zzc2 = zzc("video/avc", false, false);
            if (zzc2 != null) {
                int i13 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzh()) {
                    int i14 = codecProfileLevel.level;
                    if (i14 != 1 && i14 != 2) {
                        switch (i14) {
                            case 8:
                            case 16:
                            case 32:
                                i11 = 101376;
                                continue;
                            case 64:
                                i11 = 202752;
                                continue;
                            case 128:
                            case UserVerificationMethods.USER_VERIFY_HANDPRINT /* 256 */:
                                i11 = 414720;
                                continue;
                            case 512:
                                i11 = 921600;
                                continue;
                            case UserVerificationMethods.USER_VERIFY_ALL /* 1024 */:
                                i11 = 1310720;
                                continue;
                            case RecyclerView.m.FLAG_MOVED /* 2048 */:
                            case RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                                i11 = 2097152;
                                continue;
                            case 8192:
                                i11 = 2228224;
                                continue;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i11 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i11 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i11 = 35651584;
                                continue;
                            default:
                                i11 = -1;
                                continue;
                        }
                    } else {
                        i11 = 25344;
                    }
                    i13 = Math.max(i11, i13);
                }
                if (zzfk.zza >= 21) {
                    i10 = 345600;
                } else {
                    i10 = 172800;
                }
                i12 = Math.max(i13, i10);
            } else {
                i12 = 0;
            }
            zzd = i12;
        }
        return i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c5 A[Catch: NumberFormatException -> 0x02d5, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x02d5, blocks: (B:148:0x026a, B:150:0x027c, B:161:0x0298, B:177:0x02c5), top: B:491:0x026a }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzam r17) {
        /*
            Method dump skipped, instructions count: 2548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsp.zzb(com.google.android.gms.internal.ads.zzam):android.util.Pair");
    }

    public static zzrw zzc(String str, boolean z10, boolean z11) throws zzsj {
        List zzg = zzg(str, false, false);
        if (zzg.isEmpty()) {
            return null;
        }
        return (zzrw) zzg.get(0);
    }

    public static zzrw zzd() throws zzsj {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzam zzamVar) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzamVar.zzm)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(zzamVar.zzm) && (zzb2 = zzb(zzamVar)) != null) {
            int intValue = ((Integer) zzb2.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static List zzf(zzsc zzscVar, zzam zzamVar, boolean z10, boolean z11) throws zzsj {
        String zze = zze(zzamVar);
        if (zze == null) {
            return zzfud.zzl();
        }
        return zzg(zze, z10, z11);
    }

    public static synchronized List zzg(String str, boolean z10, boolean z11) throws zzsj {
        zzsk zzsmVar;
        synchronized (zzsp.class) {
            zzsh zzshVar = new zzsh(str, z10, z11);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzshVar);
            if (list != null) {
                return list;
            }
            int i10 = zzfk.zza;
            zzsl zzslVar = null;
            if (i10 >= 21) {
                zzsmVar = new zzsn(z10, z11);
            } else {
                zzsmVar = new zzsm(zzslVar);
            }
            ArrayList zzj = zzj(zzshVar, zzsmVar);
            if (z10 && zzj.isEmpty() && i10 >= 21 && i10 <= 23) {
                zzj = zzj(zzshVar, new zzsm(zzslVar));
                if (!zzj.isEmpty()) {
                    zzes.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzrw) zzj.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (i10 < 26 && zzfk.zzb.equals("R9") && zzj.size() == 1 && ((zzrw) zzj.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzj.add(zzrw.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzk(zzj, new zzso() { // from class: com.google.android.gms.internal.ads.zzsf
                    @Override // com.google.android.gms.internal.ads.zzso
                    public final int zza(Object obj) {
                        int i11 = zzsp.zza;
                        String str2 = ((zzrw) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        if (zzfk.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                            return 0;
                        }
                        return -1;
                    }
                });
            }
            if (i10 < 21 && zzj.size() > 1) {
                String str2 = ((zzrw) zzj.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                    zzk(zzj, new zzso() { // from class: com.google.android.gms.internal.ads.zzsg
                        @Override // com.google.android.gms.internal.ads.zzso
                        public final int zza(Object obj) {
                            int i11 = zzsp.zza;
                            if (((zzrw) obj).zza.startsWith("OMX.google")) {
                                return 1;
                            }
                            return 0;
                        }
                    });
                }
            }
            if (i10 < 32 && zzj.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzrw) zzj.get(0)).zza)) {
                zzj.add((zzrw) zzj.remove(0));
            }
            zzfud zzj2 = zzfud.zzj(zzj);
            hashMap.put(zzshVar, zzj2);
            return zzj2;
        }
    }

    public static List zzh(zzsc zzscVar, zzam zzamVar, boolean z10, boolean z11) throws zzsj {
        List zzg = zzg(zzamVar.zzm, z10, z11);
        List zzf = zzf(zzscVar, zzamVar, z10, z11);
        zzfua zzfuaVar = new zzfua();
        zzfuaVar.zzh(zzg);
        zzfuaVar.zzh(zzf);
        return zzfuaVar.zzi();
    }

    public static List zzi(List list, final zzam zzamVar) {
        ArrayList arrayList = new ArrayList(list);
        zzk(arrayList, new zzso() { // from class: com.google.android.gms.internal.ads.zzsd
            @Override // com.google.android.gms.internal.ads.zzso
            public final int zza(Object obj) {
                zzam zzamVar2 = zzam.this;
                int i10 = zzsp.zza;
                if (((zzrw) obj).zzd(zzamVar2)) {
                    return 1;
                }
                return 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0233, code lost:
    
        if (r1.zzb == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
    
        if ("SCV31".equals(r10) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
    
        if (r8.startsWith("t0") == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e7 A[Catch: Exception -> 0x029f, TryCatch #1 {Exception -> 0x029f, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:188:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee A[Catch: Exception -> 0x029f, TryCatch #1 {Exception -> 0x029f, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:188:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0201 A[Catch: Exception -> 0x029f, TryCatch #1 {Exception -> 0x029f, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:188:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0206 A[Catch: Exception -> 0x029f, TryCatch #1 {Exception -> 0x029f, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:188:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b1 A[Catch: Exception -> 0x0300, TRY_ENTER, TryCatch #0 {Exception -> 0x0300, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0034, B:14:0x0042, B:18:0x004c, B:20:0x0054, B:22:0x005c, B:24:0x0064, B:26:0x006c, B:28:0x0074, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a4, B:42:0x00ac, B:44:0x00b4, B:46:0x00bc, B:48:0x00c4, B:50:0x00cc, B:52:0x00d4, B:56:0x00e2, B:58:0x00ea, B:60:0x00f2, B:62:0x00fc, B:64:0x0104, B:66:0x010a, B:68:0x0112, B:71:0x011c, B:73:0x0124, B:77:0x0130, B:79:0x0138, B:81:0x0140, B:83:0x0148, B:173:0x02a9, B:176:0x02b1, B:178:0x02b7, B:179:0x02d1, B:180:0x02f4, B:86:0x0151, B:87:0x0154, B:89:0x015c, B:92:0x0167, B:94:0x016f, B:97:0x017a, B:99:0x0182, B:102:0x018d, B:104:0x0195, B:107:0x01a0, B:109:0x01a8), top: B:186:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d1 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList zzj(com.google.android.gms.internal.ads.zzsh r27, com.google.android.gms.internal.ads.zzsk r28) throws com.google.android.gms.internal.ads.zzsj {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsp.zzj(com.google.android.gms.internal.ads.zzsh, com.google.android.gms.internal.ads.zzsk):java.util.ArrayList");
    }

    private static void zzk(List list, final zzso zzsoVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzse
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzso zzsoVar2 = zzso.this;
                int i10 = zzsp.zza;
                return zzsoVar2.zza(obj2) - zzsoVar2.zza(obj);
            }
        });
    }

    private static boolean zzl(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzfk.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        } else if (zzcc.zzf(str)) {
            return true;
        } else {
            String zza2 = zzfqo.zza(mediaCodecInfo.getName());
            if (zza2.startsWith("arc.")) {
                return false;
            }
            if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
                return true;
            }
            if (!zza2.startsWith("omx.") && !zza2.startsWith("c2.")) {
                return true;
            }
            return false;
        }
    }
}
