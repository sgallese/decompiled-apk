package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzffw {
    private static final com.google.common.util.concurrent.a zza = zzfye.zzh(null);
    private final zzfyo zzb;
    private final ScheduledExecutorService zzc;
    private final zzffx zzd;

    public zzffw(zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, zzffx zzffxVar) {
        this.zzb = zzfyoVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzffxVar;
    }

    public final zzffm zza(Object obj, com.google.common.util.concurrent.a... aVarArr) {
        return new zzffm(this, obj, Arrays.asList(aVarArr), null);
    }

    public final zzffv zzb(Object obj, com.google.common.util.concurrent.a aVar) {
        return new zzffv(this, obj, aVar, Collections.singletonList(aVar), aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String zzf(Object obj);
}
