package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfyd {
    private final boolean zza;
    private final zzfud zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfyd(boolean z10, zzfud zzfudVar, zzfyc zzfycVar) {
        this.zza = z10;
        this.zzb = zzfudVar;
    }

    public final com.google.common.util.concurrent.a zza(Callable callable, Executor executor) {
        return new zzfxr(this.zzb, this.zza, executor, callable);
    }
}
