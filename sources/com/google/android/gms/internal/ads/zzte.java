package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzte {
    private final zzabi zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzgh zze;

    public zzte(zzabi zzabiVar) {
        this.zza = zzabiVar;
    }

    public final void zza(zzgh zzghVar) {
        if (zzghVar != this.zze) {
            this.zze = zzghVar;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
