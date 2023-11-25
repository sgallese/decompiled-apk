package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzack {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzbz zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = zzfk.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzes.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzadx.zzb(new zzfb(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    zzes.zzg("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new zzafk(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbz(arrayList);
    }

    public static zzach zzc(zzfb zzfbVar, boolean z10, boolean z11) throws zzcd {
        if (z10) {
            zzd(3, zzfbVar, false);
        }
        String zzy = zzfbVar.zzy((int) zzfbVar.zzr(), zzfqu.zzc);
        int length = zzy.length();
        long zzr = zzfbVar.zzr();
        String[] strArr = new String[(int) zzr];
        int i10 = length + 15;
        for (int i11 = 0; i11 < zzr; i11++) {
            String zzy2 = zzfbVar.zzy((int) zzfbVar.zzr(), zzfqu.zzc);
            strArr[i11] = zzy2;
            i10 = i10 + 4 + zzy2.length();
        }
        if (z11 && (zzfbVar.zzl() & 1) == 0) {
            throw zzcd.zza("framing bit expected to be set", null);
        }
        return new zzach(zzy, strArr, i10 + 1);
    }

    public static boolean zzd(int i10, zzfb zzfbVar, boolean z10) throws zzcd {
        if (zzfbVar.zza() < 7) {
            if (z10) {
                return false;
            }
            throw zzcd.zza("too short header: " + zzfbVar.zza(), null);
        } else if (zzfbVar.zzl() != i10) {
            if (z10) {
                return false;
            }
            throw zzcd.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        } else if (zzfbVar.zzl() == 118 && zzfbVar.zzl() == 111 && zzfbVar.zzl() == 114 && zzfbVar.zzl() == 98 && zzfbVar.zzl() == 105 && zzfbVar.zzl() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw zzcd.zza("expected characters 'vorbis'", null);
        }
    }
}
