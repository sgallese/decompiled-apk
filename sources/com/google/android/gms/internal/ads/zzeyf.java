package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzeyf implements zzfya {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeyf(zzeyh zzeyhVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        Void r12 = (Void) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit successful.");
    }
}
