package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import okhttp3.internal.http2.Http2;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzrw {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    zzrw(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = zzcc.zzg(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzrw zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzrw r11 = new com.google.android.gms.internal.ads.zzrw
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3d
            int r3 = com.google.android.gms.internal.ads.zzfk.zza
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L3d
            int r3 = com.google.android.gms.internal.ads.zzfk.zza
            r5 = 22
            if (r3 > r5) goto L3b
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfk.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2a
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3b
        L2a:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r8 = 1
            goto L3e
        L3d:
            r8 = 0
        L3e:
            r3 = 21
            if (r4 == 0) goto L50
            int r5 = com.google.android.gms.internal.ads.zzfk.zza
            if (r5 < r3) goto L50
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L50
            r9 = 1
            goto L51
        L50:
            r9 = 0
        L51:
            if (r20 != 0) goto L64
            if (r4 == 0) goto L62
            int r5 = com.google.android.gms.internal.ads.zzfk.zza
            if (r5 < r3) goto L62
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L62
            goto L64
        L62:
            r10 = 0
            goto L65
        L64:
            r10 = 1
        L65:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrw.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzrw");
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = zzfk.zza;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        zzes.zzb("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + zzfk.zze + "]");
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point zzi = zzi(videoCapabilities, i10, i11);
        int i12 = zzi.x;
        int i13 = zzi.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    private final boolean zzl(zzam zzamVar, boolean z10) {
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair zzb = zzsp.zzb(zzamVar);
        if (zzb == null) {
            return true;
        }
        int intValue = ((Integer) zzb.first).intValue();
        int intValue2 = ((Integer) zzb.second).intValue();
        int i11 = 8;
        if ("video/dolby-vision".equals(zzamVar.zzm)) {
            if ("video/avc".equals(this.zzb)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(this.zzb)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.zzh && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
        if (zzfk.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzh.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                i10 = videoCapabilities.getBitrateRange().getUpper().intValue();
            } else {
                i10 = 0;
            }
            if (i10 >= 180000000) {
                i11 = UserVerificationMethods.USER_VERIFY_ALL;
            } else if (i10 >= 120000000) {
                i11 = 512;
            } else if (i10 >= 60000000) {
                i11 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else if (i10 >= 30000000) {
                i11 = 128;
            } else if (i10 >= 18000000) {
                i11 = 64;
            } else if (i10 >= 12000000) {
                i11 = 32;
            } else if (i10 >= 7200000) {
                i11 = 16;
            } else if (i10 < 3600000) {
                if (i10 >= 1800000) {
                    i11 = 4;
                } else if (i10 >= 800000) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i11;
            zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                if ("video/hevc".equals(this.zzb) && intValue == 2) {
                    String str = zzfk.zzb;
                    if (!"sailfish".equals(str) && !"marlin".equals(str)) {
                    }
                }
                return true;
            }
        }
        zzj("codec.profileLevel, " + zzamVar.zzj + ", " + this.zzc);
        return false;
    }

    private final boolean zzm(zzam zzamVar) {
        if (!this.zzb.equals(zzamVar.zzm) && !this.zzb.equals(zzsp.zze(zzamVar))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i10, i11);
    }

    public final zzie zzb(zzam zzamVar, zzam zzamVar2) {
        int i10;
        int i11;
        if (true != zzfk.zzD(zzamVar.zzm, zzamVar2.zzm)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.zzh) {
            if (zzamVar.zzu != zzamVar2.zzu) {
                i10 |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            if (!this.zze && (zzamVar.zzr != zzamVar2.zzr || zzamVar.zzs != zzamVar2.zzs)) {
                i10 |= 512;
            }
            if (!zzfk.zzD(zzamVar.zzy, zzamVar2.zzy)) {
                i10 |= RecyclerView.m.FLAG_MOVED;
            }
            String str = this.zza;
            if (zzfk.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzamVar.zzd(zzamVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                String str2 = this.zza;
                if (true != zzamVar.zzd(zzamVar2)) {
                    i11 = 2;
                } else {
                    i11 = 3;
                }
                return new zzie(str2, zzamVar, zzamVar2, i11, 0);
            }
        } else {
            if (zzamVar.zzz != zzamVar2.zzz) {
                i10 |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            if (zzamVar.zzA != zzamVar2.zzA) {
                i10 |= 8192;
            }
            if (zzamVar.zzB != zzamVar2.zzB) {
                i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb = zzsp.zzb(zzamVar);
                Pair zzb2 = zzsp.zzb(zzamVar2);
                if (zzb != null && zzb2 != null) {
                    int intValue = ((Integer) zzb.first).intValue();
                    int intValue2 = ((Integer) zzb2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzie(this.zza, zzamVar, zzamVar2, 3, 0);
                    }
                }
            }
            if (!zzamVar.zzd(zzamVar2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzie(this.zza, zzamVar, zzamVar2, 1, 0);
            }
        }
        return new zzie(this.zza, zzamVar, zzamVar2, 0, i10);
    }

    public final boolean zzd(zzam zzamVar) {
        if (!zzm(zzamVar) || !zzl(zzamVar, false)) {
            return false;
        }
        return true;
    }

    public final boolean zze(zzam zzamVar) throws zzsj {
        int i10;
        int i11;
        boolean z10 = false;
        if (!zzm(zzamVar) || !zzl(zzamVar, true)) {
            return false;
        }
        if (this.zzh) {
            int i12 = zzamVar.zzr;
            if (i12 <= 0 || (i11 = zzamVar.zzs) <= 0) {
                return true;
            }
            if (zzfk.zza >= 21) {
                return zzg(i12, i11, zzamVar.zzt);
            }
            if (i12 * i11 <= zzsp.zza()) {
                z10 = true;
            }
            if (!z10) {
                zzj("legacyFrameSize, " + zzamVar.zzr + "x" + zzamVar.zzs);
            }
            return z10;
        }
        int i13 = zzfk.zza;
        if (i13 >= 21) {
            int i14 = zzamVar.zzA;
            if (i14 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities == null) {
                    zzj("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzj("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i14)) {
                    zzj("sampleRate.support, " + i14);
                    return false;
                }
            }
            int i15 = zzamVar.zzz;
            if (i15 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    zzj("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        zzj("channelCount.aCaps");
                    } else {
                        String str = this.zza;
                        String str2 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i13 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i10 = 6;
                            } else if ("audio/eac3".equals(str2)) {
                                i10 = 16;
                            } else {
                                i10 = 30;
                            }
                            zzes.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i10 + "]");
                            maxInputChannelCount = i10;
                        }
                        if (maxInputChannelCount < i15) {
                            zzj("channelCount.support, " + i15);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zzf(zzam zzamVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb = zzsp.zzb(zzamVar);
        if (zzb != null && ((Integer) zzb.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean zzg(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzfk.zza >= 29) {
            int zza = zzrv.zza(videoCapabilities, i10, i11, d10);
            if (zza == 2) {
                return true;
            }
            if (zza == 1) {
                zzj("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!zzk(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzfk.zzb)) && zzk(videoCapabilities, i11, i10, d10))) {
                zzes.zzb("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10) + "] [" + this.zza + ", " + this.zzb + "] [" + zzfk.zze + "]");
            } else {
                zzj("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }
}
