package com.habitrpg.android.habitica.ui.views;

import android.graphics.Color;

/* compiled from: HabiticaIcons.java */
/* loaded from: classes4.dex */
class PaintCodeColor extends Color {
    PaintCodeColor() {
    }

    private static float[] ColorToHSV(int i10) {
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
        return fArr;
    }

    public static float brightness(int i10) {
        return ColorToHSV(i10)[2];
    }

    public static int colorByChangingAlpha(int i10, int i11) {
        return Color.argb(i11, Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static float hue(int i10) {
        return ColorToHSV(i10)[0];
    }
}
