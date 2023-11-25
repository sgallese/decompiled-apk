package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaax {
    public final String zza;

    private zzaax(int i10, int i11, String str) {
        this.zza = str;
    }

    public static zzaax zza(zzfb zzfbVar) {
        String str;
        zzfbVar.zzH(2);
        int zzl = zzfbVar.zzl();
        int i10 = zzl >> 1;
        int i11 = zzl & 1;
        int zzl2 = zzfbVar.zzl() >> 3;
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        int i12 = zzl2 | (i11 << 5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i10);
        if (i12 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(i12);
        return new zzaax(i10, i12, sb2.toString());
    }
}
