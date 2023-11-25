package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FadeTabIndicatorInterpolator.java */
/* loaded from: classes3.dex */
public class b extends c {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.tabs.c
    public void d(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float b10;
        if (f10 >= 0.5f) {
            view = view2;
        }
        RectF a10 = c.a(tabLayout, view);
        if (f10 < 0.5f) {
            b10 = w6.a.b(1.0f, 0.0f, 0.0f, 0.5f, f10);
        } else {
            b10 = w6.a.b(0.0f, 1.0f, 0.5f, 1.0f, f10);
        }
        drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b10 * 255.0f));
    }
}
