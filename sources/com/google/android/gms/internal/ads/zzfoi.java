package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfoi extends zzfog {
    private static zzfoi zzc;

    private zzfoi(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfoi zzj(Context context) {
        zzfoi zzfoiVar;
        synchronized (zzfoi.class) {
            if (zzc == null) {
                zzc = new zzfoi(context);
            }
            zzfoiVar = zzc;
        }
        return zzfoiVar;
    }

    public final zzfof zzh(long j10, boolean z10) throws IOException {
        zzfof zzb;
        synchronized (zzfoi.class) {
            zzb = zzb(null, null, j10, z10);
        }
        return zzb;
    }

    public final zzfof zzi(String str, String str2, long j10, boolean z10) throws IOException {
        zzfof zzb;
        synchronized (zzfoi.class) {
            zzb = zzb(str, str2, j10, z10);
        }
        return zzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfoi.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfoi.class) {
            zzf(true);
        }
    }
}
