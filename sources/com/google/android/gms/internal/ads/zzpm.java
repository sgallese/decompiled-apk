package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzpm {
    private Boolean zza;

    public zzpm() {
    }

    public zzpm(Context context) {
    }

    public final zzom zza(zzam zzamVar, zzk zzkVar) {
        zzamVar.getClass();
        zzkVar.getClass();
        int i10 = zzfk.zza;
        if (i10 >= 29 && zzamVar.zzA != -1) {
            Boolean bool = this.zza;
            if (bool != null) {
                bool.booleanValue();
            } else {
                Boolean bool2 = Boolean.FALSE;
                this.zza = bool2;
                bool2.booleanValue();
            }
            String str = zzamVar.zzm;
            str.getClass();
            int zza = zzcc.zza(str, zzamVar.zzj);
            if (zza != 0 && i10 >= zzfk.zzf(zza)) {
                int zzg = zzfk.zzg(zzamVar.zzz);
                if (zzg == 0) {
                    return zzom.zza;
                }
                try {
                    AudioFormat zzt = zzfk.zzt(zzamVar.zzA, zzg, zza);
                    if (i10 >= 31) {
                        return zzpl.zza(zzt, zzkVar.zza().zza, false);
                    }
                    return zzpk.zza(zzt, zzkVar.zza().zza, false);
                } catch (IllegalArgumentException unused) {
                    return zzom.zza;
                }
            }
            return zzom.zza;
        }
        return zzom.zza;
    }
}
