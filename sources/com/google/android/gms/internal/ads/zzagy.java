package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzagy {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    public static zzby zza(zzfb zzfbVar) {
        String str;
        String str2;
        int zzc = zzfbVar.zzc() + zzfbVar.zzf();
        int zzf = zzfbVar.zzf();
        int i10 = (zzf >> 24) & 255;
        zzby zzbyVar = null;
        try {
            if (i10 != 169 && i10 != 253) {
                if (zzf == 1735291493) {
                    int zzb2 = zzb(zzfbVar);
                    if (zzb2 > 0 && zzb2 <= 192) {
                        str2 = zza[zzb2 - 1];
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        zzbyVar = new zzafa("TCON", null, zzfud.zzm(str2));
                    } else {
                        zzes.zzf("MetadataUtil", "Failed to parse standard genre code");
                    }
                    return zzbyVar;
                } else if (zzf == 1684632427) {
                    return zzd(1684632427, "TPOS", zzfbVar);
                } else {
                    if (zzf == 1953655662) {
                        return zzd(1953655662, "TRCK", zzfbVar);
                    }
                    if (zzf == 1953329263) {
                        return zzc(1953329263, "TBPM", zzfbVar, true, false);
                    }
                    if (zzf == 1668311404) {
                        return zzc(1668311404, "TCMP", zzfbVar, true, true);
                    }
                    if (zzf == 1668249202) {
                        int zzf2 = zzfbVar.zzf();
                        if (zzfbVar.zzf() == 1684108385) {
                            int zzf3 = zzfbVar.zzf() & 16777215;
                            if (zzf3 == 13) {
                                str = "image/jpeg";
                            } else if (zzf3 == 14) {
                                str = "image/png";
                                zzf3 = 14;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                zzes.zzf("MetadataUtil", "Unrecognized cover art flags: " + zzf3);
                            } else {
                                zzfbVar.zzH(4);
                                int i11 = zzf2 - 16;
                                byte[] bArr = new byte[i11];
                                zzfbVar.zzC(bArr, 0, i11);
                                zzbyVar = new zzaed(str, null, 3, bArr);
                            }
                        } else {
                            zzes.zzf("MetadataUtil", "Failed to parse cover art attribute");
                        }
                        return zzbyVar;
                    } else if (zzf == 1631670868) {
                        return zze(1631670868, "TPE2", zzfbVar);
                    } else {
                        if (zzf == 1936682605) {
                            return zze(1936682605, "TSOT", zzfbVar);
                        }
                        if (zzf == 1936679276) {
                            return zze(1936679276, "TSO2", zzfbVar);
                        }
                        if (zzf == 1936679282) {
                            return zze(1936679282, "TSOA", zzfbVar);
                        }
                        if (zzf == 1936679265) {
                            return zze(1936679265, "TSOP", zzfbVar);
                        }
                        if (zzf == 1936679791) {
                            return zze(1936679791, "TSOC", zzfbVar);
                        }
                        if (zzf == 1920233063) {
                            return zzc(1920233063, "ITUNESADVISORY", zzfbVar, false, false);
                        }
                        if (zzf == 1885823344) {
                            return zzc(1885823344, "ITUNESGAPLESS", zzfbVar, false, true);
                        }
                        if (zzf == 1936683886) {
                            return zze(1936683886, "TVSHOWSORT", zzfbVar);
                        }
                        if (zzf == 1953919848) {
                            return zze(1953919848, "TVSHOW", zzfbVar);
                        }
                        if (zzf == 757935405) {
                            String str3 = null;
                            String str4 = null;
                            int i12 = -1;
                            int i13 = -1;
                            while (zzfbVar.zzc() < zzc) {
                                int zzc2 = zzfbVar.zzc();
                                int zzf4 = zzfbVar.zzf();
                                int zzf5 = zzfbVar.zzf();
                                zzfbVar.zzH(4);
                                if (zzf5 == 1835360622) {
                                    str3 = zzfbVar.zzx(zzf4 - 12);
                                } else if (zzf5 == 1851878757) {
                                    str4 = zzfbVar.zzx(zzf4 - 12);
                                } else {
                                    if (zzf5 == 1684108385) {
                                        i13 = zzf4;
                                    }
                                    if (zzf5 == 1684108385) {
                                        i12 = zzc2;
                                    }
                                    zzfbVar.zzH(zzf4 - 12);
                                }
                            }
                            if (str3 != null && str4 != null && i12 != -1) {
                                zzfbVar.zzG(i12);
                                zzfbVar.zzH(16);
                                zzbyVar = new zzaeu(str3, str4, zzfbVar.zzx(i13 - 16));
                            }
                            return zzbyVar;
                        }
                    }
                }
            } else {
                int i14 = zzf & 16777215;
                if (i14 == 6516084) {
                    int zzf6 = zzfbVar.zzf();
                    if (zzfbVar.zzf() == 1684108385) {
                        zzfbVar.zzH(8);
                        String zzx = zzfbVar.zzx(zzf6 - 16);
                        zzbyVar = new zzael("und", zzx, zzx);
                    } else {
                        zzes.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzagj.zzf(zzf)));
                    }
                    return zzbyVar;
                } else if (i14 != 7233901 && i14 != 7631467) {
                    if (i14 != 6516589 && i14 != 7828084) {
                        if (i14 == 6578553) {
                            return zze(zzf, "TDRC", zzfbVar);
                        }
                        if (i14 == 4280916) {
                            return zze(zzf, "TPE1", zzfbVar);
                        }
                        if (i14 == 7630703) {
                            return zze(zzf, "TSSE", zzfbVar);
                        }
                        if (i14 == 6384738) {
                            return zze(zzf, "TALB", zzfbVar);
                        }
                        if (i14 == 7108978) {
                            return zze(zzf, "USLT", zzfbVar);
                        }
                        if (i14 == 6776174) {
                            return zze(zzf, "TCON", zzfbVar);
                        }
                        if (i14 == 6779504) {
                            return zze(zzf, "TIT1", zzfbVar);
                        }
                    } else {
                        return zze(zzf, "TCOM", zzfbVar);
                    }
                } else {
                    return zze(zzf, "TIT2", zzfbVar);
                }
            }
            zzes.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzagj.zzf(zzf));
            return null;
        } finally {
            zzfbVar.zzG(zzc);
        }
    }

    private static int zzb(zzfb zzfbVar) {
        zzfbVar.zzH(4);
        if (zzfbVar.zzf() == 1684108385) {
            zzfbVar.zzH(8);
            return zzfbVar.zzl();
        }
        zzes.zzf("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzaes zzc(int i10, String str, zzfb zzfbVar, boolean z10, boolean z11) {
        int zzb2 = zzb(zzfbVar);
        if (z11) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 >= 0) {
            if (z10) {
                return new zzafa(str, null, zzfud.zzm(Integer.toString(zzb2)));
            }
            return new zzael("und", str, Integer.toString(zzb2));
        }
        zzes.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzagj.zzf(i10)));
        return null;
    }

    private static zzafa zzd(int i10, String str, zzfb zzfbVar) {
        int zzf = zzfbVar.zzf();
        if (zzfbVar.zzf() == 1684108385 && zzf >= 22) {
            zzfbVar.zzH(10);
            int zzp = zzfbVar.zzp();
            if (zzp > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(zzp);
                String sb3 = sb2.toString();
                int zzp2 = zzfbVar.zzp();
                if (zzp2 > 0) {
                    sb3 = sb3 + "/" + zzp2;
                }
                return new zzafa(str, null, zzfud.zzm(sb3));
            }
        }
        zzes.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzagj.zzf(i10)));
        return null;
    }

    private static zzafa zze(int i10, String str, zzfb zzfbVar) {
        int zzf = zzfbVar.zzf();
        if (zzfbVar.zzf() == 1684108385) {
            zzfbVar.zzH(8);
            return new zzafa(str, null, zzfud.zzm(zzfbVar.zzx(zzf - 16)));
        }
        zzes.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzagj.zzf(i10)));
        return null;
    }
}
