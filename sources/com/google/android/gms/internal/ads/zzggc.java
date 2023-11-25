package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzggc {
    public static final zzgju zza = new zzggb(null);

    public static zzgka zza(zzgao zzgaoVar) {
        zzfzu zzfzuVar;
        zzgjw zzgjwVar = new zzgjw();
        zzgjwVar.zzb(zzgaoVar.zzb());
        Iterator it = zzgaoVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzgak zzgakVar : (List) it.next()) {
                int zzh = zzgakVar.zzh() - 2;
                if (zzh != 1) {
                    if (zzh != 2) {
                        if (zzh == 3) {
                            zzfzuVar = zzfzu.zzc;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        zzfzuVar = zzfzu.zzb;
                    }
                } else {
                    zzfzuVar = zzfzu.zza;
                }
                int zza2 = zzgakVar.zza();
                String zzf = zzgakVar.zzf();
                if (zzf.startsWith("type.googleapis.com/google.crypto.")) {
                    zzf = zzf.substring(34);
                }
                zzgjwVar.zza(zzfzuVar, zza2, zzf, zzgakVar.zzc().name());
            }
        }
        if (zzgaoVar.zza() != null) {
            zzgjwVar.zzc(zzgaoVar.zza().zza());
        }
        try {
            return zzgjwVar.zzd();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
