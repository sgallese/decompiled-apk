package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzacv implements zzacn {
    public final zzfud zza;
    private final int zzb;

    private zzacv(int i10, zzfud zzfudVar) {
        this.zzb = i10;
        this.zza = zzfudVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzacv zzc(int i10, zzfb zzfbVar) {
        String str;
        zzacn zzacwVar;
        String str2;
        zzfua zzfuaVar = new zzfua();
        int zzd = zzfbVar.zzd();
        int i11 = -2;
        while (zzfbVar.zza() > 8) {
            int zzh = zzfbVar.zzh();
            int zzc = zzfbVar.zzc() + zzfbVar.zzh();
            zzfbVar.zzF(zzc);
            if (zzh == 1414744396) {
                zzacwVar = zzc(zzfbVar.zzh(), zzfbVar);
            } else {
                zzacw zzacwVar2 = null;
                switch (zzh) {
                    case 1718776947:
                        if (i11 == 2) {
                            zzfbVar.zzH(4);
                            int zzh2 = zzfbVar.zzh();
                            int zzh3 = zzfbVar.zzh();
                            zzfbVar.zzH(4);
                            int zzh4 = zzfbVar.zzh();
                            switch (zzh4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                zzes.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + zzh4);
                            } else {
                                zzak zzakVar = new zzak();
                                zzakVar.zzX(zzh2);
                                zzakVar.zzF(zzh3);
                                zzakVar.zzS(str2);
                                zzacwVar2 = new zzacw(zzakVar.zzY());
                            }
                        } else if (i11 == 1) {
                            int zzj = zzfbVar.zzj();
                            if (zzj == 1) {
                                str = "audio/raw";
                            } else if (zzj != 85) {
                                if (zzj == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (zzj != 8192) {
                                    if (zzj != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                zzes.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + zzj);
                            } else {
                                int zzj2 = zzfbVar.zzj();
                                int zzh5 = zzfbVar.zzh();
                                zzfbVar.zzH(6);
                                int zzk = zzfk.zzk(zzfbVar.zzp());
                                int zzj3 = zzfbVar.zzj();
                                byte[] bArr = new byte[zzj3];
                                zzfbVar.zzC(bArr, 0, zzj3);
                                zzak zzakVar2 = new zzak();
                                zzakVar2.zzS(str);
                                zzakVar2.zzw(zzj2);
                                zzakVar2.zzT(zzh5);
                                if ("audio/raw".equals(str) && zzk != 0) {
                                    zzakVar2.zzN(zzk);
                                }
                                if ("audio/mp4a-latm".equals(str) && zzj3 > 0) {
                                    zzakVar2.zzI(zzfud.zzm(bArr));
                                }
                                zzacwVar = new zzacw(zzakVar2.zzY());
                                break;
                            }
                        } else {
                            zzes.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfk.zzz(i11)));
                        }
                        zzacwVar = zzacwVar2;
                        break;
                    case 1751742049:
                        zzacwVar = zzacs.zzb(zzfbVar);
                        break;
                    case 1752331379:
                        zzacwVar = zzact.zzb(zzfbVar);
                        break;
                    case 1852994675:
                        zzacwVar = zzacx.zzb(zzfbVar);
                        break;
                    default:
                        zzacwVar = zzacwVar2;
                        break;
                }
            }
            if (zzacwVar != null) {
                if (zzacwVar.zza() == 1752331379) {
                    int i12 = ((zzact) zzacwVar).zza;
                    if (i12 != 1935960438) {
                        if (i12 != 1935963489) {
                            if (i12 != 1937012852) {
                                zzes.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i12))));
                                i11 = -1;
                            } else {
                                i11 = 3;
                            }
                        } else {
                            i11 = 1;
                        }
                    } else {
                        i11 = 2;
                    }
                }
                zzfuaVar.zzf(zzacwVar);
            }
            zzfbVar.zzG(zzc);
            zzfbVar.zzF(zzd);
        }
        return new zzacv(i10, zzfuaVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zza() {
        return this.zzb;
    }

    public final zzacn zzb(Class cls) {
        zzfud zzfudVar = this.zza;
        int size = zzfudVar.size();
        int i10 = 0;
        while (i10 < size) {
            zzacn zzacnVar = (zzacn) zzfudVar.get(i10);
            i10++;
            if (zzacnVar.getClass() == cls) {
                return zzacnVar;
            }
        }
        return null;
    }
}
