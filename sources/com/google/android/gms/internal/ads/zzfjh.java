package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfjh {
    private static final zzfjh zza = new zzfjh();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfjh() {
    }

    public static zzfjh zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfit zzfitVar) {
        this.zzb.add(zzfitVar);
    }

    public final void zze(zzfit zzfitVar) {
        boolean zzg = zzg();
        this.zzb.remove(zzfitVar);
        this.zzc.remove(zzfitVar);
        if (zzg && !zzg()) {
            zzfjo.zzb().zzg();
        }
    }

    public final void zzf(zzfit zzfitVar) {
        boolean zzg = zzg();
        this.zzc.add(zzfitVar);
        if (!zzg) {
            zzfjo.zzb().zzf();
        }
    }

    public final boolean zzg() {
        if (this.zzc.size() > 0) {
            return true;
        }
        return false;
    }
}
