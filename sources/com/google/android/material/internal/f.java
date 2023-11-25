package com.google.android.material.internal;

/* compiled from: FadeThroughUtils.java */
/* loaded from: classes3.dex */
final class f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(float f10, float[] fArr) {
        if (f10 <= 0.5f) {
            fArr[0] = 1.0f - (f10 * 2.0f);
            fArr[1] = 0.0f;
            return;
        }
        fArr[0] = 0.0f;
        fArr[1] = (f10 * 2.0f) - 1.0f;
    }
}
