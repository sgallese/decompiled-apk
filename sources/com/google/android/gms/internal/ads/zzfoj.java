package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfoj extends zzfog {
    private static zzfoj zzc;

    private zzfoj(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfoj zzi(Context context) {
        zzfoj zzfojVar;
        synchronized (zzfoj.class) {
            if (zzc == null) {
                zzc = new zzfoj(context);
            }
            zzfojVar = zzc;
        }
        return zzfojVar;
    }

    public final zzfof zzh(long j10, boolean z10) throws IOException {
        synchronized (zzfoj.class) {
            if (!zzo()) {
                return new zzfof();
            }
            return zzb(null, null, j10, z10);
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfoj.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }

    public final void zzk() throws IOException {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() throws IOException {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z10) throws IOException {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z10));
    }

    public final void zzn(boolean z10) throws IOException {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z10));
        if (!z10) {
            zzj();
        }
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
