package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
abstract class zzfsz implements zzfuz {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfuz)) {
            return false;
        }
        return zzs().equals(((zzfuz) obj).zzs());
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final String toString() {
        return zzs().toString();
    }

    abstract Collection zzf();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator zzg() {
        throw null;
    }

    abstract Map zzj();

    abstract Set zzl();

    @Override // com.google.android.gms.internal.ads.zzfuz
    public boolean zzq(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final Collection zzr() {
        Collection collection = this.zzb;
        if (collection == null) {
            Collection zzf = zzf();
            this.zzb = zzf;
            return zzf;
        }
        return collection;
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final Map zzs() {
        Map map = this.zzc;
        if (map == null) {
            Map zzj = zzj();
            this.zzc = zzj;
            return zzj;
        }
        return map;
    }

    public final Set zzt() {
        Set set = this.zza;
        if (set == null) {
            Set zzl = zzl();
            this.zza = zzl;
            return zzl;
        }
        return set;
    }
}