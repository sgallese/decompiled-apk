package com.google.android.gms.common.util;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
/* loaded from: classes.dex */
public final class zzb {
    public static boolean zza() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
