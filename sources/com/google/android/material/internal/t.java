package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: WindowUtils.java */
/* loaded from: classes3.dex */
public class t {

    /* compiled from: WindowUtils.java */
    /* loaded from: classes3.dex */
    private static class a {
        static Rect a(WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    /* compiled from: WindowUtils.java */
    /* loaded from: classes3.dex */
    private static class b {
        static Rect a(WindowManager windowManager) {
            WindowMetrics currentWindowMetrics;
            Rect bounds;
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds;
        }
    }

    public static Rect a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return b.a(windowManager);
        }
        return a.a(windowManager);
    }
}
