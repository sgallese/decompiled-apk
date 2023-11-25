package com.google.android.gms.internal.common;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
/* loaded from: classes3.dex */
public final class zzd {
    public static final int zza;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 67108864;
        } else {
            i10 = 0;
        }
        zza = i10;
    }
}
