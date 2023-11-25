package com.habitrpg.shared.habitica.extensions;

import sc.c;

/* compiled from: DoubleExtensions.kt */
/* loaded from: classes4.dex */
public final class DoubleExtensionsKt {
    public static final double round(double d10, int i10) {
        int c10;
        double d11 = i10;
        c10 = c.c(d10 * Math.pow(10.0d, d11));
        return c10 / Math.pow(10.0d, d11);
    }
}
