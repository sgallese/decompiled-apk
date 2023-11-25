package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgao {
    private final ConcurrentMap zza;
    private final List zzb;
    private final zzgak zzc;
    private final Class zzd;
    private final zzgjt zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgao(ConcurrentMap concurrentMap, List list, zzgak zzgakVar, zzgjt zzgjtVar, Class cls, zzgan zzganVar) {
        this.zza = concurrentMap;
        this.zzb = list;
        this.zzc = zzgakVar;
        this.zzd = cls;
        this.zze = zzgjtVar;
    }

    public final zzgak zza() {
        return this.zzc;
    }

    public final zzgjt zzb() {
        return this.zze;
    }

    public final Class zzc() {
        return this.zzd;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzgam(bArr, null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final boolean zzf() {
        if (!this.zze.zza().isEmpty()) {
            return true;
        }
        return false;
    }
}
