package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

/* compiled from: VisibilityAwareImageButton.java */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class s extends ImageButton {

    /* renamed from: f  reason: collision with root package name */
    private int f10189f;

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f10189f = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f10189f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
