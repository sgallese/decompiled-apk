package com.google.android.gms.internal.p000authapi;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* loaded from: classes3.dex */
public final class zbbk {
    public static final int zba;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        zba = i10;
    }
}
