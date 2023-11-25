package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaag {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzaag(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = f10;
        this.zzi = str;
    }

    public static zzaag zza(zzfb zzfbVar) throws zzcd {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        try {
            zzfbVar.zzH(4);
            int zzl = (zzfbVar.zzl() & 3) + 1;
            if (zzl != 3) {
                ArrayList arrayList = new ArrayList();
                int zzl2 = zzfbVar.zzl() & 31;
                for (int i15 = 0; i15 < zzl2; i15++) {
                    arrayList.add(zzb(zzfbVar));
                }
                int zzl3 = zzfbVar.zzl();
                for (int i16 = 0; i16 < zzl3; i16++) {
                    arrayList.add(zzb(zzfbVar));
                }
                if (zzl2 > 0) {
                    zzfx zze = zzfy.zze((byte[]) arrayList.get(0), zzl + 1, ((byte[]) arrayList.get(0)).length);
                    int i17 = zze.zze;
                    int i18 = zze.zzf;
                    int i19 = zze.zzh;
                    int i20 = zze.zzi;
                    int i21 = zze.zzj;
                    float f11 = zze.zzg;
                    str = zzea.zza(zze.zza, zze.zzb, zze.zzc);
                    i13 = i20;
                    i14 = i21;
                    f10 = f11;
                    i10 = i17;
                    i11 = i18;
                    i12 = i19;
                } else {
                    str = null;
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    f10 = 1.0f;
                }
                return new zzaag(arrayList, zzl, i10, i11, i12, i13, i14, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzcd.zza("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzfb zzfbVar) {
        int zzp = zzfbVar.zzp();
        int zzc = zzfbVar.zzc();
        zzfbVar.zzH(zzp);
        return zzea.zzc(zzfbVar.zzI(), zzc, zzp);
    }
}
