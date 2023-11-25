package com.google.android.material.carousel;

import android.view.View;

/* compiled from: CarouselStrategy.java */
/* loaded from: classes3.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract c b(a aVar, View view);
}
