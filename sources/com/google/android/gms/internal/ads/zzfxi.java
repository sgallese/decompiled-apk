package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfxi extends zzfxf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfxi(zzfxh zzfxhVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfxf
    public final int zza(zzfxj zzfxjVar) {
        int i10;
        int i11;
        synchronized (zzfxjVar) {
            i10 = zzfxjVar.remaining;
            i11 = i10 - 1;
            zzfxjVar.remaining = i11;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfxf
    public final void zzb(zzfxj zzfxjVar, Set set, Set set2) {
        Set set3;
        synchronized (zzfxjVar) {
            set3 = zzfxjVar.seenExceptions;
            if (set3 == null) {
                zzfxjVar.seenExceptions = set2;
            }
        }
    }

    private zzfxi() {
        super(null);
    }
}
