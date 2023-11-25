package com.habitrpg.android.habitica.extensions;

import android.os.Build;

/* compiled from: PendingIntentExtensions.kt */
/* loaded from: classes4.dex */
public final class PendingIntentExtensionsKt {
    public static final int withImmutableFlag(int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return i10 + 67108864;
        }
        return i10;
    }

    public static final int withMutableFlag(int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return i10 + 33554432;
        }
        return i10;
    }
}
