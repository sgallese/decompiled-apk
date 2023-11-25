package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgrc {
    static final zzgrc zza = new zzgrc(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgrc zzd;
    private final Map zze;

    zzgrc() {
        this.zze = new HashMap();
    }

    public static zzgrc zza() {
        return zza;
    }

    public static zzgrc zzb() {
        zzgrc zzgrcVar = zzd;
        if (zzgrcVar != null) {
            return zzgrcVar;
        }
        synchronized (zzgrc.class) {
            zzgrc zzgrcVar2 = zzd;
            if (zzgrcVar2 != null) {
                return zzgrcVar2;
            }
            zzgrc zzb2 = zzgrk.zzb(zzgrc.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgro zzc(zzgta zzgtaVar, int i10) {
        return (zzgro) this.zze.get(new zzgrb(zzgtaVar, i10));
    }

    zzgrc(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}
