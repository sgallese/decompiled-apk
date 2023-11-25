package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.b1;

/* compiled from: EdgeToEdgeUtils.java */
/* loaded from: classes3.dex */
public class d {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11;
        boolean z12 = false;
        if (num != null && num.intValue() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (num2 == null || num2.intValue() == 0) {
            z12 = true;
        }
        if (z11 || z12) {
            int b10 = d7.a.b(window.getContext(), 16842801, -16777216);
            if (z11) {
                num = Integer.valueOf(b10);
            }
            if (z12) {
                num2 = Integer.valueOf(b10);
            }
        }
        b1.b(window, !z10);
        int c10 = c(window.getContext(), z10);
        int b11 = b(window.getContext(), z10);
        window.setStatusBarColor(c10);
        window.setNavigationBarColor(b11);
        f(window, d(c10, d7.a.h(num.intValue())));
        e(window, d(b11, d7.a.h(num2.intValue())));
    }

    @TargetApi(21)
    private static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.a.k(d7.a.b(context, 16843858, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return d7.a.b(context, 16843858, -16777216);
    }

    @TargetApi(21)
    private static int c(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 23) {
            return androidx.core.graphics.a.k(d7.a.b(context, 16843857, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return d7.a.b(context, 16843857, -16777216);
    }

    private static boolean d(int i10, boolean z10) {
        if (!d7.a.h(i10) && (i10 != 0 || !z10)) {
            return false;
        }
        return true;
    }

    public static void e(Window window, boolean z10) {
        b1.a(window, window.getDecorView()).c(z10);
    }

    public static void f(Window window, boolean z10) {
        b1.a(window, window.getDecorView()).d(z10);
    }
}
