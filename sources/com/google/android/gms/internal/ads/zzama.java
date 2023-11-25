package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzama {
    public static final boolean zza = zzamb.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    protected final void finalize() throws Throwable {
        if (!this.zzc) {
            zzb("Request on the loose");
            zzamb.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final synchronized void zza(String str, long j10) {
        if (!this.zzc) {
            this.zzb.add(new zzalz(str, j10, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        long j10;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j10 = 0;
        } else {
            j10 = ((zzalz) this.zzb.get(r1.size() - 1)).zzc - ((zzalz) this.zzb.get(0)).zzc;
        }
        if (j10 <= 0) {
            return;
        }
        long j11 = ((zzalz) this.zzb.get(0)).zzc;
        zzamb.zza("(%-4d ms) %s", Long.valueOf(j10), str);
        for (zzalz zzalzVar : this.zzb) {
            long j12 = zzalzVar.zzc;
            zzamb.zza("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(zzalzVar.zzb), zzalzVar.zza);
            j11 = j12;
        }
    }
}
