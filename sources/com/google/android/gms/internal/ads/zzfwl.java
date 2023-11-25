package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfwl extends zzfwm {
    public static int zza(long j10) {
        boolean z10;
        int i10 = (int) j10;
        if (i10 == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfri.zzg(z10, "Out of range: %s", j10);
        return i10;
    }

    public static int zzb(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), 1073741823);
    }

    public static int zzc(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        return (int) j10;
    }
}
